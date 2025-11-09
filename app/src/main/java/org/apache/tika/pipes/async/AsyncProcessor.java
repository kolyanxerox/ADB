package org.apache.tika.pipes.async;

import com.unity3d.services.UnityAdsConstants;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.apache.tika.exception.TikaException;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.PipesClient;
import org.apache.tika.pipes.PipesException;
import org.apache.tika.pipes.PipesReporter;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import org.apache.tika.pipes.pipesiterator.TotalCounter;

/* loaded from: classes3.dex */
public class AsyncProcessor implements Closeable, AutoCloseable {
    private static final OooO0O0 LOG = OooO0o.OooO0O0(AsyncProcessor.class);
    private static long MAX_OFFER_WAIT_MS = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    static final int PARSER_FUTURE_CODE = 1;
    static final int WATCHER_FUTURE_CODE = 3;
    private boolean addedEmitterSemaphores;
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue<EmitData> emitData;
    private final ExecutorCompletionService<Integer> executorCompletionService;
    private final ExecutorService executorService;
    private final ArrayBlockingQueue<FetchEmitTuple> fetchEmitTuples;
    boolean isShuttingDown;
    private volatile int numEmitterThreadsFinished;
    private volatile int numParserThreadsFinished;
    private final AtomicLong totalProcessed;

    public class FetchEmitWorker implements Callable<Integer> {
        private final AsyncConfig asyncConfig;
        private final ArrayBlockingQueue<EmitData> emitDataQueue;
        private final ArrayBlockingQueue<FetchEmitTuple> fetchEmitTuples;

        public /* synthetic */ FetchEmitWorker(AsyncProcessor asyncProcessor, AsyncConfig asyncConfig, ArrayBlockingQueue arrayBlockingQueue, ArrayBlockingQueue arrayBlockingQueue2, int i) {
            this(asyncConfig, arrayBlockingQueue, arrayBlockingQueue2);
        }

        private boolean shouldEmit(PipesResult pipesResult) {
            if (pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS || pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS_WITH_EXCEPTION) {
                return true;
            }
            return pipesResult.isIntermediate() && this.asyncConfig.isEmitIntermediateResults();
        }

        private FetchEmitWorker(AsyncConfig asyncConfig, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue, ArrayBlockingQueue<EmitData> arrayBlockingQueue2) {
            this.asyncConfig = asyncConfig;
            this.fetchEmitTuples = arrayBlockingQueue;
            this.emitDataQueue = arrayBlockingQueue2;
        }

        @Override // java.util.concurrent.Callable
        public Integer call() throws Exception {
            PipesResult pipesResultProcess;
            PipesClient pipesClient = new PipesClient(this.asyncConfig);
            while (true) {
                try {
                    FetchEmitTuple fetchEmitTuplePoll = this.fetchEmitTuples.poll(1L, TimeUnit.SECONDS);
                    if (fetchEmitTuplePoll == null) {
                        if (AsyncProcessor.LOG.OooO0o()) {
                            AsyncProcessor.LOG.OooOo("null fetch emit tuple");
                        }
                    } else {
                        if (fetchEmitTuplePoll == PipesIterator.COMPLETED_SEMAPHORE) {
                            if (AsyncProcessor.LOG.OooO0o()) {
                                AsyncProcessor.LOG.OooOo("hit completed semaphore");
                            }
                            pipesClient.close();
                            return 1;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            pipesResultProcess = pipesClient.process(fetchEmitTuplePoll);
                        } catch (IOException e) {
                            AsyncProcessor.LOG.OooO("pipesClient crash", e);
                            pipesResultProcess = PipesResult.UNSPECIFIED_CRASH;
                        }
                        if (AsyncProcessor.LOG.OooO0o()) {
                            AsyncProcessor.LOG.OooOOO0("timer -- pipes client process: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (shouldEmit(pipesResultProcess)) {
                            AsyncProcessor.LOG.OooOo("adding result to emitter queue: " + pipesResultProcess.getEmitData());
                            if (!this.emitDataQueue.offer(pipesResultProcess.getEmitData(), AsyncProcessor.MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                                throw new RuntimeException("Couldn't offer emit data to queue within " + AsyncProcessor.MAX_OFFER_WAIT_MS + " ms");
                            }
                        }
                        if (AsyncProcessor.LOG.OooO0o()) {
                            AsyncProcessor.LOG.OooOOO0("timer -- offered: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                        }
                        this.asyncConfig.getPipesReporter().report(fetchEmitTuplePoll, pipesResultProcess, System.currentTimeMillis() - jCurrentTimeMillis);
                        AsyncProcessor.this.totalProcessed.incrementAndGet();
                    }
                } catch (Throwable th) {
                    try {
                        pipesClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public AsyncProcessor(Path path) throws TikaException, IOException {
        this(path, null);
    }

    public /* synthetic */ Integer lambda$new$0() throws Exception {
        while (true) {
            try {
                Thread.sleep(500L);
                checkActive();
            } catch (InterruptedException unused) {
                return 3;
            }
        }
    }

    public /* synthetic */ void lambda$startCounter$1(TotalCounter totalCounter) throws InterruptedException {
        totalCounter.startTotalCount();
        PipesReporter pipesReporter = this.asyncConfig.getPipesReporter();
        TotalCountResult.STATUS status = totalCounter.getTotalCount().getStatus();
        while (status == TotalCountResult.STATUS.NOT_COMPLETED) {
            try {
                Thread.sleep(500L);
                TotalCountResult totalCount = totalCounter.getTotalCount();
                LOG.OooO0oO("counter total  {} {} ", totalCount.getStatus(), Long.valueOf(totalCount.getTotalCount()));
                pipesReporter.report(totalCount);
                status = totalCount.getStatus();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private void startCounter(TotalCounter totalCounter) {
        Thread thread = new Thread(new OooOOOO(18, this, totalCounter));
        thread.setDaemon(true);
        thread.start();
    }

    public synchronized boolean checkActive() throws InterruptedException {
        boolean z;
        try {
            Future<Integer> futurePoll = this.executorCompletionService.poll();
            z = true;
            if (futurePoll != null) {
                try {
                    Integer num = futurePoll.get();
                    int iIntValue = num.intValue();
                    if (iIntValue == 1) {
                        this.numParserThreadsFinished++;
                        LOG.OooOoO(Integer.valueOf(this.numParserThreadsFinished), "fetchEmitWorker finished, total {}");
                    } else if (iIntValue == 2) {
                        this.numEmitterThreadsFinished++;
                        LOG.OooOoO(Integer.valueOf(this.numEmitterThreadsFinished), "emitter thread finished, total {}");
                    } else {
                        if (iIntValue != 3) {
                            throw new IllegalArgumentException("Don't recognize this future code: " + num);
                        }
                        LOG.OooOOo0("watcher thread finished");
                    }
                } catch (ExecutionException e) {
                    LOG.OooOOOO("execution exception", e);
                    this.asyncConfig.getPipesReporter().error(e);
                    throw new RuntimeException(e);
                }
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && !this.addedEmitterSemaphores) {
                for (int i = 0; i < this.asyncConfig.getNumEmitters(); i++) {
                    try {
                        if (!this.emitData.offer(AsyncEmitter.EMIT_DATA_STOP_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                            throw new RuntimeException("Couldn't offer emit data stop semaphore within " + MAX_OFFER_WAIT_MS + " ms");
                        }
                    } catch (InterruptedException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                this.addedEmitterSemaphores = true;
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && this.numEmitterThreadsFinished == this.asyncConfig.getNumEmitters()) {
                z = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.executorService.shutdownNow();
        this.asyncConfig.getPipesReporter().close();
    }

    public void finished() throws InterruptedException {
        for (int i = 0; i < this.asyncConfig.getNumClients(); i++) {
            if (!this.fetchEmitTuples.offer(PipesIterator.COMPLETED_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Couldn't offer completed semaphore within " + MAX_OFFER_WAIT_MS + " ms");
            }
        }
    }

    public int getCapacity() {
        return this.fetchEmitTuples.remainingCapacity();
    }

    public long getTotalProcessed() {
        return this.totalProcessed.get();
    }

    public synchronized boolean offer(List<FetchEmitTuple> list, long j) throws PipesException, InterruptedException {
        if (this.isShuttingDown) {
            throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
        }
        if (list.size() > this.asyncConfig.getQueueSize()) {
            throw new OfferLargerThanQueueSize(list.size(), this.asyncConfig.getQueueSize());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (long jCurrentTimeMillis2 = System.currentTimeMillis(); jCurrentTimeMillis2 - jCurrentTimeMillis < j; jCurrentTimeMillis2 = System.currentTimeMillis()) {
            if (this.fetchEmitTuples.remainingCapacity() > list.size()) {
                try {
                    this.fetchEmitTuples.addAll(list);
                    return true;
                } catch (IllegalStateException e) {
                    LOG.OooOo0("couldn't add full list", e);
                }
            }
            Thread.sleep(100L);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncProcessor(Path path, PipesIterator pipesIterator) throws Exception {
        AsyncProcessor asyncProcessor;
        Exception exc;
        this.totalProcessed = new AtomicLong(0L);
        this.numParserThreadsFinished = 0;
        this.numEmitterThreadsFinished = 0;
        this.addedEmitterSemaphores = false;
        this.isShuttingDown = false;
        AsyncConfig asyncConfigLoad = AsyncConfig.load(path);
        this.asyncConfig = asyncConfigLoad;
        this.fetchEmitTuples = new ArrayBlockingQueue<>(asyncConfigLoad.getQueueSize());
        this.emitData = new ArrayBlockingQueue<>(100);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(asyncConfigLoad.getNumEmitters() + asyncConfigLoad.getNumClients() + 1);
        this.executorService = executorServiceNewFixedThreadPool;
        ExecutorCompletionService<Integer> executorCompletionService = new ExecutorCompletionService<>(executorServiceNewFixedThreadPool);
        this.executorCompletionService = executorCompletionService;
        try {
            if (!path.toAbsolutePath().equals(asyncConfigLoad.getTikaConfig().toAbsolutePath())) {
                try {
                    LOG.OooOO0O(path.toAbsolutePath(), "TikaConfig for AsyncProcessor ({}) is different from TikaConfig for workers ({}). If this is intended, please ignore this warning.", asyncConfigLoad.getTikaConfig().toAbsolutePath());
                } catch (Exception e) {
                    exc = e;
                    asyncProcessor = this;
                    LOG.OooOOOO("problem initializing AsyncProcessor", exc);
                    asyncProcessor.executorService.shutdownNow();
                    asyncProcessor.asyncConfig.getPipesReporter().error(exc);
                    throw exc;
                }
            }
            executorCompletionService.submit(new androidx.webkit.internal.OooO0O0(this, 7));
            if (pipesIterator != 0 && (pipesIterator instanceof TotalCounter)) {
                LOG.OooOOo0("going to total counts");
                startCounter((TotalCounter) pipesIterator);
            }
            for (int i = 0; i < this.asyncConfig.getNumClients(); i++) {
                asyncProcessor = this;
                try {
                    this.executorCompletionService.submit(new FetchEmitWorker(asyncProcessor, this.asyncConfig, this.fetchEmitTuples, this.emitData, 0));
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    LOG.OooOOOO("problem initializing AsyncProcessor", exc);
                    asyncProcessor.executorService.shutdownNow();
                    asyncProcessor.asyncConfig.getPipesReporter().error(exc);
                    throw exc;
                }
            }
            asyncProcessor = this;
            EmitterManager emitterManagerLoad = EmitterManager.load(asyncProcessor.asyncConfig.getTikaConfig());
            for (int i2 = 0; i2 < asyncProcessor.asyncConfig.getNumEmitters(); i2++) {
                asyncProcessor.executorCompletionService.submit(new AsyncEmitter(asyncProcessor.asyncConfig, asyncProcessor.emitData, emitterManagerLoad));
            }
        } catch (Exception e3) {
            e = e3;
            asyncProcessor = this;
        }
    }

    public synchronized boolean offer(FetchEmitTuple fetchEmitTuple, long j) throws PipesException, InterruptedException {
        if (this.fetchEmitTuples != null) {
            if (!this.isShuttingDown) {
                checkActive();
            } else {
                throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
            }
        } else {
            throw new IllegalStateException("queue hasn't been initialized yet.");
        }
        return this.fetchEmitTuples.offer(fetchEmitTuple, j, TimeUnit.MILLISECONDS);
    }
}

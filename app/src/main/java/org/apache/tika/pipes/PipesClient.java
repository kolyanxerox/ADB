package org.apache.tika.pipes;

import OooO0oO.OooOo;
import androidx.work.WorkRequest;
import com.ironsource.C3824x4;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ProcessBuilder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o000OooO.o000oOoO;
import o00Oo00.OooO;
import o00Oo00.OooOO0O;
import o00Oo00.OooOOO0;
import o00Oo00o.o0OoOo0;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.utils.ProcessUtils;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public class PipesClient implements Closeable, AutoCloseable {
    private static final int MAX_BYTES_BEFORE_READY = 20000;
    private static final long WAIT_ON_DESTROY_MS = 10000;
    private DataInputStream input;
    private DataOutputStream output;
    private final PipesConfigBase pipesConfig;
    private Process process;
    private static final OooO0O0 LOG = OooO0o.OooO0O0(PipesClient.class);
    private static AtomicInteger CLIENT_COUNTER = new AtomicInteger(0);
    private final Object[] executorServiceLock = new Object[0];
    private volatile boolean closed = false;
    private ExecutorService executorService = Executors.newFixedThreadPool(1);
    private int filesProcessed = 0;
    private final int pipesClientId = CLIENT_COUNTER.getAndIncrement();

    /* renamed from: org.apache.tika.pipes.PipesClient$1 */
    public static /* synthetic */ class C45391 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS;

        static {
            int[] iArr = new int[PipesServer.STATUS.values().length];
            $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS = iArr;
            try {
                iArr[PipesServer.STATUS.OOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMITTER_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCHER_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCHER_INITIALIZATION_EXCEPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCH_EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.INTERMEDIATE_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PARSE_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PARSE_EXCEPTION_NO_EMIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMPTY_OUTPUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.READY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.CALL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FAILED_TO_START.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public PipesClient(PipesConfigBase pipesConfigBase) {
        this.pipesConfig = pipesConfigBase;
    }

    private PipesResult actuallyProcess(final FetchEmitTuple fetchEmitTuple) throws InterruptedException {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final PipesResult[] pipesResultArr = new PipesResult[1];
        FutureTask futureTask = new FutureTask(new Callable() { // from class: org.apache.tika.pipes.OooO00o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f33316OooOo0O.lambda$actuallyProcess$0(fetchEmitTuple, jCurrentTimeMillis, pipesResultArr);
            }
        });
        try {
            try {
                try {
                    try {
                        if (!this.closed) {
                            this.executorService.execute(futureTask);
                            PipesResult pipesResult = (PipesResult) futureTask.get(this.pipesConfig.getTimeoutMillis(), TimeUnit.MILLISECONDS);
                            futureTask.cancel(true);
                            return pipesResult;
                        }
                        throw new IllegalArgumentException("pipesClientId=" + this.pipesClientId + ": PipesClient closed");
                    } catch (InterruptedException e) {
                        destroyForcibly();
                        throw e;
                    }
                } catch (TimeoutException unused) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    destroyForcibly();
                    LOG.OooO0OO("pipesClientId={} client timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis2));
                    PipesResult pipesResultBuildFatalResult = buildFatalResult(PipesResult.TIMEOUT, pipesResultArr);
                    futureTask.cancel(true);
                    return pipesResultBuildFatalResult;
                }
            } catch (ExecutionException e2) {
                OooO0O0 oooO0O0 = LOG;
                oooO0O0.OooOOOO("pipesClientId=" + this.pipesClientId + ": execution exception", e2);
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                pauseThenDestroy();
                if (!this.process.isAlive() && 17 == this.process.exitValue()) {
                    oooO0O0.OooO0OO("pipesClientId={} server timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis3));
                    PipesResult pipesResultBuildFatalResult2 = buildFatalResult(PipesResult.TIMEOUT, pipesResultArr);
                    futureTask.cancel(true);
                    return pipesResultBuildFatalResult2;
                }
                Process process = this.process;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                process.waitFor(500L, TimeUnit.MILLISECONDS);
                if (this.process.isAlive()) {
                    oooO0O0.OooO0OO("pipesClientId={} crash: {} in {} ms with no exit code available", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis3));
                } else {
                    oooO0O0.OooO0OO("pipesClientId={} crash: {} in {} ms with exit code {}", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis3), Integer.valueOf(this.process.exitValue()));
                }
                PipesResult pipesResultBuildFatalResult3 = buildFatalResult(PipesResult.UNSPECIFIED_CRASH, pipesResultArr);
                futureTask.cancel(true);
                return pipesResultBuildFatalResult3;
            }
        } catch (Throwable th) {
            futureTask.cancel(true);
            throw th;
        }
    }

    private PipesResult buildFatalResult(PipesResult pipesResult, PipesResult[] pipesResultArr) {
        if (pipesResultArr[0] == null) {
            return pipesResult;
        }
        OooO0O0 oooO0O0 = LOG;
        if (oooO0O0.OooO0o()) {
            oooO0O0.OooOOO0("intermediate result: {}", pipesResultArr[0].getEmitData());
        }
        pipesResultArr[0].getEmitData().getMetadataList().get(0).set(TikaCoreProperties.PIPES_RESULT, pipesResult.getStatus().toString());
        return new PipesResult(pipesResult.getStatus(), pipesResultArr[0].getEmitData(), true);
    }

    private PipesResult deserializeEmitData() throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        try {
            int i = OooOOO0.f32667OooOoO;
            OooOO0O oooOO0O = new OooOO0O();
            oooOO0O.OooOO0O(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(oooOO0O.OooOO0());
            try {
                EmitData emitData = (EmitData) objectInputStream.readObject();
                String containerStackTrace = emitData.getContainerStackTrace();
                if (StringUtils.isBlank(containerStackTrace)) {
                    PipesResult pipesResult = new PipesResult(emitData);
                    objectInputStream.close();
                    return pipesResult;
                }
                PipesResult pipesResult2 = new PipesResult(emitData, containerStackTrace);
                objectInputStream.close();
                return pipesResult2;
            } finally {
            }
        } catch (ClassNotFoundException e) {
            LOG.OooOOOO("class not found exception deserializing data", e);
            throw new RuntimeException(e);
        }
    }

    private PipesResult deserializeIntermediateResult(EmitKey emitKey, ParseContext parseContext) throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        try {
            int i = OooOOO0.f32667OooOoO;
            OooOO0O oooOO0O = new OooOO0O();
            oooOO0O.OooOO0O(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(oooOO0O.OooOO0());
            try {
                PipesResult pipesResult = new PipesResult(PipesResult.STATUS.INTERMEDIATE_RESULT, new EmitData(emitKey, Collections.singletonList((Metadata) objectInputStream.readObject())), true);
                objectInputStream.close();
                return pipesResult;
            } finally {
            }
        } catch (ClassNotFoundException e) {
            LOG.OooOOOO("class not found exception deserializing data", e);
            throw new RuntimeException(e);
        }
    }

    private void destroyForcibly() throws InterruptedException, IOException {
        this.process.destroyForcibly();
        Process process = this.process;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        process.waitFor(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        try {
            this.input.close();
        } catch (IOException unused) {
        }
        try {
            this.output.close();
        } catch (IOException unused2) {
        }
        if (this.process.isAlive()) {
            LOG.OooOOo("Process still alive after {}ms", 10000L);
        }
    }

    private String[] getCommandline() {
        List<String> forkedJvmArgs = this.pipesConfig.getForkedJvmArgs();
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String strReplace = null;
        for (String str2 : forkedJvmArgs) {
            if (str2.startsWith("-Djava.awt.headless")) {
                z2 = true;
            }
            if (str2.equals("-cp") || str2.equals("--classpath")) {
                z = true;
            }
            if (str2.equals("-XX:+ExitOnOutOfMemoryError") || str2.equals("-XX:+CrashOnOutOfMemoryError")) {
                z3 = true;
            }
            if (str2.startsWith("-Dlog4j.configuration")) {
                z4 = true;
            }
            if (str2.startsWith("-Xloggc:")) {
                strReplace = str2.replace("${pipesClientId}", "id-" + this.pipesClientId);
                str = str2;
            }
        }
        if (str != null && strReplace != null) {
            forkedJvmArgs.remove(str);
            forkedJvmArgs.add(strReplace);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProcessUtils.escapeCommandLine(this.pipesConfig.getJavaPath()));
        if (!z) {
            arrayList.add("-cp");
            arrayList.add(System.getProperty("java.class.path"));
        }
        if (!z2) {
            arrayList.add("-Djava.awt.headless=true");
        }
        if (z3) {
            LOG.OooOo0o("I notice that you have an exit/crash on OOM. If you run heavy external processes like tesseract, this setting may result in orphaned processes which could be disastrous for performance.");
        }
        if (!z4) {
            arrayList.add("-Dlog4j.configurationFile=classpath:pipes-fork-server-default-log4j2.xml");
        }
        arrayList.add("-DpipesClientId=" + this.pipesClientId);
        arrayList.addAll(forkedJvmArgs);
        arrayList.add("org.apache.tika.pipes.PipesServer");
        arrayList.add(ProcessUtils.escapeCommandLine(this.pipesConfig.getTikaConfig().toAbsolutePath().toString()));
        arrayList.add(Long.toString(this.pipesConfig.getMaxForEmitBatchBytes()));
        arrayList.add(Long.toString(this.pipesConfig.getTimeoutMillis()));
        arrayList.add(Long.toString(this.pipesConfig.getShutdownClientAfterMillis()));
        LOG.OooOoOO("pipesClientId={}: commandline: {}", Integer.valueOf(this.pipesClientId), arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static String getMsg(String str, o0OoOo0 o0oooo0) {
        Charset charset = StandardCharsets.UTF_8;
        o0oooo0.getClass();
        String str2 = new String(o0oooo0.OooO0O0(), charset);
        if (StringUtils.isBlank(str2)) {
            return str;
        }
        return str + "So far, I've read: >" + str2 + "<";
    }

    public PipesResult lambda$actuallyProcess$0(FetchEmitTuple fetchEmitTuple, long j, PipesResult[] pipesResultArr) throws Exception {
        int i = o0OoOo0.f32678OooOoOO;
        new OooO();
        o0OoOo0 o0oooo0 = new o0OoOo0();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(o0oooo0);
        try {
            objectOutputStream.writeObject(fetchEmitTuple);
            objectOutputStream.close();
            byte[] bArrOooO0O0 = o0oooo0.OooO0O0();
            this.output.write(PipesServer.STATUS.CALL.getByte());
            this.output.writeInt(bArrOooO0O0.length);
            this.output.write(bArrOooO0O0);
            this.output.flush();
            OooO0O0 oooO0O0 = LOG;
            if (oooO0O0.OooO0o()) {
                oooO0O0.OooO0oO("pipesClientId={}: timer -- write tuple: {} ms", Integer.valueOf(this.pipesClientId), Long.valueOf(System.currentTimeMillis() - j));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException("thread interrupt");
            }
            PipesResult results = readResults(fetchEmitTuple, j);
            while (results.getStatus().equals(PipesResult.STATUS.INTERMEDIATE_RESULT)) {
                pipesResultArr[0] = results;
                results = readResults(fetchEmitTuple, j);
            }
            OooO0O0 oooO0O02 = LOG;
            if (oooO0O02.OooO0O0()) {
                oooO0O02.OooOoO(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "finished reading result in {} ms");
            }
            if (oooO0O02.OooO0o()) {
                oooO0O02.OooO0oO("pipesClientId={}: timer -- read result: {} ms", Integer.valueOf(this.pipesClientId), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
            return results.getStatus() == PipesResult.STATUS.OOM ? buildFatalResult(results, pipesResultArr) : results;
        } catch (Throwable th) {
            try {
                objectOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Integer lambda$restart$1(o0OoOo0 o0oooo0) throws Exception {
        int i = this.input.read();
        int i2 = 1;
        while (i2 < 20000 && i != PipesServer.STATUS.READY.getByte()) {
            if (i == -1) {
                throw new RuntimeException(getMsg("pipesClientId=" + this.pipesClientId + ": Couldn't start server -- read EOF before 'ready' byte.\n process isAlive=" + this.process.isAlive(), o0oooo0));
            }
            o0oooo0.write(i);
            i = this.input.read();
            i2++;
        }
        if (i2 >= 20000) {
            throw new RuntimeException(getMsg(OooOo.OooO0oO(this.pipesClientId, "pipesClientId=", ": Couldn't start server: read too many bytes before 'ready' byte.\n Make absolutely certain that your logger is not writing to stdout.\n"), o0oooo0));
        }
        if (o0oooo0.f32681OooOo0o > 0) {
            LOG.OooOO0O(Integer.valueOf(this.pipesClientId), "pipesClientId={}: From forked process before start byte: {}", new String(o0oooo0.OooO0O0(), StandardCharsets.UTF_8));
        }
        return 1;
    }

    private void pauseThenDestroy() throws InterruptedException, IOException {
        try {
            Process process = this.process;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            process.waitFor(200L, TimeUnit.MILLISECONDS);
        } finally {
            destroyForcibly();
        }
    }

    private boolean ping() throws IOException {
        Process process = this.process;
        if (process == null || !process.isAlive()) {
            return false;
        }
        try {
            DataOutputStream dataOutputStream = this.output;
            PipesServer.STATUS status = PipesServer.STATUS.PING;
            dataOutputStream.write(status.getByte());
            this.output.flush();
            return this.input.read() == status.getByte();
        } catch (IOException unused) {
            return false;
        }
    }

    private PipesResult readMessage(PipesResult.STATUS status) throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        return new PipesResult(status, new String(bArr, StandardCharsets.UTF_8));
    }

    private PipesResult readResults(FetchEmitTuple fetchEmitTuple, long j) throws IOException {
        int i = this.input.read();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            PipesServer.STATUS statusLookup = PipesServer.STATUS.lookup(i);
            switch (C45391.$SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[statusLookup.ordinal()]) {
                case 1:
                    LOG.OooO0OO("pipesClientId={} oom: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return PipesResult.OOM;
                case 2:
                    LOG.OooO0OO("pipesClientId={} server response timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return PipesResult.TIMEOUT;
                case 3:
                    LOG.OooO0OO("pipesClientId={} emit exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.EMIT_EXCEPTION);
                case 4:
                    LOG.OooO0OO("pipesClientId={} emitter not found: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.NO_EMITTER_FOUND);
                case 5:
                    LOG.OooO0OO("pipesClientId={} fetcher not found: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.NO_FETCHER_FOUND);
                case 6:
                    LOG.OooO0OO("pipesClientId={} fetcher initialization exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.FETCHER_INITIALIZATION_EXCEPTION);
                case 7:
                    LOG.OooO0OO("pipesClientId={} fetch exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.FETCH_EXCEPTION);
                case 8:
                    LOG.OooO0oo("pipesClientId={} intermediate success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return deserializeIntermediateResult(fetchEmitTuple.getEmitKey(), fetchEmitTuple.getParseContext());
                case 9:
                    LOG.OooO0oo("pipesClientId={} parse success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return deserializeEmitData();
                case 10:
                    return readMessage(PipesResult.STATUS.PARSE_EXCEPTION_NO_EMIT);
                case 11:
                    LOG.OooO0oo("pipesClientId={} emit success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return PipesResult.EMIT_SUCCESS;
                case 12:
                    return readMessage(PipesResult.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION);
                case 13:
                    return PipesResult.EMPTY_OUTPUT;
                case 14:
                case 15:
                case 16:
                case 17:
                    throw new IOException("Not expecting this status: " + statusLookup);
                default:
                    throw new IOException("Need to handle procesing for: " + statusLookup);
            }
        } catch (IllegalArgumentException e) {
            throw new IOException("problem reading response from server: ".concat(i > -1 ? String.format(Locale.US, "%02x", Byte.valueOf((byte) i)) : C3824x4.f12571f), e);
        }
    }

    private void restart() throws InterruptedException, TimeoutException, IOException {
        if (this.process != null) {
            OooO0O0 oooO0O0 = LOG;
            oooO0O0.OooOOo0("process still alive; trying to destroy it");
            destroyForcibly();
            Process process = this.process;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!process.waitFor(30L, TimeUnit.SECONDS)) {
                oooO0O0.OooOo00(Integer.valueOf(this.pipesClientId), "pipesClientId={}: process has not yet ended");
            }
            this.executorService.shutdownNow();
            if (!this.executorService.awaitTermination(30L, timeUnit)) {
                oooO0O0.OooOo00(Integer.valueOf(this.pipesClientId), "pipesClientId={}: executorService has not yet shutdown");
            }
            synchronized (this.executorServiceLock) {
                if (this.closed) {
                    throw new IllegalArgumentException("pipesClientId=" + this.pipesClientId + ": PipesClient closed");
                }
                this.executorService = Executors.newFixedThreadPool(1);
            }
            oooO0O0.OooOO0o(Integer.valueOf(this.pipesClientId), "pipesClientId={}: restarting process");
        } else {
            LOG.OooOO0o(Integer.valueOf(this.pipesClientId), "pipesClientId={}: starting process");
        }
        ProcessBuilder processBuilder = new ProcessBuilder(getCommandline());
        ProcessBuilder.Redirect unused = ProcessBuilder.Redirect.INHERIT;
        processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
        try {
            this.process = processBuilder.start();
            this.input = new DataInputStream(this.process.getInputStream());
            this.output = new DataOutputStream(this.process.getOutputStream());
            int i = o0OoOo0.f32678OooOoOO;
            new OooO();
            o0OoOo0 o0oooo0 = new o0OoOo0();
            FutureTask futureTask = new FutureTask(new o000oOoO(3, this, o0oooo0));
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.executorService.submit(futureTask);
            try {
                try {
                    try {
                        futureTask.get(this.pipesConfig.getStartupTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (ExecutionException e) {
                        LOG.OooOOOO("pipesClientId=" + this.pipesClientId + ": couldn't start server", e);
                        destroyForcibly();
                        throw new RuntimeException(e);
                    } catch (TimeoutException e2) {
                        LOG.OooOOoo(Integer.valueOf(this.pipesClientId), Long.valueOf(this.pipesConfig.getStartupTimeoutMillis()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), new String(o0oooo0.OooO0O0(), StandardCharsets.UTF_8));
                        destroyForcibly();
                        throw e2;
                    }
                } catch (InterruptedException e3) {
                    destroyForcibly();
                    throw e3;
                }
            } finally {
                futureTask.cancel(true);
            }
        } catch (Exception e4) {
            LOG.OooOOOO("failed to start client", e4);
            throw new FailedToStartClientException(e4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.process != null) {
            try {
                destroyForcibly();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.executorServiceLock) {
            try {
                ExecutorService executorService = this.executorService;
                if (executorService != null) {
                    executorService.shutdownNow();
                }
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getFilesProcessed() {
        return this.filesProcessed;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.tika.pipes.PipesResult process(org.apache.tika.pipes.FetchEmitTuple r6) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r5.ping()
            if (r0 != 0) goto L7
            goto L2c
        L7:
            org.apache.tika.pipes.PipesConfigBase r0 = r5.pipesConfig
            int r0 = r0.getMaxFilesProcessedPerProcess()
            if (r0 <= 0) goto L55
            int r0 = r5.filesProcessed
            org.apache.tika.pipes.PipesConfigBase r1 = r5.pipesConfig
            int r1 = r1.getMaxFilesProcessedPerProcess()
            if (r0 < r1) goto L55
            o0oOO.OooO0O0 r0 = org.apache.tika.pipes.PipesClient.LOG
            int r1 = r5.pipesClientId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.filesProcessed
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "pipesClientId={}: restarting server after hitting max files: {}"
            r0.OooOOO(r3, r1, r2)
        L2c:
            r0 = 0
        L2d:
            if (r0 != 0) goto L55
            r5.restart()     // Catch: java.util.concurrent.TimeoutException -> L34
            r0 = 1
            goto L2d
        L34:
            o0oOO.OooO0O0 r1 = org.apache.tika.pipes.PipesClient.LOG
            int r2 = r5.pipesClientId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.apache.tika.pipes.PipesConfigBase r3 = r5.pipesConfig
            long r3 = r3.getStartupTimeoutMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "pipesClientId={}: couldn't restart within {} ms (startupTimeoutMillis)"
            r1.OooOO0O(r2, r4, r3)
            org.apache.tika.pipes.PipesConfigBase r1 = r5.pipesConfig
            long r1 = r1.getSleepOnStartupTimeoutMillis()
            java.lang.Thread.sleep(r1)
            goto L2d
        L55:
            org.apache.tika.pipes.PipesResult r6 = r5.actuallyProcess(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesClient.process(org.apache.tika.pipes.FetchEmitTuple):org.apache.tika.pipes.PipesResult");
    }
}

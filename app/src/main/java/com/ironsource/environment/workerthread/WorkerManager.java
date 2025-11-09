package com.ironsource.environment.workerthread;

import com.ironsource.C3551q9;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class WorkerManager<T> {

    /* renamed from: a */
    List<Callable<T>> f8453a = new ArrayList();

    /* renamed from: b */
    private final ExecutorService f8454b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.f8454b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f8453a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j, TimeUnit timeUnit) throws InterruptedException {
        WorkerResult.Canceled canceled;
        if (this.f8454b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f8453a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f8454b.invokeAll(this.f8453a, j, timeUnit);
            for (int i = 0; i < listInvokeAll.size(); i++) {
                Future<T> future = listInvokeAll.get(i);
                if (!future.isDone() || future.isCancelled()) {
                    canceled = new WorkerResult.Canceled(this.f8453a.get(i));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e) {
                        e = e;
                        C3551q9.m11517d().m11519a(e);
                        arrayList.add(new WorkerResult.Failed(this.f8453a.get(i), e));
                    } catch (CancellationException e2) {
                        C3551q9.m11517d().m11519a(e2);
                        canceled = new WorkerResult.Canceled(this.f8453a.get(i));
                    } catch (ExecutionException e3) {
                        e = e3;
                        C3551q9.m11517d().m11519a(e);
                        arrayList.add(new WorkerResult.Failed(this.f8453a.get(i), e));
                    }
                }
                arrayList.add(canceled);
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f8454b.shutdownNow();
        } catch (Exception e4) {
            C3551q9.m11517d().m11519a(e4);
            IronLog.INTERNAL.error(e4.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
            this.f8454b.shutdownNow();
        }
    }
}

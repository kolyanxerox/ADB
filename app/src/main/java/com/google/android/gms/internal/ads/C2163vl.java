package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.vl */
/* loaded from: classes2.dex */
public class C2163vl extends AbstractExecutorService implements cq0, AutoCloseable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f24992OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final Executor f24993OooOo0o;

    public C2163vl(Executor executor) {
        this.f24993OooOo0o = executor;
    }

    public final o00000oO.OooOOO OooO00o(Runnable runnable) {
        return (o00000oO.OooOOO) super.submit(runnable);
    }

    public final o00000oO.OooOOO OooO0O0(Callable callable) {
        return (o00000oO.OooOOO) super.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.f24992OooOo0O) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f24993OooOo0o).awaitTermination(j, timeUnit);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f24992OooOo0O) {
            case 0:
                this.f24993OooOo0o.execute(runnable);
                break;
            default:
                ((ExecutorService) this.f24993OooOo0o).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f24992OooOo0O) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f24993OooOo0o).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f24992OooOo0O) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f24993OooOo0o).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new nq0(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f24992OooOo0O) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f24993OooOo0o).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f24992OooOo0O) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f24993OooOo0o).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (o00000oO.OooOOO) super.submit(runnable);
    }

    public String toString() {
        switch (this.f24992OooOo0O) {
            case 1:
                return super.toString() + C3034d9.i.f8177d + String.valueOf((ExecutorService) this.f24993OooOo0o) + C3034d9.i.f8179e;
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new nq0(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (o00000oO.OooOOO) super.submit(runnable, obj);
    }

    public C2163vl(ExecutorService executorService) {
        executorService.getClass();
        this.f24993OooOo0o = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (o00000oO.OooOOO) super.submit(callable);
    }
}

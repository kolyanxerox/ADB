package o00O0oOo;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o00000oO.OooOOO0;
import o00OO00o.OooO;
import o00OO00o.OooO0o;

/* loaded from: classes3.dex */
public final class o00O00O extends o00O00 implements o000O00 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Executor f31532OooOo0O;

    public o00O00O(Executor executor) {
        this.f31532OooOo0O = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // o00O0oOo.o000O00
    public final void OooO(long j, oo0o0Oo oo0o0oo) {
        Executor executor = this.f31532OooOo0O;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new OooOOO0(25, this, oo0o0oo), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                o00O0O00 o00o0o00 = (o00O0O00) oo0o0oo.f31582OooOoO.get(o00O0.f31523OooOo0O);
                if (o00o0o00 != null) {
                    o00o0o00.OooO00o(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            oo0o0oo.OooOo0(new o0ooOOo(scheduledFutureSchedule, 0));
        } else {
            o000.f31479OooOoo.OooO(j, oo0o0oo);
        }
    }

    @Override // o00O0oOo.o000O00
    public final o000OO00 OooO0Oo(long j, Runnable runnable, o00O0O0O.OooOOO0 oooOOO0) {
        Executor executor = this.f31532OooOo0O;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                o00O0O00 o00o0o00 = (o00O0O00) oooOOO0.get(o00O0.f31523OooOo0O);
                if (o00o0o00 != null) {
                    o00o0o00.OooO00o(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new o000O(scheduledFutureSchedule) : o000.f31479OooOoo.OooO0Oo(j, runnable, oooOOO0);
    }

    @Override // o00O0oOo.o00O00
    public final Executor OooOOO0() {
        return this.f31532OooOo0O;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f31532OooOo0O;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatch(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        try {
            this.f31532OooOo0O.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            o00O0O00 o00o0o00 = (o00O0O00) oooOOO0.get(o00O0.f31523OooOo0O);
            if (o00o0o00 != null) {
                o00o0o00.OooO00o(cancellationException);
            }
            OooO oooO = o000O0O0.f31514OooO00o;
            OooO0o.f31999OooOo0O.dispatch(oooOOO0, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00O00O) && ((o00O00O) obj).f31532OooOo0O == this.f31532OooOo0O;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f31532OooOo0O);
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        return this.f31532OooOo0O.toString();
    }
}

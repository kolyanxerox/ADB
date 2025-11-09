package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.Oooo000;
import o00000oO.OooOOO;
import o00O0oOo.o00O0O00;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class JobListenableFuture<R> implements OooOOO {
    private final o00O0O00 job;
    private final SettableFuture<R> underlying;

    /* renamed from: androidx.work.JobListenableFuture$1 */
    public static final class C08671 extends Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ JobListenableFuture<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08671(JobListenableFuture<R> jobListenableFuture) {
            super(1);
            this.this$0 = jobListenableFuture;
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return OooOo.f33195OooO00o;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                if (!((JobListenableFuture) this.this$0).underlying.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (th instanceof CancellationException) {
                    ((JobListenableFuture) this.this$0).underlying.cancel(true);
                    return;
                }
                SettableFuture settableFuture = ((JobListenableFuture) this.this$0).underlying;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                settableFuture.setException(th);
            }
        }
    }

    public JobListenableFuture(o00O0O00 job, SettableFuture<R> underlying) {
        kotlin.jvm.internal.OooOo.OooO0o0(job, "job");
        kotlin.jvm.internal.OooOo.OooO0o0(underlying, "underlying");
        this.job = job;
        this.underlying = underlying;
        job.OooO0oo(new C08671(this));
    }

    @Override // o00000oO.OooOOO
    public void addListener(Runnable runnable, Executor executor) {
        this.underlying.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.underlying.cancel(z);
    }

    public final void complete(R r) {
        this.underlying.set(r);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.underlying.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.underlying.isDone();
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) {
        return this.underlying.get(j, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JobListenableFuture(o00O0O00 o00o0o00, SettableFuture settableFuture, int i, OooOO0O oooOO0O) {
        if ((i & 2) != 0) {
            settableFuture = SettableFuture.create();
            kotlin.jvm.internal.OooOo.OooO0Oo(settableFuture, "create()");
        }
        this(o00o0o00, settableFuture);
    }
}

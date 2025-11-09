package o0000ooO;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o0O0O0Oo extends AbstractResolvableFuture implements ScheduledFuture {

    /* renamed from: OooOo0O */
    public final ScheduledFuture f29714OooOo0O;

    public o0O0O0Oo(o0O0oo0o o0o0oo0o) {
        this.f29714OooOo0O = o0o0oo0o.OooO00o(new OooOO0(this, 23));
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void afterDone() {
        this.f29714OooOo0O.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f29714OooOo0O.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f29714OooOo0O.getDelay(timeUnit);
    }
}

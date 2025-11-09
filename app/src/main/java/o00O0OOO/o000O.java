package o00O0oOo;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public final class o000O implements o000OO00 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ScheduledFuture f31509OooOo0O;

    public o000O(ScheduledFuture scheduledFuture) {
        this.f31509OooOo0O = scheduledFuture;
    }

    @Override // o00O0oOo.o000OO00
    public final void dispose() {
        this.f31509OooOo0O.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f31509OooOo0O + ']';
    }
}

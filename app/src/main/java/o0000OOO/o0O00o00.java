package o0000ooO;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0O00o00 implements o0O0oo0o {

    /* renamed from: OooOo */
    public final /* synthetic */ Runnable f29701OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f29702OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o0oO0O0o f29703OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ long f29704OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ long f29705OooOoO0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ TimeUnit f29706OooOoOO;

    public /* synthetic */ o0O00o00(o0oO0O0o o0oo0o0o, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f29702OooOo0O = i;
        this.f29703OooOo0o = o0oo0o0o;
        this.f29701OooOo = runnable;
        this.f29705OooOoO0 = j;
        this.f29704OooOoO = j2;
        this.f29706OooOoOO = timeUnit;
    }

    @Override // o0000ooO.o0O0oo0o
    public final ScheduledFuture OooO00o(OooOO0 oooOO0) {
        switch (this.f29702OooOo0O) {
            case 0:
                o0oO0O0o o0oo0o0o = this.f29703OooOo0o;
                return o0oo0o0o.f29727OooOo0o.scheduleAtFixedRate(new o0O00oO0(o0oo0o0o, this.f29701OooOo, oooOO0, 0), this.f29705OooOoO0, this.f29704OooOoO, this.f29706OooOoOO);
            default:
                o0oO0O0o o0oo0o0o2 = this.f29703OooOo0o;
                return o0oo0o0o2.f29727OooOo0o.scheduleWithFixedDelay(new o0O00oO0(o0oo0o0o2, this.f29701OooOo, oooOO0, 2), this.f29705OooOoO0, this.f29704OooOoO, this.f29706OooOoOO);
        }
    }
}

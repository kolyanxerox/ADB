package OoooOOO;

import OooO0oO.OooOOO0;
import Oooo.OooOOO;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO0O00o0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f14713OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final long f14714OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final long f14715OooOo0o;

    public oO0O00o0(OooOOO0 oooOOO0, long j, long j2) {
        Objects.requireNonNull(oooOOO0);
        this.f14713OooOo = oooOOO0;
        this.f14714OooOo0O = j;
        this.f14715OooOo0o = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) ((oO0O0O00) this.f14713OooOo.f13278OooOo).f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new OooOOO(this, 7));
    }
}

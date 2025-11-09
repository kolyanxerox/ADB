package OoooOOO;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO00Oo00 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ long f14666OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ oO00OOo0 f14667OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ oO00OOo0 f14668OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ oO00o000 f14669OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ boolean f14670OooOoO0;

    public oO00Oo00(oO00o000 oo00o000, oO00OOo0 oo00ooo0, oO00OOo0 oo00ooo02, long j, boolean z) {
        this.f14667OooOo0O = oo00ooo0;
        this.f14668OooOo0o = oo00ooo02;
        this.f14666OooOo = j;
        this.f14670OooOoO0 = z;
        Objects.requireNonNull(oo00o000);
        this.f14669OooOoO = oo00o000;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14669OooOoO.OooOo0(this.f14667OooOo0O, this.f14668OooOo0o, this.f14666OooOo, this.f14670OooOoO0, null);
    }
}

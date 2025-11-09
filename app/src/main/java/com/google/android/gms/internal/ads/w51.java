package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class w51 extends w81 {

    /* renamed from: OooO0OO */
    public final /* synthetic */ int f25232OooO0OO = 0;

    /* renamed from: OooO0Oo */
    public final Object f25233OooO0Oo;

    public w51(AbstractC1787lf abstractC1787lf) {
        super(abstractC1787lf);
        this.f25233OooO0Oo = new C2045se();
    }

    @Override // com.google.android.gms.internal.ads.w81, com.google.android.gms.internal.ads.AbstractC1787lf
    public C1528ee OooO0Oo(int i, C1528ee c1528ee, boolean z) {
        switch (this.f25232OooO0OO) {
            case 0:
                AbstractC1787lf abstractC1787lf = this.f25266OooO0O0;
                C1528ee c1528eeOooO0Oo = abstractC1787lf.OooO0Oo(i, c1528ee, z);
                if (abstractC1787lf.OooO0o0(c1528eeOooO0Oo.f18576OooO0OO, (C2045se) this.f25233OooO0Oo, 0L).OooO0O0()) {
                    Integer num = c1528ee.f18574OooO00o;
                    Object obj = c1528ee.f18575OooO0O0;
                    int i2 = c1528ee.f18576OooO0OO;
                    long j = c1528ee.f18577OooO0Oo;
                    C2145v3 c2145v3 = C2145v3.f24840OooO0O0;
                    c1528eeOooO0Oo.OooO0O0(num, obj, i2, j, true);
                } else {
                    c1528eeOooO0Oo.f18579OooO0o0 = true;
                }
                return c1528eeOooO0Oo;
            default:
                return super.OooO0Oo(i, c1528ee, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.w81, com.google.android.gms.internal.ads.AbstractC1787lf
    public C2045se OooO0o0(int i, C2045se c2045se, long j) {
        switch (this.f25232OooO0OO) {
            case 1:
                this.f25266OooO0O0.OooO0o0(i, c2045se, j);
                C1550f c1550f = (C1550f) this.f25233OooO0Oo;
                c2045se.f24071OooO0O0 = c1550f;
                oO00o00O oo00o00o = c1550f.f18716OooO0O0;
                return c2045se;
            default:
                return super.OooO0o0(i, c2045se, j);
        }
    }

    public w51(AbstractC1787lf abstractC1787lf, C1550f c1550f) {
        super(abstractC1787lf);
        this.f25233OooO0Oo = c1550f;
    }
}

package OoooOOO;

import Oooo00O.o000000O;
import Oooo0OO.oo000o;

/* loaded from: classes2.dex */
public final class oOO00000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oOO0000 f14827OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f14828OooO0O0 = 1;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f14829OooO0OO = OooO00o();

    public oOO00000(oOO0000 ooo0000) {
        this.f14827OooO00o = ooo0000;
    }

    public final long OooO00o() {
        oOO0000 ooo0000 = this.f14827OooO00o;
        o000000O.OooO0oo(ooo0000);
        long jLongValue = ((Long) o0O000O.f14244OooOo0O.OooO00o(null)).longValue();
        long jLongValue2 = ((Long) o0O000O.f14245OooOo0o.OooO00o(null)).longValue();
        for (int i = 1; i < this.f14828OooO0O0; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        ((oo000o) ooo0000.OooO0o0()).getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ee */
/* loaded from: classes2.dex */
public final class C1528ee {

    /* renamed from: OooO00o */
    public Integer f18574OooO00o;

    /* renamed from: OooO0O0 */
    public Object f18575OooO0O0;

    /* renamed from: OooO0OO */
    public int f18576OooO0OO;

    /* renamed from: OooO0Oo */
    public long f18577OooO0Oo;

    /* renamed from: OooO0o */
    public C2145v3 f18578OooO0o = C2145v3.f24840OooO0O0;

    /* renamed from: OooO0o0 */
    public boolean f18579OooO0o0;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final long OooO00o(int i, int i2) {
        OooO00o OooO00o2 = this.f18578OooO0o.OooO00o(i);
        if (OooO00o2.f16775OooO00o != -1) {
            return OooO00o2.f16779OooO0o0[i2];
        }
        return -9223372036854775807L;
    }

    public final void OooO0O0(Integer num, Object obj, int i, long j, boolean z) {
        C2145v3 c2145v3 = C2145v3.f24840OooO0O0;
        this.f18574OooO00o = num;
        this.f18575OooO0O0 = obj;
        this.f18576OooO0OO = i;
        this.f18577OooO0Oo = j;
        this.f18578OooO0o = c2145v3;
        this.f18579OooO0o0 = z;
    }

    public final void OooO0OO(int i) {
        this.f18578OooO0o.OooO00o(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1528ee.class.equals(obj.getClass())) {
            return false;
        }
        C1528ee c1528ee = (C1528ee) obj;
        return Objects.equals(this.f18574OooO00o, c1528ee.f18574OooO00o) && Objects.equals(this.f18575OooO0O0, c1528ee.f18575OooO0O0) && this.f18576OooO0OO == c1528ee.f18576OooO0OO && this.f18577OooO0Oo == c1528ee.f18577OooO0Oo && this.f18579OooO0o0 == c1528ee.f18579OooO0o0 && Objects.equals(this.f18578OooO0o, c1528ee.f18578OooO0o);
    }

    public final int hashCode() {
        Integer num = this.f18574OooO00o;
        int iHashCode = num == null ? 0 : num.hashCode();
        Object obj = this.f18575OooO0O0;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.f18576OooO0OO;
        long j = this.f18577OooO0Oo;
        return this.f18578OooO0o.hashCode() + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.f18579OooO0o0 ? 1 : 0)) * 31);
    }
}

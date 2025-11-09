package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.se */
/* loaded from: classes2.dex */
public final class C2045se {

    /* renamed from: OooOOO */
    public static final C1550f f24067OooOOO;

    /* renamed from: OooOOO0 */
    public static final Object f24068OooOOO0 = new Object();

    /* renamed from: OooO */
    public boolean f24069OooO;

    /* renamed from: OooO00o */
    public Object f24070OooO00o = f24068OooOOO0;

    /* renamed from: OooO0O0 */
    public C1550f f24071OooO0O0 = f24067OooOOO;

    /* renamed from: OooO0OO */
    public long f24072OooO0OO;

    /* renamed from: OooO0Oo */
    public long f24073OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f24074OooO0o;

    /* renamed from: OooO0o0 */
    public long f24075OooO0o0;

    /* renamed from: OooO0oO */
    public boolean f24076OooO0oO;

    /* renamed from: OooO0oo */
    public oO000Oo0 f24077OooO0oo;

    /* renamed from: OooOO0 */
    public long f24078OooOO0;

    /* renamed from: OooOO0O */
    public int f24079OooOO0O;
    public int OooOO0o;

    static {
        pm0 pm0Var = rm0.f23913OooOo0o;
        gn0 gn0Var = gn0.f19388OooOoO;
        List list = Collections.EMPTY_LIST;
        gn0 gn0Var2 = gn0.f19388OooOoO;
        oOO00000 ooo00000 = oOO00000.f22776OooO00o;
        Uri uri = Uri.EMPTY;
        f24067OooOOO = new C1550f("androidx.media3.common.Timeline", new o0O0O0Oo(), uri != null ? new oO00o00O(uri, gn0Var2) : null, new oO000Oo0(), C1626h1.f19498OooOoO);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void OooO00o(C1550f c1550f, boolean z, boolean z2, oO000Oo0 oo000oo0, long j) {
        this.f24070OooO00o = f24068OooOOO0;
        if (c1550f == null) {
            c1550f = f24067OooOOO;
        }
        this.f24071OooO0O0 = c1550f;
        this.f24072OooO0OO = -9223372036854775807L;
        this.f24073OooO0Oo = -9223372036854775807L;
        this.f24075OooO0o0 = -9223372036854775807L;
        this.f24074OooO0o = z;
        this.f24076OooO0oO = z2;
        this.f24077OooO0oo = oo000oo0;
        this.f24078OooOO0 = j;
        this.f24079OooOO0O = 0;
        this.OooOO0o = 0;
        this.f24069OooO = false;
    }

    public final boolean OooO0O0() {
        return this.f24077OooO0oo != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C2045se.class.equals(obj.getClass())) {
            return false;
        }
        C2045se c2045se = (C2045se) obj;
        return Objects.equals(this.f24070OooO00o, c2045se.f24070OooO00o) && Objects.equals(this.f24071OooO0O0, c2045se.f24071OooO0O0) && Objects.equals(this.f24077OooO0oo, c2045se.f24077OooO0oo) && this.f24072OooO0OO == c2045se.f24072OooO0OO && this.f24073OooO0Oo == c2045se.f24073OooO0Oo && this.f24075OooO0o0 == c2045se.f24075OooO0o0 && this.f24074OooO0o == c2045se.f24074OooO0o && this.f24076OooO0oO == c2045se.f24076OooO0oO && this.f24069OooO == c2045se.f24069OooO && this.f24078OooOO0 == c2045se.f24078OooOO0 && this.f24079OooOO0O == c2045se.f24079OooOO0O && this.OooOO0o == c2045se.OooOO0o;
    }

    public final int hashCode() {
        int iHashCode = ((this.f24070OooO00o.hashCode() + 217) * 31) + this.f24071OooO0O0.hashCode();
        oO000Oo0 oo000oo0 = this.f24077OooO0oo;
        int iHashCode2 = ((iHashCode * 961) + (oo000oo0 == null ? 0 : oo000oo0.hashCode())) * 31;
        long j = this.f24072OooO0OO;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f24073OooO0Oo;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f24075OooO0o0;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f24074OooO0o ? 1 : 0)) * 31) + (this.f24076OooO0oO ? 1 : 0)) * 31) + (this.f24069OooO ? 1 : 0);
        long j4 = this.f24078OooOO0;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f24079OooOO0O) * 31) + this.OooOO0o) * 31;
    }
}

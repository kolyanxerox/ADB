package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.f */
/* loaded from: classes2.dex */
public final class C1550f {

    /* renamed from: OooO00o */
    public final String f18715OooO00o;

    /* renamed from: OooO0O0 */
    public final oO00o00O f18716OooO0O0;

    /* renamed from: OooO0OO */
    public final oO000Oo0 f18717OooO0OO;

    /* renamed from: OooO0Oo */
    public final C1626h1 f18718OooO0Oo;

    /* renamed from: OooO0o0 */
    public final o0O0O0Oo f18719OooO0o0;

    static {
        pm0 pm0Var = rm0.f23913OooOo0o;
        gn0 gn0Var = gn0.f19388OooOoO;
        List list = Collections.EMPTY_LIST;
        oOO00000 ooo00000 = oOO00000.f22776OooO00o;
        new o0O0O0Oo();
        C1626h1 c1626h1 = C1626h1.f19498OooOoO;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ C1550f(String str, o0O0O0Oo o0o0o0oo, oO00o00O oo00o00o, oO000Oo0 oo000oo0, C1626h1 c1626h1) {
        oOO00000 ooo00000 = oOO00000.f22776OooO00o;
        this.f18715OooO00o = str;
        this.f18716OooO0O0 = oo00o00o;
        this.f18717OooO0OO = oo000oo0;
        this.f18718OooO0Oo = c1626h1;
        this.f18719OooO0o0 = o0o0o0oo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1550f)) {
            return false;
        }
        C1550f c1550f = (C1550f) obj;
        if (!this.f18715OooO00o.equals(c1550f.f18715OooO00o) || !this.f18719OooO0o0.equals(c1550f.f18719OooO0o0) || !Objects.equals(this.f18716OooO0O0, c1550f.f18716OooO0O0) || !this.f18717OooO0OO.equals(c1550f.f18717OooO0OO) || !Objects.equals(this.f18718OooO0Oo, c1550f.f18718OooO0Oo)) {
            return false;
        }
        oOO00000 ooo00000 = oOO00000.f22776OooO00o;
        return ooo00000.equals(ooo00000);
    }

    public final int hashCode() {
        int iHashCode = this.f18715OooO00o.hashCode() * 31;
        oO00o00O oo00o00o = this.f18716OooO0O0;
        return (this.f18718OooO0Oo.hashCode() + ((this.f18719OooO0o0.hashCode() + ((this.f18717OooO0OO.hashCode() + ((iHashCode + (oo00o00o != null ? oo00o00o.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}

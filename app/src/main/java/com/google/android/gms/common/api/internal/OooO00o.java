package com.google.android.gms.common.api.internal;

import Oooo00O.o000000O;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO00o */
    public final int f16685OooO00o;

    /* renamed from: OooO0O0 */
    public final OooO0oO.OooOOO0 f16686OooO0O0;

    /* renamed from: OooO0OO */
    public final Oooo000.OooO0O0 f16687OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f16688OooO0Oo;

    public OooO00o(OooO0oO.OooOOO0 oooOOO0, Oooo000.OooO0O0 oooO0O0, String str) {
        this.f16686OooO0O0 = oooOOO0;
        this.f16687OooO0OO = oooO0O0;
        this.f16688OooO0Oo = str;
        this.f16685OooO00o = Arrays.hashCode(new Object[]{oooOOO0, oooO0O0, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return o000000O.OooOO0o(this.f16686OooO0O0, oooO00o.f16686OooO0O0) && o000000O.OooOO0o(this.f16687OooO0OO, oooO00o.f16687OooO0OO) && o000000O.OooOO0o(this.f16688OooO0Oo, oooO00o.f16688OooO0Oo);
    }

    public final int hashCode() {
        return this.f16685OooO00o;
    }
}

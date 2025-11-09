package com.google.android.gms.common.api.internal;

import OooOooo.o000O00O;
import Oooo00O.o000000O;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o000oOoO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f16729OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000O00O f16730OooO0O0;

    public /* synthetic */ o000oOoO(OooO00o oooO00o, o000O00O o000o00o2) {
        this.f16729OooO00o = oooO00o;
        this.f16730OooO0O0 = o000o00o2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o000oOoO)) {
            o000oOoO o000oooo2 = (o000oOoO) obj;
            if (o000000O.OooOO0o(this.f16729OooO00o, o000oooo2.f16729OooO00o) && o000000O.OooOO0o(this.f16730OooO0O0, o000oooo2.f16730OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16729OooO00o, this.f16730OooO0O0});
    }

    public final String toString() {
        OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(this);
        oooOOO0.OooO00o(this.f16729OooO00o, "key");
        oooOOO0.OooO00o(this.f16730OooO0O0, "feature");
        return oooOOO0.toString();
    }
}

package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class o000Oo0 {

    /* renamed from: OooO00o */
    public final o000O00O f21729OooO00o;

    /* renamed from: OooO0O0 */
    public final o000O00O f21730OooO0O0;

    public o000Oo0(o000O00O o000o00o2, o000O00O o000o00o3) {
        this.f21729OooO00o = o000o00o2;
        this.f21730OooO0O0 = o000o00o3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o000Oo0.class == obj.getClass()) {
            o000Oo0 o000oo02 = (o000Oo0) obj;
            if (this.f21729OooO00o.equals(o000oo02.f21729OooO00o) && this.f21730OooO0O0.equals(o000oo02.f21730OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21730OooO0O0.hashCode() + (this.f21729OooO00o.hashCode() * 31);
    }

    public final String toString() {
        o000O00O o000o00o2 = this.f21729OooO00o;
        String string = o000o00o2.toString();
        o000O00O o000o00o3 = this.f21730OooO0O0;
        return androidx.datastore.preferences.protobuf.OooO00o.OooOO0o(C3034d9.i.f8177d, string, o000o00o2.equals(o000o00o3) ? "" : ", ".concat(o000o00o3.toString()), C3034d9.i.f8179e);
    }
}

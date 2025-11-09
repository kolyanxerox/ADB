package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class fk0 extends nk0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f18959OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f18960OooO0O0;

    public fk0(int i, String str) {
        this.f18959OooO00o = i;
        this.f18960OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nk0) {
            nk0 nk0Var = (nk0) obj;
            if (this.f18959OooO00o == ((fk0) nk0Var).f18959OooO00o && ((str = this.f18960OooO0O0) != null ? str.equals(((fk0) nk0Var).f18960OooO0O0) : ((fk0) nk0Var).f18960OooO0O0 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18960OooO0O0;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f18959OooO00o ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.f18959OooO00o);
        sb.append(", sessionToken=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f18960OooO0O0, "}");
    }
}

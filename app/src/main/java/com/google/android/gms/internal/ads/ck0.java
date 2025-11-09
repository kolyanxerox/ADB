package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ck0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f18009OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f18010OooO0O0;

    public ck0(String str, String str2) {
        this.f18009OooO00o = str;
        this.f18010OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ck0) {
            ck0 ck0Var = (ck0) obj;
            String str = this.f18009OooO00o;
            if (str != null ? str.equals(ck0Var.f18009OooO00o) : ck0Var.f18009OooO00o == null) {
                String str2 = this.f18010OooO0O0;
                if (str2 != null ? str2.equals(ck0Var.f18010OooO0O0) : ck0Var.f18010OooO0O0 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18009OooO00o;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f18010OooO0O0;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(this.f18009OooO00o);
        sb.append(", appId=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f18010OooO0O0, "}");
    }
}

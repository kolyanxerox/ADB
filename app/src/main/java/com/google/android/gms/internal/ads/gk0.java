package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gk0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f19375OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f19376OooO0O0;

    public gk0(String str, String str2) {
        this.f19375OooO00o = str;
        this.f19376OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gk0) {
            gk0 gk0Var = (gk0) obj;
            String str = this.f19375OooO00o;
            if (str != null ? str.equals(gk0Var.f19375OooO00o) : gk0Var.f19375OooO00o == null) {
                String str2 = this.f19376OooO0O0;
                if (str2 != null ? str2.equals(gk0Var.f19376OooO0O0) : gk0Var.f19376OooO0O0 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19375OooO00o;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f19376OooO0O0;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(this.f19375OooO00o);
        sb.append(", appId=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f19376OooO0O0, "}");
    }
}

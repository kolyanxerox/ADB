package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class xt0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final tq0 f25797OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f25798OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f25799OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f25800OooO0Oo;

    public /* synthetic */ xt0(tq0 tq0Var, int i, String str, String str2) {
        this.f25797OooO00o = tq0Var;
        this.f25798OooO0O0 = i;
        this.f25799OooO0OO = str;
        this.f25800OooO0Oo = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xt0)) {
            return false;
        }
        xt0 xt0Var = (xt0) obj;
        return this.f25797OooO00o == xt0Var.f25797OooO00o && this.f25798OooO0O0 == xt0Var.f25798OooO0O0 && this.f25799OooO0OO.equals(xt0Var.f25799OooO0OO) && this.f25800OooO0Oo.equals(xt0Var.f25800OooO0Oo);
    }

    public final int hashCode() {
        return Objects.hash(this.f25797OooO00o, Integer.valueOf(this.f25798OooO0O0), this.f25799OooO0OO, this.f25800OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.f25797OooO00o);
        sb.append(", keyId=");
        sb.append(this.f25798OooO0O0);
        sb.append(", keyType='");
        sb.append(this.f25799OooO0OO);
        sb.append("', keyPrefix='");
        return OooO0oO.OooOo.OooOOOo(sb, this.f25800OooO0Oo, "')");
    }
}

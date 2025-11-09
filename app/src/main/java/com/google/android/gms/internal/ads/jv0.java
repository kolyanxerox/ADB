package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class jv0 extends lv0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f20395OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f20396OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final iv0 f20397OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final hv0 f20398OooO0Oo;

    public jv0(int i, int i2, iv0 iv0Var, hv0 hv0Var) {
        this.f20395OooO00o = i;
        this.f20396OooO0O0 = i2;
        this.f20397OooO0OO = iv0Var;
        this.f20398OooO0Oo = hv0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f20397OooO0OO != iv0.f20123OooO0o0;
    }

    public final int OooO0O0() {
        iv0 iv0Var = iv0.f20123OooO0o0;
        int i = this.f20396OooO0O0;
        iv0 iv0Var2 = this.f20397OooO0OO;
        if (iv0Var2 == iv0Var) {
            return i;
        }
        if (iv0Var2 == iv0.f20120OooO0O0 || iv0Var2 == iv0.f20121OooO0OO || iv0Var2 == iv0.f20122OooO0Oo) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jv0)) {
            return false;
        }
        jv0 jv0Var = (jv0) obj;
        return jv0Var.f20395OooO00o == this.f20395OooO00o && jv0Var.OooO0O0() == OooO0O0() && jv0Var.f20397OooO0OO == this.f20397OooO0OO && jv0Var.f20398OooO0Oo == this.f20398OooO0Oo;
    }

    public final int hashCode() {
        return Objects.hash(jv0.class, Integer.valueOf(this.f20395OooO00o), Integer.valueOf(this.f20396OooO0O0), this.f20397OooO0OO, this.f20398OooO0Oo);
    }

    public final String toString() {
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("HMAC Parameters (variant: ", String.valueOf(this.f20397OooO0OO), ", hashType: ", String.valueOf(this.f20398OooO0Oo), ", ");
        sbOooOOo0.append(this.f20396OooO0O0);
        sbOooOOo0.append("-byte tags, and ");
        return OooO0oO.OooOo.OooOOO(sbOooOOo0, this.f20395OooO00o, "-byte key)");
    }
}

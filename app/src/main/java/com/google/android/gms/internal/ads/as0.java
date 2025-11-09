package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class as0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f17096OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final or0 f17097OooO0O0;

    public as0(int i, or0 or0Var) {
        this.f17096OooO00o = i;
        this.f17097OooO0O0 = or0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f17097OooO0O0 != or0.f23093OooOooo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof as0)) {
            return false;
        }
        as0 as0Var = (as0) obj;
        return as0Var.f17096OooO00o == this.f17096OooO00o && as0Var.f17097OooO0O0 == this.f17097OooO0O0;
    }

    public final int hashCode() {
        return Objects.hash(as0.class, Integer.valueOf(this.f17096OooO00o), this.f17097OooO0O0);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOOO(OooO0oO.OooOo.OooOoO0("AesGcmSiv Parameters (variant: ", String.valueOf(this.f17097OooO0O0), ", "), this.f17096OooO00o, "-byte key)");
    }
}

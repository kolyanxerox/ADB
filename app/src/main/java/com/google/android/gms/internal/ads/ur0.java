package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ur0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f24772OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f24773OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final tr0 f24774OooO0OO;

    public ur0(int i, int i2, tr0 tr0Var) {
        this.f24772OooO00o = i;
        this.f24773OooO0O0 = i2;
        this.f24774OooO0OO = tr0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f24774OooO0OO != tr0.f24488OooOoO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ur0)) {
            return false;
        }
        ur0 ur0Var = (ur0) obj;
        return ur0Var.f24772OooO00o == this.f24772OooO00o && ur0Var.f24773OooO0O0 == this.f24773OooO0O0 && ur0Var.f24774OooO0OO == this.f24774OooO0OO;
    }

    public final int hashCode() {
        return Objects.hash(ur0.class, Integer.valueOf(this.f24772OooO00o), Integer.valueOf(this.f24773OooO0O0), 16, this.f24774OooO0OO);
    }

    public final String toString() {
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("AesEax Parameters (variant: ", String.valueOf(this.f24774OooO0OO), ", ");
        sbOooOoO0.append(this.f24773OooO0O0);
        sbOooOoO0.append("-byte IV, 16-byte tag, and ");
        return OooO0oO.OooOo.OooOOO(sbOooOoO0, this.f24772OooO00o, "-byte key)");
    }
}

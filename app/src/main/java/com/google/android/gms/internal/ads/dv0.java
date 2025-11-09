package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class dv0 extends lv0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f18412OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f18413OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final tq0 f18414OooO0OO;

    public dv0(int i, int i2, tq0 tq0Var) {
        this.f18412OooO00o = i;
        this.f18413OooO0O0 = i2;
        this.f18414OooO0OO = tq0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f18414OooO0OO != tq0.f24481Oooo0o;
    }

    public final int OooO0O0() {
        tq0 tq0Var = tq0.f24481Oooo0o;
        int i = this.f18413OooO0O0;
        tq0 tq0Var2 = this.f18414OooO0OO;
        if (tq0Var2 == tq0Var) {
            return i;
        }
        if (tq0Var2 == tq0.f24479Oooo0O0 || tq0Var2 == tq0.f24480Oooo0OO || tq0Var2 == tq0.f24482Oooo0o0) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dv0)) {
            return false;
        }
        dv0 dv0Var = (dv0) obj;
        return dv0Var.f18412OooO00o == this.f18412OooO00o && dv0Var.OooO0O0() == OooO0O0() && dv0Var.f18414OooO0OO == this.f18414OooO0OO;
    }

    public final int hashCode() {
        return Objects.hash(dv0.class, Integer.valueOf(this.f18412OooO00o), Integer.valueOf(this.f18413OooO0O0), this.f18414OooO0OO);
    }

    public final String toString() {
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("AES-CMAC Parameters (variant: ", String.valueOf(this.f18414OooO0OO), ", ");
        sbOooOoO0.append(this.f18413OooO0O0);
        sbOooOoO0.append("-byte tags, and ");
        return OooO0oO.OooOo.OooOOO(sbOooOoO0, this.f18412OooO00o, "-byte key)");
    }
}

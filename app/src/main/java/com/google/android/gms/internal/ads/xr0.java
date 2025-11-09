package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class xr0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f25788OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final tq0 f25789OooO0O0;

    public xr0(int i, tq0 tq0Var) {
        this.f25788OooO00o = i;
        this.f25789OooO0O0 = tq0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f25789OooO0O0 != tq0.f24471OooOoo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xr0)) {
            return false;
        }
        xr0 xr0Var = (xr0) obj;
        return xr0Var.f25788OooO00o == this.f25788OooO00o && xr0Var.f25789OooO0O0 == this.f25789OooO0O0;
    }

    public final int hashCode() {
        return Objects.hash(xr0.class, Integer.valueOf(this.f25788OooO00o), 12, 16, this.f25789OooO0O0);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOOO(OooO0oO.OooOo.OooOoO0("AesGcm Parameters (variant: ", String.valueOf(this.f25789OooO0O0), ", 12-byte IV, 16-byte tag, and "), this.f25788OooO00o, "-byte key)");
    }
}

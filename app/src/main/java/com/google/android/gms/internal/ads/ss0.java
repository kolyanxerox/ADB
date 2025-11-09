package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ss0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final tr0 f24154OooO00o;

    public ss0(tr0 tr0Var) {
        this.f24154OooO00o = tr0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f24154OooO00o != tr0.f24494OooOooo;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ss0) && ((ss0) obj).f24154OooO00o == this.f24154OooO00o;
    }

    public final int hashCode() {
        return Objects.hash(ss0.class, this.f24154OooO00o);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOO0O("XChaCha20Poly1305 Parameters (variant: ", this.f24154OooO00o.f24496OooOo0o, ")");
    }
}

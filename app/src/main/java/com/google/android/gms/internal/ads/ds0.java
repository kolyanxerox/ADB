package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ds0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final pr0 f18405OooO00o;

    public ds0(pr0 pr0Var) {
        this.f18405OooO00o = pr0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f18405OooO00o != pr0.f23415OooO0oo;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ds0) && ((ds0) obj).f18405OooO00o == this.f18405OooO00o;
    }

    public final int hashCode() {
        return Objects.hash(ds0.class, this.f18405OooO00o);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOO0O("ChaCha20Poly1305 Parameters (variant: ", this.f18405OooO00o.f23418OooO0O0, ")");
    }
}

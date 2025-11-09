package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ps0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final pr0 f23424OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f23425OooO0O0;

    public ps0(pr0 pr0Var, int i) {
        this.f23424OooO00o = pr0Var;
        this.f23425OooO0O0 = i;
    }

    public static ps0 OooO0O0(pr0 pr0Var, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new ps0(pr0Var, i);
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f23424OooO00o != pr0.f23416OooOO0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ps0)) {
            return false;
        }
        ps0 ps0Var = (ps0) obj;
        return ps0Var.f23424OooO00o == this.f23424OooO00o && ps0Var.f23425OooO0O0 == this.f23425OooO0O0;
    }

    public final int hashCode() {
        return Objects.hash(ps0.class, this.f23424OooO00o, Integer.valueOf(this.f23425OooO0O0));
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOOO(OooO0oO.OooOo.OooOoO0("X-AES-GCM Parameters (variant: ", this.f23424OooO00o.f23418OooO0O0, "salt_size_bytes: "), this.f23425OooO0O0, ")");
    }
}

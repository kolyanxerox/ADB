package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class is0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f20114OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final tr0 f20115OooO0O0;

    public is0(String str, tr0 tr0Var) {
        this.f20114OooO00o = str;
        this.f20115OooO0O0 = tr0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f20115OooO0O0 != tr0.f24492OooOoo0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof is0)) {
            return false;
        }
        is0 is0Var = (is0) obj;
        return is0Var.f20114OooO00o.equals(this.f20114OooO00o) && is0Var.f20115OooO0O0.equals(this.f20115OooO0O0);
    }

    public final int hashCode() {
        return Objects.hash(is0.class, this.f20114OooO00o, this.f20115OooO0O0);
    }

    public final String toString() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder("LegacyKmsAead Parameters (keyUri: "), this.f20114OooO00o, ", variant: ", this.f20115OooO0O0.f24496OooOo0o, ")");
    }
}

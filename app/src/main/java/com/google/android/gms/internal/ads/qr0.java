package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class qr0 extends gr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f23683OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f23684OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f23685OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f23686OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final or0 f23687OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final pr0 f23688OooO0o0;

    public qr0(int i, int i2, int i3, int i4, pr0 pr0Var, or0 or0Var) {
        this.f23683OooO00o = i;
        this.f23684OooO0O0 = i2;
        this.f23685OooO0OO = i3;
        this.f23686OooO0Oo = i4;
        this.f23688OooO0o0 = pr0Var;
        this.f23687OooO0o = or0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f23688OooO0o0 != pr0.f23413OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qr0)) {
            return false;
        }
        qr0 qr0Var = (qr0) obj;
        return qr0Var.f23683OooO00o == this.f23683OooO00o && qr0Var.f23684OooO0O0 == this.f23684OooO0O0 && qr0Var.f23685OooO0OO == this.f23685OooO0OO && qr0Var.f23686OooO0Oo == this.f23686OooO0Oo && qr0Var.f23688OooO0o0 == this.f23688OooO0o0 && qr0Var.f23687OooO0o == this.f23687OooO0o;
    }

    public final int hashCode() {
        return Objects.hash(qr0.class, Integer.valueOf(this.f23683OooO00o), Integer.valueOf(this.f23684OooO0O0), Integer.valueOf(this.f23685OooO0OO), Integer.valueOf(this.f23686OooO0Oo), this.f23688OooO0o0, this.f23687OooO0o);
    }

    public final String toString() {
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.f23688OooO0o0), ", hashType: ", String.valueOf(this.f23687OooO0o), ", ");
        sbOooOOo0.append(this.f23685OooO0OO);
        sbOooOOo0.append("-byte IV, and ");
        sbOooOOo0.append(this.f23686OooO0Oo);
        sbOooOOo0.append("-byte tags, and ");
        sbOooOOo0.append(this.f23683OooO00o);
        sbOooOOo0.append("-byte AES key, and ");
        return OooO0oO.OooOo.OooOOO(sbOooOOo0, this.f23684OooO0O0, "-byte HMAC key)");
    }
}

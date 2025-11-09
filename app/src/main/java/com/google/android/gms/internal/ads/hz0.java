package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class hz0 extends jz0 {

    /* renamed from: OooOo */
    public final byte[] f19882OooOo;

    public hz0(byte[] bArr) {
        bArr.getClass();
        this.f19882OooOo = bArr;
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public byte OooO0o(int i) {
        return this.f19882OooOo[i];
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public byte OooO0oO(int i) {
        return this.f19882OooOo[i];
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public int OooOO0() {
        return this.f19882OooOo.length;
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public void OooOO0O(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f19882OooOo, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final int OooOO0o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final int OooOOO(int i, int i2, int i3) {
        int iOooOo0o = OooOo0o() + i2;
        Charset charset = i01.f19888OooO00o;
        for (int i4 = iOooOo0o; i4 < iOooOo0o + i3; i4++) {
            i = (i * 31) + this.f19882OooOo[i4];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final boolean OooOOO0() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final jz0 OooOOOO(int i, int i2) {
        int iOooOOo = jz0.OooOOo(i, i2, OooOO0());
        if (iOooOOo == 0) {
            return jz0.f20406OooOo0o;
        }
        return new gz0(this.f19882OooOo, OooOo0o() + i, iOooOOo);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final nz0 OooOOOo() {
        return nz0.OooOooo(this.f19882OooOo, OooOo0o(), OooOO0());
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final void OooOOo0(rz0 rz0Var) {
        rz0Var.OooOOo0(this.f19882OooOo, OooOo0o(), OooOO0());
    }

    public final boolean OooOo(hz0 hz0Var, int i, int i2) {
        if (i2 > hz0Var.OooOO0()) {
            throw new IllegalArgumentException("Length too large: " + i2 + OooOO0());
        }
        if (i + i2 > hz0Var.OooOO0()) {
            int iOooOO0 = hz0Var.OooOO0();
            StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("Ran off end of other: ", i, ", ", i2, ", ");
            sbOooOo0o.append(iOooOO0);
            throw new IllegalArgumentException(sbOooOo0o.toString());
        }
        int iOooOo0o = OooOo0o() + i2;
        int iOooOo0o2 = OooOo0o();
        int iOooOo0o3 = hz0Var.OooOo0o() + i;
        while (iOooOo0o2 < iOooOo0o) {
            if (this.f19882OooOo[iOooOo0o2] != hz0Var.f19882OooOo[iOooOo0o3]) {
                return false;
            }
            iOooOo0o2++;
            iOooOo0o3++;
        }
        return true;
    }

    public int OooOo0o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof jz0) && OooOO0() == ((jz0) obj).OooOO0()) {
            if (OooOO0() == 0) {
                return true;
            }
            if (!(obj instanceof hz0)) {
                return obj.equals(this);
            }
            hz0 hz0Var = (hz0) obj;
            int i = this.f20407OooOo0O;
            int i2 = hz0Var.f20407OooOo0O;
            if (i == 0 || i2 == 0 || i == i2) {
                return OooOo(hz0Var, 0, OooOO0());
            }
        }
        return false;
    }
}

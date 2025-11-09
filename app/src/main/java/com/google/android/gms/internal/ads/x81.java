package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x81 implements zm0 {

    /* renamed from: OooOo */
    public final s91 f25565OooOo;

    /* renamed from: OooOo0O */
    public final zm0 f25566OooOo0O;

    /* renamed from: OooOo0o */
    public final int f25567OooOo0o;

    /* renamed from: OooOoO */
    public int f25568OooOoO;

    /* renamed from: OooOoO0 */
    public final byte[] f25569OooOoO0;

    public x81(zm0 zm0Var, int i, s91 s91Var) {
        af0.OoooO0(i > 0);
        this.f25566OooOo0O = zm0Var;
        this.f25567OooOo0o = i;
        this.f25565OooOo = s91Var;
        this.f25569OooOoO0 = new byte[1];
        this.f25568OooOoO = i;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void OooO0oo(e01 e01Var) {
        e01Var.getClass();
        this.f25566OooOo0O.OooO0oo(e01Var);
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) {
        int i3 = this.f25568OooOoO;
        zm0 zm0Var = this.f25566OooOo0O;
        if (i3 == 0) {
            byte[] bArr2 = this.f25569OooOoO0;
            int i4 = 0;
            if (zm0Var.OooOO0(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iOooOO0 = zm0Var.OooOO0(bArr3, i4, i6);
                        if (iOooOO0 != -1) {
                            i4 += iOooOO0;
                            i6 -= iOooOO0;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        r40 r40Var = new r40(bArr3, i5);
                        s91 s91Var = this.f25565OooOo;
                        long jMax = !s91Var.OooOO0o ? s91Var.f24039OooO : Math.max(s91Var.f24050OooOOO0.OooOOO(true), s91Var.f24039OooO);
                        int iOooOOOO = r40Var.OooOOOO();
                        o000O o000o = s91Var.f24049OooOO0O;
                        o000o.getClass();
                        o000o.OooO0Oo(iOooOOOO, r40Var);
                        o000o.OooO00o(jMax, 1, iOooOOOO, 0, null);
                        s91Var.OooOO0o = true;
                    }
                }
                i3 = this.f25567OooOo0o;
                this.f25568OooOoO = i3;
            }
            return -1;
        }
        int iOooOO02 = zm0Var.OooOO0(bArr, i, Math.min(i3, i2));
        if (iOooOO02 != -1) {
            this.f25568OooOoO -= iOooOO02;
        }
        return iOooOO02;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f25566OooOo0O.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Map zze() {
        return this.f25566OooOo0O.zze();
    }
}

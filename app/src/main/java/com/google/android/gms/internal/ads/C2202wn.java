package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wn */
/* loaded from: classes2.dex */
public final class C2202wn implements zm0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final zm0 f25333OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final mk0 f25334OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final long f25335OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public Uri f25336OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f25337OooOoO0;

    public C2202wn(mk0 mk0Var, int i, zm0 zm0Var) {
        this.f25334OooOo0O = mk0Var;
        this.f25335OooOo0o = i;
        this.f25333OooOo = zm0Var;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) {
        iq0 iq0Var2;
        this.f25336OooOoO = iq0Var.f20087OooO00o;
        long j = iq0Var.f20089OooO0OO;
        long j2 = this.f25335OooOo0o;
        iq0 iq0Var3 = null;
        long j3 = iq0Var.f20090OooO0Oo;
        if (j >= j2) {
            iq0Var2 = null;
        } else {
            long jMin = j2 - j;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            iq0Var2 = new iq0(iq0Var.f20087OooO00o, j, jMin);
        }
        long j4 = iq0Var.f20089OooO0OO;
        if (j3 == -1 || j4 + j3 > j2) {
            iq0Var3 = new iq0(iq0Var.f20087OooO00o, Math.max(j2, j4), j3 != -1 ? Math.min(j3, (j4 + j3) - j2) : -1L);
        }
        long jOooO0Oo = iq0Var2 != null ? this.f25334OooOo0O.OooO0Oo(iq0Var2) : 0L;
        long jOooO0Oo2 = iq0Var3 != null ? this.f25333OooOo.OooO0Oo(iq0Var3) : 0L;
        this.f25337OooOoO0 = j4;
        if (jOooO0Oo == -1 || jOooO0Oo2 == -1) {
            return -1L;
        }
        return jOooO0Oo + jOooO0Oo2;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void OooO0oo(e01 e01Var) {
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f25337OooOoO0;
        long j2 = this.f25335OooOo0o;
        if (j < j2) {
            int iOooOO0 = this.f25334OooOo0O.OooOO0(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.f25337OooOoO0 + iOooOO0;
            this.f25337OooOoO0 = j3;
            i3 = iOooOO0;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int iOooOO02 = this.f25333OooOo.OooOO0(bArr, i + i3, i2 - i3);
        int i4 = i3 + iOooOO02;
        this.f25337OooOoO0 += iOooOO02;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f25336OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        this.f25334OooOo0O.zzd();
        this.f25333OooOo.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Map zze() {
        return mn0.f21307OooOoo0;
    }
}

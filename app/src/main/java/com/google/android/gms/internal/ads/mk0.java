package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class mk0 extends rj0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public Uri f21262OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public byte[] f21263OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public int f21264OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f21265OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f21266OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final rh0 f21267OooOooo;

    public mk0(byte[] bArr) {
        rh0 rh0Var = new rh0(bArr);
        super(false);
        this.f21267OooOooo = rh0Var;
        af0.OoooO0(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) throws hn0 {
        OooO0oO(iq0Var);
        this.f21262OooOoO = iq0Var.f20087OooO00o;
        byte[] bArr = (byte[]) this.f21267OooOooo.f23865OooOo0O;
        this.f21263OooOoOO = bArr;
        int length = bArr.length;
        long j = length;
        long j2 = iq0Var.f20089OooO0OO;
        if (j2 > j) {
            throw new hn0();
        }
        int i = (int) j2;
        this.f21265OooOoo0 = i;
        int i2 = length - i;
        this.f21264OooOoo = i2;
        long j3 = iq0Var.f20090OooO0Oo;
        if (j3 != -1) {
            this.f21264OooOoo = (int) Math.min(i2, j3);
        }
        this.f21266OooOooO = true;
        OooO(iq0Var);
        return j3 != -1 ? j3 : this.f21264OooOoo;
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f21264OooOoo;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f21263OooOoOO;
        af0.OooOo0O(bArr2);
        System.arraycopy(bArr2, this.f21265OooOoo0, bArr, i, iMin);
        this.f21265OooOoo0 += iMin;
        this.f21264OooOoo -= iMin;
        OooO00o(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f21262OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        if (this.f21266OooOooO) {
            this.f21266OooOooO = false;
            OooO0OO();
        }
        this.f21262OooOoO = null;
        this.f21263OooOoOO = null;
    }
}

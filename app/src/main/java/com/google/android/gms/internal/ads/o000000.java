package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o000000 implements o00000OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final long f21646OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final zm0 f21648OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f21650OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f21651OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f21652OooOoo0;

    /* renamed from: OooOoO, reason: collision with root package name */
    public byte[] f21649OooOoO = new byte[65536];

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final byte[] f21647OooOo0O = new byte[4096];

    static {
        AbstractC2030s.OooO00o("media3.extractor");
    }

    public o000000(zm0 zm0Var, long j, long j2) {
        this.f21648OooOo0o = zm0Var;
        this.f21650OooOoO0 = j;
        this.f21646OooOo = j2;
    }

    public final void OooO(int i) {
        int iMin = Math.min(this.f21652OooOoo0, i);
        OooOOOO(iMin);
        int iOooOOO0 = iMin;
        while (iOooOOO0 < i && iOooOOO0 != -1) {
            iOooOOO0 = OooOOO0(this.f21647OooOo0O, -iOooOOO0, Math.min(i, iOooOOO0 + 4096), iOooOOO0, false);
        }
        if (iOooOOO0 != -1) {
            this.f21650OooOoO0 += iOooOOO0;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final void OooO00o(int i) throws EOFException, InterruptedIOException {
        OooO0oO(i, false);
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final void OooO0O0(int i) {
        OooO(i);
    }

    public final int OooO0OO(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        o000000 o000000Var;
        int iMin;
        OooOOO(i2);
        int i3 = this.f21652OooOoo0;
        int i4 = this.f21651OooOoOO;
        int i5 = i3 - i4;
        if (i5 == 0) {
            o000000Var = this;
            iMin = o000000Var.OooOOO0(this.f21649OooOoO, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            o000000Var.f21652OooOoo0 += iMin;
        } else {
            o000000Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(o000000Var.f21649OooOoO, o000000Var.f21651OooOoOO, bArr, i, iMin);
        o000000Var.f21651OooOoOO += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final boolean OooO0o(byte[] bArr, int i, int i2, boolean z) {
        if (!OooO0oO(i2, z)) {
            return false;
        }
        System.arraycopy(this.f21649OooOoO, this.f21651OooOoOO - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final boolean OooO0o0(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f21652OooOoo0;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f21649OooOoO, 0, bArr, i, iMin);
            OooOOOO(iMin);
        }
        int iOooOOO0 = iMin;
        while (iOooOOO0 < i2 && iOooOOO0 != -1) {
            iOooOOO0 = OooOOO0(bArr, i, i2, iOooOOO0, z);
        }
        if (iOooOOO0 != -1) {
            this.f21650OooOoO0 += iOooOOO0;
        }
        return iOooOOO0 != -1;
    }

    public final boolean OooO0oO(int i, boolean z) throws EOFException, InterruptedIOException {
        OooOOO(i);
        int iOooOOO0 = this.f21652OooOoo0 - this.f21651OooOoOO;
        while (iOooOOO0 < i) {
            int i2 = i;
            boolean z2 = z;
            iOooOOO0 = OooOOO0(this.f21649OooOoO, this.f21651OooOoOO, i2, iOooOOO0, z2);
            if (iOooOOO0 == -1) {
                return false;
            }
            this.f21652OooOoo0 = this.f21651OooOoOO + iOooOOO0;
            i = i2;
            z = z2;
        }
        this.f21651OooOoOO += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        o000000 o000000Var;
        int i3 = this.f21652OooOoo0;
        int iOooOOO0 = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f21649OooOoO, 0, bArr, i, iMin);
            OooOOOO(iMin);
            iOooOOO0 = iMin;
        }
        if (iOooOOO0 == 0) {
            o000000Var = this;
            iOooOOO0 = o000000Var.OooOOO0(bArr, i, i2, 0, true);
        } else {
            o000000Var = this;
        }
        if (iOooOOO0 != -1) {
            o000000Var.f21650OooOoO0 += iOooOOO0;
        }
        return iOooOOO0;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final void OooOO0O(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        OooO0o0(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final void OooOO0o(byte[] bArr, int i, int i2) {
        OooO0o(bArr, i, i2, false);
    }

    public final void OooOOO(int i) {
        int i2 = this.f21651OooOoOO + i;
        int length = this.f21649OooOoO.length;
        if (i2 > length) {
            this.f21649OooOoO = Arrays.copyOf(this.f21649OooOoO, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    public final int OooOOO0(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iOooOO0 = this.f21648OooOo0o.OooOO0(bArr, i + i3, i2 - i3);
        if (iOooOO0 != -1) {
            return i3 + iOooOO0;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void OooOOOO(int i) {
        int i2 = this.f21652OooOoo0 - i;
        this.f21652OooOoo0 = i2;
        this.f21651OooOoOO = 0;
        byte[] bArr = this.f21649OooOoO;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f21649OooOoO = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final long zzd() {
        return this.f21646OooOo;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final long zze() {
        return this.f21650OooOoO0 + this.f21651OooOoOO;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final long zzf() {
        return this.f21650OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.o00000OO
    public final void zzj() {
        this.f21651OooOoOO = 0;
    }
}

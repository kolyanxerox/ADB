package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.nz0;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class OooOOO extends nz0 {

    /* renamed from: OooO */
    public int f28017OooO = Integer.MAX_VALUE;

    /* renamed from: OooO0OO */
    public final byte[] f28018OooO0OO;

    /* renamed from: OooO0Oo */
    public int f28019OooO0Oo;

    /* renamed from: OooO0o */
    public int f28020OooO0o;

    /* renamed from: OooO0o0 */
    public int f28021OooO0o0;

    /* renamed from: OooO0oO */
    public final int f28022OooO0oO;

    /* renamed from: OooO0oo */
    public int f28023OooO0oo;

    public OooOOO(byte[] bArr, int i, int i2, boolean z) {
        this.f28018OooO0OO = bArr;
        this.f28019OooO0Oo = i2 + i;
        this.f28020OooO0o = i;
        this.f28022OooO0oO = i;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooO() {
        return OooooO0() != 0;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OooO00o(int i) throws o000OOo {
        if (this.f28023OooO0oo != i) {
            throw new o000OOo("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooO0Oo() {
        return this.f28020OooO0o - this.f28022OooO0oO;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooO0o0() {
        return this.f28020OooO0o == this.f28019OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OooO0oO(int i) {
        this.f28017OooO = i;
        OooooOo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooO0oo(int i) {
        if (i < 0) {
            throw o000OOo.OooO0o();
        }
        int iOooO0Oo = OooO0Oo() + i;
        if (iOooO0Oo < 0) {
            throw o000OOo.OooO0oO();
        }
        int i2 = this.f28017OooO;
        if (iOooO0Oo > i2) {
            throw o000OOo.OooO0oo();
        }
        this.f28017OooO = iOooO0Oo;
        OooooOo();
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    @Override // com.google.android.gms.internal.ads.nz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.crypto.tink.shaded.protobuf.OooOO0O OooOO0() throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        /*
            r4 = this;
            int r0 = r4.Ooooo0o()
            byte[] r1 = r4.f28018OooO0OO
            if (r0 <= 0) goto L19
            int r2 = r4.f28019OooO0Oo
            int r3 = r4.f28020OooO0o
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.google.crypto.tink.shaded.protobuf.OooOO0O r1 = com.google.crypto.tink.shaded.protobuf.OooOOO0.OooO0oO(r1, r3, r0)
            int r2 = r4.f28020OooO0o
            int r2 = r2 + r0
            r4.f28020OooO0o = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.OooOO0O r0 = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f28019OooO0Oo
            int r3 = r4.f28020OooO0o
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f28020OooO0o = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.oo0o0Oo.f28135OooO0O0
        L35:
            com.google.crypto.tink.shaded.protobuf.OooOO0O r1 = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o
            com.google.crypto.tink.shaded.protobuf.OooOO0O r1 = new com.google.crypto.tink.shaded.protobuf.OooOO0O
            r1.<init>(r0)
            return r1
        L3d:
            com.google.crypto.tink.shaded.protobuf.o000OOo r0 = com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0o()
            throw r0
        L42:
            com.google.crypto.tink.shaded.protobuf.o000OOo r0 = com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oo()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.OooOOO.OooOO0():com.google.crypto.tink.shaded.protobuf.OooOO0O");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final double OooOO0O() {
        return Double.longBitsToDouble(Ooooo00());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOO0o() {
        return Ooooo0o();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOOO() {
        return Ooooo00();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOOO0() {
        return OoooOoo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final float OooOOOO() {
        return Float.intBitsToFloat(OoooOoo());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOOOo() {
        return Ooooo0o();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOOo() {
        return OoooOoo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOOo0() {
        return OooooO0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOOoo() {
        return Ooooo00();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOo() throws o000OOo {
        if (OooO0o0()) {
            this.f28023OooO0oo = 0;
            return 0;
        }
        int iOoooo0o = Ooooo0o();
        this.f28023OooO0oo = iOoooo0o;
        if ((iOoooo0o >>> 3) != 0) {
            return iOoooo0o;
        }
        throw o000OOo.OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOo0() {
        return nz0.OooO0OO(OooooO0());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOo00() {
        return nz0.OooO0O0(Ooooo0o());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OooOo0O() throws o000OOo {
        int iOoooo0o = Ooooo0o();
        if (iOoooo0o > 0) {
            int i = this.f28019OooO0Oo;
            int i2 = this.f28020OooO0o;
            if (iOoooo0o <= i - i2) {
                String str = new String(this.f28018OooO0OO, i2, iOoooo0o, oo0o0Oo.f28134OooO00o);
                this.f28020OooO0o += iOoooo0o;
                return str;
            }
        }
        if (iOoooo0o == 0) {
            return "";
        }
        if (iOoooo0o < 0) {
            throw o000OOo.OooO0o();
        }
        throw o000OOo.OooO0oo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OooOo0o() throws o000OOo {
        int iOoooo0o = Ooooo0o();
        if (iOoooo0o > 0) {
            int i = this.f28019OooO0Oo;
            int i2 = this.f28020OooO0o;
            if (iOoooo0o <= i - i2) {
                String strOooOOO = oo00o.f28133OooO00o.OooOOO(this.f28018OooO0OO, i2, iOoooo0o);
                this.f28020OooO0o += iOoooo0o;
                return strOooOOO;
            }
        }
        if (iOoooo0o == 0) {
            return "";
        }
        if (iOoooo0o <= 0) {
            throw o000OOo.OooO0o();
        }
        throw o000OOo.OooO0oo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOoO() {
        return OooooO0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOoO0() {
        return Ooooo0o();
    }

    public final int OoooOoo() throws o000OOo {
        int i = this.f28020OooO0o;
        if (this.f28019OooO0Oo - i < 4) {
            throw o000OOo.OooO0oo();
        }
        this.f28020OooO0o = i + 4;
        byte[] bArr = this.f28018OooO0OO;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (bArr[i] & ForkServer.ERROR) | ((bArr[i + 1] & ForkServer.ERROR) << 8) | ((bArr[i + 2] & ForkServer.ERROR) << 16);
    }

    public final long Ooooo00() throws o000OOo {
        int i = this.f28020OooO0o;
        if (this.f28019OooO0Oo - i < 8) {
            throw o000OOo.OooO0oo();
        }
        this.f28020OooO0o = i + 8;
        byte[] bArr = this.f28018OooO0OO;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int Ooooo0o() {
        int i;
        int i2 = this.f28020OooO0o;
        int i3 = this.f28019OooO0Oo;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f28018OooO0OO;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f28020OooO0o = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f28020OooO0o = i5;
                return i;
            }
        }
        return (int) OooooOO();
    }

    public final long OooooO0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f28020OooO0o;
        int i2 = this.f28019OooO0Oo;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f28018OooO0OO;
            byte b = bArr[i];
            if (b >= 0) {
                this.f28020OooO0o = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f28020OooO0o = i4;
                return j;
            }
        }
        return OooooOO();
    }

    public final long OooooOO() throws o000OOo {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f28020OooO0o;
            if (i2 == this.f28019OooO0Oo) {
                throw o000OOo.OooO0oo();
            }
            this.f28020OooO0o = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.f28018OooO0OO[i2] & 128) == 0) {
                return j;
            }
        }
        throw o000OOo.OooO0o0();
    }

    public final void OooooOo() {
        int i = this.f28019OooO0Oo + this.f28021OooO0o0;
        this.f28019OooO0Oo = i;
        int i2 = i - this.f28022OooO0oO;
        int i3 = this.f28017OooO;
        if (i2 <= i3) {
            this.f28021OooO0o0 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f28021OooO0o0 = i4;
        this.f28019OooO0Oo = i - i4;
    }
}

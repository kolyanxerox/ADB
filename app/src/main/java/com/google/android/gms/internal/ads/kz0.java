package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class kz0 extends nz0 {

    /* renamed from: OooO */
    public int f20715OooO = Integer.MAX_VALUE;

    /* renamed from: OooO0OO */
    public final byte[] f20716OooO0OO;

    /* renamed from: OooO0Oo */
    public int f20717OooO0Oo;

    /* renamed from: OooO0o */
    public int f20718OooO0o;

    /* renamed from: OooO0o0 */
    public int f20719OooO0o0;

    /* renamed from: OooO0oO */
    public final int f20720OooO0oO;

    /* renamed from: OooO0oo */
    public int f20721OooO0oo;

    public /* synthetic */ kz0(byte[] bArr, int i, int i2) {
        this.f20716OooO0OO = bArr;
        this.f20717OooO0Oo = i2 + i;
        this.f20718OooO0o = i;
        this.f20720OooO0oO = i;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooOoOO() {
        return this.f20718OooO0o == this.f20717OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooOoo0() {
        return OooooOO() != 0;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo() {
        return Ooooo0o();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0(int i) throws k01 {
        if (i < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = (this.f20718OooO0o - this.f20720OooO0oO) + i;
        if (i2 < 0) {
            throw new k01("Failed to parse the message.");
        }
        int i3 = this.f20715OooO;
        if (i2 > i3) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f20715OooO = i2;
        OoooOoo();
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final double Oooo000() {
        return Double.longBitsToDouble(OooooO0());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final float Oooo00O() {
        return Float.intBitsToFloat(Ooooo00());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo00o() {
        return this.f20718OooO0o - this.f20720OooO0oO;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0O0() {
        return Ooooo0o();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0OO() {
        return Ooooo00();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0o() {
        return Ooooo00();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0o0() {
        return Ooooo0o();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0oO() {
        return nz0.OooOoo(Ooooo0o());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0oo() throws k01 {
        if (OooOoOO()) {
            this.f20721OooO0oo = 0;
            return 0;
        }
        int iOoooo0o = Ooooo0o();
        this.f20721OooO0oo = iOoooo0o;
        if ((iOoooo0o >>> 3) != 0) {
            return iOoooo0o;
        }
        throw new k01("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO() {
        return nz0.OooOooO(OooooOO());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO0() {
        return OooooOO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO00() {
        return OooooO0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO0O() {
        return OooooO0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooOO0() {
        return OooooOO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OoooOOO() throws k01 {
        int iOoooo0o = Ooooo0o();
        if (iOoooo0o > 0) {
            int i = this.f20717OooO0Oo;
            int i2 = this.f20718OooO0o;
            if (iOoooo0o <= i - i2) {
                String str = new String(this.f20716OooO0OO, i2, iOoooo0o, i01.f19888OooO00o);
                this.f20718OooO0o += iOoooo0o;
                return str;
            }
        }
        if (iOoooo0o == 0) {
            return "";
        }
        if (iOoooo0o < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OoooOOo() throws k01 {
        int iOoooo0o = Ooooo0o();
        if (iOoooo0o > 0) {
            int i = this.f20717OooO0Oo;
            int i2 = this.f20718OooO0o;
            if (iOoooo0o <= i - i2) {
                s11.f23974OooO00o.getClass();
                String strOooO = qv0.OooO(this.f20716OooO0OO, i2, iOoooo0o);
                this.f20718OooO0o += iOoooo0o;
                return strOooO;
            }
        }
        if (iOoooo0o == 0) {
            return "";
        }
        if (iOoooo0o <= 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OoooOo0() throws k01 {
        if (this.f20721OooO0oo != 0) {
            throw new k01("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OoooOoO(int i) {
        this.f20715OooO = i;
        OoooOoo();
    }

    public final void OoooOoo() {
        int i = this.f20717OooO0Oo + this.f20719OooO0o0;
        this.f20717OooO0Oo = i;
        int i2 = i - this.f20720OooO0oO;
        int i3 = this.f20715OooO;
        if (i2 <= i3) {
            this.f20719OooO0o0 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f20719OooO0o0 = i4;
        this.f20717OooO0Oo = i - i4;
    }

    public final int Ooooo00() throws k01 {
        int i = this.f20718OooO0o;
        if (this.f20717OooO0Oo - i < 4) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f20718OooO0o = i + 4;
        byte[] bArr = this.f20716OooO0OO;
        int i2 = bArr[i] & ForkServer.ERROR;
        int i3 = bArr[i + 1] & ForkServer.ERROR;
        int i4 = bArr[i + 2] & ForkServer.ERROR;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final int Ooooo0o() {
        int i;
        int i2 = this.f20718OooO0o;
        int i3 = this.f20717OooO0Oo;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f20716OooO0OO;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f20718OooO0o = i4;
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
                this.f20718OooO0o = i5;
                return i;
            }
        }
        return (int) OooooOo();
    }

    public final long OooooO0() throws k01 {
        int i = this.f20718OooO0o;
        if (this.f20717OooO0Oo - i < 8) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f20718OooO0o = i + 8;
        byte[] bArr = this.f20716OooO0OO;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public final long OooooOO() {
        long j;
        long j2;
        long j3;
        int i = this.f20718OooO0o;
        int i2 = this.f20717OooO0Oo;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f20716OooO0OO;
            byte b = bArr[i];
            if (b >= 0) {
                this.f20718OooO0o = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = i9 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i6] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i6] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i6] >= 0) {
                                                    j = j7;
                                                    i4 = i11;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                                i4 = i10;
                            }
                            j = j5 ^ j3;
                        }
                    }
                    i4 = i6;
                }
                this.f20718OooO0o = i4;
                return j;
            }
        }
        return OooooOo();
    }

    public final long OooooOo() throws k01 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f20718OooO0o;
            if (i2 == this.f20717OooO0Oo) {
                throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f20718OooO0o = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.f20716OooO0OO[i2] & 128) == 0) {
                return j;
            }
        }
        throw new k01("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final hz0 o000oOoO() throws k01 {
        int iOoooo0o = Ooooo0o();
        byte[] bArr = this.f20716OooO0OO;
        if (iOoooo0o > 0) {
            int i = this.f20717OooO0Oo;
            int i2 = this.f20718OooO0o;
            if (iOoooo0o <= i - i2) {
                hz0 hz0VarOooOo0 = jz0.OooOo0(bArr, i2, iOoooo0o);
                this.f20718OooO0o += iOoooo0o;
                return hz0VarOooOo0;
            }
        }
        if (iOoooo0o == 0) {
            return jz0.f20406OooOo0o;
        }
        if (iOoooo0o > 0) {
            int i3 = this.f20717OooO0Oo;
            int i4 = this.f20718OooO0o;
            if (iOoooo0o <= i3 - i4) {
                int i5 = iOoooo0o + i4;
                this.f20718OooO0o = i5;
                return new hz0(Arrays.copyOfRange(bArr, i4, i5));
            }
        }
        if (iOoooo0o <= 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

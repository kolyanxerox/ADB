package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class lz0 extends nz0 {

    /* renamed from: OooO0OO */
    public final Iterator f20988OooO0OO;

    /* renamed from: OooO0Oo */
    public ByteBuffer f20989OooO0Oo;

    /* renamed from: OooO0o */
    public int f20990OooO0o;

    /* renamed from: OooO0o0 */
    public int f20991OooO0o0;

    /* renamed from: OooO0oo */
    public int f20993OooO0oo;

    /* renamed from: OooOO0 */
    public long f20994OooOO0;

    /* renamed from: OooOO0O */
    public long f20995OooOO0O;
    public long OooOO0o;

    /* renamed from: OooO0oO */
    public int f20992OooO0oO = Integer.MAX_VALUE;

    /* renamed from: OooO */
    public int f20987OooO = 0;

    public /* synthetic */ lz0(int i, ArrayList arrayList) {
        this.f20991OooO0o0 = i;
        this.f20988OooO0OO = arrayList.iterator();
        if (i != 0) {
            OooooO0();
            return;
        }
        this.f20989OooO0Oo = i01.f19890OooO0OO;
        this.f20994OooOO0 = 0L;
        this.f20995OooOO0O = 0L;
        this.OooOO0o = 0L;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooOoOO() {
        return (((long) this.f20987OooO) + this.f20994OooOO0) - this.f20995OooOO0O == ((long) this.f20991OooO0o0);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooOoo0() {
        return OoooooO() != 0;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo() {
        return Oooooo0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0(int i) throws k01 {
        if (i < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iOooo00o = Oooo00o() + i;
        int i2 = this.f20992OooO0oO;
        if (iOooo00o > i2) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f20992OooO0oO = iOooo00o;
        int i3 = this.f20991OooO0o0 + this.f20990OooO0o;
        this.f20991OooO0o0 = i3;
        if (i3 <= iOooo00o) {
            this.f20990OooO0o = 0;
            return i2;
        }
        int i4 = i3 - iOooo00o;
        this.f20990OooO0o = i4;
        this.f20991OooO0o0 = i3 - i4;
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final double Oooo000() {
        return Double.longBitsToDouble(Oooooo());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final float Oooo00O() {
        return Float.intBitsToFloat(OooooOo());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo00o() {
        return (int) ((this.f20987OooO + this.f20994OooOO0) - this.f20995OooOO0O);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0O0() {
        return Oooooo0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0OO() {
        return OooooOo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0o() {
        return OooooOo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0o0() {
        return Oooooo0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0oO() {
        return nz0.OooOoo(Oooooo0());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0oo() throws k01 {
        if (OooOoOO()) {
            this.f20993OooO0oo = 0;
            return 0;
        }
        int iOooooo0 = Oooooo0();
        this.f20993OooO0oo = iOooooo0;
        if ((iOooooo0 >>> 3) != 0) {
            return iOooooo0;
        }
        throw new k01("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO() {
        return nz0.OooOooO(OoooooO());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO0() {
        return OoooooO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO00() {
        return Oooooo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO0O() {
        return Oooooo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooOO0() {
        return OoooooO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OoooOOO() throws k01 {
        int iOooooo0 = Oooooo0();
        if (iOooooo0 > 0) {
            long j = this.OooOO0o;
            long j2 = this.f20994OooOO0;
            long j3 = iOooooo0;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iOooooo0];
                q11.f23482OooO0OO.o000000O(j2, bArr, 0L, j3);
                String str = new String(bArr, i01.f19888OooO00o);
                this.f20994OooOO0 += j3;
                return str;
            }
        }
        if (iOooooo0 > 0 && iOooooo0 <= Ooooo00()) {
            byte[] bArr2 = new byte[iOooooo0];
            Ooooo0o(iOooooo0, bArr2);
            return new String(bArr2, i01.f19888OooO00o);
        }
        if (iOooooo0 == 0) {
            return "";
        }
        if (iOooooo0 < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OoooOOo() throws k01 {
        String strOooOO0;
        int iOooooo0 = Oooooo0();
        if (iOooooo0 > 0) {
            long j = this.OooOO0o;
            long j2 = this.f20994OooOO0;
            long j3 = iOooooo0;
            if (j3 <= j - j2) {
                long j4 = j2 - this.f20995OooOO0O;
                ByteBuffer byteBuffer = this.f20989OooO0Oo;
                int i = (int) j4;
                qv0 qv0Var = s11.f23974OooO00o;
                if (byteBuffer.hasArray()) {
                    int iArrayOffset = byteBuffer.arrayOffset();
                    s11.f23974OooO00o.getClass();
                    strOooOO0 = qv0.OooO(byteBuffer.array(), iArrayOffset + i, iOooooo0);
                } else {
                    strOooOO0 = byteBuffer.isDirect() ? qv0.OooOO0(byteBuffer, i, iOooooo0) : qv0.OooOO0(byteBuffer, i, iOooooo0);
                }
                this.f20994OooOO0 += j3;
                return strOooOO0;
            }
        }
        if (iOooooo0 >= 0 && iOooooo0 <= Ooooo00()) {
            byte[] bArr = new byte[iOooooo0];
            Ooooo0o(iOooooo0, bArr);
            s11.f23974OooO00o.getClass();
            return qv0.OooO(bArr, 0, iOooooo0);
        }
        if (iOooooo0 == 0) {
            return "";
        }
        if (iOooooo0 <= 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OoooOo0() throws k01 {
        if (this.f20993OooO0oo != 0) {
            throw new k01("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OoooOoO(int i) {
        this.f20992OooO0oO = i;
        int i2 = this.f20991OooO0o0 + this.f20990OooO0o;
        this.f20991OooO0o0 = i2;
        if (i2 <= i) {
            this.f20990OooO0o = 0;
            return;
        }
        int i3 = i2 - i;
        this.f20990OooO0o = i3;
        this.f20991OooO0o0 = i2 - i3;
    }

    public final long OoooOoo() throws k01 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((OooooOO() & 128) == 0) {
                return j;
            }
        }
        throw new k01("CodedInputStream encountered a malformed varint.");
    }

    public final int Ooooo00() {
        return (int) (((this.f20991OooO0o0 - this.f20987OooO) - this.f20994OooOO0) + this.f20995OooOO0O);
    }

    public final void Ooooo0o(int i, byte[] bArr) throws k01 {
        if (i > Ooooo00()) {
            if (i > 0) {
                throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (this.OooOO0o - this.f20994OooOO0 == 0) {
                if (!this.f20988OooO0OO.hasNext()) {
                    throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                OooooO0();
            }
            int iMin = Math.min(i2, (int) (this.OooOO0o - this.f20994OooOO0));
            long j = iMin;
            byte[] bArr2 = bArr;
            q11.f23482OooO0OO.o000000O(this.f20994OooOO0, bArr2, i - i2, j);
            i2 -= iMin;
            this.f20994OooOO0 += j;
            bArr = bArr2;
        }
    }

    public final void OooooO0() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f20988OooO0OO.next();
        this.f20989OooO0Oo = byteBuffer;
        this.f20987OooO += (int) (this.f20994OooOO0 - this.f20995OooOO0O);
        long jPosition = byteBuffer.position();
        this.f20994OooOO0 = jPosition;
        this.f20995OooOO0O = jPosition;
        this.OooOO0o = this.f20989OooO0Oo.limit();
        long jOooO0o = q11.OooO0o(this.f20989OooO0Oo);
        this.f20994OooOO0 += jOooO0o;
        this.f20995OooOO0O += jOooO0o;
        this.OooOO0o += jOooO0o;
    }

    public final byte OooooOO() throws k01 {
        if (this.OooOO0o - this.f20994OooOO0 == 0) {
            if (!this.f20988OooO0OO.hasNext()) {
                throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            OooooO0();
        }
        long j = this.f20994OooOO0;
        this.f20994OooOO0 = 1 + j;
        return q11.f23482OooO0OO.o0Oo0oo(j);
    }

    public final int OooooOo() {
        long j = this.OooOO0o;
        long j2 = this.f20994OooOO0;
        if (j - j2 < 4) {
            int iOooooOO = OooooOO() & ForkServer.ERROR;
            int iOooooOO2 = (OooooOO() & ForkServer.ERROR) << 8;
            return iOooooOO | iOooooOO2 | ((OooooOO() & ForkServer.ERROR) << 16) | ((OooooOO() & ForkServer.ERROR) << 24);
        }
        this.f20994OooOO0 = 4 + j2;
        p11 p11Var = q11.f23482OooO0OO;
        int iO0Oo0oo = p11Var.o0Oo0oo(j2) & ForkServer.ERROR;
        int iO0Oo0oo2 = (p11Var.o0Oo0oo(1 + j2) & ForkServer.ERROR) << 8;
        return ((p11Var.o0Oo0oo(j2 + 3) & ForkServer.ERROR) << 24) | iO0Oo0oo | iO0Oo0oo2 | ((p11Var.o0Oo0oo(2 + j2) & ForkServer.ERROR) << 16);
    }

    public final long Oooooo() {
        long j = this.OooOO0o;
        long j2 = this.f20994OooOO0;
        if (j - j2 < 8) {
            return ((OooooOO() & 255) << 56) | (OooooOO() & 255) | ((OooooOO() & 255) << 8) | ((OooooOO() & 255) << 16) | ((OooooOO() & 255) << 24) | ((OooooOO() & 255) << 32) | ((OooooOO() & 255) << 40) | ((OooooOO() & 255) << 48);
        }
        this.f20994OooOO0 = 8 + j2;
        p11 p11Var = q11.f23482OooO0OO;
        return (p11Var.o0Oo0oo(j2) & 255) | ((p11Var.o0Oo0oo(j2 + 1) & 255) << 8) | ((p11Var.o0Oo0oo(j2 + 2) & 255) << 16) | ((p11Var.o0Oo0oo(j2 + 3) & 255) << 24) | ((p11Var.o0Oo0oo(j2 + 4) & 255) << 32) | ((p11Var.o0Oo0oo(j2 + 5) & 255) << 40) | ((p11Var.o0Oo0oo(j2 + 6) & 255) << 48) | ((p11Var.o0Oo0oo(j2 + 7) & 255) << 56);
    }

    public final int Oooooo0() {
        int i;
        long j = this.f20994OooOO0;
        if (this.OooOO0o != j) {
            long j2 = j + 1;
            p11 p11Var = q11.f23482OooO0OO;
            byte bO0Oo0oo = p11Var.o0Oo0oo(j);
            if (bO0Oo0oo >= 0) {
                this.f20994OooOO0++;
                return bO0Oo0oo;
            }
            if (this.OooOO0o - this.f20994OooOO0 >= 10) {
                long j3 = 2 + j;
                int iO0Oo0oo = (p11Var.o0Oo0oo(j2) << 7) ^ bO0Oo0oo;
                if (iO0Oo0oo < 0) {
                    i = iO0Oo0oo ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iO0Oo0oo2 = (p11Var.o0Oo0oo(j3) << 14) ^ iO0Oo0oo;
                    if (iO0Oo0oo2 >= 0) {
                        i = iO0Oo0oo2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iO0Oo0oo3 = iO0Oo0oo2 ^ (p11Var.o0Oo0oo(j4) << 21);
                        if (iO0Oo0oo3 < 0) {
                            i = (-2080896) ^ iO0Oo0oo3;
                        } else {
                            j4 = 5 + j;
                            byte bO0Oo0oo2 = p11Var.o0Oo0oo(j5);
                            int i2 = (iO0Oo0oo3 ^ (bO0Oo0oo2 << 28)) ^ 266354560;
                            if (bO0Oo0oo2 < 0) {
                                j5 = 6 + j;
                                if (p11Var.o0Oo0oo(j4) < 0) {
                                    j4 = 7 + j;
                                    if (p11Var.o0Oo0oo(j5) < 0) {
                                        j5 = 8 + j;
                                        if (p11Var.o0Oo0oo(j4) < 0) {
                                            j4 = 9 + j;
                                            if (p11Var.o0Oo0oo(j5) < 0) {
                                                long j6 = j + 10;
                                                if (p11Var.o0Oo0oo(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.f20994OooOO0 = j3;
                return i;
            }
        }
        return (int) OoooOoo();
    }

    public final long OoooooO() {
        long j;
        long j2;
        long j3;
        long j4 = this.f20994OooOO0;
        if (this.OooOO0o != j4) {
            long j5 = j4 + 1;
            p11 p11Var = q11.f23482OooO0OO;
            byte bO0Oo0oo = p11Var.o0Oo0oo(j4);
            if (bO0Oo0oo >= 0) {
                this.f20994OooOO0++;
                return bO0Oo0oo;
            }
            if (this.OooOO0o - this.f20994OooOO0 >= 10) {
                long j6 = 2 + j4;
                int iO0Oo0oo = (p11Var.o0Oo0oo(j5) << 7) ^ bO0Oo0oo;
                if (iO0Oo0oo < 0) {
                    j = iO0Oo0oo ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iO0Oo0oo2 = (p11Var.o0Oo0oo(j6) << 14) ^ iO0Oo0oo;
                    if (iO0Oo0oo2 >= 0) {
                        j = iO0Oo0oo2 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int iO0Oo0oo3 = iO0Oo0oo2 ^ (p11Var.o0Oo0oo(j7) << 21);
                        if (iO0Oo0oo3 < 0) {
                            j = (-2080896) ^ iO0Oo0oo3;
                            j6 = j8;
                        } else {
                            j7 = 5 + j4;
                            long jO0Oo0oo = (p11Var.o0Oo0oo(j8) << 28) ^ iO0Oo0oo3;
                            if (jO0Oo0oo >= 0) {
                                j3 = 266354560;
                            } else {
                                long j9 = 6 + j4;
                                long jO0Oo0oo2 = jO0Oo0oo ^ (p11Var.o0Oo0oo(j7) << 35);
                                if (jO0Oo0oo2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jO0Oo0oo = jO0Oo0oo2 ^ (p11Var.o0Oo0oo(j9) << 42);
                                    if (jO0Oo0oo >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j4;
                                        jO0Oo0oo2 = jO0Oo0oo ^ (p11Var.o0Oo0oo(j7) << 49);
                                        if (jO0Oo0oo2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = 9 + j4;
                                            long jO0Oo0oo3 = (jO0Oo0oo2 ^ (p11Var.o0Oo0oo(j9) << 56)) ^ 71499008037633920L;
                                            if (jO0Oo0oo3 < 0) {
                                                long j10 = j4 + 10;
                                                if (p11Var.o0Oo0oo(j7) >= 0) {
                                                    j6 = j10;
                                                    j = jO0Oo0oo3;
                                                }
                                            } else {
                                                j = jO0Oo0oo3;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jO0Oo0oo2;
                                j6 = j9;
                            }
                            j = j3 ^ jO0Oo0oo;
                        }
                    }
                    j6 = j7;
                }
                this.f20994OooOO0 = j6;
                return j;
            }
        }
        return OoooOoo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final hz0 o000oOoO() throws k01 {
        int iOooooo0 = Oooooo0();
        if (iOooooo0 > 0) {
            long j = this.OooOO0o;
            long j2 = this.f20994OooOO0;
            long j3 = iOooooo0;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iOooooo0];
                q11.f23482OooO0OO.o000000O(j2, bArr, 0L, j3);
                this.f20994OooOO0 += j3;
                return new hz0(bArr);
            }
        }
        if (iOooooo0 > 0 && iOooooo0 <= Ooooo00()) {
            byte[] bArr2 = new byte[iOooooo0];
            Ooooo0o(iOooooo0, bArr2);
            return new hz0(bArr2);
        }
        if (iOooooo0 == 0) {
            return jz0.f20406OooOo0o;
        }
        if (iOooooo0 < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

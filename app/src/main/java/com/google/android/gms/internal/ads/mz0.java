package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class mz0 extends nz0 {

    /* renamed from: OooO */
    public int f21368OooO;

    /* renamed from: OooO0OO */
    public final InputStream f21369OooO0OO;

    /* renamed from: OooO0Oo */
    public final byte[] f21370OooO0Oo;

    /* renamed from: OooO0o */
    public int f21371OooO0o;

    /* renamed from: OooO0o0 */
    public int f21372OooO0o0;

    /* renamed from: OooO0oO */
    public int f21373OooO0oO;

    /* renamed from: OooO0oo */
    public int f21374OooO0oo;

    /* renamed from: OooOO0 */
    public int f21375OooOO0 = Integer.MAX_VALUE;

    public /* synthetic */ mz0(InputStream inputStream) {
        Charset charset = i01.f19888OooO00o;
        this.f21369OooO0OO = inputStream;
        this.f21370OooO0Oo = new byte[4096];
        this.f21372OooO0o0 = 0;
        this.f21373OooO0oO = 0;
        this.f21368OooO = 0;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooOoOO() {
        return this.f21373OooO0oO == this.f21372OooO0o0 && !OooooOO(1);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooOoo0() {
        return o0OoOo0() != 0;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo() {
        return OoooooO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0(int i) throws k01 {
        if (i < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f21368OooO + this.f21373OooO0oO + i;
        if (i2 < 0) {
            throw new k01("Failed to parse the message.");
        }
        int i3 = this.f21375OooOO0;
        if (i2 > i3) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21375OooOO0 = i2;
        Ooooo0o();
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final double Oooo000() {
        return Double.longBitsToDouble(Ooooooo());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final float Oooo00O() {
        return Float.intBitsToFloat(Oooooo());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo00o() {
        return this.f21368OooO + this.f21373OooO0oO;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0O0() {
        return OoooooO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0OO() {
        return Oooooo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0o() {
        return Oooooo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0o0() {
        return OoooooO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0oO() {
        return nz0.OooOoo(OoooooO());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int Oooo0oo() throws k01 {
        if (OooOoOO()) {
            this.f21374OooO0oo = 0;
            return 0;
        }
        int iOoooooO = OoooooO();
        this.f21374OooO0oo = iOoooooO;
        if ((iOoooooO >>> 3) != 0) {
            return iOoooooO;
        }
        throw new k01("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO() {
        return nz0.OooOooO(o0OoOo0());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO0() {
        return o0OoOo0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO00() {
        return Ooooooo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooO0O() {
        return Ooooooo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OoooOO0() {
        return o0OoOo0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OoooOOO() throws k01 {
        int iOoooooO = OoooooO();
        byte[] bArr = this.f21370OooO0Oo;
        if (iOoooooO > 0) {
            int i = this.f21372OooO0o0;
            int i2 = this.f21373OooO0oO;
            if (iOoooooO <= i - i2) {
                String str = new String(bArr, i2, iOoooooO, i01.f19888OooO00o);
                this.f21373OooO0oO += iOoooooO;
                return str;
            }
        }
        if (iOoooooO == 0) {
            return "";
        }
        if (iOoooooO < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iOoooooO > this.f21372OooO0o0) {
            return new String(OooooOo(iOoooooO), i01.f19888OooO00o);
        }
        OooooO0(iOoooooO);
        String str2 = new String(bArr, this.f21373OooO0oO, iOoooooO, i01.f19888OooO00o);
        this.f21373OooO0oO += iOoooooO;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OoooOOo() throws IOException {
        int iOoooooO = OoooooO();
        int i = this.f21373OooO0oO;
        int i2 = this.f21372OooO0o0;
        int i3 = i2 - i;
        byte[] bArrOooooOo = this.f21370OooO0Oo;
        if (iOoooooO <= i3 && iOoooooO > 0) {
            this.f21373OooO0oO = i + iOoooooO;
        } else {
            if (iOoooooO == 0) {
                return "";
            }
            if (iOoooooO < 0) {
                throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iOoooooO <= i2) {
                OooooO0(iOoooooO);
                this.f21373OooO0oO = iOoooooO;
            } else {
                bArrOooooOo = OooooOo(iOoooooO);
            }
        }
        s11.f23974OooO00o.getClass();
        return qv0.OooO(bArrOooooOo, i, iOoooooO);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OoooOo0() throws k01 {
        if (this.f21374OooO0oo != 0) {
            throw new k01("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OoooOoO(int i) {
        this.f21375OooOO0 = i;
        Ooooo0o();
    }

    public final void OoooOoo(int i) throws k01 {
        InputStream inputStream = this.f21369OooO0OO;
        int i2 = this.f21372OooO0o0;
        int i3 = this.f21373OooO0oO;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f21373OooO0oO = i3 + i;
            return;
        }
        if (i < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.f21368OooO;
        int i6 = i5 + i3;
        int i7 = this.f21375OooOO0;
        if (i6 + i > i7) {
            OoooOoo((i7 - i5) - i3);
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21368OooO = i6;
        this.f21372OooO0o0 = 0;
        this.f21373OooO0oO = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (k01 e) {
                    e.f20408OooOo0O = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f21368OooO += i4;
                Ooooo0o();
                throw th;
            }
        }
        this.f21368OooO += i4;
        Ooooo0o();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f21372OooO0o0;
        int i9 = i8 - this.f21373OooO0oO;
        this.f21373OooO0oO = i8;
        OooooO0(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f21372OooO0o0;
            if (i10 <= i11) {
                this.f21373OooO0oO = i10;
                return;
            } else {
                i9 += i11;
                this.f21373OooO0oO = i11;
                OooooO0(1);
            }
        }
    }

    public final ArrayList Ooooo00(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f21369OooO0OO.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f21368OooO += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void Ooooo0o() {
        int i = this.f21372OooO0o0 + this.f21371OooO0o;
        this.f21372OooO0o0 = i;
        int i2 = this.f21368OooO + i;
        int i3 = this.f21375OooOO0;
        if (i2 <= i3) {
            this.f21371OooO0o = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f21371OooO0o = i4;
        this.f21372OooO0o0 = i - i4;
    }

    public final void OooooO0(int i) throws k01 {
        if (OooooOO(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f21368OooO) - this.f21373OooO0oO) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new k01("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean OooooOO(int i) throws IOException {
        InputStream inputStream = this.f21369OooO0OO;
        int i2 = this.f21373OooO0oO;
        int i3 = i2 + i;
        int i4 = this.f21372OooO0o0;
        if (i3 <= i4) {
            throw new IllegalStateException(OooO0oO.OooOo.OooO0oO(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f21368OooO;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.f21375OooOO0) {
            return false;
        }
        byte[] bArr = this.f21370OooO0Oo;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.f21368OooO + i2;
            this.f21368OooO = i5;
            i4 = this.f21372OooO0o0 - i2;
            this.f21372OooO0o0 = i4;
            this.f21373OooO0oO = 0;
        }
        try {
            int i6 = inputStream.read(bArr, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
            if (i6 == 0 || i6 < -1 || i6 > 4096) {
                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
            }
            if (i6 <= 0) {
                return false;
            }
            this.f21372OooO0o0 += i6;
            Ooooo0o();
            if (this.f21372OooO0o0 >= i) {
                return true;
            }
            return OooooOO(i);
        } catch (k01 e) {
            e.f20408OooOo0O = true;
            throw e;
        }
    }

    public final byte[] OooooOo(int i) throws IOException {
        byte[] bArrOooooo0 = Oooooo0(i);
        if (bArrOooooo0 != null) {
            return bArrOooooo0;
        }
        int i2 = this.f21373OooO0oO;
        int i3 = this.f21372OooO0o0;
        int i4 = i3 - i2;
        this.f21368OooO += i3;
        this.f21373OooO0oO = 0;
        this.f21372OooO0o0 = 0;
        ArrayList arrayListOoooo00 = Ooooo00(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f21370OooO0Oo, i2, bArr, 0, i4);
        int size = arrayListOoooo00.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayListOoooo00.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final int Oooooo() throws k01 {
        int i = this.f21373OooO0oO;
        if (this.f21372OooO0o0 - i < 4) {
            OooooO0(4);
            i = this.f21373OooO0oO;
        }
        this.f21373OooO0oO = i + 4;
        byte[] bArr = this.f21370OooO0Oo;
        int i2 = bArr[i] & ForkServer.ERROR;
        int i3 = bArr[i + 1] & ForkServer.ERROR;
        int i4 = bArr[i + 2] & ForkServer.ERROR;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final byte[] Oooooo0(int i) throws IOException {
        if (i == 0) {
            return i01.f19889OooO0O0;
        }
        int i2 = this.f21368OooO;
        int i3 = this.f21373OooO0oO;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new k01("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f21375OooOO0;
        if (i4 > i5) {
            OoooOoo((i5 - i2) - i3);
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.f21372OooO0o0 - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f21369OooO0OO;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (k01 e) {
                e.f20408OooOo0O = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f21370OooO0Oo, this.f21373OooO0oO, bArr, 0, i6);
        this.f21368OooO += this.f21372OooO0o0;
        this.f21373OooO0oO = 0;
        this.f21372OooO0o0 = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f21368OooO += i8;
                i6 += i8;
            } catch (k01 e2) {
                e2.f20408OooOo0O = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final int OoooooO() {
        int i;
        int i2 = this.f21373OooO0oO;
        int i3 = this.f21372OooO0o0;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f21370OooO0Oo;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f21373OooO0oO = i4;
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
                this.f21373OooO0oO = i5;
                return i;
            }
        }
        return (int) ooOO();
    }

    public final long Ooooooo() throws k01 {
        int i = this.f21373OooO0oO;
        if (this.f21372OooO0o0 - i < 8) {
            OooooO0(8);
            i = this.f21373OooO0oO;
        }
        this.f21373OooO0oO = i + 8;
        byte[] bArr = this.f21370OooO0Oo;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final hz0 o000oOoO() throws IOException {
        int iOoooooO = OoooooO();
        int i = this.f21372OooO0o0;
        int i2 = this.f21373OooO0oO;
        int i3 = i - i2;
        byte[] bArr = this.f21370OooO0Oo;
        if (iOoooooO <= i3 && iOoooooO > 0) {
            hz0 hz0VarOooOo0 = jz0.OooOo0(bArr, i2, iOoooooO);
            this.f21373OooO0oO += iOoooooO;
            return hz0VarOooOo0;
        }
        if (iOoooooO == 0) {
            return jz0.f20406OooOo0o;
        }
        if (iOoooooO < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrOooooo0 = Oooooo0(iOoooooO);
        if (bArrOooooo0 != null) {
            return jz0.OooOo0(bArrOooooo0, 0, bArrOooooo0.length);
        }
        int i4 = this.f21373OooO0oO;
        int i5 = this.f21372OooO0o0;
        int i6 = i5 - i4;
        this.f21368OooO += i5;
        this.f21373OooO0oO = 0;
        this.f21372OooO0o0 = 0;
        ArrayList arrayListOoooo00 = Ooooo00(iOoooooO - i6);
        byte[] bArr2 = new byte[iOoooooO];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = arrayListOoooo00.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayListOoooo00.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        return new hz0(bArr2);
    }

    public final long o0OoOo0() {
        long j;
        long j2;
        long j3;
        int i = this.f21373OooO0oO;
        int i2 = this.f21372OooO0o0;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f21370OooO0Oo;
            byte b = bArr[i];
            if (b >= 0) {
                this.f21373OooO0oO = i3;
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
                this.f21373OooO0oO = i4;
                return j;
            }
        }
        return ooOO();
    }

    public final long ooOO() throws k01 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f21373OooO0oO == this.f21372OooO0o0) {
                OooooO0(1);
            }
            int i2 = this.f21373OooO0oO;
            this.f21373OooO0oO = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.f21370OooO0Oo[i2] & 128) == 0) {
                return j;
            }
        }
        throw new k01("CodedInputStream encountered a malformed varint.");
    }
}

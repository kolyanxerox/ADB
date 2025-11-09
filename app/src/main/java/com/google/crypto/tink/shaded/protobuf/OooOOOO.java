package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.nz0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class OooOOOO extends nz0 {

    /* renamed from: OooO, reason: collision with root package name */
    public int f28027OooO;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ByteArrayInputStream f28028OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f28029OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f28030OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f28031OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f28032OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f28033OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f28034OooOO0 = Integer.MAX_VALUE;

    public OooOOOO(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = oo0o0Oo.f28134OooO00o;
        this.f28028OooO0OO = byteArrayInputStream;
        this.f28029OooO0Oo = new byte[4096];
        this.f28031OooO0o0 = 0;
        this.f28032OooO0oO = 0;
        this.f28027OooO = 0;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooO() {
        return Oooooo0() != 0;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OooO00o(int i) throws o000OOo {
        if (this.f28033OooO0oo != i) {
            throw new o000OOo("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooO0Oo() {
        return this.f28027OooO + this.f28032OooO0oO;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final boolean OooO0o0() {
        return this.f28032OooO0oO == this.f28031OooO0o0 && !ooOO(1);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void OooO0oO(int i) {
        this.f28034OooOO0 = i;
        OoooooO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooO0oo(int i) throws o000OOo {
        if (i < 0) {
            throw o000OOo.OooO0o();
        }
        int i2 = this.f28027OooO + this.f28032OooO0oO + i;
        int i3 = this.f28034OooOO0;
        if (i2 > i3) {
            throw o000OOo.OooO0oo();
        }
        this.f28034OooOO0 = i2;
        OoooooO();
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final OooOO0O OooOO0() throws IOException {
        int iOooooOo = OooooOo();
        int i = this.f28031OooO0o0;
        int i2 = this.f28032OooO0oO;
        int i3 = i - i2;
        byte[] bArr = this.f28029OooO0Oo;
        if (iOooooOo <= i3 && iOooooOo > 0) {
            OooOO0O oooOO0OOooO0oO = OooOOO0.OooO0oO(bArr, i2, iOooooOo);
            this.f28032OooO0oO += iOooooOo;
            return oooOO0OOooO0oO;
        }
        if (iOooooOo == 0) {
            return OooOOO0.f28025OooOo0o;
        }
        byte[] bArrOoooo00 = Ooooo00(iOooooOo);
        if (bArrOoooo00 != null) {
            return OooOOO0.OooO0oO(bArrOoooo00, 0, bArrOoooo00.length);
        }
        int i4 = this.f28032OooO0oO;
        int i5 = this.f28031OooO0o0;
        int length = i5 - i4;
        this.f28027OooO += i5;
        this.f28032OooO0oO = 0;
        this.f28031OooO0o0 = 0;
        ArrayList arrayListOoooo0o = Ooooo0o(iOooooOo - length);
        byte[] bArr2 = new byte[iOooooOo];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListOoooo0o.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListOoooo0o.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        OooOO0O oooOO0O = OooOOO0.f28025OooOo0o;
        return new OooOO0O(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final double OooOO0O() {
        return Double.longBitsToDouble(OooooOO());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOO0o() {
        return OooooOo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOOO() {
        return OooooOO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOOO0() {
        return OooooO0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final float OooOOOO() {
        return Float.intBitsToFloat(OooooO0());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOOOo() {
        return OooooOo();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOOo() {
        return OooooO0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOOo0() {
        return Oooooo0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOOoo() {
        return OooooOO();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOo() throws o000OOo {
        if (OooO0o0()) {
            this.f28033OooO0oo = 0;
            return 0;
        }
        int iOooooOo = OooooOo();
        this.f28033OooO0oo = iOooooOo;
        if ((iOooooOo >>> 3) != 0) {
            return iOooooOo;
        }
        throw o000OOo.OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOo0() {
        return nz0.OooO0OO(Oooooo0());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOo00() {
        return nz0.OooO0O0(OooooOo());
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OooOo0O() throws o000OOo {
        int iOooooOo = OooooOo();
        byte[] bArr = this.f28029OooO0Oo;
        if (iOooooOo > 0) {
            int i = this.f28031OooO0o0;
            int i2 = this.f28032OooO0oO;
            if (iOooooOo <= i - i2) {
                String str = new String(bArr, i2, iOooooOo, oo0o0Oo.f28134OooO00o);
                this.f28032OooO0oO += iOooooOo;
                return str;
            }
        }
        if (iOooooOo == 0) {
            return "";
        }
        if (iOooooOo > this.f28031OooO0o0) {
            return new String(OoooOoo(iOooooOo), oo0o0Oo.f28134OooO00o);
        }
        Ooooooo(iOooooOo);
        String str2 = new String(bArr, this.f28032OooO0oO, iOooooOo, oo0o0Oo.f28134OooO00o);
        this.f28032OooO0oO += iOooooOo;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final String OooOo0o() throws IOException {
        int iOooooOo = OooooOo();
        int i = this.f28032OooO0oO;
        int i2 = this.f28031OooO0o0;
        int i3 = i2 - i;
        byte[] bArrOoooOoo = this.f28029OooO0Oo;
        if (iOooooOo <= i3 && iOooooOo > 0) {
            this.f28032OooO0oO = i + iOooooOo;
        } else {
            if (iOooooOo == 0) {
                return "";
            }
            i = 0;
            if (iOooooOo <= i2) {
                Ooooooo(iOooooOo);
                this.f28032OooO0oO = iOooooOo;
            } else {
                bArrOoooOoo = OoooOoo(iOooooOo);
            }
        }
        return oo00o.f28133OooO00o.OooOOO(bArrOoooOoo, i, iOooooOo);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final long OooOoO() {
        return Oooooo0();
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final int OooOoO0() {
        return OooooOo();
    }

    public final byte[] OoooOoo(int i) throws IOException {
        byte[] bArrOoooo00 = Ooooo00(i);
        if (bArrOoooo00 != null) {
            return bArrOoooo00;
        }
        int i2 = this.f28032OooO0oO;
        int i3 = this.f28031OooO0o0;
        int length = i3 - i2;
        this.f28027OooO += i3;
        this.f28032OooO0oO = 0;
        this.f28031OooO0o0 = 0;
        ArrayList arrayListOoooo0o = Ooooo0o(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f28029OooO0Oo, i2, bArr, 0, length);
        int size = arrayListOoooo0o.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListOoooo0o.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] Ooooo00(int i) throws IOException {
        if (i == 0) {
            return oo0o0Oo.f28135OooO0O0;
        }
        if (i < 0) {
            throw o000OOo.OooO0o();
        }
        int i2 = this.f28027OooO;
        int i3 = this.f28032OooO0oO;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new o000OOo("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f28034OooOO0;
        if (i4 > i5) {
            o0OoOo0((i5 - i2) - i3);
            throw o000OOo.OooO0oo();
        }
        int i6 = this.f28031OooO0o0 - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.f28028OooO0OO;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (o000OOo e) {
                e.f28100OooOo0O = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f28029OooO0Oo, this.f28032OooO0oO, bArr, 0, i6);
        this.f28027OooO += this.f28031OooO0o0;
        this.f28032OooO0oO = 0;
        this.f28031OooO0o0 = 0;
        while (i6 < i) {
            try {
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw o000OOo.OooO0oo();
                }
                this.f28027OooO += i8;
                i6 += i8;
            } catch (o000OOo e2) {
                e2.f28100OooOo0O = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList Ooooo0o(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f28028OooO0OO.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw o000OOo.OooO0oo();
                }
                this.f28027OooO += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int OooooO0() throws o000OOo {
        int i = this.f28032OooO0oO;
        if (this.f28031OooO0o0 - i < 4) {
            Ooooooo(4);
            i = this.f28032OooO0oO;
        }
        this.f28032OooO0oO = i + 4;
        byte[] bArr = this.f28029OooO0Oo;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (bArr[i] & ForkServer.ERROR) | ((bArr[i + 1] & ForkServer.ERROR) << 8) | ((bArr[i + 2] & ForkServer.ERROR) << 16);
    }

    public final long OooooOO() throws o000OOo {
        int i = this.f28032OooO0oO;
        if (this.f28031OooO0o0 - i < 8) {
            Ooooooo(8);
            i = this.f28032OooO0oO;
        }
        this.f28032OooO0oO = i + 8;
        byte[] bArr = this.f28029OooO0Oo;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int OooooOo() {
        int i;
        int i2 = this.f28032OooO0oO;
        int i3 = this.f28031OooO0o0;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f28029OooO0Oo;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f28032OooO0oO = i4;
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
                this.f28032OooO0oO = i5;
                return i;
            }
        }
        return (int) Oooooo();
    }

    public final long Oooooo() throws o000OOo {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f28032OooO0oO == this.f28031OooO0o0) {
                Ooooooo(1);
            }
            int i2 = this.f28032OooO0oO;
            this.f28032OooO0oO = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.f28029OooO0Oo[i2] & 128) == 0) {
                return j;
            }
        }
        throw o000OOo.OooO0o0();
    }

    public final long Oooooo0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f28032OooO0oO;
        int i2 = this.f28031OooO0o0;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f28029OooO0Oo;
            byte b = bArr[i];
            if (b >= 0) {
                this.f28032OooO0oO = i3;
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
                this.f28032OooO0oO = i4;
                return j;
            }
        }
        return Oooooo();
    }

    public final void OoooooO() {
        int i = this.f28031OooO0o0 + this.f28030OooO0o;
        this.f28031OooO0o0 = i;
        int i2 = this.f28027OooO + i;
        int i3 = this.f28034OooOO0;
        if (i2 <= i3) {
            this.f28030OooO0o = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f28030OooO0o = i4;
        this.f28031OooO0o0 = i - i4;
    }

    public final void Ooooooo(int i) throws o000OOo {
        if (ooOO(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f28027OooO) - this.f28032OooO0oO) {
            throw o000OOo.OooO0oo();
        }
        throw new o000OOo("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void o0OoOo0(int i) throws o000OOo {
        int i2 = this.f28031OooO0o0;
        int i3 = this.f28032OooO0oO;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f28032OooO0oO = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f28028OooO0OO;
        if (i < 0) {
            throw o000OOo.OooO0o();
        }
        int i5 = this.f28027OooO;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f28034OooOO0;
        if (i7 > i8) {
            o0OoOo0((i8 - i5) - i3);
            throw o000OOo.OooO0oo();
        }
        this.f28027OooO = i6;
        this.f28031OooO0o0 = 0;
        this.f28032OooO0oO = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (o000OOo e) {
                    e.f28100OooOo0O = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f28027OooO += i4;
                OoooooO();
                throw th;
            }
        }
        this.f28027OooO += i4;
        OoooooO();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f28031OooO0o0;
        int i10 = i9 - this.f28032OooO0oO;
        this.f28032OooO0oO = i9;
        Ooooooo(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f28031OooO0o0;
            if (i11 <= i12) {
                this.f28032OooO0oO = i11;
                return;
            } else {
                i10 += i12;
                this.f28032OooO0oO = i12;
                Ooooooo(1);
            }
        }
    }

    public final boolean ooOO(int i) throws IOException {
        int i2 = this.f28032OooO0oO;
        int i3 = i2 + i;
        int i4 = this.f28031OooO0o0;
        if (i3 <= i4) {
            throw new IllegalStateException(OooO0oO.OooOo.OooO0oO(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f28027OooO;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f28034OooOO0) {
            byte[] bArr = this.f28029OooO0Oo;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f28027OooO += i2;
                this.f28031OooO0o0 -= i2;
                this.f28032OooO0oO = 0;
            }
            int i6 = this.f28031OooO0o0;
            int iMin = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f28027OooO) - i6);
            ByteArrayInputStream byteArrayInputStream = this.f28028OooO0OO;
            try {
                int i7 = byteArrayInputStream.read(bArr, i6, iMin);
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f28031OooO0o0 += i7;
                    OoooooO();
                    if (this.f28031OooO0o0 >= i) {
                        return true;
                    }
                    return ooOO(i);
                }
            } catch (o000OOo e) {
                e.f28100OooOo0O = true;
                throw e;
            }
        }
        return false;
    }
}

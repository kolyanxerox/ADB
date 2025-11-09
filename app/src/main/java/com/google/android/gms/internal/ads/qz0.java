package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class qz0 extends rz0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final byte[] f23712OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f23713OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final ByteArrayOutputStream f23714OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f23715OooOoo0;

    public qz0(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f23712OooOoO = new byte[iMax];
        this.f23713OooOoOO = iMax;
        this.f23714OooOoo = byteArrayOutputStream;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void OooOOo0(byte[] bArr, int i, int i2) throws IOException {
        o0000O00(bArr, i, i2);
    }

    public final void o0000(long j) {
        boolean z = rz0.f23959OooOoO0;
        byte[] bArr = this.f23712OooOoO;
        if (z) {
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    int i2 = this.f23715OooOoo0;
                    this.f23715OooOoo0 = i2 + 1;
                    q11.OooOO0O(bArr, i2, (byte) i);
                    return;
                } else {
                    int i3 = this.f23715OooOoo0;
                    this.f23715OooOoo0 = i3 + 1;
                    q11.OooOO0O(bArr, i3, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    int i5 = this.f23715OooOoo0;
                    this.f23715OooOoo0 = i5 + 1;
                    bArr[i5] = (byte) i4;
                    return;
                } else {
                    int i6 = this.f23715OooOoo0;
                    this.f23715OooOoo0 = i6 + 1;
                    bArr[i6] = (byte) (i4 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o00000(int i, int i2) throws IOException {
        o00000o0(20);
        o00000oo(i << 3);
        o00000oo(i2);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o000000(int i, bz0 bz0Var, g11 g11Var) throws IOException {
        o00000O0((i << 3) | 2);
        o00000O0(bz0Var.OooO00o(g11Var));
        g11Var.OooO0Oo(bz0Var, this.f23960OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o000000O(int i, String str) throws IOException {
        o00000O0((i << 3) | 2);
        try {
            int length = str.length() * 3;
            int iOo000o = rz0.oo000o(length);
            int i2 = iOo000o + length;
            int i3 = this.f23713OooOoOO;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iOooO0O0 = s11.OooO0O0(str, bArr, 0, length);
                o00000O0(iOooO0O0);
                o0000O00(bArr, 0, iOooO0O0);
                return;
            }
            if (i2 > i3 - this.f23715OooOoo0) {
                o00000Oo();
            }
            int iOo000o2 = rz0.oo000o(str.length());
            int i4 = this.f23715OooOoo0;
            byte[] bArr2 = this.f23712OooOoO;
            try {
                if (iOo000o2 == iOo000o) {
                    int i5 = i4 + iOo000o2;
                    this.f23715OooOoo0 = i5;
                    int iOooO0O02 = s11.OooO0O0(str, bArr2, i5, i3 - i5);
                    this.f23715OooOoo0 = i4;
                    o00000oo((iOooO0O02 - i4) - iOo000o2);
                    this.f23715OooOoo0 = iOooO0O02;
                } else {
                    int iOooO0OO = s11.OooO0OO(str);
                    o00000oo(iOooO0OO);
                    this.f23715OooOoo0 = s11.OooO0O0(str, bArr2, this.f23715OooOoo0, iOooO0OO);
                }
            } catch (r11 e) {
                this.f23715OooOoo0 = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new pz0(e2);
            }
        } catch (r11 e3) {
            o00oO0O(str, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o000000o(int i, int i2) throws IOException {
        o00000O0((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o00000O(int i, long j) throws IOException {
        o00000o0(20);
        o00000oo(i << 3);
        o0000(j);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o00000O0(int i) throws IOException {
        o00000o0(5);
        o00000oo(i);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o00000OO(long j) throws IOException {
        o00000o0(10);
        o0000(j);
    }

    public final void o00000Oo() throws IOException {
        this.f23714OooOoo.write(this.f23712OooOoO, 0, this.f23715OooOoo0);
        this.f23715OooOoo0 = 0;
    }

    public final void o00000o0(int i) throws IOException {
        if (this.f23713OooOoOO - this.f23715OooOoo0 < i) {
            o00000Oo();
        }
    }

    public final void o00000oO(long j) {
        int i = this.f23715OooOoo0;
        byte[] bArr = this.f23712OooOoO;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f23715OooOoo0 = i + 8;
    }

    public final void o00000oo(int i) {
        boolean z = rz0.f23959OooOoO0;
        byte[] bArr = this.f23712OooOoO;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.f23715OooOoo0;
                this.f23715OooOoo0 = i2 + 1;
                q11.OooOO0O(bArr, i2, (byte) (i | 128));
                i >>>= 7;
            }
            int i3 = this.f23715OooOoo0;
            this.f23715OooOoo0 = i3 + 1;
            q11.OooOO0O(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.f23715OooOoo0;
            this.f23715OooOoo0 = i4 + 1;
            bArr[i4] = (byte) (i | 128);
            i >>>= 7;
        }
        int i5 = this.f23715OooOoo0;
        this.f23715OooOoo0 = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void o0000O00(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f23715OooOoo0;
        int i4 = this.f23713OooOoOO;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f23712OooOoO;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f23715OooOoo0 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.f23715OooOoo0 = i4;
        o00000Oo();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.f23714OooOoo.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f23715OooOoo0 = i7;
        }
    }

    public final void o0000Ooo(int i) {
        int i2 = this.f23715OooOoo0;
        byte[] bArr = this.f23712OooOoO;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f23715OooOoo0 = i2 + 4;
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o000OOo(int i) throws IOException {
        if (i >= 0) {
            o00000O0(i);
        } else {
            o00000OO(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0O0O00(int i, int i2) throws IOException {
        o00000o0(20);
        o00000oo(i << 3);
        if (i2 >= 0) {
            o00000oo(i2);
        } else {
            o0000(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0OO00O(int i, long j) throws IOException {
        o00000o0(18);
        o00000oo((i << 3) | 1);
        o00000oO(j);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0OOO0o(int i, int i2) throws IOException {
        o00000o0(14);
        o00000oo((i << 3) | 5);
        o0000Ooo(i2);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0Oo0oo(int i) throws IOException {
        o00000o0(4);
        o0000Ooo(i);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0ooOO0(byte b) throws IOException {
        if (this.f23715OooOoo0 == this.f23713OooOoOO) {
            o00000Oo();
        }
        int i = this.f23715OooOoo0;
        this.f23712OooOoO[i] = b;
        this.f23715OooOoo0 = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0ooOOo(int i, boolean z) throws IOException {
        o00000o0(11);
        o00000oo(i << 3);
        int i2 = this.f23715OooOoo0;
        this.f23712OooOoO[i2] = z ? (byte) 1 : (byte) 0;
        this.f23715OooOoo0 = i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0ooOoO(int i, jz0 jz0Var) throws IOException {
        o00000O0((i << 3) | 2);
        o00000O0(jz0Var.OooOO0());
        jz0Var.OooOOo0(this);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void oo0o0Oo(long j) throws IOException {
        o00000o0(8);
        o00000oO(j);
    }
}

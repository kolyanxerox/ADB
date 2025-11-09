package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class oz0 extends rz0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final byte[] f23164OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f23165OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f23166OooOoo0;

    public oz0(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f23164OooOoO = bArr;
        this.f23166OooOoo0 = 0;
        this.f23165OooOoOO = i;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void OooOOo0(byte[] bArr, int i, int i2) throws pz0 {
        try {
            System.arraycopy(bArr, i, this.f23164OooOoO, this.f23166OooOoo0, i2);
            this.f23166OooOoo0 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(this.f23166OooOoo0, this.f23165OooOoOO, i2, e, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o00000(int i, int i2) throws pz0 {
        o00000O0(i << 3);
        o00000O0(i2);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o000000(int i, bz0 bz0Var, g11 g11Var) throws pz0 {
        o00000O0((i << 3) | 2);
        o00000O0(bz0Var.OooO00o(g11Var));
        g11Var.OooO0Oo(bz0Var, this.f23960OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o000000O(int i, String str) throws pz0 {
        o00000O0((i << 3) | 2);
        int i2 = this.f23166OooOoo0;
        try {
            int iOo000o = rz0.oo000o(str.length() * 3);
            int iOo000o2 = rz0.oo000o(str.length());
            byte[] bArr = this.f23164OooOoO;
            int i3 = this.f23165OooOoOO;
            if (iOo000o2 != iOo000o) {
                o00000O0(s11.OooO0OO(str));
                int i4 = this.f23166OooOoo0;
                this.f23166OooOoo0 = s11.OooO0O0(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + iOo000o2;
                this.f23166OooOoo0 = i5;
                int iOooO0O0 = s11.OooO0O0(str, bArr, i5, i3 - i5);
                this.f23166OooOoo0 = i2;
                o00000O0((iOooO0O0 - i2) - iOo000o2);
                this.f23166OooOoo0 = iOooO0O0;
            }
        } catch (r11 e) {
            this.f23166OooOoo0 = i2;
            o00oO0O(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new pz0(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o000000o(int i, int i2) throws pz0 {
        o00000O0((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o00000O(int i, long j) throws pz0 {
        o00000O0(i << 3);
        o00000OO(j);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o00000O0(int i) throws pz0 {
        int i2;
        int i3 = this.f23166OooOoo0;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f23164OooOoO;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f23166OooOoo0 = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new pz0(i2, this.f23165OooOoOO, 1, e, 0);
                }
            }
            throw new pz0(i2, this.f23165OooOoOO, 1, e, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o00000OO(long j) throws pz0 {
        int i;
        int i2 = this.f23166OooOoo0;
        byte[] bArr = this.f23164OooOoO;
        boolean z = rz0.f23959OooOoO0;
        int i3 = this.f23165OooOoOO;
        if (!z || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new pz0(i, i3, 1, e, 0);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j2;
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                q11.OooOO0O(bArr, i2, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            q11.OooOO0O(bArr, i2, (byte) j3);
        }
        this.f23166OooOoo0 = i;
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o000OOo(int i) throws pz0 {
        if (i >= 0) {
            o00000O0(i);
        } else {
            o00000OO(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0O0O00(int i, int i2) throws pz0 {
        o00000O0(i << 3);
        o000OOo(i2);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0OO00O(int i, long j) throws pz0 {
        o00000O0((i << 3) | 1);
        oo0o0Oo(j);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0OOO0o(int i, int i2) throws pz0 {
        o00000O0((i << 3) | 5);
        o0Oo0oo(i2);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0Oo0oo(int i) throws pz0 {
        int i2 = this.f23166OooOoo0;
        try {
            byte[] bArr = this.f23164OooOoO;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f23166OooOoo0 = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(i2, this.f23165OooOoOO, 4, e, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0ooOO0(byte b) throws pz0 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i;
        int i2 = this.f23166OooOoo0;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            indexOutOfBoundsException = e;
        }
        try {
            this.f23164OooOoO[i2] = b;
            this.f23166OooOoo0 = i;
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
            i2 = i;
            throw new pz0(i2, this.f23165OooOoOO, 1, indexOutOfBoundsException, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0ooOOo(int i, boolean z) throws pz0 {
        o00000O0(i << 3);
        o0ooOO0(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void o0ooOoO(int i, jz0 jz0Var) throws pz0 {
        o00000O0((i << 3) | 2);
        o00000O0(jz0Var.OooOO0());
        jz0Var.OooOOo0(this);
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final void oo0o0Oo(long j) throws pz0 {
        int i = this.f23166OooOoo0;
        try {
            byte[] bArr = this.f23164OooOoO;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f23166OooOoo0 = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(i, this.f23165OooOoOO, 8, e, 0);
        }
    }
}

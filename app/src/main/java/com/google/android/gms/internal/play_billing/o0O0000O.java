package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.pz0;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class o0O0000O extends o0O000Oo {

    /* renamed from: OooOoOO */
    public static final Logger f27081OooOoOO = Logger.getLogger(o0O0000O.class.getName());

    /* renamed from: OooOoo0 */
    public static final boolean f27082OooOoo0 = o0OO0o.f27150OooO0o0;

    /* renamed from: OooOo */
    public final byte[] f27083OooOo;

    /* renamed from: OooOo0o */
    public o0O0O0o0 f27084OooOo0o;

    /* renamed from: OooOoO */
    public int f27085OooOoO;

    /* renamed from: OooOoO0 */
    public final int f27086OooOoO0;

    public o0O0000O(byte[] bArr, int i) {
        super(11);
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f27083OooOo = bArr;
        this.f27085OooOoO = 0;
        this.f27086OooOoO0 = i;
    }

    public static int Oooo0oO(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int Ooooo0o(String str) {
        int length;
        try {
            length = o0OO.OooO0OO(str);
        } catch (o0OO0oO0 unused) {
            length = str.getBytes(o0oO0Ooo.f27160OooO00o).length;
        }
        return OooooO0(length) + length;
    }

    public static int OooooO0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void Oooo(int i, o0O00000 o0o00000) throws pz0 {
        OoooOoO((i << 3) | 2);
        OoooOoO(o0o00000.OooO0oO());
        Oooo0oo(o0o00000.OooO0oO(), o0o00000.f27080OooOo0o);
    }

    public final void Oooo0oo(int i, byte[] bArr) throws pz0 {
        try {
            System.arraycopy(bArr, 0, this.f27083OooOo, this.f27085OooOoO, i);
            this.f27085OooOoO += i;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(this.f27085OooOoO, this.f27086OooOoO0, i, e, 3);
        }
    }

    public final void OoooO(long j) throws pz0 {
        int i = this.f27085OooOoO;
        try {
            byte[] bArr = this.f27083OooOo;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            this.f27085OooOoO = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(i, this.f27086OooOoO0, 8, e, 3);
        }
    }

    public final void OoooO0(int i) throws pz0 {
        int i2 = this.f27085OooOoO;
        try {
            byte[] bArr = this.f27083OooOo;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            this.f27085OooOoO = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(i2, this.f27086OooOoO0, 4, e, 3);
        }
    }

    public final void OoooO00(int i, int i2) throws pz0 {
        OoooOoO((i << 3) | 5);
        OoooO0(i2);
    }

    public final void OoooO0O(int i, long j) throws pz0 {
        OoooOoO((i << 3) | 1);
        OoooO(j);
    }

    public final void OoooOO0(int i, int i2) throws pz0 {
        OoooOoO(i << 3);
        o000oOoO(i2);
    }

    public final void OoooOOO(int i, String str) throws pz0 {
        OoooOoO((i << 3) | 2);
        int i2 = this.f27085OooOoO;
        try {
            int iOooooO0 = OooooO0(str.length() * 3);
            int iOooooO02 = OooooO0(str.length());
            byte[] bArr = this.f27083OooOo;
            int i3 = this.f27086OooOoO0;
            if (iOooooO02 != iOooooO0) {
                OoooOoO(o0OO.OooO0OO(str));
                int i4 = this.f27085OooOoO;
                this.f27085OooOoO = o0OO.OooO0O0(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + iOooooO02;
                this.f27085OooOoO = i5;
                int iOooO0O0 = o0OO.OooO0O0(str, bArr, i5, i3 - i5);
                this.f27085OooOoO = i2;
                OoooOoO((iOooO0O0 - i2) - iOooooO02);
                this.f27085OooOoO = iOooO0O0;
            }
        } catch (o0OO0oO0 e) {
            this.f27085OooOoO = i2;
            f27081OooOoOO.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(o0oO0Ooo.f27160OooO00o);
            try {
                int length = bytes.length;
                OoooOoO(length);
                Oooo0oo(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new pz0(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new pz0(e3);
        }
    }

    public final void OoooOOo(int i, int i2) throws pz0 {
        OoooOoO((i << 3) | i2);
    }

    public final void OoooOo0(int i, int i2) throws pz0 {
        OoooOoO(i << 3);
        OoooOoO(i2);
    }

    public final void OoooOoO(int i) throws pz0 {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f27083OooOo;
            if (i2 == 0) {
                int i3 = this.f27085OooOoO;
                this.f27085OooOoO = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f27085OooOoO;
                    this.f27085OooOoO = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new pz0(this.f27085OooOoO, this.f27086OooOoO0, 1, e, 3);
                }
            }
            throw new pz0(this.f27085OooOoO, this.f27086OooOoO0, 1, e, 3);
        }
    }

    public final void OoooOoo(int i, long j) throws pz0 {
        OoooOoO(i << 3);
        Ooooo00(j);
    }

    public final void Ooooo00(long j) throws pz0 {
        byte[] bArr = this.f27083OooOo;
        boolean z = f27082OooOoo0;
        int i = this.f27086OooOoO0;
        if (!z || i - this.f27085OooOoO < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                try {
                    int i2 = this.f27085OooOoO;
                    this.f27085OooOoO = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) | 128) & 255);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new pz0(this.f27085OooOoO, i, 1, e, 3);
                }
            }
            int i3 = this.f27085OooOoO;
            this.f27085OooOoO = i3 + 1;
            bArr[i3] = (byte) j2;
            return;
        }
        long j3 = j;
        while (true) {
            int i4 = (int) j3;
            if ((j3 & (-128)) == 0) {
                int i5 = this.f27085OooOoO;
                this.f27085OooOoO = i5 + 1;
                o0OO0o.f27147OooO0OO.OooO0Oo(bArr, o0OO0o.f27149OooO0o + i5, (byte) i4);
                return;
            }
            int i6 = this.f27085OooOoO;
            this.f27085OooOoO = i6 + 1;
            o0OO0o.f27147OooO0OO.OooO0Oo(bArr, o0OO0o.f27149OooO0o + i6, (byte) ((i4 | 128) & 255));
            j3 >>>= 7;
        }
    }

    public final void o000oOoO(int i) throws pz0 {
        if (i >= 0) {
            OoooOoO(i);
        } else {
            Ooooo00(i);
        }
    }
}

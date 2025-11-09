package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.pz0;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class oO000O0 extends o00OoO00.OooOOO0 {

    /* renamed from: OooO0Oo */
    public oO00Oo0 f26676OooO0Oo;

    /* renamed from: OooO0o */
    public final int f26677OooO0o;

    /* renamed from: OooO0o0 */
    public final byte[] f26678OooO0o0;

    /* renamed from: OooO0oO */
    public int f26679OooO0oO;

    /* renamed from: OooO0oo */
    public static final Logger f26675OooO0oo = Logger.getLogger(oO000O0.class.getName());

    /* renamed from: OooO */
    public static final boolean f26674OooO = oO0O0Oo0.f26748OooO0o0;

    public oO000O0(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f26678OooO0o0 = bArr;
        this.f26679OooO0oO = 0;
        this.f26677OooO0o = i;
    }

    public static int OooOO0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int OooOO0O(String str) {
        int length;
        try {
            length = ooOOO0Oo.OooO0O0(str);
        } catch (oOo0o0oO unused) {
            length = str.getBytes(oO00O0o.f26684OooO00o).length;
        }
        return OooOoOO(length) + length;
    }

    public static int OooOoOO(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void OooOO0o(int i, int i2) throws pz0 {
        OooOo0((i << 3) | i2);
    }

    public final void OooOOO(int i, int i2) throws pz0 {
        OooOo0(i << 3);
        OooOo0(i2);
    }

    public final void OooOOO0(int i, int i2) throws pz0 {
        OooOo0(i << 3);
        OooOo00(i2);
    }

    public final void OooOOOO(int i, int i2) throws pz0 {
        OooOo0((i << 3) | 5);
        OooOo0O(i2);
    }

    public final void OooOOOo(int i, long j) throws pz0 {
        OooOo0(i << 3);
        OooOo0o(j);
    }

    public final void OooOOo(oO000 oo000) throws pz0 {
        OooOo0(oo000.OooO0oO());
        OooOoO0(oo000.OooO0oO(), oo000.f26665OooOo0o);
    }

    public final void OooOOo0(int i, long j) throws pz0 {
        OooOo0((i << 3) | 1);
        OooOo(j);
    }

    public final void OooOOoo(byte b) throws pz0 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i;
        int i2 = this.f26679OooO0oO;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            indexOutOfBoundsException = e;
        }
        try {
            this.f26678OooO0o0[i2] = b;
            this.f26679OooO0oO = i;
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
            i2 = i;
            throw new pz0(i2, this.f26677OooO0o, 1, indexOutOfBoundsException, 2);
        }
    }

    public final void OooOo(long j) throws pz0 {
        int i = this.f26679OooO0oO;
        try {
            byte[] bArr = this.f26678OooO0o0;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f26679OooO0oO = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(i, this.f26677OooO0o, 8, e, 2);
        }
    }

    public final void OooOo0(int i) throws pz0 {
        int i2;
        int i3 = this.f26679OooO0oO;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f26678OooO0o0;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f26679OooO0oO = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new pz0(i2, this.f26677OooO0o, 1, e, 2);
                }
            }
            throw new pz0(i2, this.f26677OooO0o, 1, e, 2);
        }
    }

    public final void OooOo00(int i) throws pz0 {
        if (i >= 0) {
            OooOo0(i);
        } else {
            OooOo0o(i);
        }
    }

    public final void OooOo0O(int i) throws pz0 {
        int i2 = this.f26679OooO0oO;
        try {
            byte[] bArr = this.f26678OooO0o0;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f26679OooO0oO = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(i2, this.f26677OooO0o, 4, e, 2);
        }
    }

    public final void OooOo0o(long j) throws pz0 {
        int i;
        int i2 = this.f26679OooO0oO;
        byte[] bArr = this.f26678OooO0o0;
        boolean z = f26674OooO;
        int i3 = this.f26677OooO0o;
        if (!z || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new pz0(i, i3, 1, e, 2);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j2;
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                oO0O0Oo0.f26745OooO0OO.OooO00o(bArr, oO0O0Oo0.f26747OooO0o + i2, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            oO0O0Oo0.f26745OooO0OO.OooO00o(bArr, oO0O0Oo0.f26747OooO0o + i2, (byte) j3);
        }
        this.f26679OooO0oO = i;
    }

    public final void OooOoO(String str) throws pz0 {
        int i = this.f26679OooO0oO;
        try {
            int iOooOoOO = OooOoOO(str.length() * 3);
            int iOooOoOO2 = OooOoOO(str.length());
            byte[] bArr = this.f26678OooO0o0;
            int i2 = this.f26677OooO0o;
            if (iOooOoOO2 != iOooOoOO) {
                OooOo0(ooOOO0Oo.OooO0O0(str));
                int i3 = this.f26679OooO0oO;
                this.f26679OooO0oO = ooOOO0Oo.OooO0OO(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iOooOoOO2;
                this.f26679OooO0oO = i4;
                int iOooO0OO = ooOOO0Oo.OooO0OO(str, bArr, i4, i2 - i4);
                this.f26679OooO0oO = i;
                OooOo0((iOooO0OO - i) - iOooOoOO2);
                this.f26679OooO0oO = iOooO0OO;
            }
        } catch (oOo0o0oO e) {
            this.f26679OooO0oO = i;
            f26675OooO0oo.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(oO00O0o.f26684OooO00o);
            try {
                int length = bytes.length;
                OooOo0(length);
                OooOoO0(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new pz0(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new pz0(e3);
        }
    }

    public final void OooOoO0(int i, byte[] bArr) throws pz0 {
        try {
            System.arraycopy(bArr, 0, this.f26678OooO0o0, this.f26679OooO0oO, i);
            this.f26679OooO0oO += i;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(this.f26679OooO0oO, this.f26677OooO0o, i, e, 2);
        }
    }
}

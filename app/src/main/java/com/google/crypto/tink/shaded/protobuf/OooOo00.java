package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.pz0;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class OooOo00 extends o0OO0O0 {

    /* renamed from: OooO0oO */
    public static final Logger f28035OooO0oO = Logger.getLogger(OooOo00.class.getName());

    /* renamed from: OooO0oo */
    public static final boolean f28036OooO0oo = oOO00O.f28129OooO0o0;

    /* renamed from: OooO0OO */
    public o0000O00 f28037OooO0OO;

    /* renamed from: OooO0Oo */
    public final byte[] f28038OooO0Oo;

    /* renamed from: OooO0o */
    public int f28039OooO0o;

    /* renamed from: OooO0o0 */
    public final int f28040OooO0o0;

    public OooOo00(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f28038OooO0Oo = bArr;
        this.f28039OooO0o = 0;
        this.f28040OooO0o0 = i;
    }

    public static int OooOOo(OooOOO0 oooOOO0) {
        int size = oooOOO0.size();
        return OooOoO0(size) + size;
    }

    public static int OooOOo0(int i, OooOOO0 oooOOO0) {
        return OooOOo(oooOOO0) + OooOo(i);
    }

    public static int OooOOoo(int i) {
        return OooOo(i) + 4;
    }

    public static int OooOo(int i) {
        return OooOoO0(i << 3);
    }

    public static int OooOo0(int i, OooO00o oooO00o, o000O0O0 o000o0o02) {
        return oooO00o.OooO00o(o000o0o02) + (OooOo(i) * 2);
    }

    public static int OooOo00(int i) {
        return OooOo(i) + 8;
    }

    public static int OooOo0O(int i) {
        if (i >= 0) {
            return OooOoO0(i);
        }
        return 10;
    }

    public static int OooOo0o(String str) {
        int length;
        try {
            length = oo00o.OooO0O0(str);
        } catch (o00O00o0 unused) {
            length = str.getBytes(oo0o0Oo.f28134OooO00o).length;
        }
        return OooOoO0(length) + length;
    }

    public static int OooOoO(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int OooOoO0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public final void OooOoOO(byte b) throws pz0 {
        try {
            byte[] bArr = this.f28038OooO0Oo;
            int i = this.f28039OooO0o;
            this.f28039OooO0o = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28039OooO0o), Integer.valueOf(this.f28040OooO0o0), 1), e);
        }
    }

    public final void OooOoo(int i, int i2) throws pz0 {
        Oooo00o(i, 5);
        OooOooO(i2);
    }

    public final void OooOoo0(byte[] bArr, int i, int i2) throws pz0 {
        try {
            System.arraycopy(bArr, i, this.f28038OooO0Oo, this.f28039OooO0o, i2);
            this.f28039OooO0o += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28039OooO0o), Integer.valueOf(this.f28040OooO0o0), Integer.valueOf(i2)), e);
        }
    }

    public final void OooOooO(int i) throws pz0 {
        try {
            byte[] bArr = this.f28038OooO0Oo;
            int i2 = this.f28039OooO0o;
            int i3 = i2 + 1;
            this.f28039OooO0o = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f28039OooO0o = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f28039OooO0o = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f28039OooO0o = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28039OooO0o), Integer.valueOf(this.f28040OooO0o0), 1), e);
        }
    }

    public final void OooOooo(int i, long j) throws pz0 {
        Oooo00o(i, 1);
        Oooo000(j);
    }

    public final void Oooo0(int i) throws pz0 {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f28038OooO0Oo;
            if (i2 == 0) {
                int i3 = this.f28039OooO0o;
                this.f28039OooO0o = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f28039OooO0o;
                    this.f28039OooO0o = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new pz0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28039OooO0o), Integer.valueOf(this.f28040OooO0o0), 1), e);
                }
            }
            throw new pz0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28039OooO0o), Integer.valueOf(this.f28040OooO0o0), 1), e);
        }
    }

    public final void Oooo000(long j) throws pz0 {
        try {
            byte[] bArr = this.f28038OooO0Oo;
            int i = this.f28039OooO0o;
            int i2 = i + 1;
            this.f28039OooO0o = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f28039OooO0o = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f28039OooO0o = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f28039OooO0o = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f28039OooO0o = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f28039OooO0o = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f28039OooO0o = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f28039OooO0o = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28039OooO0o), Integer.valueOf(this.f28040OooO0o0), 1), e);
        }
    }

    public final void Oooo00O(int i) throws pz0 {
        if (i >= 0) {
            Oooo0(i);
        } else {
            Oooo0OO(i);
        }
    }

    public final void Oooo00o(int i, int i2) throws pz0 {
        Oooo0((i << 3) | i2);
    }

    public final void Oooo0O0(int i, long j) throws pz0 {
        Oooo00o(i, 0);
        Oooo0OO(j);
    }

    public final void Oooo0OO(long j) throws pz0 {
        byte[] bArr = this.f28038OooO0Oo;
        boolean z = f28036OooO0oo;
        int i = this.f28040OooO0o0;
        if (z && i - this.f28039OooO0o >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.f28039OooO0o;
                this.f28039OooO0o = i2 + 1;
                oOO00O.OooOO0O(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.f28039OooO0o;
            this.f28039OooO0o = i3 + 1;
            oOO00O.OooOO0O(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.f28039OooO0o;
                this.f28039OooO0o = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new pz0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28039OooO0o), Integer.valueOf(i), 1), e);
            }
        }
        int i5 = this.f28039OooO0o;
        this.f28039OooO0o = i5 + 1;
        bArr[i5] = (byte) j;
    }
}

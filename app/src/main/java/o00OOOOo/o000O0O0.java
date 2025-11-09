package o00OOOoO;

import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.internal.measurement.o0OOO0;
import io.flutter.embedding.android.KeyboardMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.OooOo;
import o00O0oO.o0OO00O;

/* loaded from: classes3.dex */
public final class o000O0O0 implements o0000oo {

    /* renamed from: OooOo */
    public boolean f32576OooOo;

    /* renamed from: OooOo0O */
    public final o0O0ooO f32577OooOo0O;

    /* renamed from: OooOo0o */
    public final o0000 f32578OooOo0o;

    public o000O0O0(o0O0ooO source) {
        OooOo.OooO0o0(source, "source");
        this.f32577OooOo0O = source;
        this.f32578OooOo0o = new o0000();
    }

    public final o0000O0 OooO00o(long j) throws EOFException {
        require(j);
        return this.f32578OooOo0o.OooO0OO(j);
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 sink) {
        OooOo.OooO0o0(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
        }
        if (this.f32576OooOo) {
            throw new IllegalStateException("closed");
        }
        o0000 o0000Var = this.f32578OooOo0o;
        if (o0000Var.f32535OooOo0o == 0 && this.f32577OooOo0O.OooO0oO(8192L, o0000Var) == -1) {
            return -1L;
        }
        return o0000Var.OooO0oO(Math.min(j, o0000Var.f32535OooOo0o), sink);
    }

    @Override // o00OOOoO.o0000oo
    public final boolean OooOO0o(o0000O0 bytes) {
        OooOo.OooO0o0(bytes, "bytes");
        byte[] bArr = bytes.f32555OooOo0O;
        int length = bArr.length;
        if (this.f32576OooOo) {
            throw new IllegalStateException("closed");
        }
        if (length >= 0 && bArr.length >= length) {
            for (int i = 0; i < length; i++) {
                long j = i;
                if (request(1 + j) && this.f32578OooOo0o.OooO00o(j) == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f32576OooOo) {
            return;
        }
        this.f32576OooOo = true;
        this.f32577OooOo0O.close();
        o0000 o0000Var = this.f32578OooOo0o;
        o0000Var.skip(o0000Var.f32535OooOo0o);
    }

    public final boolean exhausted() {
        if (this.f32576OooOo) {
            throw new IllegalStateException("closed");
        }
        o0000 o0000Var = this.f32578OooOo0o;
        return o0000Var.exhausted() && this.f32577OooOo0O.OooO0oO(8192L, o0000Var) == -1;
    }

    public final long indexOf(byte b, long j, long j2) {
        o000O o000o;
        long j3;
        long j4;
        if (this.f32576OooOo) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (0 > j2) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j2, "fromIndex=0 toIndex=").toString());
        }
        while (jMax < j2) {
            o0000 o0000Var = this.f32578OooOo0o;
            o0000Var.getClass();
            long j5 = 0;
            if (0 > jMax || jMax > j2) {
                throw new IllegalArgumentException(("size=" + o0000Var.f32535OooOo0o + " fromIndex=" + jMax + " toIndex=" + j2).toString());
            }
            long j6 = o0000Var.f32535OooOo0o;
            long j7 = j2 > j6 ? j6 : j2;
            if (jMax == j7 || (o000o = o0000Var.f32534OooOo0O) == null) {
                j3 = -1;
                j4 = -1;
            } else if (j6 - jMax < jMax) {
                while (j6 > jMax) {
                    o000o = o000o.f32569OooO0oO;
                    OooOo.OooO0O0(o000o);
                    j6 -= o000o.f32565OooO0OO - o000o.f32564OooO0O0;
                }
                long j8 = jMax;
                while (j6 < j7) {
                    j3 = -1;
                    int iMin = (int) Math.min(o000o.f32565OooO0OO, (o000o.f32564OooO0O0 + j7) - j6);
                    for (int i = (int) ((o000o.f32564OooO0O0 + j8) - j6); i < iMin; i++) {
                        if (o000o.f32563OooO00o[i] == b) {
                            j4 = (i - o000o.f32564OooO0O0) + j6;
                            break;
                        }
                    }
                    j8 = j6 + (o000o.f32565OooO0OO - o000o.f32564OooO0O0);
                    o000o = o000o.f32567OooO0o;
                    OooOo.OooO0O0(o000o);
                    j6 = j8;
                }
                j3 = -1;
                j4 = -1;
            } else {
                j3 = -1;
                while (true) {
                    long j9 = (o000o.f32565OooO0OO - o000o.f32564OooO0O0) + j5;
                    if (j9 > jMax) {
                        break;
                    }
                    o000o = o000o.f32567OooO0o;
                    OooOo.OooO0O0(o000o);
                    j5 = j9;
                }
                long j10 = jMax;
                while (j5 < j7) {
                    long j11 = j10;
                    int iMin2 = (int) Math.min(o000o.f32565OooO0OO, (o000o.f32564OooO0O0 + j7) - j5);
                    for (int i2 = (int) ((o000o.f32564OooO0O0 + j11) - j5); i2 < iMin2; i2++) {
                        if (o000o.f32563OooO00o[i2] == b) {
                            j4 = (i2 - o000o.f32564OooO0O0) + j5;
                            break;
                        }
                    }
                    j10 = (o000o.f32565OooO0OO - o000o.f32564OooO0O0) + j5;
                    o000o = o000o.f32567OooO0o;
                    OooOo.OooO0O0(o000o);
                    j5 = j10;
                }
                j4 = -1;
            }
            if (j4 != j3) {
                return j4;
            }
            long j12 = o0000Var.f32535OooOo0o;
            if (j12 >= j2 || this.f32577OooOo0O.OooO0oO(8192L, o0000Var) == j3) {
                return j3;
            }
            jMax = Math.max(jMax, j12);
        }
        return -1L;
    }

    @Override // o00OOOoO.o0000oo
    public final InputStream inputStream() {
        return new o00000OO(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f32576OooOo;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        OooOo.OooO0o0(sink, "sink");
        o0000 o0000Var = this.f32578OooOo0o;
        if (o0000Var.f32535OooOo0o == 0 && this.f32577OooOo0O.OooO0oO(8192L, o0000Var) == -1) {
            return -1;
        }
        return o0000Var.read(sink);
    }

    public final byte readByte() throws EOFException {
        require(1L);
        return this.f32578OooOo0o.readByte();
    }

    @Override // o00OOOoO.o0000oo
    public final byte[] readByteArray() {
        o0000 o0000Var = this.f32578OooOo0o;
        o0000Var.OooO(this.f32577OooOo0O);
        return o0000Var.readByteArray(o0000Var.f32535OooOo0o);
    }

    public final void readFully(byte[] bArr) throws EOFException {
        o0000 o0000Var = this.f32578OooOo0o;
        try {
            require(bArr.length);
            o0000Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = o0000Var.f32535OooOo0o;
                if (j <= 0) {
                    throw e;
                }
                int i2 = o0000Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d0, code lost:
    
        if (r13 == 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00d2, code lost:
    
        r17 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00d5, code lost:
    
        r3 = o00OOoo.Oooo000.f32616OooO00o;
        r4 = r3[(r15 >> 4) & 15];
        r3 = r3[r15 & 15];
        r5 = new char[2];
        r5[r21] = r4;
        r5[r16] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00f6, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new java.lang.String(r5)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOoO.o000O0O0.readHexadecimalUnsignedLong():long");
    }

    public final int readInt() throws EOFException {
        require(4L);
        return this.f32578OooOo0o.readInt();
    }

    public final int readIntLe() throws EOFException {
        require(4L);
        int i = this.f32578OooOo0o.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public final long readLongLe() throws EOFException {
        char c;
        char c2;
        char c3;
        char c4;
        long j;
        require(8L);
        o0000 o0000Var = this.f32578OooOo0o;
        if (o0000Var.f32535OooOo0o < 8) {
            throw new EOFException();
        }
        o000O o000o = o0000Var.f32534OooOo0O;
        OooOo.OooO0O0(o000o);
        int i = o000o.f32564OooO0O0;
        int i2 = o000o.f32565OooO0OO;
        if (i2 - i < 8) {
            j = ((o0000Var.readInt() & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & o0000Var.readInt());
            c3 = '(';
            c4 = '8';
            c = '\b';
            c2 = 24;
        } else {
            byte[] bArr = o000o.f32563OooO00o;
            c = '\b';
            c2 = 24;
            c3 = '(';
            c4 = '8';
            int i3 = i + 7;
            long j2 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (bArr[i3] & 255);
            o0000Var.f32535OooOo0o -= 8;
            if (i4 == i2) {
                o0000Var.f32534OooOo0O = o000o.OooO00o();
                o000OO00.OooO00o(o000o);
            } else {
                o000o.f32564OooO0O0 = i4;
            }
            j = j3;
        }
        return ((j & 255) << c4) | (((-72057594037927936L) & j) >>> c4) | ((71776119061217280L & j) >>> c3) | ((280375465082880L & j) >>> c2) | ((1095216660480L & j) >>> c) | ((4278190080L & j) << c) | ((16711680 & j) << c2) | ((65280 & j) << c3);
    }

    public final short readShort() throws EOFException {
        require(2L);
        return this.f32578OooOo0o.readShort();
    }

    public final short readShortLe() throws EOFException {
        require(2L);
        return this.f32578OooOo0o.readShortLe();
    }

    @Override // o00OOOoO.o0000oo
    public final String readString(Charset charset) {
        OooOo.OooO0o0(charset, "charset");
        o0000 o0000Var = this.f32578OooOo0o;
        o0000Var.OooO(this.f32577OooOo0O);
        return o0000Var.readString(charset);
    }

    public final String readUtf8(long j) throws EOFException {
        require(j);
        o0000 o0000Var = this.f32578OooOo0o;
        o0000Var.getClass();
        return o0000Var.readString(j, o0OO00O.f31451OooO00o);
    }

    public final String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "limit < 0: ").toString());
        }
        long j2 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j2);
        o0000 o0000Var = this.f32578OooOo0o;
        if (jIndexOf != -1) {
            return o00OOoo.OooOo.OooO00o(jIndexOf, o0000Var);
        }
        if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && request(j2) && o0000Var.OooO00o(j2 - 1) == 13 && request(j2 + 1) && o0000Var.OooO00o(j2) == 10) {
            return o00OOoo.OooOo.OooO00o(j2, o0000Var);
        }
        o0000 out = new o0000();
        long jMin = Math.min(32, o0000Var.f32535OooOo0o);
        long j3 = 0;
        o0000Var.getClass();
        OooOo.OooO0o0(out, "out");
        o0OOO0.OooO0o0(o0000Var.f32535OooOo0o, 0L, jMin);
        if (jMin != 0) {
            out.f32535OooOo0o += jMin;
            o000O o000o = o0000Var.f32534OooOo0O;
            while (true) {
                OooOo.OooO0O0(o000o);
                long j4 = o000o.f32565OooO0OO - o000o.f32564OooO0O0;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                o000o = o000o.f32567OooO0o;
            }
            long j5 = j3;
            long j6 = jMin;
            while (j6 > 0) {
                OooOo.OooO0O0(o000o);
                o000O o000oOooO0OO = o000o.OooO0OO();
                int i = o000oOooO0OO.f32564OooO0O0 + ((int) j5);
                o000oOooO0OO.f32564OooO0O0 = i;
                o000oOooO0OO.f32565OooO0OO = Math.min(i + ((int) j6), o000oOooO0OO.f32565OooO0OO);
                o000O o000o2 = out.f32534OooOo0O;
                if (o000o2 == null) {
                    o000oOooO0OO.f32569OooO0oO = o000oOooO0OO;
                    o000oOooO0OO.f32567OooO0o = o000oOooO0OO;
                    out.f32534OooOo0O = o000oOooO0OO;
                } else {
                    o000O o000o3 = o000o2.f32569OooO0oO;
                    OooOo.OooO0O0(o000o3);
                    o000o3.OooO0O0(o000oOooO0OO);
                }
                j6 -= o000oOooO0OO.f32565OooO0OO - o000oOooO0OO.f32564OooO0O0;
                o000o = o000o.f32567OooO0o;
                j5 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(o0000Var.f32535OooOo0o, j) + " content=" + out.OooO0OO(out.f32535OooOo0o).OooO0o() + (char) 8230);
    }

    public final boolean request(long j) {
        o0000 o0000Var;
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
        }
        if (this.f32576OooOo) {
            throw new IllegalStateException("closed");
        }
        do {
            o0000Var = this.f32578OooOo0o;
            if (o0000Var.f32535OooOo0o >= j) {
                return true;
            }
        } while (this.f32577OooOo0O.OooO0oO(8192L, o0000Var) != -1);
        return false;
    }

    public final void require(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // o00OOOoO.o0000oo
    public final void skip(long j) throws EOFException {
        if (this.f32576OooOo) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            o0000 o0000Var = this.f32578OooOo0o;
            if (o0000Var.f32535OooOo0o == 0 && this.f32577OooOo0O.OooO0oO(8192L, o0000Var) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, o0000Var.f32535OooOo0o);
            o0000Var.skip(jMin);
            j -= jMin;
        }
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return this.f32577OooOo0O.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f32577OooOo0O + ')';
    }
}

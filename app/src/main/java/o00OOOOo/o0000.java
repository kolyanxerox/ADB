package o00OOOoO;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import o00OOoo.Oooo000;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class o0000 implements o0000oo, o0000O00, Cloneable, ByteChannel, AutoCloseable {

    /* renamed from: OooOo0O */
    public o000O f32534OooOo0O;

    /* renamed from: OooOo0o */
    public long f32535OooOo0o;

    public final void OooO(o0O0ooO source) {
        OooOo.OooO0o0(source, "source");
        while (source.OooO0oO(8192L, this) != -1) {
        }
    }

    public final byte OooO00o(long j) {
        o0OOO0.OooO0o0(this.f32535OooOo0o, j, 1L);
        o000O o000o = this.f32534OooOo0O;
        if (o000o == null) {
            OooOo.OooO0O0(null);
            throw null;
        }
        long j2 = this.f32535OooOo0o;
        if (j2 - j < j) {
            while (j2 > j) {
                o000o = o000o.f32569OooO0oO;
                OooOo.OooO0O0(o000o);
                j2 -= o000o.f32565OooO0OO - o000o.f32564OooO0O0;
            }
            return o000o.f32563OooO00o[(int) ((o000o.f32564OooO0O0 + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = o000o.f32565OooO0OO;
            int i2 = o000o.f32564OooO0O0;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return o000o.f32563OooO00o[(int) ((i2 + j) - j3)];
            }
            o000o = o000o.f32567OooO0o;
            OooOo.OooO0O0(o000o);
            j3 = j4;
        }
    }

    public final long OooO0O0(o0000O0 targetBytes) {
        int i;
        int i2;
        OooOo.OooO0o0(targetBytes, "targetBytes");
        o000O o000o = this.f32534OooOo0O;
        if (o000o == null) {
            return -1L;
        }
        long j = this.f32535OooOo0o;
        long j2 = 0;
        byte[] bArr = targetBytes.f32555OooOo0O;
        if (j < 0) {
            while (j > 0) {
                o000o = o000o.f32569OooO0oO;
                OooOo.OooO0O0(o000o);
                j -= o000o.f32565OooO0OO - o000o.f32564OooO0O0;
            }
            if (bArr.length == 2) {
                byte b = bArr[0];
                byte b2 = bArr[1];
                while (j < this.f32535OooOo0o) {
                    i = (int) ((o000o.f32564OooO0O0 + j2) - j);
                    int i3 = o000o.f32565OooO0OO;
                    while (i < i3) {
                        byte b3 = o000o.f32563OooO00o[i];
                        if (b3 == b || b3 == b2) {
                            i2 = o000o.f32564OooO0O0;
                        } else {
                            i++;
                        }
                    }
                    j2 = (o000o.f32565OooO0OO - o000o.f32564OooO0O0) + j;
                    o000o = o000o.f32567OooO0o;
                    OooOo.OooO0O0(o000o);
                    j = j2;
                }
                return -1L;
            }
            while (j < this.f32535OooOo0o) {
                i = (int) ((o000o.f32564OooO0O0 + j2) - j);
                int i4 = o000o.f32565OooO0OO;
                while (i < i4) {
                    byte b4 = o000o.f32563OooO00o[i];
                    for (byte b5 : bArr) {
                        if (b4 == b5) {
                            i2 = o000o.f32564OooO0O0;
                        }
                    }
                    i++;
                }
                j2 = (o000o.f32565OooO0OO - o000o.f32564OooO0O0) + j;
                o000o = o000o.f32567OooO0o;
                OooOo.OooO0O0(o000o);
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = (o000o.f32565OooO0OO - o000o.f32564OooO0O0) + j;
            if (j3 > 0) {
                break;
            }
            o000o = o000o.f32567OooO0o;
            OooOo.OooO0O0(o000o);
            j = j3;
        }
        if (bArr.length == 2) {
            byte b6 = bArr[0];
            byte b7 = bArr[1];
            while (j < this.f32535OooOo0o) {
                i = (int) ((o000o.f32564OooO0O0 + j2) - j);
                int i5 = o000o.f32565OooO0OO;
                while (i < i5) {
                    byte b8 = o000o.f32563OooO00o[i];
                    if (b8 == b6 || b8 == b7) {
                        i2 = o000o.f32564OooO0O0;
                    } else {
                        i++;
                    }
                }
                j2 = (o000o.f32565OooO0OO - o000o.f32564OooO0O0) + j;
                o000o = o000o.f32567OooO0o;
                OooOo.OooO0O0(o000o);
                j = j2;
            }
            return -1L;
        }
        while (j < this.f32535OooOo0o) {
            i = (int) ((o000o.f32564OooO0O0 + j2) - j);
            int i6 = o000o.f32565OooO0OO;
            while (i < i6) {
                byte b9 = o000o.f32563OooO00o[i];
                for (byte b10 : bArr) {
                    if (b9 == b10) {
                        i2 = o000o.f32564OooO0O0;
                    }
                }
                i++;
            }
            j2 = (o000o.f32565OooO0OO - o000o.f32564OooO0O0) + j;
            o000o = o000o.f32567OooO0o;
            OooOo.OooO0O0(o000o);
            j = j2;
        }
        return -1L;
        return (i - i2) + j;
    }

    public final o0000O0 OooO0OO(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount: ").toString());
        }
        if (this.f32535OooOo0o < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new o0000O0(readByteArray(j));
        }
        o0000O0 o0000o0OooO0Oo = OooO0Oo((int) j);
        skip(j);
        return o0000o0OooO0Oo;
    }

    public final o0000O0 OooO0Oo(int i) {
        if (i == 0) {
            return o0000O0.f32553OooOoO0;
        }
        o0OOO0.OooO0o0(this.f32535OooOo0o, 0L, i);
        o000O o000o = this.f32534OooOo0O;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            OooOo.OooO0O0(o000o);
            int i5 = o000o.f32565OooO0OO;
            int i6 = o000o.f32564OooO0O0;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            o000o = o000o.f32567OooO0o;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        o000O o000o2 = this.f32534OooOo0O;
        int i7 = 0;
        while (i2 < i) {
            OooOo.OooO0O0(o000o2);
            bArr[i7] = o000o2.f32563OooO00o;
            i2 += o000o2.f32565OooO0OO - o000o2.f32564OooO0O0;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = o000o2.f32564OooO0O0;
            o000o2.f32566OooO0Oo = true;
            i7++;
            o000o2 = o000o2.f32567OooO0o;
        }
        return new o000OOo0(bArr, iArr);
    }

    public final void OooO0o(o0000O0 byteString) {
        OooOo.OooO0o0(byteString, "byteString");
        byteString.OooOo00(this, byteString.OooO0o0());
    }

    public final o000O OooO0o0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        o000O o000o = this.f32534OooOo0O;
        if (o000o == null) {
            o000O o000oOooO0O0 = o000OO00.OooO0O0();
            this.f32534OooOo0O = o000oOooO0O0;
            o000oOooO0O0.f32569OooO0oO = o000oOooO0O0;
            o000oOooO0O0.f32567OooO0o = o000oOooO0O0;
            return o000oOooO0O0;
        }
        o000O o000o2 = o000o.f32569OooO0oO;
        OooOo.OooO0O0(o000o2);
        if (o000o2.f32565OooO0OO + i <= 8192 && o000o2.f32568OooO0o0) {
            return o000o2;
        }
        o000O o000oOooO0O02 = o000OO00.OooO0O0();
        o000o2.OooO0O0(o000oOooO0O02);
        return o000oOooO0O02;
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 sink) {
        OooOo.OooO0o0(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f32535OooOo0o;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.OooOO0(j, this);
        return j;
    }

    public final void OooO0oo(byte[] source, int i, int i2) {
        OooOo.OooO0o0(source, "source");
        long j = i2;
        o0OOO0.OooO0o0(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            o000O o000oOooO0o0 = OooO0o0(1);
            int iMin = Math.min(i3 - i, 8192 - o000oOooO0o0.f32565OooO0OO);
            int i4 = i + iMin;
            OooOOO.Oooo0O0(source, o000oOooO0o0.f32565OooO0OO, o000oOooO0o0.f32563OooO00o, i, i4);
            o000oOooO0o0.f32565OooO0OO += iMin;
            i = i4;
        }
        this.f32535OooOo0o += j;
    }

    @Override // o00OOOoO.o00
    public final void OooOO0(long j, o0000 source) {
        o000O o000oOooO0O0;
        OooOo.OooO0o0(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        o0OOO0.OooO0o0(source.f32535OooOo0o, 0L, j);
        while (j > 0) {
            o000O o000o = source.f32534OooOo0O;
            OooOo.OooO0O0(o000o);
            int i = o000o.f32565OooO0OO;
            o000O o000o2 = source.f32534OooOo0O;
            OooOo.OooO0O0(o000o2);
            long j2 = i - o000o2.f32564OooO0O0;
            int i2 = 0;
            if (j < j2) {
                o000O o000o3 = this.f32534OooOo0O;
                o000O o000o4 = o000o3 != null ? o000o3.f32569OooO0oO : null;
                if (o000o4 != null && o000o4.f32568OooO0o0) {
                    if ((o000o4.f32565OooO0OO + j) - (o000o4.f32566OooO0Oo ? 0 : o000o4.f32564OooO0O0) <= 8192) {
                        o000O o000o5 = source.f32534OooOo0O;
                        OooOo.OooO0O0(o000o5);
                        o000o5.OooO0Oo(o000o4, (int) j);
                        source.f32535OooOo0o -= j;
                        this.f32535OooOo0o += j;
                        return;
                    }
                }
                o000O o000o6 = source.f32534OooOo0O;
                OooOo.OooO0O0(o000o6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > o000o6.f32565OooO0OO - o000o6.f32564OooO0O0) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    o000oOooO0O0 = o000o6.OooO0OO();
                } else {
                    o000oOooO0O0 = o000OO00.OooO0O0();
                    int i4 = o000o6.f32564OooO0O0;
                    OooOOO.Oooo0O0(o000o6.f32563OooO00o, 0, o000oOooO0O0.f32563OooO00o, i4, i4 + i3);
                }
                o000oOooO0O0.f32565OooO0OO = o000oOooO0O0.f32564OooO0O0 + i3;
                o000o6.f32564OooO0O0 += i3;
                o000O o000o7 = o000o6.f32569OooO0oO;
                OooOo.OooO0O0(o000o7);
                o000o7.OooO0O0(o000oOooO0O0);
                source.f32534OooOo0O = o000oOooO0O0;
            }
            o000O o000o8 = source.f32534OooOo0O;
            OooOo.OooO0O0(o000o8);
            long j3 = o000o8.f32565OooO0OO - o000o8.f32564OooO0O0;
            source.f32534OooOo0O = o000o8.OooO00o();
            o000O o000o9 = this.f32534OooOo0O;
            if (o000o9 == null) {
                this.f32534OooOo0O = o000o8;
                o000o8.f32569OooO0oO = o000o8;
                o000o8.f32567OooO0o = o000o8;
            } else {
                o000O o000o10 = o000o9.f32569OooO0oO;
                OooOo.OooO0O0(o000o10);
                o000o10.OooO0O0(o000o8);
                o000O o000o11 = o000o8.f32569OooO0oO;
                if (o000o11 == o000o8) {
                    throw new IllegalStateException("cannot compact");
                }
                OooOo.OooO0O0(o000o11);
                if (o000o11.f32568OooO0o0) {
                    int i5 = o000o8.f32565OooO0OO - o000o8.f32564OooO0O0;
                    o000O o000o12 = o000o8.f32569OooO0oO;
                    OooOo.OooO0O0(o000o12);
                    int i6 = 8192 - o000o12.f32565OooO0OO;
                    o000O o000o13 = o000o8.f32569OooO0oO;
                    OooOo.OooO0O0(o000o13);
                    if (!o000o13.f32566OooO0Oo) {
                        o000O o000o14 = o000o8.f32569OooO0oO;
                        OooOo.OooO0O0(o000o14);
                        i2 = o000o14.f32564OooO0O0;
                    }
                    if (i5 <= i6 + i2) {
                        o000O o000o15 = o000o8.f32569OooO0oO;
                        OooOo.OooO0O0(o000o15);
                        o000o8.OooO0Oo(o000o15, i5);
                        o000o8.OooO00o();
                        o000OO00.OooO00o(o000o8);
                    }
                }
            }
            source.f32535OooOo0o -= j3;
            this.f32535OooOo0o += j3;
            j -= j3;
        }
    }

    public final void OooOO0O(int i) {
        o000O o000oOooO0o0 = OooO0o0(1);
        int i2 = o000oOooO0o0.f32565OooO0OO;
        o000oOooO0o0.f32565OooO0OO = i2 + 1;
        o000oOooO0o0.f32563OooO00o[i2] = (byte) i;
        this.f32535OooOo0o++;
    }

    @Override // o00OOOoO.o0000oo
    public final boolean OooOO0o(o0000O0 bytes) {
        OooOo.OooO0o0(bytes, "bytes");
        byte[] bArr = bytes.f32555OooOo0O;
        int length = bArr.length;
        if (length >= 0 && this.f32535OooOo0o >= length && bArr.length >= length) {
            for (int i = 0; i < length; i++) {
                if (OooO00o(i) == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void OooOOO(int i, int i2, String string) {
        char cCharAt;
        OooOo.OooO0o0(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i2, "endIndex > string.length: ", " > ");
            sbOooOOo0.append(string.length());
            throw new IllegalArgumentException(sbOooOOo0.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                o000O o000oOooO0o0 = OooO0o0(1);
                int i3 = o000oOooO0o0.f32565OooO0OO - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = o000oOooO0o0.f32563OooO00o;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = o000oOooO0o0.f32565OooO0OO;
                int i6 = (i3 + i) - i5;
                o000oOooO0o0.f32565OooO0OO = i5 + i6;
                this.f32535OooOo0o += i6;
            } else {
                if (cCharAt2 < 2048) {
                    o000O o000oOooO0o02 = OooO0o0(2);
                    int i7 = o000oOooO0o02.f32565OooO0OO;
                    byte[] bArr2 = o000oOooO0o02.f32563OooO00o;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    o000oOooO0o02.f32565OooO0OO = i7 + 2;
                    this.f32535OooOo0o += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    o000O o000oOooO0o03 = OooO0o0(3);
                    int i8 = o000oOooO0o03.f32565OooO0OO;
                    byte[] bArr3 = o000oOooO0o03.f32563OooO00o;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    o000oOooO0o03.f32565OooO0OO = i8 + 3;
                    this.f32535OooOo0o += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        OooOO0O(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        o000O o000oOooO0o04 = OooO0o0(4);
                        int i11 = o000oOooO0o04.f32565OooO0OO;
                        byte[] bArr4 = o000oOooO0o04.f32563OooO00o;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        o000oOooO0o04.f32565OooO0OO = i11 + 4;
                        this.f32535OooOo0o += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void OooOOO0(long j) {
        if (j == 0) {
            OooOO0O(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        o000O o000oOooO0o0 = OooO0o0(i);
        int i2 = o000oOooO0o0.f32565OooO0OO;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            o000oOooO0o0.f32563OooO00o[i3] = o00OOoo.OooOo.f32610OooO00o[(int) (15 & j)];
            j >>>= 4;
        }
        o000oOooO0o0.f32565OooO0OO += i;
        this.f32535OooOo0o += i;
    }

    public final void OooOOOO(String string) {
        OooOo.OooO0o0(string, "string");
        OooOOO(0, string.length(), string);
    }

    public final void OooOOOo(int i) {
        String strOooOoo;
        int i2 = 0;
        if (i < 128) {
            OooOO0O(i);
            return;
        }
        if (i < 2048) {
            o000O o000oOooO0o0 = OooO0o0(2);
            int i3 = o000oOooO0o0.f32565OooO0OO;
            byte[] bArr = o000oOooO0o0.f32563OooO00o;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            o000oOooO0o0.f32565OooO0OO = i3 + 2;
            this.f32535OooOo0o += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            OooOO0O(63);
            return;
        }
        if (i < 65536) {
            o000O o000oOooO0o02 = OooO0o0(3);
            int i4 = o000oOooO0o02.f32565OooO0OO;
            byte[] bArr2 = o000oOooO0o02.f32563OooO00o;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            o000oOooO0o02.f32565OooO0OO = i4 + 3;
            this.f32535OooOo0o += 3;
            return;
        }
        if (i <= 1114111) {
            o000O o000oOooO0o03 = OooO0o0(4);
            int i5 = o000oOooO0o03.f32565OooO0OO;
            byte[] bArr3 = o000oOooO0o03.f32563OooO00o;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            o000oOooO0o03.f32565OooO0OO = i5 + 4;
            this.f32535OooOo0o += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = Oooo000.f32616OooO00o;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            strOooOoo = o00O0oO.o0000O00.OooOoo(cArr2, i2, 8);
        } else {
            strOooOoo = "0";
        }
        sb.append(strOooOoo);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Object clone() {
        o0000 o0000Var = new o0000();
        if (this.f32535OooOo0o == 0) {
            return o0000Var;
        }
        o000O o000o = this.f32534OooOo0O;
        OooOo.OooO0O0(o000o);
        o000O o000oOooO0OO = o000o.OooO0OO();
        o0000Var.f32534OooOo0O = o000oOooO0OO;
        o000oOooO0OO.f32569OooO0oO = o000oOooO0OO;
        o000oOooO0OO.f32567OooO0o = o000oOooO0OO;
        for (o000O o000o2 = o000o.f32567OooO0o; o000o2 != o000o; o000o2 = o000o2.f32567OooO0o) {
            o000O o000o3 = o000oOooO0OO.f32569OooO0oO;
            OooOo.OooO0O0(o000o3);
            OooOo.OooO0O0(o000o2);
            o000o3.OooO0O0(o000o2.OooO0OO());
        }
        o0000Var.f32535OooOo0o = this.f32535OooOo0o;
        return o0000Var;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        boolean z2 = false;
        if (!(obj instanceof o0000)) {
            return false;
        }
        long j = this.f32535OooOo0o;
        o0000 o0000Var = (o0000) obj;
        if (j != o0000Var.f32535OooOo0o) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        o000O o000o = this.f32534OooOo0O;
        OooOo.OooO0O0(o000o);
        o000O o000o2 = o0000Var.f32534OooOo0O;
        OooOo.OooO0O0(o000o2);
        int i = o000o.f32564OooO0O0;
        int i2 = o000o2.f32564OooO0O0;
        long j2 = 0;
        while (j2 < this.f32535OooOo0o) {
            long jMin = Math.min(o000o.f32565OooO0OO - i, o000o2.f32565OooO0OO - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                boolean z3 = z;
                byte b = o000o.f32563OooO00o[i];
                int i4 = i2 + 1;
                boolean z4 = z2;
                if (b != o000o2.f32563OooO00o[i2]) {
                    return z4;
                }
                j3++;
                i2 = i4;
                i = i3;
                z = z3;
                z2 = z4;
            }
            boolean z5 = z;
            boolean z6 = z2;
            if (i == o000o.f32565OooO0OO) {
                o000O o000o3 = o000o.f32567OooO0o;
                OooOo.OooO0O0(o000o3);
                i = o000o3.f32564OooO0O0;
                o000o = o000o3;
            }
            if (i2 == o000o2.f32565OooO0OO) {
                o000o2 = o000o2.f32567OooO0o;
                OooOo.OooO0O0(o000o2);
                i2 = o000o2.f32564OooO0O0;
            }
            j2 += jMin;
            z = z5;
            z2 = z6;
        }
        return z;
    }

    public final boolean exhausted() {
        return this.f32535OooOo0o == 0;
    }

    public final int hashCode() {
        o000O o000o = this.f32534OooOo0O;
        if (o000o == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = o000o.f32565OooO0OO;
            for (int i3 = o000o.f32564OooO0O0; i3 < i2; i3++) {
                i = (i * 31) + o000o.f32563OooO00o[i3];
            }
            o000o = o000o.f32567OooO0o;
            OooOo.OooO0O0(o000o);
        } while (o000o != this.f32534OooOo0O);
        return i;
    }

    @Override // o00OOOoO.o0000oo
    public final InputStream inputStream() {
        return new o00000OO(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // o00OOOoO.o0000O00
    public final OutputStream outputStream() {
        return new o0000Ooo(this, 0);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        OooOo.OooO0o0(sink, "sink");
        o000O o000o = this.f32534OooOo0O;
        if (o000o == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), o000o.f32565OooO0OO - o000o.f32564OooO0O0);
        sink.put(o000o.f32563OooO00o, o000o.f32564OooO0O0, iMin);
        int i = o000o.f32564OooO0O0 + iMin;
        o000o.f32564OooO0O0 = i;
        this.f32535OooOo0o -= iMin;
        if (i == o000o.f32565OooO0OO) {
            this.f32534OooOo0O = o000o.OooO00o();
            o000OO00.OooO00o(o000o);
        }
        return iMin;
    }

    public final byte readByte() throws EOFException {
        if (this.f32535OooOo0o == 0) {
            throw new EOFException();
        }
        o000O o000o = this.f32534OooOo0O;
        OooOo.OooO0O0(o000o);
        int i = o000o.f32564OooO0O0;
        int i2 = o000o.f32565OooO0OO;
        int i3 = i + 1;
        byte b = o000o.f32563OooO00o[i];
        this.f32535OooOo0o--;
        if (i3 != i2) {
            o000o.f32564OooO0O0 = i3;
            return b;
        }
        this.f32534OooOo0O = o000o.OooO00o();
        o000OO00.OooO00o(o000o);
        return b;
    }

    @Override // o00OOOoO.o0000oo
    public final byte[] readByteArray() {
        return readByteArray(this.f32535OooOo0o);
    }

    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    public final int readInt() throws EOFException {
        if (this.f32535OooOo0o < 4) {
            throw new EOFException();
        }
        o000O o000o = this.f32534OooOo0O;
        OooOo.OooO0O0(o000o);
        int i = o000o.f32564OooO0O0;
        int i2 = o000o.f32565OooO0OO;
        if (i2 - i < 4) {
            return ((readByte() & ForkServer.ERROR) << 24) | ((readByte() & ForkServer.ERROR) << 16) | ((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR);
        }
        byte[] bArr = o000o.f32563OooO00o;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & ForkServer.ERROR) << 16) | ((bArr[i] & ForkServer.ERROR) << 24) | ((bArr[i + 2] & ForkServer.ERROR) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & ForkServer.ERROR);
        this.f32535OooOo0o -= 4;
        if (i5 != i2) {
            o000o.f32564OooO0O0 = i5;
            return i6;
        }
        this.f32534OooOo0O = o000o.OooO00o();
        o000OO00.OooO00o(o000o);
        return i6;
    }

    public final short readShort() throws EOFException {
        if (this.f32535OooOo0o < 2) {
            throw new EOFException();
        }
        o000O o000o = this.f32534OooOo0O;
        OooOo.OooO0O0(o000o);
        int i = o000o.f32564OooO0O0;
        int i2 = o000o.f32565OooO0OO;
        if (i2 - i < 2) {
            return (short) (((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR));
        }
        int i3 = i + 1;
        byte[] bArr = o000o.f32563OooO00o;
        int i4 = (bArr[i] & ForkServer.ERROR) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & ForkServer.ERROR) | i4;
        this.f32535OooOo0o -= 2;
        if (i5 == i2) {
            this.f32534OooOo0O = o000o.OooO00o();
            o000OO00.OooO00o(o000o);
        } else {
            o000o.f32564OooO0O0 = i5;
        }
        return (short) i6;
    }

    public final short readShortLe() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // o00OOOoO.o0000oo
    public final String readString(Charset charset) {
        OooOo.OooO0o0(charset, "charset");
        return readString(this.f32535OooOo0o, charset);
    }

    @Override // o00OOOoO.o0000oo
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            o000O o000o = this.f32534OooOo0O;
            if (o000o == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, o000o.f32565OooO0OO - o000o.f32564OooO0O0);
            long j2 = iMin;
            this.f32535OooOo0o -= j2;
            j -= j2;
            int i = o000o.f32564OooO0O0 + iMin;
            o000o.f32564OooO0O0 = i;
            if (i == o000o.f32565OooO0OO) {
                this.f32534OooOo0O = o000o.OooO00o();
                o000OO00.OooO00o(o000o);
            }
        }
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return o00O000.f32601OooO0Oo;
    }

    public final String toString() {
        long j = this.f32535OooOo0o;
        if (j <= 2147483647L) {
            return OooO0Oo((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f32535OooOo0o).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        OooOo.OooO0o0(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            o000O o000oOooO0o0 = OooO0o0(1);
            int iMin = Math.min(i, 8192 - o000oOooO0o0.f32565OooO0OO);
            source.get(o000oOooO0o0.f32563OooO00o, o000oOooO0o0.f32565OooO0OO, iMin);
            i -= iMin;
            o000oOooO0o0.f32565OooO0OO += iMin;
        }
        this.f32535OooOo0o += iRemaining;
        return iRemaining;
    }

    @Override // o00OOOoO.o0000O00
    public final /* bridge */ /* synthetic */ o0000O00 writeUtf8(String str) {
        OooOOOO(str);
        return this;
    }

    public final String readString(long j, Charset charset) throws EOFException {
        OooOo.OooO0o0(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount: ").toString());
        }
        if (this.f32535OooOo0o < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        o000O o000o = this.f32534OooOo0O;
        OooOo.OooO0O0(o000o);
        int i = o000o.f32564OooO0O0;
        if (i + j > o000o.f32565OooO0OO) {
            return new String(readByteArray(j), charset);
        }
        int i2 = (int) j;
        String str = new String(o000o.f32563OooO00o, i, i2, charset);
        int i3 = o000o.f32564OooO0O0 + i2;
        o000o.f32564OooO0O0 = i3;
        this.f32535OooOo0o -= j;
        if (i3 == o000o.f32565OooO0OO) {
            this.f32534OooOo0O = o000o.OooO00o();
            o000OO00.OooO00o(o000o);
        }
        return str;
    }

    public final byte[] readByteArray(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount: ").toString());
        }
        if (this.f32535OooOo0o >= j) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new EOFException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        o0OOO0.OooO0o0(bArr.length, i, i2);
        o000O o000o = this.f32534OooOo0O;
        if (o000o == null) {
            return -1;
        }
        int iMin = Math.min(i2, o000o.f32565OooO0OO - o000o.f32564OooO0O0);
        int i3 = o000o.f32564OooO0O0;
        OooOOO.Oooo0O0(o000o.f32563OooO00o, i, bArr, i3, i3 + iMin);
        int i4 = o000o.f32564OooO0O0 + iMin;
        o000o.f32564OooO0O0 = i4;
        this.f32535OooOo0o -= iMin;
        if (i4 == o000o.f32565OooO0OO) {
            this.f32534OooOo0O = o000o.OooO00o();
            o000OO00.OooO00o(o000o);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o00OOOoO.o00
    public final void close() {
    }

    @Override // o00OOOoO.o00, java.io.Flushable
    public final void flush() {
    }
}

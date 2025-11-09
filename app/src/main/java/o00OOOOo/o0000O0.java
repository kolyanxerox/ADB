package o00OOOoO;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import o00O0oO.o0OO00O;
import o00OOoo.Oooo000;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public class o0000O0 implements Serializable, Comparable {

    /* renamed from: OooOoO0 */
    public static final o0000O0 f32553OooOoO0 = new o0000O0(new byte[0]);

    /* renamed from: OooOo */
    public transient String f32554OooOo;

    /* renamed from: OooOo0O */
    public final byte[] f32555OooOo0O;

    /* renamed from: OooOo0o */
    public transient int f32556OooOo0o;

    public o0000O0(byte[] data) {
        OooOo.OooO0o0(data, "data");
        this.f32555OooOo0O = data;
    }

    public static final o0000O0 OooO0O0(String str) {
        OooOo.OooO0o0(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Oooo000.OooO00o(str.charAt(i2 + 1)) + (Oooo000.OooO00o(str.charAt(i2)) << 4));
        }
        return new o0000O0(bArr);
    }

    public static int OooO0oo(o0000O0 o0000o02, o0000O0 other) {
        o0000o02.getClass();
        OooOo.OooO0o0(other, "other");
        return o0000o02.OooO0oO(other.f32555OooOo0O, 0);
    }

    public static int OooOO0o(o0000O0 o0000o02, o0000O0 other) {
        o0000o02.getClass();
        OooOo.OooO0o0(other, "other");
        return o0000o02.OooOO0O(other.f32555OooOo0O);
    }

    public static final o0000O0 OooOOO0(byte... data) {
        OooOo.OooO0o0(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        OooOo.OooO0Oo(bArrCopyOf, "copyOf(this, size)");
        return new o0000O0(bArrCopyOf);
    }

    public static /* synthetic */ o0000O0 OooOOo0(o0000O0 o0000o02, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return o0000o02.OooOOOo(i, i2);
    }

    public byte[] OooO() {
        return this.f32555OooOo0O;
    }

    @Override // java.lang.Comparable
    /* renamed from: OooO00o */
    public final int compareTo(o0000O0 other) {
        OooOo.OooO0o0(other, "other");
        int iOooO0o0 = OooO0o0();
        int iOooO0o02 = other.OooO0o0();
        int iMin = Math.min(iOooO0o0, iOooO0o02);
        for (int i = 0; i < iMin; i++) {
            int iOooOO0 = OooOO0(i) & ForkServer.ERROR;
            int iOooOO02 = other.OooOO0(i) & ForkServer.ERROR;
            if (iOooOO0 != iOooOO02) {
                return iOooOO0 < iOooOO02 ? -1 : 1;
            }
        }
        if (iOooO0o0 == iOooO0o02) {
            return 0;
        }
        return iOooO0o0 < iOooO0o02 ? -1 : 1;
    }

    public o0000O0 OooO0OO(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f32555OooOo0O, 0, OooO0o0());
        byte[] digestBytes = messageDigest.digest();
        OooOo.OooO0Oo(digestBytes, "digestBytes");
        return new o0000O0(digestBytes);
    }

    public String OooO0o() {
        byte[] bArr = this.f32555OooOo0O;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = Oooo000.f32616OooO00o;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int OooO0o0() {
        return this.f32555OooOo0O.length;
    }

    public int OooO0oO(byte[] other, int i) {
        OooOo.OooO0o0(other, "other");
        byte[] bArr = this.f32555OooOo0O;
        int length = bArr.length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!o0OOO0.OooO0O0(bArr, iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte OooOO0(int i) {
        return this.f32555OooOo0O[i];
    }

    public int OooOO0O(byte[] other) {
        OooOo.OooO0o0(other, "other");
        int iOooO0o0 = OooO0o0();
        byte[] bArr = this.f32555OooOo0O;
        for (int iMin = Math.min(iOooO0o0, bArr.length - other.length); -1 < iMin; iMin--) {
            if (o0OOO0.OooO0O0(bArr, iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean OooOOO(int i, o0000O0 other, int i2) {
        OooOo.OooO0o0(other, "other");
        return other.OooOOOO(0, this.f32555OooOo0O, i, i2);
    }

    public boolean OooOOOO(int i, byte[] other, int i2, int i3) {
        OooOo.OooO0o0(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f32555OooOo0O;
        return i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && o0OOO0.OooO0O0(bArr, i, other, i2, i3);
    }

    public o0000O0 OooOOOo(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = OooO0o0();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f32555OooOo0O;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOOO0(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new o0000O0(OooOOO.Oooo0oo(bArr, i, i2));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public o0000O0 OooOOo() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f32555OooOo0O;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                OooOo.OooO0Oo(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new o0000O0(bArrCopyOf);
            }
            i++;
        }
    }

    public final String OooOOoo() {
        String str = this.f32554OooOo;
        if (str != null) {
            return str;
        }
        byte[] bArrOooO = OooO();
        OooOo.OooO0o0(bArrOooO, "<this>");
        String str2 = new String(bArrOooO, o0OO00O.f31451OooO00o);
        this.f32554OooOo = str2;
        return str2;
    }

    public void OooOo00(o0000 buffer, int i) {
        OooOo.OooO0o0(buffer, "buffer");
        buffer.OooO0oo(this.f32555OooOo0O, 0, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0000O0) {
            o0000O0 o0000o02 = (o0000O0) obj;
            int iOooO0o0 = o0000o02.OooO0o0();
            byte[] bArr = this.f32555OooOo0O;
            if (iOooO0o0 == bArr.length && o0000o02.OooOOOO(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f32556OooOo0o;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f32555OooOo0O);
        this.f32556OooOo0o = iHashCode;
        return iHashCode;
    }

    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.f32555OooOo0O;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strOooOOoo = OooOOoo();
            String strSubstring = strOooOOoo.substring(0, i3);
            OooOo.OooO0Oo(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strOooo0 = o00O0oO.o0000O00.Oooo0(o00O0oO.o0000O00.Oooo0(o00O0oO.o0000O00.Oooo0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strOooOOoo.length()) {
                return OooO00o.OooO0o(']', "[text=", strOooo0);
            }
            return "[size=" + bArr.length + " text=" + strOooo0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + OooO0o() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOOO0(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new o0000O0(OooOOO.Oooo0oo(bArr, 0, 64))).OooO0o());
        sb.append("…]");
        return sb.toString();
    }
}

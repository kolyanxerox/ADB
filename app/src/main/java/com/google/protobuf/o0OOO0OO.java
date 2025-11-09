package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class o0OOO0OO {

    /* renamed from: OooO00o */
    public static final o0OOO0 f28370OooO00o;

    static {
        f28370OooO00o = (o0OO.f28350OooO0o0 && o0OO.f28348OooO0Oo && !OooO0OO.OooO00o()) ? new o0OOO0(0) : new o0OOO0(1);
    }

    public static int OooO00o(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return OooO0o(b, bArr[i]);
        }
        if (i3 == 2) {
            return OooO0oO(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int OooO0O0(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i3 == 1) {
            return OooO0o(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return OooO0oO(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    public static String OooO0OO(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        long j;
        byte bOooO0o;
        byte bOooO0o2;
        o0OOO0 o0ooo0 = f28370OooO00o;
        o0ooo0.getClass();
        if (byteBuffer.hasArray()) {
            return o0ooo0.OooO0Oo(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        if (!byteBuffer.isDirect()) {
            return o0OOO0.OooO0o0(byteBuffer, i, i2);
        }
        switch (o0ooo0.f28369OooO00o) {
            case 0:
                if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                long jOooO0O0 = o0OO.OooO0O0(byteBuffer) + i;
                long j2 = i2 + jOooO0O0;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (true) {
                    j = 1;
                    if (jOooO0O0 < j2 && (bOooO0o2 = o0OO.f28347OooO0OO.OooO0o(jOooO0O0)) >= 0) {
                        jOooO0O0++;
                        cArr[i3] = (char) bOooO0o2;
                        i3++;
                    }
                }
                int i4 = i3;
                while (jOooO0O0 < j2) {
                    long j3 = jOooO0O0 + j;
                    o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
                    byte bOooO0o3 = o0oo0oo0.OooO0o(jOooO0O0);
                    if (bOooO0o3 >= 0) {
                        int i5 = i4 + 1;
                        cArr[i4] = (char) bOooO0o3;
                        while (j3 < j2 && (bOooO0o = o0OO.f28347OooO0OO.OooO0o(j3)) >= 0) {
                            j3 += j;
                            cArr[i5] = (char) bOooO0o;
                            i5++;
                        }
                        i4 = i5;
                        jOooO0O0 = j3;
                    } else {
                        if (!(bOooO0o3 < -32)) {
                            if (bOooO0o3 < -16) {
                                if (j3 >= j2 - j) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                long j4 = jOooO0O0 + 2;
                                jOooO0O0 += 3;
                                o0OOO0.OooO0OO(bOooO0o3, o0oo0oo0.OooO0o(j3), o0oo0oo0.OooO0o(j4), cArr, i4);
                                i4++;
                            } else {
                                if (j3 >= j2 - 2) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                byte bOooO0o4 = o0oo0oo0.OooO0o(j3);
                                long j5 = jOooO0O0 + 3;
                                byte bOooO0o5 = o0oo0oo0.OooO0o(jOooO0O0 + 2);
                                jOooO0O0 += 4;
                                o0OOO0.OooO00o(bOooO0o3, bOooO0o4, bOooO0o5, o0oo0oo0.OooO0o(j5), cArr, i4);
                                i4 += 2;
                            }
                        } else {
                            if (j3 >= j2) {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                            jOooO0O0 += 2;
                            o0OOO0.OooO0O0(bOooO0o3, o0oo0oo0.OooO0o(j3), cArr, i4);
                            i4++;
                        }
                    }
                    j = 1;
                }
                return new String(cArr, 0, i4);
            default:
                return o0OOO0.OooO0o0(byteBuffer, i, i2);
        }
    }

    public static void OooO0Oo(String str, ByteBuffer byteBuffer) {
        long j;
        char c;
        long j2;
        long j3;
        long j4;
        int i;
        char c2;
        char cCharAt;
        o0OOO0 o0ooo0 = f28370OooO00o;
        o0ooo0.getClass();
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(o0ooo0.OooO0o(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            return;
        }
        if (!byteBuffer.isDirect()) {
            o0OOO0.OooO0oO(str, byteBuffer);
            return;
        }
        switch (o0ooo0.f28369OooO00o) {
            case 0:
                long jOooO0O0 = o0OO.OooO0O0(byteBuffer);
                long jPosition = byteBuffer.position() + jOooO0O0;
                long jLimit = byteBuffer.limit() + jOooO0O0;
                int length = str.length();
                if (length > jLimit - jPosition) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
                }
                int i2 = 0;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i2 < length && (cCharAt = str.charAt(i2)) < 128) {
                        o0OO.OooOOO0(jPosition, (byte) cCharAt);
                        i2++;
                        jPosition = 1 + jPosition;
                    }
                }
                if (i2 == length) {
                    byteBuffer.position((int) (jPosition - jOooO0O0));
                    return;
                }
                while (i2 < length) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 >= c || jPosition >= jLimit) {
                        j2 = j;
                        if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                            long j5 = jPosition + j2;
                            o0OO.OooOOO0(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                            jPosition += 2;
                            o0OO.OooOOO0(j5, (byte) ((cCharAt2 & '?') | 128));
                            j3 = jOooO0O0;
                            j4 = jLimit;
                        } else {
                            if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                                j3 = jOooO0O0;
                                j4 = jLimit;
                                if (jPosition > j4 - 4) {
                                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i)))) {
                                        throw new o0OOO00(i2, length);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                                }
                                int i3 = i2 + 1;
                                if (i3 != length) {
                                    char cCharAt3 = str.charAt(i3);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        o0OO.OooOOO0(jPosition, (byte) ((codePoint >>> 18) | 240));
                                        c2 = 128;
                                        o0OO.OooOOO0(jPosition + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j6 = jPosition + 3;
                                        o0OO.OooOOO0(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        jPosition += 4;
                                        o0OO.OooOOO0(j6, (byte) ((codePoint & 63) | 128));
                                        i2 = i3;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                throw new o0OOO00(i2 - 1, length);
                            }
                            o0OO.OooOOO0(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                            j3 = jOooO0O0;
                            long j7 = jPosition + 2;
                            j4 = jLimit;
                            o0OO.OooOOO0(jPosition + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                            jPosition += 3;
                            o0OO.OooOOO0(j7, (byte) ((cCharAt2 & '?') | 128));
                        }
                        c2 = 128;
                    } else {
                        o0OO.OooOOO0(jPosition, (byte) cCharAt2);
                        j3 = jOooO0O0;
                        j4 = jLimit;
                        c2 = c;
                        jPosition += j;
                        j2 = j;
                    }
                    i2++;
                    c = c2;
                    j = j2;
                    jOooO0O0 = j3;
                    jLimit = j4;
                }
                byteBuffer.position((int) (jPosition - jOooO0O0));
                return;
            default:
                o0OOO0.OooO0oO(str, byteBuffer);
                return;
        }
    }

    public static int OooO0o(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int OooO0o0(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new o0OOO00(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int OooO0oO(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}

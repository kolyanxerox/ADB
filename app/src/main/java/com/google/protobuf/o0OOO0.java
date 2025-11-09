package com.google.protobuf;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class o0OOO0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O0OOO0 f28367OooO0O0 = new o0O0OOO0();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O0OOOo f28368OooO0OO = new o0O0OOOo();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28369OooO00o;

    public static boolean OooO(byte b) {
        return b > -65;
    }

    public static void OooO00o(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (!OooO(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !OooO(b3) && !OooO(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
                cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i + 1] = (char) ((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void OooO0O0(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (b < -62 || OooO(b2)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
    }

    public static void OooO0OO(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (OooO(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || OooO(b3)))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
    }

    public static String OooO0o0(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = byteBuffer.get(i8);
                    if (b3 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i += 2;
                OooO0O0(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i9 = i + 2;
                i += 3;
                OooO0OO(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b4 = byteBuffer.get(i6);
                int i10 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                OooO00o(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static void OooO0oO(String str, ByteBuffer byteBuffer) {
        int length = str.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = str.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i == length) {
            byteBuffer.position(iPosition + i);
            return;
        }
        iPosition += i;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i2 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i3 = i + 1;
                    if (i3 != length) {
                        try {
                            char cCharAt3 = str.charAt(i3);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i4 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    int i5 = iPosition + 2;
                                    try {
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i = i3;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i = i3;
                                        iPosition = i5;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    iPosition = i4;
                                    i = i3;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i = i3;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new o0OOO00(i, length);
                }
                int i6 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    public static String OooO0oo(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte bByteAt = byteString.byteAt(i);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bByteAt);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int OooOOO(long j, int i, int i2) {
        if (i2 == 0) {
            o0OOO0 o0ooo0 = o0OOO0OO.f28370OooO00o;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return o0OOO0OO.OooO0o(i, o0OO.f28347OooO0OO.OooO0o(j));
        }
        if (i2 != 2) {
            throw new AssertionError();
        }
        o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
        return o0OOO0OO.OooO0oO(i, o0oo0oo0.OooO0o(j), o0oo0oo0.OooO0o(j + 1));
    }

    public static int OooOOO0(int i, ByteBuffer byteBuffer, int i2, int i3) {
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6 = i2;
        if (i != 0) {
            if (i6 >= i3) {
                return i;
            }
            byte b3 = (byte) i;
            if (b3 < -32) {
                if (b3 < -62) {
                    return -1;
                }
                int i7 = i6 + 1;
                if (byteBuffer.get(i2) > -65) {
                    return -1;
                }
                i6 = i7;
            } else if (b3 < -16) {
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    i5 = i6 + 1;
                    b2 = byteBuffer.get(i2);
                    if (i5 >= i3) {
                        return o0OOO0OO.OooO0o(b3, b2);
                    }
                } else {
                    b2 = b4;
                    i5 = i6;
                }
                if (b2 > -65) {
                    return -1;
                }
                if (b3 == -32 && b2 < -96) {
                    return -1;
                }
                if (b3 == -19 && b2 >= -96) {
                    return -1;
                }
                i6 = i5 + 1;
                if (byteBuffer.get(i5) > -65) {
                    return -1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i6 + 1;
                    b5 = byteBuffer.get(i2);
                    if (i4 >= i3) {
                        return o0OOO0OO.OooO0o(b3, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i6;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = byteBuffer.get(i4);
                    if (i8 >= i3) {
                        return o0OOO0OO.OooO0oO(b3, b5, b6);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 > -65) {
                    return -1;
                }
                if ((((b5 + 112) + (b3 << 28)) >> 30) != 0 || b > -65) {
                    return -1;
                }
                i6 = i4 + 1;
                if (byteBuffer.get(i4) > -65) {
                    return -1;
                }
            }
        }
        o0OOO0 o0ooo0 = o0OOO0OO.f28370OooO00o;
        int i9 = i3 - 7;
        int i10 = i6;
        while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
            i10 += 8;
        }
        int i11 = (i10 - i6) + i6;
        while (i11 < i3) {
            int i12 = i11 + 1;
            byte b7 = byteBuffer.get(i11);
            if (b7 >= 0) {
                i11 = i12;
            } else if (b7 < -32) {
                if (i12 >= i3) {
                    return b7;
                }
                if (b7 < -62 || byteBuffer.get(i12) > -65) {
                    return -1;
                }
                i11 += 2;
            } else if (b7 < -16) {
                if (i12 >= i3 - 1) {
                    return o0OOO0OO.OooO0O0(byteBuffer, b7, i12, i3 - i12);
                }
                int i13 = i11 + 2;
                byte b8 = byteBuffer.get(i12);
                if (b8 > -65) {
                    return -1;
                }
                if (b7 == -32 && b8 < -96) {
                    return -1;
                }
                if ((b7 == -19 && b8 >= -96) || byteBuffer.get(i13) > -65) {
                    return -1;
                }
                i11 += 3;
            } else {
                if (i12 >= i3 - 2) {
                    return o0OOO0OO.OooO0O0(byteBuffer, b7, i12, i3 - i12);
                }
                int i14 = i11 + 2;
                byte b9 = byteBuffer.get(i12);
                if (b9 > -65) {
                    return -1;
                }
                if ((((b9 + 112) + (b7 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i15 = i11 + 3;
                if (byteBuffer.get(i14) > -65) {
                    return -1;
                }
                i11 += 4;
                if (byteBuffer.get(i15) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static int OooOOOO(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            o0OOO0 o0ooo0 = o0OOO0OO.f28370OooO00o;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return o0OOO0OO.OooO0o(i, o0OO.OooO(bArr, j));
        }
        if (i2 == 2) {
            return o0OOO0OO.OooO0oO(i, o0OO.OooO(bArr, j), o0OO.OooO(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OooO0Oo(byte[] r8, int r9, int r10) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0OOO0.OooO0Oo(byte[], int, int):java.lang.String");
    }

    public final int OooO0o(String str, byte[] bArr, int i, int i2) {
        long j;
        char c;
        long j2;
        long j3;
        char c2;
        int i3;
        char cCharAt;
        int i4;
        int i5;
        char cCharAt2;
        switch (this.f28369OooO00o) {
            case 0:
                long j4 = i;
                long j5 = i2 + j4;
                int length = str.length();
                if (length > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
                }
                int i6 = 0;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i6 < length && (cCharAt = str.charAt(i6)) < 128) {
                        o0OO.OooOOO(bArr, j4, (byte) cCharAt);
                        i6++;
                        j4 = 1 + j4;
                    }
                }
                if (i6 == length) {
                    return (int) j4;
                }
                while (i6 < length) {
                    char cCharAt3 = str.charAt(i6);
                    if (cCharAt3 < c && j4 < j5) {
                        o0OO.OooOOO(bArr, j4, (byte) cCharAt3);
                        c2 = c;
                        j2 = j;
                        j3 = j4 + j;
                    } else if (cCharAt3 >= 2048 || j4 > j5 - 2) {
                        j2 = j;
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j4 > j5 - 3) {
                            long j6 = j4;
                            if (j6 > j5 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i6 + 1) == length || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                                    throw new o0OOO00(i6, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + j6);
                            }
                            int i7 = i6 + 1;
                            if (i7 != length) {
                                char cCharAt4 = str.charAt(i7);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    o0OO.OooOOO(bArr, j6, (byte) ((codePoint >>> 18) | 240));
                                    c2 = 128;
                                    o0OO.OooOOO(bArr, j6 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                    o0OO.OooOOO(bArr, j6 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    o0OO.OooOOO(bArr, j6 + 3, (byte) ((codePoint & 63) | 128));
                                    j3 = j6 + 4;
                                    i6 = i7;
                                } else {
                                    i6 = i7;
                                }
                            }
                            throw new o0OOO00(i6 - 1, length);
                        }
                        o0OO.OooOOO(bArr, j4, (byte) ((cCharAt3 >>> '\f') | 480));
                        long j7 = j4;
                        o0OO.OooOOO(bArr, j4 + j2, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        j3 = j7 + 3;
                        o0OO.OooOOO(bArr, j7 + 2, (byte) ((cCharAt3 & '?') | 128));
                        c2 = 128;
                    } else {
                        j2 = j;
                        o0OO.OooOOO(bArr, j4, (byte) ((cCharAt3 >>> 6) | 960));
                        o0OO.OooOOO(bArr, j4 + j2, (byte) ((cCharAt3 & '?') | c));
                        j3 = j4 + 2;
                        c2 = c;
                    }
                    i6++;
                    c = c2;
                    j4 = j3;
                    j = j2;
                }
                return (int) j4;
            default:
                int length2 = str.length();
                int i8 = i2 + i;
                int i9 = 0;
                while (i9 < length2 && (i5 = i9 + i) < i8 && (cCharAt2 = str.charAt(i9)) < 128) {
                    bArr[i5] = (byte) cCharAt2;
                    i9++;
                }
                if (i9 == length2) {
                    return i + length2;
                }
                int i10 = i + i9;
                while (i9 < length2) {
                    char cCharAt5 = str.charAt(i9);
                    if (cCharAt5 < 128 && i10 < i8) {
                        bArr[i10] = (byte) cCharAt5;
                        i10++;
                    } else if (cCharAt5 < 2048 && i10 <= i8 - 2) {
                        int i11 = i10 + 1;
                        bArr[i10] = (byte) ((cCharAt5 >>> 6) | 960);
                        i10 += 2;
                        bArr[i11] = (byte) ((cCharAt5 & '?') | 128);
                    } else {
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || i10 > i8 - 3) {
                            if (i10 > i8 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i4 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt5, str.charAt(i4)))) {
                                    throw new o0OOO00(i9, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + i10);
                            }
                            int i12 = i9 + 1;
                            if (i12 != str.length()) {
                                char cCharAt6 = str.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    bArr[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArr[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i13 = i10 + 3;
                                    bArr[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArr[i13] = (byte) ((codePoint2 & 63) | 128);
                                    i9 = i12;
                                } else {
                                    i9 = i12;
                                }
                            }
                            throw new o0OOO00(i9 - 1, length2);
                        }
                        bArr[i10] = (byte) ((cCharAt5 >>> '\f') | 480);
                        int i14 = i10 + 2;
                        bArr[i10 + 1] = (byte) (((cCharAt5 >>> 6) & 63) | 128);
                        i10 += 3;
                        bArr[i14] = (byte) ((cCharAt5 & '?') | 128);
                    }
                    i9++;
                }
                return i10;
        }
    }

    public boolean OooOO0(byte[] bArr, int i, int i2) {
        return OooOO0o(0, bArr, i, i2) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (com.google.protobuf.o0OO.f28347OooO0OO.OooO0o(r3) > (-65)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r23 = 1;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (com.google.protobuf.o0OO.f28347OooO0OO.OooO0o(r3) > (-65)) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int OooOO0O(int r21, java.nio.ByteBuffer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0OOO0.OooOO0O(int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x013c, code lost:
    
        if (com.google.protobuf.o0OO.OooO(r23, r5) > (-65)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013f, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0170, code lost:
    
        if (com.google.protobuf.o0OO.OooO(r23, r5) > (-65)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b6, code lost:
    
        if (com.google.protobuf.o0OO.OooO(r23, r5) > (-65)) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[PHI: r2
  PHI (r2v19 int) = (r2v0 int), (r2v31 int), (r2v37 int), (r2v40 int) binds: [B:5:0x001d, B:48:0x009f, B:29:0x005c, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae A[ADDED_TO_REGION, LOOP:1: B:56:0x00ae->B:236:0x00ae, LOOP_START, PHI: r2
  0x00ae: PHI (r2v21 int) = (r2v20 int), (r2v25 int) binds: [B:54:0x00ab, B:236:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOO0o(int r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0OOO0.OooOO0o(int, byte[], int, int):int");
    }
}

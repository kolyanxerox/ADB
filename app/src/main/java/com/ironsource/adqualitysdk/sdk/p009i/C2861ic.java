package com.ironsource.adqualitysdk.sdk.p009i;

import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3037dc;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ic */
/* loaded from: classes2.dex */
public class C2861ic {

    /* renamed from: ﱡ */
    private static int f6723 = 1;

    /* renamed from: ﻏ */
    private static int f6724;

    /* renamed from: ﻐ */
    private static /* synthetic */ boolean f6725;

    /* renamed from: ﻛ */
    private static final byte[] f6726;

    /* renamed from: ｋ */
    private static final byte[] f6727;

    /* renamed from: ﾇ */
    private static char f6728;

    /* renamed from: ﾒ */
    private static char[] f6729;

    static {
        m7064();
        f6725 = true;
        f6726 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f6727 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        f6724 = (f6723 + 31) % 128;
    }

    private C2861ic() {
    }

    /* renamed from: ﻐ */
    public static void m7064() {
        f6728 = (char) 6;
        f6729 = new char[]{'i', 'n', 'v', 'a', 'l', 'd', ' ', 'p', 'g', 'b', 'y', 't', 'e', '\'', C3037dc.f8244T, 'o', 'f', 's', 'c', 'u', 'h', 'r', 'B', '6', '4', ':', '(', 'm', ')', 'j', 'k', 'q', 'w', 'x', 'z', '{'};
    }

    /* renamed from: ﻛ */
    private static byte[] m7066(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3;
        byte[] bArr3;
        int i4;
        int i5;
        int i6;
        int i7 = f6724 + 119;
        f6723 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = (i2 - 5) % 3;
            i3 = i2 / 2;
            bArr3 = new byte[i8 - (i8 % Integer.MAX_VALUE)];
            i4 = 0;
            i6 = 0;
            i5 = 1;
        } else {
            int i9 = ((i2 + 2) / 3) << 2;
            i3 = i2 - 2;
            bArr3 = new byte[(i9 / Integer.MAX_VALUE) + i9];
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        while (i5 < i3) {
            int i10 = ((bArr[i5] << 24) >>> 8) | ((bArr[i5 + 1] << 24) >>> 16) | ((bArr[i5 + 2] << 24) >>> 24);
            bArr3[i6] = bArr2[i10 >>> 18];
            int i11 = i6 + 1;
            bArr3[i11] = bArr2[(i10 >>> 12) & 63];
            bArr3[i6 + 2] = bArr2[(i10 >>> 6) & 63];
            bArr3[i6 + 3] = bArr2[i10 & 63];
            i4 += 4;
            if (i4 == Integer.MAX_VALUE) {
                int i12 = (f6723 + 21) % 128;
                f6724 = i12;
                bArr3[i6 + 4] = 10;
                f6723 = (i12 + 125) % 128;
                i4 = 0;
                i6 = i11;
            }
            i5 += 3;
            i6 += 4;
        }
        if (i5 < i2) {
            m7070(bArr, i5, i2 - i5, bArr3, i6, bArr2);
            if (i4 + 4 == Integer.MAX_VALUE) {
                bArr3[i6 + 4] = 10;
                i6++;
            }
            i6 += 4;
            f6724 = (f6723 + 95) % 128;
        }
        if (f6725 || i6 == bArr3.length) {
            return bArr3;
        }
        throw new AssertionError();
    }

    /* renamed from: ｋ */
    private static byte[] m7070(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4;
        int i5;
        int i6 = f6724;
        f6723 = (i6 + 51) % 128;
        int i7 = 0;
        if (i2 > 0) {
            int i8 = i6 + 81;
            f6723 = i8 % 128;
            i4 = i8 % 2 == 0 ? (bArr[i] / 49) >> 15 : (bArr[i] << 24) >>> 8;
        } else {
            i4 = 0;
        }
        if (i2 > 1) {
            i5 = (bArr[i + 1] << 24) >>> 16;
        } else {
            f6724 = (f6723 + 83) % 128;
            i5 = 0;
        }
        int i9 = i4 | i5;
        if (i2 > 2) {
            f6723 = (f6724 + 93) % 128;
            i7 = (bArr[i + 2] << 24) >>> 24;
        }
        int i10 = i9 | i7;
        if (i2 == 1) {
            bArr2[i3] = bArr3[i10 >>> 18];
            bArr2[i3 + 1] = bArr3[(i10 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i10 >>> 18];
            bArr2[i3 + 1] = bArr3[(i10 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i10 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArr3[i10 >>> 18];
        bArr2[i3 + 1] = bArr3[(i10 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i10 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i10 & 63];
        return bArr2;
    }

    /* renamed from: ﾒ */
    public static String m7071(byte[] bArr) {
        f6723 = (f6724 + 19) % 128;
        String strM7068 = m7068(bArr, bArr.length, f6726);
        int i = f6724 + 29;
        f6723 = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
        return strM7068;
    }

    /* renamed from: ﻐ */
    private static String m7063(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6729;
                char c = f6728;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﾒ */
    private static byte[] m7072(byte[] bArr, int i) throws C2863ie {
        int i2 = f6723 + 51;
        f6724 = i2 % 128;
        return i2 % 2 != 0 ? m7069(bArr, 0, i, f6727) : m7069(bArr, 0, i, f6727);
    }

    /* renamed from: ｋ */
    private static String m7068(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArrM7066 = m7066(bArr, 0, i, bArr2);
        String str = new String(bArrM7066, 0, bArrM7066.length);
        int i2 = f6724 + 29;
        f6723 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return str;
    }

    /* renamed from: ﻛ */
    public static byte[] m7065(String str) throws C2863ie {
        f6724 = (f6723 + 47) % 128;
        byte[] bytes = str.getBytes();
        byte[] bArrM7072 = m7072(bytes, bytes.length);
        int i = f6723 + 95;
        f6724 = i % 128;
        if (i % 2 == 0) {
            return bArrM7072;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static int m7067(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        byte b = bArr[2];
        if (b == 61) {
            int i2 = (f6724 + 23) % 128;
            f6723 = i2;
            bArr2[i] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            f6724 = (i2 + 47) % 128;
            return 1;
        }
        byte b2 = bArr[3];
        if (b2 == 61) {
            int i3 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18);
            bArr2[i] = (byte) (i3 >>> 16);
            bArr2[i + 1] = (byte) (i3 >>> 8);
            return 2;
        }
        int i4 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18) | ((bArr3[b2] << 24) >>> 24);
        bArr2[i] = (byte) (i4 >> 16);
        bArr2[i + 1] = (byte) (i4 >> 8);
        bArr2[i + 2] = (byte) i4;
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r13 <= 1) goto L24;
     */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m7069(byte[] r17, int r18, int r19, byte[] r20) throws com.ironsource.adqualitysdk.sdk.p009i.C2863ie {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2861ic.m7069(byte[], int, int, byte[]):byte[]");
    }
}

package com.ironsource.adqualitysdk.sdk.p009i;

import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dm */
/* loaded from: classes2.dex */
public final class C2736dm {

    /* renamed from: ﻐ */
    private static int f6080 = 1;

    /* renamed from: ﻛ */
    private static int f6081;

    /* renamed from: ﾇ */
    private static char[] f6082 = {')'};

    /* renamed from: ｋ */
    private int f6083;

    /* renamed from: ﾒ */
    private String f6084;

    private C2736dm(String str, int i) {
        this.f6084 = str;
        this.f6083 = i;
    }

    /* renamed from: ﾇ */
    public static C2736dm m6623(String str, int i) {
        int i2 = f6080 + 73;
        f6081 = i2 % 128;
        if (i2 % 2 != 0) {
            C2925r.m7548().m7581();
            throw null;
        }
        if (!C2925r.m7548().m7581()) {
            return null;
        }
        C2736dm c2736dm = new C2736dm(str, i);
        int i3 = f6080 + 11;
        f6081 = i3 % 128;
        if (i3 % 2 == 0) {
            return c2736dm;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6084);
        sb.append(m6624(false, new int[]{0, 1, 25, 0}, "\u0001").intern());
        sb.append(this.f6083);
        String string = sb.toString();
        f6080 = (f6081 + 25) % 128;
        return string;
    }

    /* renamed from: ｋ */
    public final int m6625() {
        int i = f6080 + 115;
        f6081 = i % 128;
        if (i % 2 == 0) {
            return this.f6083;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6624(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (C2831h.f6553) {
            try {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f6082, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C2831h.f6552 = 0;
                    char c = 0;
                    while (true) {
                        int i5 = C2831h.f6552;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                        C2831h.f6552 = i5 + 1;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i6 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i6, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i6);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2831h.f6552 = 0;
                    while (true) {
                        int i7 = C2831h.f6552;
                        if (i7 >= i2) {
                            break;
                        }
                        cArr4[i7] = cArr[(i2 - i7) - 1];
                        C2831h.f6552 = i7 + 1;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C2831h.f6552 = 0;
                    while (true) {
                        int i8 = C2831h.f6552;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr[i8] = (char) (cArr[i8] - iArr[2]);
                        C2831h.f6552 = i8 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

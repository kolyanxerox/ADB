package com.ironsource.adqualitysdk.sdk.p009i;

import java.io.UnsupportedEncodingException;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cz */
/* loaded from: classes2.dex */
public class C2722cz {

    /* renamed from: ﻛ */
    private static int f5948 = 1;

    /* renamed from: ｋ */
    private static int f5949;

    /* renamed from: ﾒ */
    private static char[] f5950 = {16, '1', 'R', 'g', 'n', 'n', 'q', 'J', 'A', 'b', 'j', 's', 227, 232, 148, 148};

    /* renamed from: ﻐ */
    public static <T> boolean m6458(List<Object> list, int i, Class<T> cls) {
        f5948 = (f5949 + 31) % 128;
        Object obj = list.get(i);
        if (obj == null) {
            return true;
        }
        int i2 = f5949 + 109;
        f5948 = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls2 = obj.getClass();
        if (i3 != 0) {
            return cls.isAssignableFrom(cls2);
        }
        cls.isAssignableFrom(cls2);
        throw null;
    }

    /* renamed from: ﾇ */
    public static <T> T m6459(List<Object> list, int i, Class<T> cls) {
        f5948 = (f5949 + 39) % 128;
        T t = (T) list.get(i);
        if (t != null) {
            f5949 = (f5948 + 37) % 128;
            if (!cls.isAssignableFrom(t.getClass())) {
                StringBuilder sb = new StringBuilder();
                sb.append(m6457(false, new int[]{0, 12, 0, 1}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001").intern());
                sb.append(t.getClass().getName());
                sb.append(m6457(true, new int[]{12, 4, 116, 3}, (String) null).intern());
                sb.append(cls.getName());
                throw new ClassCastException(sb.toString());
            }
        }
        int i2 = f5949 + 59;
        f5948 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return t;
    }

    /* renamed from: ﻐ */
    private static String m6457(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f5950, i, cArr, 0, i2);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (m6458(r4, r5, java.util.List.class) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.f5948 + 81;
        com.ironsource.adqualitysdk.sdk.p009i.C2722cz.f5949 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r4 = (java.util.List) m6459(r4, r5, java.util.List.class);
        r5 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return (java.util.List) m6459(r4, r5, java.util.List.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (m6458(r4, r5, java.util.List.class) != false) goto L11;
     */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.Object> m6460(java.util.List<java.lang.Object> r4, int r5) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.size()
            if (r1 <= r5) goto L48
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.f5949
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2722cz.f5948 = r2
            int r1 = r1 % 2
            java.lang.Class<java.util.List> r2 = java.util.List.class
            if (r1 != 0) goto L24
            boolean r1 = m6458(r4, r5, r2)
            r3 = 39
            int r3 = r3 / 0
            if (r1 == 0) goto L48
            goto L2a
        L24:
            boolean r1 = m6458(r4, r5, r2)
            if (r1 == 0) goto L48
        L2a:
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.f5948
            int r0 = r0 + 81
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2722cz.f5949 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L41
            java.lang.Object r4 = m6459(r4, r5, r2)
            java.util.List r4 = (java.util.List) r4
            r5 = 67
            int r5 = r5 / 0
            goto L47
        L41:
            java.lang.Object r4 = m6459(r4, r5, r2)
            java.util.List r4 = (java.util.List) r4
        L47:
            return r4
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6460(java.util.List, int):java.util.List");
    }
}

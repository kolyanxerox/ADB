package com.ironsource.adqualitysdk.sdk.p009i;

import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dx */
/* loaded from: classes2.dex */
public final class C2747dx extends AbstractC2755ee {

    /* renamed from: ﻛ */
    private static char[] f6183 = {16, ' ', '.'};

    /* renamed from: ﾇ */
    private static int f6184 = 0;

    /* renamed from: ﾒ */
    private static int f6185 = 1;

    /* renamed from: ﻐ */
    private C2762el f6186;

    /* renamed from: ｋ */
    private AbstractC2755ee f6187;

    public C2747dx(C2762el c2762el, AbstractC2755ee abstractC2755ee, C2736dm c2736dm) {
        super(c2736dm);
        this.f6186 = c2762el;
        this.f6187 = abstractC2755ee;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r5.f6186 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2747dx.f6184
            int r1 = r0 + 115
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2747dx.f6185 = r1
            r1 = 1
            r2 = 0
            if (r4 != r5) goto L18
            int r0 = r0 + 43
            int r5 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2747dx.f6185 = r5
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            return r2
        L17:
            return r1
        L18:
            if (r5 == 0) goto L57
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.dx> r3 = com.ironsource.adqualitysdk.sdk.p009i.C2747dx.class
            if (r3 == r0) goto L23
            goto L57
        L23:
            com.ironsource.adqualitysdk.sdk.i.dx r5 = (com.ironsource.adqualitysdk.sdk.p009i.C2747dx) r5
            com.ironsource.adqualitysdk.sdk.i.el r0 = r4.f6186
            if (r0 == 0) goto L3a
            com.ironsource.adqualitysdk.sdk.i.el r3 = r5.f6186
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3f
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2747dx.f6185
            int r5 = r5 + 77
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2747dx.f6184 = r5
            goto L3e
        L3a:
            com.ironsource.adqualitysdk.sdk.i.el r0 = r5.f6186
            if (r0 == 0) goto L3f
        L3e:
            return r2
        L3f:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f6187
            if (r0 == 0) goto L52
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2747dx.f6185
            int r1 = r1 + 29
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2747dx.f6184 = r1
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f6187
            boolean r5 = r0.equals(r5)
            return r5
        L52:
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f6187
            if (r5 != 0) goto L57
            return r1
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2747dx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C2762el c2762el = this.f6186;
        int iHashCode = 0;
        int iHashCode2 = (c2762el != null ? c2762el.hashCode() : 0) * 31;
        AbstractC2755ee abstractC2755ee = this.f6187;
        if (abstractC2755ee != null) {
            int i = f6184 + 43;
            f6185 = i % 128;
            if (i % 2 == 0) {
                int i2 = 58 / 0;
                iHashCode = abstractC2755ee.hashCode();
            } else {
                iHashCode = abstractC2755ee.hashCode();
            }
        } else {
            f6184 = (f6185 + 11) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6186);
        sb.append(m6726(true, new int[]{0, 3, 0, 1}, "\u0000\u0000\u0001").intern());
        sb.append(this.f6187);
        String string = sb.toString();
        int i = f6184 + 37;
        f6185 = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        f6184 = (f6185 + 35) % 128;
        C2744du c2744duM6760 = this.f6187.m6760(c2741dr, c2712cp);
        c2741dr.m6655(this.f6186.m6777(), c2744duM6760.m6717());
        f6184 = (f6185 + 113) % 128;
        return c2744duM6760;
    }

    /* renamed from: ﾇ */
    public final C2762el m6727() {
        int i = f6185 + 15;
        f6184 = i % 128;
        if (i % 2 == 0) {
            return this.f6186;
        }
        int i2 = 41 / 0;
        return this.f6186;
    }

    /* renamed from: ｋ */
    private static String m6726(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f6183, i, cArr, 0, i2);
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

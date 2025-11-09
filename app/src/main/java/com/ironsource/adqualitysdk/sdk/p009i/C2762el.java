package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.el */
/* loaded from: classes2.dex */
public final class C2762el extends AbstractC2755ee {

    /* renamed from: ﮐ */
    private static int f6273 = 1;

    /* renamed from: ﱟ */
    private static int f6274 = 0;

    /* renamed from: ﻐ */
    private static boolean f6275 = true;

    /* renamed from: ｋ */
    private static int f6276 = 286;

    /* renamed from: ﾇ */
    private static boolean f6277 = true;

    /* renamed from: ﾒ */
    private static char[] f6278 = {355, 400, 397, 318, 387, 404, 383, 394, 403, 402, 391, 396, 389, 406, 398, 401};

    /* renamed from: ﻛ */
    private String f6279;

    public C2762el(String str, C2736dm c2736dm) {
        super(c2736dm);
        this.f6279 = C2746dw.m6725(str);
    }

    public final boolean equals(Object obj) {
        int i = f6274;
        int i2 = i + 77;
        f6273 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        f6273 = (i + 119) % 128;
        if (C2762el.class != obj.getClass()) {
            return false;
        }
        boolean zEquals = this.f6279.equals(((C2762el) obj).f6279);
        f6273 = (f6274 + 33) % 128;
        return zEquals;
    }

    public final int hashCode() {
        int i = f6273 + 77;
        f6274 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        String str = this.f6279;
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        f6274 = (f6273 + 57) % 128;
        return iHashCode;
    }

    public final String toString() {
        f6273 = (f6274 + 123) % 128;
        String strM6777 = m6777();
        int i = f6274 + 7;
        f6273 = i % 128;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
        return strM6777;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        try {
            return new C2744du(c2741dr.m6658(m6777()));
        } catch (Exception e) {
            C2743dt c2743dtM6297 = c2712cp.m6297(m6777());
            if (c2743dtM6297 != null) {
                C2744du c2744du = new C2744du(c2743dtM6297);
                int i = f6273 + 29;
                f6274 = i % 128;
                if (i % 2 == 0) {
                    return c2744du;
                }
                throw null;
            }
            String strM6290 = c2712cp.m6290();
            StringBuilder sb = new StringBuilder();
            sb.append(m6776(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0084\u008c\u0083\u008b\u0090\u0090\u0085\u0082\u008f\u008e\u0085\u0084\u008d\u008c\u008b\u008a\u0087\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern());
            sb.append(this);
            sb.append(m6759());
            C2713cq.m6350(strM6290, sb.toString(), e);
            return new C2744du(null);
        }
    }

    /* renamed from: ﾇ */
    public final String m6777() {
        int i = f6273;
        String str = this.f6279;
        f6274 = (i + 85) % 128;
        return str;
    }

    /* renamed from: ｋ */
    private static String m6776(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2922o.f7244) {
            try {
                char[] cArr2 = f6278;
                int i2 = f6276;
                if (f6277) {
                    int length = bArr.length;
                    C2922o.f7245 = length;
                    char[] cArr3 = new char[length];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i3 = C2922o.f7246;
                        int i4 = C2922o.f7245 - 1;
                        int i5 = C2922o.f7246;
                        cArr3[i3] = (char) (cArr2[bArr[i4 - i5] + i] - i2);
                        C2922o.f7246 = i5 + 1;
                    }
                    return new String(cArr3);
                }
                if (f6275) {
                    int length2 = cArr.length;
                    C2922o.f7245 = length2;
                    char[] cArr4 = new char[length2];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i6 = C2922o.f7246;
                        int i7 = C2922o.f7245 - 1;
                        int i8 = C2922o.f7246;
                        cArr4[i6] = (char) (cArr2[cArr[i7 - i8] - i] - i2);
                        C2922o.f7246 = i8 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C2922o.f7245 = length3;
                char[] cArr5 = new char[length3];
                C2922o.f7246 = 0;
                while (C2922o.f7246 < C2922o.f7245) {
                    int i9 = C2922o.f7246;
                    int i10 = C2922o.f7245 - 1;
                    int i11 = C2922o.f7246;
                    cArr5[i9] = (char) (cArr2[iArr[i10 - i11] - i] - i2);
                    C2922o.f7246 = i11 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

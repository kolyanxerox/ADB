package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.an */
/* loaded from: classes2.dex */
public final class C2656an {

    /* renamed from: ﺙ */
    private static int f4678 = 1;

    /* renamed from: ﻐ */
    private static int f4679 = 169;

    /* renamed from: ﻛ */
    private static boolean f4680 = true;

    /* renamed from: ｋ */
    private static boolean f4681 = true;

    /* renamed from: ﾇ */
    private static int f4682;

    /* renamed from: ﾒ */
    private static char[] f4683 = {266, 269, 282, 264, 274, 279, 285, 267, 277, 280};

    /* renamed from: ﻛ */
    private static String m5101(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f4683;
                int i2 = f4679;
                if (f4681) {
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
                if (f4680) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m5104(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2656an.f4682
            r1 = 1
            int r0 = r0 + r1
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2656an.f4678 = r0
            boolean r4 = r3.containsKey(r4)
            r0 = 0
            if (r4 == 0) goto L10
            return r0
        L10:
            int r4 = r3.size()
            boolean r3 = m5105(r3)
            if (r3 == r1) goto L1c
        L1a:
            r3 = r0
            goto L2a
        L1c:
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2656an.f4678
            int r3 = r3 + 103
            int r2 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2656an.f4682 = r2
            int r3 = r3 % 2
            if (r3 == 0) goto L29
            goto L1a
        L29:
            r3 = r1
        L2a:
            r2 = 5
            int r2 = r2 + r3
            if (r4 < r2) goto L3c
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2656an.f4678
            int r3 = r3 + 125
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2656an.f4682 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L3b
            return r0
        L3b:
            return r1
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2656an.m5104(java.util.Map, java.lang.String):boolean");
    }

    /* renamed from: ﾇ */
    private static boolean m5105(Map<String, String> map) {
        int i = f4678 + InterfaceC3173h3.d.b.f8826i;
        f4682 = i % 128;
        boolean zContainsKey = map.containsKey(m5101(null, null, i % 2 != 0 ? 88 << (ViewConfiguration.getWindowTouchSlop() + 32) : (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0088\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern());
        f4678 = (f4682 + 79) % 128;
        return zContainsKey;
    }

    /* renamed from: ｋ */
    public static boolean m5102(String str) {
        f4682 = (f4678 + 117) % 128;
        boolean zEquals = m5101(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0088\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern().equals(str);
        int i = f4682 + 83;
        f4678 = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
        return zEquals;
    }

    /* renamed from: ｋ */
    public static boolean m5103(String str, String str2) {
        f4678 = (f4682 + 49) % 128;
        if (!(!C2916kd.m7451(str, 64))) {
            f4678 = (f4682 + 21) % 128;
            if (!(!C2916kd.m7451(str2, 64))) {
                return true;
            }
        }
        f4678 = (f4682 + 95) % 128;
        return false;
    }
}

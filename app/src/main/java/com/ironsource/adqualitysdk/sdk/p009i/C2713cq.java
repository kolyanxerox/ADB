package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cq */
/* loaded from: classes2.dex */
public final class C2713cq {

    /* renamed from: ﺙ */
    private static int f5818 = 1;

    /* renamed from: ﻐ */
    private static char f5819 = 20953;

    /* renamed from: ﻛ */
    private static int f5820 = 0;

    /* renamed from: ｋ */
    private static char f5821 = 17357;

    /* renamed from: ﾇ */
    private static char f5822 = 47066;

    /* renamed from: ﾒ */
    private static char f5823 = 10150;

    /* renamed from: ﻐ */
    public static void m6350(String str, String str2, Throwable th) {
        f5820 = (f5818 + 3) % 128;
        m6353(str, str2, th);
        int i = f5820 + 57;
        f5818 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public static void m6352(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m6351("ꏹ娮\ue0de〭", TextUtils.indexOf("", "", 0) + 4).intern());
        sb.append(str);
        C2921n.m7514(sb.toString(), str2);
        f5818 = (f5820 + 7) % 128;
    }

    /* renamed from: ﾒ */
    private static void m6353(String str, String str2, Throwable th) {
        C2914kb.m7421(AbstractC2183w4.OooOO0o(new StringBuilder(), m6351("ꏹ娮龈ꢺ", TextUtils.getOffsetBefore("", 0) + 4), str), str2, Integer.toHexString(str2.hashCode()), th, null, false);
        int i = f5820 + 123;
        f5818 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private static String m6351(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2920m.f7237) {
            try {
                char[] cArr2 = new char[cArr.length];
                C2920m.f7236 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i2 = C2920m.f7236;
                    if (i2 < cArr.length) {
                        cArr3[0] = cArr[i2];
                        cArr3[1] = cArr[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f5823)) ^ ((c2 >>> 5) + f5819)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f5822) ^ ((c3 + i3) ^ ((c3 << 4) + f5821))));
                            i3 -= 40503;
                        }
                        int i5 = C2920m.f7236;
                        cArr2[i5] = cArr3[0];
                        cArr2[i5 + 1] = cArr3[1];
                        C2920m.f7236 = i5 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

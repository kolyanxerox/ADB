package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.ViewConfiguration;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.em */
/* loaded from: classes2.dex */
public final class C2763em extends AbstractC2756ef {

    /* renamed from: ﻐ */
    private static long f6280 = -334442904899499428L;

    /* renamed from: ﻛ */
    private static int f6281 = 0;

    /* renamed from: ﾒ */
    private static int f6282 = 1;

    public C2763em(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        int i = f6281 + 77;
        f6282 = i % 128;
        String strIntern = m6778("⪅赑⪣䜫牠⮒", i % 2 == 0 ? ViewConfiguration.getWindowTouchSlop() - 95 : ViewConfiguration.getWindowTouchSlop() >> 8).intern();
        f6282 = (f6281 + 99) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        return new C2744du(Boolean.valueOf(m6765().m6760(c2741dr, c2712cp).m6721() && m6764().m6760(c2741dr, c2712cp).m6721()));
    }

    /* renamed from: ｋ */
    private static String m6778(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f6280, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6280));
                        C2777f.f6321 = i2 + 1;
                    } else {
                        str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

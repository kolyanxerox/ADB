package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fm */
/* loaded from: classes2.dex */
public final class C2790fm extends AbstractC2794fq {

    /* renamed from: ﻐ */
    private static int f6355 = 0;

    /* renamed from: ﻛ */
    private static int f6356 = 1;

    /* renamed from: ｋ */
    private static long f6357 = 6840138081520209287L;

    /* renamed from: ﻛ */
    private static String m6799(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2804g.f6422) {
            try {
                C2804g.f6423 = i;
                char[] cArr2 = new char[cArr.length];
                C2804g.f6421 = 0;
                while (true) {
                    int i2 = C2804g.f6421;
                    if (i2 < cArr.length) {
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6357);
                        C2804g.f6421++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final String toString() {
        f6355 = (f6356 + 13) % 128;
        String strIntern = m6799("䷥헎綔蕗ⴀ뒛", TextUtils.getOffsetAfter("", 0) + 38971).intern();
        f6356 = (f6355 + 15) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public final C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        C2744du c2744du = new C2744du(null);
        c2744du.m6715();
        f6356 = (f6355 + 97) % 128;
        return c2744du;
    }
}

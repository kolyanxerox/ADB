package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.ImageFormat;
import android.view.ViewConfiguration;
import com.amazon.device.ads.DTBAdRequest;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gb */
/* loaded from: classes2.dex */
public final class C2806gb extends AbstractC2813gi {

    /* renamed from: ﻛ */
    private static int f6430 = 1;

    /* renamed from: ｋ */
    private static long f6431 = 2000707303426420125L;

    /* renamed from: ﾇ */
    private static int f6432;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6430 = (f6432 + 59) % 128;
        String strIntern = m6821("俰侓\ufb07ꗾͥᛵ纩쮜痢彻㐱籔⍷ꇬ\uedf2㚾泉\ueb88嬁\uef35际㱄႕ꆦ\udfc7蛈컄娪ऊ켓葨ಸ늹ᆿ緭씃ﰣ婎", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        int i = f6432 + 123;
        f6430 = i % 128;
        if (i % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6430 + 125;
        f6432 = i % 128;
        int i2 = i % 2;
        return m6821("㋎㊯顃࿉᠒疳풒킿蓕㰼鸆朩幕", -ImageFormat.getBitsPerPixel(0)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6430 + 63;
        f6432 = i % 128;
        if (i % 2 == 0) {
            return DTBAdRequest.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2679bj c2679bj = new C2679bj(mo6813());
        int i = f6430 + 41;
        f6432 = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
        return c2679bj;
    }

    /* renamed from: ﾇ */
    private static String m6821(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f6431, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6431));
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

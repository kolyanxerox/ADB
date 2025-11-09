package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gc */
/* loaded from: classes2.dex */
public final class C2807gc extends AbstractC2813gi {

    /* renamed from: ﻏ */
    private static int f6433 = 1;

    /* renamed from: ﻐ */
    private static char f6434 = 59973;

    /* renamed from: ﻛ */
    private static char f6435 = 328;

    /* renamed from: ｋ */
    private static int f6436 = 0;

    /* renamed from: ﾇ */
    private static char f6437 = 3220;

    /* renamed from: ﾒ */
    private static char f6438 = 16830;

    /* renamed from: ﾒ */
    private static String m6822(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f6434)) ^ ((c2 >>> 5) + f6435)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f6437) ^ ((c3 + i3) ^ ((c3 << 4) + f6438))));
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6433 + 71;
        f6436 = i % 128;
        String strIntern = m6822("⺤숔頻춨䉱侗糫톫뙐\u1c8f\ua7ef\uf602䧞汽\udc12\ue1f5\udc04嘠乖큤ዚ絛פֿꝅ﹁̙ⱖ计﹁̙ⱖ计퉇끣糫톫酑蝀\ua7ef\uf602䧞汽蝱ꀷ軷쪫瞇麬턣\udbb4ⳤ盔", i % 2 != 0 ? (ViewConfiguration.getKeyRepeatTimeout() << 115) * 74 : 51 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
        int i2 = f6433 + 61;
        f6436 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6433 + 25;
        f6436 = i % 128;
        return (i % 2 != 0 ? m6822("즻\u008aۘ教\uebe5ધϫ멱楟\u17eeﶅ勹傿শ", 107 % (ViewConfiguration.getMaximumDrawingCacheSize() + 20)) : m6822("즻\u008aۘ教\uebe5ધϫ멱楟\u17eeﶅ勹傿শ", 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6436 + 73;
        f6433 = i % 128;
        if (i % 2 != 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2675bf c2675bf = new C2675bf(mo6813());
        int i = f6436 + 107;
        f6433 = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
        return c2675bf;
    }
}

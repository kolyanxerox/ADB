package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.yandex.mobile.ads.common.MobileAds;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ha */
/* loaded from: classes2.dex */
public final class C2832ha extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static long f6554 = -7286542616561203748L;

    /* renamed from: ﾇ */
    private static int f6555 = 0;

    /* renamed from: ﾒ */
    private static int f6556 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6556 + 61;
        f6555 = i % 128;
        String strIntern = m6852("얿饮簋퍥뛑ᗬ\ue89c侳⍑虡敐㣎鿯犇톣땃ࡩ\uef5f䈷⇟蓫寓㽁鉨焉퐤ꯁ\u0efd\uedde䂘\u2455ﭽ帕㷍郣瞪쪬깞", i % 2 != 0 ? 27989 >> ExpandableListView.getPackedPositionChild(1L) : ExpandableListView.getPackedPositionChild(0L) + 23774).intern();
        int i2 = f6556 + 87;
        f6555 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6555 = (f6556 + 89) % 128;
        String strIntern = m6852("얥㋔⭠⎃\u181dႩ", 63337 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
        int i = f6555 + 77;
        f6556 = i % 128;
        if (i % 2 == 0) {
            int i2 = 23 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6555 + 81;
        f6556 = i % 128;
        if (i % 2 != 0) {
            return MobileAds.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2706cj c2706cj = new C2706cj(mo6813());
        f6555 = (f6556 + 55) % 128;
        return c2706cj;
    }

    /* renamed from: ﻛ */
    private static String m6852(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6554);
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
}

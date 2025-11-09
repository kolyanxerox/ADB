package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.widget.ExpandableListView;
import com.five_corp.ad.FiveAd;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gm */
/* loaded from: classes2.dex */
public final class C2817gm extends AbstractC2813gi {

    /* renamed from: ﮐ */
    private static int f6483 = 1;

    /* renamed from: ﻐ */
    private static char f6484 = 27186;

    /* renamed from: ﻛ */
    private static char f6485 = 3711;

    /* renamed from: ｋ */
    private static int f6486 = 0;

    /* renamed from: ﾇ */
    private static char f6487 = 27860;

    /* renamed from: ﾒ */
    private static char f6488 = 45008;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6486 + 85;
        f6483 = i % 128;
        String strIntern = (i % 2 == 0 ? m6835("\ue3f2ѱ願Ⱘ\uf0c8ᇜ\ue45f\uec2e꽧袇≂렩麇拤亍➸♉槀㤋錹䬿ၳ䁫\ue1de", 90 / ExpandableListView.getPackedPositionGroup(1L)) : m6835("\ue3f2ѱ願Ⱘ\uf0c8ᇜ\ue45f\uec2e꽧袇≂렩麇拤亍➸♉槀㤋錹䬿ၳ䁫\ue1de", ExpandableListView.getPackedPositionGroup(0L) + 23)).intern();
        int i2 = f6483 + 69;
        f6486 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6486 + 1;
        f6483 = i % 128;
        return m6835("\uf0c8ᇜ\ue45f\uec2e亍➸", i % 2 == 0 ? 28 % Color.red(1) : Color.red(0) + 6).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6486 + 85;
        f6483 = i % 128;
        if (i % 2 != 0) {
            return FiveAd.class;
        }
        int i2 = 60 / 0;
        return FiveAd.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2685bp c2685bp = new C2685bp(mo6813());
        f6486 = (f6483 + 63) % 128;
        return c2685bp;
    }

    /* renamed from: ﾇ */
    private static String m6835(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f6485)) ^ ((c2 >>> 5) + f6487)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f6484) ^ ((c3 + i3) ^ ((c3 << 4) + f6488))));
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

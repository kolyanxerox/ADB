package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.AdSettings;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gh */
/* loaded from: classes2.dex */
public final class C2812gh extends AbstractC2813gi {

    /* renamed from: ﻛ */
    private static int f6460 = 0;

    /* renamed from: ｋ */
    private static int f6461 = 1;

    /* renamed from: ﾇ */
    private static long f6462 = -6771820301133283168L;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6460 + 117;
        f6461 = i % 128;
        return m6829("讇軦ᣟ⚟诤踩᧲❑襡趧᭼⊚軥謩Ự—谩蚧ၻ⾌膩萇ᏻ\u2d2c蝢莲ᕫ⢖蓩脡࣬", i % 2 == 0 ? View.combineMeasuredStates(1, 0) : View.combineMeasuredStates(0, 0)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6460 + InterfaceC3173h3.d.b.f8823f;
        f6461 = i % 128;
        if (i % 2 == 0) {
            m6829("䌥\uddad檴\ud9a2䍃\udd6c殗\ud827䇇\udee2椛\udda9", TextUtils.getTrimmedLength("")).intern();
            throw null;
        }
        String strIntern = m6829("䌥\uddad檴\ud9a2䍃\udd6c殗\ud827䇇\udee2椛\udda9", TextUtils.getTrimmedLength("")).intern();
        f6461 = (f6460 + 35) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        Class<AdSettings> cls;
        int i = f6461 + 115;
        int i2 = i % 128;
        f6460 = i2;
        if (i % 2 != 0) {
            cls = AdSettings.class;
            int i3 = 45 / 0;
        } else {
            cls = AdSettings.class;
        }
        f6461 = (i2 + 23) % 128;
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2683bn c2683bn = new C2683bn(mo6813());
        int i = f6460 + 5;
        f6461 = i % 128;
        if (i % 2 != 0) {
            return c2683bn;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static String m6829(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f6462, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6462));
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

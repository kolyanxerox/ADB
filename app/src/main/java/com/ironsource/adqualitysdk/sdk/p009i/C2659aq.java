package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as;
import java.util.UUID;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.aq */
/* loaded from: classes2.dex */
public final class C2659aq extends AbstractC2661as.AnonymousClass3 {

    /* renamed from: ﻛ */
    private static int f4701 = 0;

    /* renamed from: ｋ */
    private static long f4702 = 2075124712864497594L;

    /* renamed from: ﾇ */
    private static int f4703 = 1;

    /* renamed from: ﻐ */
    private final String f4704;

    public C2659aq(C2663au c2663au) {
        StringBuilder sb = new StringBuilder();
        sb.append(m5127("᪕\u1ae6泂ￒ㼍", KeyEvent.normalizeMetaState(0)).intern());
        sb.append(UUID.randomUUID().toString().replace(m5127("\ue256\ue27b芮\udedf毄", ViewConfiguration.getTouchSlop() >> 8).intern(), ""));
        this.f4704 = sb.toString();
        m5176(c2663au);
    }

    /* renamed from: ﾇ */
    private static String m5127(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f4702, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f4702));
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

    /* renamed from: ﻐ */
    public final String m5128() {
        f4703 = (f4701 + 121) % 128;
        String strOptString = m5175().optString(m5127("괤굎녋躘玃ಙ秄", View.resolveSizeAndState(0, 0, 0)).intern(), this.f4704);
        f4703 = (f4701 + 3) % 128;
        return strOptString;
    }
}

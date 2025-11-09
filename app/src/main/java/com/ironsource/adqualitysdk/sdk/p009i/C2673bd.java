package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.KeyEvent;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bd */
/* loaded from: classes2.dex */
public final class C2673bd extends AbstractC2676bg {

    /* renamed from: ﻛ */
    private static int f5101 = 1;

    /* renamed from: ﾇ */
    private static long f5102 = -5143092119604463161L;

    /* renamed from: ﾒ */
    private static int f5103;

    public C2673bd(String str) {
        super(str);
    }

    /* renamed from: ﻐ */
    private static String m5449(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5102, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5102));
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﱟ */
    public final boolean mo5450() {
        f5103 = (f5101 + 35) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻏ */
    public final boolean mo5451() {
        int i = f5103 + 79;
        f5101 = i % 128;
        return i % 2 != 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        int i = f5101 + 107;
        f5103 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    public final Class mo5382(String str) {
        int i = f5103 + 17;
        f5101 = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5103 = (f5101 + 15) % 128;
        String strIntern = m5449("\u0ace꧵其ઋ큼ꊹ툚뼍\ued9e쥓讘", 1 - KeyEvent.normalizeMetaState(0)).intern();
        f5103 = (f5101 + 57) % 128;
        return strIntern;
    }
}

package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fj */
/* loaded from: classes2.dex */
public final class C2787fj extends AbstractC2794fq {

    /* renamed from: ｋ */
    private static int f6342 = 1;

    /* renamed from: ﾇ */
    private static long f6343 = 1808670216826910144L;

    /* renamed from: ﾒ */
    private static int f6344;

    /* renamed from: ﾇ */
    private static String m6795(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f6343, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6343));
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

    public final String toString() {
        f6342 = (f6344 + InterfaceC3173h3.d.b.f8819b) % 128;
        String strIntern = m6795("䩽뢅ቝᎩ䨞䴪靈\uf29d鴔琫킨ꮌ\ue446", ViewConfiguration.getKeyRepeatDelay() >> 16).intern();
        int i = f6344 + 67;
        f6342 = i % 128;
        if (i % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public final C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        C2744du c2744du = new C2744du(null);
        c2744du.m6716();
        int i = f6344 + 115;
        f6342 = i % 128;
        if (i % 2 != 0) {
            return c2744du;
        }
        throw null;
    }
}

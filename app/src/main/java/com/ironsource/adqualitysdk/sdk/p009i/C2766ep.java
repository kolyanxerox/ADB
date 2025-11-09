package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ep */
/* loaded from: classes2.dex */
public final class C2766ep extends AbstractC2765eo {

    /* renamed from: ｋ */
    private static int f6284 = 1;

    /* renamed from: ﾇ */
    private static int f6285 = 0;

    /* renamed from: ﾒ */
    private static long f6286 = 1647880768321327986L;

    public C2766ep(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ﾇ */
    private static String m6781(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f6286, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6286));
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        f6285 = (f6284 + 125) % 128;
        String strIntern = m6781("ꈍꈳ읔曞脘", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern();
        f6284 = (f6285 + 45) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﻛ */
    public final boolean mo6773(int i) {
        int i2 = f6285;
        int i3 = i2 + 53;
        f6284 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i <= 0) {
            return false;
        }
        f6284 = (i2 + InterfaceC3173h3.d.b.f8819b) % 128;
        return true;
    }
}

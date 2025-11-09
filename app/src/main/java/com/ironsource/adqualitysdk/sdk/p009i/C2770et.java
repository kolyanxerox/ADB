package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.et */
/* loaded from: classes2.dex */
public final class C2770et extends AbstractC2764en {

    /* renamed from: ﻐ */
    private static long f6295 = -6617615807080026943L;

    /* renamed from: ﻛ */
    private static int f6296 = 1;

    /* renamed from: ﾇ */
    private static int f6297;

    public C2770et(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        f6296 = (f6297 + 25) % 128;
        String strIntern = m6784("\ueecd\ueee2汮ᇻ\udefa", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern();
        int i = f6296 + 27;
        f6297 = i % 128;
        if (i % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2764en
    /* renamed from: ﾇ */
    public final Number mo6779(Number number, Number number2) {
        int i = (f6296 + 53) % 128;
        f6297 = i;
        if (!(number instanceof Double)) {
            f6296 = (i + 59) % 128;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long) && !(number2 instanceof Long)) {
                    return Integer.valueOf(number.intValue() / number2.intValue());
                }
                Long lValueOf = Long.valueOf(number.longValue() / number2.longValue());
                f6297 = (f6296 + 99) % 128;
                return lValueOf;
            }
        }
        return Double.valueOf(number.doubleValue() / number2.doubleValue());
    }

    /* renamed from: ﻐ */
    private static String m6784(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f6295, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6295));
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

package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.eu */
/* loaded from: classes2.dex */
public final class C2771eu extends AbstractC2764en {

    /* renamed from: ﻛ */
    private static long f6298 = 5534326972105450709L;

    /* renamed from: ｋ */
    private static int f6299 = 0;

    /* renamed from: ﾒ */
    private static int f6300 = 1;

    public C2771eu(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ﻛ */
    private static String m6785(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6298);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        int i = f6300 + 35;
        f6299 = i % 128;
        return m6785("擸", i % 2 != 0 ? 24862 << TextUtils.indexOf("", "") : TextUtils.indexOf("", "") + 6637).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2764en
    /* renamed from: ﾇ */
    public final Number mo6779(Number number, Number number2) {
        int i = (f6299 + 123) % 128;
        f6300 = i;
        if (!(number instanceof Double)) {
            f6299 = (i + 97) % 128;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    int i2 = i + 77;
                    f6299 = i2 % 128;
                    if (i2 % 2 != 0) {
                        boolean z = number2 instanceof Long;
                        throw null;
                    }
                    if (!(number2 instanceof Long)) {
                        Integer numValueOf = Integer.valueOf(number.intValue() - number2.intValue());
                        int i3 = f6300 + 75;
                        f6299 = i3 % 128;
                        if (i3 % 2 == 0) {
                            return numValueOf;
                        }
                        throw null;
                    }
                }
                return Long.valueOf(number.longValue() - number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() - number2.doubleValue());
    }
}

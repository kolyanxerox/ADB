package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fa */
/* loaded from: classes2.dex */
public final class C2778fa extends AbstractC2764en {

    /* renamed from: ﮐ */
    private static int f6323 = 1;

    /* renamed from: ﻐ */
    private static char[] f6324 = {';'};

    /* renamed from: ﻛ */
    private static int f6325 = 17;

    /* renamed from: ｋ */
    private static boolean f6326 = true;

    /* renamed from: ﾇ */
    private static int f6327 = 0;

    /* renamed from: ﾒ */
    private static boolean f6328 = true;

    public C2778fa(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ﾒ */
    private static String m6791(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2922o.f7244) {
            try {
                char[] cArr2 = f6324;
                int i2 = f6325;
                if (f6326) {
                    int length = bArr.length;
                    C2922o.f7245 = length;
                    char[] cArr3 = new char[length];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i3 = C2922o.f7246;
                        int i4 = C2922o.f7245 - 1;
                        int i5 = C2922o.f7246;
                        cArr3[i3] = (char) (cArr2[bArr[i4 - i5] + i] - i2);
                        C2922o.f7246 = i5 + 1;
                    }
                    return new String(cArr3);
                }
                if (f6328) {
                    int length2 = cArr.length;
                    C2922o.f7245 = length2;
                    char[] cArr4 = new char[length2];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i6 = C2922o.f7246;
                        int i7 = C2922o.f7245 - 1;
                        int i8 = C2922o.f7246;
                        cArr4[i6] = (char) (cArr2[cArr[i7 - i8] - i] - i2);
                        C2922o.f7246 = i8 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C2922o.f7245 = length3;
                char[] cArr5 = new char[length3];
                C2922o.f7246 = 0;
                while (C2922o.f7246 < C2922o.f7245) {
                    int i9 = C2922o.f7246;
                    int i10 = C2922o.f7245 - 1;
                    int i11 = C2922o.f7246;
                    cArr5[i9] = (char) (cArr2[iArr[i10 - i11] - i] - i2);
                    C2922o.f7246 = i11 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        int i = f6327 + 35;
        f6323 = i % 128;
        String strIntern = (i % 2 == 0 ? m6791(null, null, 17744 % TextUtils.indexOf((CharSequence) "", (char) 31), "\u0081") : m6791(null, null, TextUtils.indexOf((CharSequence) "", '0') + 128, "\u0081")).intern();
        int i2 = f6323 + 113;
        f6327 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2764en
    /* renamed from: ﾇ */
    public final Number mo6779(Number number, Number number2) {
        if (!(number instanceof Double)) {
            int i = f6327;
            f6323 = (i + 77) % 128;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    f6323 = (i + 97) % 128;
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number2.intValue() * number.intValue());
                    }
                }
                return Long.valueOf(number2.longValue() * number.longValue());
            }
        }
        return Double.valueOf(number2.doubleValue() * number.doubleValue());
    }
}

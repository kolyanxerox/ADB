package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.AbstractC2183w4;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ex */
/* loaded from: classes2.dex */
public final class C2774ex extends AbstractC2764en {

    /* renamed from: ﻛ */
    private static char[] f6310 = {'%'};

    /* renamed from: ｋ */
    private static char f6311 = 1;

    /* renamed from: ﾇ */
    private static int f6312 = 0;

    /* renamed from: ﾒ */
    private static int f6313 = 1;

    public C2774ex(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ｋ */
    private static String m6788(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6310;
                char c = f6311;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        f6312 = (f6313 + 37) % 128;
        String strIntern = m6788((byte) (113 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0095", -ImageFormat.getBitsPerPixel(0)).intern();
        int i = f6313 + 99;
        f6312 = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2764en
    /* renamed from: ﾇ */
    public final Number mo6779(Number number, Number number2) {
        int i = (f6312 + 107) % 128;
        f6313 = i;
        if (!(number instanceof Double)) {
            int i2 = i + 115;
            f6312 = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = number2 instanceof Double;
                throw null;
            }
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    f6312 = (i + 95) % 128;
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number.intValue() % number2.intValue());
                    }
                }
                return Long.valueOf(number.longValue() % number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() % number2.doubleValue());
    }
}

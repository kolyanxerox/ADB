package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3037dc;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fb */
/* loaded from: classes2.dex */
public final class C2779fb extends AbstractC2756ef {

    /* renamed from: ﻐ */
    private static char f6329 = 1;

    /* renamed from: ｋ */
    private static int f6330 = 0;

    /* renamed from: ﾇ */
    private static char[] f6331 = {'|'};

    /* renamed from: ﾒ */
    private static int f6332 = 1;

    public C2779fb(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ﾒ */
    private static String m6792(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6331;
                char c = f6329;
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
        byte windowTouchSlop;
        int iIndexOf;
        int i = f6330 + 15;
        f6332 = i % 128;
        if (i % 2 == 0) {
            windowTouchSlop = (byte) ((ViewConfiguration.getWindowTouchSlop() >> 81) + 75);
            TextUtils.indexOf("", C3037dc.f8244T);
            iIndexOf = 0;
        } else {
            windowTouchSlop = (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 63);
            iIndexOf = 1 - TextUtils.indexOf((CharSequence) "", '0');
        }
        return m6792(windowTouchSlop, "»»", iIndexOf).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        int i = f6332 + InterfaceC3173h3.d.b.f8821d;
        f6330 = i % 128;
        if (i % 2 != 0) {
            m6765().m6760(c2741dr, c2712cp).m6721();
            throw null;
        }
        C2744du c2744duM6760 = m6765().m6760(c2741dr, c2712cp);
        if (!c2744duM6760.m6721()) {
            return m6764().m6760(c2741dr, c2712cp);
        }
        int i2 = f6330 + 59;
        f6332 = i2 % 128;
        if (i2 % 2 != 0) {
            return c2744duM6760;
        }
        throw null;
    }
}

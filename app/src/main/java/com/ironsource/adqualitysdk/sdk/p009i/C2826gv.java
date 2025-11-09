package com.ironsource.adqualitysdk.sdk.p009i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.tapjoy.Tapjoy;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gv */
/* loaded from: classes2.dex */
public final class C2826gv extends AbstractC2813gi {

    /* renamed from: ﻛ */
    private static char f6525 = 4;

    /* renamed from: ｋ */
    private static char[] f6526 = {'c', 'o', 'm', '.', 't', 'a', 'p', 'j', 'y', 'T', 'd', 'e', 'f', 'g', 'h', 'i'};

    /* renamed from: ﾇ */
    private static int f6527 = 1;

    /* renamed from: ﾒ */
    private static int f6528;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6528 + 27;
        f6527 = i % 128;
        String strIntern = (i % 2 == 0 ? m6845((byte) ((ViewConfiguration.getLongPressTimeout() % 16) * 28), "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\u0000\t\u0001\u000b\u0006\u0007\u0005\u0003ð", InterfaceC3173h3.d.b.f8821d / (ViewConfiguration.getLongPressTimeout() % 19)) : m6845((byte) (119 - (ViewConfiguration.getLongPressTimeout() >> 16)), "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\u0000\t\u0001\u000b\u0006\u0007\u0005\u0003ð", (ViewConfiguration.getLongPressTimeout() >> 16) + 17)).intern();
        f6527 = (f6528 + 25) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6527 = (f6528 + 47) % 128;
        String strIntern = m6845((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21), "\u0005\u0006\u0007\u0004\u0000\t", TextUtils.indexOf("", "") + 6).intern();
        int i = f6528 + 95;
        f6527 = i % 128;
        if (i % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = (f6528 + 41) % 128;
        f6527 = i;
        f6528 = (i + 25) % 128;
        return Tapjoy.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2701ce c2701ce = new C2701ce(mo6813());
        int i = f6527 + 27;
        f6528 = i % 128;
        if (i % 2 == 0) {
            return c2701ce;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static String m6845(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6526;
                char c = f6525;
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
}

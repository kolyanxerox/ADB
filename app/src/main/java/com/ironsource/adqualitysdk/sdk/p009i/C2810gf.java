package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.chartboost.sdk.Chartboost;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gf */
/* loaded from: classes2.dex */
public final class C2810gf extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6454 = 1;

    /* renamed from: ﻛ */
    private static int[] f6455 = {-434099454, -1457314231, -771968179, 2109500617, 2083488763, 70541128, -1564886261, 1065077304, 2146015993, 1994559323, 413903266, -11670557, 1987381323, -1999253732, 504038993, 1866668567, -297737277, -1383919022};

    /* renamed from: ﾇ */
    private static int f6456;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6456 + 93;
        f6454 = i % 128;
        String strIntern = (i % 2 == 0 ? m6827(new int[]{1554642595, 579330174, 1046953025, 1122549119, -774843644, -118747119, -438133716, 839537002, 42495053, -1163823665, 965989419, 207482137, 540021634, 1949288395, -1254625314, 876548152}, 85 / (ViewConfiguration.getFadingEdgeLength() * 109)) : m6827(new int[]{1554642595, 579330174, 1046953025, 1122549119, -774843644, -118747119, -438133716, 839537002, 42495053, -1163823665, 965989419, 207482137, 540021634, 1949288395, -1254625314, 876548152}, 29 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern();
        f6454 = (f6456 + 57) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6456 + 107;
        f6454 = i % 128;
        int[] iArr = {1046953025, 1122549119, -774843644, -118747119, 469757485, 948759487};
        String strIntern = (i % 2 == 0 ? m6827(iArr, 2 >>> (KeyEvent.getMaxKeyCode() % 96)) : m6827(iArr, 10 - (KeyEvent.getMaxKeyCode() >> 16))).intern();
        f6454 = (f6456 + 5) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6454 + 33;
        f6456 = i % 128;
        if (i % 2 == 0) {
            return Chartboost.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2680bk c2680bk = new C2680bk(mo6813());
        int i = f6454 + 27;
        f6456 = i % 128;
        if (i % 2 == 0) {
            return c2680bk;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6827(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6455.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

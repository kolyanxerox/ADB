package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gt */
/* loaded from: classes2.dex */
public final class C2824gt extends AbstractC2813gi {

    /* renamed from: ﺙ */
    private static int f6514 = 1;

    /* renamed from: ﻏ */
    private static int f6515 = 0;

    /* renamed from: ﻐ */
    private static int f6516 = -157851946;

    /* renamed from: ﻛ */
    private static short[] f6517 = null;

    /* renamed from: ｋ */
    private static byte[] f6518 = {15, 35, -36, -8, -2, -4, 14, -18, 54, 19, -68, 13, -3, -11, 10, -3, 10, -19, 5, 66, -61, 7, -15, 69, -55, -8, -2, -4, 14, -18, 22, -17, 13, -11, -5, 2, 69, -72, 2, -8, -2, -4, 14, -18, 22, -17, 13, -11, -5, 2, 0, 0};

    /* renamed from: ﾇ */
    private static int f6519 = 75;

    /* renamed from: ﾒ */
    private static int f6520 = 409191572;

    /* renamed from: ﾒ */
    private static String m6843(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f6519;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f6518;
                    i5 = bArr != null ? (byte) (bArr[f6516 + i2] + i4) : (short) (f6517[f6516 + i2] + i4);
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f6516 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f6520);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f6518;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f6517;
                            int i8 = C2912k.f7203;
                            C2912k.f7203 = i8 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((short) (sArr[i8] + s)) ^ C2912k.f7201));
                        }
                        sb.append(C2912k.f7204);
                        C2912k.f7202 = C2912k.f7204;
                        C2912k.f7205++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6515 = (f6514 + 39) % 128;
        String strIntern = m6843((byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (short) KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "") - 35, (ViewConfiguration.getWindowTouchSlop() >> 8) + 157851946, (-409191456) - TextUtils.indexOf("", "", 0, 0)).intern();
        int i = f6514 + 69;
        f6515 = i % 128;
        if (i % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6515 = (f6514 + 95) % 128;
        String strIntern = m6843((byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 63, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 157851985, ExpandableListView.getPackedPositionChild(0L) - 409191456).intern();
        f6514 = (f6515 + 39) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6515 + 19;
        int i2 = i % 128;
        f6514 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = i2 + 73;
        f6515 = i3 % 128;
        if (i3 % 2 == 0) {
            return AwesomeAds.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2702cf c2702cf = new C2702cf(mo6813());
        f6514 = (f6515 + 9) % 128;
        return c2702cf;
    }
}

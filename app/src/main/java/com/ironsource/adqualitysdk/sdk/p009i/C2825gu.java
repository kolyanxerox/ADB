package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.smaato.sdk.core.SmaatoSdk;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gu */
/* loaded from: classes2.dex */
public final class C2825gu extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6521 = 0;

    /* renamed from: ﾇ */
    private static int f6523 = 1;

    /* renamed from: ﾒ */
    private static char[] f6524 = {'c', 46707, 27733, 8826, 55299, 36577, 17609, 64165, 45204, 26259, 7478, 54087, 35124, 16135, 62886, 43975, 25007, 6062, 52637, 33850, 14947, 61473, 42505, 23781, 4820, 51411, 32395, 13456, 60283, 62954, 17384, 39360, 55212, 11677, 31610};

    /* renamed from: ｋ */
    private static long f6522 = -2780963532871125476L;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6523 = (f6521 + 115) % 128;
        String strIntern = m6844(View.MeasureSpec.getSize(0) + 29, TextUtils.getTrimmedLength(""), (char) Color.blue(0)).intern();
        int i = f6523 + 121;
        f6521 = i % 128;
        if (i % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6521 = (f6523 + 33) % 128;
        String strIntern = m6844((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, (char) (62874 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern();
        int i = f6523 + 25;
        f6521 = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = (f6523 + 125) % 128;
        f6521 = i;
        int i2 = i + 43;
        f6523 = i2 % 128;
        if (i2 % 2 != 0) {
            return SmaatoSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2693bx c2693bx = new C2693bx(mo6813());
        f6521 = (f6523 + 63) % 128;
        return c2693bx;
    }

    /* renamed from: ﾇ */
    private static String m6844(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6524[i2 + i3] ^ (i3 * f6522)) ^ c);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

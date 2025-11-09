package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.my.target.common.MyTargetManager;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gr */
/* loaded from: classes2.dex */
public final class C2822gr extends AbstractC2813gi {

    /* renamed from: ﱡ */
    private static int f6504 = 0;

    /* renamed from: ﺙ */
    private static int f6505 = 1;

    /* renamed from: ﻐ */
    private static short[] f6506 = null;

    /* renamed from: ﻛ */
    private static int f6507 = 47;

    /* renamed from: ｋ */
    private static int f6508 = 2034834784;

    /* renamed from: ﾇ */
    private static int f6509 = -1199171301;

    /* renamed from: ﾒ */
    private static byte[] f6510 = {-80, 67, -69, 78, -80, -87, 100, -78, 67, 72, -84, -80, 102, -111, -94, 125, 66, -65, -67, 67, -79, -120, 7, -78, 67, 72, -84, 80, -5, 8, -79, -126, 124, 67, -79, -53, 58, 49, -43, 41, Utf8.REPLACEMENT_BYTE, -56, 0, 0};

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6505 = (f6504 + 21) % 128;
        String strIntern = m6841((byte) ((-67) - View.combineMeasuredStates(0, 0)), (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 12, 1199171301 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) - 2034834685).intern();
        f6505 = (f6504 + 95) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6504 = (f6505 + 37) % 128;
        String strIntern = m6841((byte) (TextUtils.indexOf((CharSequence) "", '0') - 59), (short) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 38, 1199171335 - MotionEvent.axisFromString(""), (-2034834676) - MotionEvent.axisFromString("")).intern();
        int i = f6505 + 5;
        f6504 = i % 128;
        if (i % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6504 + 9;
        f6505 = i % 128;
        if (i % 2 != 0) {
            return MyTargetManager.class;
        }
        int i2 = 17 / 0;
        return MyTargetManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2697ca c2697ca = new C2697ca(mo6813());
        f6505 = (f6504 + 1) % 128;
        return c2697ca;
    }

    /* renamed from: ﻐ */
    private static String m6841(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f6507;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f6510;
                    i5 = bArr != null ? (byte) (bArr[f6509 + i2] + i4) : (short) (f6506[f6509 + i2] + i4);
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f6509 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f6508);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f6510;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f6506;
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
}

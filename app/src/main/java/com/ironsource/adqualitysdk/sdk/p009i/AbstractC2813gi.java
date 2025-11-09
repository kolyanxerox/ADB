package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.p009i.C2887jb;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gi */
/* loaded from: classes2.dex */
public abstract class AbstractC2813gi {

    /* renamed from: ﺙ */
    private static int f6463 = 1;

    /* renamed from: ﻏ */
    private static int f6464 = 0;

    /* renamed from: ﻐ */
    private static int f6465 = 804813432;

    /* renamed from: ﻛ */
    private static int f6466 = 93;

    /* renamed from: ｋ */
    private static int f6467 = 1391136142;

    /* renamed from: ﾇ */
    private static byte[] f6468 = {-82, 33, -50, -52, 100, -66, 95, 88, -51, 96, -47, -90, 24, 5};

    /* renamed from: ﾒ */
    private static short[] f6469;

    /* renamed from: ﻛ */
    private static String m6830(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f6466;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f6468;
                    i5 = bArr != null ? (byte) (bArr[f6467 + i2] + i4) : (short) (f6469[f6467 + i2] + i4);
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f6467 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f6465);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f6468;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f6469;
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

    /* renamed from: ﻐ */
    public abstract String mo6812();

    /* renamed from: ﻛ */
    public abstract String mo6813();

    /* renamed from: ｋ */
    public abstract Class mo6814();

    /* renamed from: ﾇ */
    public abstract AbstractC2676bg mo6815();

    /* renamed from: ﾒ */
    public final C2887jb.e m6831() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6830((byte) ((-74) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (short) ((-23) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 94, (-1391136142) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-804813333) - Drawable.resolveOpacity(0, 0)).intern());
        sb.append(mo6813());
        C2887jb.e eVar = new C2887jb.e(sb.toString(), m6830((byte) (TextUtils.indexOf((CharSequence) "", '0') + 13), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 11), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 93, Color.red(0) - 1391136131, (-804813378) - TextUtils.indexOf((CharSequence) "", '0')).intern());
        int i = f6464 + 59;
        f6463 = i % 128;
        if (i % 2 != 0) {
            return eVar;
        }
        throw null;
    }
}

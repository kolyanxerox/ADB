package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fy */
/* loaded from: classes2.dex */
public final class C2802fy extends AbstractC2813gi {

    /* renamed from: ﻛ */
    private static int f6415 = 1;

    /* renamed from: ﾇ */
    private static int f6416;

    /* renamed from: ﻐ */
    private static char[] f6414 = {'c', 61908, 58139, 54559, 50821, 47317, 43533, 40051, 36267, 32764, 28987, 25467, 21671, 17946, 14356, 10644, 7124, 3354, 65363, 61568, 58096, 54334, 50790, 47028, 43515, 39719, 35989, 32407, 28679, 25163, 21377, 17803, 14121, 10601, 6841, 3327, 65055, 61544, 57783, 54031, 50523, 46742, 43247, 39437, 35957, 32170, 28667, 24889, 21369, 17599, 14079, 17900, 46162, 42634, 37071, 33545, 64843, 61341, 55797, 51249, 14964, 13488};

    /* renamed from: ﾒ */
    private static long f6417 = -6121103182133792325L;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6416 = (f6415 + 121) % 128;
        String strIntern = m6818((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51, Color.green(0), (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern();
        f6415 = (f6416 + 65) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6415 = (f6416 + InterfaceC3173h3.d.b.f8819b) % 128;
        String strIntern = m6818(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, 50 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17804)).intern();
        f6415 = (f6416 + 81) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6415 + 25;
        f6416 = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2674be c2674be = new C2674be(mo6813());
        int i = f6415 + 45;
        f6416 = i % 128;
        if (i % 2 != 0) {
            int i2 = 88 / 0;
        }
        return c2674be;
    }

    /* renamed from: ﻐ */
    private static String m6818(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6414[i2 + i3] ^ (i3 * f6417)) ^ c);
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

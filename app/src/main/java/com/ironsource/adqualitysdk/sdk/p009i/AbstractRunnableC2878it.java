package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.it */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC2878it implements Runnable {

    /* renamed from: ﻛ */
    private static char[] f6848 = {54883, 57639, 47296, 29600, 2841, 49864, 40329, 21884, 27849, 10171, 65378, 46803, 16771, 6520, 'E', 14112, 28374, 42393, 56634, 5306, 19333, 33616, 47792, 61825, 10584, 24807, 38827, 53081, 1628, 'C', 14142, 28357, 42373, 56635, 5298, 48168, 'D', 14135, 28368, 42391, 56609, 5366, 19359, 33540};

    /* renamed from: ｋ */
    private static long f6849 = 5018789748691646290L;

    /* renamed from: ﾇ */
    private static int f6850 = 0;

    /* renamed from: ﾒ */
    private static int f6851 = 1;

    /* renamed from: ﾇ */
    private static String m7119(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6848[i2 + i3] ^ (i3 * f6849)) ^ c);
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

    @Override // java.lang.Runnable
    public final void run() {
        int i = f6851 + 37;
        f6850 = i % 128;
        try {
            if (i % 2 == 0) {
                mo4950();
            } else {
                mo4950();
                throw null;
            }
        } catch (Throwable th) {
            try {
                mo5316(th);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﻐ */
    public void mo5316(Throwable th) {
        String strIntern = m7119(14 - (ViewConfiguration.getTapTimeout() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 54839)).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(m7119(15 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, (char) (ViewConfiguration.getTouchSlop() >> 8)).intern());
        sb.append(getClass().getName());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m7119(6 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Color.red(0)).intern());
        sb2.append(getClass().getName());
        sb2.append(m7119((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, 35 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 48130)).intern());
        C2914kb.m7422(strIntern, string, sb2.toString(), th);
        String strIntern2 = m7119(View.combineMeasuredStates(0, 0) + 14, ViewConfiguration.getScrollDefaultDelay() >> 16, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 54839)).intern();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m7119(TextUtils.indexOf((CharSequence) "", '0') + 16, 14 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern());
        sb3.append(getClass().getName());
        C2921n.m7509(strIntern2, sb3.toString());
        C2921n.m7506(m7119(Color.blue(0) + 14, (-1) - Process.getGidForName(""), (char) (54839 - Color.alpha(0))).intern(), m7119(7 - ExpandableListView.getPackedPositionChild(0L), View.resolveSizeAndState(0, 0, 0) + 36, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), th);
        int i = f6850 + 69;
        f6851 = i % 128;
        if (i % 2 == 0) {
            int i2 = 98 / 0;
        }
    }

    /* renamed from: ﾒ */
    public abstract void mo4950() throws Exception;
}

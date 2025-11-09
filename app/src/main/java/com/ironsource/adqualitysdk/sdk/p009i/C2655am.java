package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.am */
/* loaded from: classes2.dex */
public final class C2655am {

    /* renamed from: ﱡ */
    private static int f4672 = 1;

    /* renamed from: ﻐ */
    private static char f4673 = 28484;

    /* renamed from: ﻛ */
    private static char f4674 = 24929;

    /* renamed from: ｋ */
    private static int f4675 = 0;

    /* renamed from: ﾇ */
    private static char f4676 = 26745;

    /* renamed from: ﾒ */
    private static char f4677 = 11118;

    /* renamed from: ﻐ */
    public static Class m5096() {
        boolean z;
        int iGreen;
        int i = f4672 + InterfaceC3173h3.d.b.f8823f;
        f4675 = i % 128;
        if (i % 2 != 0) {
            z = true;
            iGreen = 68 - Color.green(1);
        } else {
            z = false;
            iGreen = Color.green(0) + 60;
        }
        Class clsM7398 = C2911jz.m7398(m5099("ᘝ夣朽昆ᑺ\udd8eཬ䗠횡㝨ﰯ\ue09a鴦腌ؽᕤⱔ퓉❧〴誏頒▎봤ᘝ夣䰣\udbee\ufffe鰢⏕㌔\ue832먄⦠捗㾯⊗\udeb9㡑ﰯ\ue09a鴦腌趘ᆒⱔ퓉❧〴誏頒\udbfc⧏ᘝ夣䰣\udbee\ufffe鰢", iGreen).intern(), z);
        int i2 = f4672 + 51;
        f4675 = i2 % 128;
        if (i2 % 2 == 0) {
            return clsM7398;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static void m5097(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f4672 = (f4675 + 35) % 128;
        try {
            C2911jz.m7400(obj, m5099("ഉ쯘醢醁辮臀\ufffe鰢㹃쐊ֿ毘ᮾ┃\ufffe鰢", 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            f4672 = (f4675 + 31) % 128;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﾒ */
    public static Object m5098(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f4675 = (f4672 + 97) % 128;
        try {
            Object objInvoke = C2911jz.m7400(m5096(), m5099("䞵줯暞隷ᰋ䉶\ue298麟䉻蓊⊱펷", 11 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), Arrays.asList(context)).invoke(null, context);
            int i = f4675 + 49;
            f4672 = i % 128;
            if (i % 2 == 0) {
                int i2 = 34 / 0;
            }
            return objInvoke;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ﾒ */
    public static void m5100(Object obj, BroadcastReceiver broadcastReceiver) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f4672 = (f4675 + 119) % 128;
        try {
            C2911jz.m7400(obj, m5099("꧕涽ഉ쯘醢醁辮臀\ufffe鰢㹃쐊ֿ毘ᮾ┃\ufffe鰢", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18).intern(), Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
            int i = f4675 + 3;
            f4672 = i % 128;
            if (i % 2 == 0) {
                int i2 = 77 / 0;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﾒ */
    private static String m5099(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2920m.f7237) {
            try {
                char[] cArr2 = new char[cArr.length];
                C2920m.f7236 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i2 = C2920m.f7236;
                    if (i2 < cArr.length) {
                        cArr3[0] = cArr[i2];
                        cArr3[1] = cArr[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f4673)) ^ ((c2 >>> 5) + f4677)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f4674) ^ ((c3 + i3) ^ ((c3 << 4) + f4676))));
                            i3 -= 40503;
                        }
                        int i5 = C2920m.f7236;
                        cArr2[i5] = cArr3[0];
                        cArr2[i5 + 1] = cArr3[1];
                        C2920m.f7236 = i5 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

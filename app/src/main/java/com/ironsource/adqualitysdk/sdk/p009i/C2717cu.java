package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import android.widget.VideoView;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cu */
/* loaded from: classes2.dex */
public final class C2717cu extends C2722cz {
    /* renamed from: ﮐ */
    public static Object m6395(List<Object> list) {
        return C2909jx.m7352((VideoView) C2722cz.m6459(list, 0, VideoView.class));
    }

    /* renamed from: ﻐ */
    public static Object m6396(List<Object> list) {
        return ((Pair) C2722cz.m6459(list, 0, Pair.class)).second;
    }

    /* renamed from: ﻛ */
    public static Object m6397(List<Object> list) {
        return ((Pair) C2722cz.m6459(list, 0, Pair.class)).first;
    }

    /* renamed from: ｋ */
    public static Object m6398(List<Object> list) {
        return C2655am.m5098((Context) C2722cz.m6459(list, 0, Context.class));
    }

    /* renamed from: ﾇ */
    public static Object m6399(List<Object> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = (Context) C2722cz.m6459(list, 0, Context.class);
        C2655am.m5100(C2655am.m5098(context), (BroadcastReceiver) C2722cz.m6459(list, 1, BroadcastReceiver.class));
        return null;
    }

    /* renamed from: ﾒ */
    public static Object m6401(List<Object> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = (Context) C2722cz.m6459(list, 0, Context.class);
        C2655am.m5097(C2655am.m5098(context), (BroadcastReceiver) C2722cz.m6459(list, 1, BroadcastReceiver.class), (IntentFilter) C2722cz.m6459(list, 2, IntentFilter.class));
        return null;
    }

    /* renamed from: ﾒ */
    public static long m6400() {
        return C2906ju.m7339();
    }
}

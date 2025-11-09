package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dd */
/* loaded from: classes2.dex */
public final class C2727dd extends C2722cz {
    /* renamed from: ﻛ */
    public static View m6483(List<Object> list) {
        return C2917ke.m7471((Activity) C2722cz.m6459(list, 0, Activity.class));
    }

    /* renamed from: ｋ */
    public static boolean m6484(List<Object> list) {
        return C2917ke.m7466((View) C2722cz.m6459(list, 0, View.class));
    }

    /* renamed from: ﾇ */
    public static <E extends View> E m6485(List<Object> list) {
        return (E) C2917ke.m7463((View) C2722cz.m6459(list, 0, View.class), (Class) C2722cz.m6459(list, 1, Class.class), ((Boolean) C2722cz.m6459(list, 2, Boolean.class)).booleanValue());
    }

    /* renamed from: ﾒ */
    public static WebView m6486(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) C2722cz.m6459(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) C2722cz.m6459(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) C2722cz.m6459(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) C2722cz.m6459(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) C2917ke.m7462(activity, WebView.class, iIntValue, arrayList, str);
    }
}

package com.iab.omid.library.unity3d.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.unity3d.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.unity3d.utils.a */
/* loaded from: classes2.dex */
public final class C2603a {

    /* renamed from: a */
    private static UiModeManager f3795a;

    /* renamed from: a */
    public static DeviceCategory m4617a() {
        UiModeManager uiModeManager = f3795a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    /* renamed from: a */
    public static void m4618a(Context context) {
        if (context != null) {
            f3795a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

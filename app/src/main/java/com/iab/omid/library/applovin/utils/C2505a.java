package com.iab.omid.library.applovin.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.applovin.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.applovin.utils.a */
/* loaded from: classes2.dex */
public final class C2505a {

    /* renamed from: a */
    private static UiModeManager f3531a;

    /* renamed from: a */
    public static DeviceCategory m4123a() {
        UiModeManager uiModeManager = f3531a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    /* renamed from: a */
    public static void m4124a(Context context) {
        if (context != null) {
            f3531a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

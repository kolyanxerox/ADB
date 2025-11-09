package com.iab.omid.library.ironsrc.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.ironsrc.utils.a */
/* loaded from: classes2.dex */
public final class C2556a {

    /* renamed from: a */
    private static UiModeManager f3666a;

    /* renamed from: a */
    public static DeviceCategory m4376a() {
        UiModeManager uiModeManager = f3666a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    /* renamed from: a */
    public static void m4377a(Context context) {
        if (context != null) {
            f3666a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

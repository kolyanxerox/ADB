package com.applovin.impl;

import android.content.Context;
import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C0967b;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.g */
/* loaded from: classes.dex */
public abstract class AbstractC1030g {
    /* renamed from: a */
    public static void m766a(AbstractC1207b abstractC1207b, AppLovinFullscreenActivity appLovinFullscreenActivity, C1220k c1220k) {
        String strM507b = AbstractC1000d.m507b(appLovinFullscreenActivity);
        String strM503a = AbstractC1000d.m503a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z = false;
        boolean z2 = StringUtils.isValidString(strM507b) && !strM507b.equals(packageName);
        if (StringUtils.isValidString(strM503a) && !strM503a.equals(packageName)) {
            z = true;
        }
        if (z2 || z) {
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207b);
            mapM675a.put("activity_task_affinity_mismatch", String.valueOf(z2));
            mapM675a.put("base_activity_task_affinity_mismatch", String.valueOf(z));
            c1220k.m2832E().m572a(C0993c2.f536q0, "taskAffinityMismatch", mapM675a);
        }
    }

    /* renamed from: a */
    public static void m765a(C0967b c0967b, C1220k c1220k) {
        if (c0967b == null) {
            return;
        }
        boolean zM2359a = AbstractC1183s.m2359a(c0967b);
        boolean zM767a = m767a(c0967b.getContext());
        if (zM767a || zM2359a) {
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) c0967b.getCurrentAd());
            mapM675a.put("can_draw_overlays", String.valueOf(zM767a));
            mapM675a.put("is_ad_view_overlaid", String.valueOf(zM2359a));
            c1220k.m2832E().m572a(C0993c2.f536q0, "overlayViolation", mapM675a);
        }
    }

    /* renamed from: a */
    private static boolean m767a(Context context) {
        if (AbstractC1141o0.m1950f()) {
            return Settings.canDrawOverlays(context);
        }
        return AbstractC1141o0.m1937a("android.permission.SYSTEM_ALERT_WINDOW", context);
    }
}

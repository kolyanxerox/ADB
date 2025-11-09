package com.applovin.impl;

import android.adservices.AdServicesState;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.o4 */
/* loaded from: classes.dex */
public abstract class AbstractC1145o4 {
    /* renamed from: a */
    public static boolean m2007a(Context context) {
        return AbstractC1141o0.m1937a("android.permission.ACCESS_ADSERVICES_AD_ID", context);
    }

    /* renamed from: b */
    public static boolean m2008b(Context context) {
        return AbstractC1141o0.m1937a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION", context);
    }

    /* renamed from: c */
    public static boolean m2009c(Context context) {
        return AbstractC1141o0.m1937a("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE", context);
    }

    /* renamed from: d */
    public static boolean m2010d(Context context) {
        return AbstractC1141o0.m1937a("android.permission.ACCESS_ADSERVICES_TOPICS", context);
    }

    /* renamed from: e */
    public static boolean m2011e(Context context) {
        return m2012f(context) && AdServicesState.isAdServicesStateEnabled();
    }

    /* renamed from: f */
    public static boolean m2012f(Context context) {
        return AbstractC1141o0.m1948d() && !AppLovinSdkUtils.isFireOS(context);
    }
}

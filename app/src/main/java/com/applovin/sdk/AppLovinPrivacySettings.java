package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.AbstractC1150p0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i) {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k != null) {
            return c1220k.m2920s0().m3620a(i);
        }
        C1240o.m3207h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i) {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k != null) {
            return c1220k.m2920s0().m3621b(i);
        }
        C1240o.m3207h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i) {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k != null) {
            return c1220k.m2920s0().m3623c(i);
        }
        C1240o.m3207h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i) {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k != null) {
            return c1220k.m2920s0().m3625d(i);
        }
        C1240o.m3207h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(C1220k.m2824o());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(C1220k.m2824o());
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(C1220k.m2824o());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(C1220k.m2824o());
    }

    public static void setDoNotSell(boolean z) {
        setDoNotSell(z, C1220k.m2824o());
    }

    public static void setHasUserConsent(boolean z) {
        setHasUserConsent(z, C1220k.m2824o());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolM2052b = AbstractC1150p0.m2046b().m2052b(context);
        if (boolM2052b != null) {
            return boolM2052b.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolM2052b = AbstractC1150p0.m2041a().m2052b(context);
        if (boolM2052b != null) {
            return boolM2052b.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return AbstractC1150p0.m2041a().m2052b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return AbstractC1150p0.m2046b().m2052b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z, Context context) {
        C1240o.m3206g("AppLovinPrivacySettings", "setDoNotSell()");
        if (AbstractC1150p0.m2045a(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z, Context context) {
        C1240o.m3206g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (AbstractC1150p0.m2047b(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z), null);
        }
    }
}

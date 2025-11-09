package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.C1093m2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create() {
        return create(AppLovinSdk.getInstance(C1220k.m2824o()), C1220k.m2824o());
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }

    @Deprecated
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            return new C1093m2(appLovinSdk, context);
        }
        throw new IllegalArgumentException("No context specified");
    }
}

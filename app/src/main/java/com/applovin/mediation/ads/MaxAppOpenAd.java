package com.applovin.mediation.ads;

import OooO0oO.OooOo;
import android.content.Context;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxAppOpenAd {

    /* renamed from: a */
    private final MaxFullscreenAdImpl f3266a;

    public MaxAppOpenAd(String str) {
        this(str, C1220k.m2824o());
    }

    public void destroy() {
        this.f3266a.logApiCall("destroy()");
        this.f3266a.destroy();
    }

    public String getAdUnitId() {
        return this.f3266a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f3266a.isReady();
        this.f3266a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f3266a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f3266a.logApiCall("loadAd()");
        this.f3266a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f3266a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f3266a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f3266a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f3266a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f3266a.logApiCall(OooOo.OooOO0o("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f3266a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f3266a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f3266a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f3266a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f3266a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f3266a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f3266a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f3266a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f3266a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f3266a;
    }

    @Deprecated
    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    @Deprecated
    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, C1220k.m2824o());
    }

    public void showAd(String str, String str2) {
        this.f3266a.logApiCall(OooOo.OooOO0o("showAd(placement=", str, ", customData=", str2, ")"));
        AbstractC1078k7.m1217b(str2, "MaxAppOpenAd");
        this.f3266a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC1118a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f3266a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.m3943a(), context);
    }
}

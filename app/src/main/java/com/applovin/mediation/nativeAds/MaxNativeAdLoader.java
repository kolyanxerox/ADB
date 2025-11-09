package com.applovin.mediation.nativeAds;

import OooO0oO.OooOo;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* renamed from: a */
    private final MaxNativeAdLoaderImpl f3287a;

    public MaxNativeAdLoader(String str) {
        this(str, C1220k.m2824o());
    }

    /* renamed from: a */
    public void m3924a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f3287a.logApiCall("a()");
        this.f3287a.registerClickableViews(list, viewGroup, maxAd);
    }

    /* renamed from: b */
    public void m3925b(MaxAd maxAd) {
        this.f3287a.logApiCall("b()");
        this.f3287a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f3287a.logApiCall("destroy()");
        this.f3287a.destroy();
    }

    public String getAdUnitId() {
        return this.f3287a.getAdUnitId();
    }

    public String getPlacement() {
        this.f3287a.logApiCall("getPlacement()");
        return this.f3287a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f3287a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f3287a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f3287a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f3287a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f3287a.logApiCall("setCustomData(value=" + str + ")");
        this.f3287a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f3287a.logApiCall(OooOo.OooOO0o("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f3287a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f3287a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f3287a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f3287a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f3287a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f3287a.logApiCall("setPlacement(placement=" + str + ")");
        this.f3287a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f3287a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f3287a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f3287a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f3287a.loadAd(maxNativeAdView);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC1118a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f3287a = new MaxNativeAdLoaderImpl(str, appLovinSdk.m3943a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void destroy(MaxAd maxAd) {
        this.f3287a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f3287a.destroy(maxAd);
    }
}

package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3451ne;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class IronSource {

    @Deprecated
    public enum AD_UNIT {
        REWARDED_VIDEO(C3451ne.f10412E0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* renamed from: a */
        private String f9529a;

        AD_UNIT(String str) {
            this.f9529a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f9529a;
        }
    }

    @Deprecated
    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C3404p.m10470j().mo10537b(impressionDataListener);
    }

    @Deprecated
    public static void clearRewardedVideoServerParameters() {
        C3404p.m10470j().clearRewardedVideoServerParameters();
    }

    @Deprecated
    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        return C3404p.m10470j().m10529b(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return C3404p.m10470j().mo10491a(activity, iSBannerSize);
    }

    @Deprecated
    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C3404p.m10470j().m10511a(ironSourceBannerLayout);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        C3404p.m10470j().mo10544c(str);
    }

    @Deprecated
    public static String getAdvertiserId(Context context) {
        return C3404p.m10470j().getAdvertiserId(context);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return C3404p.m10470j().mo10496a(context);
    }

    @Deprecated
    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return C3404p.m10470j().getInterstitialPlacementInfo(str);
    }

    @Deprecated
    public static Placement getRewardedVideoPlacementInfo(String str) {
        return C3404p.m10470j().getRewardedVideoPlacementInfo(str);
    }

    @Deprecated
    public static void init(Context context, String str) {
        init(context, str, (AD_UNIT[]) null);
    }

    @Deprecated
    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        C3404p.m10470j().mo10508a(context, str, ad_unitArr);
    }

    @Deprecated
    public static boolean isBannerPlacementCapped(String str) {
        return C3404p.m10470j().m10557m(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return C3404p.m10470j().mo10549e(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return C3404p.m10470j().mo10551f(str);
    }

    @Deprecated
    public static boolean isInterstitialPlacementCapped(String str) {
        return C3404p.m10470j().m10559n(str);
    }

    @Deprecated
    public static boolean isInterstitialReady() {
        return C3404p.m10470j().m10483D();
    }

    @Deprecated
    public static boolean isRewardedVideoAvailable() {
        return C3404p.m10470j().m10484I();
    }

    @Deprecated
    public static boolean isRewardedVideoPlacementCapped(String str) {
        return C3404p.m10470j().m10560o(str);
    }

    @Deprecated
    public static void launchTestSuite(Context context) {
        IronLog.API.info("");
        C3404p.m10470j().m10535b(context);
    }

    @Deprecated
    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C3404p.m10470j().m10536b(ironSourceBannerLayout);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C3404p.m10470j().mo10503a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C3404p.m10470j().mo10504a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        C3404p.m10470j().mo10505a(activity, str);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        C3404p.m10470j().mo10534b(activity, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        C3404p.m10470j().mo10533b(activity, str);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        C3404p.m10470j().mo10506a(activity, str, str2);
    }

    @Deprecated
    public static void loadInterstitial() {
        C3404p.m10470j().m10486N();
    }

    @Deprecated
    public static void loadRewardedVideo() {
        C3404p.m10470j().m10487O();
    }

    @Deprecated
    public static void onPause(Activity activity) {
        C3404p.m10470j().m10502a(activity);
    }

    @Deprecated
    public static void onResume(Activity activity) {
        C3404p.m10470j().m10532b(activity);
    }

    @Deprecated
    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C3404p.m10470j().mo10517a(impressionDataListener);
    }

    @Deprecated
    public static void removeInterstitialListener() {
        C3404p.m10470j().removeInterstitialListener();
    }

    @Deprecated
    public static void removeRewardedVideoListener() {
        C3404p.m10470j().removeRewardedVideoListener();
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        C3404p.m10470j().m10524a(str, jSONObject);
    }

    @Deprecated
    public static void setAdaptersDebug(boolean z) {
        C3404p.m10470j().setAdaptersDebug(z);
    }

    @Deprecated
    public static void setConsent(boolean z) {
        IronLog.API.info("consent = " + z);
        C3404p.m10470j().m10526a(z);
    }

    @Deprecated
    public static boolean setDynamicUserId(String str) {
        IronLog.API.info("dynamicUserId: " + str);
        return C3404p.m10470j().setDynamicUserId(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C3404p.m10470j().mo10514a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C3404p.m10470j().mo10515a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        C3404p.m10470j().m10518a(levelPlayInterstitialListener);
    }

    @Deprecated
    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        C3404p.m10470j().m10519a(levelPlayRewardedVideoListener);
    }

    @Deprecated
    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        C3404p.m10470j().m10520a(levelPlayRewardedVideoManualListener);
    }

    @Deprecated
    public static void setLogListener(LogListener logListener) {
        C3404p.m10470j().mo9692a(logListener);
    }

    public static void setMediationType(String str) {
        C3404p.m10470j().setMediationType(str);
    }

    @Deprecated
    public static void setMetaData(String str, String str2) {
        IronLog.API.info("key = " + str + ", value = " + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        C3404p.m10470j().m10523a(str, arrayList);
    }

    @Deprecated
    public static void setNetworkData(String str, JSONObject jSONObject) {
        IronLog.API.info("networkKey = " + str + ", networkData = " + jSONObject);
        C3404p.m10470j().m10540b(str, jSONObject);
    }

    @Deprecated
    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        C3404p.m10470j().setRewardedVideoServerParameters(map);
    }

    @Deprecated
    public static void setSegment(IronSourceSegment ironSourceSegment) {
        IronLog.API.info("");
        C3404p.m10470j().m10513a(ironSourceSegment);
    }

    @Deprecated
    public static void setSegmentListener(SegmentListener segmentListener) {
        C3404p.m10470j().m10521a(segmentListener);
    }

    @Deprecated
    public static void setUserId(String str) {
        C3404p.m10470j().m10562p(str);
    }

    @Deprecated
    public static void setWaterfallConfiguration(WaterfallConfiguration waterfallConfiguration, AD_UNIT ad_unit) {
        C3404p.m10470j().m10510a(ad_unit, waterfallConfiguration);
    }

    @Deprecated
    public static void shouldTrackNetworkState(Context context, boolean z) {
        C3404p.m10470j().shouldTrackNetworkState(context, z);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        C3404p.m10470j().mo10539b(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        C3404p.m10470j().mo10522a(str);
    }

    @Deprecated
    public static void showInterstitial() {
        C3404p.m10470j().m10542c((Activity) null);
    }

    @Deprecated
    public static void showRewardedVideo() {
        C3404p.m10470j().m10546d((Activity) null);
    }

    @Deprecated
    public static void init(Context context, String str, InitializationListener initializationListener) {
        init(context, str, initializationListener, null);
    }

    @Deprecated
    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        C3404p.m10470j().m10512a(ironSourceBannerLayout, str);
    }

    @Deprecated
    public static void setMetaData(String str, List<String> list) {
        IronLog.API.info("key = " + str + ", values = " + list);
        C3404p.m10470j().m10523a(str, list);
    }

    @Deprecated
    public static void showInterstitial(Activity activity) {
        C3404p.m10470j().m10542c(activity);
    }

    @Deprecated
    public static void showRewardedVideo(Activity activity) {
        C3404p.m10470j().m10546d(activity);
    }

    @Deprecated
    public static void init(Context context, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        C3404p.m10470j().m10507a(context, str, false, initializationListener, ad_unitArr);
    }

    @Deprecated
    public static void showInterstitial(Activity activity, String str) {
        C3404p.m10470j().m10543c(activity, str);
    }

    @Deprecated
    public static void showRewardedVideo(Activity activity, String str) {
        C3404p.m10470j().m10550f(activity, str);
    }

    @Deprecated
    public static void init(Context context, String str, AD_UNIT... ad_unitArr) {
        C3404p.m10470j().m10507a(context, str, false, (InitializationListener) null, ad_unitArr);
    }

    @Deprecated
    public static void showInterstitial(String str) {
        C3404p.m10470j().m10543c(null, str);
    }

    @Deprecated
    public static void showRewardedVideo(String str) {
        C3404p.m10470j().m10550f(null, str);
    }
}

package com.applovin.applovin_max;

import OooO.OooO00o;
import OooO0oO.OooOo;
import OooOo.OooOO0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3034d9;
import com.ironsource.C3166gv;
import com.ironsource.C3912zo;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.BuildConfig;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinMAX implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener, MaxAdRevenueListener {
    private static final Map<String, String> ALCompatibleNativeSdkVersions;
    private static final String BOTTOM_CENTER = "bottom_center";
    private static final String BOTTOM_LEFT = "bottom_left";
    private static final String BOTTOM_RIGHT = "bottom_right";
    private static final String CENTERED = "centered";
    private static final String CENTER_LEFT = "center_left";
    private static final String CENTER_RIGHT = "center_right";
    private static final String PLUGIN_VERSION = "4.5.2";
    private static final String SDK_TAG = "AppLovinSdk";
    public static final String TAG = "AppLovinMAX";
    private static final String TOP_CENTER = "top_center";
    private static final String TOP_LEFT = "top_left";
    private static final String TOP_RIGHT = "top_right";
    private static final String USER_GEOGRAPHY_GDPR = "G";
    private static final String USER_GEOGRAPHY_OTHER = "O";
    private static final String USER_GEOGRAPHY_UNKNOWN = "U";
    public static AppLovinMAX instance;
    private Context applicationContext;
    private List<String> initializationAdUnitIdsToSet;
    private boolean isPluginInitialized;
    private boolean isSdkInitialized;
    private ActivityPluginBinding lastActivityPluginBinding;
    private AppLovinSdk sdk;
    private AppLovinSdkConfiguration sdkConfiguration;
    private MethodChannel sharedChannel;
    private List<String> testDeviceAdvertisingIdsToSet;
    private final MaxSegmentCollection.Builder segmentCollectionBuilder = MaxSegmentCollection.builder();
    private final Map<String, MaxInterstitialAd> mInterstitials = new HashMap(2);
    private final Map<String, MaxRewardedAd> mRewardedAds = new HashMap(2);
    private final Map<String, MaxAppOpenAd> mAppOpenAds = new HashMap(2);
    private final Map<String, MaxAdView> mAdViews = new HashMap(2);
    private final Map<String, MaxAdFormat> mAdViewAdFormats = new HashMap(2);
    private final Map<String, String> mAdViewPositions = new HashMap(2);
    private final List<String> mAdUnitIdsToShowAfterCreate = new ArrayList(2);
    private final Set<String> mDisabledAutoRefreshAdViewAdUnitIds = new HashSet(2);
    private final Map<String, Integer> mAdViewWidths = new HashMap(2);
    private final Set<String> mDisabledAdaptiveBannerAdUnitIds = new HashSet(2);

    public static class AdViewSize {
        public final int heightDp;
        public final int widthDp;

        public /* synthetic */ AdViewSize(int i, int i2, C09491 c09491) {
            this(i, i2);
        }

        private AdViewSize(int i, int i2) {
            this.widthDp = i;
            this.heightDp = i2;
        }
    }

    static {
        HashMap map = new HashMap();
        ALCompatibleNativeSdkVersions = map;
        map.put(PLUGIN_VERSION, "13.4.0");
        map.put("4.5.1", "13.3.1");
        map.put("4.5.0", "13.3.0");
        map.put("4.4.0", "13.2.0");
        map.put("4.3.1", "13.0.1");
        map.put("4.3.0", "13.0.1");
        map.put("4.2.1", "13.0.1");
        map.put("4.2.0", "13.0.1");
        map.put("4.1.2", "13.0.1");
        map.put("4.1.1", "13.0.1");
        map.put(BuildConfig.LIBRARY_VERSION, "13.0.1");
        map.put("4.0.2", "13.0.0");
        map.put("4.0.1", "13.0.0");
        map.put("4.0.0", "13.0.0");
    }

    private void createAdView(String str, MaxAdFormat maxAdFormat, String str2, boolean z) {
        m58d("Creating " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" and position: \"" + str2 + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat, str2, z);
        if (maxAdViewRetrieveAdView == null) {
            m59e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        maxAdViewRetrieveAdView.setVisibility(8);
        if (maxAdViewRetrieveAdView.getParent() == null) {
            Activity currentActivity = getCurrentActivity();
            RelativeLayout relativeLayout = new RelativeLayout(currentActivity);
            currentActivity.addContentView(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
            relativeLayout.addView(maxAdViewRetrieveAdView);
            this.mAdViewAdFormats.put(str, maxAdFormat);
            positionAdView(str, maxAdFormat);
        }
        maxAdViewRetrieveAdView.loadAd();
        if (this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
        }
        if (this.mAdUnitIdsToShowAfterCreate.contains(str)) {
            showAdView(str, maxAdFormat);
            this.mAdUnitIdsToShowAfterCreate.remove(str);
        }
    }

    private Map<String, Object> createAdWaterfallInfo(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        HashMap map = new HashMap();
        if (maxAdWaterfallInfo == null) {
            return map;
        }
        map.put("name", maxAdWaterfallInfo.getName());
        map.put("testName", maxAdWaterfallInfo.getTestName());
        ArrayList arrayList = new ArrayList();
        Iterator<MaxNetworkResponseInfo> it = maxAdWaterfallInfo.getNetworkResponses().iterator();
        while (it.hasNext()) {
            arrayList.add(createNetworkResponseInfo(it.next()));
        }
        map.put("networkResponses", arrayList);
        map.put("latencyMillis", Long.valueOf(maxAdWaterfallInfo.getLatencyMillis()));
        return map;
    }

    private Map<String, Object> createNetworkResponseInfo(MaxNetworkResponseInfo maxNetworkResponseInfo) {
        HashMap map = new HashMap();
        map.put("adLoadState", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
        MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
        if (mediatedNetwork != null) {
            HashMap map2 = new HashMap(4);
            map2.put("name", mediatedNetwork.getName());
            map2.put("adapterClassName", mediatedNetwork.getAdapterClassName());
            map2.put(C3166gv.f8770b, mediatedNetwork.getAdapterVersion());
            map2.put("sdkVersion", mediatedNetwork.getSdkVersion());
            map.put("mediatedNetwork", map2);
        }
        Bundle credentials = maxNetworkResponseInfo.getCredentials();
        HashMap map3 = new HashMap();
        for (String str : credentials.keySet()) {
            Object obj = credentials.get(str);
            if (obj instanceof String) {
                map3.put(str, (String) obj);
            }
        }
        map.put("credentials", map3);
        MaxError error = maxNetworkResponseInfo.getError();
        if (error != null) {
            map.put(C3912zo.a.f13038g, getAdLoadFailedInfo("", error));
        }
        map.put("latencyMillis", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()));
        return map;
    }

    /* renamed from: d */
    public static void m58d(String str) {
        Log.d(SDK_TAG, "[AppLovinMAX] " + str);
    }

    private void destroyAdView(String str, MaxAdFormat maxAdFormat) {
        m58d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            m59e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        ViewParent parent = maxAdViewRetrieveAdView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(maxAdViewRetrieveAdView);
        }
        maxAdViewRetrieveAdView.setListener(null);
        maxAdViewRetrieveAdView.setRevenueListener(null);
        maxAdViewRetrieveAdView.destroy();
        this.mAdViews.remove(str);
        this.mAdViewAdFormats.remove(str);
        this.mAdViewPositions.remove(str);
    }

    /* renamed from: e */
    public static void m59e(String str) {
        Log.e(SDK_TAG, "[AppLovinMAX] " + str);
    }

    private static AdViewSize getAdViewSize(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return new AdViewSize(728, 90);
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return new AdViewSize(320, 50);
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return new AdViewSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        }
        throw new IllegalArgumentException("Invalid ad format");
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography getAppLovinConsentFlowUserGeography(String str) {
        return "G".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR : USER_GEOGRAPHY_OTHER.equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER : AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    private void getConfiguration(MethodChannel.Result result) {
        result.success(getInitializationMessage());
    }

    private Activity getCurrentActivity() {
        ActivityPluginBinding activityPluginBinding = this.lastActivityPluginBinding;
        if (activityPluginBinding != null) {
            return activityPluginBinding.getActivity();
        }
        return null;
    }

    private Map<String, Object> getInitializationMessage() {
        HashMap map = new HashMap(4);
        AppLovinSdkConfiguration appLovinSdkConfiguration = this.sdkConfiguration;
        if (appLovinSdkConfiguration != null) {
            map.put("countryCode", appLovinSdkConfiguration.getCountryCode());
            map.put("isTestModeEnabled", Boolean.valueOf(this.sdkConfiguration.isTestModeEnabled()));
            map.put("consentFlowUserGeography", getRawAppLovinConsentFlowUserGeography(this.sdkConfiguration.getConsentFlowUserGeography()));
        }
        return map;
    }

    public static AppLovinMAX getInstance() {
        return instance;
    }

    private String getLocalExtraParameterKeyForAmazonResult(Object obj) {
        return "DTBAdResponse".equalsIgnoreCase(obj.getClass().getSimpleName()) ? "amazon_ad_response" : "amazon_ad_error";
    }

    private static String getRawAppLovinConsentFlowUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR == consentFlowUserGeography ? "G" : AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER == consentFlowUserGeography ? USER_GEOGRAPHY_OTHER : USER_GEOGRAPHY_UNKNOWN;
    }

    private void hideAdView(String str, MaxAdFormat maxAdFormat) {
        m58d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        this.mAdUnitIdsToShowAfterCreate.remove(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setVisibility(8);
            maxAdViewRetrieveAdView.stopAutoRefresh();
        } else {
            m59e(maxAdFormat.getLabel() + " does not exist");
        }
    }

    private void initialize(String str, String str2, MethodChannel.Result result) {
        if (this.isPluginInitialized) {
            return;
        }
        this.isPluginInitialized = true;
        m58d("Initializing AppLovin MAX Flutter v" + str + "...");
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalStateException("Unable to initialize AppLovin SDK - no SDK key provided!");
        }
        AppLovinSdkInitializationConfiguration.Builder builder = AppLovinSdkInitializationConfiguration.builder(str2, this.applicationContext);
        builder.setPluginVersion("Flutter-" + str);
        builder.setMediationProvider(AppLovinMediationProvider.MAX);
        builder.setSegmentCollection(this.segmentCollectionBuilder.build());
        List<String> list = this.initializationAdUnitIdsToSet;
        if (list != null) {
            builder.setAdUnitIds(list);
            this.initializationAdUnitIdsToSet = null;
        }
        List<String> list2 = this.testDeviceAdvertisingIdsToSet;
        if (list2 != null) {
            builder.setTestDeviceAdvertisingIds(list2);
            this.testDeviceAdvertisingIdsToSet = null;
        }
        this.sdk.initialize(builder.build(), new OooOO0(5, this, result));
    }

    private boolean isInclusiveVersion(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int versionCode = toVersionCode(str);
        if (TextUtils.isEmpty(str2) || versionCode >= toVersionCode(str2)) {
            return TextUtils.isEmpty(str3) || versionCode <= toVersionCode(str3);
        }
        return false;
    }

    private void isInitialized(MethodChannel.Result result) {
        boolean z = this.isPluginInitialized && this.isSdkInitialized;
        if (result != null) {
            result.success(Boolean.valueOf(z));
        }
    }

    public /* synthetic */ void lambda$initialize$0(MethodChannel.Result result, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        m58d("SDK initialized");
        this.sdkConfiguration = appLovinSdkConfiguration;
        this.isSdkInitialized = true;
        result.success(getInitializationMessage());
    }

    public static /* synthetic */ void lambda$showCmpForExistingUser$1(MethodChannel.Result result, AppLovinCmpError appLovinCmpError) {
        if (appLovinCmpError == null) {
            result.success(null);
            return;
        }
        HashMap map = new HashMap(4);
        map.put("code", Integer.valueOf(appLovinCmpError.getCode().getValue()));
        map.put(Constants.MESSAGE, appLovinCmpError.getMessage());
        map.put("cmpCode", Integer.valueOf(appLovinCmpError.getCmpCode()));
        map.put("cmpMessage", appLovinCmpError.getCmpMessage());
        result.success(map);
    }

    private void loadAdView(String str, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            m59e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        if (this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            maxAdViewRetrieveAdView.loadAd();
            return;
        }
        if (maxAdViewRetrieveAdView.getVisibility() != 0) {
            m59e("Auto-refresh will resume when the " + maxAdFormat.getLabel() + " ad is shown. You should only call LoadBanner() or LoadMRec() if you explicitly pause auto-refresh and want to manually load an ad.");
            return;
        }
        m59e("You must stop auto-refresh if you want to manually load " + maxAdFormat.getLabel() + " ads.");
    }

    private void logInvalidAdFormat(MaxAdFormat maxAdFormat) {
        logStackTrace(new IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void logStackTrace(Exception exc) {
        m59e(Log.getStackTraceString(exc));
    }

    private static void logUninitializedAccessError(String str) {
        logUninitializedAccessError(str, null);
    }

    private void positionAdView(MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, null, true);
    }

    private MaxAppOpenAd retrieveAppOpenAd(String str) {
        MaxAppOpenAd maxAppOpenAd = this.mAppOpenAds.get(str);
        if (maxAppOpenAd != null) {
            return maxAppOpenAd;
        }
        MaxAppOpenAd maxAppOpenAd2 = new MaxAppOpenAd(str, this.sdk);
        maxAppOpenAd2.setListener(this);
        maxAppOpenAd2.setRevenueListener(this);
        this.mAppOpenAds.put(str, maxAppOpenAd2);
        return maxAppOpenAd2;
    }

    private MaxInterstitialAd retrieveInterstitial(String str) {
        MaxInterstitialAd maxInterstitialAd = this.mInterstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(str, this.sdk, getCurrentActivity());
        maxInterstitialAd2.setListener(this);
        maxInterstitialAd2.setRevenueListener(this);
        this.mInterstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private MaxRewardedAd retrieveRewardedAd(String str) {
        MaxRewardedAd maxRewardedAd = this.mRewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        MaxRewardedAd maxRewardedAd2 = MaxRewardedAd.getInstance(str, this.sdk, getCurrentActivity());
        maxRewardedAd2.setListener(this);
        maxRewardedAd2.setRevenueListener(this);
        this.mRewardedAds.put(str, maxRewardedAd2);
        return maxRewardedAd2;
    }

    private void setAdViewBackgroundColor(String str, MaxAdFormat maxAdFormat, String str2) {
        m58d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setBackgroundColor(Color.parseColor(str2));
            return;
        }
        m59e(maxAdFormat.getLabel() + " does not exist");
    }

    private void setAdViewExtraParameters(String str, MaxAdFormat maxAdFormat, String str2, String str3) {
        m58d("Setting " + maxAdFormat.getLabel() + " extra with key: \"" + str2 + "\" value: " + str3);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            m59e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        maxAdViewRetrieveAdView.setExtraParameter(str2, str3);
        if ("force_banner".equalsIgnoreCase(str2) && MaxAdFormat.MREC != maxAdFormat) {
            MaxAdFormat deviceSpecificBannerAdViewAdFormat = Boolean.parseBoolean(str3) ? MaxAdFormat.BANNER : getDeviceSpecificBannerAdViewAdFormat();
            this.mAdViewAdFormats.put(str, deviceSpecificBannerAdViewAdFormat);
            positionAdView(str, deviceSpecificBannerAdViewAdFormat);
        } else if ("adaptive_banner".equalsIgnoreCase(str2)) {
            m59e("Setting adaptive banners via extra parameters is deprecated and will be removed in a future plugin version. Please use the AppLovinMAX.createBanner(String adUnitId, AdViewPosition position, [bool isAdaptive = true]) API to properly configure adaptive banners.");
            if (Boolean.parseBoolean(str3)) {
                this.mDisabledAdaptiveBannerAdUnitIds.remove(str);
            } else {
                this.mDisabledAdaptiveBannerAdUnitIds.add(str);
            }
            positionAdView(str, maxAdFormat);
        }
    }

    private void setAdViewPlacement(String str, MaxAdFormat maxAdFormat, String str2) {
        StringBuilder sbOooOoO0 = OooOo.OooOoO0("Setting placement \"", str2, "\" for ");
        sbOooOoO0.append(maxAdFormat.getLabel());
        sbOooOoO0.append(" with ad unit id \"");
        sbOooOoO0.append(str);
        sbOooOoO0.append("\"");
        m58d(sbOooOoO0.toString());
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setPlacement(str2);
            return;
        }
        m59e(maxAdFormat.getLabel() + " does not exist");
    }

    private void setAdViewWidth(String str, int i, MaxAdFormat maxAdFormat) {
        m58d("Setting width " + i + " for \"" + maxAdFormat + "\" with ad unit identifier \"" + str + "\"");
        int width = maxAdFormat.getSize().getWidth();
        if (i < width) {
            StringBuilder sbOooOo0o = OooOo.OooOo0o("The provided width: ", i, "dp is smaller than the minimum required width: ", width, "dp for ad format: ");
            sbOooOo0o.append(maxAdFormat);
            sbOooOo0o.append(". Please set the width higher than the minimum required.");
            m59e(sbOooOo0o.toString());
        }
        this.mAdViewWidths.put(str, Integer.valueOf(i));
        positionAdView(str, maxAdFormat);
    }

    private void setAmazonResult(Object obj, String str, MaxAdFormat maxAdFormat) {
        if (this.sdk == null) {
            logUninitializedAccessError(OooOo.OooOO0("Failed to set Amazon result - SDK not initialized: ", str));
            return;
        }
        if (obj == null) {
            m59e("Failed to set Amazon result - null value");
            return;
        }
        String localExtraParameterKeyForAmazonResult = getLocalExtraParameterKeyForAmazonResult(obj);
        if (maxAdFormat == MaxAdFormat.INTERSTITIAL) {
            retrieveInterstitial(str).setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
            return;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED) {
            retrieveRewardedAd(str).setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
            return;
        }
        MaxAdView appLovinMAXAdView = AppLovinMAXAdView.getInstance(str);
        if (appLovinMAXAdView == null) {
            appLovinMAXAdView = retrieveAdView(str, maxAdFormat);
        }
        if (appLovinMAXAdView != null) {
            appLovinMAXAdView.setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
            return;
        }
        m59e("Failed to set Amazon result - unable to find " + maxAdFormat);
    }

    private void showAdView(String str, MaxAdFormat maxAdFormat) {
        m58d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setVisibility(0);
            maxAdViewRetrieveAdView.startAutoRefresh();
            if (this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
                return;
            }
            maxAdViewRetrieveAdView.startAutoRefresh();
            return;
        }
        m59e(maxAdFormat.getLabel() + " does not exist for ad unit id " + str);
        this.mAdUnitIdsToShowAfterCreate.add(str);
    }

    private void startAdViewAutoRefresh(String str, MaxAdFormat maxAdFormat) {
        m58d("Starting " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.mDisabledAutoRefreshAdViewAdUnitIds.remove(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.startAutoRefresh();
            return;
        }
        m59e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
    }

    private void stopAdViewAutoRefresh(String str, MaxAdFormat maxAdFormat) {
        m58d("Stopping " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.mDisabledAutoRefreshAdViewAdUnitIds.add(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
            return;
        }
        m59e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
    }

    private static int toVersionCode(String str) {
        int i = 0;
        for (String str2 : str.split("\\.")) {
            if (str2.length() > 2) {
                m60w("Version number components cannot be longer than two digits -> ".concat(str));
                return i;
            }
            i = (i * 100) + Integer.parseInt(str2);
        }
        return i;
    }

    private void updateAdViewPosition(String str, String str2, MaxAdFormat maxAdFormat) {
        m58d("Updating " + maxAdFormat.getLabel() + " position to \"" + str2 + "\" for ad unit id \"" + str + "\"");
        if (retrieveAdView(str, maxAdFormat) == null) {
            m59e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        String str3 = this.mAdViewPositions.get(str);
        if (str2 == null || str2.equals(str3)) {
            return;
        }
        this.mAdViewPositions.put(str, str2);
        positionAdView(str, maxAdFormat);
    }

    /* renamed from: w */
    public static void m60w(String str) {
        Log.w(SDK_TAG, "[AppLovinMAX] " + str);
    }

    public void addSegment(Integer num, List<Integer> list) {
        if (this.isPluginInitialized) {
            m59e("A segment must be added before calling 'AppLovinMAX.initialize(...);'");
        } else {
            this.segmentCollectionBuilder.addSegment(new MaxSegment(num.intValue(), list));
        }
    }

    public void createBanner(String str, String str2, boolean z) {
        createAdView(str, getDeviceSpecificBannerAdViewAdFormat(), str2, z);
    }

    public void createMRec(String str, String str2) {
        createAdView(str, MaxAdFormat.MREC, str2, false);
    }

    public void destroyBanner(String str) {
        destroyAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void destroyMRec(String str) {
        destroyAdView(str, MaxAdFormat.MREC);
    }

    public void fireCallback(String str, MaxAd maxAd, MethodChannel methodChannel) {
        fireCallback(str, getAdInfo(maxAd), methodChannel);
    }

    public Map<String, Object> getAdDisplayFailedInfo(MaxAd maxAd, MaxError maxError) {
        HashMap map = new HashMap(2);
        map.put("ad", getAdInfo(maxAd));
        map.put(C3912zo.a.f13038g, getAdLoadFailedInfo(maxAd.getAdUnitId(), maxError));
        return map;
    }

    public Map<String, Object> getAdInfo(MaxAd maxAd) {
        HashMap map = new HashMap(7);
        map.put("adUnitId", maxAd.getAdUnitId());
        map.put("adFormat", maxAd.getFormat().getLabel());
        map.put("networkName", maxAd.getNetworkName());
        map.put("networkPlacement", maxAd.getNetworkPlacement());
        map.put("creativeId", AppLovinSdkUtils.isValidString(maxAd.getCreativeId()) ? maxAd.getCreativeId() : "");
        map.put("placement", AppLovinSdkUtils.isValidString(maxAd.getPlacement()) ? maxAd.getPlacement() : "");
        map.put("revenue", Double.valueOf(maxAd.getRevenue()));
        map.put("revenuePrecision", maxAd.getRevenuePrecision());
        map.put(C3368d.f9610h, createAdWaterfallInfo(maxAd.getWaterfall()));
        map.put("latencyMillis", Long.valueOf(maxAd.getRequestLatencyMillis()));
        map.put("dspName", AppLovinSdkUtils.isValidString(maxAd.getDspName()) ? maxAd.getDspName() : "");
        map.put("width", Integer.valueOf(maxAd.getSize().getWidth()));
        map.put("height", Integer.valueOf(maxAd.getSize().getHeight()));
        return map;
    }

    public Map<String, Object> getAdLoadFailedInfo(String str, MaxError maxError) {
        HashMap map = new HashMap(4);
        map.put("adUnitId", str);
        if (maxError == null) {
            map.put("code", -1);
            return map;
        }
        map.put("code", Integer.valueOf(maxError.getCode()));
        map.put(Constants.MESSAGE, maxError.getMessage());
        map.put(C3368d.f9610h, createAdWaterfallInfo(maxError.getWaterfall()));
        return map;
    }

    public void getAdaptiveBannerHeightForWidth(double d, MethodChannel.Result result) {
        result.success(Double.valueOf(getDeviceSpecificBannerAdViewAdFormat().getAdaptiveSize((int) d, this.applicationContext).getHeight()));
    }

    public MaxAdFormat getDeviceSpecificBannerAdViewAdFormat() {
        return getDeviceSpecificBannerAdViewAdFormat(this.applicationContext);
    }

    public AppLovinSdk getSdk() {
        return this.sdk;
    }

    public void getSegments(MethodChannel.Result result) {
        if (!this.isSdkInitialized) {
            result.error(TAG, "Segments cannot be retrieved before calling 'AppLovinMAX.initialize(...).'", null);
            return;
        }
        List<MaxSegment> segments = this.sdk.getSegmentCollection().getSegments();
        if (segments.isEmpty()) {
            result.success(null);
            return;
        }
        HashMap map = new HashMap(segments.size());
        for (MaxSegment maxSegment : segments) {
            map.put(Integer.valueOf(maxSegment.getKey()), maxSegment.getValues());
        }
        result.success(map);
    }

    public void hasSupportedCmp(MethodChannel.Result result) {
        if (this.isPluginInitialized) {
            result.success(Boolean.valueOf(this.sdk.getCmpService().hasSupportedCmp()));
        } else {
            logUninitializedAccessError("hasSupportedCmp", result);
        }
    }

    public void hasUserConsent(MethodChannel.Result result) {
        result.success(Boolean.valueOf(AppLovinPrivacySettings.hasUserConsent(this.applicationContext)));
    }

    public void hideBanner(String str) {
        hideAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void hideMRec(String str) {
        hideAdView(str, MaxAdFormat.MREC);
    }

    public void isAppOpenAdReady(String str, MethodChannel.Result result) {
        result.success(Boolean.valueOf(retrieveAppOpenAd(str).isReady()));
    }

    public void isDoNotSell(MethodChannel.Result result) {
        result.success(Boolean.valueOf(AppLovinPrivacySettings.isDoNotSell(this.applicationContext)));
    }

    public void isInterstitialReady(String str, MethodChannel.Result result) {
        result.success(Boolean.valueOf(retrieveInterstitial(str).isReady()));
    }

    public void isRewardedAdReady(String str, MethodChannel.Result result) {
        result.success(Boolean.valueOf(retrieveRewardedAd(str).isReady()));
    }

    public void isTablet(MethodChannel.Result result) {
        result.success(Boolean.valueOf(AppLovinSdkUtils.isTablet(this.applicationContext)));
    }

    public void loadAppOpenAd(String str) {
        retrieveAppOpenAd(str).loadAd();
    }

    public void loadBanner(String str) {
        loadAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void loadInterstitial(String str) {
        retrieveInterstitial(str).loadAd();
    }

    public void loadMRec(String str) {
        loadAdView(str, MaxAdFormat.MREC);
    }

    public void loadRewardedAd(String str) {
        retrieveRewardedAd(str).loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdClickedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdClickedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialClickedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdClickedEvent";
        } else {
            if (MaxAdFormat.APP_OPEN != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnAppOpenAdClickedEvent";
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            fireCallback(MaxAdFormat.MREC == format ? "OnMRecAdCollapsedEvent" : "OnBannerAdCollapsedEvent", getAdInfo(maxAd));
        } else {
            logInvalidAdFormat(format);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            fireCallback(maxAdFormat == format ? "OnInterstitialAdFailedToDisplayEvent" : MaxAdFormat.REWARDED == format ? "OnRewardedAdFailedToDisplayEvent" : "OnAppOpenAdFailedToDisplayEvent", getAdDisplayFailedInfo(maxAd, maxError));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            fireCallback(maxAdFormat == format ? "OnInterstitialDisplayedEvent" : MaxAdFormat.REWARDED == format ? "OnRewardedAdDisplayedEvent" : "OnAppOpenAdDisplayedEvent", getAdInfo(maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            fireCallback(MaxAdFormat.MREC == format ? "OnMrecAdExpandedEvent" : "OnBannerAdExpandedEvent", getAdInfo(maxAd));
        } else {
            logInvalidAdFormat(format);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            fireCallback(maxAdFormat == format ? "OnInterstitialHiddenEvent" : MaxAdFormat.REWARDED == format ? "OnRewardedAdHiddenEvent" : "OnAppOpenAdHiddenEvent", getAdInfo(maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            logStackTrace(new IllegalArgumentException("adUnitId cannot be null"));
            return;
        }
        if (this.mAdViews.containsKey(str)) {
            str2 = MaxAdFormat.MREC == this.mAdViewAdFormats.get(str) ? "OnMRecAdLoadFailedEvent" : "OnBannerAdLoadFailedEvent";
        } else if (this.mInterstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.mRewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else {
            if (!this.mAppOpenAds.containsKey(str)) {
                logStackTrace(new IllegalStateException(OooOo.OooOO0("invalid adUnitId: ", str)));
                return;
            }
            str2 = "OnAppOpenAdLoadFailedEvent";
        }
        fireCallback(str2, getAdLoadFailedInfo(str, maxError));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            str = MaxAdFormat.MREC == format ? "OnMRecAdLoadedEvent" : "OnBannerAdLoadedEvent";
            if (AppLovinSdkUtils.isValidString(this.mAdViewPositions.get(maxAd.getAdUnitId()))) {
                positionAdView(maxAd);
            }
            MaxAdView maxAdViewRetrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (maxAdViewRetrieveAdView != null && maxAdViewRetrieveAdView.getVisibility() != 0) {
                maxAdViewRetrieveAdView.stopAutoRefresh();
            }
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdLoadedEvent";
        } else {
            if (MaxAdFormat.APP_OPEN != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnAppOpenAdLoadedEvent";
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdRevenuePaid";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdRevenuePaid";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialAdRevenuePaid";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdRevenuePaid";
        } else {
            if (MaxAdFormat.APP_OPEN != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnAppOpenAdRevenuePaid";
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        instance = this;
        this.lastActivityPluginBinding = activityPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        String str = ALCompatibleNativeSdkVersions.get(PLUGIN_VERSION);
        String str2 = AppLovinSdk.VERSION;
        if (!isInclusiveVersion(str2, str, null)) {
            throw new RuntimeException(OooOo.OooOO0O("Incompatible native SDK version ", str2, " found for plugin 4.5.2"));
        }
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.applicationContext = applicationContext;
        this.sdk = AppLovinSdk.getInstance(applicationContext);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "applovin_max");
        this.sharedChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("applovin_max/adview", new AppLovinMAXAdViewFactory(flutterPluginBinding.getBinaryMessenger()));
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("applovin_max/nativeadview", new AppLovinMAXNativeAdViewFactory(flutterPluginBinding.getBinaryMessenger()));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.sharedChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        MaxAdFormat deviceSpecificBannerAdViewAdFormat;
        if (MobileAdsBridgeBase.initializeMethodName.equals(methodCall.method)) {
            initialize((String) methodCall.argument("plugin_version"), (String) methodCall.argument(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY), result);
            return;
        }
        if ("isInitialized".equals(methodCall.method)) {
            isInitialized(result);
            return;
        }
        if ("getConfiguration".equals(methodCall.method)) {
            getConfiguration(result);
            return;
        }
        if ("isTablet".equals(methodCall.method)) {
            isTablet(result);
            return;
        }
        if ("showMediationDebugger".equals(methodCall.method)) {
            showMediationDebugger();
            result.success(null);
            return;
        }
        if ("setHasUserConsent".equals(methodCall.method)) {
            setHasUserConsent(((Boolean) methodCall.argument("value")).booleanValue());
            result.success(null);
            return;
        }
        if ("hasUserConsent".equals(methodCall.method)) {
            hasUserConsent(result);
            return;
        }
        if ("setDoNotSell".equals(methodCall.method)) {
            setDoNotSell(((Boolean) methodCall.argument("value")).booleanValue());
            result.success(null);
            return;
        }
        if ("isDoNotSell".equals(methodCall.method)) {
            isDoNotSell(result);
            return;
        }
        if ("setUserId".equals(methodCall.method)) {
            setUserId((String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("setMuted".equals(methodCall.method)) {
            setMuted(((Boolean) methodCall.argument("value")).booleanValue());
            result.success(null);
            return;
        }
        if ("setVerboseLogging".equals(methodCall.method)) {
            setVerboseLogging(((Boolean) methodCall.argument("value")).booleanValue());
            result.success(null);
            return;
        }
        if ("setCreativeDebuggerEnabled".equals(methodCall.method)) {
            setCreativeDebuggerEnabled(((Boolean) methodCall.argument("value")).booleanValue());
            result.success(null);
            return;
        }
        if ("setTestDeviceAdvertisingIds".equals(methodCall.method)) {
            setTestDeviceAdvertisingIds((List) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("setExtraParameter".equals(methodCall.method)) {
            setExtraParameter((String) methodCall.argument("key"), (String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("setInitializationAdUnitIds".equals(methodCall.method)) {
            setInitializationAdUnitIds((List) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("setTermsAndPrivacyPolicyFlowEnabled".equals(methodCall.method)) {
            setTermsAndPrivacyPolicyFlowEnabled(((Boolean) methodCall.argument("value")).booleanValue());
            result.success(null);
            return;
        }
        if ("setPrivacyPolicyUrl".equals(methodCall.method)) {
            setPrivacyPolicyUrl((String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("setTermsOfServiceUrl".equals(methodCall.method)) {
            setTermsOfServiceUrl((String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("setConsentFlowDebugUserGeography".equals(methodCall.method)) {
            setConsentFlowDebugUserGeography((String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("showCmpForExistingUser".equals(methodCall.method)) {
            showCmpForExistingUser(result);
            return;
        }
        if ("hasSupportedCmp".equals(methodCall.method)) {
            hasSupportedCmp(result);
            return;
        }
        if ("createBanner".equals(methodCall.method)) {
            createBanner((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument(C3034d9.h.f8078L), ((Boolean) methodCall.argument("is_adaptive")).booleanValue());
            result.success(null);
            return;
        }
        if ("setBannerBackgroundColor".equals(methodCall.method)) {
            setBannerBackgroundColor((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("hex_color_code"));
            result.success(null);
            return;
        }
        if ("setBannerPlacement".equals(methodCall.method)) {
            setBannerPlacement((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("placement"));
            result.success(null);
            return;
        }
        if ("setBannerWidth".equals(methodCall.method)) {
            setBannerWidth((String) methodCall.argument("ad_unit_id"), ((Integer) methodCall.argument("width")).intValue());
            result.success(null);
            return;
        }
        if ("updateBannerPosition".equals(methodCall.method)) {
            updateBannerPosition((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument(C3034d9.h.f8078L));
            result.success(null);
            return;
        }
        if ("setBannerExtraParameter".equals(methodCall.method)) {
            setBannerExtraParameter((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("key"), (String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("showBanner".equals(methodCall.method)) {
            showBanner((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("hideBanner".equals(methodCall.method)) {
            hideBanner((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("startBannerAutoRefresh".equals(methodCall.method)) {
            startBannerAutoRefresh((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("stopBannerAutoRefresh".equals(methodCall.method)) {
            stopBannerAutoRefresh((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if (C3034d9.g.f8012N.equals(methodCall.method)) {
            loadBanner((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if (C3034d9.g.f8017S.equals(methodCall.method)) {
            destroyBanner((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("getAdaptiveBannerHeightForWidth".equals(methodCall.method)) {
            getAdaptiveBannerHeightForWidth(((Double) methodCall.argument("width")).doubleValue(), result);
            return;
        }
        if ("createMRec".equals(methodCall.method)) {
            createMRec((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument(C3034d9.h.f8078L));
            result.success(null);
            return;
        }
        if ("setMRecPlacement".equals(methodCall.method)) {
            setMRecPlacement((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("placement"));
            result.success(null);
            return;
        }
        if ("updateMRecPosition".equals(methodCall.method)) {
            updateMRecPosition((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument(C3034d9.h.f8078L));
            result.success(null);
            return;
        }
        if ("setMRecExtraParameter".equals(methodCall.method)) {
            setMRecExtraParameter((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("key"), (String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("showMRec".equals(methodCall.method)) {
            showMRec((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("hideMRec".equals(methodCall.method)) {
            hideMRec((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("startMRecAutoRefresh".equals(methodCall.method)) {
            startMRecAutoRefresh((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("stopMRecAutoRefresh".equals(methodCall.method)) {
            stopMRecAutoRefresh((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("loadMRec".equals(methodCall.method)) {
            loadMRec((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("destroyMRec".equals(methodCall.method)) {
            destroyMRec((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if (C3034d9.g.f8003E.equals(methodCall.method)) {
            loadInterstitial((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("isInterstitialReady".equals(methodCall.method)) {
            isInterstitialReady((String) methodCall.argument("ad_unit_id"), result);
            return;
        }
        if (C3034d9.g.f8006H.equals(methodCall.method)) {
            showInterstitial((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("placement"), (String) methodCall.argument("custom_data"));
            result.success(null);
            return;
        }
        if ("setInterstitialExtraParameter".equals(methodCall.method)) {
            setInterstitialExtraParameter((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("key"), (String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("loadRewardedAd".equals(methodCall.method)) {
            loadRewardedAd((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("isRewardedAdReady".equals(methodCall.method)) {
            isRewardedAdReady((String) methodCall.argument("ad_unit_id"), result);
            return;
        }
        if ("showRewardedAd".equals(methodCall.method)) {
            showRewardedAd((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("placement"), (String) methodCall.argument("custom_data"));
            result.success(null);
            return;
        }
        if ("setRewardedAdExtraParameter".equals(methodCall.method)) {
            setRewardedAdExtraParameter((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("key"), (String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if ("loadAppOpenAd".equals(methodCall.method)) {
            loadAppOpenAd((String) methodCall.argument("ad_unit_id"));
            result.success(null);
            return;
        }
        if ("isAppOpenAdReady".equals(methodCall.method)) {
            isAppOpenAdReady((String) methodCall.argument("ad_unit_id"), result);
            return;
        }
        if ("showAppOpenAd".equals(methodCall.method)) {
            showAppOpenAd((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("placement"), (String) methodCall.argument("custom_data"));
            result.success(null);
            return;
        }
        if ("setAppOpenAdExtraParameter".equals(methodCall.method)) {
            setAppOpenAdExtraParameter((String) methodCall.argument("ad_unit_id"), (String) methodCall.argument("key"), (String) methodCall.argument("value"));
            result.success(null);
            return;
        }
        if (!"preloadWidgetAdView".equals(methodCall.method)) {
            if ("destroyWidgetAdView".equals(methodCall.method)) {
                AppLovinMAXAdView.destroyWidgetAdView(((Integer) methodCall.argument("ad_view_id")).intValue(), result);
                return;
            }
            if ("addSegment".equals(methodCall.method)) {
                addSegment((Integer) methodCall.argument("key"), (List) methodCall.argument("values"));
                result.success(null);
                return;
            } else if ("getSegments".equals(methodCall.method)) {
                getSegments(result);
                return;
            } else {
                result.notImplemented();
                return;
            }
        }
        String str = (String) methodCall.argument("ad_unit_id");
        String str2 = (String) methodCall.argument("ad_format");
        boolean zBooleanValue = ((Boolean) methodCall.argument("is_adaptive")).booleanValue();
        String str3 = (String) methodCall.argument("placement");
        String str4 = (String) methodCall.argument("custom_data");
        Map map = (Map) methodCall.argument("extra_parameters");
        Map map2 = (Map) methodCall.argument("local_extra_parameters");
        if (MaxAdFormat.BANNER.getLabel().equalsIgnoreCase(str2)) {
            deviceSpecificBannerAdViewAdFormat = getDeviceSpecificBannerAdViewAdFormat(this.applicationContext);
        } else {
            MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
            if (!maxAdFormat.getLabel().equalsIgnoreCase(str2)) {
                result.error(TAG, "Invalid ad format: " + str2, null);
                return;
            }
            deviceSpecificBannerAdViewAdFormat = maxAdFormat;
        }
        AppLovinMAXAdView.preloadWidgetAdView(str, deviceSpecificBannerAdViewAdFormat, zBooleanValue, str3, str4, map, map2, result, this.applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        instance = this;
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.REWARDED) {
            logInvalidAdFormat(format);
            return;
        }
        String label = maxReward.getLabel();
        int amount = maxReward.getAmount();
        try {
            Map<String, Object> adInfo = getAdInfo(maxAd);
            adInfo.put("rewardLabel", label);
            adInfo.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(amount));
            fireCallback("OnRewardedAdReceivedRewardEvent", adInfo);
        } catch (Throwable unused) {
        }
    }

    public void setAmazonBannerResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.BANNER);
    }

    public void setAmazonInterstitialResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.INTERSTITIAL);
    }

    public void setAmazonMRecResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.MREC);
    }

    public void setAmazonRewardedResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.REWARDED);
    }

    public void setAppOpenAdExtraParameter(String str, String str2, String str3) {
        retrieveAppOpenAd(str).setExtraParameter(str2, str3);
    }

    public void setBannerBackgroundColor(String str, String str2) {
        setAdViewBackgroundColor(str, getDeviceSpecificBannerAdViewAdFormat(), str2);
    }

    public void setBannerExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameters(str, getDeviceSpecificBannerAdViewAdFormat(), str2, str3);
    }

    public void setBannerPlacement(String str, String str2) {
        setAdViewPlacement(str, getDeviceSpecificBannerAdViewAdFormat(), str2);
    }

    public void setBannerWidth(String str, int i) {
        setAdViewWidth(str, i, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void setConsentFlowDebugUserGeography(String str) {
        this.sdk.getSettings().getTermsAndPrivacyPolicyFlowSettings().setDebugUserGeography(getAppLovinConsentFlowUserGeography(str));
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        this.sdk.getSettings().setCreativeDebuggerEnabled(z);
    }

    public void setDoNotSell(boolean z) {
        AppLovinPrivacySettings.setDoNotSell(z, this.applicationContext);
    }

    public void setExtraParameter(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.sdk.getSettings().setExtraParameter(str, str2);
            return;
        }
        m59e("ERROR: Failed to set extra parameter for null or empty key: " + str);
    }

    public void setHasUserConsent(boolean z) {
        AppLovinPrivacySettings.setHasUserConsent(z, this.applicationContext);
    }

    public void setInitializationAdUnitIds(List<String> list) {
        this.initializationAdUnitIdsToSet = new ArrayList(list);
    }

    public void setInterstitialExtraParameter(String str, String str2, String str3) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void setMRecExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameters(str, MaxAdFormat.MREC, str2, str3);
    }

    public void setMRecPlacement(String str, String str2) {
        setAdViewPlacement(str, MaxAdFormat.MREC, str2);
    }

    public void setMuted(boolean z) {
        this.sdk.getSettings().setMuted(z);
    }

    public void setPrivacyPolicyUrl(String str) {
        this.sdk.getSettings().getTermsAndPrivacyPolicyFlowSettings().setPrivacyPolicyUri(Uri.parse(str));
    }

    public void setRewardedAdExtraParameter(String str, String str2, String str3) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    public void setTermsAndPrivacyPolicyFlowEnabled(boolean z) {
        this.sdk.getSettings().getTermsAndPrivacyPolicyFlowSettings().setEnabled(z);
    }

    public void setTermsOfServiceUrl(String str) {
        this.sdk.getSettings().getTermsAndPrivacyPolicyFlowSettings().setTermsOfServiceUri(Uri.parse(str));
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        this.testDeviceAdvertisingIdsToSet = new ArrayList(list);
    }

    public void setUserId(String str) {
        this.sdk.getSettings().setUserIdentifier(str);
    }

    public void setVerboseLogging(boolean z) {
        this.sdk.getSettings().setVerboseLogging(z);
    }

    public void showAppOpenAd(String str, String str2, String str3) {
        retrieveAppOpenAd(str).showAd(str2, str3);
    }

    public void showBanner(String str) {
        showAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void showCmpForExistingUser(MethodChannel.Result result) {
        if (this.isPluginInitialized) {
            this.sdk.getCmpService().showCmpForExistingUser(getCurrentActivity(), new OooO00o(result));
        } else {
            logUninitializedAccessError("showCmpForExistingUser", result);
        }
    }

    public void showInterstitial(String str, String str2, String str3) {
        retrieveInterstitial(str).showAd(str2, str3);
    }

    public void showMRec(String str) {
        showAdView(str, MaxAdFormat.MREC);
    }

    public void showMediationDebugger() {
        if (this.isSdkInitialized) {
            this.sdk.showMediationDebugger();
        } else {
            logUninitializedAccessError("showMediationDebugger");
        }
    }

    public void showRewardedAd(String str, String str2, String str3) {
        retrieveRewardedAd(str).showAd(str2, str3);
    }

    public void startBannerAutoRefresh(String str) {
        startAdViewAutoRefresh(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void startMRecAutoRefresh(String str) {
        startAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void stopBannerAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void stopMRecAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void updateBannerPosition(String str, String str2) {
        updateAdViewPosition(str, str2, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void updateMRecPosition(String str, String str2) {
        updateAdViewPosition(str, str2, MaxAdFormat.MREC);
    }

    public static MaxAdFormat getDeviceSpecificBannerAdViewAdFormat(Context context) {
        return AppLovinSdkUtils.isTablet(context) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    private static void logUninitializedAccessError(String str, MethodChannel.Result result) {
        String strOooOO0O = OooOo.OooOO0O("ERROR: Failed to execute ", str, "() - please ensure the AppLovin MAX Flutter plugin has been initialized by calling 'AppLovinMAX.initialize(...);'!");
        if (result == null) {
            m59e(strOooOO0O);
        } else {
            result.error(TAG, strOooOO0O, null);
        }
    }

    private void positionAdView(String str, MaxAdFormat maxAdFormat) {
        int i;
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            m59e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) maxAdViewRetrieveAdView.getParent();
        if (relativeLayout == null) {
            m59e(maxAdFormat.getLabel() + "'s parent does not exist");
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getCurrentActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        String str2 = this.mAdViewPositions.get(str);
        AdViewSize adViewSize = getAdViewSize(maxAdFormat);
        boolean zContains = this.mDisabledAdaptiveBannerAdUnitIds.contains(str);
        int iIntValue = this.mAdViewWidths.containsKey(str) ? this.mAdViewWidths.get(str).intValue() : (TOP_CENTER.equalsIgnoreCase(str2) || BOTTOM_CENTER.equalsIgnoreCase(str2)) ? AppLovinSdkUtils.pxToDp(getCurrentActivity(), displayMetrics.widthPixels) : adViewSize.widthDp;
        int height = ((maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER) && !zContains) ? maxAdFormat.getAdaptiveSize(iIntValue, getCurrentActivity()).getHeight() : adViewSize.heightDp;
        int iDpToPx = AppLovinSdkUtils.dpToPx(getCurrentActivity(), iIntValue);
        int iDpToPx2 = AppLovinSdkUtils.dpToPx(getCurrentActivity(), height);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxAdViewRetrieveAdView.getLayoutParams();
        layoutParams.height = iDpToPx2;
        maxAdViewRetrieveAdView.setLayoutParams(layoutParams);
        maxAdViewRetrieveAdView.setRotation(0.0f);
        maxAdViewRetrieveAdView.setTranslationX(0.0f);
        int i2 = 0;
        layoutParams.setMargins(0, 0, 0, 0);
        if (CENTERED.equalsIgnoreCase(str2)) {
            i = 17;
        } else {
            if (str2.contains("top")) {
                i2 = 48;
            } else if (str2.contains("bottom")) {
                i2 = 80;
            }
            if (str2.contains("center")) {
                i2 |= 1;
                if (MaxAdFormat.MREC != maxAdFormat) {
                    iDpToPx = -1;
                }
                layoutParams.width = iDpToPx;
            } else {
                layoutParams.width = iDpToPx;
                if (str2.contains("left")) {
                    i = i2 | 3;
                } else if (str2.contains("right")) {
                    i = i2 | 5;
                }
            }
            i = i2;
        }
        relativeLayout.setGravity(i);
    }

    public void fireCallback(String str, Map<String, Object> map) {
        fireCallback(str, map, this.sharedChannel);
    }

    public MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat, String str2, boolean z) {
        MaxAdView maxAdView = this.mAdViews.get(str);
        if (maxAdView != null || str2 == null) {
            return maxAdView;
        }
        MaxAdViewConfiguration.Builder builder = MaxAdViewConfiguration.builder();
        if (maxAdFormat.isBannerOrLeaderAd()) {
            if (z) {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.ANCHORED);
            } else {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.NONE);
                this.mDisabledAdaptiveBannerAdUnitIds.add(str);
            }
        }
        MaxAdView maxAdView2 = new MaxAdView(str, maxAdFormat, builder.build());
        maxAdView2.setListener(this);
        maxAdView2.setRevenueListener(this);
        this.mAdViews.put(str, maxAdView2);
        this.mAdViewPositions.put(str, str2);
        maxAdView2.setExtraParameter("allow_pause_auto_refresh_immediately", C3401a.f9920g);
        return maxAdView2;
    }

    public void fireCallback(String str, Map<String, Object> map, MethodChannel methodChannel) {
        methodChannel.invokeMethod(str, map);
    }
}

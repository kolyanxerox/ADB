package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public abstract class MediationAdapterBase implements MaxAdapter, MaxNativeAdAdapter, MaxInterstitialAdViewAdapter, MaxRewardedAdViewAdapter, MaxAppOpenAdapter {
    private static final String ADAPTIVE_AD_VIEW_TYPE_INLINE = "inline";
    private boolean alwaysRewardUser;
    private final C1240o mLogger;
    private final C1220k mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    /* renamed from: com.applovin.mediation.adapters.MediationAdapterBase$1 */
    public class CallableC13171 implements Callable<Drawable> {
        final /* synthetic */ String val$imageUrl;
        final /* synthetic */ Resources val$resources;

        public CallableC13171(String str, Resources resources) {
            str = str;
            resources = resources;
        }

        @Override // java.util.concurrent.Callable
        public Drawable call() throws Exception {
            InputStream inputStreamOpenStream = new URL(str).openStream();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(inputStreamOpenStream));
            inputStreamOpenStream.close();
            return bitmapDrawable;
        }
    }

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        C1220k c1220kM3943a = appLovinSdk.m3943a();
        this.mSdk = c1220kM3943a;
        this.mLogger = c1220kM3943a.m2847O();
        this.mTag = getClass().getSimpleName();
    }

    public static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    public void checkActivities(Context context, Class<?>... clsArr) {
    }

    public void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<?> cls : clsArr) {
            log("Found: ".concat(cls.getName()));
        }
    }

    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i = BundleUtils.getInt("amount", 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        log("Creating reward: " + i + StringUtils.SPACE + string);
        this.reward = MaxRewardImpl.create(i, string);
    }

    public Future<Drawable> createDrawableFuture(String str, Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            final /* synthetic */ String val$imageUrl;
            final /* synthetic */ Resources val$resources;

            public CallableC13171(String str2, Resources resources2) {
                str = str2;
                resources = resources2;
            }

            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                InputStream inputStreamOpenStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(inputStreamOpenStream));
                inputStreamOpenStream.close();
                return bitmapDrawable;
            }
        });
    }

    /* renamed from: d */
    public void m3905d(String str) {
        if (C1240o.m3200a()) {
            this.mLogger.m3211a(this.mTag, str);
        }
    }

    /* renamed from: e */
    public void m3906e(String str) {
        if (C1240o.m3200a()) {
            this.mLogger.m3214b(this.mTag, str);
        }
    }

    public int getAdaptiveAdViewWidth(MaxAdapterParameters maxAdapterParameters, Context context) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_width");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj != null) {
            m3906e("Expected parameter \"adaptive_banner_width\" to be of type Integer, received: " + obj.getClass());
        }
        return AppLovinSdkUtils.pxToDp(context, AbstractC1141o0.m1931a(context).x);
    }

    public Context getApplicationContext() {
        return C1220k.m2824o();
    }

    public ExecutorService getCachingExecutorService() {
        return this.mSdk.m2918r0().m410c();
    }

    public int getInlineAdaptiveAdViewMaximumHeight(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("inline_adaptive_banner_max_height");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj == null) {
            return -1;
        }
        m3906e("Expected parameter \"inline_adaptive_banner_max_height\" to be of type Integer, received: " + obj.getClass());
        return -1;
    }

    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    public String getVersionString(Class cls, String str) {
        String strM1214b = AbstractC1078k7.m1214b(cls, str);
        if (strM1214b == null) {
            log("Failed to retrieve version string.");
        }
        return strM1214b;
    }

    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    /* renamed from: i */
    public void m3908i(String str) {
        if (C1240o.m3200a()) {
            this.mLogger.m3215d(this.mTag, str);
        }
    }

    public boolean isAdaptiveAdViewFormat(MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters) {
        return (maxAdFormat == MaxAdFormat.MREC && isInlineAdaptiveAdView(maxAdapterParameters)) || maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    public boolean isInlineAdaptiveAdView(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_type");
        if (obj instanceof String) {
            return ADAPTIVE_AD_VIEW_TYPE_INLINE.equalsIgnoreCase((String) obj);
        }
        if (obj == null) {
            return false;
        }
        m3906e("Expected parameter \"adaptive_banner_type\" to be of type String, received: " + obj.getClass());
        return false;
    }

    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        m3905d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        m3905d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void log(String str) {
        if (C1240o.m3200a()) {
            this.mLogger.m3215d(this.mTag, str);
        }
    }

    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldCollectSignalsOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldDestroyOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldInitializeOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        m3905d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        m3905d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        m3905d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void userError(String str) {
        userError(str, null);
    }

    /* renamed from: w */
    public void m3909w(String str) {
        if (C1240o.m3200a()) {
            this.mLogger.m3218k(this.mTag, str);
        }
    }

    /* renamed from: e */
    public void m3907e(String str, Throwable th) {
        if (C1240o.m3200a()) {
            this.mLogger.m3212a(this.mTag, str, th);
        }
    }

    public void log(String str, Throwable th) {
        if (C1240o.m3200a()) {
            this.mLogger.m3212a(this.mTag, str, th);
        }
    }

    public void userError(String str, Throwable th) {
        C1240o.m3204c(this.mTag, str, th);
    }
}

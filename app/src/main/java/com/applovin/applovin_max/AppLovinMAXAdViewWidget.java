package com.applovin.applovin_max;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
class AppLovinMAXAdViewWidget extends FrameLayout implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener {
    private final MaxAdView adView;
    private AppLovinMAXAdView containerView;
    private final boolean shouldPreloadWidget;

    public AppLovinMAXAdViewWidget(String str, MaxAdFormat maxAdFormat, boolean z, Context context) {
        this(str, maxAdFormat, z, false, context);
    }

    public void attachAdView(AppLovinMAXAdView appLovinMAXAdView) {
        this.containerView = appLovinMAXAdView;
    }

    public void destroy() {
        detachAdView();
        this.adView.setListener(null);
        this.adView.setRevenueListener(null);
        this.adView.destroy();
    }

    public void detachAdView() {
        this.containerView = null;
    }

    public String getAdUnitId() {
        return this.adView.getAdUnitId();
    }

    public MaxAdView getAdView() {
        return this.adView;
    }

    public boolean hasContainerView() {
        return this.containerView != null;
    }

    public void loadAd() {
        this.adView.loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        if (this.containerView != null) {
            Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
            adInfo.put("adViewId", Integer.valueOf(hashCode()));
            this.containerView.sendEvent("OnAdViewAdClickedEvent", adInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        if (this.containerView != null) {
            Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
            adInfo.put("adViewId", Integer.valueOf(hashCode()));
            this.containerView.sendEvent("OnAdViewAdCollapsedEvent", adInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        if (this.containerView != null) {
            Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
            adInfo.put("adViewId", Integer.valueOf(hashCode()));
            this.containerView.sendEvent("OnAdViewAdExpandedEvent", adInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        Map<String, Object> adLoadFailedInfo = AppLovinMAX.getInstance().getAdLoadFailedInfo(str, maxError);
        adLoadFailedInfo.put("adViewId", Integer.valueOf(hashCode()));
        if (this.shouldPreloadWidget) {
            AppLovinMAX appLovinMAX = AppLovinMAX.getInstance();
            HashMap map = new HashMap(adLoadFailedInfo.size());
            for (Map.Entry<String, Object> entry : adLoadFailedInfo.entrySet()) {
                String key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                map.put(key, value);
            }
            appLovinMAX.fireCallback("OnWidgetAdViewAdLoadFailedEvent", Collections.unmodifiableMap(map));
        }
        AppLovinMAXAdView appLovinMAXAdView = this.containerView;
        if (appLovinMAXAdView != null) {
            appLovinMAXAdView.sendEvent("OnAdViewAdLoadFailedEvent", adLoadFailedInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
        adInfo.put("adViewId", Integer.valueOf(hashCode()));
        if (this.shouldPreloadWidget) {
            AppLovinMAX appLovinMAX = AppLovinMAX.getInstance();
            HashMap map = new HashMap(adInfo.size());
            for (Map.Entry<String, Object> entry : adInfo.entrySet()) {
                String key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                map.put(key, value);
            }
            appLovinMAX.fireCallback("OnWidgetAdViewAdLoadedEvent", Collections.unmodifiableMap(map));
        }
        AppLovinMAXAdView appLovinMAXAdView = this.containerView;
        if (appLovinMAXAdView != null) {
            appLovinMAXAdView.sendEvent("OnAdViewAdLoadedEvent", adInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        if (this.containerView != null) {
            Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
            adInfo.put("adViewId", Integer.valueOf(hashCode()));
            this.containerView.sendEvent("OnAdViewAdRevenuePaidEvent", adInfo);
        }
    }

    public void setAutoRefreshEnabled(boolean z) {
        if (z) {
            this.adView.startAutoRefresh();
        } else {
            this.adView.stopAutoRefresh();
        }
    }

    public void setCustomData(String str) {
        this.adView.setCustomData(str);
    }

    public void setExtraParameters(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.adView.setExtraParameter(entry.getKey(), (String) entry.getValue());
        }
    }

    public void setLocalExtraParameters(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.adView.setLocalExtraParameter(entry.getKey(), entry.getValue());
        }
    }

    public void setPlacement(String str) {
        this.adView.setPlacement(str);
    }

    public AppLovinMAXAdViewWidget(String str, MaxAdFormat maxAdFormat, boolean z, boolean z2, Context context) {
        super(context);
        this.shouldPreloadWidget = z2;
        MaxAdViewConfiguration.Builder builder = MaxAdViewConfiguration.builder();
        if (maxAdFormat.isBannerOrLeaderAd()) {
            if (z) {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.ANCHORED);
            } else {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.NONE);
            }
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, builder.build());
        this.adView = maxAdView;
        maxAdView.setListener(this);
        maxAdView.setRevenueListener(this);
        maxAdView.setExtraParameter("allow_pause_auto_refresh_immediately", C3401a.f9920g);
        maxAdView.stopAutoRefresh();
        addView(maxAdView);
        maxAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}

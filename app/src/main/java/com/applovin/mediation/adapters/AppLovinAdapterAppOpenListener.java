package com.applovin.mediation.adapters;

import android.os.Bundle;
import com.applovin.impl.InterfaceC1073k2;
import com.applovin.impl.InterfaceC1083l2;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

/* loaded from: classes.dex */
public class AppLovinAdapterAppOpenListener implements InterfaceC1083l2, AppLovinAdClickListener, InterfaceC1073k2 {
    private final MaxAppOpenAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterAppOpenListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxAppOpenAdapterListener;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad clicked");
        this.listener.onAppOpenAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad shown");
        Bundle extraInfo = AppLovinMediationAdapter.getExtraInfo(appLovinAd);
        if (appLovinAd instanceof AbstractC1207b) {
            extraInfo.putBundle("applovin_ad_view_info", ((AbstractC1207b) appLovinAd).m2603h());
        }
        this.listener.onAppOpenAdDisplayed(extraInfo);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad hidden");
        this.listener.onAppOpenAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad loaded");
        this.parentAdapter.loadedAppOpenAd = appLovinAd;
        this.listener.onAppOpenAdLoaded(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.InterfaceC1083l2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        this.parentAdapter.log("App open ad failed to load with error: " + appLovinError);
        this.listener.onAppOpenAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.InterfaceC1073k2
    public void onAdDisplayFailed(String str) {
        this.parentAdapter.log("App open ad failed to display with error: " + str);
        this.listener.onAppOpenAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str), AppLovinMediationAdapter.getExtraInfo(this.parentAdapter.loadedAppOpenAd));
    }
}

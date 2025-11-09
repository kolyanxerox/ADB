package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.o */
/* loaded from: classes2.dex */
public class C3403o extends AbstractC3364a<InterstitialAdListener> implements InterstitialSmashListener {
    public C3403o(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.INTERSTITIAL, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10036a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f9553a.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f9553a.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: b */
    public IronSource.AD_UNIT mo10038b() {
        return IronSource.AD_UNIT.INTERSTITIAL;
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: c */
    public boolean mo10040c(JSONObject jSONObject) {
        return this.f9553a.isInterstitialReady(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: f */
    public void mo10043f(JSONObject jSONObject) {
        this.f9553a.showInterstitial(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((InterstitialAdListener) this.f9554b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((InterstitialAdListener) this.f9554b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m10034a("error = " + ironSourceError));
        if (this.f9554b.get() != null) {
            ((InterstitialAdListener) this.f9554b.get()).onAdLoadFailed(m10404a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((InterstitialAdListener) this.f9554b.get()).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((InterstitialAdListener) this.f9554b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m10034a("error = " + ironSourceError));
        if (this.f9554b.get() != null) {
            ((InterstitialAdListener) this.f9554b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((InterstitialAdListener) this.f9554b.get()).onAdShowSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10037a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f9553a.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: b */
    public void mo10039b(JSONObject jSONObject) {
        this.f9553a.disposeInterstitialAd(jSONObject);
    }

    /* renamed from: a */
    public boolean m10404a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1158;
    }
}

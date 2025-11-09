package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.z */
/* loaded from: classes2.dex */
public class C3416z extends AbstractC3364a<RewardedVideoAdListener> implements RewardedVideoSmashListener {
    public C3416z(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.REWARDED_VIDEO, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10036a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f9553a.loadRewardedVideoForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f9553a.loadRewardedVideo(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: b */
    public IronSource.AD_UNIT mo10038b() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: c */
    public boolean mo10040c(JSONObject jSONObject) {
        return this.f9553a.isRewardedVideoAvailable(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: f */
    public void mo10043f(JSONObject jSONObject) {
        this.f9553a.showRewardedVideo(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdEnded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdOpened();
            ((RewardedVideoAdListener) this.f9554b.get()).onAdShowSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdRewarded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m10034a("error = " + ironSourceError));
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdStarted();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdVisible();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
        IronLog.INTERNAL.verbose(m10034a("available = " + z));
        if (this.f9554b.get() != null) {
            if (z) {
                ((RewardedVideoAdListener) this.f9554b.get()).onAdLoadSuccess();
            } else {
                ((RewardedVideoAdListener) this.f9554b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, "");
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m10034a("error = " + ironSourceError));
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdLoadFailed(m10812b(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : m10811a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((RewardedVideoAdListener) this.f9554b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10037a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f9553a.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: b */
    public void mo10039b(JSONObject jSONObject) {
        this.f9553a.disposeRewardedVideoAd(jSONObject);
    }

    /* renamed from: a */
    private boolean m10811a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1057;
    }

    /* renamed from: b */
    public boolean m10812b(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1058;
    }
}

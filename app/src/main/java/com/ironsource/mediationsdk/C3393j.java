package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.j */
/* loaded from: classes2.dex */
public class C3393j extends AbstractC3364a<BannerAdListener> implements BannerSmashListener {
    public C3393j(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.BANNER, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10035a(JSONObject jSONObject) {
        this.f9553a.destroyBanner(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: b */
    public IronSource.AD_UNIT mo10038b() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: d */
    public void mo10041d(JSONObject jSONObject) {
        this.f9553a.onBannerViewBound(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: e */
    public void mo10042e(JSONObject jSONObject) {
        this.f9553a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((BannerAdListener) this.f9554b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((BannerAdListener) this.f9554b.get()).onAdLeftApplication();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m10034a("error = " + ironSourceError));
        if (this.f9554b.get() != null) {
            ((BannerAdListener) this.f9554b.get()).onAdLoadFailed(m10337a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((BannerAdListener) this.f9554b.get()).onAdLoadSuccess(view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((BannerAdListener) this.f9554b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((BannerAdListener) this.f9554b.get()).onAdScreenPresented();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        if (this.f9554b.get() != null) {
            ((BannerAdListener) this.f9554b.get()).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10036a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        IronSourceBannerLayout ironSourceBannerLayout = (IronSourceBannerLayout) adData.getAdUnitData().get("bannerLayout");
        if (num == null || num.intValue() != 1) {
            this.f9553a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), ironSourceBannerLayout, this);
        } else {
            this.f9553a.loadBanner(jSONObject, jSONObject2, ironSourceBannerLayout, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10037a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f9553a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    /* renamed from: a */
    public boolean m10337a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }
}

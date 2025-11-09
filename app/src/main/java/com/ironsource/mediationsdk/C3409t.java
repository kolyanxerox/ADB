package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.jvm.internal.OooOo;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.t */
/* loaded from: classes2.dex */
public final class C3409t extends AbstractC3364a<NativeAdListener> implements NativeAdSmashListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3409t(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID adUnitObjectId) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.NATIVE_AD, adUnitObjectId);
        OooOo.OooO0o0(adUnitObjectId, "adUnitObjectId");
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10035a(JSONObject config) {
        OooOo.OooO0o0(config, "config");
        this.f9553a.destroyNativeAd(config);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: b */
    public IronSource.AD_UNIT mo10038b() {
        return IronSource.AD_UNIT.NATIVE_AD;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f9554b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m10034a("error = " + ironSourceError));
        int errorCode = ironSourceError != null ? ironSourceError.getErrorCode() : 1000;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        if (this.f9554b.get() != null) {
            AdapterErrorType adapterErrorType = m10686a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            NativeAdListener nativeAdListener = (NativeAdListener) this.f9554b.get();
            if (nativeAdListener != null) {
                nativeAdListener.onAdLoadFailed(adapterErrorType, errorCode, errorMessage);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        OooOo.OooO0o0(adapterNativeAdData, "adapterNativeAdData");
        OooOo.OooO0o0(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f9554b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadSuccess(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose(m10033a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f9554b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10036a(JSONObject config, JSONObject adUnitData, AdData adData) {
        OooOo.OooO0o0(config, "config");
        OooOo.OooO0o0(adUnitData, "adUnitData");
        OooOo.OooO0o0(adData, "adData");
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f9553a.loadNativeAdForBidding(config, adUnitData, adData.getServerData(), this);
        } else {
            this.f9553a.loadNativeAd(config, adUnitData, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3364a
    /* renamed from: a */
    public void mo10037a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        OooOo.OooO0o0(biddingDataCallback, "biddingDataCallback");
        AbstractAdapter abstractAdapter = this.f9553a;
        OooOo.OooO0O0(jSONObject);
        abstractAdapter.collectNativeAdBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    /* renamed from: a */
    private final boolean m10686a(IronSourceError ironSourceError) {
        return ironSourceError != null && ironSourceError.getErrorCode() == 706;
    }
}

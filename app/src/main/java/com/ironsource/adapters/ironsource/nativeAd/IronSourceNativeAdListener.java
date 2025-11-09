package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.C3905zh;
import com.ironsource.InterfaceC2973bi;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class IronSourceNativeAdListener implements InterfaceC2973bi.a {
    private final IronSourceNativeAdViewBinder binder;
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(IronSourceNativeAdViewBinder binder, NativeAdSmashListener smashListener) {
        OooOo.OooO0o0(binder, "binder");
        OooOo.OooO0o0(smashListener, "smashListener");
        this.binder = binder;
        this.smashListener = smashListener;
    }

    @Override // com.ironsource.InterfaceC2973bi.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.InterfaceC2973bi.a
    public void onNativeAdLoadFailed(String reason) {
        OooOo.OooO0o0(reason, "reason");
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - ".concat(reason)));
    }

    @Override // com.ironsource.InterfaceC2973bi.a
    public void onNativeAdLoadSuccess(C3905zh adData) {
        OooOo.OooO0o0(adData, "adData");
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(adData), this.binder);
    }

    @Override // com.ironsource.InterfaceC2973bi.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}

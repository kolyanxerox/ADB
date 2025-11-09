package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

/* renamed from: com.ironsource.bo */
/* loaded from: classes2.dex */
public final class C2979bo extends AbstractC3241j2 {

    /* renamed from: a */
    private final InternalNativeAdListener f7606a;

    public C2979bo(InternalNativeAdListener mNativeAdListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(mNativeAdListener, "mNativeAdListener");
        this.f7606a = mNativeAdListener;
    }

    @Override // com.ironsource.AbstractC3241j2
    /* renamed from: a */
    public void mo7953a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAdViewBinder, "nativeAdViewBinder");
        this.f7606a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC3241j2
    /* renamed from: d */
    public void mo7955d(AdInfo adInfo) {
        this.f7606a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.AbstractC3241j2
    /* renamed from: a */
    public void mo7954a(IronSourceError ironSourceError) {
        this.f7606a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.AbstractC3241j2
    /* renamed from: a */
    public void mo7878a(Placement placement, AdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(placement, "placement");
        this.f7606a.onNativeAdClicked(adInfo);
    }
}

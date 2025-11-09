package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;

/* renamed from: com.ironsource.nj */
/* loaded from: classes2.dex */
public final class C3456nj implements InterfaceC3612s0<InterstitialAd> {

    /* renamed from: a */
    private final InterfaceC3919zv f10544a;

    /* renamed from: b */
    private final InterstitialAdLoaderListener f10545b;

    public C3456nj(InterfaceC3919zv threadManager, InterstitialAdLoaderListener publisherListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(threadManager, "threadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherListener, "publisherListener");
        this.f10544a = threadManager;
        this.f10545b = publisherListener;
    }

    /* renamed from: a */
    public static final void m10993a(IronSourceError error, C3456nj this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.f10545b.onInterstitialAdLoadFailed(error);
    }

    @Override // com.ironsource.InterfaceC3612s0
    public void onAdLoadFailed(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f10544a.mo11396a(new o00000O0(20, error, this));
    }

    @Override // com.ironsource.InterfaceC3612s0
    /* renamed from: a */
    public void mo8458a(InterstitialAd adObject) {
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "adObject");
        this.f10544a.mo11396a(new o00000O0(21, adObject, this));
    }

    /* renamed from: a */
    public static final void m10994a(InterstitialAd adObject, C3456nj this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "$adObject");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f10545b.onInterstitialAdLoaded(adObject);
    }
}

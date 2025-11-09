package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;

/* renamed from: com.ironsource.e7 */
/* loaded from: classes2.dex */
public final class C3067e7 implements InterfaceC3612s0<BannerAdView> {

    /* renamed from: a */
    private final InterfaceC3919zv f8377a;

    /* renamed from: b */
    private final BannerAdLoaderListener f8378b;

    public C3067e7(InterfaceC3919zv threadManager, BannerAdLoaderListener publisherListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(threadManager, "threadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherListener, "publisherListener");
        this.f8377a = threadManager;
        this.f8378b = publisherListener;
    }

    /* renamed from: a */
    public static final void m8456a(IronSourceError error, C3067e7 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.f8378b.onBannerAdLoadFailed(error);
    }

    @Override // com.ironsource.InterfaceC3612s0
    public void onAdLoadFailed(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f8377a.mo11396a(new o00000O0(10, error, this));
    }

    @Override // com.ironsource.InterfaceC3612s0
    /* renamed from: a */
    public void mo8458a(BannerAdView adObject) {
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "adObject");
        this.f8377a.mo11396a(new o00000O0(9, adObject, this));
    }

    /* renamed from: a */
    public static final void m8457a(BannerAdView adObject, C3067e7 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "$adObject");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f8378b.onBannerAdLoaded(adObject);
    }
}

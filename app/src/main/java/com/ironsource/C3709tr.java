package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;

/* renamed from: com.ironsource.tr */
/* loaded from: classes2.dex */
public final class C3709tr implements InterfaceC3612s0<RewardedAd> {

    /* renamed from: a */
    private final InterfaceC3919zv f12100a;

    /* renamed from: b */
    private final RewardedAdLoaderListener f12101b;

    public C3709tr(InterfaceC3919zv threadManager, RewardedAdLoaderListener publisherListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(threadManager, "threadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherListener, "publisherListener");
        this.f12100a = threadManager;
        this.f12101b = publisherListener;
    }

    /* renamed from: a */
    public static final void m12483a(C3709tr this$0, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        this$0.f12101b.onRewardedAdLoadFailed(error);
    }

    @Override // com.ironsource.InterfaceC3612s0
    public void onAdLoadFailed(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f12100a.mo11396a(new o00000O0(29, this, error));
    }

    @Override // com.ironsource.InterfaceC3612s0
    /* renamed from: a */
    public void mo8458a(RewardedAd adObject) {
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "adObject");
        this.f12100a.mo11396a(new o00000O0(28, adObject, this));
    }

    /* renamed from: a */
    public static final void m12484a(RewardedAd adObject, C3709tr this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "$adObject");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f12101b.onRewardedAdLoaded(adObject);
    }
}

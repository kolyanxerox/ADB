package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.Executor;

/* renamed from: com.ironsource.hj */
/* loaded from: classes2.dex */
public final class C3189hj implements InterfaceC2956b1<InterstitialAd> {

    /* renamed from: a */
    private final InterfaceC3475o3 f8870a;

    /* renamed from: b */
    private final Executor f8871b;

    public C3189hj(InterfaceC3475o3 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(callbackExecutor, "callbackExecutor");
        this.f8870a = analytics;
        this.f8871b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC2956b1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd mo7855a(C3907zj adInstance, C3756v4 auctionDataReporter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionDataReporter, "auctionDataReporter");
        return new InterstitialAd(new C3258jj(adInstance, new C2627a1(new C3090ep()), auctionDataReporter, this.f8870a, null, null, null, null, C3224ij.f9030a, 240, null));
    }
}

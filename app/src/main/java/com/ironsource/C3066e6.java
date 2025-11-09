package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;

/* renamed from: com.ironsource.e6 */
/* loaded from: classes2.dex */
public final class C3066e6 implements InterfaceC3031d6 {

    /* renamed from: a */
    private final InterfaceC3475o3 f8375a;

    /* renamed from: b */
    private final Executor f8376b;

    public C3066e6(InterfaceC3475o3 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(callbackExecutor, "callbackExecutor");
        this.f8375a = analytics;
        this.f8376b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC3031d6
    /* renamed from: a */
    public BannerAdView mo8282a(C3907zj adInstance, C3042dh adContainer, C3756v4 auctionDataReporter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(adContainer, "adContainer");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new C3513p6(adInstance, adContainer, auctionDataReporter, this.f8375a, null, null, null, null, 240, null));
    }
}

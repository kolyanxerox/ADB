package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.Executor;

/* renamed from: com.ironsource.mr */
/* loaded from: classes2.dex */
public final class C3429mr implements InterfaceC2956b1<RewardedAd> {

    /* renamed from: a */
    private final InterfaceC3475o3 f10322a;

    /* renamed from: b */
    private final Executor f10323b;

    public C3429mr(InterfaceC3475o3 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(callbackExecutor, "callbackExecutor");
        this.f10322a = analytics;
        this.f10323b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC2956b1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd mo7855a(C3907zj adInstance, C3756v4 auctionDataReporter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionDataReporter, "auctionDataReporter");
        return new RewardedAd(new C3534pr(adInstance, new C2627a1(new C3090ep()), auctionDataReporter, this.f10322a, null, null, null, null, C3464nr.f10577a, 240, null));
    }
}

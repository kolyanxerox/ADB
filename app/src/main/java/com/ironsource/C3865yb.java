package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* renamed from: com.ironsource.yb */
/* loaded from: classes2.dex */
public final class C3865yb implements InterfaceC3048dn {

    /* renamed from: a */
    private final RewardedAdRequest f12741a;

    /* renamed from: b */
    private final C3709tr f12742b;

    /* renamed from: c */
    private final InterfaceC3475o3 f12743c;

    /* renamed from: d */
    private final IronSourceError f12744d;

    public C3865yb(RewardedAdRequest adRequest, C3709tr adLoadTaskListener, InterfaceC3475o3 analytics, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRequest, "adRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f12741a = adRequest;
        this.f12742b = adLoadTaskListener;
        this.f12743c = analytics;
        this.f12744d = error;
    }

    /* renamed from: a */
    public final IronSourceError m13196a() {
        return this.f12744d;
    }

    @Override // com.ironsource.InterfaceC3048dn
    public void start() {
        C3693tb c3693tb = new C3693tb(this.f12743c, this.f12741a.getAdId$mediationsdk_release(), this.f12741a.getProviderName$mediationsdk_release());
        c3693tb.m12419a();
        c3693tb.m12420a(this.f12744d);
        this.f12742b.onAdLoadFailed(this.f12744d);
    }
}

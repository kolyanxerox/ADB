package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* renamed from: com.ironsource.xb */
/* loaded from: classes2.dex */
public final class C3831xb implements InterfaceC3048dn {

    /* renamed from: a */
    private final InterstitialAdRequest f12601a;

    /* renamed from: b */
    private final C3456nj f12602b;

    /* renamed from: c */
    private final InterfaceC3475o3 f12603c;

    /* renamed from: d */
    private final IronSourceError f12604d;

    public C3831xb(InterstitialAdRequest adRequest, C3456nj adLoadTaskListener, InterfaceC3475o3 analytics, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRequest, "adRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f12601a = adRequest;
        this.f12602b = adLoadTaskListener;
        this.f12603c = analytics;
        this.f12604d = error;
    }

    /* renamed from: a */
    public final IronSourceError m13041a() {
        return this.f12604d;
    }

    @Override // com.ironsource.InterfaceC3048dn
    public void start() {
        C3693tb c3693tb = new C3693tb(this.f12603c, this.f12601a.getAdId$mediationsdk_release(), this.f12601a.getProviderName$mediationsdk_release());
        c3693tb.m12419a();
        c3693tb.m12420a(this.f12604d);
        this.f12602b.onAdLoadFailed(this.f12604d);
    }
}

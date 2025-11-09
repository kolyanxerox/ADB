package com.ironsource;

import com.ironsource.AbstractC3246j7;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.tl */
/* loaded from: classes2.dex */
public final class C3703tl implements InterfaceC3841xl {

    /* renamed from: a */
    private final C3458nl f12080a;

    /* renamed from: b */
    private final C3315l6 f12081b;

    public C3703tl(C3458nl strategy, C3315l6 currentAdUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        this.f12080a = strategy;
        this.f12081b = currentAdUnit;
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f12080a.m11010a("Received load failed while paused");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: c */
    public void mo11428c() {
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: d */
    public boolean mo11429d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: e */
    public void mo11430e() {
        this.f12080a.m11003a(this.f12081b, new AbstractC3246j7.a(AbstractC3246j7.b.c.f9080a));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: f */
    public void mo11431f() {
        this.f12080a.m11010a("Loading a loaded ad");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: g */
    public void mo11432g() {
        this.f12081b.m10925a(true);
        C3458nl c3458nl = this.f12080a;
        c3458nl.m11009a((InterfaceC3841xl) new C3563ql(c3458nl));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: i */
    public long mo11433i() {
        return this.f12080a.m11018n();
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        this.f12080a.m11010a("Received load success while paused");
    }
}

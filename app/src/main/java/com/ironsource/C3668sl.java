package com.ironsource;

import com.ironsource.AbstractC3246j7;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.sl */
/* loaded from: classes2.dex */
public final class C3668sl implements InterfaceC3841xl {

    /* renamed from: a */
    private final C3458nl f11924a;

    /* renamed from: b */
    private final C3315l6 f11925b;

    /* renamed from: c */
    private boolean f11926c;

    public C3668sl(C3458nl strategy, C3315l6 currentAdUnit, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        this.f11924a = strategy;
        this.f11925b = currentAdUnit;
        this.f11926c = z;
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f11924a.m11005a(ironSourceError, this.f11925b, (AbstractC3246j7) new AbstractC3246j7.a(AbstractC3246j7.b.a.f9078a), false, this.f11926c, (Long) null);
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: c */
    public void mo11428c() {
        this.f11926c = true;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: d */
    public boolean mo11429d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: e */
    public void mo11430e() {
        this.f11926c = false;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: f */
    public void mo11431f() {
        this.f11924a.m11010a("Loading an ad while loading");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: g */
    public void mo11432g() {
        this.f11925b.m10925a(true);
        C3458nl c3458nl = this.f11924a;
        c3458nl.m11009a((InterfaceC3841xl) new C3563ql(c3458nl));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: i */
    public long mo11433i() {
        return this.f11924a.m11018n();
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        this.f11924a.m11007a(adUnitCallback, this.f11925b, (C3315l6) null, new AbstractC3246j7.a(AbstractC3246j7.b.C4577b.f9079a), this.f11926c, (Long) null);
    }
}

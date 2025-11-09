package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.ql */
/* loaded from: classes2.dex */
public final class C3563ql implements InterfaceC3841xl {

    /* renamed from: a */
    private final C3458nl f10949a;

    public C3563ql(C3458nl strategy) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        this.f10949a = strategy;
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f10949a.m11010a("Received load failed on a destroyed ad");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: c */
    public void mo11428c() {
        this.f10949a.m11010a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: d */
    public boolean mo11429d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: e */
    public void mo11430e() {
        this.f10949a.m11010a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: f */
    public void mo11431f() {
        this.f10949a.m11010a("Loading an ad after ad unit destroyed");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: g */
    public void mo11432g() {
        this.f10949a.m11010a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: i */
    public long mo11433i() {
        return this.f10949a.m11018n();
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        this.f10949a.m11010a("Received load success on a destroyed ad");
    }
}

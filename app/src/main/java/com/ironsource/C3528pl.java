package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.pl */
/* loaded from: classes2.dex */
public final class C3528pl implements InterfaceC3841xl {

    /* renamed from: a */
    private final C3458nl f10839a;

    /* renamed from: b */
    private boolean f10840b;

    public C3528pl(C3458nl strategy, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        this.f10839a = strategy;
        this.f10840b = z;
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f10839a.m11010a("Received load failed before load");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: c */
    public void mo11428c() {
        this.f10840b = true;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: d */
    public boolean mo11429d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: e */
    public void mo11430e() {
        this.f10840b = false;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: f */
    public void mo11431f() {
        C3315l6 c3315l6Mo10951a = this.f10839a.m11016l().mo10951a(true);
        c3315l6Mo10951a.m10923a(this.f10839a.m11013h());
        this.f10839a.m11009a((InterfaceC3841xl) new C3668sl(this.f10839a, c3315l6Mo10951a, this.f10840b));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: g */
    public void mo11432g() {
        C3458nl c3458nl = this.f10839a;
        c3458nl.m11009a((InterfaceC3841xl) new C3563ql(c3458nl));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: i */
    public long mo11433i() {
        return this.f10839a.m11018n();
    }

    public /* synthetic */ C3528pl(C3458nl c3458nl, boolean z, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3458nl, (i & 2) != 0 ? false : z);
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        this.f10839a.m11010a("Received load success before load");
    }
}

package com.ironsource;

import com.ironsource.AbstractC3246j7;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.wl */
/* loaded from: classes2.dex */
public final class C3807wl implements InterfaceC3841xl {

    /* renamed from: a */
    private final C3458nl f12489a;

    /* renamed from: b */
    private final C3315l6 f12490b;

    /* renamed from: c */
    private final C3315l6 f12491c;

    /* renamed from: d */
    private final long f12492d;

    public C3807wl(C3458nl strategy, C3315l6 currentAdUnit, C3315l6 reloadingAdUnit, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(reloadingAdUnit, "reloadingAdUnit");
        this.f12489a = strategy;
        this.f12490b = currentAdUnit;
        this.f12491c = reloadingAdUnit;
        this.f12492d = j;
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f12489a.m11005a(ironSourceError, this.f12490b, (AbstractC3246j7) new AbstractC3246j7.c(this.f12489a.m11022r().mo7851a() - this.f12492d, AbstractC3246j7.d.c.f9085a), true, false, Long.valueOf(this.f12492d));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: c */
    public void mo11428c() {
        C3458nl c3458nl = this.f12489a;
        c3458nl.m11009a((InterfaceC3841xl) new C3703tl(c3458nl, this.f12490b));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: d */
    public boolean mo11429d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: e */
    public void mo11430e() {
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: f */
    public void mo11431f() {
        this.f12489a.m11010a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: g */
    public void mo11432g() {
        this.f12490b.m10925a(true);
        this.f12491c.m10925a(true);
        C3458nl c3458nl = this.f12489a;
        c3458nl.m11009a((InterfaceC3841xl) new C3563ql(c3458nl));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: i */
    public long mo11433i() {
        return this.f12489a.m11018n();
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        this.f12489a.m11007a(adUnitCallback, this.f12491c, this.f12490b, (AbstractC3246j7) new AbstractC3246j7.c(this.f12489a.m11022r().mo7851a() - this.f12492d, AbstractC3246j7.d.C4578d.f9086a), false, Long.valueOf(this.f12492d));
    }
}

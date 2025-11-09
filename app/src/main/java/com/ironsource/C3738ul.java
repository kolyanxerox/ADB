package com.ironsource;

import com.ironsource.AbstractC3197hr;
import com.ironsource.AbstractC3246j7;
import com.ironsource.InterfaceC3918zu;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.ul */
/* loaded from: classes2.dex */
public final class C3738ul implements InterfaceC3841xl {

    /* renamed from: a */
    private final C3458nl f12254a;

    /* renamed from: b */
    private final C3315l6 f12255b;

    /* renamed from: c */
    private final C3315l6 f12256c;

    /* renamed from: d */
    private final long f12257d;

    /* renamed from: e */
    private AbstractC3197hr f12258e;

    /* renamed from: f */
    private InterfaceC3918zu.a f12259f;

    public C3738ul(C3458nl strategy, C3315l6 currentAdUnit, C3315l6 reloadingAdUnit, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(reloadingAdUnit, "reloadingAdUnit");
        this.f12254a = strategy;
        this.f12255b = currentAdUnit;
        this.f12256c = reloadingAdUnit;
        this.f12257d = j;
        m12702h();
    }

    /* renamed from: a */
    private final void m12697a(AbstractC3197hr abstractC3197hr) {
        if (this.f12258e == null) {
            this.f12258e = abstractC3197hr;
            return;
        }
        this.f12254a.m11010a("Received excessive load " + C3773vl.m12788b(abstractC3197hr) + " while reloading");
        if (abstractC3197hr instanceof AbstractC3197hr.b) {
            return;
        }
        boolean z = abstractC3197hr instanceof AbstractC3197hr.a;
    }

    /* renamed from: b */
    private final void m12700b() {
        AbstractC3197hr abstractC3197hr = this.f12258e;
        if (abstractC3197hr == null) {
            C3458nl c3458nl = this.f12254a;
            c3458nl.m11009a((InterfaceC3841xl) new C3807wl(c3458nl, this.f12255b, this.f12256c, this.f12257d));
        } else if (abstractC3197hr instanceof AbstractC3197hr.b) {
            m12698a(((AbstractC3197hr.b) abstractC3197hr).m9233b());
        } else if (abstractC3197hr instanceof AbstractC3197hr.a) {
            m12701b(((AbstractC3197hr.a) abstractC3197hr).m9229b());
        }
    }

    /* renamed from: h */
    private final void m12702h() {
        InterfaceC3918zu interfaceC3918zuM11021q = this.f12254a.m11021q();
        OooO0o oooO0o = new OooO0o(this, 11);
        int i = o00O0oOO.OooOO0O.f31462OooOoO0;
        this.f12259f = interfaceC3918zuM11021q.mo12422a(oooO0o, Oooo0oO.o00000.OooOOO0(this.f12254a.m11018n(), o00O0oOO.OooOOO.f31467OooOoO0));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: c */
    public void mo11428c() {
        InterfaceC3918zu.a aVar = this.f12259f;
        if (aVar != null) {
            aVar.m13427a();
        }
        C3458nl c3458nl = this.f12254a;
        c3458nl.m11009a((InterfaceC3841xl) new C3703tl(c3458nl, this.f12255b));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: d */
    public boolean mo11429d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: e */
    public void mo11430e() {
        C3458nl c3458nl = this.f12254a;
        c3458nl.m11009a((InterfaceC3841xl) new C3738ul(c3458nl, this.f12255b, this.f12256c, c3458nl.m11022r().mo7851a()));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: f */
    public void mo11431f() {
        this.f12254a.m11010a("Loading an ad while reloading");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: g */
    public void mo11432g() {
        InterfaceC3918zu.a aVar = this.f12259f;
        if (aVar != null) {
            aVar.m13427a();
        }
        this.f12255b.m10925a(true);
        this.f12256c.m10925a(true);
        C3458nl c3458nl = this.f12254a;
        c3458nl.m11009a((InterfaceC3841xl) new C3563ql(c3458nl));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: i */
    public long mo11433i() {
        return this.f12254a.m11018n();
    }

    /* renamed from: b */
    private final void m12701b(IronSourceError ironSourceError) {
        this.f12254a.m11005a(ironSourceError, this.f12255b, (AbstractC3246j7) new AbstractC3246j7.c(this.f12254a.m11022r().mo7851a() - this.f12257d, AbstractC3246j7.d.g.f9089a), true, false, Long.valueOf(this.f12257d));
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        m12697a(new AbstractC3197hr.a(ironSourceError));
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        m12697a(new AbstractC3197hr.b(adUnitCallback));
    }

    /* renamed from: a */
    private final void m12698a(C3578r1 c3578r1) {
        this.f12254a.m11007a(c3578r1, this.f12256c, this.f12255b, (AbstractC3246j7) new AbstractC3246j7.c(this.f12254a.m11022r().mo7851a() - this.f12257d, AbstractC3246j7.d.h.f9090a), false, Long.valueOf(this.f12257d));
    }

    /* renamed from: a */
    public static final void m12699a(C3738ul this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m12700b();
    }
}

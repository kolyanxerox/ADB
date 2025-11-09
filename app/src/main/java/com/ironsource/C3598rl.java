package com.ironsource;

import com.ironsource.AbstractC3246j7;
import com.ironsource.InterfaceC3918zu;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.rl */
/* loaded from: classes2.dex */
public final class C3598rl implements InterfaceC3841xl {

    /* renamed from: a */
    private final C3458nl f11195a;

    /* renamed from: b */
    private final C3315l6 f11196b;

    /* renamed from: c */
    private final Long f11197c;

    /* renamed from: d */
    private InterfaceC3918zu.a f11198d;

    /* renamed from: e */
    private final long f11199e;

    public C3598rl(C3458nl strategy, C3315l6 currentAdUnit, Long l) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        this.f11195a = strategy;
        this.f11196b = currentAdUnit;
        this.f11197c = l;
        this.f11199e = strategy.m11022r().mo7851a();
        m11732b();
    }

    /* renamed from: b */
    private final void m11732b() {
        this.f11195a.m11024t();
        InterfaceC3918zu interfaceC3918zuM11021q = this.f11195a.m11021q();
        OooO0o oooO0o = new OooO0o(this, 9);
        int i = o00O0oOO.OooOO0O.f31462OooOoO0;
        this.f11198d = interfaceC3918zuM11021q.mo12422a(oooO0o, Oooo0oO.o00000.OooOOO0(this.f11195a.m11023s(), o00O0oOO.OooOOO.f31464OooOo));
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f11195a.m11010a("Ad unit is already loaded");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: c */
    public void mo11428c() {
        InterfaceC3918zu.a aVar = this.f11198d;
        if (aVar != null) {
            aVar.m13427a();
        }
        C3458nl c3458nl = this.f11195a;
        c3458nl.m11009a((InterfaceC3841xl) new C3703tl(c3458nl, this.f11196b));
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
        this.f11195a.m11010a("Loading a loaded ad");
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: g */
    public void mo11432g() {
        InterfaceC3918zu.a aVar = this.f11198d;
        if (aVar != null) {
            aVar.m13427a();
        }
        this.f11196b.m10925a(true);
        C3458nl c3458nl = this.f11195a;
        c3458nl.m11009a((InterfaceC3841xl) new C3563ql(c3458nl));
    }

    @Override // com.ironsource.InterfaceC3841xl
    /* renamed from: i */
    public long mo11433i() {
        return this.f11195a.m11018n();
    }

    /* renamed from: a */
    public static final void m11731a(C3598rl this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        long jMo7851a = this$0.f11195a.m11022r().mo7851a();
        long j = jMo7851a - this$0.f11199e;
        Long l = this$0.f11197c;
        this$0.f11195a.m11004a(this$0.f11196b, new AbstractC3246j7.c(l != null ? jMo7851a - l.longValue() : 0L, new AbstractC3246j7.d.f(j)), this$0.f11197c);
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        this.f11195a.m11010a("Ad unit is already loaded");
    }
}

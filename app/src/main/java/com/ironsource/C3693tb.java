package com.ironsource;

import com.ironsource.C3277k3;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.tb */
/* loaded from: classes2.dex */
public final class C3693tb {

    /* renamed from: a */
    private final InterfaceC3475o3 f12047a;

    public C3693tb(InterfaceC3475o3 analytics, String adRequestAdId, InterfaceC2947ar adRequestProviderName) {
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(adRequestAdId, "adRequestAdId");
        kotlin.jvm.internal.OooOo.OooO0o0(adRequestProviderName, "adRequestProviderName");
        this.f12047a = analytics;
        analytics.mo8862a(new C3277k3.s(adRequestProviderName.value()), new C3277k3.b(adRequestAdId));
    }

    /* renamed from: a */
    public final void m12419a() {
        InterfaceC3173h3.c.f8808a.m9068a().mo9043a(this.f12047a);
    }

    /* renamed from: a */
    public final void m12420a(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        InterfaceC3173h3.c.f8808a.m9069a(new C3277k3.j(error.getErrorCode()), new C3277k3.k(error.getErrorMessage()), new C3277k3.f(0L)).mo9043a(this.f12047a);
    }
}

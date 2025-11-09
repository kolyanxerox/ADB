package com.ironsource;

import com.ironsource.C3277k3;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.vb */
/* loaded from: classes2.dex */
public final class C3763vb implements InterfaceC3048dn {

    /* renamed from: a */
    private final IronSourceError f12329a;

    /* renamed from: b */
    private final C3067e7 f12330b;

    /* renamed from: c */
    private final InterfaceC3475o3 f12331c;

    public C3763vb(IronSourceError error, C3067e7 adLoadTaskListener, InterfaceC3475o3 analytics) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        kotlin.jvm.internal.OooOo.OooO0o0(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        this.f12329a = error;
        this.f12330b = adLoadTaskListener;
        this.f12331c = analytics;
    }

    /* renamed from: a */
    public final IronSourceError m12768a() {
        return this.f12329a;
    }

    @Override // com.ironsource.InterfaceC3048dn
    public void start() {
        InterfaceC3173h3.c.a aVar = InterfaceC3173h3.c.f8808a;
        aVar.m9068a().mo9043a(this.f12331c);
        aVar.m9069a(new C3277k3.j(this.f12329a.getErrorCode()), new C3277k3.k(this.f12329a.getErrorMessage()), new C3277k3.f(0L)).mo9043a(this.f12331c);
        this.f12330b.onAdLoadFailed(this.f12329a);
    }
}

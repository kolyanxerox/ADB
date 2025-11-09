package com.ironsource;

import com.ironsource.InterfaceC3078ei;

/* renamed from: com.ironsource.os */
/* loaded from: classes2.dex */
public final class C3500os implements InterfaceC3078ei, InterfaceC3078ei.a {

    /* renamed from: a */
    private C3465ns f10711a;

    /* renamed from: b */
    private boolean f10712b;

    @Override // com.ironsource.InterfaceC3078ei
    /* renamed from: a */
    public C3122fm mo8493a() {
        C3465ns c3465ns = this.f10711a;
        if (c3465ns != null) {
            return new C3122fm(c3465ns);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3078ei
    /* renamed from: b */
    public C2975bk mo8494b() {
        C3465ns c3465ns = this.f10711a;
        if (c3465ns != null) {
            return new C2975bk(c3465ns);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3078ei
    /* renamed from: c */
    public boolean mo8495c() {
        return this.f10712b;
    }

    @Override // com.ironsource.InterfaceC3078ei.a
    /* renamed from: d */
    public void mo8497d() {
        this.f10712b = true;
    }

    @Override // com.ironsource.InterfaceC3078ei.a
    /* renamed from: a */
    public void mo8496a(C3465ns sdkConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "sdkConfig");
        this.f10711a = sdkConfig;
    }
}

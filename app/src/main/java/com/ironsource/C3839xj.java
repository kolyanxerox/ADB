package com.ironsource;

/* renamed from: com.ironsource.xj */
/* loaded from: classes2.dex */
public final class C3839xj implements InterfaceC3009cj {

    /* renamed from: a */
    private final C2629a3 f12658a;

    /* renamed from: b */
    private final C3736uj f12659b;

    public C3839xj(C2629a3 adapterConfig, C3736uj adFormatConfigurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormatConfigurations, "adFormatConfigurations");
        this.f12658a = adapterConfig;
        this.f12659b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: a */
    public boolean mo7856a() {
        return !this.f12658a.m4775j();
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: b */
    public String mo7857b() {
        String strM4766a = this.f12658a.m4766a();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM4766a, "adapterConfig.adSourceNameForEvents");
        return strM4766a;
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: c */
    public EnumC3079ej mo7858c() {
        return EnumC3079ej.f8410b.m8502a(this.f12658a.m4769d());
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: d */
    public boolean mo7859d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3681t
    /* renamed from: e */
    public long mo11233e() {
        return this.f12659b.m12688e();
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: f */
    public String mo7860f() {
        String strM4771f = this.f12658a.m4771f();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM4771f, "adapterConfig.providerName");
        return strM4771f;
    }
}

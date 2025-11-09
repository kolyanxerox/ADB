package com.ironsource;

/* renamed from: com.ironsource.or */
/* loaded from: classes2.dex */
public final class C3499or implements InterfaceC3009cj {

    /* renamed from: a */
    private final C2629a3 f10709a;

    /* renamed from: b */
    private final C2983bs f10710b;

    public C3499or(C2629a3 adapterConfig, C2983bs adFormatConfigurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormatConfigurations, "adFormatConfigurations");
        this.f10709a = adapterConfig;
        this.f10710b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: a */
    public boolean mo7856a() {
        return !this.f10709a.m4775j();
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: b */
    public String mo7857b() {
        String strM4766a = this.f10709a.m4766a();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM4766a, "adapterConfig.adSourceNameForEvents");
        return strM4766a;
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: c */
    public EnumC3079ej mo7858c() {
        return EnumC3079ej.f8410b.m8502a(this.f10709a.m4769d());
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: d */
    public boolean mo7859d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3681t
    /* renamed from: e */
    public long mo11233e() {
        return this.f10710b.m7992i();
    }

    @Override // com.ironsource.InterfaceC2958b3
    /* renamed from: f */
    public String mo7860f() {
        String strM4771f = this.f10709a.m4771f();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM4771f, "adapterConfig.providerName");
        return strM4771f;
    }
}

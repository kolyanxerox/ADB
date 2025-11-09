package com.ironsource;

/* renamed from: com.ironsource.fn */
/* loaded from: classes2.dex */
public final class C3123fn implements InterfaceC3624sc<C3083en> {

    /* renamed from: a */
    private final String f8590a;

    /* renamed from: b */
    private final InterfaceC2947ar f8591b;

    /* renamed from: c */
    private final InterfaceC2993c3 f8592c;

    /* renamed from: d */
    private final boolean f8593d;

    public C3123fn(String adm, InterfaceC2947ar providerName, InterfaceC2993c3 adapterConfigs, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(adm, "adm");
        kotlin.jvm.internal.OooOo.OooO0o0(providerName, "providerName");
        kotlin.jvm.internal.OooOo.OooO0o0(adapterConfigs, "adapterConfigs");
        this.f8590a = adm;
        this.f8591b = providerName;
        this.f8592c = adapterConfigs;
        this.f8593d = z;
    }

    @Override // com.ironsource.InterfaceC3624sc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3083en mo8731a() throws Exception {
        InterfaceC3009cj interfaceC3009cjMo8082a = this.f8592c.mo8082a(this.f8591b);
        new C3577r0(this.f8590a, interfaceC3009cjMo8082a, this.f8593d).mo8283a();
        if (interfaceC3009cjMo8082a != null) {
            return new C3083en(interfaceC3009cjMo8082a.mo7858c(), interfaceC3009cjMo8082a.mo7857b(), interfaceC3009cjMo8082a.mo11233e(), interfaceC3009cjMo8082a.mo7856a(), false, 16, null);
        }
        return null;
    }
}

package com.ironsource;

/* renamed from: com.ironsource.ad */
/* loaded from: classes2.dex */
public final class C2639ad implements InterfaceC3737uk {

    /* renamed from: a */
    private final RunnableC3676st f4354a;

    /* renamed from: b */
    private long f4355b;

    public C2639ad(InterfaceC3254jf applicationLifecycleService, RunnableC3676st task) {
        kotlin.jvm.internal.OooOo.OooO0o0(applicationLifecycleService, "applicationLifecycleService");
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        this.f4354a = task;
        applicationLifecycleService.mo9735a(this);
        m4889f();
    }

    /* renamed from: e */
    private final long m4888e() {
        return System.currentTimeMillis() - this.f4355b;
    }

    /* renamed from: f */
    private final void m4889f() {
        this.f4355b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC3737uk
    /* renamed from: a */
    public void mo4890a() {
    }

    @Override // com.ironsource.InterfaceC3737uk
    /* renamed from: b */
    public void mo4891b() {
        this.f4354a.m12311a(Long.valueOf(m4888e()));
        this.f4354a.run();
    }

    @Override // com.ironsource.InterfaceC3737uk
    /* renamed from: c */
    public void mo4892c() {
        m4889f();
    }

    @Override // com.ironsource.InterfaceC3737uk
    /* renamed from: d */
    public void mo4893d() {
    }
}

package com.ironsource;

/* renamed from: com.ironsource.su */
/* loaded from: classes2.dex */
public class C3677su extends AbstractC3505ox {

    /* renamed from: d */
    private final InterfaceC3913zp f11941d;

    /* renamed from: e */
    private final C3272jx f11942e;

    /* renamed from: f */
    private final AbstractC3100f0 f11943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3677su(C3719u2 adTools, InterfaceC3913zp outcomeReporter, C3272jx waterfallInstances, AbstractC3100f0 adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.f11941d = outcomeReporter;
        this.f11942e = waterfallInstances;
        this.f11943f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.AbstractC3505ox
    /* renamed from: a */
    public void mo10980a() {
        AbstractC3887z abstractC3887zM8599a = this.f11943f.m8586c().m8599a();
        if (abstractC3887zM8599a != null) {
            this.f11941d.mo8281a(this.f11942e.m9559b(), abstractC3887zM8599a);
        }
    }

    @Override // com.ironsource.AbstractC3505ox
    /* renamed from: b */
    public void mo10982b(AbstractC3887z instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
    }

    @Override // com.ironsource.AbstractC3505ox
    /* renamed from: c */
    public void mo10983c(AbstractC3887z instanceToShow) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceToShow, "instanceToShow");
        this.f11941d.mo8281a(this.f11942e.m9559b(), instanceToShow);
    }

    @Override // com.ironsource.AbstractC3505ox
    /* renamed from: a */
    public void mo10981a(AbstractC3887z instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        if (!this.f11943f.m8584a(instance) && (!this.f11943f.m8582a() || (instance = this.f11943f.m8586c().m8599a()) == null)) {
            return;
        }
        this.f11941d.mo8281a(this.f11942e.m9559b(), instance);
    }
}

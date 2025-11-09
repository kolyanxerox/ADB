package com.ironsource;

import com.ironsource.AbstractC3212i7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.bw */
/* loaded from: classes2.dex */
public final class C2987bw extends AbstractC3212i7 implements InterfaceC3276k2, InterfaceC3787w1 {

    /* renamed from: d */
    private final C3349m1 f7657d;

    /* renamed from: e */
    private final C3792w6 f7658e;

    /* renamed from: f */
    private final InterfaceC3316l7 f7659f;

    /* renamed from: g */
    private final InterfaceC3443n6 f7660g;

    /* renamed from: h */
    private C3306kw f7661h;

    /* renamed from: i */
    private final C3755v3 f7662i;

    /* renamed from: j */
    private final C2953ax f7663j;

    /* renamed from: k */
    private final C3425mn f7664k;

    /* renamed from: l */
    private a f7665l;

    /* renamed from: m */
    private a f7666m;

    /* renamed from: com.ironsource.bw$a */
    public final class a {

        /* renamed from: a */
        private final C3315l6 f7667a;

        /* renamed from: b */
        public C3578r1 f7668b;

        /* renamed from: c */
        final /* synthetic */ C2987bw f7669c;

        public a(C2987bw c2987bw, InterfaceC3443n6 bannerAdUnitFactory, boolean z) {
            kotlin.jvm.internal.OooOo.OooO0o0(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.f7669c = c2987bw;
            this.f7667a = bannerAdUnitFactory.mo10951a(z);
        }

        /* renamed from: a */
        public final C3578r1 m8051a() {
            C3578r1 c3578r1 = this.f7668b;
            if (c3578r1 != null) {
                return c3578r1;
            }
            kotlin.jvm.internal.OooOo.OooOO0o("adUnitCallback");
            throw null;
        }

        /* renamed from: b */
        public final C3315l6 m8054b() {
            return this.f7667a;
        }

        /* renamed from: c */
        public final InterfaceC3171h1 m8055c() {
            return this.f7667a.m10927d();
        }

        /* renamed from: d */
        public final void m8056d() {
            this.f7667a.m10923a((InterfaceC3276k2) this.f7669c);
        }

        /* renamed from: a */
        public final void m8052a(C3578r1 c3578r1) {
            kotlin.jvm.internal.OooOo.OooO0o0(c3578r1, "<set-?>");
            this.f7668b = c3578r1;
        }

        /* renamed from: a */
        public final void m8053a(boolean z) {
            this.f7667a.m10925a(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2987bw(C3349m1 adTools, C3792w6 bannerContainer, AbstractC3212i7.b config, C3245j6 bannerAdProperties, InterfaceC3316l7 bannerStrategyListener, InterfaceC3443n6 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerStrategyListener, "bannerStrategyListener");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f7657d = adTools;
        this.f7658e = bannerContainer;
        this.f7659f = bannerStrategyListener;
        this.f7660g = bannerAdUnitFactory;
        IronLog.INTERNAL.verbose(C3349m1.m9956a(adTools, "refresh interval: " + m9282i() + ", auto refresh: " + m9281d(), (String) null, 2, (Object) null));
        this.f7662i = new C3755v3(adTools.m9964b());
        this.f7663j = new C2953ax(bannerContainer);
        this.f7664k = new C3425mn(m9281d() ^ true);
        this.f7666m = new a(this, bannerAdUnitFactory, true);
    }

    /* renamed from: a */
    public static final void m8036a(C2987bw this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m8041h();
    }

    /* renamed from: h */
    private final void m8041h() {
        this.f7665l = this.f7666m;
        a aVar = new a(this, this.f7660g, false);
        this.f7666m = aVar;
        aVar.m8056d();
    }

    /* renamed from: j */
    private final void m8042j() {
        this.f7657d.m13090a(new OooOO0(this, 1));
    }

    @Override // com.ironsource.InterfaceC3787w1
    /* renamed from: b */
    public void mo8044b() {
        this.f7659f.mo9750l();
    }

    @Override // com.ironsource.AbstractC3212i7
    /* renamed from: c */
    public void mo8046c() {
        if (m9281d()) {
            this.f7664k.m10868e();
        }
    }

    @Override // com.ironsource.AbstractC3212i7
    /* renamed from: e */
    public void mo8048e() {
        if (m9281d()) {
            this.f7664k.m10869f();
        }
    }

    @Override // com.ironsource.AbstractC3212i7
    /* renamed from: f */
    public void mo8049f() {
        this.f7666m.m8056d();
    }

    @Override // com.ironsource.AbstractC3212i7
    /* renamed from: g */
    public void mo8050g() {
        this.f7662i.m12731e();
        this.f7663j.m7853e();
        C3306kw c3306kw = this.f7661h;
        if (c3306kw != null) {
            c3306kw.m9715c();
        }
        this.f7661h = null;
        a aVar = this.f7665l;
        if (aVar != null) {
            aVar.m8053a(true);
        }
        this.f7665l = null;
        this.f7666m.m8053a(true);
    }

    /* renamed from: a */
    public static final void m8037a(C2987bw this$0, AbstractC3231iq[] triggers) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(triggers, "$triggers");
        this$0.f7661h = new C3306kw(this$0.f7657d, new OooOO0(this$0, 0), this$0.m9282i(), o00O0.OooOOO.OoooOOo(triggers));
    }

    /* renamed from: b */
    public static final void m8040b(C2987bw this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m8042j();
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        m8038a(adUnitCallback);
        m8039a(this.f7663j, this.f7662i, this.f7664k);
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f7659f.mo9748c(ironSourceError);
        m8039a(this.f7662i, this.f7664k);
    }

    @Override // com.ironsource.InterfaceC3787w1
    /* renamed from: b */
    public void mo8045b(IronSourceError ironSourceError) {
        this.f7659f.mo9749d(ironSourceError);
    }

    /* renamed from: a */
    private final void m8038a(C3578r1 c3578r1) {
        this.f7666m.m8052a(c3578r1);
        this.f7666m.m8054b().m9742a(this.f7658e.getViewBinder(), this);
        this.f7659f.mo9747a(this.f7666m.m8051a());
        a aVar = this.f7665l;
        if (aVar != null) {
            aVar.m8053a(false);
        }
        this.f7665l = null;
    }

    /* renamed from: a */
    private final void m8039a(AbstractC3231iq... abstractC3231iqArr) {
        this.f7657d.m13100c(new o00000O0(4, this, abstractC3231iqArr));
    }
}

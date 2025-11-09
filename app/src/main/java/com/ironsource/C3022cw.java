package com.ironsource;

import com.ironsource.AbstractC3212i7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.cw */
/* loaded from: classes2.dex */
public final class C3022cw extends AbstractC3212i7 implements InterfaceC3276k2, InterfaceC3787w1 {

    /* renamed from: d */
    private final C3349m1 f7842d;

    /* renamed from: e */
    private final C3792w6 f7843e;

    /* renamed from: f */
    private final InterfaceC3316l7 f7844f;

    /* renamed from: g */
    private final InterfaceC3443n6 f7845g;

    /* renamed from: h */
    private C3306kw f7846h;

    /* renamed from: i */
    private final C3755v3 f7847i;

    /* renamed from: j */
    private final C2953ax f7848j;

    /* renamed from: k */
    private final C3425mn f7849k;

    /* renamed from: l */
    private a f7850l;

    /* renamed from: m */
    private a f7851m;

    /* renamed from: n */
    private boolean f7852n;

    /* renamed from: o */
    private boolean f7853o;

    /* renamed from: p */
    private C3578r1 f7854p;

    /* renamed from: q */
    private IronSourceError f7855q;

    /* renamed from: com.ironsource.cw$a */
    public final class a {

        /* renamed from: a */
        private final C3315l6 f7856a;

        /* renamed from: b */
        public C3578r1 f7857b;

        /* renamed from: c */
        private boolean f7858c;

        /* renamed from: d */
        final /* synthetic */ C3022cw f7859d;

        public a(C3022cw c3022cw, InterfaceC3443n6 bannerAdUnitFactory, boolean z) {
            kotlin.jvm.internal.OooOo.OooO0o0(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.f7859d = c3022cw;
            this.f7856a = bannerAdUnitFactory.mo10951a(z);
            this.f7858c = true;
        }

        /* renamed from: a */
        public final C3578r1 m8238a() {
            C3578r1 c3578r1 = this.f7857b;
            if (c3578r1 != null) {
                return c3578r1;
            }
            kotlin.jvm.internal.OooOo.OooOO0o("adUnitCallback");
            throw null;
        }

        /* renamed from: b */
        public final C3315l6 m8241b() {
            return this.f7856a;
        }

        /* renamed from: c */
        public final boolean m8243c() {
            return this.f7858c;
        }

        /* renamed from: d */
        public final boolean m8244d() {
            return this.f7856a.m10927d().mo9031a();
        }

        /* renamed from: e */
        public final void m8245e() {
            this.f7856a.m10923a((InterfaceC3276k2) this.f7859d);
        }

        /* renamed from: a */
        public final void m8239a(C3578r1 c3578r1) {
            kotlin.jvm.internal.OooOo.OooO0o0(c3578r1, "<set-?>");
            this.f7857b = c3578r1;
        }

        /* renamed from: b */
        public final void m8242b(boolean z) {
            this.f7858c = z;
        }

        /* renamed from: a */
        public final void m8240a(boolean z) {
            this.f7856a.m10925a(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3022cw(C3349m1 adTools, C3792w6 bannerContainer, AbstractC3212i7.b config, C3245j6 bannerAdProperties, InterfaceC3316l7 bannerStrategyListener, InterfaceC3443n6 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerStrategyListener, "bannerStrategyListener");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f7842d = adTools;
        this.f7843e = bannerContainer;
        this.f7844f = bannerStrategyListener;
        this.f7845g = bannerAdUnitFactory;
        IronLog.INTERNAL.verbose(C3349m1.m9956a(adTools, "refresh interval: " + m9282i() + ", auto refresh: " + m9281d(), (String) null, 2, (Object) null));
        this.f7847i = new C3755v3(adTools.m9964b());
        this.f7848j = new C2953ax(bannerContainer);
        this.f7849k = new C3425mn(m9281d() ^ true);
        this.f7851m = new a(this, bannerAdUnitFactory, true);
        this.f7853o = true;
    }

    /* renamed from: a */
    public static final void m8230a(C3022cw this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f7852n = true;
        if (this$0.f7851m.m8244d()) {
            this$0.m8237l();
        } else {
            if (this$0.f7851m.m8243c()) {
                return;
            }
            this$0.m8236k();
            this$0.m8234h();
            this$0.m8232a(this$0.f7847i, this$0.f7849k);
        }
    }

    /* renamed from: h */
    private final void m8234h() {
        if (m9281d()) {
            a aVar = new a(this, this.f7845g, false);
            this.f7851m = aVar;
            aVar.m8245e();
        }
    }

    /* renamed from: j */
    private final void m8235j() {
        this.f7842d.m13090a(new OooOOO(this, 1));
    }

    /* renamed from: k */
    private final void m8236k() {
        this.f7844f.mo9748c(this.f7855q);
        this.f7854p = null;
        this.f7855q = null;
    }

    /* renamed from: l */
    private final void m8237l() {
        this.f7853o = false;
        this.f7851m.m8241b().m9742a(this.f7843e.getViewBinder(), this);
        this.f7844f.mo9747a(this.f7851m.m8238a());
        a aVar = this.f7850l;
        if (aVar != null) {
            aVar.m8240a(false);
        }
        this.f7850l = this.f7851m;
        m8234h();
        m8232a(this.f7848j, this.f7847i, this.f7849k);
    }

    @Override // com.ironsource.InterfaceC3787w1
    /* renamed from: b */
    public void mo8044b() {
        this.f7844f.mo9750l();
    }

    @Override // com.ironsource.AbstractC3212i7
    /* renamed from: c */
    public void mo8046c() {
        if (m9281d()) {
            this.f7849k.m10868e();
        }
    }

    @Override // com.ironsource.AbstractC3212i7
    /* renamed from: e */
    public void mo8048e() {
        if (m9281d()) {
            this.f7849k.m10869f();
        }
    }

    @Override // com.ironsource.AbstractC3212i7
    /* renamed from: f */
    public void mo8049f() {
        this.f7851m.m8245e();
    }

    @Override // com.ironsource.AbstractC3212i7
    /* renamed from: g */
    public void mo8050g() {
        this.f7847i.m12731e();
        this.f7848j.m7853e();
        C3306kw c3306kw = this.f7846h;
        if (c3306kw != null) {
            c3306kw.m9715c();
        }
        this.f7846h = null;
        a aVar = this.f7850l;
        if (aVar != null) {
            aVar.m8240a(true);
        }
        this.f7851m.m8240a(true);
    }

    /* renamed from: a */
    public static final void m8231a(C3022cw this$0, AbstractC3231iq[] triggers) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(triggers, "$triggers");
        C3306kw c3306kw = this$0.f7846h;
        if (c3306kw != null) {
            c3306kw.m9715c();
        }
        this$0.f7846h = new C3306kw(this$0.f7842d, new OooOOO(this$0, 0), this$0.m9282i(), o00O0.OooOOO.OoooOOo(triggers));
    }

    /* renamed from: b */
    public static final void m8233b(C3022cw this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m8235j();
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        this.f7851m.m8239a(adUnitCallback);
        this.f7851m.m8242b(false);
        if (this.f7852n || this.f7853o) {
            m8237l();
        }
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f7851m.m8242b(false);
        this.f7855q = ironSourceError;
        if (this.f7853o) {
            m8236k();
            m8232a(this.f7847i, this.f7849k);
        } else if (this.f7852n) {
            m8236k();
            m8234h();
            m8232a(this.f7847i, this.f7849k);
        }
    }

    @Override // com.ironsource.InterfaceC3787w1
    /* renamed from: b */
    public void mo8045b(IronSourceError ironSourceError) {
        this.f7844f.mo9749d(ironSourceError);
    }

    /* renamed from: a */
    private final void m8232a(AbstractC3231iq... abstractC3231iqArr) {
        this.f7852n = false;
        this.f7842d.m13100c(new o00000O0(8, this, abstractC3231iqArr));
    }
}

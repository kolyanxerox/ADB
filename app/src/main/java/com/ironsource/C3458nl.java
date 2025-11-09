package com.ironsource;

import android.graphics.Rect;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.nl */
/* loaded from: classes2.dex */
public final class C3458nl implements InterfaceC3295kl {

    /* renamed from: a */
    private final C3349m1 f10548a;

    /* renamed from: b */
    private final C3792w6 f10549b;

    /* renamed from: c */
    private final long f10550c;

    /* renamed from: d */
    private final long f10551d;

    /* renamed from: e */
    private final C3245j6 f10552e;

    /* renamed from: f */
    private InterfaceC3334ll f10553f;

    /* renamed from: g */
    private final InterfaceC3443n6 f10554g;

    /* renamed from: h */
    private final InterfaceC3918zu f10555h;

    /* renamed from: i */
    private final InterfaceC2952aw f10556i;

    /* renamed from: j */
    private InterfaceC3276k2 f10557j;

    /* renamed from: k */
    private InterfaceC3787w1 f10558k;

    /* renamed from: l */
    private InterfaceC3478o6 f10559l;

    /* renamed from: m */
    private InterfaceC3841xl f10560m;

    /* renamed from: com.ironsource.nl$a */
    public static final class a implements InterfaceC3478o6 {
        public a() {
        }

        /* renamed from: a */
        public void m11025a() {
            C3458nl.this.m11020p().m9820a();
        }

        /* renamed from: b */
        public void m11026b() {
            C3458nl.this.m11020p().m9825c();
        }

        /* renamed from: c */
        public void m11027c() {
            C3458nl.this.m11020p().m9826d();
        }

        @Override // com.ironsource.InterfaceC3207i2
        /* renamed from: h */
        public void mo7754h() {
            C3458nl.this.m11020p().m9827e();
        }

        @Override // com.ironsource.InterfaceC3478o6
        /* renamed from: j */
        public /* bridge */ /* synthetic */ oo00o.OooOo mo11028j() {
            m11025a();
            return oo00o.OooOo.f33195OooO00o;
        }

        @Override // com.ironsource.InterfaceC3478o6
        /* renamed from: k */
        public /* bridge */ /* synthetic */ oo00o.OooOo mo11029k() {
            m11027c();
            return oo00o.OooOo.f33195OooO00o;
        }

        @Override // com.ironsource.InterfaceC3478o6
        /* renamed from: m */
        public /* bridge */ /* synthetic */ oo00o.OooOo mo11030m() {
            m11026b();
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    /* renamed from: com.ironsource.nl$b */
    public static final class b implements InterfaceC3276k2 {
        public b() {
        }

        @Override // com.ironsource.InterfaceC3276k2
        /* renamed from: a */
        public void mo8043a(IronSourceError ironSourceError) {
            C3458nl.this.m11019o().mo8043a(ironSourceError);
        }

        @Override // com.ironsource.InterfaceC3276k2
        /* renamed from: c */
        public void mo8047c(C3578r1 adUnitCallback) {
            kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
            C3458nl.this.m11019o().mo8047c(adUnitCallback);
        }
    }

    /* renamed from: com.ironsource.nl$c */
    public static final class c implements InterfaceC3787w1 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC3787w1
        /* renamed from: b */
        public void mo8044b() {
            C3458nl.this.m11020p().m9826d();
        }

        @Override // com.ironsource.InterfaceC3787w1
        /* renamed from: b */
        public void mo8045b(IronSourceError ironSourceError) {
            C3458nl.this.m11020p().m9824b(ironSourceError);
        }
    }

    public C3458nl(C3349m1 adTools, C3792w6 bannerContainer, long j, long j2, C3245j6 bannerAdProperties, InterfaceC3334ll strategyListener, InterfaceC3443n6 bannerAdUnitFactory, InterfaceC3918zu taskScheduler, InterfaceC2952aw timeProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(strategyListener, "strategyListener");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdUnitFactory, "bannerAdUnitFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.OooOo.OooO0o0(timeProvider, "timeProvider");
        this.f10548a = adTools;
        this.f10549b = bannerContainer;
        this.f10550c = j;
        this.f10551d = j2;
        this.f10552e = bannerAdProperties;
        this.f10553f = strategyListener;
        this.f10554g = bannerAdUnitFactory;
        this.f10555h = taskScheduler;
        this.f10556i = timeProvider;
        this.f10557j = new b();
        this.f10558k = new c();
        this.f10559l = new a();
        this.f10560m = new C3528pl(this, false, 2, null);
    }

    /* renamed from: a */
    public final C3349m1 m11001a() {
        return this.f10548a;
    }

    /* renamed from: b */
    public final InterfaceC3478o6 m11011b() {
        return this.f10559l;
    }

    @Override // com.ironsource.InterfaceC3295kl
    /* renamed from: c */
    public void mo9678c() {
        this.f10560m.mo11428c();
    }

    @Override // com.ironsource.InterfaceC3295kl
    /* renamed from: d */
    public boolean mo9679d() {
        return this.f10560m.mo11429d();
    }

    @Override // com.ironsource.InterfaceC3295kl
    /* renamed from: e */
    public void mo9680e() {
        this.f10560m.mo11430e();
    }

    @Override // com.ironsource.InterfaceC3295kl
    /* renamed from: f */
    public void mo9681f() {
        this.f10560m.mo11431f();
    }

    @Override // com.ironsource.InterfaceC3295kl
    /* renamed from: g */
    public void mo9682g() {
        this.f10560m.mo11432g();
    }

    /* renamed from: h */
    public final InterfaceC3276k2 m11013h() {
        return this.f10557j;
    }

    @Override // com.ironsource.InterfaceC3295kl
    /* renamed from: i */
    public long mo9683i() {
        return this.f10560m.mo11433i();
    }

    /* renamed from: j */
    public final InterfaceC3787w1 m11014j() {
        return this.f10558k;
    }

    /* renamed from: k */
    public final C3245j6 m11015k() {
        return this.f10552e;
    }

    /* renamed from: l */
    public final InterfaceC3443n6 m11016l() {
        return this.f10554g;
    }

    /* renamed from: m */
    public final C3792w6 m11017m() {
        return this.f10549b;
    }

    /* renamed from: n */
    public final long m11018n() {
        return this.f10550c;
    }

    /* renamed from: o */
    public final InterfaceC3841xl m11019o() {
        return this.f10560m;
    }

    /* renamed from: p */
    public final InterfaceC3334ll m11020p() {
        return this.f10553f;
    }

    /* renamed from: q */
    public final InterfaceC3918zu m11021q() {
        return this.f10555h;
    }

    /* renamed from: r */
    public final InterfaceC2952aw m11022r() {
        return this.f10556i;
    }

    /* renamed from: s */
    public final long m11023s() {
        return this.f10551d;
    }

    /* renamed from: t */
    public final void m11024t() {
        this.f10548a.m9970e().m7911h().m9919h("Banner view is not visible");
    }

    public /* synthetic */ C3458nl(C3349m1 c3349m1, C3792w6 c3792w6, long j, long j2, C3245j6 c3245j6, InterfaceC3334ll interfaceC3334ll, InterfaceC3443n6 interfaceC3443n6, InterfaceC3918zu interfaceC3918zu, InterfaceC2952aw interfaceC2952aw, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3349m1, c3792w6, j, j2, c3245j6, interfaceC3334ll, interfaceC3443n6, (i & 128) != 0 ? new C3696te(C3731ue.m12670a(c3349m1.m13083a())) : interfaceC3918zu, (i & 256) != 0 ? new C3850xu() : interfaceC2952aw);
    }

    /* renamed from: a */
    private final void m11000a(AbstractC3246j7 abstractC3246j7) {
        this.f10548a.m9970e().m7911h().m9899a(abstractC3246j7.m9447c(), abstractC3246j7.m9446b(), abstractC3246j7.mo9445a());
    }

    /* renamed from: b */
    public final void m11012b(InterfaceC3334ll interfaceC3334ll) {
        kotlin.jvm.internal.OooOo.OooO0o0(interfaceC3334ll, "<set-?>");
        this.f10553f = interfaceC3334ll;
    }

    /* renamed from: a */
    public final void m11002a(InterfaceC3276k2 interfaceC3276k2) {
        kotlin.jvm.internal.OooOo.OooO0o0(interfaceC3276k2, "<set-?>");
        this.f10557j = interfaceC3276k2;
    }

    /* renamed from: a */
    public final void m11003a(C3315l6 currentAdUnit, AbstractC3246j7 reloadReason) {
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(reloadReason, "reloadReason");
        C3315l6 c3315l6Mo10951a = this.f10554g.mo10951a(false);
        C3738ul c3738ul = new C3738ul(this, currentAdUnit, c3315l6Mo10951a, this.f10556i.mo7851a());
        m11000a(reloadReason);
        this.f10560m = c3738ul;
        c3315l6Mo10951a.m10923a(this.f10557j);
    }

    /* renamed from: a */
    public final void m11004a(C3315l6 currentAdUnit, AbstractC3246j7 reloadReason, Long l) {
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(reloadReason, "reloadReason");
        if (C3058dx.m8423a(this.f10549b, new Rect())) {
            m11003a(currentAdUnit, reloadReason);
        } else {
            this.f10560m = new C3598rl(this, currentAdUnit, l);
        }
    }

    @Override // com.ironsource.InterfaceC3295kl
    /* renamed from: a */
    public void mo9677a(InterfaceC3334ll listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f10553f = listener;
    }

    /* renamed from: a */
    public final void m11005a(IronSourceError ironSourceError, C3315l6 currentAdUnit, AbstractC3246j7 reloadReason, boolean z, boolean z2, Long l) {
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(reloadReason, "reloadReason");
        this.f10553f.m9821a(ironSourceError);
        if (z2) {
            this.f10560m = new C3703tl(this, currentAdUnit);
        } else if (z) {
            m11004a(currentAdUnit, reloadReason, l);
        } else {
            m11003a(currentAdUnit, reloadReason);
        }
    }

    /* renamed from: a */
    public final void m11006a(InterfaceC3478o6 interfaceC3478o6) {
        kotlin.jvm.internal.OooOo.OooO0o0(interfaceC3478o6, "<set-?>");
        this.f10559l = interfaceC3478o6;
    }

    /* renamed from: a */
    public final void m11007a(C3578r1 adUnitCallback, C3315l6 currentAdUnit, C3315l6 c3315l6, AbstractC3246j7 reloadReason, boolean z, Long l) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(reloadReason, "reloadReason");
        currentAdUnit.m9742a(this.f10549b.getViewBinder(), this.f10558k);
        this.f10553f.m9822a(adUnitCallback);
        if (c3315l6 != null) {
            c3315l6.m10925a(false);
        }
        if (z) {
            this.f10560m = new C3703tl(this, currentAdUnit);
        } else {
            m11004a(currentAdUnit, reloadReason, l);
        }
    }

    /* renamed from: a */
    public final void m11008a(InterfaceC3787w1 interfaceC3787w1) {
        kotlin.jvm.internal.OooOo.OooO0o0(interfaceC3787w1, "<set-?>");
        this.f10558k = interfaceC3787w1;
    }

    /* renamed from: a */
    public final void m11009a(InterfaceC3841xl interfaceC3841xl) {
        kotlin.jvm.internal.OooOo.OooO0o0(interfaceC3841xl, "<set-?>");
        this.f10560m = interfaceC3841xl;
    }

    /* renamed from: a */
    public final void m11010a(String message) {
        kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
        this.f10548a.m9970e().m7911h().m9917f("Banner Reload Strategy - ".concat(message));
    }
}

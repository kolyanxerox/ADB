package com.ironsource;

import android.os.Bundle;
import com.ironsource.C3277k3;
import com.ironsource.InterfaceC3057dw;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ironsource.lj */
/* loaded from: classes2.dex */
public final class C3332lj implements InterfaceC3048dn, InterfaceC3003cd {

    /* renamed from: a */
    private final InterstitialAdRequest f9390a;

    /* renamed from: b */
    private final C3083en f9391b;

    /* renamed from: c */
    private final InterfaceC3612s0<InterstitialAd> f9392c;

    /* renamed from: d */
    private final InterfaceC3314l5 f9393d;

    /* renamed from: e */
    private final InterfaceC3844xo f9394e;

    /* renamed from: f */
    private final InterfaceC3475o3 f9395f;

    /* renamed from: g */
    private final InterfaceC2956b1<InterstitialAd> f9396g;

    /* renamed from: h */
    private final InterfaceC3057dw.c f9397h;

    /* renamed from: i */
    private final Executor f9398i;

    /* renamed from: j */
    private C3216ib f9399j;

    /* renamed from: k */
    private InterfaceC3057dw f9400k;

    /* renamed from: l */
    private C3756v4 f9401l;

    /* renamed from: m */
    private boolean f9402m;

    /* renamed from: com.ironsource.lj$a */
    public static final class a implements InterfaceC3057dw.a {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3057dw.a
        /* renamed from: a */
        public void mo8100a() {
            C3332lj.this.m9817a(C3797wb.f12445a.m12885s());
        }
    }

    public C3332lj(InterstitialAdRequest adRequest, C3083en loadTaskConfig, InterfaceC3612s0<InterstitialAd> adLoadTaskListener, InterfaceC3314l5 auctionResponseFetcher, InterfaceC3844xo networkLoadApi, InterfaceC3475o3 analytics, InterfaceC2956b1<InterstitialAd> adObjectFactory, InterfaceC3057dw.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRequest, "adRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.OooOo.OooO0o0(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(adObjectFactory, "adObjectFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(timerFactory, "timerFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(taskFinishedExecutor, "taskFinishedExecutor");
        this.f9390a = adRequest;
        this.f9391b = loadTaskConfig;
        this.f9392c = adLoadTaskListener;
        this.f9393d = auctionResponseFetcher;
        this.f9394e = networkLoadApi;
        this.f9395f = analytics;
        this.f9396g = adObjectFactory;
        this.f9397h = timerFactory;
        this.f9398i = taskFinishedExecutor;
    }

    /* renamed from: a */
    private final void m9814a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapM11711a = C3589rc.f11184a.m11711a(bundle);
        for (String str : mapM11711a.keySet()) {
            String strValueOf = String.valueOf(mapM11711a.get(str));
            InterfaceC3173h3.c.f8808a.m9070a(new C3277k3.l(str + C3037dc.f8244T + strValueOf)).mo9043a(this.f9395f);
        }
    }

    @Override // com.ironsource.InterfaceC3048dn
    public void start() {
        this.f9399j = new C3216ib();
        this.f9395f.mo8862a(new C3277k3.s(this.f9391b.m8521f()), new C3277k3.n(this.f9391b.m8522g().m8500b()), new C3277k3.b(this.f9390a.getAdId$mediationsdk_release()));
        InterfaceC3173h3.c.f8808a.m9068a().mo9043a(this.f9395f);
        m9814a(this.f9390a.getExtraParams());
        long jM8523h = this.f9391b.m8523h();
        InterfaceC3057dw.c cVar = this.f9397h;
        InterfaceC3057dw.b bVar = new InterfaceC3057dw.b();
        bVar.m8420b(jM8523h);
        InterfaceC3057dw interfaceC3057dwMo8421a = cVar.mo8421a(bVar);
        this.f9400k = interfaceC3057dwMo8421a;
        if (interfaceC3057dwMo8421a != null) {
            interfaceC3057dwMo8421a.mo8416a(new a());
        }
        Object objMo9643a = this.f9393d.mo9643a();
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(objMo9643a);
        if (thOooO00o != null) {
            m9817a(((C3870yg) thOooO00o).m13202a());
            objMo9643a = null;
        }
        C3210i5 c3210i5 = (C3210i5) objMo9643a;
        if (c3210i5 == null) {
            return;
        }
        InterfaceC3475o3 interfaceC3475o3 = this.f9395f;
        String strM9259b = c3210i5.m9259b();
        if (strM9259b != null) {
            interfaceC3475o3.mo8862a(new C3277k3.d(strM9259b));
        }
        JSONObject jSONObjectM9263f = c3210i5.m9263f();
        if (jSONObjectM9263f != null) {
            interfaceC3475o3.mo8862a(new C3277k3.m(jSONObjectM9263f));
        }
        String strM9258a = c3210i5.m9258a();
        if (strM9258a != null) {
            interfaceC3475o3.mo8862a(new C3277k3.g(strM9258a));
        }
        EnumC3079ej enumC3079ejM8522g = this.f9391b.m8522g();
        C2968bd c2968bd = new C2968bd();
        c2968bd.m7912a(this);
        C3907zj c3907zjM7815a = new C2940ak(this.f9390a.getProviderName$mediationsdk_release().value(), c2968bd).m7814a(enumC3079ejM8522g.m8501b(EnumC3079ej.Bidder)).m7817b(this.f9391b.m8524i()).m7812a(this.f9390a.getAdId$mediationsdk_release()).m7813a(o00O0.o0O0O00.OooOo00(new C3566qo().m11598a(), C3589rc.f11184a.m11711a(this.f9390a.getExtraParams()))).m7815a();
        InterfaceC3475o3 interfaceC3475o32 = this.f9395f;
        String strM13395e = c3907zjM7815a.m13395e();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13395e, "adInstance.id");
        interfaceC3475o32.mo8862a(new C3277k3.b(strM13395e));
        C3912zo c3912zo = new C3912zo(c3210i5, this.f9391b.m8525j());
        this.f9401l = new C3756v4(new C3044dj(this.f9390a.getInstanceId(), enumC3079ejM8522g.m8500b(), c3210i5.m9258a()), new C3368d(), c3210i5.m9260c());
        InterfaceC3173h3.d.f8817a.m9091c().mo9043a(this.f9395f);
        this.f9394e.mo13104a(c3907zjM7815a, c3912zo);
    }

    public /* synthetic */ C3332lj(InterstitialAdRequest interstitialAdRequest, C3083en c3083en, InterfaceC3612s0 interfaceC3612s0, InterfaceC3314l5 interfaceC3314l5, InterfaceC3844xo interfaceC3844xo, InterfaceC3475o3 interfaceC3475o3, InterfaceC2956b1 interfaceC2956b1, InterfaceC3057dw.c cVar, Executor executor, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(interstitialAdRequest, c3083en, interfaceC3612s0, interfaceC3314l5, interfaceC3844xo, interfaceC3475o3, interfaceC2956b1, (i & 128) != 0 ? new InterfaceC3057dw.d() : cVar, (i & 256) != 0 ? C3523pg.f10822a.m11401c() : executor);
    }

    /* renamed from: a */
    public static final void m9815a(C3332lj this$0, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        if (this$0.f9402m) {
            return;
        }
        this$0.f9402m = true;
        InterfaceC3057dw interfaceC3057dw = this$0.f9400k;
        if (interfaceC3057dw != null) {
            interfaceC3057dw.cancel();
        }
        InterfaceC3173h3.c.a aVar = InterfaceC3173h3.c.f8808a;
        C3277k3.j jVar = new C3277k3.j(error.getErrorCode());
        C3277k3.k kVar = new C3277k3.k(error.getErrorMessage());
        C3216ib c3216ib = this$0.f9399j;
        if (c3216ib == null) {
            kotlin.jvm.internal.OooOo.OooOO0o("taskStartedTime");
            throw null;
        }
        aVar.m9069a(jVar, kVar, new C3277k3.f(C3216ib.m9304a(c3216ib))).mo9043a(this$0.f9395f);
        C3756v4 c3756v4 = this$0.f9401l;
        if (c3756v4 != null) {
            c3756v4.mo12733a("onAdInstanceDidFailToLoad");
        }
        this$0.f9392c.onAdLoadFailed(error);
    }

    /* renamed from: a */
    public static final void m9816a(C3332lj this$0, C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "$adInstance");
        if (this$0.f9402m) {
            return;
        }
        this$0.f9402m = true;
        InterfaceC3057dw interfaceC3057dw = this$0.f9400k;
        if (interfaceC3057dw != null) {
            interfaceC3057dw.cancel();
        }
        C3216ib c3216ib = this$0.f9399j;
        if (c3216ib == null) {
            kotlin.jvm.internal.OooOo.OooOO0o("taskStartedTime");
            throw null;
        }
        InterfaceC3173h3.c.f8808a.m9071a(new C3277k3.f(C3216ib.m9304a(c3216ib))).mo9043a(this$0.f9395f);
        C3756v4 c3756v4 = this$0.f9401l;
        if (c3756v4 != null) {
            c3756v4.mo12734b("onAdInstanceDidLoad");
        }
        InterfaceC2956b1<InterstitialAd> interfaceC2956b1 = this$0.f9396g;
        C3756v4 c3756v42 = this$0.f9401l;
        kotlin.jvm.internal.OooOo.OooO0O0(c3756v42);
        this$0.f9392c.mo8458a(interfaceC2956b1.mo7855a(adInstance, c3756v42));
    }

    /* renamed from: a */
    public final void m9817a(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f9398i.execute(new o00000O0(15, this, error));
    }

    @Override // com.ironsource.InterfaceC3003cd
    /* renamed from: a */
    public void mo8110a(C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        this.f9398i.execute(new o00000O0(14, this, adInstance));
    }

    @Override // com.ironsource.InterfaceC3003cd
    /* renamed from: a */
    public void mo8111a(String description) {
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        m9817a(C3797wb.f12445a.m12868c(description));
    }
}

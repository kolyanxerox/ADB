package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C3277k3;
import com.ironsource.InterfaceC3057dw;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ironsource.c7 */
/* loaded from: classes2.dex */
public final class C2997c7 implements InterfaceC3048dn, InterfaceC2632a6 {

    /* renamed from: a */
    private final BannerAdRequest f7709a;

    /* renamed from: b */
    private final AdSize f7710b;

    /* renamed from: c */
    private final InterfaceC3314l5 f7711c;

    /* renamed from: d */
    private final C3083en f7712d;

    /* renamed from: e */
    private final InterfaceC3844xo f7713e;

    /* renamed from: f */
    private final InterfaceC3475o3 f7714f;

    /* renamed from: g */
    private final InterfaceC3612s0<BannerAdView> f7715g;

    /* renamed from: h */
    private final InterfaceC3031d6 f7716h;

    /* renamed from: i */
    private final InterfaceC3057dw.c f7717i;

    /* renamed from: j */
    private final Executor f7718j;

    /* renamed from: k */
    private C3216ib f7719k;

    /* renamed from: l */
    private InterfaceC3057dw f7720l;

    /* renamed from: m */
    private C3756v4 f7721m;

    /* renamed from: n */
    private boolean f7722n;

    /* renamed from: com.ironsource.c7$a */
    public static final class a implements InterfaceC3057dw.a {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3057dw.a
        /* renamed from: a */
        public void mo8100a() {
            C2997c7.this.m8099a(C3797wb.f12445a.m12885s());
        }
    }

    public C2997c7(BannerAdRequest adRequest, AdSize size, InterfaceC3314l5 auctionResponseFetcher, C3083en loadTaskConfig, InterfaceC3844xo networkLoadApi, InterfaceC3475o3 analytics, InterfaceC3612s0<BannerAdView> adLoadTaskListener, InterfaceC3031d6 adLayoutFactory, InterfaceC3057dw.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRequest, "adRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(size, "size");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.OooOo.OooO0o0(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.OooOo.OooO0o0(adLayoutFactory, "adLayoutFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(timerFactory, "timerFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(taskFinishedExecutor, "taskFinishedExecutor");
        this.f7709a = adRequest;
        this.f7710b = size;
        this.f7711c = auctionResponseFetcher;
        this.f7712d = loadTaskConfig;
        this.f7713e = networkLoadApi;
        this.f7714f = analytics;
        this.f7715g = adLoadTaskListener;
        this.f7716h = adLayoutFactory;
        this.f7717i = timerFactory;
        this.f7718j = taskFinishedExecutor;
    }

    /* renamed from: a */
    private final void m8096a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapM11711a = C3589rc.f11184a.m11711a(bundle);
        for (String str : mapM11711a.keySet()) {
            String strValueOf = String.valueOf(mapM11711a.get(str));
            InterfaceC3173h3.c.f8808a.m9070a(new C3277k3.l(str + C3037dc.f8244T + strValueOf)).mo9043a(this.f7714f);
        }
    }

    @Override // com.ironsource.InterfaceC2632a6
    public void onBannerLoadFail(String description) {
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        m8099a(C3797wb.f12445a.m12868c(description));
    }

    @Override // com.ironsource.InterfaceC2632a6
    public void onBannerLoadSuccess(C3907zj adInstance, C3042dh adContainer) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(adContainer, "adContainer");
        this.f7718j.execute(new androidx.webkit.OooO00o(this, adInstance, adContainer, 20));
    }

    @Override // com.ironsource.InterfaceC3048dn
    public void start() {
        this.f7719k = new C3216ib();
        this.f7714f.mo8862a(new C3277k3.s(this.f7712d.m8521f()), new C3277k3.n(this.f7712d.m8522g().m8500b()), new C3277k3.c(this.f7710b), new C3277k3.b(this.f7709a.getAdId$mediationsdk_release()));
        InterfaceC3173h3.c.f8808a.m9068a().mo9043a(this.f7714f);
        m8096a(this.f7709a.getExtraParams());
        long jM8523h = this.f7712d.m8523h();
        InterfaceC3057dw.c cVar = this.f7717i;
        InterfaceC3057dw.b bVar = new InterfaceC3057dw.b();
        bVar.m8420b(jM8523h);
        InterfaceC3057dw interfaceC3057dwMo8421a = cVar.mo8421a(bVar);
        this.f7720l = interfaceC3057dwMo8421a;
        if (interfaceC3057dwMo8421a != null) {
            interfaceC3057dwMo8421a.mo8416a(new a());
        }
        Object objMo9643a = this.f7711c.mo9643a();
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(objMo9643a);
        if (thOooO00o != null) {
            m8099a(((C3870yg) thOooO00o).m13202a());
            objMo9643a = null;
        }
        C3210i5 c3210i5 = (C3210i5) objMo9643a;
        if (c3210i5 == null) {
            return;
        }
        InterfaceC3475o3 interfaceC3475o3 = this.f7714f;
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
        EnumC3079ej enumC3079ejM8522g = this.f7712d.m8522g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C2972bh c2972bh = new C2972bh(AdapterUtils.dpToPixels(applicationContext, this.f7710b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f7710b.getHeight()), this.f7710b.getSizeDescription());
        C3427mp c3427mp = new C3427mp();
        c3427mp.m10883a(this);
        C3907zj adInstance = new C2940ak(this.f7709a.getProviderName$mediationsdk_release().value(), c3427mp).m7814a(enumC3079ejM8522g.m8501b(EnumC3079ej.Bidder)).m7811a(c2972bh).m7817b(this.f7712d.m8524i()).m7812a(this.f7709a.getAdId$mediationsdk_release()).m7813a(o00O0.o0O0O00.OooOo00(new C3566qo().m11598a(), C3589rc.f11184a.m11711a(this.f7709a.getExtraParams()))).m7815a();
        C3912zo c3912zo = new C3912zo(c3210i5, this.f7712d.m8525j());
        this.f7721m = new C3756v4(new C3044dj(this.f7709a.getInstanceId(), enumC3079ejM8522g.m8500b(), c3210i5.m9258a()), new C3368d(), c3210i5.m9260c());
        InterfaceC3173h3.d.f8817a.m9091c().mo9043a(this.f7714f);
        InterfaceC3844xo interfaceC3844xo = this.f7713e;
        kotlin.jvm.internal.OooOo.OooO0Oo(adInstance, "adInstance");
        interfaceC3844xo.mo13104a(adInstance, c3912zo);
    }

    public /* synthetic */ C2997c7(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC3314l5 interfaceC3314l5, C3083en c3083en, InterfaceC3844xo interfaceC3844xo, InterfaceC3475o3 interfaceC3475o3, InterfaceC3612s0 interfaceC3612s0, InterfaceC3031d6 interfaceC3031d6, InterfaceC3057dw.c cVar, Executor executor, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(bannerAdRequest, adSize, interfaceC3314l5, c3083en, interfaceC3844xo, interfaceC3475o3, interfaceC3612s0, interfaceC3031d6, (i & 256) != 0 ? new InterfaceC3057dw.d() : cVar, (i & 512) != 0 ? C3523pg.f10822a.m11401c() : executor);
    }

    /* renamed from: a */
    public static final void m8097a(C2997c7 this$0, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        if (this$0.f7722n) {
            return;
        }
        this$0.f7722n = true;
        InterfaceC3057dw interfaceC3057dw = this$0.f7720l;
        if (interfaceC3057dw != null) {
            interfaceC3057dw.cancel();
        }
        InterfaceC3173h3.c.a aVar = InterfaceC3173h3.c.f8808a;
        C3277k3.j jVar = new C3277k3.j(error.getErrorCode());
        C3277k3.k kVar = new C3277k3.k(error.getErrorMessage());
        C3216ib c3216ib = this$0.f7719k;
        if (c3216ib == null) {
            kotlin.jvm.internal.OooOo.OooOO0o("taskStartedTime");
            throw null;
        }
        aVar.m9069a(jVar, kVar, new C3277k3.f(C3216ib.m9304a(c3216ib))).mo9043a(this$0.f7714f);
        C3756v4 c3756v4 = this$0.f7721m;
        if (c3756v4 != null) {
            c3756v4.mo12733a("onBannerLoadFail");
        }
        this$0.f7715g.onAdLoadFailed(error);
    }

    /* renamed from: a */
    public static final void m8098a(C2997c7 this$0, C3907zj adInstance, C3042dh adContainer) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "$adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(adContainer, "$adContainer");
        if (this$0.f7722n) {
            return;
        }
        this$0.f7722n = true;
        InterfaceC3057dw interfaceC3057dw = this$0.f7720l;
        if (interfaceC3057dw != null) {
            interfaceC3057dw.cancel();
        }
        C3216ib c3216ib = this$0.f7719k;
        if (c3216ib == null) {
            kotlin.jvm.internal.OooOo.OooOO0o("taskStartedTime");
            throw null;
        }
        InterfaceC3173h3.c.f8808a.m9071a(new C3277k3.f(C3216ib.m9304a(c3216ib))).mo9043a(this$0.f7714f);
        C3756v4 c3756v4 = this$0.f7721m;
        if (c3756v4 != null) {
            c3756v4.mo12734b("onBannerLoadSuccess");
        }
        InterfaceC3031d6 interfaceC3031d6 = this$0.f7716h;
        C3756v4 c3756v42 = this$0.f7721m;
        kotlin.jvm.internal.OooOo.OooO0O0(c3756v42);
        this$0.f7715g.mo8458a(interfaceC3031d6.mo8282a(adInstance, adContainer, c3756v42));
    }

    /* renamed from: a */
    public final void m8099a(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f7718j.execute(new o00000O0(5, this, error));
    }
}

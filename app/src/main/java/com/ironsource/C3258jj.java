package com.ironsource;

import android.app.Activity;
import com.ironsource.C3277k3;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;

/* renamed from: com.ironsource.jj */
/* loaded from: classes2.dex */
public final class C3258jj implements InterfaceC3038dd {

    /* renamed from: a */
    private C3907zj f9117a;

    /* renamed from: b */
    private InterfaceC3888z0 f9118b;

    /* renamed from: c */
    private InterfaceC3790w4 f9119c;

    /* renamed from: d */
    private InterfaceC3475o3 f9120d;

    /* renamed from: e */
    private InterfaceC3496oo f9121e;

    /* renamed from: f */
    private InterfaceC3919zv f9122f;

    /* renamed from: g */
    private InterfaceC3223ii f9123g;

    /* renamed from: h */
    private InterfaceC3223ii.a f9124h;

    /* renamed from: i */
    private final Map<String, C3258jj> f9125i;

    /* renamed from: j */
    private InterstitialAdInfo f9126j;

    /* renamed from: k */
    private InterfaceC3293kj f9127k;

    public C3258jj(C3907zj adInstance, InterfaceC3888z0 adNetworkShow, InterfaceC3790w4 auctionDataReporter, InterfaceC3475o3 analytics, InterfaceC3496oo networkDestroyAPI, InterfaceC3919zv threadManager, InterfaceC3223ii sessionDepthService, InterfaceC3223ii.a sessionDepthServiceEditor, Map<String, C3258jj> retainer) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.OooOo.OooO0o0(threadManager, "threadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.OooOo.OooO0o0(retainer, "retainer");
        this.f9117a = adInstance;
        this.f9118b = adNetworkShow;
        this.f9119c = auctionDataReporter;
        this.f9120d = analytics;
        this.f9121e = networkDestroyAPI;
        this.f9122f = threadManager;
        this.f9123g = sessionDepthService;
        this.f9124h = sessionDepthServiceEditor;
        this.f9125i = retainer;
        String strM13396f = adInstance.m13396f();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13396f, "adInstance.instanceId");
        String strM13395e = this.f9117a.m13395e();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13395e, "adInstance.id");
        this.f9126j = new InterstitialAdInfo(strM13396f, strM13395e);
        C2968bd c2968bd = new C2968bd();
        this.f9117a.m13390a(c2968bd);
        c2968bd.m7913a(this);
    }

    /* renamed from: d */
    public static final void m9508d(C3258jj this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3293kj interfaceC3293kj = this$0.f9127k;
        if (interfaceC3293kj != null) {
            interfaceC3293kj.onAdInstanceDidShow();
        }
    }

    /* renamed from: a */
    public final void m9509a() {
        InterfaceC3919zv.m13429a(this.f9122f, new o00O0O(this, 1), 0L, 2, null);
    }

    /* renamed from: b */
    public final InterstitialAdInfo m9513b() {
        return this.f9126j;
    }

    /* renamed from: c */
    public final InterfaceC3293kj m9514c() {
        return this.f9127k;
    }

    public final void finalize() {
        m9509a();
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC3173h3.a.f8794a.m9061f(new InterfaceC3312l3[0]).mo9043a(this.f9120d);
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidClick() {
        InterfaceC3173h3.a.f8794a.m9053a().mo9043a(this.f9120d);
        this.f9122f.mo11396a(new o00O0O(this, 2));
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidDismiss() {
        this.f9125i.remove(this.f9126j.getAdId());
        InterfaceC3173h3.a.f8794a.m9056a(new InterfaceC3312l3[0]).mo9043a(this.f9120d);
        this.f9122f.mo11396a(new o00O0O(this, 3));
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidReward(String str, int i) {
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidShow() {
        InterfaceC3223ii interfaceC3223ii = this.f9123g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        InterfaceC3173h3.a.f8794a.m9057b(new C3277k3.w(interfaceC3223ii.mo9344a(ad_unit))).mo9043a(this.f9120d);
        this.f9124h.mo9346b(ad_unit);
        this.f9119c.mo12735c("onAdInstanceDidShow");
        this.f9122f.mo11396a(new o00O0O(this, 0));
    }

    public /* synthetic */ C3258jj(C3907zj c3907zj, InterfaceC3888z0 interfaceC3888z0, InterfaceC3790w4 interfaceC3790w4, InterfaceC3475o3 interfaceC3475o3, InterfaceC3496oo interfaceC3496oo, InterfaceC3919zv interfaceC3919zv, InterfaceC3223ii interfaceC3223ii, InterfaceC3223ii.a aVar, Map map, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3907zj, interfaceC3888z0, interfaceC3790w4, interfaceC3475o3, (i & 16) != 0 ? new C3531po() : interfaceC3496oo, (i & 32) != 0 ? C3523pg.f10822a : interfaceC3919zv, (i & 64) != 0 ? C3495on.f10667s.m11213d().mo8689k() : interfaceC3223ii, (i & 128) != 0 ? C3495on.f10667s.m11211a().mo8482e() : aVar, map);
    }

    /* renamed from: b */
    public static final void m9506b(C3258jj this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3293kj interfaceC3293kj = this$0.f9127k;
        if (interfaceC3293kj != null) {
            interfaceC3293kj.onAdInstanceDidClick();
        }
    }

    /* renamed from: c */
    public static final void m9507c(C3258jj this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3293kj interfaceC3293kj = this$0.f9127k;
        if (interfaceC3293kj != null) {
            interfaceC3293kj.onAdInstanceDidDismiss();
        }
    }

    /* renamed from: a */
    public final void m9510a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f9125i.put(this.f9126j.getAdId(), this);
        if (!this.f9118b.mo4764a(this.f9117a)) {
            m9505a(C3797wb.f12445a.m12886t());
        } else {
            InterfaceC3173h3.a.f8794a.m9059d(new InterfaceC3312l3[0]).mo9043a(this.f9120d);
            this.f9118b.mo4763a(activity, this.f9117a);
        }
    }

    /* renamed from: d */
    public final boolean m9515d() {
        boolean zMo4764a = this.f9118b.mo4764a(this.f9117a);
        InterfaceC3173h3.a.f8794a.m9055a(zMo4764a).mo9043a(this.f9120d);
        return zMo4764a;
    }

    /* renamed from: a */
    public static final void m9503a(C3258jj this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3173h3.d.f8817a.m9089b().mo9043a(this$0.f9120d);
        this$0.f9121e.mo11232a(this$0.f9117a);
    }

    /* renamed from: a */
    public static final void m9504a(C3258jj this$0, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        InterfaceC3293kj interfaceC3293kj = this$0.f9127k;
        if (interfaceC3293kj != null) {
            interfaceC3293kj.onAdInstanceDidFailedToShow(error);
        }
    }

    /* renamed from: a */
    public final void m9511a(InterfaceC3293kj interfaceC3293kj) {
        this.f9127k = interfaceC3293kj;
    }

    /* renamed from: a */
    private final void m9505a(IronSourceError ironSourceError) {
        this.f9125i.remove(this.f9126j.getAdId());
        InterfaceC3173h3.a.f8794a.m9054a(new C3277k3.j(ironSourceError.getErrorCode()), new C3277k3.k(ironSourceError.getErrorMessage())).mo9043a(this.f9120d);
        this.f9122f.mo11396a(new o00000O0(12, this, ironSourceError));
    }

    /* renamed from: a */
    public final void m9512a(InterstitialAdInfo interstitialAdInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(interstitialAdInfo, "<set-?>");
        this.f9126j = interstitialAdInfo;
    }

    @Override // com.ironsource.InterfaceC3038dd
    /* renamed from: a */
    public void mo8295a(String str) {
        m9505a(C3797wb.f12445a.m12867c(new IronSourceError(0, str)));
    }
}

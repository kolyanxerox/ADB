package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C3277k3;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.p6 */
/* loaded from: classes2.dex */
public final class C3513p6 implements InterfaceC2996c6 {

    /* renamed from: a */
    private final C3907zj f10746a;

    /* renamed from: b */
    private final C3042dh f10747b;

    /* renamed from: c */
    private final C3756v4 f10748c;

    /* renamed from: d */
    private final InterfaceC3475o3 f10749d;

    /* renamed from: e */
    private final InterfaceC3496oo f10750e;

    /* renamed from: f */
    private final InterfaceC3919zv f10751f;

    /* renamed from: g */
    private final InterfaceC3223ii f10752g;

    /* renamed from: h */
    private final InterfaceC3223ii.a f10753h;

    /* renamed from: i */
    private BannerAdInfo f10754i;

    /* renamed from: j */
    private WeakReference<InterfaceC3548q6> f10755j;

    /* renamed from: k */
    private WeakReference<FrameLayout> f10756k;

    /* renamed from: com.ironsource.p6$a */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            kotlin.jvm.internal.OooOo.OooO0o0(v, "v");
            C2972bh size = C3513p6.this.m11300d().getSize();
            ((FrameLayout) v).addView(C3513p6.this.m11300d(), 0, new FrameLayout.LayoutParams(size.m7924c(), size.m7922a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            kotlin.jvm.internal.OooOo.OooO0o0(v, "v");
            ((FrameLayout) v).removeAllViews();
        }
    }

    public C3513p6(C3907zj adInstance, C3042dh container, C3756v4 auctionDataReporter, InterfaceC3475o3 analytics, InterfaceC3496oo networkDestroyAPI, InterfaceC3919zv threadManager, InterfaceC3223ii sessionDepthService, InterfaceC3223ii.a sessionDepthServiceEditor) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(container, "container");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.OooOo.OooO0o0(threadManager, "threadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        this.f10746a = adInstance;
        this.f10747b = container;
        this.f10748c = auctionDataReporter;
        this.f10749d = analytics;
        this.f10750e = networkDestroyAPI;
        this.f10751f = threadManager;
        this.f10752g = sessionDepthService;
        this.f10753h = sessionDepthServiceEditor;
        String strM13396f = adInstance.m13396f();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13396f, "adInstance.instanceId");
        String strM13395e = adInstance.m13395e();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13395e, "adInstance.id");
        this.f10754i = new BannerAdInfo(strM13396f, strM13395e);
        this.f10755j = new WeakReference<>(null);
        this.f10756k = new WeakReference<>(null);
        C3427mp c3427mp = new C3427mp();
        adInstance.m13390a(c3427mp);
        c3427mp.m10884a(this);
    }

    /* renamed from: a */
    private final a m11291a() {
        return new a();
    }

    /* renamed from: b */
    public final void m11297b() {
        InterfaceC3919zv.m13429a(this.f10751f, new o0O0O00(this, 1), 0L, 2, null);
    }

    /* renamed from: c */
    public final BannerAdInfo m11299c() {
        return this.f10754i;
    }

    /* renamed from: d */
    public final C3042dh m11300d() {
        return this.f10747b;
    }

    /* renamed from: e */
    public final WeakReference<InterfaceC3548q6> m11301e() {
        return this.f10755j;
    }

    /* renamed from: f */
    public final WeakReference<FrameLayout> m11302f() {
        return this.f10756k;
    }

    public final void finalize() {
        m11297b();
    }

    @Override // com.ironsource.InterfaceC2996c6
    public void onBannerClick() {
        InterfaceC3173h3.a.f8794a.m9053a().mo9043a(this.f10749d);
        this.f10751f.mo11396a(new o0O0O00(this, 2));
    }

    @Override // com.ironsource.InterfaceC2996c6
    public void onBannerShowSuccess() {
        InterfaceC3223ii interfaceC3223ii = this.f10752g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        InterfaceC3173h3.a.f8794a.m9061f(new C3277k3.w(interfaceC3223ii.mo9344a(ad_unit))).mo9043a(this.f10749d);
        this.f10753h.mo9346b(ad_unit);
        this.f10748c.mo12735c("onBannerShowSuccess");
        this.f10751f.mo11396a(new o0O0O00(this, 0));
    }

    public /* synthetic */ C3513p6(C3907zj c3907zj, C3042dh c3042dh, C3756v4 c3756v4, InterfaceC3475o3 interfaceC3475o3, InterfaceC3496oo interfaceC3496oo, InterfaceC3919zv interfaceC3919zv, InterfaceC3223ii interfaceC3223ii, InterfaceC3223ii.a aVar, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3907zj, c3042dh, c3756v4, interfaceC3475o3, (i & 16) != 0 ? new C3531po() : interfaceC3496oo, (i & 32) != 0 ? C3523pg.f10822a : interfaceC3919zv, (i & 64) != 0 ? C3495on.f10667s.m11213d().mo8689k() : interfaceC3223ii, (i & 128) != 0 ? C3495on.f10667s.m11211a().mo8482e() : aVar);
    }

    /* renamed from: a */
    public static final void m11292a(C3513p6 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3173h3.d.f8817a.m9089b().mo9043a(this$0.f10749d);
        this$0.f10750e.mo11232a(this$0.f10746a);
    }

    /* renamed from: b */
    public static final void m11293b(C3513p6 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3548q6 interfaceC3548q6 = this$0.f10755j.get();
        if (interfaceC3548q6 != null) {
            interfaceC3548q6.onBannerAdClicked();
        }
    }

    /* renamed from: c */
    public static final void m11294c(C3513p6 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3548q6 interfaceC3548q6 = this$0.f10755j.get();
        if (interfaceC3548q6 != null) {
            interfaceC3548q6.onBannerAdShown();
        }
    }

    /* renamed from: a */
    public final void m11295a(BannerAdInfo bannerAdInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdInfo, "<set-?>");
        this.f10754i = bannerAdInfo;
    }

    /* renamed from: b */
    public final void m11298b(WeakReference<FrameLayout> value) {
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        this.f10756k = value;
        FrameLayout frameLayout = value.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(m11291a());
        }
    }

    /* renamed from: a */
    public final void m11296a(WeakReference<InterfaceC3548q6> weakReference) {
        kotlin.jvm.internal.OooOo.OooO0o0(weakReference, "<set-?>");
        this.f10755j = weakReference;
    }
}

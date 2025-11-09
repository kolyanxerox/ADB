package com.ironsource;

import android.app.Activity;
import com.ironsource.C3277k3;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;

/* renamed from: com.ironsource.pr */
/* loaded from: classes2.dex */
public final class C3534pr implements InterfaceC3038dd {

    /* renamed from: a */
    private C3907zj f10843a;

    /* renamed from: b */
    private InterfaceC3888z0 f10844b;

    /* renamed from: c */
    private InterfaceC3790w4 f10845c;

    /* renamed from: d */
    private InterfaceC3475o3 f10846d;

    /* renamed from: e */
    private InterfaceC3496oo f10847e;

    /* renamed from: f */
    private InterfaceC3919zv f10848f;

    /* renamed from: g */
    private InterfaceC3223ii f10849g;

    /* renamed from: h */
    private InterfaceC3223ii.a f10850h;

    /* renamed from: i */
    private final Map<String, C3534pr> f10851i;

    /* renamed from: j */
    private RewardedAdInfo f10852j;

    /* renamed from: k */
    private InterfaceC3569qr f10853k;

    public C3534pr(C3907zj adInstance, InterfaceC3888z0 adNetworkShow, InterfaceC3790w4 auctionDataReporter, InterfaceC3475o3 analytics, InterfaceC3496oo networkDestroyAPI, InterfaceC3919zv threadManager, InterfaceC3223ii sessionDepthService, InterfaceC3223ii.a sessionDepthServiceEditor, Map<String, C3534pr> retainer) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.OooOo.OooO0o0(analytics, "analytics");
        kotlin.jvm.internal.OooOo.OooO0o0(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.OooOo.OooO0o0(threadManager, "threadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.OooOo.OooO0o0(retainer, "retainer");
        this.f10843a = adInstance;
        this.f10844b = adNetworkShow;
        this.f10845c = auctionDataReporter;
        this.f10846d = analytics;
        this.f10847e = networkDestroyAPI;
        this.f10848f = threadManager;
        this.f10849g = sessionDepthService;
        this.f10850h = sessionDepthServiceEditor;
        this.f10851i = retainer;
        String strM13396f = adInstance.m13396f();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13396f, "adInstance.instanceId");
        String strM13395e = this.f10843a.m13395e();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13395e, "adInstance.id");
        this.f10852j = new RewardedAdInfo(strM13396f, strM13395e);
        C2968bd c2968bd = new C2968bd();
        this.f10843a.m13390a(c2968bd);
        c2968bd.m7913a(this);
    }

    /* renamed from: d */
    public static final void m11445d(C3534pr this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3569qr interfaceC3569qr = this$0.f10853k;
        if (interfaceC3569qr != null) {
            interfaceC3569qr.onUserEarnedReward();
        }
    }

    /* renamed from: e */
    public static final void m11446e(C3534pr this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3569qr interfaceC3569qr = this$0.f10853k;
        if (interfaceC3569qr != null) {
            interfaceC3569qr.onRewardedAdShown();
        }
    }

    /* renamed from: a */
    public final void m11447a() {
        InterfaceC3919zv.m13429a(this.f10848f, new o000OOo(this, 4), 0L, 2, null);
    }

    /* renamed from: b */
    public final RewardedAdInfo m11451b() {
        return this.f10852j;
    }

    /* renamed from: c */
    public final InterfaceC3569qr m11452c() {
        return this.f10853k;
    }

    public final void finalize() {
        m11447a();
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC3173h3.a.f8794a.m9061f(new InterfaceC3312l3[0]).mo9043a(this.f10846d);
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidClick() {
        InterfaceC3173h3.a.f8794a.m9053a().mo9043a(this.f10846d);
        this.f10848f.mo11396a(new o000OOo(this, 0));
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidDismiss() {
        this.f10851i.remove(this.f10852j.getAdId());
        InterfaceC3173h3.a.f8794a.m9056a(new InterfaceC3312l3[0]).mo9043a(this.f10846d);
        this.f10848f.mo11396a(new o000OOo(this, 1));
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidReward(String str, int i) {
        C3277k3.u uVar = new C3277k3.u("Virtual Item");
        C3277k3.t tVar = new C3277k3.t(1);
        C3277k3.q qVar = new C3277k3.q("DefaultRewardedVideo");
        String transId = IronSourceUtils.getTransId(System.currentTimeMillis(), this.f10843a.m13397g());
        kotlin.jvm.internal.OooOo.OooO0Oo(transId, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC3173h3.a.f8794a.m9058c(uVar, tVar, qVar, new C3277k3.y(transId)).mo9043a(this.f10846d);
        this.f10848f.mo11396a(new o000OOo(this, 2));
    }

    @Override // com.ironsource.InterfaceC3038dd
    public void onAdInstanceDidShow() {
        InterfaceC3223ii interfaceC3223ii = this.f10849g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        InterfaceC3173h3.a.f8794a.m9057b(new C3277k3.w(interfaceC3223ii.mo9344a(ad_unit))).mo9043a(this.f10846d);
        this.f10850h.mo9346b(ad_unit);
        this.f10845c.mo12735c("onAdInstanceDidShow");
        this.f10848f.mo11396a(new o000OOo(this, 3));
    }

    public /* synthetic */ C3534pr(C3907zj c3907zj, InterfaceC3888z0 interfaceC3888z0, InterfaceC3790w4 interfaceC3790w4, InterfaceC3475o3 interfaceC3475o3, InterfaceC3496oo interfaceC3496oo, InterfaceC3919zv interfaceC3919zv, InterfaceC3223ii interfaceC3223ii, InterfaceC3223ii.a aVar, Map map, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3907zj, interfaceC3888z0, interfaceC3790w4, interfaceC3475o3, (i & 16) != 0 ? new C3531po() : interfaceC3496oo, (i & 32) != 0 ? C3523pg.f10822a : interfaceC3919zv, (i & 64) != 0 ? C3495on.f10667s.m11213d().mo8689k() : interfaceC3223ii, (i & 128) != 0 ? C3495on.f10667s.m11211a().mo8482e() : aVar, map);
    }

    /* renamed from: b */
    public static final void m11443b(C3534pr this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3569qr interfaceC3569qr = this$0.f10853k;
        if (interfaceC3569qr != null) {
            interfaceC3569qr.onRewardedAdClicked();
        }
    }

    /* renamed from: c */
    public static final void m11444c(C3534pr this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3569qr interfaceC3569qr = this$0.f10853k;
        if (interfaceC3569qr != null) {
            interfaceC3569qr.onRewardedAdDismissed();
        }
    }

    /* renamed from: a */
    public final void m11448a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f10851i.put(this.f10852j.getAdId(), this);
        if (!this.f10844b.mo4764a(this.f10843a)) {
            m11440a(C3797wb.f12445a.m12886t());
        } else {
            InterfaceC3173h3.a.f8794a.m9059d(new InterfaceC3312l3[0]).mo9043a(this.f10846d);
            this.f10844b.mo4763a(activity, this.f10843a);
        }
    }

    /* renamed from: d */
    public final boolean m11453d() {
        boolean zMo4764a = this.f10844b.mo4764a(this.f10843a);
        InterfaceC3173h3.a.f8794a.m9055a(zMo4764a).mo9043a(this.f10846d);
        return zMo4764a;
    }

    /* renamed from: a */
    private final void m11440a(IronSourceError ironSourceError) {
        this.f10851i.remove(this.f10852j.getAdId());
        InterfaceC3173h3.a.f8794a.m9054a(new C3277k3.j(ironSourceError.getErrorCode()), new C3277k3.k(ironSourceError.getErrorMessage())).mo9043a(this.f10846d);
        this.f10848f.mo11396a(new o00000O0(22, this, ironSourceError));
    }

    /* renamed from: a */
    public static final void m11441a(C3534pr this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3173h3.d.f8817a.m9089b().mo9043a(this$0.f10846d);
        this$0.f10847e.mo11232a(this$0.f10843a);
    }

    /* renamed from: a */
    public static final void m11442a(C3534pr this$0, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        InterfaceC3569qr interfaceC3569qr = this$0.f10853k;
        if (interfaceC3569qr != null) {
            interfaceC3569qr.onRewardedAdFailedToShow(error);
        }
    }

    /* renamed from: a */
    public final void m11449a(InterfaceC3569qr interfaceC3569qr) {
        this.f10853k = interfaceC3569qr;
    }

    /* renamed from: a */
    public final void m11450a(RewardedAdInfo rewardedAdInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(rewardedAdInfo, "<set-?>");
        this.f10852j = rewardedAdInfo;
    }

    @Override // com.ironsource.InterfaceC3038dd
    /* renamed from: a */
    public void mo8295a(String str) {
        m11440a(C3797wb.f12445a.m12867c(new IronSourceError(0, str)));
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* renamed from: com.ironsource.ur */
/* loaded from: classes2.dex */
public final class C3744ur implements InterfaceC3158gn {

    /* renamed from: a */
    private final RewardedAdRequest f12270a;

    /* renamed from: b */
    private final RewardedAdLoaderListener f12271b;

    /* renamed from: c */
    private final InterfaceC2993c3 f12272c;

    /* renamed from: d */
    private final InterfaceC3440n3 f12273d;

    public C3744ur(RewardedAdRequest adRequest, RewardedAdLoaderListener publisherListener, InterfaceC2993c3 adapterConfigProvider, InterfaceC3440n3 analyticsFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRequest, "adRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherListener, "publisherListener");
        kotlin.jvm.internal.OooOo.OooO0o0(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(analyticsFactory, "analyticsFactory");
        this.f12270a = adRequest;
        this.f12271b = publisherListener;
        this.f12272c = adapterConfigProvider;
        this.f12273d = analyticsFactory;
    }

    @Override // com.ironsource.InterfaceC3158gn
    /* renamed from: a */
    public InterfaceC3048dn mo8642a() throws Exception {
        IronSourceError ironSourceErrorM12870d;
        String instanceId = this.f12270a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        kotlin.jvm.internal.OooOo.OooO0Oo(sDKVersion, "getSDKVersion()");
        InterfaceC3475o3 interfaceC3475o3Mo9980a = this.f12273d.mo9980a(new C3208i3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            C3083en c3083enMo8731a = new C3123fn(this.f12270a.getAdm(), this.f12270a.getProviderName$mediationsdk_release(), this.f12272c, C3426mo.f10310e.m10882a().m10877c().get()).mo8731a();
            new C3674sr(c3083enMo8731a).mo8283a();
            C3878yo c3878yo = new C3878yo();
            C3279k5 c3279k5 = new C3279k5(this.f12270a.getAdm(), this.f12270a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.f12270a;
            kotlin.jvm.internal.OooOo.OooO0O0(c3083enMo8731a);
            C3523pg c3523pg = C3523pg.f10822a;
            return new C3604rr(rewardedAdRequest, c3083enMo8731a, new C3709tr(c3523pg, this.f12271b), c3279k5, c3878yo, interfaceC3475o3Mo9980a, new C3429mr(interfaceC3475o3Mo9980a, c3523pg.m11401c()), null, null, 384, null);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            if (e instanceof C3605rs) {
                ironSourceErrorM12870d = ((C3605rs) e).m11760a();
            } else {
                C3797wb c3797wb = C3797wb.f12445a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorM12870d = c3797wb.m12870d(message);
            }
            return new C3865yb(this.f12270a, new C3709tr(C3523pg.f10822a, this.f12271b), interfaceC3475o3Mo9980a, ironSourceErrorM12870d);
        }
    }

    public /* synthetic */ C3744ur(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC2993c3 interfaceC2993c3, InterfaceC3440n3 interfaceC3440n3, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC2993c3, (i & 8) != 0 ? new C3351m3(IronSource.AD_UNIT.REWARDED_VIDEO) : interfaceC3440n3);
    }
}

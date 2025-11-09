package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;

/* renamed from: com.ironsource.f7 */
/* loaded from: classes2.dex */
public final class C3107f7 implements InterfaceC3158gn {

    /* renamed from: a */
    private final BannerAdRequest f8507a;

    /* renamed from: b */
    private final BannerAdLoaderListener f8508b;

    /* renamed from: c */
    private final InterfaceC2993c3 f8509c;

    /* renamed from: d */
    private final InterfaceC3440n3 f8510d;

    public C3107f7(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, InterfaceC2993c3 adapterConfigProvider, InterfaceC3440n3 analyticsFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRequest, "adRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherListener, "publisherListener");
        kotlin.jvm.internal.OooOo.OooO0o0(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(analyticsFactory, "analyticsFactory");
        this.f8507a = adRequest;
        this.f8508b = publisherListener;
        this.f8509c = adapterConfigProvider;
        this.f8510d = analyticsFactory;
    }

    @Override // com.ironsource.InterfaceC3158gn
    /* renamed from: a */
    public InterfaceC3048dn mo8642a() throws Exception {
        IronSourceError ironSourceErrorM12862a;
        String instanceId = this.f8507a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        kotlin.jvm.internal.OooOo.OooO0Oo(sDKVersion, "getSDKVersion()");
        InterfaceC3475o3 interfaceC3475o3Mo9980a = this.f8510d.mo9980a(new C3208i3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            C3083en c3083enMo8731a = new C3123fn(this.f8507a.getAdm(), this.f8507a.getProviderName$mediationsdk_release(), this.f8509c, C3426mo.f10310e.m10882a().m10877c().get()).mo8731a();
            new C3032d7(c3083enMo8731a, this.f8507a.getSize()).mo8283a();
            C3878yo c3878yo = new C3878yo();
            C3279k5 c3279k5 = new C3279k5(this.f8507a.getAdm(), this.f8507a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f8507a;
            AdSize size = bannerAdRequest.getSize();
            kotlin.jvm.internal.OooOo.OooO0O0(c3083enMo8731a);
            C3523pg c3523pg = C3523pg.f10822a;
            return new C2997c7(bannerAdRequest, size, c3279k5, c3083enMo8731a, c3878yo, interfaceC3475o3Mo9980a, new C3067e7(c3523pg, this.f8508b), new C3066e6(interfaceC3475o3Mo9980a, c3523pg.m11401c()), null, null, 768, null);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            if (e instanceof C3605rs) {
                ironSourceErrorM12862a = ((C3605rs) e).m11760a();
            } else {
                C3797wb c3797wb = C3797wb.f12445a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorM12862a = c3797wb.m12862a(message);
            }
            return new C3763vb(ironSourceErrorM12862a, new C3067e7(C3523pg.f10822a, this.f8508b), interfaceC3475o3Mo9980a);
        }
    }

    public /* synthetic */ C3107f7(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC2993c3 interfaceC2993c3, InterfaceC3440n3 interfaceC3440n3, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC2993c3, (i & 8) != 0 ? new C3351m3(IronSource.AD_UNIT.BANNER) : interfaceC3440n3);
    }
}

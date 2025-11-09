package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* renamed from: com.ironsource.oj */
/* loaded from: classes2.dex */
public final class C3491oj implements InterfaceC3158gn {

    /* renamed from: a */
    private final InterstitialAdRequest f10657a;

    /* renamed from: b */
    private final InterstitialAdLoaderListener f10658b;

    /* renamed from: c */
    private final InterfaceC2993c3 f10659c;

    /* renamed from: d */
    private final InterfaceC3440n3 f10660d;

    public C3491oj(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, InterfaceC2993c3 adapterConfigProvider, InterfaceC3440n3 analyticsFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRequest, "adRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherListener, "publisherListener");
        kotlin.jvm.internal.OooOo.OooO0o0(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(analyticsFactory, "analyticsFactory");
        this.f10657a = adRequest;
        this.f10658b = publisherListener;
        this.f10659c = adapterConfigProvider;
        this.f10660d = analyticsFactory;
    }

    @Override // com.ironsource.InterfaceC3158gn
    /* renamed from: a */
    public InterfaceC3048dn mo8642a() throws Exception {
        IronSourceError ironSourceErrorM12865b;
        String instanceId = this.f10657a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        kotlin.jvm.internal.OooOo.OooO0Oo(sDKVersion, "getSDKVersion()");
        InterfaceC3475o3 interfaceC3475o3Mo9980a = this.f10660d.mo9980a(new C3208i3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            C3083en c3083enMo8731a = new C3123fn(this.f10657a.getAdm(), this.f10657a.getProviderName$mediationsdk_release(), this.f10659c, C3426mo.f10310e.m10882a().m10877c().get()).mo8731a();
            new C3421mj(c3083enMo8731a).mo8283a();
            C3878yo c3878yo = new C3878yo();
            C3279k5 c3279k5 = new C3279k5(this.f10657a.getAdm(), this.f10657a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f10657a;
            kotlin.jvm.internal.OooOo.OooO0O0(c3083enMo8731a);
            C3523pg c3523pg = C3523pg.f10822a;
            return new C3332lj(interstitialAdRequest, c3083enMo8731a, new C3456nj(c3523pg, this.f10658b), c3279k5, c3878yo, interfaceC3475o3Mo9980a, new C3189hj(interfaceC3475o3Mo9980a, c3523pg.m11401c()), null, null, 384, null);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            if (e instanceof C3605rs) {
                ironSourceErrorM12865b = ((C3605rs) e).m11760a();
            } else {
                C3797wb c3797wb = C3797wb.f12445a;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorM12865b = c3797wb.m12865b(message);
            }
            return new C3831xb(this.f10657a, new C3456nj(C3523pg.f10822a, this.f10658b), interfaceC3475o3Mo9980a, ironSourceErrorM12865b);
        }
    }

    public /* synthetic */ C3491oj(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC2993c3 interfaceC2993c3, InterfaceC3440n3 interfaceC3440n3, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC2993c3, (i & 8) != 0 ? new C3351m3(IronSource.AD_UNIT.INTERSTITIAL) : interfaceC3440n3);
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* renamed from: com.ironsource.y0 */
/* loaded from: classes2.dex */
public final class C3854y0 implements InterfaceC3820x0 {

    /* renamed from: a */
    private final InterfaceC3844xo f12690a;

    /* renamed from: com.ironsource.y0$a */
    public static final class a {

        /* renamed from: a */
        public static final a f12691a = new a();

        /* renamed from: b */
        public static final int f12692b = 1000;

        private a() {
        }
    }

    public C3854y0(InterfaceC3844xo networkLoadApi) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkLoadApi, "networkLoadApi");
        this.f12690a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC3820x0
    /* renamed from: a */
    public String mo12990a() {
        return this.f12690a.mo13103a();
    }

    @Override // com.ironsource.InterfaceC3820x0
    /* renamed from: a */
    public void mo12991a(C3907zj adInstance, Map<String, String> loadParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(loadParams, "loadParams");
        try {
            this.f12690a.mo13104a(adInstance, new C3912zo(null, false, 3, null));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.m13395e() + " failed. error: " + e.getMessage());
            StringBuilder sb = new StringBuilder("1000: loadAd failed: ");
            sb.append(e.getMessage());
            String string = sb.toString();
            InterfaceC3299kp interfaceC3299kpM13392b = adInstance.m13392b();
            if (interfaceC3299kpM13392b instanceof C2968bd) {
                InterfaceC3299kp interfaceC3299kpM13392b2 = adInstance.m13392b();
                kotlin.jvm.internal.OooOo.OooO0OO(interfaceC3299kpM13392b2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C2968bd) interfaceC3299kpM13392b2).onInterstitialLoadFailed(string);
            } else if (interfaceC3299kpM13392b instanceof C3427mp) {
                InterfaceC3299kp interfaceC3299kpM13392b3 = adInstance.m13392b();
                kotlin.jvm.internal.OooOo.OooO0OO(interfaceC3299kpM13392b3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((C3427mp) interfaceC3299kpM13392b3).onBannerLoadFail(string);
            }
        }
    }
}

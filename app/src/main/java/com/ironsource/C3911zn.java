package com.ironsource;

import android.app.Activity;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.zn */
/* loaded from: classes2.dex */
public final class C3911zn extends AbstractC3887z implements NativeAdListener {

    /* renamed from: w */
    private AdapterNativeAdData f13028w;

    /* renamed from: x */
    private AdapterNativeAdViewBinder f13029x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3911zn(C3719u2 adTools, C2626a0 instanceData, C3135g0 adInstancePayload, InterfaceC3025d0 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(instanceData, "instanceData");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
    }

    /* renamed from: H */
    public final AdapterNativeAdData m13415H() {
        return this.f13028w;
    }

    /* renamed from: I */
    public final AdapterNativeAdViewBinder m13416I() {
        return this.f13029x;
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: a */
    public void mo9321a(InterfaceC3205i0 adInstancePresenter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo7828a(this);
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: b */
    public void mo13025b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13277p());
        if (m13269g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (m13269g() instanceof AdapterNativeAdInterface) {
                Object objM13269g = m13269g();
                kotlin.jvm.internal.OooOo.OooO0OO(objM13269g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) objM13269g).destroyAd(m13271i());
            } else {
                ironLog.error(m13262a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("destroyNativeAd - exception = ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m13262a(string));
            m13268f().m9970e().m7911h().m9918g(string);
        }
        super.mo13025b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.OooOo.OooO0o0(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAdViewBinder, "nativeAdViewBinder");
        this.f13028w = adapterNativeAdData;
        this.f13029x = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: z */
    public void mo9323z() {
        if (!(m13269g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(m13262a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData adDataM13271i = m13271i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(m13262a("activity must not be null"));
            m13268f().m9970e().m7911h().m9918g("activity must not be null");
            return;
        }
        Object objM13269g = m13269g();
        kotlin.jvm.internal.OooOo.OooO0OO(objM13269g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        kotlin.jvm.internal.OooOo.OooO0Oo(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) objM13269g).loadAd(adDataM13271i, currentActiveActivity, this);
    }

    /* renamed from: a */
    public final void m13417a(C3670sn nativeAdBinder) {
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.m12292a(this.f13028w);
        nativeAdBinder.m12293a(this.f13029x);
    }
}

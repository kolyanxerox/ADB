package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.ironsource.x5 */
/* loaded from: classes2.dex */
public final class C3825x5 extends AbstractC3887z implements BannerAdListener {

    /* renamed from: w */
    private WeakReference<InterfaceC3893z5> f12572w;

    /* renamed from: x */
    private View f12573x;

    /* renamed from: y */
    private FrameLayout.LayoutParams f12574y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3825x5(C3719u2 adTools, C2626a0 instanceData, C3135g0 adInstancePayload, InterfaceC3893z5 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(instanceData, "instanceData");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f12572w = new WeakReference<>(listener);
    }

    /* renamed from: H */
    private final ISBannerSize m13013H() {
        C3719u2 c3719u2M13268f = m13268f();
        AbstractC3718u1 abstractC3718u1M4748i = m13275m().m4748i();
        kotlin.jvm.internal.OooOo.OooO0OO(abstractC3718u1M4748i, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return c3719u2M13268f.m9957a(((C3354m6) abstractC3718u1M4748i).mo9364b().m9442h());
    }

    /* renamed from: I */
    private final void m13014I() {
        Placement placementM13272j = m13272j();
        if (placementM13272j != null) {
            m13268f().m9970e().m7902a().m9949f(placementM13272j.getPlacementName());
        }
        InterfaceC3893z5 interfaceC3893z5 = this.f12572w.get();
        if (interfaceC3893z5 != null) {
            interfaceC3893z5.mo9744a(this);
        }
    }

    /* renamed from: J */
    private final void m13015J() {
        Placement placementM13272j = m13272j();
        if (placementM13272j != null) {
            m13268f().m9970e().m7902a().m9946c(placementM13272j.getPlacementName());
        }
        InterfaceC3893z5 interfaceC3893z5 = this.f12572w.get();
        if (interfaceC3893z5 != null) {
            interfaceC3893z5.mo9745b(this);
        }
    }

    /* renamed from: K */
    private final void m13016K() {
        Placement placementM13272j = m13272j();
        if (placementM13272j != null) {
            m13268f().m9970e().m7902a().m9951h(placementM13272j.getPlacementName());
        }
        InterfaceC3893z5 interfaceC3893z5 = this.f12572w.get();
        if (interfaceC3893z5 != null) {
            interfaceC3893z5.mo9746c(this);
        }
    }

    /* renamed from: c */
    public static final void m13021c(C3825x5 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m13015J();
    }

    /* renamed from: d */
    public static final void m13022d(C3825x5 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m13016K();
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: a */
    public void mo9321a(InterfaceC3205i0 adInstancePresenter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo7877a(this);
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: b */
    public void mo13025b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13277p());
        C3842xm.m13080a(m13268f(), new o000OO(this, 0), 0L, 2, (Object) null);
        if (m13269g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (m13269g() instanceof AdapterBannerInterface) {
                Object objM13269g = m13269g();
                kotlin.jvm.internal.OooOo.OooO0OO(objM13269g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) objM13269g).destroyAd(m13271i());
            } else {
                ironLog.error(m13262a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("destroyBanner - exception = ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m13262a(string));
            m13268f().m9970e().m7911h().m9918g(string);
        }
        super.mo13025b();
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: e */
    public LevelPlayAdInfo mo13026e() {
        String string = m13275m().m4748i().mo9364b().m8436b().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strM8437c = m13275m().m4748i().mo9364b().m8437c();
        String string2 = m13275m().m4747h().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string2, "instanceData.adFormat.toString()");
        ImpressionData impressionDataM9983a = m13275m().m4753n().m9983a(m13273k());
        C3013cn c3013cnM9987d = m13275m().m4753n().m9987d();
        AbstractC3718u1 abstractC3718u1M4748i = m13275m().m4748i();
        kotlin.jvm.internal.OooOo.OooO0OO(abstractC3718u1M4748i, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strM8437c, string2, impressionDataM9983a, c3013cnM9987d, ((C3354m6) abstractC3718u1M4748i).mo9364b().m9442h(), null, 64, null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        m13265a(new o000OO(this, 3));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View adView, FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(adView, "adView");
        kotlin.jvm.internal.OooOo.OooO0o0(frameLayoutParams, "frameLayoutParams");
        C3842xm.m13080a(m13268f(), new o0000O0O(this, adView, frameLayoutParams, 0), 0L, 2, (Object) null);
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        m13265a(new o000OO(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        m13265a(new o000OO(this, 4));
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: z */
    public void mo9323z() {
        if (!(m13269g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(m13262a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData adDataM13271i = m13271i();
        ISBannerSize iSBannerSizeM13013H = m13013H();
        Map<String, Object> adUnitData = adDataM13271i.getAdUnitData();
        kotlin.jvm.internal.OooOo.OooO0Oo(adUnitData, "adData.adUnitData");
        adUnitData.put("bannerLayout", new IronSourceBannerLayout(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeM13013H));
        Object objM13269g = m13269g();
        kotlin.jvm.internal.OooOo.OooO0OO(objM13269g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) objM13269g).loadAd(adDataM13271i, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeM13013H, this);
    }

    /* renamed from: a */
    public static final void m13017a(C3825x5 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f12573x = null;
        this$0.f12574y = null;
    }

    /* renamed from: e */
    public static final void m13023e(C3825x5 this$0) {
        String placementName;
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        C3348m0 c3348m0M7902a = this$0.m13268f().m9970e().m7902a();
        Placement placementM13272j = this$0.m13272j();
        if (placementM13272j == null || (placementName = placementM13272j.getPlacementName()) == null) {
            placementName = "";
        }
        c3348m0M7902a.m9953j(placementName);
    }

    /* renamed from: a */
    public static final void m13018a(C3825x5 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adView, "$adView");
        kotlin.jvm.internal.OooOo.OooO0o0(frameLayoutParams, "$frameLayoutParams");
        this$0.f12573x = adView;
        this$0.f12574y = frameLayoutParams;
    }

    /* renamed from: a */
    public static final void m13019a(C3825x5 this$0, InterfaceC3852xw viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(viewBinder, "$viewBinder");
        View view = this$0.f12573x;
        if (view == null || (layoutParams = this$0.f12574y) == null) {
            return;
        }
        viewBinder.mo12846a(view, layoutParams, this$0.m13268f());
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this$0.m13268f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.m13268f().m13101d(new o000OO(this$0, 1));
    }

    /* renamed from: a */
    public final void m13024a(InterfaceC3852xw viewBinder) {
        kotlin.jvm.internal.OooOo.OooO0o0(viewBinder, "viewBinder");
        C3842xm.m13080a(m13268f(), new o00000O(4, this, viewBinder), 0L, 2, (Object) null);
    }

    /* renamed from: b */
    public static final void m13020b(C3825x5 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m13014I();
    }
}

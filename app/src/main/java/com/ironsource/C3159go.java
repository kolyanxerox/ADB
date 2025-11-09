package com.ironsource;

import android.app.Activity;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.AbstractC3619s7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.ironsource.go */
/* loaded from: classes2.dex */
public final class C3159go extends AbstractC3619s7<InterfaceC3509p2> implements NativeAdListener, InterfaceC2957b2 {

    /* renamed from: r */
    private AdapterNativeAdData f8751r;

    /* renamed from: s */
    private AdapterNativeAdViewBinder f8752s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3159go(InterfaceC3778vq threadInterface, C3275k1 adSmashData, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, Placement placement, C3353m5 item, InterfaceC3509p2 interfaceC3509p2) {
        super(threadInterface, adSmashData, baseAdAdapter, new C2629a3(adSmashData.m9568g(), adSmashData.m9568g().getNativeAdSettings(), IronSource.AD_UNIT.NATIVE_AD), item, interfaceC3509p2);
        kotlin.jvm.internal.OooOo.OooO0o0(threadInterface, "threadInterface");
        kotlin.jvm.internal.OooOo.OooO0o0(adSmashData, "adSmashData");
        kotlin.jvm.internal.OooOo.OooO0o0(item, "item");
        this.f11313g = placement;
    }

    /* renamed from: J */
    private final void m8993J() {
        C3345lw c3345lw;
        IronLog.INTERNAL.verbose(m11865d());
        if (m11883y()) {
            super.onAdOpened();
            return;
        }
        if (this.f11311e != AbstractC3619s7.h.FAILED) {
            String str = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{m11872k(), this.f11311e}, 2));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 == null || (c3345lw = c2992c2.f7688j) == null) {
                return;
            }
            c3345lw.m9928q(str);
        }
    }

    @Override // com.ironsource.AbstractC3619s7
    /* renamed from: G */
    public void mo8997G() {
        C3345lw c3345lw;
        if (!(this.f11309c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(m11861a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(m11861a("activity must not be null"));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 == null || (c3345lw = c2992c2.f7688j) == null) {
                return;
            }
            c3345lw.m9918g("activity must not be null");
            return;
        }
        Object obj = this.f11309c;
        kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.f11317k;
        kotlin.jvm.internal.OooOo.OooO0Oo(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        kotlin.jvm.internal.OooOo.OooO0Oo(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    /* renamed from: P */
    public final void m8998P() {
        C3345lw c3345lw;
        C2978bn c2978bn;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11872k());
        m11862a(AbstractC3619s7.h.NONE);
        Object obj = this.f11309c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                AdData mCurrentAdData = this.f11317k;
                kotlin.jvm.internal.OooOo.OooO0Oo(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(m11861a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("destroyNativeAd - exception = ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m11861a(string));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 != null && (c3345lw = c2992c2.f7688j) != null) {
                c3345lw.m9918g(string);
            }
        }
        C2992c2 c2992c22 = this.f11310d;
        if (c2992c22 == null || (c2978bn = c2992c22.f7684f) == null) {
            return;
        }
        Integer sessionDepth = m11878r();
        kotlin.jvm.internal.OooOo.OooO0Oo(sessionDepth, "sessionDepth");
        c2978bn.m7941a(sessionDepth.intValue());
    }

    /* renamed from: Q */
    public final AdapterNativeAdData m8999Q() {
        return this.f8751r;
    }

    /* renamed from: R */
    public final AdapterNativeAdViewBinder m9000R() {
        return this.f8752s;
    }

    @Override // com.ironsource.AbstractC3619s7, com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 event) {
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        Map<String, Object> data = super.mo4765a(event);
        if (this.f11313g != null) {
            kotlin.jvm.internal.OooOo.OooO0Oo(data, "data");
            data.put("placement", m11871j());
        }
        kotlin.jvm.internal.OooOo.OooO0Oo(data, "data");
        return data;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.OooOo.OooO0o0(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAdViewBinder, "nativeAdViewBinder");
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new androidx.webkit.OooO00o(this, adapterNativeAdData, nativeAdViewBinder, 23));
        } else {
            m8996a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC3619s7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new OooO0o(this, 5));
        } else {
            m8993J();
        }
    }

    /* renamed from: a */
    public static final void m8994a(C3159go this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m8993J();
    }

    /* renamed from: a */
    public static final void m8995a(C3159go this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adapterNativeAdData, "$adapterNativeAdData");
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.m8996a(adapterNativeAdData, nativeAdViewBinder);
    }

    /* renamed from: a */
    private final void m8996a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f8751r = adapterNativeAdData;
        this.f8752s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }
}

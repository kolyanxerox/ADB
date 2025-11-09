package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.AbstractC3619s7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Map;

/* renamed from: com.ironsource.k6 */
/* loaded from: classes2.dex */
public class C3280k6 extends AbstractC3619s7<InterfaceC3543q1> implements BannerAdListener, InterfaceC2957b2 {

    /* renamed from: t */
    public static final String f9240t = "bannerLayout";

    /* renamed from: u */
    public static final String f9241u = "bannerSize";

    /* renamed from: r */
    private final IronSourceBannerLayout f9242r;

    /* renamed from: s */
    private final boolean f9243s;

    /* renamed from: com.ironsource.k6$a */
    public class a extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ View f9244a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f9245b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f9244a = view;
            this.f9245b = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            C3280k6.this.m9645a(this.f9244a, this.f9245b);
        }
    }

    /* renamed from: com.ironsource.k6$b */
    public class b extends AbstractRunnableC3302ks {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            C3280k6.this.m9644J();
        }
    }

    public C3280k6(InterfaceC3778vq interfaceC3778vq, C3275k1 c3275k1, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, IronSourceBannerLayout ironSourceBannerLayout, Placement placement, boolean z, C3353m5 c3353m5, InterfaceC3543q1 interfaceC3543q1) {
        super(interfaceC3778vq, c3275k1, baseAdAdapter, new C2629a3(c3275k1.m9568g(), c3275k1.m9568g().getBannerSettings(), IronSource.AD_UNIT.BANNER), c3353m5, interfaceC3543q1);
        this.f9242r = ironSourceBannerLayout;
        this.f11313g = placement;
        this.f9243s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m9644J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11865d());
        if (m11883y()) {
            super.onAdOpened();
            return;
        }
        if (this.f11311e == AbstractC3619s7.h.FAILED) {
            return;
        }
        ironLog.error("unexpected onAdOpened for " + m11872k() + ", state - " + this.f11311e);
        if (this.f11310d != null) {
            this.f11310d.f7688j.m9928q("unexpected onAdOpened, state - " + this.f11311e);
        }
    }

    @Override // com.ironsource.AbstractC3619s7
    /* renamed from: G */
    public void mo8997G() {
        Object obj = this.f11309c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.f11317k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f9242r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(m11861a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC3619s7
    /* renamed from: O */
    public boolean mo9648O() {
        return false;
    }

    /* renamed from: P */
    public void m9649P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11872k());
        m11862a(AbstractC3619s7.h.NONE);
        Object obj = this.f11309c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.f11317k);
            } else {
                ironLog.error(m11861a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("destroyBanner - exception = ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            sbOooOOO.append(" state = ");
            sbOooOOO.append(this.f11311e);
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m11861a(string));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 != null) {
                c2992c2.f7688j.m9918g(string);
            }
        }
        C2992c2 c2992c22 = this.f11310d;
        if (c2992c22 != null) {
            c2992c22.f7684f.m7941a(m11878r().intValue());
        }
    }

    /* renamed from: Q */
    public void m9650Q() {
        Object obj = this.f11309c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.f11317k);
        }
    }

    /* renamed from: R */
    public void m9651R() {
        Object obj = this.f11309c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.f11317k);
        }
    }

    @Override // com.ironsource.AbstractC3619s7
    /* renamed from: a */
    public AdData mo9652a(String str, Map<String, Object> map) {
        return new AdData(str, m11877q(), mo9653a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        C2992c2 c2992c2;
        Placement placement = this.f11313g;
        if (placement != null && (c2992c2 = this.f11310d) != null) {
            c2992c2.f7687i.m9949f(placement.getPlacementName());
        }
        Listener listener = this.f11308b;
        if (listener != 0) {
            ((InterfaceC3543q1) listener).mo8907d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new a(view, layoutParams));
        } else {
            m9645a(view, layoutParams);
        }
    }

    @Override // com.ironsource.AbstractC3619s7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new b());
        } else {
            m9644J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        C2992c2 c2992c2;
        Placement placement = this.f11313g;
        if (placement != null && (c2992c2 = this.f11310d) != null) {
            c2992c2.f7687i.m9946c(placement.getPlacementName());
        }
        Listener listener = this.f11308b;
        if (listener != 0) {
            ((InterfaceC3543q1) listener).mo8906c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        C2992c2 c2992c2;
        Placement placement = this.f11313g;
        if (placement != null && (c2992c2 = this.f11310d) != null) {
            c2992c2.f7687i.m9951h(placement.getPlacementName());
        }
        Listener listener = this.f11308b;
        if (listener != 0) {
            ((InterfaceC3543q1) listener).mo8900a(this);
        }
    }

    @Override // com.ironsource.AbstractC3619s7
    /* renamed from: v */
    public boolean mo9654v() {
        return this.f9243s;
    }

    @Override // com.ironsource.AbstractC3619s7, com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 enumC3889z1) {
        Map<String, Object> mapMo4765a = super.mo4765a(enumC3889z1);
        IronSourceBannerLayout ironSourceBannerLayout = this.f9242r;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            C3395l.m10365a(mapMo4765a, this.f9242r.getSize());
        }
        if (this.f11313g != null) {
            mapMo4765a.put("placement", m11871j());
        }
        return mapMo4765a;
    }

    @Override // com.ironsource.AbstractC3619s7
    /* renamed from: a */
    public Map<String, Object> mo9653a(Map<String, Object> map) {
        Map<String, Object> mapMo9653a = super.mo9653a(map);
        C3275k1 c3275k1 = this.f11307a;
        if (c3275k1 != null && this.f9242r != null && TextUtils.isEmpty(c3275k1.m9568g().getCustomNetwork())) {
            mapMo9653a.put("bannerLayout", this.f9242r);
        }
        return mapMo9653a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9645a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!m11883y() || (listener = this.f11308b) == 0) {
            return;
        }
        ((InterfaceC3543q1) listener).mo8901a(this, view, layoutParams);
    }
}

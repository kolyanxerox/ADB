package com.ironsource;

import com.ironsource.InterfaceC3684t2;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.r7 */
/* loaded from: classes2.dex */
public class C3584r7<Listener extends InterfaceC3684t2> extends AbstractC3479o7<Listener> implements AdapterAdRewardListener {

    /* renamed from: r */
    private C3216ib f11177r;

    /* renamed from: com.ironsource.r7$a */
    public class a extends AbstractRunnableC3302ks {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            C3584r7.this.m11709U();
        }
    }

    public C3584r7(InterfaceC3778vq interfaceC3778vq, C3275k1 c3275k1, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C2629a3 c2629a3, C3353m5 c3353m5, Listener listener) {
        super(interfaceC3778vq, c3275k1, baseAdAdapter, c2629a3, c3353m5, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m11709U() {
        if (this.f11313g == null) {
            IronLog.INTERNAL.verbose(m11861a("placement is null "));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 != null) {
                c2992c2.f7688j.m9918g("mCurrentPlacement is null state = " + this.f11311e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(m11861a("placement name = " + m11871j()));
        if (this.f11310d != null) {
            HashMap map = new HashMap();
            if (C3404p.m10470j().m10561p() != null) {
                for (String str : C3404p.m10470j().m10561p().keySet()) {
                    map.put(OooO0oO.OooOo.OooOO0("custom_", str), C3404p.m10470j().m10561p().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f11310d.f7687i.m9941a(m11871j(), this.f11313g.getRewardName(), this.f11313g.getRewardAmount(), jCurrentTimeMillis, IronSourceUtils.getTransId(jCurrentTimeMillis, mo9129c()), C3216ib.m9304a(this.f11177r), map, C3404p.m10470j().m10552i());
        }
        ((InterfaceC3684t2) this.f11308b).mo11506a((C3584r7<?>) this, this.f11313g);
    }

    @Override // com.ironsource.AbstractC3479o7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f11177r = new C3216ib();
        super.onAdClosed();
    }

    @Override // com.ironsource.AbstractC3619s7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f11177r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new a());
        } else {
            m11709U();
        }
    }
}

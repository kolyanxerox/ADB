package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* renamed from: com.ironsource.rj */
/* loaded from: classes2.dex */
public class C3596rj extends AbstractC3479o7<InterfaceC3172h2> implements InterstitialAdListener {
    public C3596rj(InterfaceC3778vq interfaceC3778vq, C3275k1 c3275k1, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, C3353m5 c3353m5, InterfaceC3172h2 interfaceC3172h2) {
        super(interfaceC3778vq, c3275k1, baseAdAdapter, new C2629a3(c3275k1.m9568g(), c3275k1.m9568g().getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), c3353m5, interfaceC3172h2);
    }
}

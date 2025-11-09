package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.pj */
/* loaded from: classes2.dex */
public class C3526pj extends AbstractC3444n7<C3596rj, AdapterAdInteractionListener> {
    public C3526pj(InterfaceC3116fg interfaceC3116fg, InterfaceC3076eg interfaceC3076eg, List<NetworkSettings> list, C3736uj c3736uj, String str, C3840xk c3840xk, IronSourceSegment ironSourceSegment) {
        super(interfaceC3116fg, interfaceC3076eg, new C3561qj(str, list, c3736uj), c3840xk, ironSourceSegment);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC3619s7 mo8191a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str, C3353m5 c3353m5) {
        return m11414b(networkSettings, (BaseAdAdapter<?, AdapterAdInteractionListener>) baseAdAdapter, i, str, c3353m5);
    }

    /* renamed from: b */
    public C3596rj m11414b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i, String str, C3353m5 c3353m5) {
        return new C3596rj(this, new C3275k1(IronSource.AD_UNIT.INTERSTITIAL, this.f10782o.mo8380o(), i, this.f10774g, str, this.f10772e, this.f10773f, networkSettings, this.f10782o.m12345n()), baseAdAdapter, c3353m5, this);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: g */
    public AbstractC3241j2 mo8198g() {
        return new C3873yj();
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: l */
    public String mo8199l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: o */
    public String mo8200o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }

    public C3526pj(List<NetworkSettings> list, C3736uj c3736uj, String str, C3840xk c3840xk, IronSourceSegment ironSourceSegment) {
        super(new C3561qj(str, list, c3736uj), c3840xk, ironSourceSegment);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: b */
    public JSONObject mo8197b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }
}

package com.ironsource;

import com.ironsource.C3350m2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.yr */
/* loaded from: classes2.dex */
public class C3881yr extends AbstractC3549q7<C3915zr> {
    public C3881yr(List<NetworkSettings> list, C2983bs c2983bs, String str, boolean z, C3840xk c3840xk, IronSourceSegment ironSourceSegment) {
        super(new C3813wr(str, list, c2983bs, z), c3840xk, ironSourceSegment);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public LoadWhileShowSupportState mo8894a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getLoadWhileShowSupportedState(networkSettings);
    }

    /* renamed from: b */
    public C3915zr m13218b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i, String str, C3353m5 c3353m5) {
        return new C3915zr(this, new C3275k1(IronSource.AD_UNIT.REWARDED_VIDEO, this.f10782o.mo8380o(), i, this.f10774g, str, this.f10772e, this.f10773f, networkSettings, this.f10782o.m12345n()), baseAdAdapter, c3353m5, this);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: g */
    public AbstractC3241j2 mo8198g() {
        return new C3093es();
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: l */
    public String mo8199l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: o */
    public String mo8200o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: q */
    public boolean mo11358q() {
        return this.f10782o.m12340h().m9974a() == C3350m2.a.MANUAL;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: t */
    public boolean mo11359t() {
        return this.f10782o.m12340h().m9974a() == C3350m2.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC3619s7 mo8191a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str, C3353m5 c3353m5) {
        return m13218b(networkSettings, (BaseAdAdapter<?, AdapterAdRewardListener>) baseAdAdapter, i, str, c3353m5);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: b */
    public JSONObject mo8197b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public void mo8193a(IronSourceError ironSourceError) {
        C3350m2.a aVarM9974a = this.f10782o.m12340h().m9974a();
        if (aVarM9974a == C3350m2.a.AUTOMATIC_LOAD_AFTER_CLOSE || aVarM9974a == C3350m2.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f10787t.mo8553a(false, (AdInfo) null);
        } else {
            super.mo8193a(ironSourceError);
        }
    }
}

package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.AbstractC3514p7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.co */
/* loaded from: classes2.dex */
public final class C3014co extends AbstractC3514p7<C3159go, AdapterAdListener> implements InterfaceC3509p2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3014co(List<? extends NetworkSettings> list, C3705tn configs, String str, C3840xk publisherDataHolder, IronSourceSegment ironSourceSegment) {
        super(new C3049do(str, list, configs), publisherDataHolder, ironSourceSegment);
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: G */
    public void mo8188G() {
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: H */
    public boolean mo8189H() {
        return false;
    }

    /* renamed from: M */
    public final void m8190M() {
        C3345lw c3345lw;
        C2978bn c2978bn;
        IronLog.INTERNAL.verbose();
        try {
            C3159go c3159go = (C3159go) this.f10768a.m9725d();
            if (c3159go != null) {
                Integer numM11878r = c3159go.m11878r();
                int iMo9344a = numM11878r == null ? this.f10760C.mo9344a(this.f10782o.m12333b()) : numM11878r.intValue();
                C2992c2 c2992c2 = this.f10786s;
                if (c2992c2 != null && (c2978bn = c2992c2.f7684f) != null) {
                    c2978bn.m7941a(iMo9344a);
                }
                c3159go.m8998P();
                this.f10768a.m9719a(null);
                this.f10768a.m9723b(null);
            }
            this.f10776i = null;
            m11345a(AbstractC3514p7.f.NONE);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("destroyNativeAd - exception = ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m11349b(string));
            C2992c2 c2992c22 = this.f10786s;
            if (c2992c22 == null || (c3345lw = c2992c22.f7688j) == null) {
                return;
            }
            c3345lw.m9918g(string);
        }
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC3619s7 mo8191a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str, C3353m5 c3353m5) {
        return m8196b(networkSettings, (BaseAdAdapter<?, AdapterAdListener>) baseAdAdapter, i, str, c3353m5);
    }

    /* renamed from: b */
    public C3159go m8196b(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int i, String currentAuctionId, C3353m5 item) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(adapter, "adapter");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAuctionId, "currentAuctionId");
        kotlin.jvm.internal.OooOo.OooO0o0(item, "item");
        return new C3159go(this, new C3275k1(IronSource.AD_UNIT.NATIVE_AD, this.f10782o.mo8380o(), i, this.f10774g, currentAuctionId, this.f10772e, this.f10773f, providerSettings, this.f10782o.m12345n()), adapter, this.f10776i, item, this);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: g */
    public AbstractC3241j2 mo8198g() {
        return new C3250jb();
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: l */
    public String mo8199l() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: o */
    public String mo8200o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: v */
    public boolean mo8201v() {
        return false;
    }

    @Override // com.ironsource.AbstractC3514p7, com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 event) {
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        Map<String, Object> data = super.mo4765a(event);
        Placement placement = this.f10776i;
        if (placement != null) {
            kotlin.jvm.internal.OooOo.OooO0Oo(data, "data");
            data.put("placement", placement.getPlacementName());
        }
        UUID uuid = this.f10790w;
        if (uuid != null) {
            kotlin.jvm.internal.OooOo.OooO0Oo(data, "data");
            data.put("objectId", uuid);
        }
        kotlin.jvm.internal.OooOo.OooO0Oo(data, "data");
        return data;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: b */
    public JSONObject mo8197b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.OooOo.OooO0Oo(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    /* renamed from: a */
    public final void m8192a(InternalNativeAdListener nativeAdListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAdListener, "nativeAdListener");
        m11342a(new C2979bo(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public void mo8193a(IronSourceError ironSourceError) {
        this.f10787t.mo7954a(ironSourceError);
    }

    /* renamed from: a */
    public final void m8194a(Placement placement) {
        String str;
        int iM13115b;
        IronLog.INTERNAL.verbose("placement = " + placement);
        if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{placement == null ? "placement is null" : "placement name is empty"}, 1));
            iM13115b = C3855y1.m13115b(this.f10782o.m12333b());
        } else if (this.f10762E.mo9483b(ContextProvider.getInstance().getApplicationContext(), placement, this.f10782o.m12333b())) {
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{placement.getPlacementName()}, 1));
            iM13115b = C3855y1.m13119f(this.f10782o.m12333b());
        } else {
            str = null;
            iM13115b = 510;
        }
        if (TextUtils.isEmpty(str)) {
            this.f10776i = placement;
            m11336A();
        } else {
            IronLog.API.error(m11349b(str));
            mo8896a(iM13115b, str, false);
        }
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public void mo8195a(AbstractC3619s7<?> abstractC3619s7, AdInfo adInfo) {
        if (abstractC3619s7 instanceof C3159go) {
            C3159go c3159go = (C3159go) abstractC3619s7;
            this.f10787t.mo7953a(c3159go.m8999Q(), c3159go.m9000R(), adInfo);
        }
    }
}

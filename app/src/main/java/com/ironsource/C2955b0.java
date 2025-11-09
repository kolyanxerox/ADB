package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.ironsource.b0 */
/* loaded from: classes2.dex */
public final class C2955b0 implements InterfaceC2957b2 {

    /* renamed from: a */
    private final C3719u2 f7571a;

    /* renamed from: b */
    private final C2626a0 f7572b;

    /* renamed from: c */
    private final BaseAdAdapter<?, ?> f7573c;

    public C2955b0(C3719u2 adTools, C2626a0 instanceData, BaseAdAdapter<?, ?> baseAdAdapter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(instanceData, "instanceData");
        this.f7571a = adTools;
        this.f7572b = instanceData;
        this.f7573c = baseAdAdapter;
    }

    @Override // com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 event) throws JSONException {
        String adapterVersion;
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f7573c;
            String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                kotlin.jvm.internal.OooOo.OooO0O0(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            kotlin.jvm.internal.OooOo.OooO0Oo(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f7573c;
            if (baseAdAdapter2 != null) {
                AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                kotlin.jvm.internal.OooOo.OooO0O0(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            kotlin.jvm.internal.OooOo.OooO0O0(networkSDKVersion);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "could not get adapter version for event data ");
            sbOooOOO0.append(this.f7572b.m4762w());
            IronLog.INTERNAL.error(C3349m1.m9956a(this.f7571a, sbOooOOO0.toString(), (String) null, 2, (Object) null));
        }
        String strM4774i = this.f7572b.m4749j().m4774i();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM4774i, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strM4774i);
        String strM4766a = this.f7572b.m4749j().m4766a();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM4766a, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(IronSourceConstants.EVENTS_PROVIDER, strM4766a);
        map.put("instanceType", Integer.valueOf(this.f7572b.m4758s()));
        String serverData = this.f7572b.m4753n().m9994k();
        C3719u2 c3719u2 = this.f7571a;
        kotlin.jvm.internal.OooOo.OooO0Oo(serverData, "serverData");
        String strM12532e = c3719u2.m12532e(serverData);
        if (!TextUtils.isEmpty(strM12532e)) {
            map.put("dynamicDemandSource", strM12532e);
        }
        map.put("sessionDepth", Integer.valueOf(this.f7572b.m4761v()));
        if (!TextUtils.isEmpty(this.f7572b.m4760u().getCustomNetwork())) {
            String customNetwork = this.f7572b.m4760u().getCustomNetwork();
            kotlin.jvm.internal.OooOo.OooO0Oo(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}

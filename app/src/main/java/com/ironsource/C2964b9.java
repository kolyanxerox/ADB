package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.b9 */
/* loaded from: classes2.dex */
public final class C2964b9 {

    /* renamed from: a */
    private Boolean f7580a;

    /* renamed from: b */
    private final InterfaceC3767vf f7581b = C3495on.f10667s.m11213d().mo8686f();

    /* renamed from: a */
    public final Boolean m7889a() {
        return this.f7580a;
    }

    /* renamed from: b */
    public final InterfaceC3767vf m7896b() {
        return this.f7581b;
    }

    /* renamed from: a */
    private final Boolean m7887a(NetworkSettings networkSettings) {
        return (networkSettings == null || networkSettings.isCustomNetwork()) ? this.f7580a : networkSettings.getApplicationSettings().has(C2999c9.f7729a) ? Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(C2999c9.f7729a)) : this.f7580a;
    }

    /* renamed from: a */
    public final void m7891a(int i, ConcurrentHashMap<String, NetworkSettings> providerSettings) {
        JSONObject applicationSettings;
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        String strMo4830K = this.f7581b.mo4830K(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + strMo4830K);
        ironLog.general("CMP ID: " + i);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> collectionValues = providerSettings.values();
        kotlin.jvm.internal.OooOo.OooO0Oo(collectionValues, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !kotlin.jvm.internal.OooOo.OooO00o(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(C2999c9.f7729a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            NetworkSettings networkSettings2 = (NetworkSettings) obj3;
            IronLog ironLog2 = IronLog.API;
            StringBuilder sb = new StringBuilder();
            sb.append(networkSettings2.getProviderDefaultInstance());
            sb.append(": ");
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            sb.append(applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(C2999c9.f7729a)) : null);
            ironLog2.general(sb.toString());
        }
    }

    /* renamed from: a */
    public final void m7892a(AbstractAdapter adapter, NetworkSettings networkSettings) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(adapter, "adapter");
        try {
            Boolean boolM7887a = m7887a(networkSettings);
            if (boolM7887a != null) {
                adapter.setNewConsent(boolM7887a.booleanValue());
            }
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("error while setting consent of ", th);
            sbOooOOO.append(adapter.getProviderName());
            sbOooOOO.append(": ");
            sbOooOOO.append(th.getLocalizedMessage());
            String string = sbOooOOO.toString();
            m7888a(string);
            IronLog.INTERNAL.error(string);
        }
    }

    /* renamed from: a */
    public final void m7893a(AdapterBaseInterface adapter, NetworkSettings networkSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(adapter, "adapter");
        try {
            Boolean boolM7887a = m7887a(networkSettings);
            if (boolM7887a == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(boolM7887a.booleanValue());
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("error while setting consent of ", th);
            sbOooOOO.append(networkSettings != null ? networkSettings.getProviderName() : null);
            sbOooOOO.append(": ");
            sbOooOOO.append(th.getLocalizedMessage());
            String string = sbOooOOO.toString();
            m7888a(string);
            IronLog.INTERNAL.error(string);
        }
    }

    /* renamed from: a */
    private final void m7888a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            C3805wj.m12898i().mo12605a(new C3899zb(EnumC2638ac.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    public final void m7894a(ConcurrentHashMap<String, AbstractAdapter> adapters, ConcurrentHashMap<String, AdapterBaseWrapper> networkAdapters) throws JSONException {
        oo00o.OooOo oooOo;
        kotlin.jvm.internal.OooOo.OooO0o0(adapters, "adapters");
        kotlin.jvm.internal.OooOo.OooO0o0(networkAdapters, "networkAdapters");
        for (AbstractAdapter adapter : adapters.values()) {
            kotlin.jvm.internal.OooOo.OooO0Oo(adapter, "adapter");
            m7892a(adapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                m7893a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                oooOo = oo00o.OooOo.f33195OooO00o;
            } else {
                oooOo = null;
            }
            if (oooOo == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    /* renamed from: a */
    public final void m7895a(boolean z) {
        this.f7580a = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void m7890a(int i) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, i + ';' + this.f7581b.mo4830K(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog ironLog = IronLog.INTERNAL;
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
            ironLog.error(string);
        }
        C3495on.f10667s.m11213d().mo8698z().mo12605a(new C3899zb(EnumC2638ac.CONSENT_TCF_CODE, mediationAdditionalData));
    }
}

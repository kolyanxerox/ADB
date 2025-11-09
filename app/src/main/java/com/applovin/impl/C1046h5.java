package com.applovin.impl;

import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1221l;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3451ne;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.h5 */
/* loaded from: classes.dex */
class C1046h5 extends AbstractRunnableC1036g5 {
    public C1046h5(C1220k c1220k) {
        super("TaskApiSubmitData", c1220k);
    }

    /* renamed from: b */
    private void m930b(JSONObject jSONObject) {
        C1221l c1221lM2827B = this.f776a.m2827B();
        Map mapM2999o = c1221lM2827B.m2999o();
        AbstractC1078k7.m1197a(C3451ne.f10417G, "type", mapM2999o);
        AbstractC1078k7.m1197a("api_level", "sdk_version", mapM2999o);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapM2999o));
        Map mapM2984E = c1221lM2827B.m2984E();
        AbstractC1078k7.m1197a("sdk_version", "applovin_sdk_version", mapM2984E);
        AbstractC1078k7.m1197a("ia", "installed_at", mapM2984E);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapM2984E));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1240o.m3200a()) {
            this.f778c.m3215d(this.f777b, "Submitting user data...");
        }
        Map mapM2299c = AbstractC1175r0.m2299c(this.f776a);
        JSONObject jSONObject = new JSONObject();
        m930b(jSONObject);
        if (((Boolean) this.f776a.m2866a(C1268v4.f2905u5)).booleanValue() || ((Boolean) this.f776a.m2866a(C1268v4.f2857o5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapM2299c);
            mapM2299c = null;
        }
        m928a(mapM2299c, jSONObject);
    }

    /* renamed from: com.applovin.impl.h5$a */
    public class a extends AbstractC1067j6 {
        public a(C1235a c1235a, C1220k c1220k) {
            super(c1235a, c1220k);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            C1046h5.this.m929a(jSONObject);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            AbstractC1175r0.m2288a(i, this.f776a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m929a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("results", jSONObject), 0, new JSONObject());
        this.f776a.m2914p0().m3609a(C1268v4.f2779f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f776a.m2914p0().m3609a(C1268v4.f2811j, JsonUtils.getString(jSONObject2, "device_token", ""));
        AbstractC1175r0.m2289a(jSONObject2, this.f776a);
    }

    /* renamed from: a */
    private void m928a(Map map, JSONObject jSONObject) {
        a aVar = new a(C1235a.m3072a(this.f776a).mo3103b(AbstractC1175r0.m2297b("2.0/device", this.f776a)).mo3097a(AbstractC1175r0.m2286a("2.0/device", this.f776a)).mo3104b(map).mo3099a(jSONObject).mo3107c("POST").mo3105b(((Boolean) this.f776a.m2866a(C1268v4.f2544B5)).booleanValue()).mo3096a((Object) new JSONObject()).mo3094a(((Integer) this.f776a.m2866a(C1268v4.f2717X2)).intValue()).mo3095a(AbstractC1188s4.a.m2392a(((Integer) this.f776a.m2866a(C1268v4.f2841m5)).intValue())).mo3101a(), this.f776a);
        aVar.m1097c(C1268v4.f2868q0);
        aVar.m1096b(C1268v4.f2876r0);
        this.f776a.m2918r0().m402a(aVar);
    }
}

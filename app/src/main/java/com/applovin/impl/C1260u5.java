package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.AbstractC1263v;
import com.applovin.impl.C1166q0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.u5 */
/* loaded from: classes.dex */
public class C1260u5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final C1166q0.e f2454g;

    public C1260u5(C1166q0.e eVar, C1220k c1220k) {
        super("TaskFetchMediationDebuggerInfo", c1220k, true);
        this.f2454g = eVar;
    }

    /* renamed from: e */
    public Map m3403e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f776a.m2866a(C1268v4.f2743a5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f776a.m2904j0());
        }
        Map mapM2984E = this.f776a.m2827B().m2984E();
        map.put(C3034d9.h.f8089V, String.valueOf(mapM2984E.get(C3034d9.h.f8089V)));
        map.put("app_version", String.valueOf(mapM2984E.get("app_version")));
        Map mapM2989L = this.f776a.m2827B().m2989L();
        map.put(C3451ne.f10417G, String.valueOf(mapM2989L.get(C3451ne.f10417G)));
        map.put(C3451ne.f10411E, String.valueOf(mapM2989L.get(C3451ne.f10411E)));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapM3403e = m3403e();
        JSONObject jSONObjectM3402a = m3402a(m791a());
        if (((Boolean) this.f776a.m2866a(C1268v4.f2881r5)).booleanValue() || ((Boolean) this.f776a.m2866a(C1268v4.f2857o5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectM3402a, (Map<String, ?>) mapM3403e);
            mapM3403e = null;
        }
        a aVar = new a(C1235a.m3072a(this.f776a).mo3107c("POST").mo3103b(AbstractC1054i3.m977i(this.f776a)).mo3097a(AbstractC1054i3.m976h(this.f776a)).mo3104b(mapM3403e).mo3099a(jSONObjectM3402a).mo3096a((Object) new JSONObject()).mo3106c(((Long) this.f776a.m2866a(AbstractC1144o3.f1647k7)).intValue()).mo3095a(AbstractC1188s4.a.m2392a(((Integer) this.f776a.m2866a(C1268v4.f2801h5)).intValue())).mo3101a(), this.f776a, m798d());
        aVar.m1097c(AbstractC1144o3.f1639g7);
        aVar.m1096b(AbstractC1144o3.f1641h7);
        this.f776a.m2918r0().m402a(aVar);
    }

    /* renamed from: com.applovin.impl.u5$a */
    public class a extends AbstractC1067j6 {
        public a(C1235a c1235a, C1220k c1220k, boolean z) {
            super(c1235a, c1220k, z);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            C1260u5.this.f2454g.mo933a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            C1260u5.this.f2454g.mo931a(str, i, str2, jSONObject);
        }
    }

    /* renamed from: a */
    private JSONObject m3402a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", AbstractC1249t3.m3325b(this.f776a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        AbstractC1263v.a aVarM2997f = this.f776a.m2827B().m2997f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarM2997f.m3418b().m3421b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarM2997f.m3413a());
        Map mapM2908l0 = this.f776a.m2908l0();
        if (!CollectionUtils.isEmpty(mapM2908l0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapM2908l0));
        }
        return jSONObject;
    }
}

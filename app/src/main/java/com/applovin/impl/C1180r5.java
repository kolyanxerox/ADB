package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.AbstractC1263v;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1221l;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.r5 */
/* loaded from: classes.dex */
public class C1180r5 extends AbstractRunnableC1036g5 {

    /* renamed from: j */
    private static final AtomicBoolean f1856j = new AtomicBoolean();

    /* renamed from: g */
    private final int f1857g;

    /* renamed from: h */
    private final Object f1858h;

    /* renamed from: i */
    private b f1859i;

    /* renamed from: com.applovin.impl.r5$b */
    public interface b {
        /* renamed from: a */
        void mo2345a(JSONObject jSONObject);
    }

    /* renamed from: com.applovin.impl.r5$c */
    public class c extends AbstractRunnableC1036g5 {
        public c(C1220k c1220k) {
            super("TaskTimeoutFetchBasicSettings", c1220k, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1180r5.this.f1859i != null) {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Timing out fetch basic settings...");
                }
                C1180r5.this.m2337a(new JSONObject());
            }
        }
    }

    public C1180r5(int i, C1220k c1220k, b bVar) {
        super("TaskFetchBasicSettings", c1220k, true);
        this.f1858h = new Object();
        this.f1857g = i;
        this.f1859i = bVar;
    }

    /* renamed from: b */
    private HashMap m2338b(String str) {
        return m2335a(str, 0L, 0, null, null);
    }

    /* renamed from: f */
    private String m2339f() {
        return AbstractC1175r0.m2287a((String) this.f776a.m2866a(C1268v4.f2844n0), "5.0/i", m795b());
    }

    /* renamed from: g */
    private String m2340g() {
        return AbstractC1175r0.m2287a((String) this.f776a.m2866a(C1268v4.f2836m0), "5.0/i", m795b());
    }

    /* renamed from: e */
    public JSONObject m2341e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            C1220k c1220k = this.f776a;
            C1268v4 c1268v4 = C1268v4.f2857o5;
            if (((Boolean) c1220k.m2866a(c1268v4)).booleanValue() || ((Boolean) this.f776a.m2866a(c1268v4)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", C1060j.m1024b());
            jSONObject.put("init_count", this.f1857g);
            jSONObject.put("server_installed_at", this.f776a.m2866a(C1268v4.f2851o));
            if (this.f776a.m2831D0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f776a.m2826A0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", AbstractC1078k7.m1225c(m791a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", AbstractC1078k7.m1248i(m791a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f776a.m2866a(C1268v4.f2598I3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f776a.m2857V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f776a.m2830D());
            jSONObject.put("installed_mediation_adapters", AbstractC1249t3.m3325b(this.f776a));
            Map mapM2984E = this.f776a.m2827B().m2984E();
            jSONObject.put(C3034d9.h.f8089V, mapM2984E.get(C3034d9.h.f8089V));
            jSONObject.put("app_version", mapM2984E.get("app_version"));
            jSONObject.put("debug", mapM2984E.get("debug"));
            jSONObject.put("tg", mapM2984E.get("tg"));
            jSONObject.put("target_sdk", mapM2984E.get("target_sdk"));
            jSONObject.put("session_id", mapM2984E.get("session_id"));
            List list = (List) mapM2984E.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapM2984E.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f776a.m2842K() != null ? this.f776a.m2842K().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put(AndroidTcfDataSource.TCF_TCSTRING_KEY, mapM2984E.get(AndroidTcfDataSource.TCF_TCSTRING_KEY));
            jSONObject.put("IABTCF_gdprApplies", mapM2984E.get("IABTCF_gdprApplies"));
            Object obj = mapM2984E.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f776a.m2931y().m3277b());
            Map mapM2989L = this.f776a.m2827B().m2989L();
            jSONObject.put(C3451ne.f10417G, mapM2989L.get(C3451ne.f10417G));
            jSONObject.put(C3451ne.f10411E, mapM2989L.get(C3451ne.f10411E));
            jSONObject.put("locale", mapM2989L.get("locale"));
            jSONObject.put("brand", mapM2989L.get("brand"));
            jSONObject.put("brand_name", mapM2989L.get("brand_name"));
            jSONObject.put("hardware", mapM2989L.get("hardware"));
            jSONObject.put(C3451ne.f10402B, mapM2989L.get(C3451ne.f10402B));
            jSONObject.put("revision", mapM2989L.get("revision"));
            jSONObject.put("is_tablet", mapM2989L.get("is_tablet"));
            jSONObject.put("screen_size_in", mapM2989L.get("screen_size_in"));
            jSONObject.put("supported_abis", mapM2989L.get("supported_abis"));
            Object obj2 = mapM2989L.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f776a.m2866a(C1268v4.f2686T3)).booleanValue()) {
                jSONObject.put("mtl", this.f776a.m2911n0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) C1220k.m2824o().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            AbstractC1263v.a aVarM2997f = this.f776a.m2827B().m2997f();
            jSONObject.put("dnt", aVarM2997f.m3419c());
            jSONObject.put("dnt_code", aVarM2997f.m3418b().m3421b());
            Boolean boolM2052b = AbstractC1150p0.m2048c().m2052b(m791a());
            if (((Boolean) this.f776a.m2866a(C1268v4.f2558D3)).booleanValue() && StringUtils.isValidString(aVarM2997f.m3413a()) && !Boolean.TRUE.equals(boolM2052b)) {
                jSONObject.put("idfa", aVarM2997f.m3413a());
            }
            C1221l.b bVarM2985F = this.f776a.m2827B().m2985F();
            if (((Boolean) this.f776a.m2866a(C1268v4.f2919w3)).booleanValue() && bVarM2985F != null && !Boolean.TRUE.equals(boolM2052b)) {
                jSONObject.put("idfv", bVarM2985F.f2195a);
                jSONObject.put("idfv_scope", bVarM2985F.f2196b);
            }
            if (((Boolean) this.f776a.m2866a(C1268v4.f2943z3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f776a.m2925v());
            }
            if (((Boolean) this.f776a.m2866a(C1268v4.f2542B3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f776a.m2902i0());
            }
            if (((Boolean) this.f776a.m2866a(C1268v4.f2574F3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f776a.m2919s());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f776a.m2834F());
            if (this.f776a.m2922t0().m493c()) {
                jSONObject.put("test_mode", true);
            }
            List listM492b = this.f776a.m2922t0().m492b();
            if (listM492b != null && !listM492b.isEmpty()) {
                jSONObject.put("test_mode_networks", listM492b);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f776a.m2912o0().getExtraParameters()));
            Map mapM2908l0 = this.f776a.m2908l0();
            if (!CollectionUtils.isEmpty(mapM2908l0)) {
                jSONObject.put("segments", new JSONObject(mapM2908l0));
            }
            if (this.f1857g > 1) {
                ArrayService arrayServiceM2913p = this.f776a.m2913p();
                if (arrayServiceM2913p.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", arrayServiceM2913p.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", arrayServiceM2913p.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceM2913p.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceM2913p.getAppHubPackageName()));
            }
        } catch (JSONException e) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Failed to create JSON body", e);
            }
            this.f776a.m2832E().m2148a(this.f777b, "createJSONBody", e);
        }
        return jSONObject;
    }

    /* renamed from: h */
    public Map m2342h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f776a.m2866a(C1268v4.f2865p5)).booleanValue() && !((Boolean) this.f776a.m2866a(C1268v4.f2857o5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f776a.m2866a(C1268v4.f2743a5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f776a.m2904j0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f776a.m2917r(), map);
        Boolean boolM2052b = AbstractC1150p0.m2046b().m2052b(m791a());
        if (boolM2052b != null) {
            map.put("huc", boolM2052b.toString());
        }
        Boolean boolM2052b2 = AbstractC1150p0.m2048c().m2052b(m791a());
        if (boolM2052b2 != null) {
            map.put("aru", boolM2052b2.toString());
        }
        Boolean boolM2052b3 = AbstractC1150p0.m2041a().m2052b(m791a());
        if (boolM2052b3 != null) {
            map.put("dns", boolM2052b3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (!AbstractC1141o0.m1954j() && f1856j.compareAndSet(false, true)) {
            try {
                OoooOo0.o00000O0.OooO00o(C1220k.m2824o());
            } catch (Throwable th) {
                if (C1240o.m3200a()) {
                    this.f778c.m3212a(this.f777b, "Cannot update security provider", th);
                }
            }
        }
        this.f776a.m2928w0().m576d(C0993c2.f513f, m2338b(m2340g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1235a c1235aMo3101a = C1235a.m3072a(this.f776a).mo3103b(m2340g()).mo3097a(m2339f()).mo3104b(m2342h()).mo3099a(m2341e()).mo3105b(((Boolean) this.f776a.m2866a(C1268v4.f2536A5)).booleanValue()).mo3107c("POST").mo3096a((Object) new JSONObject()).mo3094a(((Integer) this.f776a.m2866a(C1268v4.f2741a3)).intValue()).mo3102b(((Integer) this.f776a.m2866a(C1268v4.f2767d3)).intValue()).mo3106c(((Integer) this.f776a.m2866a(C1268v4.f2733Z2)).intValue()).m3110e(((Boolean) this.f776a.m2866a(C1268v4.f2839m3)).booleanValue()).mo3095a(AbstractC1188s4.a.m2392a(((Integer) this.f776a.m2866a(C1268v4.f2785f5)).intValue())).m3111f(true).mo3101a();
        this.f776a.m2918r0().m404a(new c(this.f776a), C0987b6.b.TIMEOUT, ((Integer) this.f776a.m2866a(r3)).intValue() + 250);
        a aVar = new a(c1235aMo3101a, this.f776a, m798d(), jElapsedRealtime);
        aVar.m1097c(C1268v4.f2836m0);
        aVar.m1096b(C1268v4.f2844n0);
        this.f776a.m2918r0().m402a(aVar);
    }

    /* renamed from: com.applovin.impl.r5$a */
    public class a extends AbstractC1067j6 {

        /* renamed from: m */
        final /* synthetic */ long f1860m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1235a c1235a, C1220k c1220k, boolean z, long j) {
            super(c1235a, c1220k, z);
            this.f1860m = j;
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1860m;
            C1180r5.this.m2337a(jSONObject);
            this.f776a.m2928w0().m576d(C0993c2.f515g, C1180r5.this.m2335a(str, jElapsedRealtime, i, jSONObject, null));
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1860m;
            C1180r5.this.m2337a(jSONObject != null ? jSONObject : new JSONObject());
            this.f776a.m2928w0().m576d(C0993c2.f517h, C1180r5.this.m2335a(str, jElapsedRealtime, i, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public HashMap m2335a(String str, long j, int i, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, C3034d9.i.f8149D, uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.f1857g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j));
        map.put("code", Integer.toString(i));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2337a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f1858h) {
            bVar = this.f1859i;
            this.f1859i = null;
        }
        if (bVar != null) {
            bVar.mo2345a(jSONObject);
        }
    }
}

package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1169q3;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.C1241p;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3824x4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.t5 */
/* loaded from: classes.dex */
public class C1251t5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final C1284x2 f2387g;

    /* renamed from: h */
    private final JSONArray f2388h;

    /* renamed from: i */
    private final Context f2389i;

    /* renamed from: j */
    private final AbstractC1118a.a f2390j;

    public C1251t5(C1284x2 c1284x2, JSONArray jSONArray, Context context, C1220k c1220k, AbstractC1118a.a aVar) {
        super("TaskFetchMediatedAd", c1220k, c1284x2.m3642b());
        this.f2387g = c1284x2;
        this.f2388h = jSONArray;
        this.f2389i = context;
        this.f2390j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m3336b(JSONObject jSONObject) {
        try {
            AbstractC1175r0.m2300c(jSONObject, this.f776a);
            AbstractC1175r0.m2298b(jSONObject, this.f776a);
            AbstractC1175r0.m2289a(jSONObject, this.f776a);
            AbstractC1054i3.m974f(jSONObject, this.f776a);
            AbstractC1054i3.m972d(jSONObject, this.f776a);
            AbstractC1054i3.m973e(jSONObject, this.f776a);
            AbstractC1054i3.m975g(jSONObject, this.f776a);
            this.f776a.m2909m().m2753a();
            MaxAdFormat maxAdFormatM3640a = this.f2387g.m3640a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatM3640a == fromString) {
                m3335a(jSONObject);
                return;
            }
            String strM3642b = this.f2387g.m3642b();
            if (fromString == null) {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Mediated ad response is missing the ad format field for ad unit " + strM3642b);
                }
                if (jSONObject.has("ads")) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid("ad_unit_id", strM3642b, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f776a.m2832E().m572a(C0993c2.f490M0, this.f777b, map);
                }
                this.f2390j.onAdLoadFailed(strM3642b, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatM3640a.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strM3642b + ") is assigned to the correct ad format.";
            if (AbstractC1078k7.m1201a(maxAdFormatM3640a, fromString)) {
                C1240o.m3209j(this.f777b, str);
                m3335a(jSONObject);
                return;
            }
            AbstractC1072k1.m1126a(str, new Object[0]);
            C1240o.m3207h(this.f777b, str);
            this.f2390j.onAdLoadFailed(strM3642b, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", strM3642b);
            CollectionUtils.putStringIfValid("name", label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f776a.m2832E().m572a(C0993c2.f474E0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Unable to process mediated ad response for ad unit " + this.f2387g.m3642b(), th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    /* renamed from: c */
    private void m3337c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f776a.m2860X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !AbstractC1078k7.m1247h(C1220k.m2824o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    /* renamed from: d */
    private void m3338d(JSONObject jSONObject) {
        if (((Boolean) this.f776a.m2866a(C1268v4.f2551C4)).booleanValue()) {
            C1178r3 c1178r3M2862Y = this.f776a.m2862Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            C1153p3 c1153p3 = C1153p3.f1710f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) c1178r3M2862Y.m2330a(c1153p3, C1169q3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) c1178r3M2862Y.m2330a(c1153p3, C1169q3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) c1178r3M2862Y.m2330a(C1153p3.f1711g, C1169q3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    /* renamed from: e */
    private String m3339e() {
        return AbstractC1054i3.m970a(this.f776a);
    }

    /* renamed from: f */
    private String m3341f() {
        return AbstractC1054i3.m971b(this.f776a);
    }

    /* renamed from: g */
    private JSONObject m3343g() throws JSONException {
        Map mapM2993a = this.f776a.m2827B().m2993a((Map) null, false, true);
        mapM2993a.putAll(this.f2387g.m3643c());
        JSONObject jSONObject = new JSONObject(mapM2993a);
        m3340e(jSONObject);
        m3346h(jSONObject);
        m3342f(jSONObject);
        m3337c(jSONObject);
        m3344g(jSONObject);
        m3338d(jSONObject);
        return jSONObject;
    }

    /* renamed from: h */
    private Map m3345h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f2387g.m3642b());
        map.put("AppLovin-Ad-Format", this.f2387g.m3640a().getLabel());
        Map mapM3644d = this.f2387g.m3644d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapM3644d.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapM3644d.get("retry_delay_sec"), map);
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1251t5 c1251t5;
        JSONObject jSONObjectM3343g;
        HashMap map;
        MaxAdFormat maxAdFormatM3640a = this.f2387g.m3640a();
        String strM3642b = this.f2387g.m3642b();
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Fetching next ad for " + maxAdFormatM3640a.getLabel() + " ad unit " + strM3642b);
        }
        AbstractC1063j2.m1036a();
        if (((Boolean) this.f776a.m2866a(C1268v4.f2662Q3)).booleanValue() && AbstractC1078k7.m1250j() && C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "User is connected to a VPN");
        }
        this.f776a.m2848P().m3598a(C0993c2.f498T, maxAdFormatM3640a, strM3642b, (MaxError) null);
        if (((Boolean) this.f776a.m2866a(C1268v4.f2551C4)).booleanValue()) {
            C1178r3 c1178r3M2862Y = this.f776a.m2862Y();
            C1153p3 c1153p3 = C1153p3.f1710f;
            c1178r3M2862Y.m2331a(c1153p3, C1169q3.m2254a(strM3642b));
            c1178r3M2862Y.m2331a(c1153p3, C1169q3.m2253a(maxAdFormatM3640a));
        }
        AbstractC1078k7.m1186a(this.f776a, this.f777b);
        try {
            jSONObjectM3343g = m3343g();
            map = new HashMap();
            if (!((Boolean) this.f776a.m2866a(C1268v4.f2873q5)).booleanValue() && !((Boolean) this.f776a.m2866a(C1268v4.f2857o5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f776a.m2866a(C1268v4.f2743a5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f776a.m2904j0());
            }
            if (this.f776a.m2922t0().m493c()) {
                map.put("test_mode", "1");
            }
            List listM492b = this.f776a.m2922t0().m492b();
            String str = this.f776a.m2912o0().getExtraParameters().get("fan");
            if (listM492b != null && !listM492b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = listM492b.iterator();
                if (it.hasNext()) {
                    CharSequence charSequence = (CharSequence) it.next();
                    while (true) {
                        sb.append(charSequence);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) ",");
                        charSequence = (CharSequence) it.next();
                    }
                }
                String string = sb.toString();
                map.put("filter_ad_network", string);
                if (!this.f776a.m2922t0().m493c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f776a.m2922t0().m494d()) {
                    map.put("force_ad_network", string);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            c1251t5 = this;
        } catch (Throwable th) {
            th = th;
            c1251t5 = this;
        }
        try {
            a aVar = c1251t5.new a(C1235a.m3072a(this.f776a).mo3107c("POST").mo3098a(m3345h()).mo3103b(m3341f()).mo3097a(m3339e()).mo3104b(map).mo3099a(jSONObjectM3343g).mo3105b(((Boolean) this.f776a.m2866a(AbstractC1144o3.f1656o8)).booleanValue()).mo3096a((Object) new JSONObject()).mo3106c(((Long) this.f776a.m2866a(AbstractC1144o3.f1645j7)).intValue()).mo3094a(((Integer) this.f776a.m2866a(C1268v4.f2693U2)).intValue()).mo3102b(((Long) this.f776a.m2866a(AbstractC1144o3.f1643i7)).intValue()).mo3095a(AbstractC1188s4.a.m2392a(((Integer) this.f776a.m2866a(C1268v4.f2793g5)).intValue())).m3111f(true).mo3101a(), this.f776a, strM3642b, maxAdFormatM3640a);
            aVar.m1097c(AbstractC1144o3.f1639g7);
            aVar.m1096b(AbstractC1144o3.f1641h7);
            c1251t5.f776a.m2918r0().m402a(aVar);
        } catch (Throwable th2) {
            th = th2;
            if (C1240o.m3200a()) {
                c1251t5.f778c.m3212a(c1251t5.f777b, "Unable to fetch ad for Ad Unit ID: " + strM3642b, th);
            }
            m3334a("", 0, th.getMessage());
        }
    }

    /* renamed from: com.applovin.impl.t5$a */
    public class a extends AbstractC1067j6 {

        /* renamed from: m */
        final /* synthetic */ String f2391m;

        /* renamed from: n */
        final /* synthetic */ MaxAdFormat f2392n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1235a c1235a, C1220k c1220k, String str, MaxAdFormat maxAdFormat) {
            super(c1235a, c1220k);
            this.f2391m = str;
            this.f2392n = maxAdFormat;
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            if (i != 200) {
                C1251t5.this.m3334a(str, i, null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f967l.m2139a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f967l.m2140b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i), map);
            CollectionUtils.putStringIfValid("ad_unit_id", this.f2391m, map);
            CollectionUtils.putStringIfValid("ad_format", this.f2392n.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f967l.m2139a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f967l.m2140b()), map);
            this.f776a.m2848P().m576d(C0993c2.f499U, map);
            C1251t5.this.m3336b(jSONObject);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            C1251t5.this.m3334a(str, i, str2);
            this.f776a.m2832E().m2149a("fetchMediatedAd", str, i, str2);
        }
    }

    /* renamed from: e */
    private void m3340e(JSONObject jSONObject) throws JSONException {
        String strM3642b = this.f2387g.m3642b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", strM3642b);
        jSONObject2.put("ad_format", this.f2387g.m3640a().getLabel());
        Map map = CollectionUtils.map(this.f2387g.m3644d());
        C1241p c1241pM2881a0 = this.f776a.m2881a0();
        CollectionUtils.putStringIfValid("previous_request_id", c1241pM2881a0.m3221b(strM3642b), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", c1241pM2881a0.m3219a(strM3642b), map);
        C1241p.a aVarM3223c = c1241pM2881a0.m3223c(strM3642b);
        if (aVarM3223c != null) {
            if (Boolean.parseBoolean(this.f776a.m2912o0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarM3223c.m3225a());
                map.put("previous_winning_network_name", aVarM3223c.m3228c());
            }
            if (this.f776a.m2851R() != null) {
                Queue<AbstractC1266v2> queueM1752c = this.f776a.m2851R().m1752c(strM3642b);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC1266v2 abstractC1266v2 : queueM1752c) {
                    arrayList.add(abstractC1266v2.m899c());
                    arrayList2.add(abstractC1266v2.getNetworkName());
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) ",");
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", sb.toString(), map);
                StringBuilder sb2 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_network_names", sb2.toString(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    /* renamed from: f */
    private void m3342f(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C3824x4.f12570e, new JSONArray(this.f776a.m2854T().m1782a()));
            jSONObject2.put("installed", AbstractC1249t3.m3325b(this.f776a));
            jSONObject2.put("initialized", this.f776a.m2852S().m1775b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f776a.m2852S().m1771a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f776a.m2854T().m1785c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f776a.m2854T().m1784b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    /* renamed from: a */
    private void m3335a(JSONObject jSONObject) {
        C1007d6 c1007d6 = new C1007d6(this.f2387g, jSONObject, this.f2389i, this.f776a, this.f2390j);
        long j = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j > 0) {
            this.f776a.m2918r0().m405a(c1007d6, C0987b6.b.MEDIATION, j, true);
        } else {
            this.f776a.m2918r0().m402a(c1007d6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3334a(String str, int i, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strM3642b = this.f2387g.m3642b();
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Unable to fetch ad for ad unit " + strM3642b + ": server returned " + i);
        }
        if (i == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid("ad_unit_id", strM3642b, map);
        CollectionUtils.putStringIfValid("ad_format", this.f2387g.m3640a().getLabel(), map);
        this.f776a.m2848P().m576d(C0993c2.f500V, map);
        AbstractC1168q2.m2169a(this.f2390j, strM3642b, maxErrorImpl);
    }

    /* renamed from: h */
    private void m3346h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f2388h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* renamed from: g */
    private void m3344g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f776a.m2912o0().getExtraParameters()));
    }
}

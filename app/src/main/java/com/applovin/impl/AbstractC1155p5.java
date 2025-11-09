package com.applovin.impl;

import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.p5 */
/* loaded from: classes.dex */
public abstract class AbstractC1155p5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    protected final C1254u f1721g;

    /* renamed from: h */
    private final String f1722h;

    public AbstractC1155p5(C1254u c1254u, String str, C1220k c1220k) {
        super(str, c1220k);
        this.f1721g = c1254u;
        this.f1722h = c1220k.m2883b();
    }

    /* renamed from: g */
    private Map m2070g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f1721g.m3375e());
        if (this.f1721g.m3376f() != null) {
            map.put("AppLovin-Ad-Size", this.f1721g.m3376f().getLabel());
        }
        if (this.f1721g.m3377g() != null) {
            map.put("AppLovin-Ad-Type", this.f1721g.m3377g().getLabel());
        }
        return map;
    }

    /* renamed from: a */
    public abstract AbstractRunnableC1036g5 mo2071a(JSONObject jSONObject);

    /* renamed from: a */
    public void mo2072a(int i, String str) {
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Unable to fetch " + this.f1721g + " ad: server returned " + i);
        }
        this.f776a.m2897g().m707a(C0993c2.f527m, this.f1721g, new AppLovinError(i, str));
    }

    /* renamed from: b */
    public void m2073b(JSONObject jSONObject) {
        AbstractC1175r0.m2300c(jSONObject, this.f776a);
        AbstractC1175r0.m2298b(jSONObject, this.f776a);
        AbstractC1175r0.m2289a(jSONObject, this.f776a);
        C1254u.m3365a(jSONObject);
        this.f776a.m2918r0().m402a(mo2071a(jSONObject));
    }

    /* renamed from: e */
    public abstract String mo2074e();

    /* renamed from: f */
    public abstract String mo2075f();

    /* renamed from: h */
    public Map mo2076h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.f1721g.m3375e());
        if (this.f1721g.m3376f() != null) {
            map.put("size", this.f1721g.m3376f().getLabel());
        }
        if (this.f1721g.m3377g() != null) {
            map.put("require", this.f1721g.m3377g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC1188s4.a aVarM2392a;
        Map map;
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Fetching next ad of zone: " + this.f1721g);
        }
        if (((Boolean) this.f776a.m2866a(C1268v4.f2662Q3)).booleanValue() && AbstractC1078k7.m1250j() && C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "User is connected to a VPN");
        }
        AbstractC1078k7.m1186a(this.f776a, this.f777b);
        this.f776a.m2897g().m707a(C0993c2.f523k, this.f1721g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f776a.m2905k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f776a.m2866a(C1268v4.f2783f3)).booleanValue()) {
                aVarM2392a = AbstractC1188s4.a.m2392a(((Integer) this.f776a.m2866a(C1268v4.f2809i5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f776a.m2827B().m2993a(mo2076h(), false, true));
                HashMap map2 = new HashMap();
                if (!((Boolean) this.f776a.m2866a(C1268v4.f2889s5)).booleanValue() && !((Boolean) this.f776a.m2866a(C1268v4.f2857o5)).booleanValue()) {
                    map2.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f776a.m2866a(C1268v4.f2743a5)).booleanValue()) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f776a.m2904j0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
                map = map2;
            } else {
                AbstractC1188s4.a aVarM2392a2 = AbstractC1188s4.a.m2392a(((Integer) this.f776a.m2866a(C1268v4.f2817j5)).intValue());
                Map mapM1180a = AbstractC1078k7.m1180a(this.f776a.m2827B().m2993a(mo2076h(), false, false));
                if (!((Boolean) this.f776a.m2866a(C1268v4.f2537A6)).booleanValue()) {
                    mapM1180a.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarM2392a = aVarM2392a2;
                map = mapM1180a;
            }
            if (AbstractC1078k7.m1247h(m791a()) || AbstractC1078k7.m1251j(m791a())) {
                map.putAll(this.f776a.m2905k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f1722h)) {
                map.put("sts", this.f1722h);
            }
            C1235a.a aVarM3111f = C1235a.m3072a(this.f776a).mo3103b(mo2075f()).mo3097a(mo2074e()).mo3104b(map).mo3107c(str).mo3098a(m2070g()).mo3096a((Object) new JSONObject()).mo3094a(((Integer) this.f776a.m2866a(C1268v4.f2693U2)).intValue()).m3108c(((Boolean) this.f776a.m2866a(C1268v4.f2701V2)).booleanValue()).m3109d(((Boolean) this.f776a.m2866a(C1268v4.f2709W2)).booleanValue()).mo3106c(((Integer) this.f776a.m2866a(C1268v4.f2685T2)).intValue()).mo3095a(aVarM2392a).m3111f(true);
            if (andResetCustomPostBody != null) {
                aVarM3111f.mo3099a(andResetCustomPostBody);
                aVarM3111f.mo3105b(((Boolean) this.f776a.m2866a(C1268v4.f2552C5)).booleanValue());
            }
            a aVar = new a(aVarM3111f.mo3101a(), this.f776a);
            aVar.m1097c(C1268v4.f2852o0);
            aVar.m1096b(C1268v4.f2860p0);
            this.f776a.m2918r0().m402a(aVar);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Unable to fetch ad for zone id: " + this.f1721g, th);
            }
            mo2072a(0, th.getMessage());
        }
    }

    /* renamed from: com.applovin.impl.p5$a */
    public class a extends AbstractC1067j6 {
        public a(C1235a c1235a, C1220k c1220k) {
            super(c1235a, c1220k);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f967l.m2139a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f967l.m2140b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i), map);
                CollectionUtils.putStringIfValid("ad_zone_id", AbstractC1155p5.this.f1721g.m3375e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f967l.m2139a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f967l.m2140b()), map);
                this.f776a.m2897g().m576d(C0993c2.f525l, map);
                AbstractC1155p5.this.m2073b(jSONObject);
                return;
            }
            AbstractC1155p5.this.mo2072a(i, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            AbstractC1155p5.this.mo2072a(i, str2);
            this.f776a.m2832E().m2149a("fetchAd", str, i, str2);
        }
    }
}

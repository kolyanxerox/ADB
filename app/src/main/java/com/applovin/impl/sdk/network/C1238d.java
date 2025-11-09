package com.applovin.impl.sdk.network;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.d */
/* loaded from: classes.dex */
public class C1238d {

    /* renamed from: a */
    private String f2309a;

    /* renamed from: b */
    private String f2310b;

    /* renamed from: c */
    private String f2311c;

    /* renamed from: d */
    private String f2312d;

    /* renamed from: e */
    private Map f2313e;

    /* renamed from: f */
    private Map f2314f;

    /* renamed from: g */
    private Map f2315g;

    /* renamed from: h */
    private AbstractC1188s4.a f2316h;

    /* renamed from: i */
    private boolean f2317i;

    /* renamed from: j */
    private boolean f2318j;

    /* renamed from: k */
    private boolean f2319k;

    /* renamed from: l */
    private boolean f2320l;

    /* renamed from: m */
    private String f2321m;

    /* renamed from: n */
    private int f2322n;

    /* renamed from: com.applovin.impl.sdk.network.d$b */
    public static class b {

        /* renamed from: a */
        private String f2323a;

        /* renamed from: b */
        private String f2324b;

        /* renamed from: c */
        private String f2325c;

        /* renamed from: d */
        private String f2326d;

        /* renamed from: e */
        private Map f2327e;

        /* renamed from: f */
        private Map f2328f;

        /* renamed from: g */
        private Map f2329g;

        /* renamed from: h */
        private AbstractC1188s4.a f2330h;

        /* renamed from: i */
        private boolean f2331i;

        /* renamed from: j */
        private boolean f2332j;

        /* renamed from: k */
        private boolean f2333k;

        /* renamed from: l */
        private boolean f2334l;

        /* renamed from: a */
        public b m3164a(String str) {
            this.f2326d = str;
            return this;
        }

        /* renamed from: b */
        public b m3168b(String str) {
            this.f2323a = str;
            return this;
        }

        /* renamed from: c */
        public b m3171c(String str) {
            this.f2324b = str;
            return this;
        }

        /* renamed from: d */
        public b m3174d(String str) {
            this.f2325c = str;
            return this;
        }

        /* renamed from: a */
        public b m3165a(Map map) {
            this.f2328f = map;
            return this;
        }

        /* renamed from: b */
        public b m3169b(Map map) {
            this.f2327e = map;
            return this;
        }

        /* renamed from: c */
        public b m3172c(Map map) {
            this.f2329g = map;
            return this;
        }

        /* renamed from: d */
        public b m3175d(boolean z) {
            this.f2333k = z;
            return this;
        }

        /* renamed from: a */
        public b m3163a(AbstractC1188s4.a aVar) {
            this.f2330h = aVar;
            return this;
        }

        /* renamed from: b */
        public b m3170b(boolean z) {
            this.f2334l = z;
            return this;
        }

        /* renamed from: c */
        public b m3173c(boolean z) {
            this.f2332j = z;
            return this;
        }

        /* renamed from: a */
        public b m3166a(boolean z) {
            this.f2331i = z;
            return this;
        }

        /* renamed from: a */
        public C1238d m3167a() {
            return new C1238d(this);
        }
    }

    /* renamed from: b */
    public static b m3134b() {
        return new b();
    }

    /* renamed from: a */
    public void m3135a() {
        Map map = CollectionUtils.map(this.f2313e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f2313e = map;
    }

    /* renamed from: c */
    public int m3136c() {
        return this.f2322n;
    }

    /* renamed from: d */
    public String m3137d() {
        return this.f2312d;
    }

    /* renamed from: e */
    public String m3138e() {
        return this.f2321m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2309a.equals(((C1238d) obj).f2309a);
    }

    /* renamed from: f */
    public AbstractC1188s4.a m3139f() {
        return this.f2316h;
    }

    /* renamed from: g */
    public Map m3140g() {
        return this.f2314f;
    }

    /* renamed from: h */
    public String m3141h() {
        return this.f2310b;
    }

    public int hashCode() {
        return this.f2309a.hashCode();
    }

    /* renamed from: i */
    public Map m3142i() {
        return this.f2313e;
    }

    /* renamed from: j */
    public Map m3143j() {
        return this.f2315g;
    }

    /* renamed from: k */
    public String m3144k() {
        return this.f2311c;
    }

    /* renamed from: l */
    public void m3145l() {
        this.f2322n++;
    }

    /* renamed from: m */
    public boolean m3146m() {
        return this.f2319k;
    }

    /* renamed from: n */
    public boolean m3147n() {
        return this.f2317i;
    }

    /* renamed from: o */
    public boolean m3148o() {
        return this.f2318j;
    }

    /* renamed from: p */
    public boolean m3149p() {
        return this.f2320l;
    }

    /* renamed from: q */
    public JSONObject m3150q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f2309a);
        jSONObject.put("communicatorRequestId", this.f2321m);
        jSONObject.put("httpMethod", this.f2310b);
        jSONObject.put("targetUrl", this.f2311c);
        jSONObject.put("backupUrl", this.f2312d);
        jSONObject.put("encodingType", this.f2316h);
        jSONObject.put("isEncodingEnabled", this.f2317i);
        jSONObject.put("gzipBodyEncoding", this.f2318j);
        jSONObject.put("isAllowedPreInitEvent", this.f2319k);
        jSONObject.put("attemptNumber", this.f2322n);
        if (this.f2313e != null) {
            jSONObject.put(Constants.PARAMETERS, new JSONObject(this.f2313e));
        }
        if (this.f2314f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f2314f));
        }
        if (this.f2315g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f2315g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostbackRequest{uniqueId='");
        sb.append(this.f2309a);
        sb.append("', communicatorRequestId='");
        sb.append(this.f2321m);
        sb.append("', httpMethod='");
        sb.append(this.f2310b);
        sb.append("', targetUrl='");
        sb.append(this.f2311c);
        sb.append("', backupUrl='");
        sb.append(this.f2312d);
        sb.append("', attemptNumber=");
        sb.append(this.f2322n);
        sb.append(", isEncodingEnabled=");
        sb.append(this.f2317i);
        sb.append(", isGzipBodyEncoding=");
        sb.append(this.f2318j);
        sb.append(", isAllowedPreInitEvent=");
        sb.append(this.f2319k);
        sb.append(", shouldFireInWebView=");
        return OooO00o.OooOOOO(sb, this.f2320l, '}');
    }

    public C1238d(JSONObject jSONObject, C1220k c1220k) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, Constants.PARAMETERS) ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject(Constants.PARAMETERS))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f2309a = string;
        this.f2310b = string3;
        this.f2321m = string2;
        this.f2311c = string4;
        this.f2312d = string5;
        this.f2313e = mapSynchronizedMap;
        this.f2314f = mapSynchronizedMap2;
        this.f2315g = mapSynchronizedMap3;
        this.f2316h = AbstractC1188s4.a.m2392a(jSONObject.optInt("encodingType", AbstractC1188s4.a.DEFAULT.m2394b()));
        this.f2317i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f2318j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f2319k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f2320l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f2322n = i;
    }

    private C1238d(b bVar) {
        this.f2309a = UUID.randomUUID().toString();
        this.f2310b = bVar.f2324b;
        this.f2311c = bVar.f2325c;
        this.f2312d = bVar.f2326d;
        this.f2313e = bVar.f2327e;
        this.f2314f = bVar.f2328f;
        this.f2315g = bVar.f2329g;
        this.f2316h = bVar.f2330h;
        this.f2317i = bVar.f2331i;
        this.f2318j = bVar.f2332j;
        this.f2319k = bVar.f2333k;
        this.f2320l = bVar.f2334l;
        this.f2321m = bVar.f2323a;
        this.f2322n = 0;
    }
}

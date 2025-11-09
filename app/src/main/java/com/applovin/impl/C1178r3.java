package com.applovin.impl;

import com.applovin.impl.C1153p3;
import com.applovin.impl.C1169q3;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.r3 */
/* loaded from: classes.dex */
public final class C1178r3 {

    /* renamed from: d */
    private static final HashMap f1847d = new HashMap();

    /* renamed from: e */
    private static final Object f1848e = new Object();

    /* renamed from: f */
    private static final HashMap f1849f = new HashMap();

    /* renamed from: g */
    private static final Object f1850g = new Object();

    /* renamed from: h */
    private static final HashMap f1851h = new LinkedHashMap();

    /* renamed from: i */
    private static final Object f1852i = new Object();

    /* renamed from: a */
    private final C1220k f1853a;

    /* renamed from: b */
    private final JSONObject f1854b = m2321a(AbstractC1144o3.f1642h8);

    /* renamed from: c */
    private final JSONObject f1855c = m2321a(AbstractC1144o3.f1640g8);

    public C1178r3(C1220k c1220k) {
        this.f1853a = c1220k;
        m2323a((String) C1295y4.m3787a(C1286x4.f3038J, (Object) null, C1220k.m2824o()), C1169q3.a.AD_UNIT_ID);
        m2323a((String) C1295y4.m3787a(C1286x4.f3039K, (Object) null, C1220k.m2824o()), C1169q3.a.AD_FORMAT);
    }

    /* renamed from: a */
    public static /* synthetic */ Long m2315a(Long l, Long l2) {
        return l;
    }

    /* renamed from: b */
    private Map m2326b(C1153p3 c1153p3, C1169q3 c1169q3, C1153p3.b bVar) {
        if (!m2324a(c1153p3, c1169q3, bVar) || !m2328b(c1153p3, c1169q3)) {
            return null;
        }
        String strM2256b = c1169q3.m2256b();
        HashMap mapM2318a = m2318a(c1169q3.m2255a());
        Object objM2325b = m2325b(c1169q3.m2255a());
        HashMap map = new HashMap();
        synchronized (objM2325b) {
            try {
                if (c1169q3 instanceof C1134n3) {
                    m2322a((C1134n3) c1169q3, mapM2318a);
                }
                HashMap map2 = (HashMap) mapM2318a.get(strM2256b);
                if (map2 == null) {
                    map2 = new HashMap();
                    mapM2318a.put(strM2256b, map2);
                }
                Iterator it = c1153p3.m2067b().iterator();
                while (it.hasNext()) {
                    String strM2069b = ((C1153p3.a) it.next()).m2069b();
                    HashMap map3 = (HashMap) map2.get(strM2069b);
                    if (map3 == null) {
                        map3 = new HashMap();
                        map2.put(strM2069b, map3);
                    }
                    Object objMo1a = bVar.mo1a(map3.get(c1153p3));
                    map3.put(c1153p3, objMo1a);
                    map.put(strM2069b, objMo1a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Boolean bool = (Boolean) this.f1853a.m2866a(AbstractC1144o3.f1646j8);
        if (c1153p3.m2065a(C1153p3.a.INSTALL) && bool.booleanValue()) {
            m2327b(c1169q3);
        }
        return map;
    }

    /* renamed from: c */
    private C1286x4 m2329c(C1169q3.a aVar) {
        if (aVar == C1169q3.a.AD_UNIT_ID) {
            return C1286x4.f3038J;
        }
        if (aVar == C1169q3.a.AD_FORMAT) {
            return C1286x4.f3039K;
        }
        return null;
    }

    /* renamed from: a */
    private JSONObject m2321a(C1268v4 c1268v4) {
        return JsonUtils.jsonObjectFromJsonString((String) this.f1853a.m2866a(c1268v4), new JSONObject());
    }

    /* renamed from: a */
    public Map m2331a(C1153p3 c1153p3, C1169q3 c1169q3) {
        return m2326b(c1153p3, c1169q3, new OooOOo0.o0ooOOo(3));
    }

    /* renamed from: a */
    public static /* synthetic */ Long m2314a(Long l) {
        return Long.valueOf(l != null ? 1 + l.longValue() : 1L);
    }

    /* renamed from: a */
    public void m2332a(C1153p3 c1153p3, C1169q3 c1169q3, Long l) {
        m2326b(c1153p3, c1169q3, new o000000(l, 3));
    }

    /* renamed from: a */
    public Map m2330a(C1153p3 c1153p3, C1169q3.a aVar) {
        return m2320a(c1153p3, aVar, C1153p3.a.SESSION);
    }

    /* renamed from: a */
    private Map m2320a(C1153p3 c1153p3, C1169q3.a aVar, C1153p3.a aVar2) {
        HashMap mapM2318a = m2318a(aVar);
        Object objM2325b = m2325b(aVar);
        HashMap map = new HashMap();
        synchronized (objM2325b) {
            try {
                for (String str : mapM2318a.keySet()) {
                    HashMap map2 = (HashMap) mapM2318a.get(str);
                    String strM2069b = aVar2.m2069b();
                    if (map2 != null && map2.containsKey(strM2069b)) {
                        HashMap map3 = (HashMap) map2.get(strM2069b);
                        if (aVar == C1169q3.a.AD) {
                            map.put(C1034g3.m776a(str).m779b(), map3.get(c1153p3));
                        } else {
                            map.put(str, map3.get(c1153p3));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    /* renamed from: a */
    private void m2322a(C1134n3 c1134n3, Map map) {
        MaxAdFormat maxAdFormatM777a = c1134n3.m1890c().m777a();
        Integer integer = JsonUtils.getInteger(this.f1855c, maxAdFormatM777a.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C1034g3.m776a((String) it.next()).m777a().equals(maxAdFormatM777a)) {
                i++;
            }
        }
        if (i < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i >= integer.intValue()) {
            if (C1034g3.m776a((String) ((Map.Entry) it2.next()).getKey()).m777a().equals(maxAdFormatM777a)) {
                it2.remove();
                i--;
            }
        }
    }

    /* renamed from: b */
    private Object m2325b(C1169q3.a aVar) {
        if (aVar == C1169q3.a.AD_UNIT_ID) {
            return f1848e;
        }
        if (aVar == C1169q3.a.AD_FORMAT) {
            return f1850g;
        }
        return f1852i;
    }

    /* renamed from: b */
    private boolean m2328b(C1153p3 c1153p3, C1169q3 c1169q3) {
        Iterator<String> itKeys = this.f1854b.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(c1169q3.m2255a().toString().toLowerCase()) && JsonUtils.valueExists(androidx.datastore.preferences.protobuf.OooO00o.OooOOoo(next, this.f1854b), c1153p3.m2064a())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private HashMap m2318a(C1169q3.a aVar) {
        if (aVar == C1169q3.a.AD_UNIT_ID) {
            return f1847d;
        }
        if (aVar == C1169q3.a.AD_FORMAT) {
            return f1849f;
        }
        return f1851h;
    }

    /* renamed from: a */
    private boolean m2324a(C1153p3 c1153p3, C1169q3 c1169q3, C1153p3.b bVar) {
        if (c1153p3 == null) {
            this.f1853a.m2847O();
            if (C1240o.m3200a()) {
                this.f1853a.m2847O().m3214b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (c1169q3 == null) {
            this.f1853a.m2847O();
            if (C1240o.m3200a()) {
                this.f1853a.m2847O().m3214b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.f1853a.m2847O();
        if (C1240o.m3200a()) {
            this.f1853a.m2847O().m3214b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    /* renamed from: b */
    private void m2327b(C1169q3 c1169q3) {
        C1286x4 c1286x4M2329c = m2329c(c1169q3.m2255a());
        if (c1286x4M2329c == null) {
            return;
        }
        C1295y4.m3793b(c1286x4M2329c, m2317a((Map) m2319a(c1169q3)), C1220k.m2824o());
    }

    /* renamed from: a */
    private HashMap m2319a(C1169q3 c1169q3) {
        HashMap map = new HashMap();
        HashMap mapM2318a = m2318a(c1169q3.m2255a());
        synchronized (m2325b(c1169q3.m2255a())) {
            try {
                for (Map.Entry entry : mapM2318a.entrySet()) {
                    String str = (String) entry.getKey();
                    HashMap map2 = (HashMap) entry.getValue();
                    if (!CollectionUtils.isEmpty(map2)) {
                        HashMap map3 = (HashMap) map2.get(C1153p3.a.INSTALL.m2069b());
                        if (!CollectionUtils.isEmpty(map3)) {
                            map.put(str, new HashMap(map3));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    /* renamed from: a */
    private String m2317a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                C1153p3 c1153p3 = (C1153p3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, c1153p3.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private void m2323a(String str, C1169q3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap mapM2318a = m2318a(aVar);
            Object objM2325b = m2325b(aVar);
            Map<String, Object> stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (objM2325b) {
                try {
                    for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                        String key = entry.getKey();
                        HashMap map = new HashMap();
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            C1153p3 c1153p3M2062a = C1153p3.m2062a((String) entry2.getKey());
                            if (c1153p3M2062a != null) {
                                map.put(c1153p3M2062a, m2316a(entry2.getValue()));
                            }
                        }
                        if (!CollectionUtils.isEmpty(map)) {
                            HashMap map2 = new HashMap();
                            map2.put(C1153p3.a.INSTALL.m2069b(), map);
                            mapM2318a.put(key, map2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    private Object m2316a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }
}

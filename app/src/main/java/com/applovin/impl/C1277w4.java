package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.w4 */
/* loaded from: classes.dex */
public class C1277w4 {

    /* renamed from: a */
    protected final C1220k f2997a;

    /* renamed from: b */
    protected final Context f2998b;

    /* renamed from: c */
    protected final SharedPreferences f2999c;

    /* renamed from: d */
    private final Map f3000d = new HashMap();

    /* renamed from: e */
    private final Object f3001e = new Object();

    public C1277w4(C1220k c1220k) {
        this.f2997a = c1220k;
        Context contextM2824o = C1220k.m2824o();
        this.f2998b = contextM2824o;
        this.f2999c = contextM2824o.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(C1268v4.class.getName());
            Class.forName(AbstractC1144o3.class.getName());
        } catch (Throwable unused) {
        }
        m3606d();
    }

    /* renamed from: d */
    private void m3606d() {
        String strM3605b = ((Boolean) C1295y4.m3787a(C1286x4.f3054i, Boolean.FALSE, C1220k.m2824o())).booleanValue() ? "" : m3605b();
        synchronized (this.f3001e) {
            try {
                for (C1268v4 c1268v4 : C1268v4.m3550c()) {
                    try {
                        Object objM2869a = this.f2997a.m2869a(strM3605b + c1268v4.m3553b(), null, c1268v4.m3551a().getClass(), this.f2999c);
                        if (objM2869a != null) {
                            this.f3000d.put(c1268v4.m3553b(), objM2869a);
                        }
                    } catch (Throwable th) {
                        C1240o.m3204c("SettingsManager", "Unable to load \"" + c1268v4.m3553b() + "\"", th);
                        this.f2997a.m2832E().m2148a("SettingsManager", "initSettings", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public Object m3607a(C1268v4 c1268v4) {
        if (c1268v4 == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f3001e) {
            try {
                Object obj = this.f3000d.get(c1268v4.m3553b());
                if (obj == null) {
                    return c1268v4.m3551a();
                }
                return c1268v4.m3552a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public List m3611b(C1268v4 c1268v4) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = m3612c(c1268v4).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public List m3612c(C1268v4 c1268v4) {
        return CollectionUtils.explode((String) m3607a(c1268v4));
    }

    /* renamed from: e */
    public void m3614e() {
        Boolean bool = (Boolean) C1295y4.m3787a(C1286x4.f3054i, Boolean.FALSE, C1220k.m2824o());
        String strM3605b = m3605b();
        synchronized (this.f3001e) {
            try {
                SharedPreferences.Editor editorEdit = this.f2999c.edit();
                for (C1268v4 c1268v4 : C1268v4.m3550c()) {
                    Object obj = this.f3000d.get(c1268v4.m3553b());
                    if (obj != null) {
                        String strM3553b = c1268v4.m3553b();
                        this.f2997a.m2876a(strM3605b + c1268v4.m3553b(), obj, editorEdit);
                        if (bool.booleanValue()) {
                            this.f2997a.m2876a(strM3553b, obj, editorEdit);
                        }
                    }
                }
                if (((Boolean) this.f2997a.m2866a(C1268v4.f2898t6)).booleanValue()) {
                    C1295y4.m3791a(editorEdit);
                } else {
                    editorEdit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public boolean m3613c() {
        return this.f2997a.m2912o0().isVerboseLoggingEnabled() || ((Boolean) m3607a(C1268v4.f2819k)).booleanValue();
    }

    /* renamed from: b */
    private String m3605b() {
        return "com.applovin.sdk." + AbstractC1078k7.m1242f(this.f2997a.m2904j0()) + ".";
    }

    /* renamed from: a */
    public void m3609a(C1268v4 c1268v4, Object obj) {
        if (c1268v4 == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f3001e) {
                this.f3000d.put(c1268v4.m3553b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    /* renamed from: a */
    public void m3610a(JSONObject jSONObject) {
        synchronized (this.f3001e) {
            try {
                boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, C1268v4.f2907v.m3553b(), Boolean.FALSE).booleanValue();
                HashMap map = zBooleanValue ? new HashMap() : null;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            C1268v4 c1268v4M3548a = C1268v4.m3548a(next);
                            if (c1268v4M3548a != null) {
                                Object objM3607a = zBooleanValue ? m3607a(c1268v4M3548a) : null;
                                Object objM3604a = m3604a(next, jSONObject, c1268v4M3548a.m3551a());
                                this.f3000d.put(c1268v4M3548a.m3553b(), objM3604a);
                                if (c1268v4M3548a == C1268v4.f2921w5) {
                                    this.f3000d.put(C1268v4.f2929x5.m3553b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (zBooleanValue && !objM3604a.equals(objM3607a)) {
                                    map.put(c1268v4M3548a, objM3607a);
                                }
                            }
                        } catch (JSONException e) {
                            C1240o.m3204c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                            this.f2997a.m2832E().m2148a("SettingsManager", "loadSettingsException", e);
                        } catch (Throwable th) {
                            C1240o.m3204c("SettingsManager", "Unable to convert setting object ", th);
                            this.f2997a.m2832E().m2148a("SettingsManager", "loadSettingsThrowable", th);
                        }
                    }
                }
                if (zBooleanValue && map.size() > 0) {
                    C1186s2 c1186s2 = new C1186s2();
                    c1186s2.m2367a("========== UPDATED SETTINGS ==========");
                    for (C1268v4 c1268v4 : map.keySet()) {
                        c1186s2.m2368a(c1268v4.m3553b(), m3607a(c1268v4) + " (" + map.get(c1268v4) + ")");
                    }
                    c1186s2.m2367a("========== END ==========");
                    this.f2997a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f2997a.m2847O().m3211a("SettingsManager", c1186s2.toString());
                    }
                }
                C1295y4.m3793b(C1286x4.f3054i, (Boolean) m3607a(C1268v4.f2593H6), C1220k.m2824o());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public void m3608a() {
        synchronized (this.f3001e) {
            this.f3000d.clear();
        }
        this.f2997a.m2871a(this.f2999c);
    }

    /* renamed from: a */
    private static Object m3604a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}

package com.ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.is */
/* loaded from: classes2.dex */
public class C3233is {

    /* renamed from: a */
    private JSONObject f9049a;

    public C3233is() {
        this.f9049a = new JSONObject();
    }

    /* renamed from: b */
    public static Object m9381b(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            if (obj2 != null) {
                jSONObject.put(obj2.toString(), m9381b(map.get(obj2)));
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    private void m9383f(String str) {
        try {
            this.f9049a = new JSONObject(str);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            this.f9049a = new JSONObject();
        }
    }

    /* renamed from: a */
    public int m9384a(String str, int i) {
        return this.f9049a.optInt(str, i);
    }

    /* renamed from: c */
    public boolean m9392c(String str) {
        return this.f9049a.optBoolean(str);
    }

    /* renamed from: d */
    public String m9393d(String str) {
        return this.f9049a.optString(str, null);
    }

    /* renamed from: e */
    public boolean m9394e(String str) {
        return m9387a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.f9049a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public C3233is(String str) {
        m9383f(str);
    }

    /* renamed from: a */
    private Object m9379a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? m9382b((JSONObject) obj) : obj instanceof JSONArray ? m9386a((JSONArray) obj) : obj;
    }

    /* renamed from: b */
    public Object m9390b(String str) {
        try {
            return m9387a().get(str);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            return null;
        }
    }

    /* renamed from: b */
    private Map<String, Object> m9382b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, m9379a(jSONObject.get(next)));
        }
        return map;
    }

    /* renamed from: a */
    public String m9385a(String str, String str2) {
        return this.f9049a.optString(str, str2);
    }

    /* renamed from: a */
    public List m9386a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m9379a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void m9391b(String str, String str2) throws JSONException {
        try {
            this.f9049a.put(str, str2);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: a */
    public JSONObject m9387a() {
        return this.f9049a;
    }

    /* renamed from: a */
    public void m9388a(String str, JSONObject jSONObject) throws JSONException {
        try {
            this.f9049a.put(str, jSONObject);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: a */
    public boolean m9389a(String str) {
        return m9387a().has(str);
    }

    /* renamed from: a */
    public static boolean m9380a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }
}

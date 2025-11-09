package com.ironsource;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.qe */
/* loaded from: classes2.dex */
public class C3556qe {

    /* renamed from: a */
    private static C3556qe f10938a = new C3556qe();

    /* renamed from: a */
    public static C3556qe m11548a() {
        return f10938a;
    }

    /* renamed from: b */
    public static JSONObject m11553b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) objOpt));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static HashMap<String, Object> m11549a(ConcurrentHashMap<String, Object> concurrentHashMap) throws JSONException {
        Object objM11552a;
        HashMap<String, Object> map = new HashMap<>();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                objM11552a = m11552a((JSONObject) entry.getValue());
            } else if (entry.getValue() instanceof JSONArray) {
                objM11552a = m11551a((JSONArray) entry.getValue());
            } else if (entry.getValue() instanceof Map) {
                objM11552a = m11550a((Map<String, Object>) entry.getValue());
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
            map.put(entry.getKey(), objM11552a);
        }
        return map;
    }

    /* renamed from: a */
    public static Map<String, Object> m11550a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, map.get(str));
        }
        return map2;
    }

    /* renamed from: a */
    public static JSONArray m11551a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m11552a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }
}

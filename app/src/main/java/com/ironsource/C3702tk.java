package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.tk */
/* loaded from: classes2.dex */
public class C3702tk {
    /* renamed from: a */
    private static Object m12444a(Object obj) {
        return obj instanceof JSONObject ? m12446a((JSONObject) obj) : obj instanceof JSONArray ? m12445a((JSONArray) obj) : obj;
    }

    /* renamed from: b */
    public static Object m12450b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject) && !obj.equals(JSONObject.NULL)) {
            try {
                if (obj instanceof Collection) {
                    return new JSONArray((Collection) obj);
                }
                if (obj.getClass().isArray()) {
                    return new JSONArray((Collection) Arrays.asList(obj));
                }
                if (obj instanceof Map) {
                    return new JSONObject((Map) obj);
                }
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if ((obj instanceof Enum) || obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                return null;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public static List<Object> m12445a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m12444a(jSONArray.get(i)));
            } catch (JSONException e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("Could not put value into list: " + e.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m12451b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m12446a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, m12444a(jSONObject.get(next)));
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error("Could not put value in map: " + next + ", " + e.getMessage());
                }
            }
        }
        return map;
    }

    /* renamed from: a */
    public static JSONObject m12447a(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), m12450b(entry.getValue()));
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m12448a(JSONObject... jSONObjectArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            jSONObject.put(next, jSONObject2.get(next));
                        } catch (JSONException e) {
                            C3551q9.m11517d().m11519a(e);
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m12449a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}

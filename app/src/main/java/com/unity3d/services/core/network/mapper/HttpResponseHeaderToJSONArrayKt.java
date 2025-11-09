package com.unity3d.services.core.network.mapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00O0.OooOo;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class HttpResponseHeaderToJSONArrayKt {
    public static final JSONArray toResponseHeadersMap(Map<String, ? extends List<String>> map) {
        Set<Map.Entry<String, ? extends List<String>>> setEntrySet;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jSONArray = jSONArray.put(new JSONArray((Collection) OooOo.OooOOo((String) entry.getKey(), (List) entry.getValue())));
            kotlin.jvm.internal.OooOo.OooO0Oo(jSONArray, "acc.put(JSONArray(listOf(key, value)))");
        }
        return jSONArray;
    }
}

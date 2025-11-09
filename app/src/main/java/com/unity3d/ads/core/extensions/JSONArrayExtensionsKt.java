package com.unity3d.ads.core.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.Oooo000;
import o00O0.o0Oo0oo;
import o00O0o0O.o00Ooo;
import o00Oo0oo.o00oO0o;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        OooOo.OooO0o0(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List arrayList = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            OooOo.OooO0Oo(string, "header.getString(1)");
            arrayList.add(string);
            String string2 = jSONArray2.getString(0);
            OooOo.OooO0Oo(string2, "header.getString(0)");
            linkedHashMap.put(string2, arrayList);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        OooOo.OooO0o0(jSONArray, "<this>");
        o00Ooo o00oooOooOOOO = o00oO0o.OooOOOO(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(Oooo000.OooOo0(o00oooOooOOOO, 10));
        Iterator it = o00oooOooOOOO.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((o0Oo0oo) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}

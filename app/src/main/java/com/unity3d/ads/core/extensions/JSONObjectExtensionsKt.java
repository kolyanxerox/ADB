package com.unity3d.ads.core.extensions;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0o.OooOO0;
import o00O0o.Oooo000;
import o00O0o.o0OoOo0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class JSONObjectExtensionsKt {
    public static final Map<String, Object> toBuiltInMap(JSONObject jSONObject) {
        OooOo.OooO0o0(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        OooOo.OooO0Oo(itKeys, "keys()");
        Oooo000 oooo000Oooo0 = o0OoOo0.Oooo0(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((OooOO0) oooo000Oooo0).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object objOpt = jSONObject.opt((String) next);
            if (objOpt == null || String.valueOf(objOpt).equals(AdError.UNDEFINED_DOMAIN) || String.valueOf(objOpt).equals("null")) {
                objOpt = null;
            }
            linkedHashMap.put(next, objOpt);
        }
        return linkedHashMap;
    }
}

package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.el */
/* loaded from: classes2.dex */
public final class C3081el {

    /* renamed from: a */
    private static final int f8418a = 100;

    /* renamed from: a */
    private static final boolean m8509a(Object obj, Object obj2, int i) {
        return ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) ? m8513a((JSONObject) obj, (JSONObject) obj2, i + 1) : ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) ? m8511a((JSONArray) obj, (JSONArray) obj2, i + 1) : ((obj instanceof Number) && (obj2 instanceof Number)) ? ((Number) obj).doubleValue() == ((Number) obj2).doubleValue() : kotlin.jvm.internal.OooOo.OooO00o(obj, obj2);
    }

    /* renamed from: a */
    public static final boolean m8510a(JSONArray lhs, JSONArray rhs) {
        kotlin.jvm.internal.OooOo.OooO0o0(lhs, "lhs");
        kotlin.jvm.internal.OooOo.OooO0o0(rhs, "rhs");
        return m8511a(lhs, rhs, 0);
    }

    /* renamed from: a */
    public static final boolean m8512a(JSONObject lhs, JSONObject rhs) {
        kotlin.jvm.internal.OooOo.OooO0o0(lhs, "lhs");
        kotlin.jvm.internal.OooOo.OooO0o0(rhs, "rhs");
        return m8513a(lhs, rhs, 0);
    }

    /* renamed from: a */
    private static final boolean m8513a(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.OooOo.OooO0Oo(itKeys, "lhs.keys()");
        Iterator it = ((o00O0o.OooOO0) o00O0o.o0OoOo0.Oooo0(itKeys)).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!jSONObject2.has(str) || !m8509a(jSONObject.get(str), jSONObject2.get(str), i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static final boolean m8511a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i > 100) {
            return false;
        }
        Iterable iterableOooOOOO = o00Oo0oo.o00oO0o.OooOOOO(0, jSONArray.length());
        if (!(iterableOooOOOO instanceof Collection) || !((Collection) iterableOooOOOO).isEmpty()) {
            Iterator it = iterableOooOOOO.iterator();
            while (((o00O0o0O.o00Oo0) it).f31439OooOo) {
                int iNextInt = ((o00O0.o0Oo0oo) it).nextInt();
                if (!m8509a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i)) {
                    return false;
                }
            }
        }
        return true;
    }
}

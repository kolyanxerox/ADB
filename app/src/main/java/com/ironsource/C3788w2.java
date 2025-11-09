package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.w2 */
/* loaded from: classes2.dex */
public final class C3788w2 {

    /* renamed from: b */
    public static final a f12436b = new a(null);

    /* renamed from: c */
    public static final String f12437c = "adUnits";

    /* renamed from: a */
    private final JSONObject f12438a;

    /* renamed from: com.ironsource.w2$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3788w2(JSONObject configurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(configurations, "configurations");
        this.f12438a = configurations.optJSONObject(f12437c);
    }

    /* renamed from: a */
    public final <T> Map<String, T> m12838a(o00O0Oo.Oooo000 valueExtractor) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.f12438a;
        if (jSONObject == null) {
            return o00O0.o00oO0o.f31247OooOo0O;
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.OooOo.OooO0Oo(itKeys, "adUnits.keys()");
        o00O0o.Oooo000 oooo000Oooo0 = o00O0o.o0OoOo0.Oooo0(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((o00O0o.OooOO0) oooo000Oooo0).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) next);
            kotlin.jvm.internal.OooOo.OooO0Oo(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(next, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}

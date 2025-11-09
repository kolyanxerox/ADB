package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.uq */
/* loaded from: classes2.dex */
public final class C3743uq {

    /* renamed from: b */
    public static final a f12266b = new a(null);

    /* renamed from: c */
    public static final String f12267c = "placements";

    /* renamed from: d */
    public static final String f12268d = "placementName";

    /* renamed from: a */
    private final JSONArray f12269a;

    /* renamed from: com.ironsource.uq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3743uq(JSONObject configuration) {
        kotlin.jvm.internal.OooOo.OooO0o0(configuration, "configuration");
        this.f12269a = configuration.optJSONArray(f12267c);
    }

    /* renamed from: a */
    public final <T> Map<String, T> m12714a(o00O0Oo.Oooo000 valueExtractor) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f12269a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String key = jSONObject.optString("placementName");
                Object objInvoke = valueExtractor.invoke(jSONObject);
                kotlin.jvm.internal.OooOo.OooO0Oo(key, "key");
                linkedHashMap.put(key, objInvoke);
            }
        }
        return linkedHashMap;
    }
}

package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.br */
/* loaded from: classes2.dex */
public final class C2982br {

    /* renamed from: a */
    private final Map<LevelPlay.AdFormat, a> f7623a;

    /* renamed from: com.ironsource.br$a */
    public static final class a {

        /* renamed from: a */
        private final Map<String, b> f7624a;

        public a(JSONObject adFormatProviderOrder) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0o0(adFormatProviderOrder, "adFormatProviderOrder");
            Iterable iterableM12451b = C3702tk.m12451b(adFormatProviderOrder.names());
            iterableM12451b = iterableM12451b == null ? o00O0.oo000o.f31251OooOo0O : iterableM12451b;
            int iOooOOOO = o00O0.o0O0O00.OooOOOO(o00O0.Oooo000.OooOo0(iterableM12451b, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO < 16 ? 16 : iOooOOOO);
            for (Object obj : iterableM12451b) {
                JSONArray jSONArrayOptJSONArray = adFormatProviderOrder.optJSONArray((String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                linkedHashMap.put(obj, new b(jSONArrayOptJSONArray));
            }
            this.f7624a = linkedHashMap;
        }

        /* renamed from: a */
        public final Map<String, b> m7980a() {
            return this.f7624a;
        }
    }

    /* renamed from: com.ironsource.br$b */
    public static final class b {

        /* renamed from: a */
        private final List<String> f7625a;

        public b(JSONArray providerOrder) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0o0(providerOrder, "providerOrder");
            List<String> listM12451b = C3702tk.m12451b(providerOrder);
            kotlin.jvm.internal.OooOo.OooO0Oo(listM12451b, "jsonArrayToStringList(providerOrder)");
            this.f7625a = listM12451b;
        }

        /* renamed from: a */
        public final List<String> m7981a() {
            return this.f7625a;
        }
    }

    public C2982br(JSONObject providerOrder) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        int iOooOOOO = o00O0.o0O0O00.OooOOOO(adFormatArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO < 16 ? 16 : iOooOOOO);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = providerOrder.optJSONObject(C2951av.m7841a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.f7623a = linkedHashMap;
    }

    /* renamed from: a */
    public final Map<LevelPlay.AdFormat, a> m7979a() {
        return this.f7623a;
    }
}

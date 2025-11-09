package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.dr */
/* loaded from: classes2.dex */
public final class C3052dr {

    /* renamed from: a */
    private final Map<String, C2980bp> f8323a;

    /* renamed from: com.ironsource.dr$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.Oooo000 {

        /* renamed from: a */
        final /* synthetic */ JSONObject f8324a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.f8324a = jSONObject;
        }

        @Override // o00O0Oo.Oooo000
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final oo00o.OooOO0 invoke(String networkName) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0Oo(networkName, "networkName");
            JSONObject jSONObject = this.f8324a.getJSONObject(networkName);
            kotlin.jvm.internal.OooOo.OooO0Oo(jSONObject, "providerSettings.getJSONObject(networkName)");
            return new oo00o.OooOO0(networkName, new C2980bp(networkName, jSONObject));
        }
    }

    public C3052dr(JSONObject providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        Iterator<String> itKeys = providerSettings.keys();
        kotlin.jvm.internal.OooOo.OooO0Oo(itKeys, "providerSettings\n          .keys()");
        o00O0o.Oooo000 oooo000Oooo0 = o00O0o.o0OoOo0.Oooo0(itKeys);
        a aVar = new a(providerSettings);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = oooo000Oooo0.iterator();
        while (it.hasNext()) {
            oo00o.OooOO0 oooOO0 = (oo00o.OooOO0) aVar.invoke(it.next());
            linkedHashMap.put(oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
        }
        Map<String, C2980bp> mapOooOOoo = o00O0.o0O0O00.OooOOoo(linkedHashMap);
        this.f8323a = mapOooOOoo;
        for (Map.Entry<String, C2980bp> entry : mapOooOOoo.entrySet()) {
            entry.getKey();
            C2980bp value = entry.getValue();
            if (m8388b(value)) {
                value.m7959b(m8387a(value));
            }
        }
    }

    /* renamed from: a */
    private final C2980bp m8387a(C2980bp c2980bp) {
        return this.f8323a.get(c2980bp.m7965h());
    }

    /* renamed from: b */
    private final boolean m8388b(C2980bp c2980bp) {
        return c2980bp.m7972o() && c2980bp.m7969l().length() > 0;
    }

    /* renamed from: a */
    public final Map<String, C2980bp> m8389a() {
        return this.f8323a;
    }
}

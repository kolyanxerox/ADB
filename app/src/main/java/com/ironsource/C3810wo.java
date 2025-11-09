package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.wo */
/* loaded from: classes2.dex */
public final class C3810wo implements InterfaceC3304ku<JSONObject>, InterfaceC3234iu<C3741uo> {

    /* renamed from: a */
    private final Map<String, C3103f3> f12522a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC3075ef
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject mo8475a(EnumC3269ju mode) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C3103f3> entry : this.f12522a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayMo8475a = entry.getValue().mo8475a(mode);
            if (jSONArrayMo8475a.length() > 0) {
                jSONObject.put(key, jSONArrayMo8475a);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC3234iu
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo8604a(C3741uo record) {
        kotlin.jvm.internal.OooOo.OooO0o0(record, "record");
        String strM12712c = record.m12712c();
        Map<String, C3103f3> map = this.f12522a;
        C3103f3 c3103f3 = map.get(strM12712c);
        if (c3103f3 == null) {
            c3103f3 = new C3103f3();
            map.put(strM12712c, c3103f3);
        }
        c3103f3.m8608a(record.m12709a(new C3776vo()));
    }
}

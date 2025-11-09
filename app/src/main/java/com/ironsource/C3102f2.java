package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.f2 */
/* loaded from: classes2.dex */
public final class C3102f2 implements InterfaceC3304ku<JSONObject>, InterfaceC3234iu<C3027d2> {

    /* renamed from: a */
    private final Map<String, C3810wo> f8484a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC3075ef
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject mo8475a(EnumC3269ju mode) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C3810wo> entry : this.f8484a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectMo8475a = entry.getValue().mo8475a(mode);
            if (jSONObjectMo8475a.length() > 0) {
                jSONObject.put(o00O0oO.o000000.Oooooo0(key, "_"), jSONObjectMo8475a);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC3234iu
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo8604a(C3027d2 record) {
        kotlin.jvm.internal.OooOo.OooO0o0(record, "record");
        String strM8258d = record.m8258d();
        Map<String, C3810wo> map = this.f8484a;
        C3810wo c3810wo = map.get(strM8258d);
        if (c3810wo == null) {
            c3810wo = new C3810wo();
            map.put(strM8258d, c3810wo);
        }
        c3810wo.mo8604a(record.m8254a(new C3062e2()));
    }
}

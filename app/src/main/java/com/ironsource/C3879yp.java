package com.ironsource;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.yp */
/* loaded from: classes2.dex */
class C3879yp extends AbstractC3059e {

    /* renamed from: i */
    private final String f12767i = C3428mq.f10318a;

    public C3879yp(int i) {
        this.f8350g = i;
    }

    @Override // com.ironsource.AbstractC3059e
    /* renamed from: a */
    public String mo8425a() {
        return C3428mq.f10318a;
    }

    @Override // com.ironsource.AbstractC3059e
    /* renamed from: c */
    public String mo8431c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC3059e
    /* renamed from: a */
    public String mo8426a(ArrayList<C3899zb> arrayList, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f8349f = jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C3899zb c3899zb = arrayList.get(i);
                i++;
                JSONObject jSONObjectM8428a = m8428a(c3899zb);
                if (jSONObjectM8428a != null) {
                    jSONArray.put(jSONObjectM8428a);
                }
            }
        }
        return m8427a(jSONArray);
    }
}

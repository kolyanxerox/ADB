package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sk */
/* loaded from: classes2.dex */
class C3667sk extends AbstractC3059e {

    /* renamed from: i */
    private final String f11920i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* renamed from: j */
    private final String f11921j = "super.dwh.mediation_events";

    /* renamed from: k */
    private final String f11922k = C3037dc.f8241Q;

    /* renamed from: l */
    private final String f11923l = "data";

    public C3667sk(int i) {
        this.f8350g = i;
    }

    @Override // com.ironsource.AbstractC3059e
    /* renamed from: a */
    public String mo8425a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC3059e
    /* renamed from: c */
    public String mo8431c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC3059e
    /* renamed from: a */
    public String mo8426a(ArrayList<C3899zb> arrayList, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f8349f = jSONObject;
        try {
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
            jSONObject2.put(C3037dc.f8241Q, "super.dwh.mediation_events");
            jSONObject2.put("data", m8427a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}

package com.ironsource;

import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.zk */
/* loaded from: classes2.dex */
public class C3908zk {

    /* renamed from: a */
    private String f13017a;

    /* renamed from: b */
    private JSONObject f13018b;

    /* renamed from: c */
    private String f13019c;

    /* renamed from: d */
    private String f13020d;

    public C3908zk(JSONObject jSONObject) {
        this.f13017a = jSONObject.optString(C3034d9.f.f7994b);
        this.f13018b = jSONObject.optJSONObject(C3034d9.f.f7995c);
        this.f13019c = jSONObject.optString("success");
        this.f13020d = jSONObject.optString(C3034d9.f.f7997e);
    }

    /* renamed from: a */
    public String m13405a() {
        return this.f13020d;
    }

    /* renamed from: b */
    public String m13406b() {
        return this.f13017a;
    }

    /* renamed from: c */
    public JSONObject m13407c() {
        return this.f13018b;
    }

    /* renamed from: d */
    public String m13408d() {
        return this.f13019c;
    }

    /* renamed from: e */
    public JSONObject m13409e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C3034d9.f.f7994b, this.f13017a);
            jSONObject.put(C3034d9.f.f7995c, this.f13018b);
            jSONObject.put("success", this.f13019c);
            jSONObject.put(C3034d9.f.f7997e, this.f13020d);
            return jSONObject;
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}

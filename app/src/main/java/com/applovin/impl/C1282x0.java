package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.x0 */
/* loaded from: classes.dex */
public class C1282x0 extends C1255u0 {

    /* renamed from: c */
    private Map f3020c;

    public C1282x0(JSONObject jSONObject, C1220k c1220k) {
        super(jSONObject, c1220k);
    }

    /* renamed from: d */
    public Map m3637d() {
        return this.f3020c;
    }

    /* renamed from: e */
    public String m3638e() {
        return JsonUtils.getString(this.f2418b, "name", null);
    }

    @Override // com.applovin.impl.C1255u0
    public String toString() {
        return "ConsentFlowState{id=" + m3384b() + ", type=" + m3386c() + ", name=" + m3638e() + "}";
    }
}

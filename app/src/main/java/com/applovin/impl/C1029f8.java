package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C3743uq;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.f8 */
/* loaded from: classes.dex */
public class C1029f8 {

    /* renamed from: a */
    private final C1177r2 f763a;

    /* renamed from: b */
    private final C1285x3 f764b;

    /* renamed from: c */
    private final List f765c;

    public C1029f8(JSONObject jSONObject, MaxAdFormat maxAdFormat, C0984b3 c0984b3, C1220k c1220k) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f764b = new C1285x3(jSONObject2, c1220k);
        } else {
            this.f764b = null;
        }
        this.f763a = new C1177r2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, c0984b3);
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo(C3743uq.f12267c, jSONObject);
        this.f765c = new ArrayList(jSONArrayOooOOoo.length());
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f765c.add(new C1285x3(jSONObject3, c1220k));
            }
        }
    }

    /* renamed from: a */
    public C1285x3 m761a() {
        return this.f764b;
    }

    /* renamed from: b */
    public C1177r2 m762b() {
        return this.f763a;
    }

    /* renamed from: c */
    public List m763c() {
        return this.f765c;
    }

    /* renamed from: d */
    public boolean m764d() {
        return this.f764b != null;
    }
}

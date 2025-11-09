package com.ironsource;

import com.ironsource.C3451ne;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.b5 */
/* loaded from: classes2.dex */
public final class C2960b5 {

    /* renamed from: a */
    private final C3451ne.a f7574a;

    /* renamed from: b */
    private final ArrayList<String> f7575b = new ArrayList<>(new C3892z4().m13298a());

    /* renamed from: c */
    private final C3521pe f7576c = new C3521pe();

    public C2960b5(C3451ne.a aVar) {
        this.f7574a = aVar;
    }

    /* renamed from: a */
    public final JSONObject m7876a() {
        C3451ne.a aVar = this.f7574a;
        JSONObject jSONObjectM11388a = aVar != null ? this.f7576c.m11388a(this.f7575b, aVar) : null;
        if (jSONObjectM11388a == null) {
            jSONObjectM11388a = this.f7576c.m11387a(this.f7575b);
            kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectM11388a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return m7875a(jSONObjectM11388a);
    }

    /* renamed from: a */
    private final JSONObject m7875a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectM11553b = C3556qe.m11553b(jSONObject.optJSONObject(C3451ne.f10517u));
        if (jSONObjectM11553b != null) {
            jSONObject.put(C3451ne.f10517u, jSONObjectM11553b);
        }
        return jSONObject;
    }
}

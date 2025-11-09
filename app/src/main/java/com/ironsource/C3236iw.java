package com.ironsource;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.iw */
/* loaded from: classes2.dex */
public final class C3236iw {

    /* renamed from: a */
    private final String[] f9050a = C3202hw.f8954a.m9241a();

    /* renamed from: b */
    private final C3521pe f9051b = new C3521pe();

    /* renamed from: a */
    public final JSONObject m9397a() throws JSONException {
        JSONObject jSONObjectM11389a = this.f9051b.m11389a(this.f9050a);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectM11389a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return m9396a(jSONObjectM11389a);
    }

    /* renamed from: a */
    public final JSONObject m9398a(Context context) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        JSONObject jSONObjectM11386a = this.f9051b.m11386a(context, this.f9050a);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectM11386a, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return m9396a(jSONObjectM11386a);
    }

    /* renamed from: a */
    private final JSONObject m9396a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectM11553b = C3556qe.m11553b(jSONObject.optJSONObject(C3451ne.f10517u));
        if (jSONObjectM11553b != null) {
            jSONObject.put(C3451ne.f10517u, jSONObjectM11553b);
        }
        return jSONObject;
    }
}

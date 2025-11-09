package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3034d9;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.v0 */
/* loaded from: classes.dex */
public class C1264v0 extends C1255u0 {
    public C1264v0(JSONObject jSONObject, C1220k c1220k) {
        super(jSONObject, c1220k);
    }

    /* renamed from: d */
    public List m3422d() {
        C1273w0 c1273w0M3581a;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f2418b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject != null && (c1273w0M3581a = C1273w0.m3581a(jSONObject, this.f2417a)) != null) {
                arrayList.add(c1273w0M3581a);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public String m3423e() {
        return m3385b(Constants.MESSAGE);
    }

    /* renamed from: f */
    public String m3424f() {
        return m3385b(C3034d9.h.f8063D0);
    }

    @Override // com.applovin.impl.C1255u0
    public String toString() {
        return "ConsentFlowState{id=" + m3384b() + ", type=" + m3386c() + ", title=" + m3424f() + ", message=" + m3423e() + ", actions=" + m3422d() + "}";
    }
}

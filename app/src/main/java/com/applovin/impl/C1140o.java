package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.mediationsdk.C3368d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.o */
/* loaded from: classes.dex */
public class C1140o {

    /* renamed from: a */
    private final String f1546a;

    /* renamed from: b */
    private final String f1547b;

    /* renamed from: c */
    private final C1049h8 f1548c;

    /* renamed from: d */
    private final List f1549d;

    /* renamed from: e */
    private final List f1550e;

    /* renamed from: f */
    private boolean f1551f = false;

    public C1140o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, C1220k c1220k) {
        this.f1546a = JsonUtils.getString(jSONObject, "name", "");
        this.f1547b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f1548c = m1922a(jSONObject);
        this.f1549d = m1923a("bidders", jSONObject, map, maxAdFormat, c1220k);
        this.f1550e = m1923a(C3368d.f9610h, jSONObject, map, maxAdFormat, c1220k);
    }

    /* renamed from: a */
    public List m1924a() {
        return this.f1549d;
    }

    /* renamed from: b */
    public String m1925b() {
        return this.f1547b;
    }

    /* renamed from: c */
    public String m1926c() {
        return this.f1546a;
    }

    /* renamed from: d */
    public C1049h8 m1927d() {
        return this.f1548c;
    }

    /* renamed from: e */
    public List m1928e() {
        return this.f1550e;
    }

    /* renamed from: f */
    public boolean m1929f() {
        return this.f1551f;
    }

    /* renamed from: a */
    private C1049h8 m1922a(JSONObject jSONObject) {
        return new C1049h8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    /* renamed from: a */
    private List m1923a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, C1220k c1220k) {
        C0984b3 c0984b3;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo(str, jSONObject);
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null);
            if (jSONObject2 != null && (c0984b3 = (C0984b3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (c0984b3.m341D()) {
                    this.f1551f = true;
                }
                arrayList.add(new C1029f8(jSONObject2, maxAdFormat, c0984b3, c1220k));
            }
        }
        return arrayList;
    }
}

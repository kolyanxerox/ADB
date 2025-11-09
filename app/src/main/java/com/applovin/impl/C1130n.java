package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.n */
/* loaded from: classes.dex */
public class C1130n implements Comparable {

    /* renamed from: a */
    private final String f1504a;

    /* renamed from: b */
    private final String f1505b;

    /* renamed from: c */
    private final MaxAdFormat f1506c;

    /* renamed from: d */
    private final C1140o f1507d;

    /* renamed from: e */
    private final List f1508e;

    public C1130n(JSONObject jSONObject, Map map, C1220k c1220k) {
        this.f1504a = JsonUtils.getString(jSONObject, "name", "");
        this.f1505b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f1506c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("waterfalls", jSONObject);
        this.f1508e = new ArrayList(jSONArrayOooOOoo.length());
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f1508e.add(new C1140o(jSONObject2, map, this.f1506c, c1220k));
            }
        }
        this.f1507d = this.f1508e.isEmpty() ? null : (C1140o) this.f1508e.get(0);
    }

    /* renamed from: a */
    public MaxAdFormat m1871a() {
        return this.f1506c;
    }

    /* renamed from: b */
    public String m1872b() {
        MaxAdFormat maxAdFormat = this.f1506c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    /* renamed from: c */
    public String m1873c() {
        return this.f1504a;
    }

    /* renamed from: d */
    public String m1874d() {
        return this.f1505b;
    }

    /* renamed from: e */
    public String m1875e() {
        return "\n---------- " + this.f1505b + " ----------\nIdentifier - " + this.f1504a + "\nFormat     - " + m1872b();
    }

    /* renamed from: f */
    public C1140o m1876f() {
        return this.f1507d;
    }

    /* renamed from: g */
    public List m1877g() {
        return this.f1508e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C1130n c1130n) {
        return this.f1505b.compareToIgnoreCase(c1130n.f1505b);
    }
}

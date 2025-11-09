package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.s7 */
/* loaded from: classes.dex */
public class C1191s7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private final String f1887a;

    /* renamed from: b */
    private final String f1888b;

    private C1191s7(String str, String str2) {
        this.f1887a = str;
        this.f1888b = str2;
    }

    /* renamed from: a */
    public static C1191s7 m2403a(C1099m8 c1099m8, C1220k c1220k) {
        if (c1099m8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new C1191s7((String) c1099m8.m1512a().get("apiFramework"), c1099m8.m1517d());
        } catch (Throwable th) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            c1220k.m2832E().m2152a("VastJavaScriptResource", th);
            return null;
        }
    }

    /* renamed from: b */
    public String m2405b() {
        return this.f1887a;
    }

    /* renamed from: c */
    public String m2406c() {
        return this.f1888b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1191s7 c1191s7 = (C1191s7) obj;
            String str = this.f1887a;
            if (str == null ? c1191s7.f1887a != null : !str.equals(c1191s7.f1887a)) {
                return false;
            }
            String str2 = this.f1888b;
            String str3 = c1191s7.f1888b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1887a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1888b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb.append(this.f1887a);
        sb.append("', javascriptResourceUrl='");
        return OooO0oO.OooOo.OooOOOo(sb, this.f1888b, "'}");
    }

    /* renamed from: a */
    public static C1191s7 m2404a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        return new C1191s7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f1887a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f1888b);
        return jSONObject;
    }
}

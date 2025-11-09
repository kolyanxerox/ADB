package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.n7 */
/* loaded from: classes.dex */
public class C1138n7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private final List f1539a;

    private C1138n7(List list) {
        this.f1539a = list;
    }

    /* renamed from: a */
    public static C1138n7 m1906a(C1099m8 c1099m8, C1138n7 c1138n7, AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        try {
            List listM1908b = c1138n7 != null ? c1138n7.m1908b() : new ArrayList();
            Iterator it = c1099m8.m1511a("Verification").iterator();
            while (it.hasNext()) {
                C1098m7 c1098m7M1505a = C1098m7.m1505a((C1099m8) it.next(), abstractC1157p7, c1220k);
                if (c1098m7M1505a != null) {
                    listM1908b.add(c1098m7M1505a);
                }
            }
            return new C1138n7(listM1908b);
        } catch (Throwable th) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a("VastAdVerifications", "Error occurred while initializing", th);
            }
            c1220k.m2832E().m2152a("VastAdVerifications", th);
            return null;
        }
    }

    /* renamed from: b */
    public List m1908b() {
        return this.f1539a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1138n7) {
            return this.f1539a.equals(((C1138n7) obj).f1539a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1539a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f1539a + "'}";
    }

    /* renamed from: a */
    public static C1138n7 m1907a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("verifications", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            C1098m7 c1098m7M1506a = C1098m7.m1506a(JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null), c1220k);
            if (c1098m7M1506a != null) {
                arrayList.add(c1098m7M1506a);
            }
        }
        return new C1138n7(arrayList);
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f1539a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f1539a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1098m7) it.next()).mo1363a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}

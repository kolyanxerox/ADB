package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.m7 */
/* loaded from: classes.dex */
public class C1098m7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private final String f1201a;

    /* renamed from: b */
    private final List f1202b;

    /* renamed from: c */
    private final String f1203c;

    /* renamed from: d */
    private final Set f1204d;

    private C1098m7(String str, List list, String str2, Set set) {
        this.f1201a = str;
        this.f1202b = list;
        this.f1203c = str2;
        this.f1204d = set;
    }

    /* renamed from: a */
    public static C1098m7 m1505a(C1099m8 c1099m8, AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        try {
            String str = (String) c1099m8.m1512a().get("vendor");
            C1099m8 c1099m8M1513b = c1099m8.m1513b("VerificationParameters");
            String strM1517d = c1099m8M1513b != null ? c1099m8M1513b.m1517d() : null;
            List listM1511a = c1099m8.m1511a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listM1511a.size());
            Iterator it = listM1511a.iterator();
            while (it.hasNext()) {
                C1191s7 c1191s7M2403a = C1191s7.m2403a((C1099m8) it.next(), c1220k);
                if (c1191s7M2403a != null) {
                    arrayList.add(c1191s7M2403a);
                }
            }
            HashMap map = new HashMap();
            AbstractC1289x7.m3668a(c1099m8, map, abstractC1157p7, c1220k);
            return new C1098m7(str, arrayList, strM1517d, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a("VastAdVerification", "Error occurred while initializing", th);
            }
            c1220k.m2832E().m2152a("VastAdVerification", th);
            return null;
        }
    }

    /* renamed from: b */
    public Set m1507b() {
        return this.f1204d;
    }

    /* renamed from: c */
    public List m1508c() {
        return this.f1202b;
    }

    /* renamed from: d */
    public String m1509d() {
        return this.f1201a;
    }

    /* renamed from: e */
    public String m1510e() {
        return this.f1203c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1098m7 c1098m7 = (C1098m7) obj;
            String str = this.f1201a;
            if (str == null ? c1098m7.f1201a != null : !str.equals(c1098m7.f1201a)) {
                return false;
            }
            List list = this.f1202b;
            if (list == null ? c1098m7.f1202b != null : !list.equals(c1098m7.f1202b)) {
                return false;
            }
            String str2 = this.f1203c;
            if (str2 == null ? c1098m7.f1203c != null : !str2.equals(c1098m7.f1203c)) {
                return false;
            }
            Set set = this.f1204d;
            Set set2 = c1098m7.f1204d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1201a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f1202b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f1203c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f1204d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f1201a + "'javascriptResources='" + this.f1202b + "'verificationParameters='" + this.f1203c + "'errorEventTrackers='" + this.f1204d + "'}";
    }

    /* renamed from: a */
    public static C1098m7 m1506a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("javascript_resources", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            C1191s7 c1191s7M2404a = C1191s7.m2404a(JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null), c1220k);
            if (c1191s7M2404a != null) {
                arrayList.add(c1191s7M2404a);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArrayOooOOoo2 = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("error_event_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArrayOooOOoo2.length(); i2++) {
            C1271v7 c1271v7M3575a = C1271v7.m3575a(JsonUtils.getJSONObject(jSONArrayOooOOoo2, i2, (JSONObject) null), c1220k);
            if (c1271v7M3575a != null) {
                hashSet.add(c1271v7M3575a);
            }
        }
        return new C1098m7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f1201a);
        if (this.f1202b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f1202b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1191s7) it.next()).mo1363a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f1203c);
        if (this.f1204d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f1204d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((C1271v7) it2.next()).mo1363a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}

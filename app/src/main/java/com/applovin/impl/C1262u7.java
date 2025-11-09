package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.u7 */
/* loaded from: classes.dex */
public class C1262u7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private String f2456a;

    /* renamed from: b */
    private String f2457b;

    private C1262u7() {
    }

    /* renamed from: a */
    public static C1262u7 m3407a(C1099m8 c1099m8, C1262u7 c1262u7, C1220k c1220k) {
        if (c1099m8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c1262u7 == null) {
            try {
                c1262u7 = new C1262u7();
            } catch (Throwable th) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("VastSystemInfo", "Error occurred while initializing", th);
                }
                c1220k.m2832E().m2152a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(c1262u7.f2456a)) {
            String strM1517d = c1099m8.m1517d();
            if (StringUtils.isValidString(strM1517d)) {
                c1262u7.f2456a = strM1517d;
            }
        }
        if (!StringUtils.isValidString(c1262u7.f2457b)) {
            String str = (String) c1099m8.m1512a().get("version");
            if (StringUtils.isValidString(str)) {
                c1262u7.f2457b = str;
            }
        }
        return c1262u7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262u7)) {
            return false;
        }
        C1262u7 c1262u7 = (C1262u7) obj;
        String str = this.f2456a;
        if (str == null ? c1262u7.f2456a != null : !str.equals(c1262u7.f2456a)) {
            return false;
        }
        String str2 = this.f2457b;
        String str3 = c1262u7.f2457b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f2456a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2457b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastSystemInfo{name='");
        sb.append(this.f2456a);
        sb.append("', version='");
        return OooO0oO.OooOo.OooOOOo(sb, this.f2457b, "'}");
    }

    /* renamed from: a */
    public static C1262u7 m3408a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        C1262u7 c1262u7 = new C1262u7();
        c1262u7.f2456a = JsonUtils.getString(jSONObject, "name", null);
        c1262u7.f2457b = JsonUtils.getString(jSONObject, "version", null);
        return c1262u7;
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f2456a);
        JsonUtils.putString(jSONObject, "version", this.f2457b);
        return jSONObject;
    }
}

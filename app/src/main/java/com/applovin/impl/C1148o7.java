package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.o7 */
/* loaded from: classes.dex */
public class C1148o7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private int f1680a;

    /* renamed from: b */
    private int f1681b;

    /* renamed from: c */
    private Uri f1682c;

    /* renamed from: d */
    private C1253t7 f1683d;

    /* renamed from: e */
    private final Set f1684e = new HashSet();

    /* renamed from: f */
    private final Map f1685f = new HashMap();

    private C1148o7() {
    }

    /* renamed from: a */
    public static C1148o7 m2021a(C1099m8 c1099m8, C1148o7 c1148o7, AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        C1099m8 c1099m8M1515c;
        if (c1099m8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c1148o7 == null) {
            try {
                c1148o7 = new C1148o7();
            } catch (Throwable th) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("VastCompanionAd", "Error occurred while initializing", th);
                }
                c1220k.m2832E().m2152a("VastCompanionAd", th);
                return null;
            }
        }
        if (c1148o7.f1680a == 0 && c1148o7.f1681b == 0) {
            int i = StringUtils.parseInt((String) c1099m8.m1512a().get("width"));
            int i2 = StringUtils.parseInt((String) c1099m8.m1512a().get("height"));
            if (i > 0 && i2 > 0) {
                c1148o7.f1680a = i;
                c1148o7.f1681b = i2;
            }
        }
        c1148o7.f1683d = C1253t7.m3351a(c1099m8, c1148o7.f1683d, c1220k);
        if (c1148o7.f1682c == null && (c1099m8M1515c = c1099m8.m1515c("CompanionClickThrough")) != null) {
            String strM1517d = c1099m8M1515c.m1517d();
            if (StringUtils.isValidString(strM1517d)) {
                c1148o7.f1682c = Uri.parse(strM1517d);
            }
        }
        AbstractC1289x7.m3670a(c1099m8.m1511a("CompanionClickTracking"), c1148o7.f1684e, abstractC1157p7, c1220k);
        AbstractC1289x7.m3668a(c1099m8, c1148o7.f1685f, abstractC1157p7, c1220k);
        return c1148o7;
    }

    /* renamed from: b */
    public Set m2023b() {
        return this.f1684e;
    }

    /* renamed from: c */
    public Uri m2024c() {
        return this.f1682c;
    }

    /* renamed from: d */
    public Map m2025d() {
        return this.f1685f;
    }

    /* renamed from: e */
    public C1253t7 m2026e() {
        return this.f1683d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148o7)) {
            return false;
        }
        C1148o7 c1148o7 = (C1148o7) obj;
        if (this.f1680a != c1148o7.f1680a || this.f1681b != c1148o7.f1681b) {
            return false;
        }
        Uri uri = this.f1682c;
        if (uri == null ? c1148o7.f1682c != null : !uri.equals(c1148o7.f1682c)) {
            return false;
        }
        C1253t7 c1253t7 = this.f1683d;
        if (c1253t7 == null ? c1148o7.f1683d != null : !c1253t7.equals(c1148o7.f1683d)) {
            return false;
        }
        Set set = this.f1684e;
        if (set == null ? c1148o7.f1684e != null : !set.equals(c1148o7.f1684e)) {
            return false;
        }
        Map map = this.f1685f;
        Map map2 = c1148o7.f1685f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f1680a * 31) + this.f1681b) * 31;
        Uri uri = this.f1682c;
        int iHashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        C1253t7 c1253t7 = this.f1683d;
        int iHashCode2 = (iHashCode + (c1253t7 != null ? c1253t7.hashCode() : 0)) * 31;
        Set set = this.f1684e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f1685f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f1680a + ", height=" + this.f1681b + ", destinationUri=" + this.f1682c + ", nonVideoResource=" + this.f1683d + ", clickTrackers=" + this.f1684e + ", eventTrackers=" + this.f1685f + '}';
    }

    /* renamed from: a */
    public static C1148o7 m2022a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        C1253t7 c1253t7M3352a = C1253t7.m3352a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), c1220k);
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("click_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < jSONArrayOooOOoo.length(); i3++) {
            C1271v7 c1271v7M3575a = C1271v7.m3575a(JsonUtils.getJSONObject(jSONArrayOooOOoo, i3, (JSONObject) null), c1220k);
            if (c1271v7M3575a != null) {
                hashSet.add(c1271v7M3575a);
            }
        }
        C1148o7 c1148o7 = new C1148o7();
        c1148o7.f1680a = i;
        c1148o7.f1681b = i2;
        c1148o7.f1682c = uri;
        c1148o7.f1683d = c1253t7M3352a;
        c1148o7.f1684e.addAll(hashSet);
        return c1148o7;
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f1680a);
        JsonUtils.putInt(jSONObject, "height", this.f1681b);
        Uri uri = this.f1682c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        C1253t7 c1253t7 = this.f1683d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", c1253t7 != null ? c1253t7.mo1363a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f1684e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C1271v7) it.next()).mo1363a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}

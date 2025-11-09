package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.l7 */
/* loaded from: classes.dex */
public class C1088l7 extends AbstractC1207b implements InterfaceC1135n4 {

    /* renamed from: n */
    private final String f1120n;

    /* renamed from: o */
    private final String f1121o;

    /* renamed from: p */
    private final C1262u7 f1122p;

    /* renamed from: q */
    private final long f1123q;

    /* renamed from: r */
    private final C1298y7 f1124r;

    /* renamed from: s */
    private final C1148o7 f1125s;

    /* renamed from: t */
    private final String f1126t;

    /* renamed from: u */
    private final C1138n7 f1127u;

    /* renamed from: v */
    private final C1055i4 f1128v;

    /* renamed from: w */
    private final Set f1129w;

    /* renamed from: x */
    private final Set f1130x;

    /* renamed from: com.applovin.impl.l7$b */
    public static class b {

        /* renamed from: a */
        private JSONObject f1131a;

        /* renamed from: b */
        private JSONObject f1132b;

        /* renamed from: c */
        private C1220k f1133c;

        /* renamed from: d */
        private long f1134d;

        /* renamed from: e */
        private String f1135e;

        /* renamed from: f */
        private String f1136f;

        /* renamed from: g */
        private C1262u7 f1137g;

        /* renamed from: h */
        private C1298y7 f1138h;

        /* renamed from: i */
        private C1148o7 f1139i;

        /* renamed from: j */
        private C1138n7 f1140j;

        /* renamed from: k */
        private Set f1141k;

        /* renamed from: l */
        private Set f1142l;

        /* renamed from: b */
        public b m1411b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f1132b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        /* renamed from: b */
        public b m1409b(String str) {
            this.f1135e = str;
            return this;
        }

        /* renamed from: b */
        public b m1410b(Set set) {
            this.f1141k = set;
            return this;
        }

        /* renamed from: a */
        public b m1407a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f1131a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        /* renamed from: a */
        public b m1402a(C1220k c1220k) {
            if (c1220k != null) {
                this.f1133c = c1220k;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        /* renamed from: a */
        public b m1405a(String str) {
            this.f1136f = str;
            return this;
        }

        /* renamed from: a */
        public b m1403a(C1262u7 c1262u7) {
            this.f1137g = c1262u7;
            return this;
        }

        /* renamed from: a */
        public b m1404a(C1298y7 c1298y7) {
            this.f1138h = c1298y7;
            return this;
        }

        /* renamed from: a */
        public b m1401a(C1148o7 c1148o7) {
            this.f1139i = c1148o7;
            return this;
        }

        /* renamed from: a */
        public b m1400a(C1138n7 c1138n7) {
            this.f1140j = c1138n7;
            return this;
        }

        /* renamed from: a */
        public b m1406a(Set set) {
            this.f1142l = set;
            return this;
        }

        /* renamed from: a */
        public b m1399a(long j) {
            this.f1134d = j;
            return this;
        }

        /* renamed from: a */
        public C1088l7 m1408a() {
            return new C1088l7(this);
        }
    }

    /* renamed from: com.applovin.impl.l7$c */
    public enum c {
        COMPANION_AD,
        VIDEO
    }

    /* renamed from: com.applovin.impl.l7$d */
    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    public /* synthetic */ C1088l7(b bVar, a aVar) {
        this(bVar);
    }

    /* renamed from: A1 */
    private Set m1339A1() {
        C1298y7 c1298y7 = this.f1124r;
        return c1298y7 != null ? c1298y7.m3810b() : Collections.EMPTY_SET;
    }

    /* renamed from: t */
    public /* synthetic */ List m1342t(C1026f5 c1026f5) {
        return AbstractC1078k7.m1177a(c1026f5.m731a("vimp_urls", new JSONObject()), getClCode(), null, m1344w1(), m2557T(), m2578a1(), this.sdk);
    }

    /* renamed from: t1 */
    private Set m1343t1() {
        C1148o7 c1148o7 = this.f1125s;
        return c1148o7 != null ? c1148o7.m2023b() : Collections.EMPTY_SET;
    }

    /* renamed from: w1 */
    private String m1344w1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* renamed from: B1 */
    public C1298y7 m1345B1() {
        return this.f1124r;
    }

    /* renamed from: C1 */
    public C1307z7 m1346C1() {
        Long lM2303f = AbstractC1175r0.m2303f(this.sdk);
        return this.f1124r.m3809a(lM2303f != null ? lM2303f.longValue() : 0L);
    }

    /* renamed from: D1 */
    public boolean m1347D1() {
        return m1372x1() != null;
    }

    /* renamed from: E1 */
    public boolean m1348E1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    /* renamed from: F1 */
    public void m1349F1() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m741c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    /* renamed from: G1 */
    public boolean m1350G1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    /* renamed from: H1 */
    public boolean m1351H1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    /* renamed from: I1 */
    public boolean m1352I1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    /* renamed from: J1 */
    public boolean m1353J1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: K */
    public List mo1354K() {
        List listM1177a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new o000000(this, 0));
        }
        synchronized (this.adObjectLock) {
            listM1177a = AbstractC1078k7.m1177a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, m1344w1(), m2557T(), m2578a1(), this.sdk);
        }
        return listM1177a;
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: K0 */
    public boolean mo1355K0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    /* renamed from: K1 */
    public boolean m1356K1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: N0 */
    public boolean mo1357N0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && mo1365m() != null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: O0 */
    public boolean mo1358O0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: Q0 */
    public void mo1359Q0() {
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: S */
    public String mo1360S() {
        return this.f1126t;
    }

    /* renamed from: a */
    public Set m1361a(d dVar, String str) {
        return m1362a(dVar, new String[]{str});
    }

    /* renamed from: d */
    public void m1364d(String str) {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m740b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1088l7) || !super.equals(obj)) {
            return false;
        }
        C1088l7 c1088l7 = (C1088l7) obj;
        String str = this.f1120n;
        if (str == null ? c1088l7.f1120n != null : !str.equals(c1088l7.f1120n)) {
            return false;
        }
        String str2 = this.f1121o;
        if (str2 == null ? c1088l7.f1121o != null : !str2.equals(c1088l7.f1121o)) {
            return false;
        }
        C1262u7 c1262u7 = this.f1122p;
        if (c1262u7 == null ? c1088l7.f1122p != null : !c1262u7.equals(c1088l7.f1122p)) {
            return false;
        }
        C1298y7 c1298y7 = this.f1124r;
        if (c1298y7 == null ? c1088l7.f1124r != null : !c1298y7.equals(c1088l7.f1124r)) {
            return false;
        }
        C1148o7 c1148o7 = this.f1125s;
        if (c1148o7 == null ? c1088l7.f1125s != null : !c1148o7.equals(c1088l7.f1125s)) {
            return false;
        }
        C1138n7 c1138n7 = this.f1127u;
        if (c1138n7 == null ? c1088l7.f1127u != null : !c1138n7.equals(c1088l7.f1127u)) {
            return false;
        }
        Set set = this.f1129w;
        if (set == null ? c1088l7.f1129w != null : !set.equals(c1088l7.f1129w)) {
            return false;
        }
        Set set2 = this.f1130x;
        Set set3 = c1088l7.f1130x;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f1123q;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listM3815g;
        C1298y7 c1298y7 = this.f1124r;
        return (c1298y7 == null || (listM3815g = c1298y7.m3815g()) == null || listM3815g.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f1120n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1121o;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C1262u7 c1262u7 = this.f1122p;
        int iHashCode4 = (iHashCode3 + (c1262u7 != null ? c1262u7.hashCode() : 0)) * 31;
        C1298y7 c1298y7 = this.f1124r;
        int iHashCode5 = (iHashCode4 + (c1298y7 != null ? c1298y7.hashCode() : 0)) * 31;
        C1148o7 c1148o7 = this.f1125s;
        int iHashCode6 = (iHashCode5 + (c1148o7 != null ? c1148o7.hashCode() : 0)) * 31;
        C1138n7 c1138n7 = this.f1127u;
        int iHashCode7 = (iHashCode6 + (c1138n7 != null ? c1138n7.hashCode() : 0)) * 31;
        Set set = this.f1129w;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f1130x;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f1127u != null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: m */
    public Uri mo1365m() {
        C1298y7 c1298y7 = this.f1124r;
        if (c1298y7 != null) {
            return c1298y7.m3811c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: m0 */
    public Uri mo1366m0() {
        return mo1365m();
    }

    /* renamed from: r1 */
    public C1138n7 m1367r1() {
        return this.f1127u;
    }

    /* renamed from: s1 */
    public C1148o7 m1368s1() {
        return this.f1125s;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f1120n + "', adDescription='" + this.f1121o + "', systemInfo=" + this.f1122p + ", videoCreative=" + this.f1124r + ", companionAd=" + this.f1125s + ", adVerifications=" + this.f1127u + ", impressionTrackers=" + this.f1129w + ", errorTrackers=" + this.f1130x + '}';
    }

    /* renamed from: u1 */
    public String m1369u1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: v0 */
    public Uri mo1370v0() {
        C1307z7 c1307z7M1346C1 = m1346C1();
        if (c1307z7M1346C1 != null) {
            return c1307z7M1346C1.m3899e();
        }
        return null;
    }

    /* renamed from: v1 */
    public c m1371v1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    /* renamed from: x1 */
    public C1182r7 m1372x1() {
        C1298y7 c1298y7 = this.f1124r;
        if (c1298y7 != null) {
            return c1298y7.m3814f();
        }
        return null;
    }

    /* renamed from: y1 */
    public long m1373y1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    /* renamed from: z1 */
    public C1262u7 m1374z1() {
        return this.f1122p;
    }

    private C1088l7(b bVar) {
        super(bVar.f1131a, bVar.f1132b, bVar.f1133c);
        this.f1120n = bVar.f1135e;
        this.f1122p = bVar.f1137g;
        this.f1121o = bVar.f1136f;
        this.f1124r = bVar.f1138h;
        this.f1125s = bVar.f1139i;
        this.f1127u = bVar.f1140j;
        this.f1129w = bVar.f1141k;
        this.f1130x = bVar.f1142l;
        this.f1128v = new C1055i4(this);
        Uri uriMo1370v0 = mo1370v0();
        if (uriMo1370v0 != null) {
            this.f1126t = uriMo1370v0.toString();
        } else {
            this.f1126t = "";
        }
        this.f1123q = bVar.f1134d;
    }

    /* renamed from: a */
    public Set m1362a(d dVar, String[] strArr) {
        this.sdk.m2847O();
        if (C1240o.m3200a()) {
            this.sdk.m2847O().m3211a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f1129w;
        }
        if (dVar == d.VIDEO_CLICK) {
            return m1339A1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return m1343t1();
        }
        if (dVar == d.VIDEO) {
            return m1341a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return m1341a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return m1372x1().m2349b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return m1372x1().m2353f();
        }
        if (dVar == d.ERROR) {
            return this.f1130x;
        }
        this.sdk.m2847O();
        if (C1240o.m3200a()) {
            this.sdk.m2847O().m3214b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.EMPTY_SET;
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public C1055i4 getAdEventTracker() {
        return this.f1128v;
    }

    /* renamed from: a */
    private Set m1341a(c cVar, String[] strArr) {
        Map mapM2025d;
        C1148o7 c1148o7;
        C1298y7 c1298y7;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (c1298y7 = this.f1124r) != null) {
                mapM2025d = c1298y7.m3813e();
            } else {
                mapM2025d = (cVar != c.COMPANION_AD || (c1148o7 = this.f1125s) == null) ? null : c1148o7.m2025d();
            }
            HashSet hashSet = new HashSet();
            if (mapM2025d != null && !mapM2025d.isEmpty()) {
                for (String str : strArr) {
                    if (mapM2025d.containsKey(str)) {
                        hashSet.addAll((Collection) mapM2025d.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.EMPTY_SET;
    }

    /* renamed from: a */
    public static C1088l7 m1340a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f1132b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f1131a = jSONObject3;
        bVar.f1133c = c1220k;
        bVar.f1134d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f1135e = JsonUtils.getString(jSONObject, C3034d9.h.f8063D0, "");
        bVar.f1136f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f1137g = C1262u7.m3408a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), c1220k);
        bVar.f1138h = C1298y7.m3807a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), c1220k);
        bVar.f1139i = C1148o7.m2022a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), c1220k);
        bVar.f1140j = C1138n7.m1907a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), c1220k);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            C1271v7 c1271v7M3575a = C1271v7.m3575a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), c1220k);
            if (c1271v7M3575a != null) {
                hashSet.add(c1271v7M3575a);
            }
        }
        bVar.f1141k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            C1271v7 c1271v7M3575a2 = C1271v7.m3575a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), c1220k);
            if (c1271v7M3575a2 != null) {
                hashSet2.add(c1271v7M3575a2);
            }
        }
        bVar.f1142l = hashSet2;
        C1088l7 c1088l7 = new C1088l7(bVar);
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("cached_ad_html_resources_urls", jSONObject);
        for (int i3 = 0; i3 < jSONArrayOooOOoo.length(); i3++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArrayOooOOoo, i3, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    c1088l7.m2574a(Uri.parse(str));
                }
            }
        }
        return c1088l7;
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f1123q);
        JsonUtils.putString(jSONObject, C3034d9.h.f8063D0, this.f1120n);
        JsonUtils.putString(jSONObject, "ad_description", this.f1121o);
        C1262u7 c1262u7 = this.f1122p;
        if (c1262u7 != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", c1262u7.mo1363a());
        }
        C1298y7 c1298y7 = this.f1124r;
        if (c1298y7 != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", c1298y7.mo1363a());
        }
        C1148o7 c1148o7 = this.f1125s;
        if (c1148o7 != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", c1148o7.mo1363a());
        }
        C1138n7 c1138n7 = this.f1127u;
        if (c1138n7 != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", c1138n7.mo1363a());
        }
        if (this.f1129w != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f1129w.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1271v7) it.next()).mo1363a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f1130x != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f1130x.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((C1271v7) it2.next()).mo1363a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = m2615l().iterator();
        while (it3.hasNext()) {
            arrayList.add(((Uri) it3.next()).toString());
        }
        JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray((Collection) arrayList));
        C1026f5 c1026f5 = this.synchronizedFullResponse;
        if (c1026f5 != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", c1026f5.m730a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}

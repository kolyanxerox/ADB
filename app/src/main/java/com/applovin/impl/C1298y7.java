package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.y7 */
/* loaded from: classes.dex */
public class C1298y7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private List f3164a;

    /* renamed from: b */
    private List f3165b;

    /* renamed from: c */
    private int f3166c;

    /* renamed from: d */
    private Uri f3167d;

    /* renamed from: e */
    private final Set f3168e;

    /* renamed from: f */
    private C1182r7 f3169f;

    /* renamed from: g */
    private final Map f3170g;

    private C1298y7() {
        List list = Collections.EMPTY_LIST;
        this.f3164a = list;
        this.f3165b = list;
        this.f3168e = new HashSet();
        this.f3170g = new HashMap();
    }

    /* renamed from: a */
    public static C1298y7 m3806a(C1099m8 c1099m8, C1298y7 c1298y7, AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        C1099m8 c1099m8M1515c;
        C1182r7 c1182r7M2347a;
        List listM1511a;
        C1099m8 c1099m8M1515c2;
        List listM3808a;
        C1099m8 c1099m8M1515c3;
        int iM3805a;
        if (c1099m8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (abstractC1157p7 == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c1298y7 == null) {
            try {
                c1298y7 = new C1298y7(abstractC1157p7);
            } catch (Throwable th) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("VastVideoCreative", "Error occurred while initializing", th);
                }
                c1220k.m2832E().m2152a("VastVideoCreative", th);
                return null;
            }
        }
        if (c1298y7.f3166c == 0 && (c1099m8M1515c3 = c1099m8.m1515c("Duration")) != null && (iM3805a = m3805a(c1099m8M1515c3.m1517d(), c1220k)) > 0) {
            c1298y7.f3166c = iM3805a;
        }
        C1099m8 c1099m8M1515c4 = c1099m8.m1515c("MediaFiles");
        if (c1099m8M1515c4 != null && (listM3808a = m3808a(c1099m8M1515c4, c1220k)) != null && listM3808a.size() > 0) {
            List list = c1298y7.f3164a;
            if (list != null) {
                listM3808a.addAll(list);
            }
            c1298y7.f3164a = listM3808a;
        }
        C1099m8 c1099m8M1515c5 = c1099m8.m1515c("VideoClicks");
        if (c1099m8M1515c5 != null) {
            if (c1298y7.f3167d == null && (c1099m8M1515c2 = c1099m8M1515c5.m1515c("ClickThrough")) != null) {
                String strM1517d = c1099m8M1515c2.m1517d();
                if (StringUtils.isValidString(strM1517d)) {
                    c1298y7.f3167d = Uri.parse(strM1517d);
                }
            }
            AbstractC1289x7.m3670a(c1099m8M1515c5.m1511a("ClickTracking"), c1298y7.f3168e, abstractC1157p7, c1220k);
        }
        C1099m8 c1099m8M1515c6 = c1099m8.m1515c("Icons");
        if (c1099m8M1515c6 != null && (c1182r7M2347a = C1182r7.m2347a((c1099m8M1515c = c1099m8M1515c6.m1515c("Icon")), c1220k)) != null) {
            C1099m8 c1099m8M1515c7 = c1099m8M1515c.m1515c("IconClicks");
            if (c1099m8M1515c7 != null && (listM1511a = c1099m8M1515c7.m1511a("IconClickTracking")) != null) {
                AbstractC1289x7.m3670a(listM1511a, c1182r7M2347a.f1864a, abstractC1157p7, c1220k);
            }
            List listM1511a2 = c1099m8M1515c.m1511a("IconViewTracking");
            if (listM1511a2 != null) {
                AbstractC1289x7.m3670a(listM1511a2, c1182r7M2347a.f1865b, abstractC1157p7, c1220k);
            }
            c1298y7.f3169f = c1182r7M2347a;
        }
        AbstractC1289x7.m3668a(c1099m8, c1298y7.f3170g, abstractC1157p7, c1220k);
        return c1298y7;
    }

    /* renamed from: b */
    public Set m3810b() {
        return this.f3168e;
    }

    /* renamed from: c */
    public Uri m3811c() {
        return this.f3167d;
    }

    /* renamed from: d */
    public int m3812d() {
        return this.f3166c;
    }

    /* renamed from: e */
    public Map m3813e() {
        return this.f3170g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1298y7)) {
            return false;
        }
        C1298y7 c1298y7 = (C1298y7) obj;
        if (this.f3166c != c1298y7.f3166c) {
            return false;
        }
        List list = this.f3164a;
        if (list == null ? c1298y7.f3164a != null : !list.equals(c1298y7.f3164a)) {
            return false;
        }
        Uri uri = this.f3167d;
        if (uri == null ? c1298y7.f3167d != null : !uri.equals(c1298y7.f3167d)) {
            return false;
        }
        Set set = this.f3168e;
        if (set == null ? c1298y7.f3168e != null : !set.equals(c1298y7.f3168e)) {
            return false;
        }
        Map map = this.f3170g;
        Map map2 = c1298y7.f3170g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    /* renamed from: f */
    public C1182r7 m3814f() {
        return this.f3169f;
    }

    /* renamed from: g */
    public List m3815g() {
        return this.f3164a;
    }

    public int hashCode() {
        List list = this.f3164a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f3166c) * 31;
        Uri uri = this.f3167d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f3168e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f3170g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f3164a + ", durationSeconds=" + this.f3166c + ", destinationUri=" + this.f3167d + ", clickTrackers=" + this.f3168e + ", eventTrackers=" + this.f3170g + ", industryIcon=" + this.f3169f + '}';
    }

    private C1298y7(AbstractC1157p7 abstractC1157p7) {
        List list = Collections.EMPTY_LIST;
        this.f3164a = list;
        this.f3165b = list;
        this.f3168e = new HashSet();
        this.f3170g = new HashMap();
        this.f3165b = abstractC1157p7.m2084f();
    }

    /* renamed from: a */
    private static int m3805a(String str, C1220k c1220k) {
        try {
            if (CollectionUtils.explode(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER).size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static List m3808a(C1099m8 c1099m8, C1220k c1220k) {
        List listM1511a = c1099m8.m1511a("MediaFile");
        ArrayList arrayList = new ArrayList(listM1511a.size());
        List<String> listExplode = CollectionUtils.explode((String) c1220k.m2866a(C1268v4.f2599I4));
        List<String> listExplode2 = CollectionUtils.explode((String) c1220k.m2866a(C1268v4.f2591H4));
        Iterator it = listM1511a.iterator();
        while (it.hasNext()) {
            C1307z7 c1307z7M3893a = C1307z7.m3893a((C1099m8) it.next(), c1220k);
            if (c1307z7M3893a != null) {
                try {
                    String strM3897c = c1307z7M3893a.m3897c();
                    if (StringUtils.isValidString(strM3897c) && !listExplode.contains(strM3897c)) {
                        arrayList.add(c1307z7M3893a);
                    } else {
                        if (((Boolean) c1220k.m2866a(C1268v4.f2607J4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(c1307z7M3893a.m3899e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(c1307z7M3893a);
                            }
                        }
                        c1220k.m2847O();
                        if (C1240o.m3200a()) {
                            c1220k.m2847O().m3218k("VastVideoCreative", "Video file not supported: " + c1307z7M3893a);
                        }
                    }
                } catch (Throwable th) {
                    c1220k.m2847O();
                    if (C1240o.m3200a()) {
                        c1220k.m2847O().m3212a("VastVideoCreative", "Failed to validate video file: " + c1307z7M3893a, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* renamed from: a */
    public C1307z7 m3809a(long j) {
        List list = this.f3164a;
        C1307z7 c1307z7 = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f3165b) {
            for (C1307z7 c1307z72 : this.f3164a) {
                String strM3897c = c1307z72.m3897c();
                if (StringUtils.isValidString(strM3897c) && str.equalsIgnoreCase(strM3897c)) {
                    arrayList.add(c1307z72);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<C1307z7> arrayList2 = arrayList;
        if (zIsEmpty) {
            arrayList2 = this.f3164a;
        }
        Collections.sort(arrayList2, new o000O0O0(0));
        for (C1307z7 c1307z73 : arrayList2) {
            if (c1307z73.m3896b() > j) {
                break;
            }
            c1307z7 = c1307z73;
        }
        return c1307z7 != null ? c1307z7 : (C1307z7) arrayList2.get(0);
    }

    /* renamed from: a */
    public static /* synthetic */ int m3804a(C1307z7 c1307z7, C1307z7 c1307z72) {
        return Long.compare(c1307z7.m3896b(), c1307z72.m3896b());
    }

    /* renamed from: a */
    public static C1298y7 m3807a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        C1298y7 c1298y7 = new C1298y7();
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("video_files", jSONObject);
        c1298y7.f3164a = new ArrayList();
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            C1307z7 c1307z7M3894a = C1307z7.m3894a(JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null), c1220k);
            if (c1307z7M3894a != null) {
                c1298y7.f3164a.add(c1307z7M3894a);
            }
        }
        c1298y7.f3165b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        c1298y7.f3166c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        c1298y7.f3167d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArrayOooOOoo2 = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("click_trackers", jSONObject);
        for (int i2 = 0; i2 < jSONArrayOooOOoo2.length(); i2++) {
            C1271v7 c1271v7M3575a = C1271v7.m3575a(JsonUtils.getJSONObject(jSONArrayOooOOoo2, i2, (JSONObject) null), c1220k);
            if (c1271v7M3575a != null) {
                c1298y7.f3168e.add(c1271v7M3575a);
            }
        }
        c1298y7.f3169f = C1182r7.m2348a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), c1220k);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArrayOooOOoo3 = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo(next, jSONObject2);
            for (int i3 = 0; i3 < jSONArrayOooOOoo3.length(); i3++) {
                C1271v7 c1271v7M3575a2 = C1271v7.m3575a(JsonUtils.getJSONObject(jSONArrayOooOOoo3, i3, (JSONObject) null), c1220k);
                if (c1271v7M3575a2 != null) {
                    hashSet.add(c1271v7M3575a2);
                }
            }
            c1298y7.f3170g.put(next, hashSet);
        }
        return c1298y7;
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f3164a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1307z7) it.next()).mo1363a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f3165b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f3166c);
        Uri uri = this.f3167d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f3168e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((C1271v7) it2.next()).mo1363a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        C1182r7 c1182r7 = this.f3169f;
        if (c1182r7 != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", c1182r7.mo1363a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f3170g.keySet()) {
            Set set = (Set) this.f3170g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((C1271v7) it3.next()).mo1363a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}

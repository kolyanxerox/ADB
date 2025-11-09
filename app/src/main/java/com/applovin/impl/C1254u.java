package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.u */
/* loaded from: classes.dex */
public final class C1254u {

    /* renamed from: e */
    private static final Map f2411e = new HashMap();

    /* renamed from: f */
    private static final Object f2412f = new Object();

    /* renamed from: a */
    private JSONObject f2413a;

    /* renamed from: b */
    private final String f2414b;

    /* renamed from: c */
    private AppLovinAdSize f2415c;

    /* renamed from: d */
    private AppLovinAdType f2416d;

    private C1254u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f2415c = appLovinAdSize;
        this.f2416d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z ? OooO0oO.OooOo.OooOoo0(lowerCase, "_bidding") : lowerCase;
        this.f2414b = z2 ? OooO0oO.OooOo.OooOoo0(lowerCase, "_direct_sold") : lowerCase;
    }

    /* renamed from: a */
    public static C1254u m3363a(String str) {
        return m3361a(null, null, str);
    }

    /* renamed from: b */
    public static C1254u m3367b(String str) {
        return m3361a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    /* renamed from: c */
    public static C1254u m3368c() {
        return m3360a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    /* renamed from: h */
    public static C1254u m3369h() {
        return m3360a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    /* renamed from: j */
    public static C1254u m3370j() {
        return m3360a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    /* renamed from: k */
    public static C1254u m3371k() {
        return m3360a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    /* renamed from: l */
    public static C1254u m3372l() {
        return m3360a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    /* renamed from: m */
    public static C1254u m3373m() {
        return m3360a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    /* renamed from: d */
    public MaxAdFormat m3374d() {
        AppLovinAdSize appLovinAdSizeM3376f = m3376f();
        if (appLovinAdSizeM3376f == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeM3376f == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeM3376f == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeM3376f != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeM3376f == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (m3377g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (m3377g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (m3377g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    /* renamed from: e */
    public String m3375e() {
        return this.f2414b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1254u.class != obj.getClass()) {
            return false;
        }
        return this.f2414b.equalsIgnoreCase(((C1254u) obj).f2414b);
    }

    /* renamed from: f */
    public AppLovinAdSize m3376f() {
        if (this.f2415c == null && JsonUtils.valueExists(this.f2413a, "ad_size")) {
            this.f2415c = AppLovinAdSize.fromString(JsonUtils.getString(this.f2413a, "ad_size", null));
        }
        return this.f2415c;
    }

    /* renamed from: g */
    public AppLovinAdType m3377g() {
        if (this.f2416d == null && JsonUtils.valueExists(this.f2413a, "ad_type")) {
            this.f2416d = AppLovinAdType.fromString(JsonUtils.getString(this.f2413a, "ad_type", null));
        }
        return this.f2416d;
    }

    public int hashCode() {
        return this.f2414b.hashCode();
    }

    /* renamed from: i */
    public boolean m3378i() {
        return m3364a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f2414b + ", zoneObject=" + this.f2413a + '}';
    }

    /* renamed from: a */
    public static C1254u m3360a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return m3361a(appLovinAdSize, appLovinAdType, null);
    }

    /* renamed from: b */
    public static C1254u m3366b() {
        return m3360a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    /* renamed from: a */
    public static C1254u m3361a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return m3362a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    /* renamed from: a */
    public static C1254u m3362a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        C1254u c1254u = new C1254u(appLovinAdSize, appLovinAdType, str, z, z2);
        synchronized (f2412f) {
            try {
                String str2 = c1254u.f2414b;
                Map map = f2411e;
                if (map.containsKey(str2)) {
                    c1254u = (C1254u) map.get(str2);
                } else {
                    map.put(str2, c1254u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1254u;
    }

    /* renamed from: a */
    public static void m3365a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f2412f) {
                try {
                    C1254u c1254u = (C1254u) f2411e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                    if (c1254u != null) {
                        c1254u.f2415c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        c1254u.f2416d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public static Collection m3364a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, m3368c(), m3371k(), m3370j(), m3373m(), m3366b(), m3369h(), m3372l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}

package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.t3 */
/* loaded from: classes.dex */
public abstract class AbstractC1249t3 {

    /* renamed from: a */
    private static final TreeMap f2380a;

    /* renamed from: b */
    private static final Map f2381b;

    /* renamed from: c */
    private static final List f2382c;

    /* renamed from: d */
    private static JSONArray f2383d;

    /* renamed from: e */
    private static final Map f2384e = new HashMap();

    /* renamed from: f */
    private static final Object f2385f = new Object();

    /* renamed from: g */
    private static final Map f2386g = Collections.synchronizedMap(new HashMap(1));

    static {
        TreeMap treeMap = new TreeMap();
        f2380a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdjoeAdsMediationAdapter", "adjoe Ads");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "PubMatic");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.LinkedInDSPAdapter", "LinkedIn");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.ALYsoNetworkMediationAdapter", "YSO Network");
        treeMap.put("com.applovin.mediation.adapters.YsoNetworkMediationAdapter", "YSO Network");
        f2382c = new ArrayList(treeMap.keySet());
        HashMap map = new HashMap();
        f2381b = map;
        map.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "3.0.1.1");
        map.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "6.5.0.8.1");
        map.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "9.7.0.3");
        map.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "6.17.0.1");
        map.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "6.4.2.1");
        map.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "10.7.7.1");
        map.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "8.3.6.1");
        map.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "8.3.0.0.2");
        map.put("com.applovin.mediation.adapters.LineMediationAdapter", "2024.8.27.1");
        map.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "16.8.51.1");
        map.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "1.7.6.1");
        map.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "3.1.0.1");
        map.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "5.22.1.1");
        map.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "3.9.0.2");
        map.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "22.7.0.1");
        map.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "4.12.2.1");
        map.put("com.applovin.mediation.adapters.VerveMediationAdapter", "3.0.4.1");
        map.put("com.applovin.mediation.adapters.VungleMediationAdapter", "7.4.1.1");
        map.put("com.applovin.mediation.adapters.YandexMediationAdapter", "7.4.0.1");
    }

    /* renamed from: a */
    public static List m3319a(C1220k c1220k) {
        HashSet hashSet;
        ArrayList arrayList = new ArrayList(c1220k.m2888c(AbstractC1144o3.f1633d7));
        if (!((Boolean) c1220k.m2866a(AbstractC1144o3.f1635e7)).booleanValue()) {
            return arrayList;
        }
        synchronized (f2385f) {
            hashSet = new HashSet(f2384e.keySet());
        }
        arrayList.retainAll(hashSet);
        return arrayList;
    }

    /* renamed from: b */
    public static JSONArray m3325b(C1220k c1220k) {
        synchronized (f2385f) {
            try {
                if (f2383d != null) {
                    m3330d(c1220k);
                    return f2383d;
                }
                f2383d = new JSONArray();
                for (String str : f2382c) {
                    MaxAdapter maxAdapterM3315a = m3315a(str, c1220k);
                    if (maxAdapterM3315a != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("name", f2380a.get(str));
                            jSONObject.put(Constants.CLASS, str);
                            jSONObject.put("sdk_version", m3318a(maxAdapterM3315a));
                            jSONObject.put("version", maxAdapterM3315a.getAdapterVersion());
                            jSONObject.put("is_supported", m3321a(maxAdapterM3315a, str));
                        } catch (Throwable unused) {
                        }
                        f2383d.put(jSONObject);
                        f2384e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
                    }
                }
                return f2383d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    private static void m3329c(JSONObject jSONObject, String str, C1220k c1220k) {
        synchronized (f2385f) {
            try {
                if (StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", ""))) {
                    return;
                }
                MaxAdapter maxAdapterM3315a = m3315a(str, c1220k);
                if (maxAdapterM3315a == null) {
                    return;
                }
                String strM3318a = m3318a(maxAdapterM3315a);
                if (TextUtils.isEmpty(strM3318a)) {
                    return;
                }
                JsonUtils.putString(jSONObject, "sdk_version", strM3318a);
                f2384e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    private static void m3330d(C1220k c1220k) {
        synchronized (f2385f) {
            for (int i = 0; i < f2383d.length(); i++) {
                try {
                    JSONObject jSONObject = JsonUtils.getJSONObject(f2383d, i, (JSONObject) null);
                    String string = JsonUtils.getString(jSONObject, Constants.CLASS, "");
                    m3326b(jSONObject, string, c1220k);
                    m3329c(jSONObject, string, c1220k);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: e */
    public static void m3331e(C1220k c1220k) {
        JSONArray jSONArrayM3325b = m3325b(c1220k);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayM3325b.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayM3325b, i, (JSONObject) null);
            if (!JsonUtils.getBoolean(jSONObject, "is_supported", Boolean.TRUE).booleanValue()) {
                arrayList.add(JsonUtils.getString(jSONObject, "name", "unknown") + " (" + JsonUtils.getString(jSONObject, "version", "unknown") + ")");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String strJoin = StringUtils.join(", ", arrayList);
        String strOooOO0 = OooO0oO.OooOo.OooOO0("Please update to the latest adapter versions. Incompatible adapter(s) found: ", strJoin);
        if (AbstractC1078k7.m1228c(c1220k)) {
            throw new IllegalArgumentException(strOooOO0);
        }
        C1240o.m3207h("MediationUtils", strOooOO0);
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("details", strJoin, map);
        c1220k.m2832E().m576d(C0993c2.f474E0, map);
    }

    /* renamed from: a */
    public static String m3318a(MaxAdapter maxAdapter) {
        try {
            return StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (Throwable th) {
            C1240o.m3204c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th);
            return "";
        }
    }

    /* renamed from: a */
    public static MaxMediatedNetworkInfo m3314a(String str) {
        MaxMediatedNetworkInfo maxMediatedNetworkInfo;
        synchronized (f2385f) {
            maxMediatedNetworkInfo = (MaxMediatedNetworkInfo) f2384e.get(str);
        }
        if (maxMediatedNetworkInfo != null) {
            return maxMediatedNetworkInfo;
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, Constants.CLASS, str);
        return new MaxMediatedNetworkInfoImpl(jSONObject);
    }

    /* renamed from: c */
    public static Map m3328c(C1220k c1220k) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(c1220k.m2930x0().m1108e());
        if (!((Boolean) c1220k.m2866a(C1268v4.f2566E3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", "");
        map.put("{CUSTOM_DATA}", "");
        map.put("{CREATIVE_ID}", "");
        return map;
    }

    /* renamed from: a */
    public static boolean m3321a(MaxAdapter maxAdapter, String str) {
        String str2 = (String) f2381b.get(str);
        return TextUtils.isEmpty(str2) || AbstractC1078k7.m1158a(maxAdapter.getAdapterVersion(), str2) >= 0;
    }

    /* renamed from: b */
    private static void m3326b(JSONObject jSONObject, String str, C1220k c1220k) {
        synchronized (f2385f) {
            try {
                Integer numM1770a = c1220k.m2852S().m1770a(str);
                if (numM1770a == null) {
                    return;
                }
                JsonUtils.putInt(jSONObject, "initialization_status", numM1770a.intValue());
                f2384e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static MaxAdapter m3315a(String str, C1220k c1220k) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(c1220k.m2934z0());
        }
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3214b("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m3327b(Object obj) {
        return (obj instanceof AbstractC1266v2) && "APPLOVIN".equals(((AbstractC1266v2) obj).m914k());
    }

    /* renamed from: b */
    public static AppLovinSdkUtils.Size m3324b(int i, MaxAdFormat maxAdFormat, Context context) {
        try {
            int i2 = AdSize.FULL_WIDTH;
            Method method = AdSize.class.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
            Method method2 = AdSize.class.getMethod("getWidth", null);
            Method method3 = AdSize.class.getMethod("getHeight", null);
            Object objInvoke = method.invoke(null, context, Integer.valueOf(i));
            AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(((Integer) method2.invoke(objInvoke, null)).intValue(), ((Integer) method3.invoke(objInvoke, null)).intValue());
            f2386g.put(Integer.valueOf(i), size);
            return size;
        } catch (Throwable unused) {
            return maxAdFormat.getSize();
        }
    }

    /* renamed from: a */
    public static boolean m3322a(Object obj) {
        return (obj instanceof AbstractC1207b) && StringUtils.isValidString(((AbstractC1207b) obj).getMediationServeId());
    }

    /* renamed from: a */
    public static AppLovinSdkUtils.Size m3317a(int i, MaxAdFormat maxAdFormat, Context context) {
        if (i < 0) {
            i = AppLovinSdkUtils.pxToDp(context, AbstractC1141o0.m1931a(context).x);
        }
        Map map = f2386g;
        if (map.containsKey(Integer.valueOf(i))) {
            return (AppLovinSdkUtils.Size) map.get(Integer.valueOf(i));
        }
        if (Boolean.TRUE.equals((Boolean) C1295y4.m3787a(C1286x4.f3037I, Boolean.FALSE, context))) {
            return m3316a(i, context);
        }
        return m3324b(i, maxAdFormat, context);
    }

    /* renamed from: a */
    public static AppLovinSdkUtils.Size m3316a(int i, Context context) {
        int iRound;
        if (i >= 600) {
            iRound = Math.round(i / 8.088889f);
        } else if (i > 450) {
            iRound = Math.round(i / 7.8f);
        } else {
            iRound = Math.round(i / 6.4f);
        }
        AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(i, Math.max(50, Math.min(iRound, Math.min(90, Math.round(AppLovinSdkUtils.pxToDp(context, AbstractC1141o0.m1938b(context).y) * 0.15f)))));
        f2386g.put(Integer.valueOf(i), size);
        return size;
    }

    /* renamed from: a */
    public static boolean m3323a(JSONObject jSONObject, String str, C1220k c1220k) {
        if (!JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray("no_fill_reason"), IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "code")) {
            return false;
        }
        String strOooOO0 = OooO0oO.OooOo.OooOO0("invalid_or_disabled_ad_unit_id", str);
        c1220k.m2832E().m573a(C0993c2.f474E0, "invalid_or_disabled_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), strOooOO0);
        return true;
    }

    /* renamed from: a */
    public static Map m3320a(AbstractC1266v2 abstractC1266v2, C1220k c1220k) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(c1220k.m2930x0().m1108e());
        if (!((Boolean) c1220k.m2866a(C1268v4.f2566E3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", StringUtils.emptyIfNull(abstractC1266v2.getPlacement()));
        map.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(abstractC1266v2.m907e()));
        map.put("{CREATIVE_ID}", StringUtils.emptyIfNull(abstractC1266v2.getCreativeId()));
        return map;
    }
}

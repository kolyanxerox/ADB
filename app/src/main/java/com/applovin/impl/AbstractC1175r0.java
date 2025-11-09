package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.C1166q0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3896z8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC1175r0 {

    /* renamed from: a */
    private static final int[] f1835a = {7, 4, 2, 1, 11};

    /* renamed from: b */
    private static final int[] f1836b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c */
    private static final int[] f1837c = {15, 13};

    /* renamed from: d */
    private static final int[] f1838d = {20};

    /* renamed from: a */
    public static boolean m2291a(int i) {
        return i < 200 || i >= 300;
    }

    /* renamed from: b */
    public static String m2297b(String str, C1220k c1220k) {
        return m2287a((String) c1220k.m2866a(C1268v4.f2868q0), str, c1220k);
    }

    /* renamed from: c */
    public static Map m2299c(C1220k c1220k) {
        HashMap map = new HashMap();
        String str = (String) c1220k.m2866a(C1268v4.f2811j);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) c1220k.m2866a(C1268v4.f2743a5)).booleanValue()) {
            map.put("api_key", c1220k.m2904j0());
        }
        map.putAll(AbstractC1078k7.m1180a(c1220k.m2827B().m2996e()));
        return map;
    }

    /* renamed from: d */
    public static String m2301d(C1220k c1220k) {
        return m2287a((String) c1220k.m2866a(C1268v4.f2860p0), "4.0/ad", c1220k);
    }

    /* renamed from: e */
    public static String m2302e(C1220k c1220k) {
        return m2287a((String) c1220k.m2866a(C1268v4.f2852o0), "4.0/ad", c1220k);
    }

    /* renamed from: f */
    public static Long m2303f(C1220k c1220k) {
        C1166q0.d dVarM2133a = c1220k.m2929x().m2133a();
        if (dVarM2133a == null) {
            return null;
        }
        double dM1221c = AbstractC1078k7.m1221c(dVarM2133a.m2144b());
        double dM1229d = AbstractC1078k7.m1229d(dVarM2133a.m2142a());
        if (dM1229d == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (dM1221c / dM1229d));
    }

    /* renamed from: g */
    public static String m2304g(C1220k c1220k) {
        NetworkInfo networkInfoM2295b = m2295b(C1220k.m2824o());
        if (networkInfoM2295b != null) {
            int type = networkInfoM2295b.getType();
            int subtype = networkInfoM2295b.getSubtype();
            if (type == 1) {
                return C3896z8.f12930b;
            }
            if (type == 0) {
                return m2292a(subtype, f1835a) ? "2g" : m2292a(subtype, f1836b) ? C3896z8.f12929a : m2292a(subtype, f1837c) ? "4g" : m2292a(subtype, f1838d) ? "5g" : "mobile";
            }
        }
        return "unknown";
    }

    /* renamed from: a */
    public static String m2286a(String str, C1220k c1220k) {
        return m2287a((String) c1220k.m2866a(C1268v4.f2876r0), str, c1220k);
    }

    /* renamed from: b */
    public static void m2298b(JSONObject jSONObject, C1220k c1220k) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            c1220k.m2885b(C1286x4.f3035G, string);
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3215d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    /* renamed from: a */
    public static void m2290a(JSONObject jSONObject, boolean z, C1220k c1220k) {
        c1220k.m2923u().m2776a(jSONObject, z);
    }

    /* renamed from: a */
    public static void m2288a(int i, C1220k c1220k) {
        if (i == 401) {
            C1240o.m3207h("AppLovinSdk", "SDK key \"" + c1220k.m2904j0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i == 418) {
            c1220k.m2914p0().m3609a(C1268v4.f2771e, Boolean.TRUE);
            c1220k.m2914p0().m3614e();
        } else if (i >= 400 && i < 500) {
            if (((Boolean) c1220k.m2866a(C1268v4.f2787g)).booleanValue()) {
                c1220k.m2858V0();
            }
        } else if (i == -1 && ((Boolean) c1220k.m2866a(C1268v4.f2787g)).booleanValue()) {
            c1220k.m2858V0();
        }
    }

    /* renamed from: b */
    private static NetworkInfo m2295b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: c */
    public static void m2300c(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1220k != null) {
            try {
                if (jSONObject.has("settings")) {
                    C1277w4 c1277w4M2914p0 = c1220k.m2914p0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                    c1277w4M2914p0.m3610a(jSONObject2);
                    c1277w4M2914p0.m3614e();
                    String strM3553b = C1268v4.f2930x6.m3553b();
                    if (JsonUtils.valueExists(jSONObject2, strM3553b)) {
                        C1295y4.m3793b(C1286x4.f3037I, JsonUtils.getBoolean(jSONObject2, strM3553b, Boolean.FALSE), C1220k.m2824o());
                        return;
                    }
                    return;
                }
                return;
            } catch (JSONException e) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("ConnectionUtils", "Unable to parse settings out of API response", e);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* renamed from: b */
    public static String m2296b(C1220k c1220k) {
        return m2287a((String) c1220k.m2866a(C1268v4.f2852o0), ((Boolean) c1220k.m2866a(C1268v4.f2783f3)).booleanValue() ? "5.0/ad" : "4.0/ad", c1220k);
    }

    /* renamed from: a */
    public static String m2287a(String str, String str2, C1220k c1220k) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (c1220k != null) {
            return str.concat(str2);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* renamed from: a */
    public static void m2289a(JSONObject jSONObject, C1220k c1220k) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1220k.m2824o()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    C1295y4.m3792a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            if (((Boolean) c1220k.m2866a(C1268v4.f2898t6)).booleanValue()) {
                C1295y4.m3791a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m2294a(InputStream inputStream, C1220k c1220k) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) c1220k.m2866a(C1268v4.f2725Y2)).intValue()];
        while (true) {
            int i = inputStream.read(bArr);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: a */
    public static boolean m2293a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoM2295b = m2295b(context);
        if (networkInfoM2295b != null) {
            return networkInfoM2295b.isConnected();
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2292a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m2285a(C1220k c1220k) {
        return m2287a((String) c1220k.m2866a(C1268v4.f2860p0), ((Boolean) c1220k.m2866a(C1268v4.f2783f3)).booleanValue() ? "5.0/ad" : "4.0/ad", c1220k);
    }
}

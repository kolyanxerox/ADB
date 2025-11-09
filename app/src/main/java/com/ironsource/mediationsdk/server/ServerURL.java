package com.ironsource.mediationsdk.server;

import OooO0oO.OooOo;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.C2635a9;
import com.ironsource.C2959b4;
import com.ironsource.C3206i1;
import com.ironsource.C3359mb;
import com.ironsource.C3451ne;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3840xk;
import com.ironsource.C3896z8;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes2.dex */
public class ServerURL {
    private static final String AMPERSAND = "&";
    private static final String ANDROID = "android";
    private static final String APPLICATION_KEY = "applicationKey";
    private static final String APPLICATION_USER_ID = "applicationUserId";
    private static final String APPLICATION_VERSION = "appVer";
    private static final String AUID = "auid";
    private static String BASE_URL_PREFIX = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final String BASE_URL_SUFFIX = "?request=";
    private static final String BROWSER_USER_AGENT = "browserUserAgent";
    private static final String BUNDLE_ID = "bundleId";
    private static final String CONNECTION_TYPE = "connType";
    private static final String COPPA = "coppa";
    private static final String DEVICE_LANG = "deviceLang";
    private static final String DEVICE_MAKE = "devMake";
    private static final String DEVICE_MODEL = "devModel";
    private static final String EQUAL = "=";
    private static final String FIRST_SESSION = "fs";
    private static final String GAID = "advId";
    private static final String GOOGLE_FAMILY_SUPPORT = "dff";
    private static final String IMPRESSION = "impression";
    private static final String ISO_COUNTRY_CODE = "icc";
    private static final String IS_DEMAND_ONLY = "isDemandOnly";
    private static final String MEDIATION_TYPE = "mt";
    private static final String MOBILE_CARRIER = "mCar";
    private static final String MOBILE_COUNTRY_CODE = "mcc";
    private static final String MOBILE_NETWORK_CODE = "mnc";
    private static final String OS_VERSION = "osVer";
    private static final String PLACEMENT = "placementId";
    private static final String PLATFORM_KEY = "platform";
    private static final String PLUGIN_FW_VERSION = "plugin_fw_v";
    private static final String PLUGIN_TYPE = "pluginType";
    private static final String PLUGIN_VERSION = "pluginVersion";
    private static final String RAW_CONNECTION_TYPE = "rawConnType";
    private static final String REWARDED_VIDEO_MANUAL_MODE = "rvManual";
    private static final String SDK_VERSION = "sdkVersion";
    private static final String SERR = "serr";
    private static final String TEST_SUITE = "ts";
    private static final String TIME_ZONE_ID = "tz";
    private static final String TIME_ZONE_OFFSET = "tzOff";

    public static String buildInitURL(Context context, String str, String str2, String str3, String str4, boolean z, List<Pair<String, String>> list, boolean z2) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            OooO00o.OooOoOO("applicationUserId", str2, arrayList);
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z) {
            OooO00o.OooOoOO(REWARDED_VIDEO_MANUAL_MODE, "1", arrayList);
        }
        if (!IronSourceUtils.isEncryptedResponse()) {
            OooO00o.OooOoOO(SERR, "0", arrayList);
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(PLUGIN_TYPE, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(PLUGIN_VERSION, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(PLUGIN_FW_VERSION, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            OooO00o.OooOoOO(GAID, str3, arrayList);
        }
        if (!TextUtils.isEmpty(str4)) {
            OooO00o.OooOoOO("mt", str4, arrayList);
        }
        String strM7867b = C2959b4.m7867b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strM7867b)) {
            OooO00o.OooOoOO(APPLICATION_VERSION, strM7867b, arrayList);
        }
        arrayList.add(new Pair(OS_VERSION, Build.VERSION.SDK_INT + ""));
        OooO00o.OooOoOO(DEVICE_MAKE, Build.MANUFACTURER, arrayList);
        arrayList.add(new Pair(DEVICE_MODEL, Build.MODEL));
        arrayList.add(new Pair("fs", (IronSourceUtils.getFirstSession(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> concurrentHashMapM13074c = C3840xk.m13069b().m13074c();
        if (concurrentHashMapM13074c.containsKey(C3401a.f9915b)) {
            arrayList.add(new Pair(COPPA, concurrentHashMapM13074c.get(C3401a.f9915b).get(0)));
        }
        if (concurrentHashMapM13074c.containsKey(C3401a.f9919f)) {
            String str6 = concurrentHashMapM13074c.get(C3401a.f9919f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(C3401a.f9923j)) {
                OooO00o.OooOoOO("ts", "1", arrayList);
            }
        }
        if (concurrentHashMapM13074c.containsKey(C3401a.f9917d)) {
            String str7 = concurrentHashMapM13074c.get(C3401a.f9917d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase(C3401a.f9920g)) {
                OooO00o.OooOoOO(GOOGLE_FAMILY_SUPPORT, "1", arrayList);
            }
        }
        if (concurrentHashMapM13074c.containsKey(C3401a.f9918e) && (list2 = concurrentHashMapM13074c.get(C3401a.f9918e)) != null) {
            arrayList.add(new Pair(C3401a.f9918e, list2.get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            OooO00o.OooOoOO(CONNECTION_TYPE, connectionType, arrayList);
        }
        String strM4801d = C2635a9.m4801d(context);
        if (!TextUtils.isEmpty(strM4801d)) {
            OooO00o.OooOoOO(RAW_CONNECTION_TYPE, strM4801d, arrayList);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strMo4878t = interfaceC3767vfMo8686f.mo4878t();
        if (strMo4878t.length() != 0) {
            OooO00o.OooOoOO(BROWSER_USER_AGENT, strMo4878t, arrayList);
        }
        try {
            str5 = interfaceC3767vfMo8686f.mo4842b(context) + "-" + interfaceC3767vfMo8686f.mo4828I(context);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            OooO00o.OooOoOO(DEVICE_LANG, str5, arrayList);
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + C3896z8.m13300b(context)));
        arrayList.add(new Pair("mnc", "" + C3896z8.m13301c(context)));
        String strMo4867n = interfaceC3767vfMo8686f.mo4867n(context);
        if (!TextUtils.isEmpty(strMo4867n)) {
            OooO00o.OooOoOO("icc", strMo4867n, arrayList);
        }
        String strMo4859j = interfaceC3767vfMo8686f.mo4859j(context);
        if (!TextUtils.isEmpty(strMo4859j)) {
            OooO00o.OooOoOO(MOBILE_CARRIER, strMo4859j, arrayList);
        }
        String strMo4841b = interfaceC3767vfMo8686f.mo4841b();
        if (!TextUtils.isEmpty(strMo4841b)) {
            OooO00o.OooOoOO("tz", strMo4841b, arrayList);
        }
        arrayList.add(new Pair(TIME_ZONE_OFFSET, "" + interfaceC3767vfMo8686f.mo4872q()));
        String strMo4879t = interfaceC3767vfMo8686f.mo4879t(context);
        if (!TextUtils.isEmpty(strMo4879t)) {
            OooO00o.OooOoOO("auid", strMo4879t, arrayList);
        }
        if (z2) {
            OooO00o.OooOoOO("isDemandOnly", "1", arrayList);
        }
        OooO00o.OooOoOO(C3451ne.f10479h0, String.valueOf(C3206i1.m9248a()), arrayList);
        return OooOo.OooOOOo(new StringBuilder(), getBaseUrl(LevelPlay.getSdkVersion()), URLEncoder.encode(IronSourceAES.encode(C3359mb.m10015b().m10017c(), createURLParams(arrayList)), "UTF-8"));
    }

    private static String createURLParams(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String string = "";
        for (Pair<String, String> pair : list) {
            if (string.length() > 0) {
                string = string.concat("&");
            }
            StringBuilder sbOooOo0O = OooOo.OooOo0O(string);
            sbOooOo0O.append((String) pair.first);
            sbOooOo0O.append("=");
            sbOooOo0O.append(URLEncoder.encode((String) pair.second, "UTF-8"));
            string = sbOooOo0O.toString();
        }
        return string;
    }

    private static String getBaseUrl(String str) {
        return OooO00o.OooOOO0(new StringBuilder(), BASE_URL_PREFIX, str, BASE_URL_SUFFIX);
    }

    public static String getRequestURL(String str, boolean z, int i) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z)));
        arrayList.add(new Pair("placementId", Integer.toString(i)));
        return OooOo.OooOoo(str, "&", createURLParams(arrayList));
    }

    private static void setBaseUrlPrefix(String str) {
        BASE_URL_PREFIX = str;
    }
}

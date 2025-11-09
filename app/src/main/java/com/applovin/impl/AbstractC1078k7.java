package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.core.location.LocationRequestCompat;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1208c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.k7 */
/* loaded from: classes.dex */
public abstract class AbstractC1078k7 {

    /* renamed from: a */
    private static final int[] f998a = {60, 60, 24, 7, 4, 12};

    /* renamed from: b */
    private static final String[] f999b = {" second", " minute", " hour", " day", " week", " month"};

    /* renamed from: c */
    private static final String[] f1000c = {"s", "m", "h", "d", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "mth"};

    /* renamed from: d */
    private static final DecimalFormat f1001d = new DecimalFormat();

    /* renamed from: e */
    private static final Random f1002e = new Random();

    /* renamed from: f */
    private static Boolean f1003f;

    /* renamed from: g */
    private static Boolean f1004g;

    /* renamed from: h */
    private static String f1005h;

    /* renamed from: i */
    private static Boolean f1006i;

    /* renamed from: com.applovin.impl.k7$a */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    /* renamed from: com.applovin.impl.k7$b */
    public class b extends AbstractC1179r4 {

        /* renamed from: a */
        final /* synthetic */ String f1007a;

        public b(String str) {
            this.f1007a = str;
        }

        @Override // com.applovin.impl.AbstractC1179r4
        /* renamed from: a */
        public Map mo235a() {
            return CollectionUtils.hashMap("name", "Utils:" + this.f1007a);
        }
    }

    /* renamed from: a */
    public static double m1154a(long j) {
        return j / 1024.0d;
    }

    /* renamed from: b */
    public static float m1208b(float f) {
        return f * 1000.0f;
    }

    /* renamed from: c */
    public static void m1227c() {
    }

    /* renamed from: d */
    public static double m1229d(long j) {
        return j / 1000.0d;
    }

    /* renamed from: e */
    public static long m1236e(String str) {
        if (!StringUtils.isValidString(str)) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
    }

    /* renamed from: f */
    public static String m1242f(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    /* renamed from: g */
    public static boolean m1244g() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            C1240o.m3204c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 200;
    }

    /* renamed from: h */
    public static boolean m1246h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: i */
    public static boolean m1249i() {
        return !m1203a("com.applovin.sdk.AppLovinSdk");
    }

    /* renamed from: j */
    public static boolean m1250j() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C1240o.m3204c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m1252k() {
        Context contextM2824o = C1220k.m2824o();
        if (contextM2824o != null) {
            return C1290y.m3680a(contextM2824o).m3682a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m1254l(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m1255m(Context context) {
        if (context == null) {
            context = C1220k.m2824o();
        }
        if (context != null) {
            return C1290y.m3680a(context).m3683a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    /* renamed from: a */
    public static int m1156a(int i, int i2) {
        return (i < 0 || i > 100) ? i2 : i;
    }

    /* renamed from: b */
    public static long m1209b(long j) {
        return j * 8;
    }

    /* renamed from: c */
    public static int m1222c(int i) {
        return m1156a(i, 95);
    }

    /* renamed from: d */
    public static int m1230d(int i) {
        return i * 1024;
    }

    /* renamed from: h */
    public static boolean m1247h(Context context) {
        if (f1003f == null) {
            f1003f = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f1003f.booleanValue();
    }

    /* renamed from: i */
    public static Boolean m1248i(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = f1006i;
        if (bool != null) {
            return bool;
        }
        try {
            String strM3681a = C1290y.m3680a(context).m3681a();
            String strM1225c = m1225c(context);
            if (strM1225c == null) {
                return null;
            }
            if (strM1225c.equals(strM3681a)) {
                Boolean bool2 = Boolean.TRUE;
                f1006i = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(strM3681a) && strM1225c.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                f1006i = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            f1006i = bool4;
            return bool4;
        } catch (Throwable th) {
            C1240o.m3202b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m1182a() {
    }

    /* renamed from: b */
    public static void m1215b() {
    }

    /* renamed from: c */
    public static long m1223c(float f) {
        return m1159a(m1208b(f));
    }

    /* renamed from: d */
    public static int m1231d(Context context) {
        WindowManager windowManagerM1241f = m1241f(context);
        if (windowManagerM1241f == null) {
            return 0;
        }
        return windowManagerM1241f.getDefaultDisplay().getRotation();
    }

    /* renamed from: e */
    public static String m1238e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            C1240o.m3204c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    /* renamed from: k */
    public static boolean m1253k(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    /* renamed from: a */
    public static boolean m1200a(long j, long j2) {
        return (j & j2) != 0;
    }

    /* renamed from: b */
    public static void m1217b(String str, String str2) {
        if (str == null || str.length() <= m1230d(8)) {
            return;
        }
        C1240o.m3209j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + m1230d(8) + " maximum)");
    }

    /* renamed from: c */
    public static double m1221c(long j) {
        return m1154a(m1209b(j));
    }

    /* renamed from: f */
    public static WindowManager m1241f(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        StrictMode.setVmPolicy(vmPolicy);
        return windowManager;
    }

    /* renamed from: a */
    public static String m1174a(Map map, boolean z) {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            if (z) {
                TreeMap treeMap = new TreeMap(new a());
                treeMap.putAll(map);
                map = treeMap;
            }
            for (Map.Entry entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(C3034d9.i.f8175c);
                }
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str = (String) value;
                    if (str.contains(C3034d9.i.f8175c)) {
                        value = str.replace(C3034d9.i.f8175c, "%26");
                    }
                }
                sb.append(entry.getKey());
                sb.append(C3037dc.f8244T);
                sb.append(value);
            }
            return sb.toString();
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m1228c(C1220k c1220k) {
        String str = c1220k.m2912o0().getExtraParameters().get("run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (C1220k.m2824o().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    /* renamed from: d */
    public static String m1232d() {
        try {
            return Build.VERSION.RELEASE + " (" + m1238e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            C1240o.m3204c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    /* renamed from: g */
    public static int m1243g(String str) {
        int i = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                C1240o.m3207h("Utils", "Version number components cannot be longer than two digits -> ".concat(str));
                return i;
            }
            i = (i * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i * 100) + 99 : i;
    }

    /* renamed from: b */
    public static String m1214b(Class cls, String str) {
        try {
            Field fieldM1175a = m1175a(cls, str);
            fieldM1175a.setAccessible(true);
            return (String) fieldM1175a.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static long m1224c(byte[] bArr) {
        return m1161a(bArr, 0);
    }

    /* renamed from: d */
    public static byte[] m1235d(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0 || !m1220b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i > 0) {
                byteArrayOutputStream.write(bArr2, 0, i);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: e */
    public static boolean m1239e(C1220k c1220k) {
        if (((Boolean) c1220k.m2866a(C1268v4.f2748b2)).booleanValue()) {
            return c1220k.m2912o0().isMuted();
        }
        return ((Boolean) c1220k.m2866a(C1268v4.f2732Z1)).booleanValue();
    }

    /* renamed from: f */
    public static int m1240f() {
        if (AbstractC1141o0.m1942b()) {
            return WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout();
        }
        return 0;
    }

    /* renamed from: j */
    public static boolean m1251j(Context context) {
        if (f1004g == null) {
            f1004g = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f1004g.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m1216b(AppLovinAd appLovinAd, C1220k c1220k) {
        if (appLovinAd instanceof AppLovinAdBase) {
            AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
            String strM2904j0 = c1220k.m2904j0();
            String strM2904j02 = appLovinAdBase.getSdk().m2904j0();
            if (strM2904j0.equals(strM2904j02)) {
                return;
            }
            String str = "Ad was loaded from sdk with key: " + strM2904j02 + ", but is being rendered from sdk with key: " + strM2904j0;
            C1240o.m3207h("AppLovinAd", str);
            m1192a(str, appLovinAdBase, "AppLovinAd", c1220k);
        }
    }

    /* renamed from: c */
    public static String m1226c(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    /* renamed from: c */
    public static String m1225c(Context context) {
        int iMyPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f1005h)) {
            return f1005h;
        }
        try {
            iMyPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th) {
            C1240o.m3202b("Utils", "Unable to determine process name", th);
        }
        if (runningAppProcesses == null) {
            C1240o.m3203c("Utils", "No running app processes. Unable to determine process name");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (iMyPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                f1005h = str;
                return str;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static Context m1237e(Context context) {
        return m1254l(context) ? context : C1220k.m2824o();
    }

    /* renamed from: g */
    public static boolean m1245g(Context context) {
        return C1290y.m3680a(context).m3682a("applovin.sdk.is_test_environment");
    }

    /* renamed from: b */
    public static String m1213b(Context context) {
        Point pointM1938b = AbstractC1141o0.m1938b(context);
        int i = pointM1938b.x;
        int i2 = pointM1938b.y;
        int iM1231d = m1231d(context);
        if ((i > i2 && (iM1231d == 0 || iM1231d == 2)) || (i2 > i && (iM1231d == 1 || iM1231d == 3))) {
            return m1166a(iM1231d);
        }
        return m1212b(iM1231d);
    }

    /* renamed from: d */
    public static String m1233d(String str) {
        return m1173a(str, str.split("\\.").length);
    }

    /* renamed from: d */
    public static boolean m1234d(C1220k c1220k) {
        String str = c1220k.m2912o0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    /* renamed from: a */
    public static Map m1180a(Map map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return map2;
    }

    /* renamed from: b */
    private static String m1212b(int i) {
        if (i == 0) {
            return C3034d9.h.f8062D;
        }
        if (i == 1) {
            return "landscape_right";
        }
        if (i == 2) {
            return "portrait_upside_down";
        }
        if (i != 3) {
            return "unknown";
        }
        return "landscape_left";
    }

    /* renamed from: a */
    public static boolean m1205a(String str, List list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    /* renamed from: a */
    public static long m1160a(C1220k c1220k) {
        long jLongValue = ((Long) c1220k.m2866a(C1268v4.f2921w5)).longValue();
        long jLongValue2 = ((Long) c1220k.m2866a(C1268v4.f2929x5)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (jLongValue <= 0 || jLongValue2 <= 0) ? jCurrentTimeMillis : (jLongValue - jLongValue2) + jCurrentTimeMillis;
    }

    /* renamed from: a */
    public static void m1197a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    /* renamed from: b */
    private static long m1210b(String str) {
        if (str == null) {
            return 0L;
        }
        return new File(str).length();
    }

    /* renamed from: b */
    public static boolean m1220b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    /* renamed from: b */
    public static boolean m1218b(C1220k c1220k) {
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            c1220k.m2847O();
            if (!C1240o.m3200a()) {
                return false;
            }
            c1220k.m2847O().m3216d("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    /* renamed from: a */
    private static long m1159a(float f) {
        return Math.round(f);
    }

    /* renamed from: b */
    public static boolean m1219b(List list) {
        Context contextM2824o = C1220k.m2824o();
        if (contextM2824o == null) {
            C1240o.m3207h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(contextM2824o.getPackageName());
    }

    /* renamed from: a */
    public static String m1168a(long j, boolean z) {
        String str;
        String[] strArr = z ? f999b : f1000c;
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        for (int i = 0; i < strArr.length; i++) {
            long j2 = f998a[i];
            if (jCurrentTimeMillis < j2) {
                if (jCurrentTimeMillis <= 0) {
                    return z ? "just now" : "now";
                }
                String str2 = "";
                if (!z || jCurrentTimeMillis <= 1) {
                    str = "";
                } else {
                    str = "s";
                }
                if (z) {
                    str2 = " ago";
                }
                return String.format("%d%s%s%s", Long.valueOf(jCurrentTimeMillis), strArr[i], str, str2);
            }
            jCurrentTimeMillis /= j2;
        }
        return z ? "just now" : "now";
    }

    /* renamed from: b */
    public static WebView m1211b(Context context, String str) {
        return m1163a(context, str, false);
    }

    /* renamed from: a */
    public static double m1155a(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            C1240o.m3204c("Utils", "Failed to parse double from String: " + str, th);
            return d;
        }
    }

    /* renamed from: a */
    public static String m1170a(Uri uri, String str, C1220k c1220k) {
        List listM2888c = c1220k.m2888c(C1268v4.f2579G0);
        String lastPathSegment = uri.getLastPathSegment();
        if (listM2888c.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String queryParameter = uri.getQueryParameter(it.next());
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String strEncodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) c1220k.m2866a(C1268v4.f2587H0);
        int length = StringUtils.emptyIfNull(str).length() + StringUtils.emptyIfNull(strEncodeUriString).length();
        if (length > num.intValue() && StringUtils.isValidString(strEncodeUriString)) {
            strEncodeUriString = strEncodeUriString.substring(length - num.intValue());
        }
        return (StringUtils.isValidString(strEncodeUriString) && StringUtils.isValidString(str)) ? OooO0oO.OooOo.OooOoo0(str, strEncodeUriString) : strEncodeUriString;
    }

    /* renamed from: a */
    public static void m1194a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("\n**************************************************\nNO FILL received:\n..ID: \"", str, "\"\n..FORMAT: \"");
            sbOooOoO0.append(maxAdFormat != null ? maxAdFormat.getLabel() : OfficeOpenXMLExtended.SECURITY_NONE);
            sbOooOoO0.append("\"\n..SDK KEY: \"");
            sbOooOoO0.append(c1220k.m2904j0());
            sbOooOoO0.append("\"\n..PACKAGE NAME: \"");
            sbOooOoO0.append(C1220k.m2824o().getPackageName());
            sbOooOoO0.append("\"\n..Reason: ");
            sbOooOoO0.append(object);
            sbOooOoO0.append("\n**************************************************\n");
            String string = sbOooOoO0.toString();
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("AppLovinSdk", string);
            }
        }
    }

    /* renamed from: a */
    public static AppLovinAd m1165a(AppLovinAd appLovinAd, C1220k c1220k) {
        if (!(appLovinAd instanceof C1208c)) {
            return appLovinAd;
        }
        C1208c c1208c = (C1208c) appLovinAd;
        AppLovinAd appLovinAdDequeueAd = c1220k.m2905k().dequeueAd(c1208c.getAdZone());
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3211a("Utils", "Dequeued ad for dummy ad: " + appLovinAdDequeueAd);
        }
        if (appLovinAdDequeueAd != null) {
            c1208c.m2652a(appLovinAdDequeueAd);
            ((AppLovinAdImpl) appLovinAdDequeueAd).setDummyAd(c1208c);
            return appLovinAdDequeueAd;
        }
        return c1208c.m2654f();
    }

    /* renamed from: a */
    public static C1254u m1164a(JSONObject jSONObject, C1220k c1220k) {
        return C1254u.m3362a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, "zone_id", null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    /* renamed from: a */
    public static Field m1175a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return m1175a(superclass, str);
        }
    }

    /* renamed from: a */
    public static List m1176a(JSONObject jSONObject, String str, String str2, C1220k c1220k) {
        return m1177a(jSONObject, str, null, str2, null, false, c1220k);
    }

    /* renamed from: a */
    public static List m1177a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z, C1220k c1220k) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return m1178a(jSONObject, map3, str2, map2, z, c1220k);
    }

    /* renamed from: a */
    public static List m1178a(JSONObject jSONObject, Map map, String str, Map map2, boolean z, C1220k c1220k) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new C1010e(str, null, map2, z));
        }
        if (jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String strOptString = jSONObject.optString(next);
                        String strReplace = StringUtils.replace(next, map);
                        if (AppLovinSdkUtils.isValidString(strOptString)) {
                            strOptString = StringUtils.replace(strOptString, map);
                        }
                        arrayList.add(new C1010e(strReplace, strOptString, map2, z));
                    }
                } catch (Throwable th) {
                    c1220k.m2847O();
                    if (C1240o.m3200a()) {
                        c1220k.m2847O().m3212a("Utils", "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m1186a(C1220k c1220k, String str) {
        String strM2904j0 = c1220k.m2904j0();
        if (((Boolean) c1220k.m2866a(C1268v4.f2931y)).booleanValue()) {
            if (strM2904j0 == null || strM2904j0.length() != 86) {
                m1196a(TextUtils.isEmpty(strM2904j0) ? "Empty SDK key" : "Invalid SDK key length", str, c1220k);
            }
        }
    }

    /* renamed from: a */
    private static void m1196a(String str, String str2, C1220k c1220k) {
        m1192a(str, (AppLovinAdBase) null, str2, c1220k);
    }

    /* renamed from: a */
    private static void m1192a(String str, AppLovinAdBase appLovinAdBase, String str2, C1220k c1220k) {
        StringBuilder sb = new StringBuilder("sdkKey=");
        sb.append(c1220k.m2904j0());
        if (appLovinAdBase != null) {
            sb.append(",adSdkKey=");
            sb.append(appLovinAdBase.getSdk().m2904j0());
        }
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("details", sb.toString(), map);
        CollectionUtils.putStringIfValid("error_message", str, map);
        c1220k.m2832E().m572a(C0993c2.f474E0, str2, map);
    }

    /* renamed from: a */
    public static Map m1181a(Map map, C1220k c1220k) {
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    /* renamed from: a */
    public static String m1169a(Context context, String str, C1220k c1220k) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities.isEmpty()) {
                return null;
            }
            return listQueryIntentActivities.get(0).activityInfo.name;
        } catch (Throwable th) {
            c1220k.m2832E().m2152a(str, th);
            return null;
        }
    }

    /* renamed from: a */
    private static String m1166a(int i) {
        if (i == 0) {
            return "landscape_right";
        }
        if (i == 1) {
            return "portrait_upside_down";
        }
        if (i == 2) {
            return "landscape_left";
        }
        if (i != 3) {
            return "unknown";
        }
        return C3034d9.h.f8062D;
    }

    /* renamed from: a */
    public static boolean m1203a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m1206a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m1203a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m1189a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    /* renamed from: a */
    public static void m1188a(Closeable closeable, C1220k c1220k) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (c1220k != null) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1198a(HttpURLConnection httpURLConnection, C1220k c1220k) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (c1220k != null) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1191a(String str, Context context) {
        AppLovinSdkUtils.runOnUiThread(new OooO(12, context, str));
    }

    /* renamed from: a */
    public static /* synthetic */ void m1184a(Context context, String str) {
        Toast toastMakeText = Toast.makeText(context, str, 0);
        toastMakeText.setMargin(0.0f, 0.1f);
        toastMakeText.show();
    }

    /* renamed from: a */
    public static void m1193a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    /* renamed from: a */
    public static boolean m1202a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    /* renamed from: a */
    public static String m1172a(Object obj) {
        if (obj instanceof AbstractC1266v2) {
            return ((AbstractC1266v2) obj).m3518P();
        }
        if (AbstractC1249t3.m3322a(obj)) {
            return ((AbstractC1207b) obj).getMediationServeId();
        }
        return null;
    }

    /* renamed from: a */
    public static List m1179a(boolean z, AbstractC1207b abstractC1207b, C1220k c1220k, Context context) {
        if (abstractC1207b instanceof C1088l7) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(abstractC1207b.m2615l());
        int size = arrayList2.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayList2.get(i);
            i++;
            Uri uri = (Uri) obj;
            boolean zM3035c = c1220k.m2837H().m3035c(uri.getLastPathSegment(), context);
            boolean z3 = ((Boolean) c1220k.m2866a(C1268v4.f2600I5)).booleanValue() && m1210b(uri.getPath()) == 0;
            if (!zM3035c || z3) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3214b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        Uri uriMo1370v0 = abstractC1207b.mo1370v0();
        if (z && uriMo1370v0 != null) {
            boolean zM3035c2 = c1220k.m2837H().m3035c(uriMo1370v0.getLastPathSegment(), context);
            if (((Boolean) c1220k.m2866a(C1268v4.f2600I5)).booleanValue() && m1210b(uriMo1370v0.getPath()) == 0) {
                z2 = true;
            }
            if (!zM3035c2 || z2) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3214b("Utils", "Cached video missing: " + uriMo1370v0);
                }
                arrayList.add(uriMo1370v0);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m1187a(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append(OooO0oO.OooOo.OooOO0o("\nFailed to load ", str, " from ", name, ":\n"));
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("\n", name, " Error ");
                sbOooOoO0.append(error.getMediatedNetworkErrorCode());
                sbOooOoO0.append(": ");
                sbOooOoO0.append(error.getMediatedNetworkErrorMessage());
                sbOooOoO0.append("\n\n");
                sb.append(sbOooOoO0.toString());
            }
        } else {
            StringBuilder sbOooOoO02 = OooO0oO.OooOo.OooOoO0("Failed to load ", str, " with error ");
            sbOooOoO02.append(maxError.getCode());
            sbOooOoO02.append(": ");
            sbOooOoO02.append(maxError.getMessage());
            sb.append(sbOooOoO02.toString());
        }
        m1195a("", sb.toString(), context);
    }

    /* renamed from: a */
    public static void m1195a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }

    /* renamed from: a */
    public static boolean m1199a(double d) {
        if (d >= 100.0d) {
            return true;
        }
        return d > 0.0d && ((double) f1002e.nextFloat()) < d / 100.0d;
    }

    /* renamed from: a */
    public static byte[] m1207a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static long m1161a(byte[] bArr, int i) {
        int i2 = i + 8;
        if (bArr.length < i2) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j = 0;
        while (i < i2) {
            j |= (bArr[i] & 255) << (i * 8);
            i++;
        }
        return j;
    }

    /* renamed from: a */
    public static int m1157a(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    /* renamed from: a */
    public static String m1173a(String str, int i) {
        String[] strArrSplit = StringUtils.toDigitsOnlyVersionString(str).split("\\.");
        if (strArrSplit.length == i) {
            StringBuilder sb = new StringBuilder();
            if (strArrSplit.length > 0) {
                sb.append((CharSequence) strArrSplit[0]);
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    sb.append((CharSequence) ".");
                    sb.append((CharSequence) strArrSplit[i2]);
                }
            }
            return sb.toString();
        }
        if (strArrSplit.length > i) {
            List listSubList = new ArrayList(Arrays.asList(strArrSplit)).subList(0, i);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = listSubList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) ".");
                }
            }
            return sb2.toString();
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
        arrayList.addAll(Collections.nCopies(i - arrayList.size(), "0"));
        StringBuilder sb3 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) ".");
            }
        }
        return sb3.toString();
    }

    /* renamed from: a */
    public static int m1158a(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            String[] strArrSplit = digitsOnlyVersionString.split("\\.");
            String[] strArrSplit2 = digitsOnlyVersionString2.split("\\.");
            int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
            int i = 0;
            while (i < iMax) {
                String str3 = i < strArrSplit.length ? strArrSplit[i] : "0";
                String str4 = i < strArrSplit2.length ? strArrSplit2[i] : "0";
                int i2 = Integer.parseInt(str3);
                int i3 = Integer.parseInt(str4);
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            }
            return 0;
        } catch (Throwable th) {
            C1240o.m3204c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    /* renamed from: a */
    public static WebView m1163a(Context context, String str, boolean z) {
        try {
            WebView webView = new WebView(context);
            if (!z) {
                return webView;
            }
            webView.setWebViewClient(new b(str));
            return webView;
        } catch (Throwable th) {
            C1240o.m3204c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m1185a(Uri uri, Activity activity, C1220k c1220k) {
        if (activity == null) {
            activity = c1220k.m2926v0();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, c1220k.m2904j0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static String m1167a(int i, Context context, C1220k c1220k) {
        if (i == 0) {
            return "";
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e) {
                if (c1220k != null) {
                    c1220k.m2847O();
                    if (C1240o.m3200a()) {
                        c1220k.m2847O().m3212a("Utils", "Opening raw resource file threw exception", e);
                    }
                }
                return "";
            } finally {
                m1188a(inputStreamOpenRawResource, c1220k);
            }
        } catch (Throwable th) {
            if (c1220k != null) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("Utils", "Failed to retrieve resource " + i, th);
                }
            }
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m1201a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        if (maxAdFormat == null || maxAdFormat2 == null) {
            return false;
        }
        if (maxAdFormat == maxAdFormat2) {
            return true;
        }
        if (maxAdFormat.isAdViewAd() && maxAdFormat2.isAdViewAd()) {
            return true;
        }
        return maxAdFormat.isFullscreenAd() && maxAdFormat2.isFullscreenAd();
    }

    /* renamed from: a */
    public static boolean m1204a(String str, C1220k c1220k) {
        if (str == null) {
            return false;
        }
        return StringUtils.containsAtLeastOneSubstring(str, c1220k.m2888c(C1268v4.f2916w0));
    }

    /* renamed from: a */
    public static ActivityManager.MemoryInfo m1162a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th) {
            C1240o.m3202b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    /* renamed from: a */
    public static String m1171a(AppLovinSdkSettings appLovinSdkSettings) {
        String strEmptyIfNull = StringUtils.emptyIfNull(appLovinSdkSettings.getExtraParameters().get("applovin_unity_metadata"));
        if (TextUtils.isEmpty(strEmptyIfNull)) {
            return null;
        }
        Map<String, String> mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(strEmptyIfNull, new JSONObject()));
        if (CollectionUtils.isEmpty(mapTryToStringMap)) {
            return null;
        }
        return mapTryToStringMap.get("UnityVersion");
    }

    /* renamed from: a */
    public static void m1190a(String str, int i, int i2, C1167q1 c1167q1) {
        if (i > i2) {
            c1167q1.m572a(C0993c2.f478G0, str, CollectionUtils.hashMap("details", i + " Leaking Instances"));
        }
    }

    /* renamed from: a */
    public static void m1183a(float f, long j, C1240o c1240o) {
        Vibrator vibrator = (Vibrator) C1220k.m2824o().getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        try {
            if (C1240o.m3200a()) {
                c1240o.m3211a("Utils", "Vibrating with intensity: " + f + " for duration: " + j + "ms");
            }
            if (AbstractC1141o0.m1952h()) {
                vibrator.vibrate(VibrationEffect.createOneShot(j, Math.max(1, Math.min(255, (int) (f * 255.0f)))));
            } else {
                vibrator.vibrate(j);
            }
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                c1240o.m3212a("Utils", "Failed to vibrate", th);
            }
        }
    }
}

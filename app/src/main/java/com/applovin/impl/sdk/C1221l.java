package com.applovin.impl.sdk;

import OooOo0o.o000oOoO;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.core.view.Oooo0;
import com.applovin.impl.AbstractC1048h7;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1079k8;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.AbstractC1145o4;
import com.applovin.impl.AbstractC1150p0;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1175r0;
import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.AbstractC1263v;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1060j;
import com.applovin.impl.C1068j7;
import com.applovin.impl.C1096m5;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1166q0;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1286x4;
import com.applovin.impl.C1303z3;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3034d9;
import com.ironsource.C3126fq;
import com.ironsource.C3451ne;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.metadata.Font;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.l */
/* loaded from: classes.dex */
public class C1221l {

    /* renamed from: i */
    private static String f2182i;

    /* renamed from: j */
    private static String f2183j;

    /* renamed from: k */
    private static final AtomicReference f2184k = new AtomicReference();

    /* renamed from: l */
    private static final AtomicReference f2185l = new AtomicReference();

    /* renamed from: a */
    private final C1220k f2186a;

    /* renamed from: b */
    private final C1240o f2187b;

    /* renamed from: c */
    private final Context f2188c;

    /* renamed from: d */
    private final Map f2189d;

    /* renamed from: f */
    private final Map f2191f;

    /* renamed from: g */
    private boolean f2192g;

    /* renamed from: e */
    private final Object f2190e = new Object();

    /* renamed from: h */
    private final AtomicReference f2193h = new AtomicReference();

    /* renamed from: com.applovin.impl.sdk.l$a */
    public class a implements C1096m5.a {
        public a() {
        }

        @Override // com.applovin.impl.C1096m5.a
        /* renamed from: a */
        public void mo1500a(AbstractC1263v.a aVar) {
            C1221l.f2184k.set(aVar);
        }
    }

    /* renamed from: com.applovin.impl.sdk.l$b */
    public static class b {

        /* renamed from: a */
        public final String f2195a;

        /* renamed from: b */
        public final int f2196b;

        public b(String str, int i) {
            this.f2195a = str;
            this.f2196b = i;
        }
    }

    /* renamed from: com.applovin.impl.sdk.l$c */
    public static class c {

        /* renamed from: a */
        public int f2197a = -1;

        /* renamed from: b */
        public int f2198b = -1;

        /* renamed from: c */
        public Boolean f2199c = null;
    }

    public C1221l(C1220k c1220k) {
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2186a = c1220k;
        this.f2187b = c1220k.m2847O();
        this.f2188c = C1220k.m2824o();
        this.f2189d = m2938B();
        this.f2191f = m2937A();
    }

    /* renamed from: A */
    private Map m2937A() {
        PackageInfo packageInfo;
        HashMap map = new HashMap();
        PackageManager packageManager = this.f2188c.getPackageManager();
        ApplicationInfo applicationInfo = this.f2188c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        try {
            packageInfo = packageManager.getPackageInfo(this.f2188c.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        String strM2950a = m2950a(applicationInfo.packageName, packageManager, this.f2186a);
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        if (strM2950a == null) {
            strM2950a = "";
        }
        map.put("installer_name", strM2950a);
        map.put("tg", C1068j7.m1098a(this.f2186a));
        map.put("debug", Boolean.valueOf(AbstractC1078k7.m1228c(this.f2186a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(C1220k.m2823n()));
        map.put("session_id", this.f2186a.m2911n0().getSessionId());
        map.put("j8", Boolean.valueOf(C1220k.m2783G0()));
        map.put("ps_tpg", Boolean.valueOf(AbstractC1145o4.m2010d(this.f2188c)));
        map.put("ps_apg", Boolean.valueOf(AbstractC1145o4.m2008b(this.f2188c)));
        map.put("ps_capg", Boolean.valueOf(AbstractC1145o4.m2009c(this.f2188c)));
        map.put("ps_aipg", Boolean.valueOf(AbstractC1145o4.m2007a(this.f2188c)));
        C1220k c1220k = this.f2186a;
        C1286x4 c1286x4 = C1286x4.f3053h;
        Long l = (Long) c1220k.m2867a(c1286x4);
        if (l != null) {
            map.put("ia_v2", l);
        } else {
            this.f2186a.m2885b(c1286x4, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f2186a.m2894e0().m786c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C1060j.m1024b(), map);
        map.put("api_did", this.f2186a.m2866a(C1268v4.f2779f));
        map.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.f2186a.m2844M(), map);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.f2186a.m2845N()), map);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (AbstractC1141o0.m1951g()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f2186a.m2840I0()) {
            map.put("unity_version", AbstractC1078k7.m1171a(this.f2186a.m2912o0()));
        }
        List listM2969i = m2969i();
        if (!CollectionUtils.isEmpty(listM2969i)) {
            map.put("application_start_info", listM2969i);
        }
        List listM2967g = m2967g();
        if (!CollectionUtils.isEmpty(listM2967g)) {
            map.put("application_exit_info", listM2967g);
        }
        return map;
    }

    /* renamed from: B */
    private Map m2938B() {
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(AbstractC1263v.m3410a()));
        map.put("locale", Locale.getDefault().toString());
        map.put(C3451ne.f10402B, Build.MODEL);
        map.put(C3451ne.f10411E, Build.VERSION.RELEASE);
        map.put(C3451ne.f10417G, m3000y());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(m2939C()));
        map.put("gy", Boolean.valueOf(m2977s()));
        map.put("country_code", m2972m());
        map.put("mcc", m2981w());
        map.put("mnc", m2982x());
        map.put(C3451ne.f10434O0, m2971k());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f2188c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", m2947Q());
        map.put("supported_abis", m2943M());
        DisplayMetrics displayMetrics = this.f2188c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            AbstractC1141o0.b bVarM1933a = AbstractC1141o0.m1933a(this.f2188c, this.f2186a);
            if (bVarM1933a != null) {
                map.put("tl_cr", Integer.valueOf(bVarM1933a.m1967c()));
                map.put("tr_cr", Integer.valueOf(bVarM1933a.m1968d()));
                map.put("bl_cr", Integer.valueOf(bVarM1933a.m1964a()));
                map.put("br_cr", Integer.valueOf(bVarM1933a.m1966b()));
            }
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        map.put("tbalsi_ms", Long.valueOf(this.f2186a.m2843L() - C1220k.m2823n()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(AbstractC1145o4.m2011e(this.f2188c)), map);
        CollectionUtils.putStringIfValid("process_name", AbstractC1078k7.m1225c(this.f2188c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", AbstractC1078k7.m1248i(this.f2188c), map);
        try {
            PackageInfo packageInfo = this.f2188c.getPackageManager().getPackageInfo(C3126fq.f8595b, 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", AbstractC1048h7.m937a(this.f2188c), map);
        m2958a(map);
        return map;
    }

    /* renamed from: C */
    private double m2939C() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01f3 A[SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONArray m2940D() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1221l.m2940D():org.json.JSONArray");
    }

    /* renamed from: H */
    public static String m2941H() {
        return f2183j;
    }

    /* renamed from: J */
    private Map m2942J() {
        return AbstractC1078k7.m1180a(m2993a((Map) null, true, false));
    }

    /* renamed from: M */
    private JSONArray m2943M() {
        if (AbstractC1141o0.m1949e()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    /* renamed from: N */
    private boolean m2944N() {
        try {
            if (!m2963b()) {
                if (!m2965c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: O */
    private boolean m2945O() {
        ConnectivityManager connectivityManager;
        if (AbstractC1141o0.m1951g() && (connectivityManager = (ConnectivityManager) this.f2188c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f2186a.m2847O();
                if (C1240o.m3200a()) {
                    this.f2186a.m2847O().m3212a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    /* renamed from: P */
    private boolean m2946P() {
        boolean z = this.f2188c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f2188c.getPackageManager();
        return z && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    /* renamed from: Q */
    private Boolean m2947Q() {
        if (AbstractC1141o0.m1952h()) {
            return Boolean.valueOf(this.f2188c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* renamed from: S */
    public /* synthetic */ void m2948S() {
        this.f2193h.set(m2975q());
    }

    /* renamed from: b */
    public /* synthetic */ void m2961b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strM2986G = m2986G();
            if (StringUtils.isValidString(strM2986G)) {
                this.f2186a.m2847O();
                if (C1240o.m3200a()) {
                    this.f2186a.m2847O().m3211a("DataCollector", "Successfully retrieved bid token");
                }
                AbstractC1168q2.m2187a(appLovinBidTokenCollectionListener, strM2986G);
                return;
            }
            this.f2186a.m2847O();
            if (C1240o.m3200a()) {
                this.f2186a.m2847O().m3214b("DataCollector", "Empty bid token");
            }
            AbstractC1168q2.m2218b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f2187b.m3212a("DataCollector", "Failed to collect bid token", th);
            }
            this.f2186a.m2832E().m2148a("DataCollector", "collectBidToken", th);
            AbstractC1168q2.m2218b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    /* renamed from: c */
    private boolean m2965c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(m2964c(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01d6  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long m2966d() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1221l.m2966d():long");
    }

    /* renamed from: g */
    private List m2967g() {
        ActivityManager activityManager;
        if (AbstractC1141o0.m1942b()) {
            Integer num = (Integer) this.f2186a.m2866a(C1268v4.f2928x4);
            if (num.intValue() >= 0 && (activityManager = (ActivityManager) this.f2188c.getSystemService("activity")) != null) {
                List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(((Boolean) this.f2186a.m2866a(C1268v4.f2936y4)).booleanValue() ? this.f2188c.getPackageName() : null, 0, num.intValue());
                if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
                Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo applicationExitInfoOooO0Oo = Oooo0.OooO0Oo(it.next());
                    HashMap map = new HashMap(13);
                    int reason = applicationExitInfoOooO0Oo.getReason();
                    map.put("reason", Integer.valueOf(reason));
                    String description = applicationExitInfoOooO0Oo.getDescription();
                    CollectionUtils.putStringIfValid("description", description, map);
                    map.put("timestamp", Long.valueOf(applicationExitInfoOooO0Oo.getTimestamp()));
                    map.put("status", Integer.valueOf(applicationExitInfoOooO0Oo.getStatus()));
                    map.put("importance", Integer.valueOf(applicationExitInfoOooO0Oo.getImportance()));
                    map.put("pss", Long.valueOf(applicationExitInfoOooO0Oo.getPss()));
                    map.put("rss", Long.valueOf(applicationExitInfoOooO0Oo.getRss()));
                    CollectionUtils.putStringIfValid("process_name", applicationExitInfoOooO0Oo.getProcessName(), map);
                    map.put("pid", Integer.valueOf(applicationExitInfoOooO0Oo.getPid()));
                    map.put("ruid", Integer.valueOf(applicationExitInfoOooO0Oo.getRealUid()));
                    map.put("puid", Integer.valueOf(applicationExitInfoOooO0Oo.getPackageUid()));
                    map.put("duid", Integer.valueOf(applicationExitInfoOooO0Oo.getDefiningUid()));
                    String strM2949a = m2949a(applicationExitInfoOooO0Oo, reason);
                    if (StringUtils.isValidString(strM2949a)) {
                        map.put("stack_trace", strM2949a);
                        m2962b(strM2949a, reason, description);
                    }
                    arrayList.add(map);
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: h */
    private String m2968h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f2188c);
        return orientation == 1 ? C3034d9.h.f8062D : orientation == 2 ? C3034d9.h.f8060C : "none";
    }

    /* renamed from: i */
    private List m2969i() {
        ActivityManager activityManager;
        if (!AbstractC1141o0.m1946c()) {
            return null;
        }
        Integer num = (Integer) this.f2186a.m2866a(C1268v4.f2920w4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f2188c.getSystemService("activity")) == null) {
            return null;
        }
        List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
        Iterator it = historicalProcessStartReasons.iterator();
        while (it.hasNext()) {
            ApplicationStartInfo applicationStartInfoOooO0oO = androidx.privacysandbox.ads.adservices.customaudience.OooO0O0.OooO0oO(it.next());
            HashMap map = new HashMap(11);
            map.put("reason", Integer.valueOf(applicationStartInfoOooO0oO.getReason()));
            map.put("startup_state", Integer.valueOf(applicationStartInfoOooO0oO.getStartupState()));
            map.put("start_type", Integer.valueOf(applicationStartInfoOooO0oO.getStartType()));
            map.put("was_force_stopped", Boolean.valueOf(applicationStartInfoOooO0oO.wasForceStopped()));
            map.put("startup_timestamps", applicationStartInfoOooO0oO.getStartupTimestamps());
            CollectionUtils.putStringIfValid("process_name", applicationStartInfoOooO0oO.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationStartInfoOooO0oO.getPid()));
            map.put("ruid", Integer.valueOf(applicationStartInfoOooO0oO.getRealUid()));
            map.put("puid", Integer.valueOf(applicationStartInfoOooO0oO.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationStartInfoOooO0oO.getDefiningUid()));
            map.put("launch_mode", Integer.valueOf(applicationStartInfoOooO0oO.getLaunchMode()));
            map.put("intent", m2951a(applicationStartInfoOooO0oO.getIntent()));
            arrayList.add(map);
        }
        return arrayList;
    }

    /* renamed from: j */
    private c m2970j() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f2188c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f2198b = -1;
        } else {
            cVar.f2198b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f2197a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        cVar.f2199c = Boolean.valueOf(Settings.Global.getInt(this.f2188c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    /* renamed from: k */
    private String m2971k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f2188c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return "";
            }
            this.f2187b.m3212a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    /* renamed from: m */
    private String m2972m() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f2188c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    /* renamed from: n */
    private String m2973n() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://"));
        ResolveInfo resolveInfoResolveActivity = this.f2188c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            f2183j = activityInfo.packageName;
        }
        return f2183j;
    }

    /* renamed from: p */
    private String m2974p() {
        if (!AbstractC1141o0.m1951g()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f2188c.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                sb.append(locales.get(i));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    private Float m2975q() {
        Float f = (Float) this.f2186a.m2866a(C1268v4.f2718X3);
        Float fM2762b = this.f2186a.m2915q().m2762b();
        if (fM2762b == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * fM2762b.floatValue());
    }

    /* renamed from: r */
    private float m2976r() {
        try {
            return Settings.System.getFloat(this.f2188c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!C1240o.m3200a()) {
                return -1.0f;
            }
            this.f2187b.m3212a("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    /* renamed from: s */
    private boolean m2977s() {
        SensorManager sensorManager = (SensorManager) this.f2188c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    /* renamed from: t */
    private Map m2978t() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f2186a.m2920s0().m3629g(), map);
        CollectionUtils.putStringIfValid(AndroidTcfDataSource.TCF_TCSTRING_KEY, this.f2186a.m2920s0().m3631j(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f2186a.m2920s0().m3624c(), map);
        return map;
    }

    /* renamed from: u */
    private Boolean m2979u() {
        AudioManager audioManager = (AudioManager) this.f2188c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    /* renamed from: v */
    private Boolean m2980v() {
        AudioManager audioManager = (AudioManager) this.f2188c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    /* renamed from: w */
    private String m2981w() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f2188c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return "";
            }
            this.f2187b.m3212a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    /* renamed from: x */
    private String m2982x() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f2188c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return "";
            }
            this.f2187b.m3212a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    /* renamed from: z */
    private String m2983z() {
        AudioManager audioManager = (AudioManager) this.f2188c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (AbstractC1141o0.m1950f()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb.append(audioDeviceInfo.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append("3,");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append("7,");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string) && C1240o.m3200a()) {
            this.f2187b.m3211a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    /* renamed from: E */
    public Map m2984E() {
        Map map = CollectionUtils.map(this.f2191f);
        String str = StringUtils.isValidString(f2182i) ? f2182i : this.f2188c.getApplicationInfo().packageName;
        map.put(C3034d9.h.f8089V, str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f2186a.m2831D0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f2186a.m2826A0()));
        map.put("test_ads", Boolean.valueOf(this.f2192g));
        map.put("test_mode", Integer.valueOf(this.f2186a.m2922t0().m493c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f2186a.m2912o0().isMuted()));
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2927x3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f2186a.m2930x0().m1108e(), map);
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2534A3)).booleanValue()) {
            map.put("compass_random_token", this.f2186a.m2925v());
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2550C3)).booleanValue()) {
            map.put("applovin_random_token", this.f2186a.m2902i0());
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2582G3)).booleanValue()) {
            map.put("art", this.f2186a.m2919s());
        }
        map.putAll(m2978t());
        if (this.f2186a.m2900h0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f2186a.m2900h0().m3246a(), map);
        }
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f2186a.m2916q0().m3795a(C1286x4.f3047S, null), map);
        return map;
    }

    /* renamed from: F */
    public b m2985F() {
        return (b) f2185l.get();
    }

    /* renamed from: G */
    public String m2986G() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(m2942J()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f2186a.m2866a(C1268v4.f2760c5)).booleanValue() ? AbstractC1188s4.m2387b(strEncodeToString, AbstractC1078k7.m1160a(this.f2186a), AbstractC1188s4.a.m2392a(((Integer) this.f2186a.m2866a(C1268v4.f2769d5)).intValue()), this.f2186a.m2904j0(), this.f2186a) : strEncodeToString;
    }

    /* renamed from: I */
    public String m2987I() {
        ActivityManager activityManager = (ActivityManager) this.f2188c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    /* renamed from: K */
    public Map m2988K() {
        return CollectionUtils.map(this.f2191f);
    }

    /* renamed from: L */
    public Map m2989L() {
        return CollectionUtils.map(this.f2189d);
    }

    /* renamed from: R */
    public boolean m2990R() {
        return this.f2192g;
    }

    /* renamed from: T */
    public void m2991T() {
        C0987b6 c0987b6M2918r0 = this.f2186a.m2918r0();
        C1096m5 c1096m5 = new C1096m5(this.f2186a, new a());
        C0987b6.b bVar = C0987b6.b.OTHER;
        c0987b6M2918r0.m403a((AbstractRunnableC1036g5) c1096m5, bVar);
        this.f2186a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2186a, true, "setDeviceVolume", new o000oOoO(this, 12)), bVar);
    }

    /* renamed from: U */
    public void m2992U() {
        synchronized (this.f2190e) {
            m2958a(this.f2189d);
        }
    }

    /* renamed from: e */
    public Map m2996e() {
        HashMap map = new HashMap();
        map.put("sc", this.f2186a.m2866a(C1268v4.f2827l));
        map.put("sc2", this.f2186a.m2866a(C1268v4.f2835m));
        map.put("sc3", this.f2186a.m2866a(C1268v4.f2843n));
        map.put("server_installed_at", this.f2186a.m2866a(C1268v4.f2851o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f2186a.m2867a(C1286x4.f3035G), map);
        return map;
    }

    /* renamed from: f */
    public AbstractC1263v.a m2997f() {
        AbstractC1263v.a aVarM3411b = AbstractC1263v.m3411b(this.f2188c);
        if (aVarM3411b == null) {
            return new AbstractC1263v.a();
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2911v3)).booleanValue()) {
            if (aVarM3411b.m3419c() && !((Boolean) this.f2186a.m2866a(C1268v4.f2903u3)).booleanValue()) {
                aVarM3411b.m3415a("");
            }
            f2184k.set(aVarM3411b);
        } else {
            aVarM3411b = new AbstractC1263v.a();
        }
        List<String> testDeviceAdvertisingIds = this.f2186a.m2842K() != null ? this.f2186a.m2842K().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds == null) {
            this.f2192g = false;
            return aVarM3411b;
        }
        String strM3413a = aVarM3411b.m3413a();
        if (StringUtils.isValidString(strM3413a)) {
            this.f2192g = testDeviceAdvertisingIds.contains(strM3413a);
        }
        b bVarM2985F = m2985F();
        String str = bVarM2985F != null ? bVarM2985F.f2195a : null;
        if (StringUtils.isValidString(str)) {
            this.f2192g = testDeviceAdvertisingIds.contains(str) | this.f2192g;
        }
        return aVarM3411b;
    }

    /* renamed from: l */
    public Map m2998l() {
        HashMap map = new HashMap();
        C1303z3 c1303z3M2892d0 = this.f2186a.m2892d0();
        Deque dequeM3867b = c1303z3M2892d0.m3867b();
        if (!CollectionUtils.isEmpty(dequeM3867b)) {
            map.put("network_throughput_info", dequeM3867b);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", c1303z3M2892d0.m3865a(), map);
        C1166q0.d dVarM2133a = this.f2186a.m2929x().m2133a();
        if (dVarM2133a != null) {
            map.put("lrm_ts_ms", String.valueOf(dVarM2133a.m2145c()));
            map.put("lrm_url", dVarM2133a.m2146d());
            map.put("lrm_ct_ms", String.valueOf(dVarM2133a.m2142a()));
            map.put("lrm_rs", String.valueOf(dVarM2133a.m2144b()));
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* renamed from: o */
    public Map m2999o() {
        return m2994a(false);
    }

    /* renamed from: y */
    public String m3000y() {
        return AppLovinSdkUtils.isFireOS(this.f2188c) ? "fireos" : "android";
    }

    /* renamed from: a */
    public void m2995a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f2186a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2186a, ((Boolean) this.f2186a.m2866a(C1268v4.f2614K3)).booleanValue(), "DataCollector", new OooO0O0(4, this, appLovinBidTokenCollectionListener)), C0987b6.b.CORE);
    }

    /* renamed from: a */
    public Map m2993a(Map map, boolean z, boolean z2) {
        HashMap map2 = new HashMap(64);
        Map mapM2994a = m2994a(z);
        Map mapM2984E = m2984E();
        Map mapM2998l = m2998l();
        Map mapM2908l0 = this.f2186a.m2908l0();
        if (z2) {
            map2.put("device_info", mapM2994a);
            map2.put("app_info", mapM2984E);
            if (mapM2998l != null) {
                map2.put("connection_info", mapM2998l);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapM2908l0)) {
                map2.put("segments", mapM2908l0);
            }
        } else {
            map2.putAll(mapM2994a);
            map2.putAll(mapM2984E);
            if (mapM2998l != null) {
                map2.putAll(mapM2998l);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!CollectionUtils.isEmpty(mapM2908l0)) {
                map2.putAll(mapM2908l0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f2186a.m2857V(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f2186a.m2830D(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f2186a.m2866a(C1268v4.f2598I3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f2186a.m2924u0()), map2);
        if (!((Boolean) this.f2186a.m2866a(C1268v4.f2743a5)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f2186a.m2904j0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f2186a.m2917r(), map2);
        map2.putAll(m2996e());
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    /* renamed from: c */
    private String m2964c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    /* renamed from: b */
    private void m2962b(String str, int i, String str2) {
        this.f2186a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2186a, "reportAppExitInfoStackTrace", new OooOo0o.OooOOOO(this, str, i, str2, 1)), C0987b6.b.OTHER);
    }

    /* renamed from: b */
    private int m2960b(String str) {
        try {
            return Settings.Secure.getInt(this.f2188c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private boolean m2963b() {
        String str = Build.TAGS;
        return str != null && str.contains(m2964c("lz}$blpz"));
    }

    /* renamed from: a */
    public Map m2994a(boolean z) {
        Map map;
        synchronized (this.f2190e) {
            map = CollectionUtils.map(this.f2189d);
        }
        return m2952a(map, z);
    }

    /* renamed from: a */
    private void m2958a(Map map) {
        JSONArray jSONArrayM2940D;
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2670R3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(m2966d()));
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2678S3)).booleanValue() && !map.containsKey(Font.PREFIX_FONT_META)) {
            map.put(Font.PREFIX_FONT_META, Float.valueOf(m2976r()));
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2734Z3)).booleanValue() && AbstractC1078k7.m1234d(this.f2186a)) {
            AbstractC1079k8.m1258a(this.f2186a);
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2824k4)).booleanValue()) {
            AbstractC1079k8.m1260b(this.f2186a);
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2726Y3)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2694U3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(m2945O()));
        }
        map.put("is_pc", Boolean.valueOf(m2946P()));
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2840m4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", m2987I(), map);
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2938y6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", m2973n(), map);
        }
        if (!((Boolean) this.f2186a.m2866a(C1268v4.f2946z6)).booleanValue() || map.containsKey("video_decoders") || (jSONArrayM2940D = m2940D()) == null || jSONArrayM2940D.length() <= 0) {
            return;
        }
        map.put("video_decoders", jSONArrayM2940D);
    }

    /* renamed from: a */
    private Map m2952a(Map map, boolean z) {
        AbstractC1263v.a aVarM2997f;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point pointM1938b = AbstractC1141o0.m1938b(this.f2188c);
        map2.put("dx", Integer.valueOf(pointM1938b.x));
        map2.put("dy", Integer.valueOf(pointM1938b.y));
        if (this.f2188c.getResources().getDisplayMetrics() != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointM1938b.y, 2.0d) + Math.pow(pointM1938b.x, 2.0d)) / r4.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f2188c)));
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2543B4)).booleanValue()) {
            String strM1213b = AbstractC1078k7.m1213b(this.f2188c);
            Map mapM1934a = AbstractC1141o0.m1934a(strM1213b);
            if (mapM1934a != null) {
                map2.put("display_cutout_insets", mapM1934a);
            }
            Map mapM1944c = AbstractC1141o0.m1944c(strM1213b);
            if (mapM1944c != null) {
                map2.put("status_bar_insets", mapM1944c);
            }
            Map mapM1940b = AbstractC1141o0.m1940b(strM1213b);
            if (mapM1940b != null) {
                map2.put("nav_bar_insets", mapM1940b);
            }
        }
        if (z) {
            aVarM2997f = (AbstractC1263v.a) f2184k.get();
            if (aVarM2997f != null) {
                m2991T();
            } else if (AbstractC1078k7.m1246h()) {
                aVarM2997f = new AbstractC1263v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarM2997f = m2997f();
            }
        } else {
            aVarM2997f = m2997f();
        }
        String strM3413a = aVarM2997f.m3413a();
        if (StringUtils.isValidString(strM3413a)) {
            map2.put("idfa", strM3413a);
        }
        map2.put("dnt", Boolean.valueOf(aVarM2997f.m3419c()));
        map2.put("dnt_code", aVarM2997f.m3418b().m3421b());
        b bVar = (b) f2185l.get();
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2919w3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f2195a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f2196b));
        }
        Boolean boolM2052b = AbstractC1150p0.m2046b().m2052b(this.f2188c);
        if (boolM2052b != null) {
            map2.put("huc", boolM2052b);
        }
        Boolean boolM2052b2 = AbstractC1150p0.m2048c().m2052b(this.f2188c);
        if (boolM2052b2 != null) {
            map2.put("aru", boolM2052b2);
        }
        Boolean boolM2052b3 = AbstractC1150p0.m2041a().m2052b(this.f2188c);
        if (boolM2052b3 != null) {
            map2.put("dns", boolM2052b3);
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2622L3)).booleanValue()) {
            c cVarM2970j = m2970j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarM2970j.f2197a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarM2970j.f2198b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarM2970j.f2199c, map2);
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2686T3)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f2186a.m2911n0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2710W3)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(m2944N()));
        }
        Float fM2975q = z ? (Float) this.f2193h.get() : m2975q();
        if (fM2975q != null) {
            map2.put("volume", fM2975q);
        }
        CollectionUtils.putBooleanIfValid("ma", m2979u(), map2);
        CollectionUtils.putBooleanIfValid("spo", m2980v(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f2186a.m2911n0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f2186a.m2911n0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f2186a.m2911n0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f2188c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e) {
            if (C1240o.m3200a()) {
                this.f2187b.m3212a("DataCollector", "Unable to collect screen brightness", e);
            }
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2734Z3)).booleanValue() && AbstractC1078k7.m1234d(this.f2186a)) {
            AbstractC1079k8.m1258a(this.f2186a);
            String strM1257a = AbstractC1079k8.m1257a();
            if (StringUtils.isValidString(strM1257a)) {
                map2.put(C3451ne.f10464c0, strM1257a);
            }
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2824k4)).booleanValue()) {
            AbstractC1079k8.m1260b(this.f2186a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(AbstractC1079k8.m1263d()), map2);
            CollectionUtils.putStringIfValid("wvv", AbstractC1079k8.m1262c(), map2);
            CollectionUtils.putStringIfValid("wvpn", AbstractC1079k8.m1259b(), map2);
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2638N3)).booleanValue()) {
            try {
                map2.put(C3451ne.f10442S0, Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put(C3451ne.f10442S0, -1);
                map2.put("tds", -1);
                if (C1240o.m3200a()) {
                    this.f2187b.m3212a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2646O3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoM1162a = AbstractC1078k7.m1162a((ActivityManager) this.f2188c.getSystemService("activity"));
            if (memoryInfoM1162a != null) {
                map2.put("fm", Long.valueOf(memoryInfoM1162a.availMem));
                map2.put("tm", Long.valueOf(memoryInfoM1162a.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoM1162a.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoM1162a.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2654P3)).booleanValue() && AbstractC1141o0.m1937a("android.permission.READ_PHONE_STATE", this.f2188c) && AbstractC1141o0.m1951g()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f2188c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2630M3)).booleanValue()) {
            String strM2983z = m2983z();
            if (!TextUtils.isEmpty(strM2983z)) {
                map2.put("so", strM2983z);
            }
        }
        map2.put("device_orientation", AbstractC1078k7.m1213b(this.f2188c));
        map2.put("orientation_lock", m2968h());
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2662Q3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(AbstractC1078k7.m1250j()));
        }
        if (AbstractC1141o0.m1949e() && (powerManager = (PowerManager) this.f2188c.getSystemService("power")) != null) {
            map2.put(C3451ne.f10452X0, Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2750b4)).booleanValue() && this.f2186a.m2910m0() != null) {
            map2.put("da", Float.valueOf(this.f2186a.m2910m0().m3398a()));
        }
        if (((Boolean) this.f2186a.m2866a(C1268v4.f2759c4)).booleanValue() && this.f2186a.m2910m0() != null) {
            map2.put("dm", Float.valueOf(this.f2186a.m2910m0().m3399b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f2186a.m2915q().m2764c()));
        map2.put("network", AbstractC1175r0.m2304g(this.f2186a));
        String strM2974p = m2974p();
        if (StringUtils.isValidString(strM2974p)) {
            map2.put("kb", strM2974p);
        }
        ArrayService arrayServiceM2913p = this.f2186a.m2913p();
        if (arrayServiceM2913p.isAppHubInstalled()) {
            if (arrayServiceM2913p.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", arrayServiceM2913p.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(arrayServiceM2913p.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceM2913p.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceM2913p.getAppHubPackageName()));
        }
        return map2;
    }

    /* renamed from: a */
    private Map m2951a(Intent intent) {
        if (intent == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(5);
        map.put("action", StringUtils.emptyIfNull(intent.getAction()));
        map.put("data", StringUtils.emptyIfNull(intent.getDataString()));
        map.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        map.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        map.put("categories", categories != null ? new ArrayList(categories) : Collections.EMPTY_LIST);
        return map;
    }

    /* renamed from: a */
    private String m2949a(ApplicationExitInfo applicationExitInfo, int i) {
        InputStream traceInputStream;
        String line;
        if (!this.f2186a.m2888c(C1268v4.f2535A4).contains(Integer.toString(i))) {
            Integer num = (Integer) this.f2186a.m2866a(C1268v4.f2944z4);
            if (num.intValue() > 0) {
                try {
                    traceInputStream = applicationExitInfo.getTraceInputStream();
                } catch (Throwable th) {
                    this.f2186a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f2186a.m2847O().m3212a("DataCollector", "Failed to obtain trace input stream from application exit info", th);
                    }
                    this.f2186a.m2832E().m2155b("DataCollector", "getTraceInputStream", th);
                    traceInputStream = null;
                }
                if (traceInputStream != null) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                        for (int i2 = 0; i2 < num.intValue() && (line = bufferedReader.readLine()) != null; i2++) {
                            try {
                                sb.append(line);
                                sb.append('\n');
                            } finally {
                            }
                        }
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        this.f2186a.m2847O();
                        if (C1240o.m3200a()) {
                            this.f2186a.m2847O().m3212a("DataCollector", "Failed to read stack trace from input stream", th2);
                        }
                        this.f2186a.m2832E().m2155b("DataCollector", "readStackTraceFromInputStream", th2);
                    }
                    return sb.toString();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ void m2956a(String str, int i, String str2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putIntegerIfValid("error_code", Integer.valueOf(i), mapHashMap);
        CollectionUtils.putStringIfValid("error_message", str2, mapHashMap);
        this.f2186a.m2832E().m576d(C0993c2.f540s0, mapHashMap);
    }

    /* renamed from: a */
    public static void m2955a(AbstractC1263v.a aVar) {
        f2184k.set(aVar);
    }

    /* renamed from: a */
    public static void m2954a(b bVar) {
        f2185l.set(bVar);
    }

    /* renamed from: a */
    public static void m2957a(String str, C1220k c1220k) {
        String strM2950a = m2950a(C1220k.m2824o().getApplicationInfo().packageName, C1220k.m2824o().getPackageManager(), c1220k);
        List listM2888c = c1220k.m2888c(C1268v4.f2617K6);
        if (!StringUtils.isValidString(strM2950a) || listM2888c.contains(strM2950a)) {
            f2182i = str;
        }
    }

    /* renamed from: a */
    private boolean m2959a(String str) {
        return m2960b(str) == 1;
    }

    /* renamed from: a */
    private static String m2950a(String str, PackageManager packageManager, C1220k c1220k) {
        try {
            if (((Boolean) c1220k.m2866a(C1268v4.f2904u4)).booleanValue() && AbstractC1141o0.m1942b()) {
                return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th) {
            c1220k.m2832E().m2148a("DataCollector", "getInstallerName", th);
            return null;
        }
    }
}

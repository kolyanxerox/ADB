package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.ironsource.le */
/* loaded from: classes2.dex */
public class RunnableC3323le implements Runnable {

    /* renamed from: M */
    public static final String f9324M = "sdkVersion";

    /* renamed from: N */
    public static final String f9325N = "AdvIdOptOutReason";

    /* renamed from: O */
    private static final int f9326O = 15;

    /* renamed from: P */
    private static final int f9327P = 840;

    /* renamed from: Q */
    private static final int f9328Q = -720;

    /* renamed from: K */
    private Context f9339K;

    /* renamed from: a */
    private final String f9341a = getClass().getSimpleName();

    /* renamed from: b */
    private final String f9342b = "bundleId";

    /* renamed from: c */
    private final String f9343c = "advertisingId";

    /* renamed from: d */
    private final String f9344d = C3034d9.i.f8158M;

    /* renamed from: e */
    private final String f9345e = "appKey";

    /* renamed from: f */
    private final String f9346f = "deviceOS";

    /* renamed from: g */
    private final String f9347g = "osVersion";

    /* renamed from: h */
    private final String f9348h = C3034d9.i.f8208t;

    /* renamed from: i */
    private final String f9349i = C3034d9.i.f8209u;

    /* renamed from: j */
    private final String f9350j = "language";

    /* renamed from: k */
    private final String f9351k = C3034d9.i.f8191k;

    /* renamed from: l */
    private final String f9352l = C3034d9.i.f8193l;

    /* renamed from: m */
    private final String f9353m = C3034d9.i.f8205r;

    /* renamed from: n */
    private final String f9354n = "externalFreeMemory";

    /* renamed from: o */
    private final String f9355o = "internalFreeMemory";

    /* renamed from: p */
    private final String f9356p = "battery";

    /* renamed from: q */
    private final String f9357q = "gmtMinutesOffset";

    /* renamed from: r */
    private final String f9358r = C3034d9.i.f8168W;

    /* renamed from: s */
    private final String f9359s = JsonStorageKeyNames.SESSION_ID_KEY;

    /* renamed from: t */
    private final String f9360t = "pluginType";

    /* renamed from: u */
    private final String f9361u = "pluginVersion";

    /* renamed from: v */
    private final String f9362v = "plugin_fw_v";

    /* renamed from: w */
    private final String f9363w = "jb";

    /* renamed from: x */
    private final String f9364x = "advertisingIdType";

    /* renamed from: y */
    private final String f9365y = C3451ne.f10454Y0;

    /* renamed from: z */
    private final String f9366z = "firstSession";

    /* renamed from: A */
    private final String f9329A = "mcc";

    /* renamed from: B */
    private final String f9330B = "mnc";

    /* renamed from: C */
    private final String f9331C = "icc";

    /* renamed from: D */
    private final String f9332D = "tz";

    /* renamed from: E */
    private final String f9333E = "auid";

    /* renamed from: F */
    private final String f9334F = "userLat";

    /* renamed from: G */
    private final String f9335G = "publisherAPI";

    /* renamed from: H */
    private final String f9336H = "missingDependencies";

    /* renamed from: I */
    private final String f9337I = "missingManifest";

    /* renamed from: J */
    private final String f9338J = C3824x4.f12569d;

    /* renamed from: L */
    private final InterfaceC3767vf f9340L = C3495on.m11199U().mo8686f();

    private RunnableC3323le() {
    }

    /* renamed from: a */
    private String m9762a(String str) {
        return TextUtils.isEmpty(str) ? "missingDependencies" : !C3830xa.f12596a.m13037b() ? "publisherAPI" : !this.f9340L.mo4881v(this.f9339K) ? "missingManifest" : Boolean.parseBoolean(str) ? "userLat" : C3824x4.f12569d;
    }

    /* renamed from: b */
    private String m9765b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    /* renamed from: c */
    private String m9766c() {
        return C3404p.m10470j().m10554k();
    }

    /* renamed from: d */
    private int m9767d() {
        try {
            Intent intentRegisterReceiver = this.f9339K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9341a, ":getBatteryLevel()"), e);
        }
        return -1;
    }

    /* renamed from: e */
    private String m9768e() {
        try {
            return this.f9339K.getPackageName();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    /* renamed from: f */
    private String m9769f() {
        try {
            return Build.MODEL;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    /* renamed from: g */
    private String m9770g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    /* renamed from: h */
    private String m9771h() {
        return C3034d9.f7893d;
    }

    /* renamed from: i */
    private long m9772i() {
        if (!m9782s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
    }

    /* renamed from: j */
    private int m9773j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9341a, ":getGmtMinutesOffset()"), e);
            return 0;
        }
    }

    /* renamed from: k */
    private long m9774k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return -1L;
        }
    }

    /* renamed from: l */
    private String m9775l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    /* renamed from: m */
    private String m9776m() {
        return C3404p.m10470j().m10558n();
    }

    /* renamed from: n */
    private String m9777n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f9339K.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!networkOperatorName.equals("")) {
                    return networkOperatorName;
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9341a, ":getMobileCarrier()"), e);
        }
        return "";
    }

    /* renamed from: o */
    private String m9778o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    /* renamed from: p */
    private String m9779p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    /* renamed from: q */
    private String m9780q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    /* renamed from: r */
    private String m9781r() {
        return LevelPlay.getSdkVersion();
    }

    /* renamed from: s */
    private boolean m9782s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C3288ke.m9661a().m9664a(m9763a());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = ".concat(getClass().getSimpleName()), e);
        }
    }

    public RunnableC3323le(Context context) {
        this.f9339K = context.getApplicationContext();
    }

    /* renamed from: a */
    private Map<String, Object> m9763a() {
        boolean z;
        String str;
        HashMap map = new HashMap();
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.getSessionId());
        String strM9768e = m9768e();
        if (!TextUtils.isEmpty(strM9768e)) {
            map.put("bundleId", strM9768e);
            String strM7867b = C2959b4.m7867b(this.f9339K, strM9768e);
            if (!TextUtils.isEmpty(strM7867b)) {
                map.put(C3034d9.i.f8168W, strM7867b);
            }
        }
        map.put("appKey", m9766c());
        String strMo4871p = this.f9340L.mo4871p(this.f9339K);
        String strMo4837a = this.f9340L.mo4837a(this.f9339K);
        boolean z2 = false;
        if (TextUtils.isEmpty(strMo4871p)) {
            strMo4871p = this.f9340L.mo4832M(this.f9339K);
            z = true;
            str = !TextUtils.isEmpty(strMo4871p) ? IronSourceConstants.TYPE_UUID : "";
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z = false;
        }
        if (!TextUtils.isEmpty(strMo4871p)) {
            map.put("advertisingId", strMo4871p);
            map.put("advertisingIdType", str);
        }
        if (!TextUtils.isEmpty(strMo4837a)) {
            z2 = Boolean.parseBoolean(strMo4837a);
            map.put(C3034d9.i.f8158M, Boolean.valueOf(z2));
        }
        if (z || z2) {
            map.put(f9325N, m9762a(strMo4837a));
        }
        map.put("deviceOS", m9771h());
        if (!TextUtils.isEmpty(m9765b())) {
            map.put("osVersion", m9765b());
        }
        String connectionType = IronSourceUtils.getConnectionType(this.f9339K);
        if (!TextUtils.isEmpty(connectionType)) {
            map.put(C3034d9.i.f8208t, connectionType);
        }
        String strM4801d = C2635a9.m4801d(this.f9339K);
        if (!TextUtils.isEmpty(strM4801d)) {
            map.put(C3034d9.i.f8209u, strM4801d);
        }
        map.put("sdkVersion", m9781r());
        String strM9775l = m9775l();
        if (!TextUtils.isEmpty(strM9775l)) {
            map.put("language", strM9775l);
        }
        String strM9770g = m9770g();
        if (!TextUtils.isEmpty(strM9770g)) {
            map.put(C3034d9.i.f8191k, strM9770g);
        }
        String strM9769f = m9769f();
        if (!TextUtils.isEmpty(strM9769f)) {
            map.put(C3034d9.i.f8193l, strM9769f);
        }
        String strM9777n = m9777n();
        if (!TextUtils.isEmpty(strM9777n)) {
            map.put(C3034d9.i.f8205r, strM9777n);
        }
        map.put("internalFreeMemory", Long.valueOf(m9774k()));
        map.put("externalFreeMemory", Long.valueOf(m9772i()));
        map.put("battery", Integer.valueOf(m9767d()));
        int iM9773j = m9773j();
        if (m9764a(iM9773j)) {
            map.put("gmtMinutesOffset", Integer.valueOf(iM9773j));
        }
        String strM9779p = m9779p();
        if (!TextUtils.isEmpty(strM9779p)) {
            map.put("pluginType", strM9779p);
        }
        String strM9780q = m9780q();
        if (!TextUtils.isEmpty(strM9780q)) {
            map.put("pluginVersion", strM9780q);
        }
        String strM9778o = m9778o();
        if (!TextUtils.isEmpty(strM9778o)) {
            map.put("plugin_fw_v", strM9778o);
        }
        String strValueOf = String.valueOf(this.f9340L.mo4851f());
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put("jb", strValueOf);
        }
        String strM9776m = m9776m();
        if (!TextUtils.isEmpty(strM9776m)) {
            map.put(C3451ne.f10454Y0, strM9776m);
        }
        String strValueOf2 = String.valueOf(IronSourceUtils.getFirstSession(this.f9339K));
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put("firstSession", strValueOf2);
        }
        String strMo4879t = this.f9340L.mo4879t(this.f9339K);
        if (!TextUtils.isEmpty(strMo4879t)) {
            map.put("auid", strMo4879t);
        }
        map.put("mcc", Integer.valueOf(C3896z8.m13300b(this.f9339K)));
        map.put("mnc", Integer.valueOf(C3896z8.m13301c(this.f9339K)));
        String strMo4867n = this.f9340L.mo4867n(this.f9339K);
        if (!TextUtils.isEmpty(strMo4867n)) {
            map.put("icc", strMo4867n);
        }
        String strMo4841b = this.f9340L.mo4841b();
        if (!TextUtils.isEmpty(strMo4841b)) {
            map.put("tz", strMo4841b);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    /* renamed from: a */
    private boolean m9764a(int i) {
        return i <= f9327P && i >= f9328Q && i % 15 == 0;
    }
}

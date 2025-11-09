package com.ironsource;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.C3034d9;
import com.ironsource.InterfaceC3621s9;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.IronSourceSharedPreferencesUtilities;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.ironsource.ab */
/* loaded from: classes2.dex */
public class C2637ab implements InterfaceC3767vf, InterfaceC3767vf.a {

    /* renamed from: A */
    private static final String f3944A = "browser_user_agent";

    /* renamed from: B */
    private static final String f3945B = "browser_user_agent_time";

    /* renamed from: C */
    private static final String f3946C = "IABTCF_gdprApplies";

    /* renamed from: D */
    private static final String f3947D = "IABTCF_TCString";

    /* renamed from: E */
    private static final String f3948E = "IABTCF_AddtlConsent";

    /* renamed from: j */
    private static final String f3949j = "android";

    /* renamed from: k */
    private static final String f3950k = "com.google.android.gms.permission.AD_ID";

    /* renamed from: l */
    private static final String f3951l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* renamed from: m */
    private static final String f3952m = "com.google.android.gms.appset.AppSet";

    /* renamed from: n */
    private static final String f3953n = "com.google.android.gms.tasks.OnSuccessListener";

    /* renamed from: o */
    private static final String f3954o = "getAdvertisingIdInfo";

    /* renamed from: p */
    private static final String f3955p = "getClient";

    /* renamed from: q */
    private static final String f3956q = "getAppSetIdInfo";

    /* renamed from: r */
    private static final String f3957r = "addOnSuccessListener";

    /* renamed from: s */
    private static final String f3958s = "getId";

    /* renamed from: t */
    private static final String f3959t = "isLimitAdTrackingEnabled";

    /* renamed from: u */
    private static final String f3960u = "Mediation_Shared_Preferences";

    /* renamed from: v */
    private static final String f3961v = "supersonic_shared_preferen";

    /* renamed from: w */
    private static final String f3962w = "cachedUUID";

    /* renamed from: x */
    private static final String f3963x = "auid";

    /* renamed from: y */
    private static final String f3964y = "unityads-installinfo";

    /* renamed from: z */
    private static final String f3965z = "unityads-idfi";

    /* renamed from: b */
    private String f3966b = null;

    /* renamed from: c */
    private String f3967c = null;

    /* renamed from: d */
    private String f3968d = null;

    /* renamed from: e */
    private String f3969e = "";

    /* renamed from: f */
    private boolean f3970f = false;

    /* renamed from: g */
    private String f3971g = "";

    /* renamed from: h */
    private volatile String f3972h;

    /* renamed from: i */
    private volatile String f3973i;

    /* renamed from: com.ironsource.ab$a */
    public class a implements InvocationHandler {
        public a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String string = obj2.getClass().getMethod(C2637ab.f3958s, null).invoke(objArr[0], null).toString();
                        if (!TextUtils.isEmpty(string)) {
                            C2637ab.this.f3971g = string;
                        }
                    }
                } catch (Exception e) {
                    C3551q9.m11517d().m11519a(e);
                }
            }
            return null;
        }
    }

    /* renamed from: O */
    private String m4809O(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objM4811Q = m4811Q(context);
        return objM4811Q.getClass().getMethod(f3958s, null).invoke(objM4811Q, null).toString();
    }

    /* renamed from: P */
    private void m4810P(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = AppSet.class.getMethod(f3955p, Context.class).invoke(AppSet.class, context);
        Object objInvoke2 = objInvoke.getClass().getMethod(f3956q, null).invoke(objInvoke, null);
        objInvoke2.getClass().getMethod(f3957r, OnSuccessListener.class).invoke(objInvoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    /* renamed from: Q */
    private Object m4811Q(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return AdvertisingIdClient.class.getMethod(f3954o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    /* renamed from: R */
    private String m4812R(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objM4811Q = m4811Q(context);
        return String.valueOf(((Boolean) objM4811Q.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objM4811Q, null)).booleanValue());
    }

    /* renamed from: S */
    private String m4813S(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f3960u, f3944A, "");
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: T */
    private long m4814T(Context context) {
        try {
            return Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f3960u, f3945B, String.valueOf(-1L)));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: A */
    public int mo4820A(Context context) {
        int iMo4831L = mo4831L(context);
        int iMo4827H = mo4827H(context);
        return (((iMo4831L == 0 || iMo4831L == 2) && iMo4827H == 2) || ((iMo4831L == 1 || iMo4831L == 3) && iMo4827H == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: B */
    public int mo4821B(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, f3946C, -1);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return -1;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: C */
    public int mo4822C(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: D */
    public String mo4823D(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, "IABTCF_TCString", null);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: E */
    public boolean mo4824E(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: F */
    public String mo4825F(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: G */
    public String mo4826G(Context context) {
        if (!C3830xa.f12596a.m13039c()) {
            return "";
        }
        try {
            m4810P(context);
            return !TextUtils.isEmpty(this.f3971g) ? this.f3971g : "";
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: H */
    public int mo4827H(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: I */
    public String mo4828I(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: J */
    public boolean mo4829J(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: K */
    public String mo4830K(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, f3948E, null);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: L */
    public int mo4831L(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: M */
    public synchronized String mo4832M(Context context) {
        if (!TextUtils.isEmpty(this.f3966b)) {
            return this.f3966b;
        }
        if (IronSourceSharedPreferencesUtilities.getBooleanFromSharedPrefs(context, f3960u, InterfaceC3767vf.f12364a, true)) {
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f3960u, f3962w, "");
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String string = UUID.randomUUID().toString();
                this.f3966b = string;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f3960u, f3962w, string);
            } else {
                this.f3966b = stringFromSharedPrefs;
            }
        }
        return this.f3966b;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: N */
    public int mo4833N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: a */
    public int mo4834a() {
        return mo4860k();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: b */
    public Boolean mo4840b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: c */
    public Long mo4843c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: d */
    public int mo4846d() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: e */
    public File mo4848e(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: f */
    public String mo4850f(Context context) {
        if (context == null) {
            return "";
        }
        int iMo4833N = mo4833N(context);
        if (iMo4833N == 0) {
            return C3034d9.h.f8060C;
        }
        if (iMo4833N == 1) {
            return C3034d9.h.f8062D;
        }
        if (iMo4833N == 11) {
            return C3034d9.h.f8060C;
        }
        if (iMo4833N == 12) {
            return C3034d9.h.f8062D;
        }
        switch (iMo4833N) {
            case 6:
            case 8:
                return C3034d9.h.f8060C;
            case 7:
            case 9:
                return C3034d9.h.f8062D;
            default:
                return "none";
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: g */
    public String mo4852g() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: h */
    public float mo4854h() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: i */
    public String mo4856i() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e) {
            IronLog.INTERNAL.error(e.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: j */
    public long mo4858j() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: k */
    public int mo4860k() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: l */
    public int mo4862l() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: m */
    public float mo4864m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: n */
    public long mo4866n() {
        if (mo4844c()) {
            return m4815a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: o */
    public long mo4868o() {
        return m4815a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: p */
    public String mo4870p() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: q */
    public int mo4872q() {
        return -(TimeZone.getDefault().getOffset(mo4858j()) / 60000);
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: r */
    public String mo4874r(Context context) {
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveInfoResolveActivity != null) {
                return resolveInfoResolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: s */
    public int mo4876s() {
        return mo4846d();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: t */
    public String mo4878t() {
        try {
            return this.f3969e.isEmpty() ? m4813S(ContextProvider.getInstance().getApplicationContext()) : this.f3969e;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: u */
    public File mo4880u(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: v */
    public boolean mo4881v(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(f3950k)) {
                    return true;
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: w */
    public String mo4882w(Context context) {
        if (!TextUtils.isEmpty(this.f3968d)) {
            return this.f3968d;
        }
        if (context == null) {
            return null;
        }
        String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "unityads-installinfo", "unityads-idfi", null);
        this.f3968d = stringFromSharedPrefs;
        return stringFromSharedPrefs;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: x */
    public File mo4883x(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: y */
    public int mo4884y(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: z */
    public ActivityManager.MemoryInfo mo4885z(Context context) {
        if (context == null || !C3495on.m11199U().mo8685d().mo11373a()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: a */
    private long m4815a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: b */
    public String mo4841b() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: c */
    public boolean mo4844c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (Environment.isExternalStorageRemovable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: d */
    public boolean mo4847d(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: e */
    public String mo4849e() {
        return Build.MODEL;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: f */
    public boolean mo4851f() {
        return m4819b(AndroidStaticDeviceInfoDataSource.BINARY_SU);
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: g */
    public boolean mo4853g(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: h */
    public long mo4855h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: i */
    public String mo4857i(Context context) {
        return mo4877s(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: j */
    public String mo4859j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: k */
    public File mo4861k(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: l */
    public int mo4863l(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: m */
    public String mo4865m() {
        return "android";
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: n */
    public String mo4867n(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.InterfaceC3767vf
    @SuppressLint({"QueryPermissionsNeeded"})
    /* renamed from: o */
    public List<ApplicationInfo> mo4869o(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: p */
    public String mo4871p(Context context) {
        C3830xa c3830xa = C3830xa.f12596a;
        if (c3830xa.m13037b()) {
            try {
                if (!c3830xa.m13035a()) {
                    return m4809O(context);
                }
                if (this.f3973i != null) {
                    return this.f3973i;
                }
                String strM4809O = m4809O(context);
                if (TextUtils.isEmpty(strM4809O)) {
                    return strM4809O;
                }
                this.f3973i = strM4809O;
                return strM4809O;
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
            }
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: q */
    public boolean mo4873q(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: r */
    public boolean mo4875r() {
        return this.f3970f;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: s */
    public boolean mo4877s(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: t */
    public synchronized String mo4879t(Context context) {
        if (!TextUtils.isEmpty(this.f3967c)) {
            return this.f3967c;
        }
        if (context == null) {
            return "";
        }
        String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
        this.f3967c = stringFromSharedPrefs;
        if (TextUtils.isEmpty(stringFromSharedPrefs)) {
            String string = UUID.randomUUID().toString();
            this.f3967c = string;
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.f3967c;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: a */
    public long mo4835a(String str) {
        return m4815a(new File(str));
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: b */
    public String mo4842b(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: c */
    public boolean mo4845c(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    /* renamed from: b */
    private void m4818b(Context context, long j) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f3960u, f3945B, String.valueOf(j));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: a */
    public Long mo4836a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    /* renamed from: b */
    private boolean m4819b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i] + str).exists()) {
                    return true;
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: a */
    public String mo4837a(Context context) {
        try {
            if (!C3830xa.f12596a.m13035a()) {
                return m4812R(context);
            }
            if (this.f3972h != null) {
                return this.f3972h;
            }
            String strM4812R = m4812R(context);
            if (TextUtils.isEmpty(strM4812R)) {
                return strM4812R;
            }
            this.f3972h = strM4812R;
            return strM4812R;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3767vf.a
    /* renamed from: a */
    public void mo4838a(Context context, long j) {
        if (context != null) {
            if (!new C3574qw(new InterfaceC3621s9.a()).m11691a(m4814T(context), j)) {
                this.f3969e = m4813S(context);
                this.f3970f = !r0.isEmpty();
            }
            if (this.f3969e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f3969e = defaultUserAgent;
                    m4817a(context, defaultUserAgent);
                    if (j > 0) {
                        m4818b(context, System.currentTimeMillis());
                    }
                } catch (Exception e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m4817a(Context context, String str) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f3960u, f3944A, str);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3767vf
    /* renamed from: a */
    public boolean mo4839a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }
}

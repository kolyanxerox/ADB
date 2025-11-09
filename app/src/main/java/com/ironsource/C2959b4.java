package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.b4 */
/* loaded from: classes2.dex */
public class C2959b4 {
    /* renamed from: a */
    public static int m7861a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    /* renamed from: b */
    public static String m7866b(Context context) {
        try {
            return m7862a(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: c */
    public static String m7868c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    /* renamed from: d */
    public static long m7870d(Context context) {
        try {
            return m7862a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    /* renamed from: e */
    public static String m7872e(Context context) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            installerPackageName = null;
        }
        return TextUtils.isEmpty(installerPackageName) ? "" : installerPackageName;
    }

    /* renamed from: f */
    public static long m7873f(Context context) {
        try {
            return m7862a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    /* renamed from: g */
    public static String m7874g(Context context) {
        return context.getPackageName();
    }

    /* renamed from: a */
    public static PackageInfo m7862a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(m7874g(context), 0);
    }

    /* renamed from: b */
    public static String m7867b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m7869c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: d */
    public static boolean m7871d(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    boolean zEquals = false;
                    while (true) {
                        try {
                            String[] strArr = packageInfo.requestedPermissions;
                            if (i >= strArr.length || zEquals) {
                                break;
                            }
                            zEquals = str.equals(strArr[i]);
                            i++;
                        } catch (Exception e) {
                            e = e;
                            z = zEquals;
                            C3551q9.m11517d().m11519a(e);
                            IronLog.INTERNAL.error(e.toString());
                            return z;
                        }
                    }
                    return zEquals;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static String m7863a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m7864a(Context context, JSONArray jSONArray) throws JSONException, PackageManager.NameNotFoundException {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                    i++;
                }
            } else {
                List listAsList = Arrays.asList(packageInfo.requestedPermissions);
                while (i < jSONArray.length()) {
                    String string = jSONArray.getString(i);
                    int iIndexOf = listAsList.indexOf(string);
                    if (iIndexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[iIndexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m7865a() {
        return true;
    }
}

package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.C3034d9;
import com.ironsource.C3233is;
import com.ironsource.C3419mh;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SDKUtils {

    /* renamed from: a */
    private static final String f11858a = "SDKUtils";

    /* renamed from: b */
    private static String f11859b = null;

    /* renamed from: c */
    private static String f11860c = null;

    /* renamed from: d */
    private static String f11861d = null;

    /* renamed from: e */
    private static int f11862e = 0;

    /* renamed from: f */
    private static String f11863f = null;

    /* renamed from: g */
    private static Map<String, String> f11864g = null;

    /* renamed from: h */
    private static String f11865h = "";

    /* renamed from: i */
    private static final AtomicInteger f11866i = new AtomicInteger(1);

    /* renamed from: com.ironsource.sdk.utils.SDKUtils$a */
    public class DialogInterfaceOnClickListenerC3660a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    private static int m12272a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = f11866i;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static int convertDpToPx(int i) {
        return (int) TypedValue.applyDimension(0, i, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C3551q9.m11517d().m11519a(e);
            Logger.m12262d(f11858a, "Failed decoding string " + e.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j) {
        return (int) ((j * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] encrypt(java.lang.String r3) throws java.security.NoSuchAlgorithmException {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L18 java.security.NoSuchAlgorithmException -> L1b
            r1.reset()     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            r1.update(r3)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            goto L2d
        L14:
            r3 = move-exception
            goto L1d
        L16:
            r3 = move-exception
            goto L1d
        L18:
            r3 = move-exception
        L19:
            r1 = r0
            goto L1d
        L1b:
            r3 = move-exception
            goto L19
        L1d:
            com.ironsource.q9 r2 = com.ironsource.C3551q9.m11517d()
            r2.m11519a(r3)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = r3.toString()
            r2.error(r3)
        L2d:
            if (r1 == 0) goto L34
            byte[] r3 = r1.digest()
            return r3
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(C3233is c3233is) {
        return fetchDemandSourceId(c3233is.m9387a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    Logger.m12266i(f11858a, "flatMapToJsonAsStringfailed " + e.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z) {
        return z ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f11859b;
    }

    public static String getControllerConfig() {
        return f11863f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f11861d) ? f11861d : "";
    }

    public static int getDebugMode() {
        return f11862e;
    }

    public static String getFileName(String str) {
        try {
            return URLEncoder.encode(str.split(File.separator)[r1.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f11864g;
    }

    public static String getLimitAdTracking() {
        return f11860c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e) {
            C3551q9.m11517d().m11519a(e);
            throw new RuntimeException(e);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C3034d9.d.f7974b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C3034d9.a.f7915b);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) throws JSONException {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(interfaceC3767vfMo8686f.mo4827H(context)));
            return jSONObject;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    public static C3419mh.e getProductType(String str) {
        C3419mh.e eVar = C3419mh.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C3419mh.e eVar2 = C3419mh.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "8.10.0";
    }

    public static String getTesterParameters() {
        return f11865h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState)) {
                return true;
            }
            return "mounted_ro".equals(externalStorageState);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        String strMo4871p = interfaceC3767vfMo8686f.mo4871p(context);
        String strMo4837a = interfaceC3767vfMo8686f.mo4837a(context);
        if (!TextUtils.isEmpty(strMo4871p)) {
            f11859b = strMo4871p;
        }
        if (TextUtils.isEmpty(strMo4837a)) {
            return;
        }
        f11860c = strMo4837a;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map2 : mapArr) {
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
        }
        return map;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((j / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f11863f = str;
        C3495on.m11193O().mo8486n().mo9675a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f11861d = str;
    }

    public static void setDebugMode(int i) {
        f11862e = i;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f11864g = map;
    }

    public static void setTesterParameters(String str) {
        f11865h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new DialogInterfaceOnClickListenerC3660a()).show();
    }

    public static String translateDeviceOrientation(int i) {
        return i != 1 ? i != 2 ? "none" : C3034d9.h.f8060C : C3034d9.h.f8062D;
    }

    public static String translateOrientation(int i) {
        return i != 1 ? i != 2 ? "none" : C3034d9.h.f8060C : C3034d9.h.f8062D;
    }

    public static String translateRequestedOrientation(int i) {
        if (i == 0) {
            return C3034d9.h.f8060C;
        }
        if (i == 1) {
            return C3034d9.h.f8062D;
        }
        if (i == 11) {
            return C3034d9.h.f8060C;
        }
        if (i == 12) {
            return C3034d9.h.f8062D;
        }
        switch (i) {
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

    public static void updateControllerConfig(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject(f11863f);
            jSONObject2.put(str, jSONObject);
            f11863f = jSONObject2.toString();
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            Logger.m12266i(f11858a, "Unable to update controllerConfigs: " + e.toString());
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }
}

package o000oo00;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.ironsource.C3034d9;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class o00Ooo {
    public static JSONObject OooO00o(PackageInfo packageInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, packageInfo.packageName);
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", packageInfo.versionCode);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                jSONObject.put("versionCode", packageInfo.getLongVersionCode());
            }
            jSONObject.put(C3034d9.i.f8169X, packageInfo.firstInstallTime);
            jSONObject.put(C3034d9.i.f8167V, packageInfo.lastUpdateTime);
            jSONObject.put("sharedUserId", packageInfo.sharedUserId);
            if (packageInfo.applicationInfo != null) {
                JSONObject jSONObject2 = new JSONObject();
                if (i >= 31) {
                    jSONObject2.put("compileSdkVersion", packageInfo.applicationInfo.compileSdkVersion);
                } else {
                    jSONObject2.put("compileSdkVersion", -1);
                }
                jSONObject2.put("targetSdkVersion", packageInfo.applicationInfo.targetSdkVersion);
                jSONObject2.put("uid", packageInfo.applicationInfo.uid);
                jSONObject2.put("sourceDir", packageInfo.applicationInfo.sourceDir);
                jSONObject2.put("dataDir", packageInfo.applicationInfo.dataDir);
                jSONObject2.put("className", packageInfo.applicationInfo.className);
                jSONObject2.put("name", packageInfo.applicationInfo.name);
                jSONObject.put("applicationInfo", jSONObject2);
                return jSONObject;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}

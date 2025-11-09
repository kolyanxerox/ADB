package OooOO0O;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class OooO00o implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener {

    /* renamed from: OooOo */
    public Activity f13305OooOo;

    /* renamed from: OooOo0O */
    public FlutterPlugin.FlutterPluginBinding f13306OooOo0O;

    /* renamed from: OooOo0o */
    public Context f13307OooOo0o;

    /* renamed from: OooOoO */
    public MethodChannel.Result f13308OooOoO;

    /* renamed from: OooOoO0 */
    public MethodChannel f13309OooOoO0;

    /* renamed from: OooOoOO */
    public String f13310OooOoOO;

    /* renamed from: OooOoo */
    public boolean f13311OooOoo = false;

    /* renamed from: OooOoo0 */
    public String f13312OooOoo0;

    public final boolean OooO00o() {
        try {
            return this.f13305OooOo.getPackageManager().canRequestPackageInstalls();
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0() throws org.json.JSONException {
        /*
            r6 = this;
            java.lang.String r0 = r6.f13310OooOoOO
            if (r0 != 0) goto Lb
            r0 = -4
            java.lang.String r1 = "the file path cannot be null"
            r6.OooO0OO(r0, r1)
            return
        Lb:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.canRead()
            r1 = -3
            if (r0 != 0) goto Lbd
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto Lac
            r2 = 33
            if (r0 < r2) goto La0
            java.lang.String r0 = r6.f13310OooOoOO
            java.lang.String r2 = r6.f13312OooOoo0
            boolean r0 = Oooo0o0.OooO.OooOOOo(r0)
            if (r0 == 0) goto La0
            java.lang.String r0 = "image/"
            boolean r3 = r2.contains(r0)
            java.lang.String r4 = "audio/"
            java.lang.String r5 = "video/"
            if (r3 != 0) goto L43
            boolean r3 = r2.contains(r5)
            if (r3 != 0) goto L43
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto La0
        L43:
            java.lang.String r2 = r6.f13312OooOoo0
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L62
            android.app.Activity r0 = r6.f13305OooOo
            java.lang.String r2 = "android.permission.READ_MEDIA_IMAGES"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r2)
            if (r0 != 0) goto L56
            goto L62
        L56:
            boolean r0 = android.os.Environment.isExternalStorageManager()
            if (r0 != 0) goto L62
            java.lang.String r0 = "Permission denied: android.permission.READ_MEDIA_IMAGES"
            r6.OooO0OO(r1, r0)
            return
        L62:
            java.lang.String r0 = r6.f13312OooOoo0
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L81
            android.app.Activity r0 = r6.f13305OooOo
            java.lang.String r2 = "android.permission.READ_MEDIA_VIDEO"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r2)
            if (r0 != 0) goto L75
            goto L81
        L75:
            boolean r0 = android.os.Environment.isExternalStorageManager()
            if (r0 != 0) goto L81
            java.lang.String r0 = "Permission denied: android.permission.READ_MEDIA_VIDEO"
            r6.OooO0OO(r1, r0)
            return
        L81:
            java.lang.String r0 = r6.f13312OooOoo0
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lbd
            android.app.Activity r0 = r6.f13305OooOo
            java.lang.String r2 = "android.permission.READ_MEDIA_AUDIO"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r2)
            if (r0 != 0) goto L94
            goto Lbd
        L94:
            boolean r0 = android.os.Environment.isExternalStorageManager()
            if (r0 != 0) goto Lbd
            java.lang.String r0 = "Permission denied: android.permission.READ_MEDIA_AUDIO"
            r6.OooO0OO(r1, r0)
            return
        La0:
            boolean r0 = android.os.Environment.isExternalStorageManager()
            if (r0 != 0) goto Lbd
            java.lang.String r0 = "Permission denied: android.permission.MANAGE_EXTERNAL_STORAGE"
            r6.OooO0OO(r1, r0)
            return
        Lac:
            android.app.Activity r0 = r6.f13305OooOo
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r2)
            if (r0 != 0) goto Lb7
            goto Lbd
        Lb7:
            java.lang.String r0 = "Permission denied: android.permission.READ_EXTERNAL_STORAGE"
            r6.OooO0OO(r1, r0)
            return
        Lbd:
            java.lang.String r0 = "application/vnd.android.package-archive"
            java.lang.String r2 = r6.f13312OooOoo0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ldd
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto Ld9
            boolean r0 = r6.OooO00o()
            if (r0 != 0) goto Ld9
            java.lang.String r0 = "Permission denied: android.permission.REQUEST_INSTALL_PACKAGES"
            r6.OooO0OO(r1, r0)
            return
        Ld9:
            r6.OooO0Oo()
            return
        Ldd:
            r6.OooO0Oo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOO0O.OooO00o.OooO0O0():void");
    }

    public final void OooO0OO(int i, String str) throws JSONException {
        if (this.f13308OooOoO == null || this.f13311OooOoo) {
            return;
        }
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i));
        map.put(Constants.MESSAGE, str);
        MethodChannel.Result result = this.f13308OooOoO;
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        result.success(jSONObject.toString());
        this.f13311OooOoo = true;
    }

    public final void OooO0Oo() throws JSONException {
        Uri uriForFile;
        String str;
        int i = -4;
        if (this.f13310OooOoOO == null) {
            OooO0OO(-4, "the file path cannot be null");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        Context context = this.f13307OooOo0o;
        String strSubstring = this.f13310OooOoOO;
        if (!strSubstring.contains("/Android/data/") || strSubstring.contains(context.getPackageName())) {
            uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider.com.crazecoder.openfile", new File(strSubstring));
        } else {
            StringBuilder sb = new StringBuilder("content://com.android.externalstorage.documents/tree/primary%3AAndroid%2Fdata/document/primary%3AAndroid%2Fdata%2F");
            if (strSubstring.endsWith("/")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            sb.append(strSubstring.replace("/storage/emulated/0/", "").replace("Android/data/", "").replace("/", "%2F"));
            uriForFile = Uri.parse(sb.toString());
        }
        intent.setDataAndType(uriForFile, this.f13312OooOoo0);
        intent.addFlags(268435459);
        Iterator<ResolveInfo> it = (Build.VERSION.SDK_INT >= 33 ? this.f13305OooOo.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)) : this.f13305OooOo.getPackageManager().queryIntentActivities(intent, 65536)).iterator();
        while (it.hasNext()) {
            this.f13305OooOo.grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
        }
        try {
            this.f13305OooOo.startActivity(intent);
            str = "done";
            i = 0;
        } catch (ActivityNotFoundException unused) {
            i = -1;
            str = "No APP found to open this file。";
        } catch (Exception unused2) {
            str = "File opened incorrectly。";
        }
        OooO0OO(i, str);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i, int i2, Intent intent) throws JSONException {
        Uri data;
        if (intent != null && i == 273 && (data = intent.getData()) != null) {
            this.f13307OooOo0o.getContentResolver().takePersistableUriPermission(data, 3);
            OooO0O0();
        }
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f13305OooOo = activityPluginBinding.getActivity();
        activityPluginBinding.addActivityResultListener(this);
        if (this.f13309OooOoO0 == null) {
            this.f13309OooOoO0 = new MethodChannel(this.f13306OooOo0O.getBinaryMessenger(), "open_file");
        }
        this.f13309OooOoO0.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13306OooOo0O = flutterPluginBinding;
        this.f13307OooOo0o = flutterPluginBinding.getApplicationContext();
        if (this.f13309OooOoO0 == null) {
            this.f13309OooOoO0 = new MethodChannel(this.f13306OooOo0O.getBinaryMessenger(), "open_file");
        }
        this.f13309OooOoO0.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13306OooOo0O = null;
        MethodChannel methodChannel = this.f13309OooOoO0;
        if (methodChannel == null) {
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.f13309OooOoO0 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0075  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r12, io.flutter.plugin.common.MethodChannel.Result r13) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOO0O.OooO00o.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
    }
}

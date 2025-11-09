package o000oOoo;

import OoooOOO.C0001o0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import com.ironsource.C3764vc;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.OooOo;
import o00O0oO.o000000;
import org.apache.tika.Tika;
import org.apache.tika.detect.Detector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.p015io.TikaInputStream;

/* loaded from: classes2.dex */
public final class o000O0o implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: OooOo */
    public Application f31004OooOo;

    /* renamed from: OooOo0O */
    public ActivityPluginBinding f31005OooOo0O;

    /* renamed from: OooOo0o */
    public o0000OO0 f31006OooOo0o;

    /* renamed from: OooOoO */
    public Lifecycle f31007OooOoO;

    /* renamed from: OooOoO0 */
    public FlutterPlugin.FlutterPluginBinding f31008OooOoO0;

    /* renamed from: OooOoOO */
    public o000 f31009OooOoOO;

    /* renamed from: OooOoo */
    public MethodChannel f31010OooOoo;

    /* renamed from: OooOoo0 */
    public Activity f31011OooOoo0;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        this.f31005OooOo0O = binding;
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.f31008OooOoO0;
        if (flutterPluginBinding != null) {
            BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
            OooOo.OooO0Oo(binaryMessenger, "getBinaryMessenger(...)");
            Context applicationContext = flutterPluginBinding.getApplicationContext();
            OooOo.OooO0OO(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ActivityPluginBinding activityPluginBinding = this.f31005OooOo0O;
            OooOo.OooO0O0(activityPluginBinding);
            Activity activity = activityPluginBinding.getActivity();
            OooOo.OooO0Oo(activity, "getActivity(...)");
            ActivityPluginBinding activityPluginBinding2 = this.f31005OooOo0O;
            OooOo.OooO0O0(activityPluginBinding2);
            this.f31011OooOoo0 = activity;
            this.f31004OooOo = (Application) applicationContext;
            this.f31006OooOo0o = new o0000OO0(activity);
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepicker");
            this.f31010OooOoo = methodChannel;
            methodChannel.setMethodCallHandler(this);
            o0000OO0 o0000oo02 = this.f31006OooOo0o;
            if (o0000oo02 != null) {
                new EventChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepickerevent").setStreamHandler(new o000O000(o0000oo02));
                this.f31009OooOoOO = new o000(activity);
                activityPluginBinding2.addActivityResultListener(o0000oo02);
                Lifecycle activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding2);
                this.f31007OooOoO = activityLifecycle;
                o000 o000Var = this.f31009OooOoOO;
                if (o000Var == null || activityLifecycle == null) {
                    return;
                }
                activityLifecycle.addObserver(o000Var);
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        this.f31008OooOoO0 = binding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding;
        o0000OO0 o0000oo02 = this.f31006OooOo0o;
        if (o0000oo02 != null && (activityPluginBinding = this.f31005OooOo0O) != null) {
            activityPluginBinding.removeActivityResultListener(o0000oo02);
        }
        this.f31005OooOo0O = null;
        o000 o000Var = this.f31009OooOoOO;
        if (o000Var != null) {
            Lifecycle lifecycle = this.f31007OooOoO;
            if (lifecycle != null) {
                lifecycle.removeObserver(o000Var);
            }
            Application application = this.f31004OooOo;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(o000Var);
            }
        }
        this.f31007OooOoO = null;
        o0000OO0 o0000oo03 = this.f31006OooOo0o;
        if (o0000oo03 != null) {
            o0000oo03.f30998OooOoo = null;
        }
        this.f31006OooOo0o = null;
        MethodChannel methodChannel = this.f31010OooOoo;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f31010OooOoo = null;
        this.f31004OooOo = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        this.f31008OooOoO0 = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result rawResult) {
        String strDetect;
        Context applicationContext;
        boolean z;
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(rawResult, "rawResult");
        if (this.f31011OooOoo0 == null) {
            rawResult.error("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        o000O00O o000o00o2 = new o000O00O(rawResult);
        Object obj = call.arguments;
        HashMap map = obj instanceof HashMap ? (HashMap) obj : null;
        String str = call.method;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1349088399) {
                if (iHashCode != 3522941) {
                    if (iHashCode == 94746189 && str.equals("clear")) {
                        Activity activity = this.f31011OooOoo0;
                        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
                            try {
                                o000O00.OooO0oo(new File(applicationContext.getCacheDir() + "/file_picker/"));
                                z = true;
                            } catch (Exception e) {
                                Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e);
                                z = false;
                            }
                            objValueOf = Boolean.valueOf(z);
                        }
                        o000o00o2.success(objValueOf);
                        return;
                    }
                } else if (str.equals("save")) {
                    Object obj2 = map != null ? map.get("fileType") : null;
                    OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
                    String strOooO = C0001o0.OooO((String) obj2);
                    String str2 = (String) (map != null ? map.get("initialDirectory") : null);
                    byte[] bArr = (byte[]) (map != null ? map.get("bytes") : null);
                    String strValueOf = String.valueOf(map != null ? map.get(C3764vc.c.f12347b) : null);
                    if (strValueOf.length() > 0 && !o000000.Oooo0o(".", strValueOf)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strValueOf);
                        sb.append('.');
                        String strDetect2 = new Tika().detect(bArr);
                        OooOo.OooO0O0(strDetect2);
                        sb.append(o000000.OooooOO(strDetect2, "/"));
                        strValueOf = sb.toString();
                    }
                    o0000OO0 o0000oo02 = this.f31006OooOo0o;
                    if (o0000oo02 != null) {
                        if (o0000oo02.f30994OooOo0o != null) {
                            int i = o0000OO0.f30990OooOooo;
                            o000o00o2.error("already_active", "File picker is already active", null);
                            return;
                        }
                        o0000oo02.f30994OooOo0o = o000o00o2;
                        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        if (strValueOf != null && strValueOf.length() != 0) {
                            intent.putExtra("android.intent.extra.TITLE", strValueOf);
                        }
                        o0000oo02.f31000OooOooO = bArr;
                        if (!"dir".equals(strOooO)) {
                            try {
                                Tika tika = new Tika();
                                if (strValueOf == null || strValueOf.length() == 0) {
                                    strDetect = tika.detect(bArr);
                                } else {
                                    Detector detector = tika.getDetector();
                                    TikaInputStream tikaInputStream = TikaInputStream.get(bArr);
                                    Metadata metadata = new Metadata();
                                    metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, strValueOf);
                                    strDetect = detector.detect(tikaInputStream, metadata).toString();
                                }
                                if (OooOo.OooO00o(strDetect, "text/plain")) {
                                    strDetect = "*/*";
                                } else {
                                    OooOo.OooO0O0(strDetect);
                                }
                                intent.setType(strDetect);
                            } catch (Throwable th) {
                                intent.setType("*/*");
                                Log.e("FilePickerDelegate", "Failed to detect mime type. " + th);
                            }
                        }
                        if (str2 != null && str2.length() != 0 && Build.VERSION.SDK_INT >= 26) {
                            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str2));
                        }
                        Activity activity2 = o0000oo02.f30993OooOo0O;
                        if (intent.resolveActivity(activity2.getPackageManager()) != null) {
                            activity2.startActivityForResult(intent, o0000OO0.f30991Oooo000);
                            return;
                        } else {
                            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
                            o0000oo02.OooO0O0("invalid_format_type", "Can't handle the provided file type.");
                            return;
                        }
                    }
                    return;
                }
            } else if (str.equals("custom")) {
                ArrayList arrayListOooO0o = o000O00.OooO0o((ArrayList) (map != null ? map.get("allowedExtensions") : null));
                o0000OO0 o0000oo03 = this.f31006OooOo0o;
                if (o0000oo03 != null) {
                    o000O00.OooO(o0000oo03, C0001o0.OooO(str), (Boolean) (map != null ? map.get("allowMultipleSelection") : null), (Boolean) (map != null ? map.get("withData") : null), arrayListOooO0o, (Integer) (map != null ? map.get("compressionQuality") : null), o000o00o2);
                    return;
                }
                return;
            }
        }
        OooOo.OooO0O0(str);
        String strOooO2 = C0001o0.OooO(str);
        if (strOooO2 == null) {
            o000o00o2.notImplemented();
            return;
        }
        o0000OO0 o0000oo04 = this.f31006OooOo0o;
        if (o0000oo04 != null) {
            o000O00.OooO(o0000oo04, strOooO2, (Boolean) (map != null ? map.get("allowMultipleSelection") : null), (Boolean) (map != null ? map.get("withData") : null), o000O00.OooO0o((ArrayList) (map != null ? map.get("allowedExtensions") : null)), (Integer) (map != null ? map.get("compressionQuality") : null), o000o00o2);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        onAttachedToActivity(binding);
    }
}

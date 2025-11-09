package o00O00;

import android.content.Context;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import o000Oo0O.OooOo00;

/* loaded from: classes3.dex */
public final class OooO00o implements FlutterPlugin, ActivityAware {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooOo00 f31252OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0O0 f31253OooOo0o;

    public OooO00o() {
        OooOo00 oooOo00 = new OooOo00(12, false);
        oooOo00.f30372OooOo0o = null;
        oooOo00.f30370OooOo = null;
        this.f31252OooOo0O = oooOo00;
        this.f31253OooOo0o = new OooO0O0(oooOo00);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f31252OooOo0O.f30372OooOo0o = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        OooOo00 oooOo00 = this.f31252OooOo0O;
        oooOo00.f30370OooOo = applicationContext;
        oooOo00.f30372OooOo0o = null;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        OooO0O0 oooO0O0 = this.f31253OooOo0o;
        if (oooO0O0.f31255OooOo0o != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            MethodChannel methodChannel = oooO0O0.f31255OooOo0o;
            if (methodChannel == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no methodChannel had been initialized.");
            } else {
                methodChannel.setMethodCallHandler(null);
                oooO0O0.f31255OooOo0o = null;
            }
        }
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/android_intent");
        oooO0O0.f31255OooOo0o = methodChannel2;
        methodChannel2.setMethodCallHandler(oooO0O0);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.f31252OooOo0O.f30372OooOo0o = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        OooOo00 oooOo00 = this.f31252OooOo0O;
        oooOo00.f30370OooOo = null;
        oooOo00.f30372OooOo0o = null;
        OooO0O0 oooO0O0 = this.f31253OooOo0o;
        MethodChannel methodChannel = oooO0O0.f31255OooOo0o;
        if (methodChannel == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no methodChannel had been initialized.");
        } else {
            methodChannel.setMethodCallHandler(null);
            oooO0O0.f31255OooOo0o = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}

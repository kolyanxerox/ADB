package OooO;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes2.dex */
public final class OooO0OO implements FlutterPlugin, ActivityAware {

    /* renamed from: OooOo */
    public ActivityPluginBinding f13249OooOo;

    /* renamed from: OooOo0O */
    public OooO0o f13250OooOo0O;

    /* renamed from: OooOo0o */
    public MethodChannel f13251OooOo0o;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        OooO0o oooO0o = this.f13250OooOo0O;
        if (oooO0o != null) {
            oooO0o.f13252OooOo = activity;
        }
        this.f13249OooOo = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(oooO0o);
        this.f13249OooOo.addRequestPermissionsResultListener(this.f13250OooOo0O);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13250OooOo0O = new OooO0o(flutterPluginBinding.getApplicationContext());
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter.baseflow.com/permissions/methods");
        this.f13251OooOo0o = methodChannel;
        methodChannel.setMethodCallHandler(new OooO0O0(applicationContext, new o000000.OooO(1), this.f13250OooOo0O, new o000OOoO.OooO(1)));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        OooO0o oooO0o = this.f13250OooOo0O;
        if (oooO0o != null) {
            oooO0o.f13252OooOo = null;
        }
        ActivityPluginBinding activityPluginBinding = this.f13249OooOo;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(oooO0o);
            this.f13249OooOo.removeRequestPermissionsResultListener(this.f13250OooOo0O);
        }
        this.f13249OooOo = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13251OooOo0o.setMethodCallHandler(null);
        this.f13251OooOo0o = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}

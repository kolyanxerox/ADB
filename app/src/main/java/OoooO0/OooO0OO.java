package OooOO0;

import android.os.Build;
import android.os.Vibrator;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodChannel;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public class OooO0OO implements FlutterPlugin {

    /* renamed from: OooOo0O */
    public MethodChannel f13304OooOo0O;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        OooO00o oooO00o = new OooO00o(new OooOO0(Build.VERSION.SDK_INT < 31 ? (Vibrator) flutterPluginBinding.getApplicationContext().getSystemService("vibrator") : OooO0O0.OooOOOO(flutterPluginBinding.getApplicationContext().getSystemService("vibrator_manager")).getDefaultVibrator(), 1));
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "vibration");
        this.f13304OooOo0O = methodChannel;
        methodChannel.setMethodCallHandler(oooO00o);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13304OooOo0O.setMethodCallHandler(null);
        this.f13304OooOo0O = null;
    }
}

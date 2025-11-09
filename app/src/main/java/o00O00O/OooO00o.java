package o00O00O;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooO00o implements FlutterPlugin {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public MethodChannel f31257OooOo0O;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        OooOo.OooO0Oo(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        OooOo.OooO0Oo(applicationContext, "getApplicationContext(...)");
        this.f31257OooOo0O = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = applicationContext.getPackageManager();
        OooOo.OooO0Oo(packageManager, "getPackageManager(...)");
        Object systemService = applicationContext.getSystemService("activity");
        OooOo.OooO0OO(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = applicationContext.getContentResolver();
        OooOo.OooO0O0(contentResolver);
        OooO0O0 oooO0O0 = new OooO0O0(packageManager, (ActivityManager) systemService, contentResolver);
        MethodChannel methodChannel = this.f31257OooOo0O;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(oooO0O0);
        } else {
            OooOo.OooOO0o("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        MethodChannel methodChannel = this.f31257OooOo0O;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            OooOo.OooOO0o("methodChannel");
            throw null;
        }
    }
}

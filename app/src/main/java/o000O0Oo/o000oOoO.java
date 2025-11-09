package o000o0oO;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import androidx.datastore.preferences.protobuf.OooO00o;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class o000oOoO implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: OooOo */
    public HandlerThread f30972OooOo;

    /* renamed from: OooOo0O */
    public MethodChannel f30973OooOo0O;

    /* renamed from: OooOo0o */
    public OooOo f30974OooOo0o;

    /* renamed from: OooOoO0 */
    public Handler f30975OooOoO0;

    public static String OooO00o(o000oOoO o000oooo2, MethodCall methodCall) {
        Map map = (Map) methodCall.arguments;
        OooOo oooOo = o000oooo2.f30974OooOo0o;
        return OooO00o.OooOOO0(new StringBuilder(), oooOo.f30961OooO0OO, "_", (String) map.get("key"));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        try {
            this.f30974OooOo0o = new OooOo(flutterPluginBinding.getApplicationContext(), new HashMap());
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f30972OooOo = handlerThread;
            handlerThread.start();
            this.f30975OooOoO0 = new Handler(this.f30972OooOo.getLooper());
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.it_nomads.com/flutter_secure_storage");
            this.f30973OooOo0O = methodChannel;
            methodChannel.setMethodCallHandler(this);
        } catch (Exception e) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.f30973OooOo0O != null) {
            this.f30972OooOo.quitSafely();
            this.f30972OooOo = null;
            this.f30973OooOo0O.setMethodCallHandler(null);
            this.f30973OooOo0O = null;
        }
        this.f30974OooOo0o = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        this.f30975OooOoO0.post(new Oooo0(this, methodCall, new Oooo000(result)));
    }
}

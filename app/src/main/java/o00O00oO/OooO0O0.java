package o00O00OO;

import OooOOo0.o0OOO0o;
import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooO0O0 implements FlutterPlugin, ActivityAware {

    /* renamed from: OooOo */
    public MethodChannel f31263OooOo;

    /* renamed from: OooOo0O */
    public o0OOO0o f31264OooOo0O;

    /* renamed from: OooOo0o */
    public OooO0OO f31265OooOo0o;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        OooO0OO oooO0OO = this.f31265OooOo0o;
        if (oooO0OO == null) {
            OooOo.OooOO0o("manager");
            throw null;
        }
        binding.addActivityResultListener(oooO0OO);
        o0OOO0o o0ooo0o = this.f31264OooOo0O;
        if (o0ooo0o != null) {
            o0ooo0o.f13516OooOo = binding.getActivity();
        } else {
            OooOo.OooOO0o(AppLovinEventTypes.USER_SHARED_LINK);
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        this.f31263OooOo = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
        OooOo.OooO0Oo(binding.getApplicationContext(), "getApplicationContext(...)");
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f31267OooOo0o = new AtomicBoolean(true);
        this.f31265OooOo0o = oooO0OO;
        Context applicationContext = binding.getApplicationContext();
        OooOo.OooO0Oo(applicationContext, "getApplicationContext(...)");
        OooO0OO oooO0OO2 = this.f31265OooOo0o;
        if (oooO0OO2 == null) {
            OooOo.OooOO0o("manager");
            throw null;
        }
        o0OOO0o o0ooo0o = new o0OOO0o(applicationContext, oooO0OO2);
        this.f31264OooOo0O = o0ooo0o;
        OooO0OO oooO0OO3 = this.f31265OooOo0o;
        if (oooO0OO3 == null) {
            OooOo.OooOO0o("manager");
            throw null;
        }
        OooO00o oooO00o = new OooO00o(o0ooo0o, oooO0OO3);
        MethodChannel methodChannel = this.f31263OooOo;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(oooO00o);
        } else {
            OooOo.OooOO0o("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        o0OOO0o o0ooo0o = this.f31264OooOo0O;
        if (o0ooo0o != null) {
            o0ooo0o.f13516OooOo = null;
        } else {
            OooOo.OooOO0o(AppLovinEventTypes.USER_SHARED_LINK);
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        MethodChannel methodChannel = this.f31263OooOo;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            OooOo.OooOO0o("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        onAttachedToActivity(binding);
    }
}

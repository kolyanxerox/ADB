package o00O00o;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooO0OO implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public MethodChannel f31303OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public FlutterPlugin.FlutterPluginBinding f31304OooOo0o;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        OooOo.OooO0o0(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "io.material.plugins/dynamic_color");
        this.f31303OooOo0O = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f31304OooOo0o = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        MethodChannel methodChannel = this.f31303OooOo0O;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            OooOo.OooOO0o("channel");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r0.isSupported() != false) goto L9;
     */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r71, io.flutter.plugin.common.MethodChannel.Result r72) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O00o.OooO0OO.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}

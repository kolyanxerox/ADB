package o00O00OO;

import OooOOo0.o0OOO0o;
import com.applovin.sdk.AppLovinEventTypes;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooO00o implements MethodChannel.MethodCallHandler {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0OOO0o f31261OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0OO f31262OooOo0o;

    public OooO00o(o0OOO0o o0ooo0o, OooO0OO manager) {
        OooOo.OooO0o0(manager, "manager");
        this.f31261OooOo0O = o0ooo0o;
        this.f31262OooOo0o = manager;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        MethodChannel.Result result2;
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(result, "result");
        if (!(call.arguments instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
        OooO0OO oooO0OO = this.f31262OooOo0o;
        oooO0OO.getClass();
        AtomicBoolean atomicBoolean = oooO0OO.f31267OooOo0o;
        if (!atomicBoolean.compareAndSet(true, false) && (result2 = oooO0OO.f31266OooOo0O) != null) {
            result2.success("dev.fluttercommunity.plus/share/unavailable");
        }
        SharePlusPendingIntent.f28665OooO00o = "";
        atomicBoolean.set(false);
        oooO0OO.f31266OooOo0O = result;
        try {
            if (!OooOo.OooO00o(call.method, AppLovinEventTypes.USER_SHARED_LINK)) {
                result.notImplemented();
                return;
            }
            o0OOO0o o0ooo0o = this.f31261OooOo0O;
            Object objArguments = call.arguments();
            OooOo.OooO0O0(objArguments);
            o0ooo0o.OooOOoo((Map) objArguments);
        } catch (Throwable th) {
            oooO0OO.f31267OooOo0o.set(true);
            oooO0OO.f31266OooOo0O = null;
            result.error("Share failed", th.getMessage(), th);
        }
    }
}

package o000oOoo;

import OooOo0O.OooO0O0;
import OooOo0o.o000oOoO;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.webviewflutter.OooOOOO;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class o000O00O implements MethodChannel.Result {

    /* renamed from: OooO00o */
    public final MethodChannel.Result f31002OooO00o;

    /* renamed from: OooO0O0 */
    public final Handler f31003OooO0O0 = new Handler(Looper.getMainLooper());

    public o000O00O(MethodChannel.Result result) {
        this.f31002OooO00o = result;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String errorCode, String str, Object obj) {
        OooOo.OooO0o0(errorCode, "errorCode");
        this.f31003OooO0O0.post(new OooO0O0(this, errorCode, str, obj, 28));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.f31003OooO0O0.post(new o000oOoO(this, 28));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        this.f31003OooO0O0.post(new OooOOOO(12, this, obj));
    }
}

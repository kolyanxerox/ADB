package o000o0oO;

import OooOo0O.OooO0O0;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Oooo000 implements MethodChannel.Result {

    /* renamed from: OooO00o */
    public final MethodChannel.Result f30970OooO00o;

    /* renamed from: OooO0O0 */
    public final Handler f30971OooO0O0 = new Handler(Looper.getMainLooper());

    public Oooo000(MethodChannel.Result result) {
        this.f30970OooO00o = result;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String str, String str2, Object obj) {
        this.f30971OooO0O0.post(new OooO0O0(this, str, str2, obj, 27));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        Handler handler = this.f30971OooO0O0;
        MethodChannel.Result result = this.f30970OooO00o;
        Objects.requireNonNull(result);
        handler.post(new OooOo0o.o000oOoO(result, 27));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        this.f30971OooO0O0.post(new OooOOOO(11, this, obj));
    }
}

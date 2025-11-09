package androidx.window.layout.adapter.extensions;

import OooOo0o.o000oOoO;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOo;
import o00O0.oo000o;

/* loaded from: classes.dex */
public final class ExtensionWindowBackendApi0 implements WindowBackend {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerLayoutChangeCallback$lambda$0(Consumer callback) {
        OooOo.OooO0o0(callback, "$callback");
        callback.accept(new WindowLayoutInfo(oo000o.f31251OooOo0O));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> callback) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(callback, "callback");
        executor.execute(new o000oOoO(callback, 5));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> callback) {
        OooOo.OooO0o0(callback, "callback");
    }
}

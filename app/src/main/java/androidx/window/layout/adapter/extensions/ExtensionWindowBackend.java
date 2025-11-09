package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ExtensionWindowBackend implements WindowBackend {
    public static final Companion Companion = new Companion(null);
    private final WindowBackend backend;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final WindowBackend newInstance(WindowLayoutComponent component, ConsumerAdapter adapter) {
            OooOo.OooO0o0(component, "component");
            OooOo.OooO0o0(adapter, "adapter");
            int safeVendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
            return safeVendorApiLevel >= 2 ? new ExtensionWindowBackendApi2(component) : safeVendorApiLevel == 1 ? new ExtensionWindowBackendApi1(component, adapter) : new ExtensionWindowBackendApi0();
        }

        private Companion() {
        }
    }

    public ExtensionWindowBackend(WindowBackend backend) {
        OooOo.OooO0o0(backend, "backend");
        this.backend = backend;
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public boolean hasRegisteredListeners() {
        return this.backend.hasRegisteredListeners();
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> callback) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(callback, "callback");
        this.backend.registerLayoutChangeCallback(context, executor, callback);
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> callback) {
        OooOo.OooO0o0(callback, "callback");
        this.backend.unregisterLayoutChangeCallback(callback);
    }
}

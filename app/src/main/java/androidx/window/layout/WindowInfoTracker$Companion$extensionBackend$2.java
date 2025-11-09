package androidx.window.layout;

import android.util.Log;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.adapter.WindowBackend;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackend;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class WindowInfoTracker$Companion$extensionBackend$2 extends Oooo000 implements OooO0O0 {
    public static final WindowInfoTracker$Companion$extensionBackend$2 INSTANCE = new WindowInfoTracker$Companion$extensionBackend$2();

    public WindowInfoTracker$Companion$extensionBackend$2() {
        super(0);
    }

    @Override // o00O0Oo.OooO0O0
    public final WindowBackend invoke() {
        WindowLayoutComponent windowLayoutComponent;
        try {
            ClassLoader loader = WindowInfoTracker.class.getClassLoader();
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = loader != null ? new SafeWindowLayoutComponentProvider(loader, new ConsumerAdapter(loader)) : null;
            if (safeWindowLayoutComponentProvider == null || (windowLayoutComponent = safeWindowLayoutComponentProvider.getWindowLayoutComponent()) == null) {
                return null;
            }
            ExtensionWindowBackend.Companion companion = ExtensionWindowBackend.Companion;
            OooOo.OooO0Oo(loader, "loader");
            return companion.newInstance(windowLayoutComponent, new ConsumerAdapter(loader));
        } catch (Throwable unused) {
            if (WindowInfoTracker.Companion.DEBUG) {
                Log.d(WindowInfoTracker.Companion.TAG, "Failed to load WindowExtensions");
            }
            return null;
        }
    }
}

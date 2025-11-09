package androidx.window;

import androidx.window.core.ExtensionsUtil;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public abstract class WindowSdkExtensions {
    public static final Companion Companion = new Companion(null);
    private static WindowSdkExtensionsDecorator decorator = EmptyDecoratorWindowSdk.INSTANCE;
    private final int extensionVersion = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final WindowSdkExtensions getInstance() {
            return WindowSdkExtensions.decorator.decorate(new WindowSdkExtensions() { // from class: androidx.window.WindowSdkExtensions$Companion$getInstance$1
            });
        }

        public final void overrideDecorator$window_release(WindowSdkExtensionsDecorator overridingDecorator) {
            OooOo.OooO0o0(overridingDecorator, "overridingDecorator");
            WindowSdkExtensions.decorator = overridingDecorator;
        }

        public final void reset$window_release() {
            WindowSdkExtensions.decorator = EmptyDecoratorWindowSdk.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final WindowSdkExtensions getInstance() {
        return Companion.getInstance();
    }

    public int getExtensionVersion() {
        return this.extensionVersion;
    }

    public final void requireExtensionVersion$window_release(int i) {
        if (getExtensionVersion() >= i) {
            return;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "This API requires extension version ", ", but the device is on ");
        sbOooOOo0.append(getExtensionVersion());
        throw new UnsupportedOperationException(sbOooOOo0.toString());
    }
}

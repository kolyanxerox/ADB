package androidx.window;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
final class EmptyDecoratorWindowSdk implements WindowSdkExtensionsDecorator {
    public static final EmptyDecoratorWindowSdk INSTANCE = new EmptyDecoratorWindowSdk();

    private EmptyDecoratorWindowSdk() {
    }

    @Override // androidx.window.WindowSdkExtensionsDecorator
    public WindowSdkExtensions decorate(WindowSdkExtensions windowSdkExtensions) {
        OooOo.OooO0o0(windowSdkExtensions, "windowSdkExtensions");
        return windowSdkExtensions;
    }
}

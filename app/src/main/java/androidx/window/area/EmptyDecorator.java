package androidx.window.area;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
final class EmptyDecorator implements WindowAreaControllerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.area.WindowAreaControllerDecorator
    public WindowAreaController decorate(WindowAreaController controller) {
        OooOo.OooO0o0(controller, "controller");
        return controller;
    }
}

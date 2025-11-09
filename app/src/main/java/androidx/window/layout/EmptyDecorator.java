package androidx.window.layout;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker tracker) {
        OooOo.OooO0o0(tracker, "tracker");
        return tracker;
    }
}

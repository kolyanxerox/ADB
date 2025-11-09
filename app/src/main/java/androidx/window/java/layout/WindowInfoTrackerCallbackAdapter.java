package androidx.window.java.layout;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.java.core.CallbackToFlowAdapter;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOo;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final WindowInfoTracker tracker;

    private WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker, CallbackToFlowAdapter callbackToFlowAdapter) {
        this.tracker = windowInfoTracker;
        this.callbackToFlowAdapter = callbackToFlowAdapter;
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(Consumer<WindowLayoutInfo> consumer) {
        OooOo.OooO0o0(consumer, "consumer");
        this.callbackToFlowAdapter.disconnect(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public o0OoOoOo windowLayoutInfo(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }

    public final void addWindowLayoutInfoListener(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.tracker.windowLayoutInfo(context));
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public o0OoOoOo windowLayoutInfo(Context context) {
        OooOo.OooO0o0(context, "context");
        return this.tracker.windowLayoutInfo(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker tracker) {
        this(tracker, new CallbackToFlowAdapter());
        OooOo.OooO0o0(tracker, "tracker");
    }
}

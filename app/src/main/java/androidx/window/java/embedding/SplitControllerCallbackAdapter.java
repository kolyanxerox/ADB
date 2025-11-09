package androidx.window.java.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.embedding.SplitController;
import androidx.window.embedding.SplitInfo;
import androidx.window.java.core.CallbackToFlowAdapter;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class SplitControllerCallbackAdapter {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final SplitController controller;

    private SplitControllerCallbackAdapter(SplitController splitController, CallbackToFlowAdapter callbackToFlowAdapter) {
        this.controller = splitController;
        this.callbackToFlowAdapter = callbackToFlowAdapter;
    }

    public final void addSplitListener(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer) {
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.controller.splitInfoList(activity));
    }

    public final void removeSplitListener(Consumer<List<SplitInfo>> consumer) {
        OooOo.OooO0o0(consumer, "consumer");
        this.callbackToFlowAdapter.disconnect(consumer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitControllerCallbackAdapter(SplitController controller) {
        this(controller, new CallbackToFlowAdapter());
        OooOo.OooO0o0(controller, "controller");
    }
}

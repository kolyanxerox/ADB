package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.OooOo;
import o00O0oOo.o00O0O00;

/* loaded from: classes.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State minState, DispatchQueue dispatchQueue, final o00O0O00 parentJob) {
        OooOo.OooO0o0(lifecycle, "lifecycle");
        OooOo.OooO0o0(minState, "minState");
        OooOo.OooO0o0(dispatchQueue, "dispatchQueue");
        OooOo.OooO0o0(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.OooO0OO
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f15306OooOo0O, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            parentJob.OooO00o(null);
            finish();
        }
    }

    private final void handleDestroy(o00O0O00 o00o0o00) {
        o00o0o00.OooO00o(null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController this$0, o00O0O00 parentJob, LifecycleOwner source, Lifecycle.Event event) {
        OooOo.OooO0o0(this$0, "this$0");
        OooOo.OooO0o0(parentJob, "$parentJob");
        OooOo.OooO0o0(source, "source");
        OooOo.OooO0o0(event, "<anonymous parameter 1>");
        if (source.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            parentJob.OooO00o(null);
            this$0.finish();
        } else if (source.getLifecycle().getCurrentState().compareTo(this$0.minState) < 0) {
            this$0.dispatchQueue.pause();
        } else {
            this$0.dispatchQueue.resume();
        }
    }

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}

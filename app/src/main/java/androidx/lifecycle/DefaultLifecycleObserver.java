package androidx.lifecycle;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner owner) {
        OooOo.OooO0o0(owner, "owner");
    }

    default void onDestroy(LifecycleOwner owner) {
        OooOo.OooO0o0(owner, "owner");
    }

    default void onPause(LifecycleOwner owner) {
        OooOo.OooO0o0(owner, "owner");
    }

    default void onResume(LifecycleOwner owner) {
        OooOo.OooO0o0(owner, "owner");
    }

    default void onStart(LifecycleOwner owner) {
        OooOo.OooO0o0(owner, "owner");
    }

    default void onStop(LifecycleOwner owner) {
        OooOo.OooO0o0(owner, "owner");
    }
}

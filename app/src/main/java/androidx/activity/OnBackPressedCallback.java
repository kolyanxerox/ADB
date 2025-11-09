package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private o00O0Oo.OooO0O0 enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(Cancellable cancellable) {
        OooOo.OooO0o0(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final o00O0Oo.OooO0O0 getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat backEvent) {
        OooOo.OooO0o0(backEvent, "backEvent");
    }

    public void handleOnBackStarted(BackEventCompat backEvent) {
        OooOo.OooO0o0(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    public final void removeCancellable(Cancellable cancellable) {
        OooOo.OooO0o0(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        o00O0Oo.OooO0O0 oooO0O0 = this.enabledChangedCallback;
        if (oooO0O0 != null) {
            oooO0O0.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(o00O0Oo.OooO0O0 oooO0O0) {
        this.enabledChangedCallback = oooO0O0;
    }
}

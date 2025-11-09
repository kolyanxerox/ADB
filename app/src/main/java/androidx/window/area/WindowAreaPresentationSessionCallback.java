package androidx.window.area;

/* loaded from: classes.dex */
public interface WindowAreaPresentationSessionCallback {
    void onContainerVisibilityChanged(boolean z);

    void onSessionEnded(Throwable th);

    void onSessionStarted(WindowAreaSessionPresenter windowAreaSessionPresenter);
}

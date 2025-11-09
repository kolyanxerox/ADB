package androidx.window.area;

/* loaded from: classes.dex */
public interface WindowAreaSessionCallback {
    void onSessionEnded(Throwable th);

    void onSessionStarted(WindowAreaSession windowAreaSession);
}

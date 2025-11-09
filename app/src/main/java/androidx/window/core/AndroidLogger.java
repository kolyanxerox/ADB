package androidx.window.core;

import android.util.Log;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class AndroidLogger implements Logger {
    public static final AndroidLogger INSTANCE = new AndroidLogger();

    private AndroidLogger() {
    }

    @Override // androidx.window.core.Logger
    public void debug(String tag, String message) {
        OooOo.OooO0o0(tag, "tag");
        OooOo.OooO0o0(message, "message");
        Log.d(tag, message);
    }
}

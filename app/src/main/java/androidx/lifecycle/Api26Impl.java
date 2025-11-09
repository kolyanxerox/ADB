package androidx.lifecycle;

import java.time.Duration;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class Api26Impl {
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(Duration timeout) {
        OooOo.OooO0o0(timeout, "timeout");
        return timeout.toMillis();
    }
}

package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.IBinder;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ActivityEmbeddingController {
    public static final Companion Companion = new Companion(null);
    private final EmbeddingBackend backend;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final ActivityEmbeddingController getInstance(Context context) {
            OooOo.OooO0o0(context, "context");
            return new ActivityEmbeddingController(EmbeddingBackend.Companion.getInstance(context));
        }

        private Companion() {
        }
    }

    public ActivityEmbeddingController(EmbeddingBackend backend) {
        OooOo.OooO0o0(backend, "backend");
        this.backend = backend;
    }

    public static final ActivityEmbeddingController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final ActivityStack getActivityStack(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        return this.backend.getActivityStack(activity);
    }

    public final boolean isActivityEmbedded(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        return this.backend.isActivityEmbedded(activity);
    }

    public final ActivityOptions setLaunchingActivityStack$window_release(ActivityOptions options, IBinder token) {
        OooOo.OooO0o0(options, "options");
        OooOo.OooO0o0(token, "token");
        return this.backend.setLaunchingActivityStack(options, token);
    }
}

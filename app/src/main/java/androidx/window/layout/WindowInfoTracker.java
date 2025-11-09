package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.WindowBackend;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import com.google.android.gms.internal.measurement.o0OOO0;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0OO00O;
import o00O0ooo.o0OoOoOo;
import oo00o.OooO;
import oo00o.OooO0OO;

/* loaded from: classes.dex */
public interface WindowInfoTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = o0OO00O.OooO00o(WindowInfoTracker.class).OooO0OO();
        private static final OooO0OO extensionBackend$delegate = o0OOO0.OooO0oo(WindowInfoTracker$Companion$extensionBackend$2.INSTANCE);
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        public static /* synthetic */ void getExtensionBackend$window_release$annotations() {
        }

        public final WindowBackend getExtensionBackend$window_release() {
            return (WindowBackend) extensionBackend$delegate.getValue();
        }

        public final WindowInfoTracker getOrCreate(Context context) {
            OooOo.OooO0o0(context, "context");
            WindowBackend extensionBackend$window_release = getExtensionBackend$window_release();
            if (extensionBackend$window_release == null) {
                extensionBackend$window_release = SidecarWindowBackend.Companion.getInstance(context);
            }
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, extensionBackend$window_release));
        }

        public final void overrideDecorator(WindowInfoTrackerDecorator overridingDecorator) {
            OooOo.OooO0o0(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }
    }

    static WindowInfoTracker getOrCreate(Context context) {
        return Companion.getOrCreate(context);
    }

    static void overrideDecorator(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    static void reset() {
        Companion.reset();
    }

    o0OoOoOo windowLayoutInfo(Activity activity);

    default o0OoOoOo windowLayoutInfo(Context context) {
        OooOo.OooO0o0(context, "context");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        o0OoOoOo o0ooooooWindowLayoutInfo = activity != null ? windowLayoutInfo(activity) : null;
        if (o0ooooooWindowLayoutInfo != null) {
            return o0ooooooWindowLayoutInfo;
        }
        throw new OooO("Must override windowLayoutInfo(context) and provide an implementation.");
    }
}

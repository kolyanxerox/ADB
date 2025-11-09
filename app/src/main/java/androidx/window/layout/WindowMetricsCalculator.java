package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;
import oo00o.OooO;

/* loaded from: classes.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Oooo000 decorator = WindowMetricsCalculator$Companion$decorator$1.INSTANCE;

        private Companion() {
        }

        public final WindowMetrics fromDisplayMetrics$window_release(DisplayMetrics displayMetrics) {
            OooOo.OooO0o0(displayMetrics, "displayMetrics");
            Bounds bounds = new Bounds(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
            WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
            OooOo.OooO0Oo(windowInsetsCompatBuild, "Builder().build()");
            return new WindowMetrics(bounds, windowInsetsCompatBuild);
        }

        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator) decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        public final void overrideDecorator(WindowMetricsCalculatorDecorator overridingDecorator) {
            OooOo.OooO0o0(overridingDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        public final void reset() {
            decorator = WindowMetricsCalculator$Companion$reset$1.INSTANCE;
        }

        public final WindowMetrics translateWindowMetrics$window_release(android.view.WindowMetrics windowMetrics) {
            OooOo.OooO0o0(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            OooOo.OooO0Oo(bounds, "windowMetrics.bounds");
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowMetrics.getWindowInsets());
            OooOo.OooO0Oo(windowInsetsCompat, "toWindowInsetsCompat(windowMetrics.windowInsets)");
            return new WindowMetrics(bounds, windowInsetsCompat);
        }
    }

    static WindowMetricsCalculator getOrCreate() {
        return Companion.getOrCreate();
    }

    static void overrideDecorator(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    static void reset() {
        Companion.reset();
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    default WindowMetrics computeCurrentWindowMetrics(Context context) {
        OooOo.OooO0o0(context, "context");
        throw new OooO("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }

    WindowMetrics computeMaximumWindowMetrics(Activity activity);

    default WindowMetrics computeMaximumWindowMetrics(Context context) {
        OooOo.OooO0o0(context, "context");
        throw new OooO("Must override computeMaximumWindowMetrics(context) and provide an implementation.");
    }
}

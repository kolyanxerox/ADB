package androidx.window.layout;

import android.graphics.Rect;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class WindowMetrics {
    private final Bounds _bounds;
    private final WindowInsetsCompat _windowInsetsCompat;

    public WindowMetrics(Bounds _bounds, WindowInsetsCompat _windowInsetsCompat) {
        OooOo.OooO0o0(_bounds, "_bounds");
        OooOo.OooO0o0(_windowInsetsCompat, "_windowInsetsCompat");
        this._bounds = _bounds;
        this._windowInsetsCompat = _windowInsetsCompat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WindowMetrics.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        OooOo.OooO0OO(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        return OooOo.OooO00o(this._bounds, windowMetrics._bounds) && OooOo.OooO00o(this._windowInsetsCompat, windowMetrics._windowInsetsCompat);
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public final WindowInsetsCompat getWindowInsets() {
        return this._windowInsetsCompat;
    }

    public int hashCode() {
        return this._windowInsetsCompat.hashCode() + (this._bounds.hashCode() * 31);
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this._bounds + ", windowInsetsCompat=" + this._windowInsetsCompat + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WindowMetrics(Rect rect, WindowInsetsCompat windowInsetsCompat, int i, OooOO0O oooOO0O) {
        if ((i & 2) != 0) {
            windowInsetsCompat = new WindowInsetsCompat.Builder().build();
            OooOo.OooO0Oo(windowInsetsCompat, "Builder().build()");
        }
        this(rect, windowInsetsCompat);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect bounds, WindowInsetsCompat insets) {
        this(new Bounds(bounds), insets);
        OooOo.OooO0o0(bounds, "bounds");
        OooOo.OooO0o0(insets, "insets");
    }
}

package androidx.window.layout.util;

import android.graphics.Point;
import android.view.Display;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        OooOo.OooO0o0(display, "display");
        OooOo.OooO0o0(point, "point");
        display.getRealSize(point);
    }
}

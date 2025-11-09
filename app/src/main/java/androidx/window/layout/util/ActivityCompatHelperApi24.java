package androidx.window.layout.util;

import android.app.Activity;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ActivityCompatHelperApi24 {
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}

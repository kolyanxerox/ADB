package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
final class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z, boolean z2) {
        OooOo.OooO0o0(statusBarStyle, "statusBarStyle");
        OooOo.OooO0o0(navigationBarStyle, "navigationBarStyle");
        OooOo.OooO0o0(window, "window");
        OooOo.OooO0o0(view, "view");
    }
}

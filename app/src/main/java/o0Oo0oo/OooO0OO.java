package o0Oo0oo;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.navigationrail.NavigationRailView;
import o0ooOO0.o0000;
import o0ooOO0.o0000O00;

/* loaded from: classes2.dex */
public final class OooO0OO implements o0000 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ NavigationRailView f32995OooOo0O;

    public OooO0OO(NavigationRailView navigationRailView) {
        this.f32995OooOo0O = navigationRailView;
    }

    @Override // o0ooOO0.o0000
    public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, o0000O00 o0000o00) {
        NavigationRailView navigationRailView = this.f32995OooOo0O;
        Boolean bool = navigationRailView.f27734OooOoo0;
        if (bool != null ? bool.booleanValue() : ViewCompat.getFitsSystemWindows(navigationRailView)) {
            o0000o00.f33102OooO0O0 += windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
        }
        Boolean bool2 = navigationRailView.f27733OooOoo;
        if (bool2 != null ? bool2.booleanValue() : ViewCompat.getFitsSystemWindows(navigationRailView)) {
            o0000o00.f33104OooO0Oo += windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        }
        boolean z = ViewCompat.getLayoutDirection(view) == 1;
        int systemWindowInsetLeft = windowInsetsCompat.getSystemWindowInsetLeft();
        int systemWindowInsetRight = windowInsetsCompat.getSystemWindowInsetRight();
        int i = o0000o00.f33101OooO00o;
        if (z) {
            systemWindowInsetLeft = systemWindowInsetRight;
        }
        int i2 = i + systemWindowInsetLeft;
        o0000o00.f33101OooO00o = i2;
        ViewCompat.setPaddingRelative(view, i2, o0000o00.f33102OooO0O0, o0000o00.f33103OooO0OO, o0000o00.f33104OooO0Oo);
        return windowInsetsCompat;
    }
}

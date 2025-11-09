package OooooOo;

import android.animation.AnimatorSet;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomappbar.BottomAppBar;
import o0ooOO0.o0000;
import o0ooOO0.o0000O00;

/* loaded from: classes2.dex */
public final class oOOO00o0 implements o0000 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f15050OooOo0O;

    public /* synthetic */ oOOO00o0(BottomAppBar bottomAppBar) {
        this.f15050OooOo0O = bottomAppBar;
    }

    @Override // o0ooOO0.o0000
    public WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, o0000O00 o0000o00) {
        boolean z;
        BottomAppBar bottomAppBar = this.f15050OooOo0O;
        if (bottomAppBar.f27360Oooo00o) {
            bottomAppBar.f27365Oooo0oO = windowInsetsCompat.getSystemWindowInsetBottom();
        }
        boolean z2 = false;
        if (bottomAppBar.f27357Oooo0) {
            z = bottomAppBar.f27356Oooo != windowInsetsCompat.getSystemWindowInsetLeft();
            bottomAppBar.f27356Oooo = windowInsetsCompat.getSystemWindowInsetLeft();
        } else {
            z = false;
        }
        if (bottomAppBar.f27361Oooo0O0) {
            boolean z3 = bottomAppBar.f27366Oooo0oo != windowInsetsCompat.getSystemWindowInsetRight();
            bottomAppBar.f27366Oooo0oo = windowInsetsCompat.getSystemWindowInsetRight();
            z2 = z3;
        }
        if (!z && !z2) {
            return windowInsetsCompat;
        }
        AnimatorSet animatorSet = bottomAppBar.f27350OooOoO0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = bottomAppBar.f27346OooOo;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        bottomAppBar.OooOO0o();
        bottomAppBar.OooOO0O();
        return windowInsetsCompat;
    }
}

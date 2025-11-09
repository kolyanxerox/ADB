package OooooOo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public final class oOOO00Oo extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15048OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f15049OooO0O0;

    public /* synthetic */ oOOO00Oo(BottomAppBar bottomAppBar, int i) {
        this.f15048OooO00o = i;
        this.f15049OooO0O0 = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f15049OooO0O0;
        switch (this.f15048OooO00o) {
            case 1:
                int i = BottomAppBar.f27345OoooO0O;
                bottomAppBar.f27346OooOo = null;
                break;
            case 2:
                int i2 = BottomAppBar.f27345OoooO0O;
                bottomAppBar.getClass();
                bottomAppBar.f27362Oooo0OO = false;
                bottomAppBar.f27350OooOoO0 = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.f15049OooO0O0;
        switch (this.f15048OooO00o) {
            case 0:
                if (!bottomAppBar.f27362Oooo0OO) {
                    bottomAppBar.OooOO0(bottomAppBar.f27349OooOoO, bottomAppBar.f27364Oooo0o0);
                    break;
                }
                break;
            case 1:
                int i = BottomAppBar.f27345OoooO0O;
                break;
            case 2:
                int i2 = BottomAppBar.f27345OoooO0O;
                bottomAppBar.getClass();
                break;
            default:
                bottomAppBar.f27368OoooO00.onAnimationStart(animator);
                View viewOooO0o = bottomAppBar.OooO0o();
                FloatingActionButton floatingActionButton = viewOooO0o instanceof FloatingActionButton ? (FloatingActionButton) viewOooO0o : null;
                if (floatingActionButton != null) {
                    floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
                    break;
                }
                break;
        }
    }
}

package OooooOo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes2.dex */
public final class oOOO0OOO extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f15054OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f15055OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f15056OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f15057OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f15058OooO0o0;

    public oOOO0OOO(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f15058OooO0o0 = bottomAppBar;
        this.f15055OooO0O0 = actionMenuView;
        this.f15056OooO0OO = i;
        this.f15057OooO0Oo = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f15054OooO00o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f15054OooO00o) {
            return;
        }
        BottomAppBar bottomAppBar = this.f15058OooO0o0;
        bottomAppBar.getClass();
        bottomAppBar.OooOOO(this.f15055OooO0O0, this.f15056OooO0OO, this.f15057OooO0Oo, false);
    }
}

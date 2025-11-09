package o00000Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooO f29258OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Drawable f29259OooO0O0;

    public OooO(o00O0O.OooO oooO, Drawable drawable) {
        this.f29258OooO00o = oooO;
        this.f29259OooO0O0 = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f29258OooO00o.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f29258OooO00o.setCircularRevealOverlayDrawable(this.f29259OooO0O0);
    }
}

package o0OO00O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class OooOOO0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o */
    public final /* synthetic */ OooOOO f32866OooO00o;

    public OooOOO0(OooOOO oooOOO) {
        this.f32866OooO00o = oooOOO;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        OooOOO oooOOO = this.f32866OooO00o;
        oooOOO.OooO00o();
        OooO0OO oooO0OO = oooOOO.f32865OooOO0O;
        if (oooO0OO != null) {
            oooO0OO.onAnimationEnd(oooOOO.f32888OooO00o);
        }
    }
}

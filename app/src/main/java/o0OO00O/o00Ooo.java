package o0OO00O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class o00Ooo extends AnimatorListenerAdapter {

    /* renamed from: OooO00o */
    public final /* synthetic */ oo000o f32901OooO00o;

    public o00Ooo(oo000o oo000oVar) {
        this.f32901OooO00o = oo000oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        oo000o oo000oVar = this.f32901OooO00o;
        oo000oVar.OooO00o();
        OooO0OO oooO0OO = oo000oVar.f32913OooOO0O;
        if (oooO0OO != null) {
            oooO0OO.onAnimationEnd(oo000oVar.f32888OooO00o);
        }
    }
}

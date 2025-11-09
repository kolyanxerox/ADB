package o0OOO0o;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o */
    public final /* synthetic */ float f32944OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ OooO0OO f32945OooO0O0;

    public OooO00o(OooO0OO oooO0OO, float f) {
        this.f32945OooO0O0 = oooO0OO;
        this.f32944OooO00o = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f32945OooO0O0.OooO0OO(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f32944OooO00o);
    }
}

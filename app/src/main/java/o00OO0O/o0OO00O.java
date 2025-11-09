package o00oO0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import o000000.OooOOO0;

/* loaded from: classes2.dex */
public abstract class o0OO00O extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f32743OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public float f32744OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public float f32745OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OOo f32746OooO0Oo;

    public o0OO00O(o000OOo o000ooo2) {
        this.f32746OooO0Oo = o000ooo2;
    }

    public abstract float OooO00o();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = (int) this.f32745OooO0OO;
        OooOOO0 oooOOO0 = this.f32746OooO0Oo.f32773OooO0O0;
        if (oooOOO0 != null) {
            oooOOO0.OooOO0o(f);
        }
        this.f32743OooO00o = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z = this.f32743OooO00o;
        o000OOo o000ooo2 = this.f32746OooO0Oo;
        if (!z) {
            OooOOO0 oooOOO0 = o000ooo2.f32773OooO0O0;
            this.f32744OooO0O0 = oooOOO0 == null ? 0.0f : oooOOO0.f29048OooOo0O.f29039OooOOO0;
            this.f32745OooO0OO = OooO00o();
            this.f32743OooO00o = true;
        }
        float f = this.f32744OooO0O0;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f32745OooO0OO - f)) + f);
        OooOOO0 oooOOO02 = o000ooo2.f32773OooO0O0;
        if (oooOOO02 != null) {
            oooOOO02.OooOO0o(animatedFraction);
        }
    }
}

package o00000O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29149OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f29150OooO0O0;

    public /* synthetic */ OooO0OO(OooO0o oooO0o, int i) {
        this.f29149OooO00o = i;
        this.f29150OooO0O0 = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f29149OooO00o) {
            case 1:
                this.f29150OooO0O0.f29197OooO0O0.OooO0oO(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f29149OooO00o) {
            case 0:
                this.f29150OooO0O0.f29197OooO0O0.OooO0oO(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

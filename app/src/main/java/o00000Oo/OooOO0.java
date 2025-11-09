package o00000Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29268OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooO f29269OooO0O0;

    public /* synthetic */ OooOO0(o00O0O.OooO oooO, int i) {
        this.f29268OooO00o = i;
        this.f29269OooO0O0 = oooO;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29268OooO00o) {
            case 0:
                o00O0O.OooO oooO = this.f29269OooO0O0;
                o00O0O.OooO0o revealInfo = oooO.getRevealInfo();
                revealInfo.f31312OooO0OO = Float.MAX_VALUE;
                oooO.setRevealInfo(revealInfo);
                break;
            default:
                this.f29269OooO0O0.OooO0O0();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f29268OooO00o) {
            case 1:
                this.f29269OooO0O0.OooO00o();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

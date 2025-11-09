package OooooOO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import o00000O0.OooOOO0;
import o000oooo.o000O;
import o0OO00O.OooOOO;
import o0OO00O.o00Oo0;
import o0OO00O.oo000o;
import o0ooOO0.o0Oo0oo;

/* loaded from: classes2.dex */
public final class ooooO0O0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15046OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f15047OooO0O0;

    public /* synthetic */ ooooO0O0(Object obj, int i) {
        this.f15046OooO00o = i;
        this.f15047OooO0O0 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f15046OooO00o) {
            case 3:
                ((o000O) this.f15047OooO0O0).OooO0oO();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f15046OooO00o) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f15047OooO0O0).f27337OooO0o0 = null;
                break;
            case 1:
                OooOOO0 oooOOO0 = (OooOOO0) this.f15047OooO0O0;
                oooOOO0.OooOOo0();
                oooOOO0.f29168OooOOOO.start();
                break;
            case 2:
                ((ExpandableTransformationBehavior) this.f15047OooO0O0).f27985OooO0O0 = null;
                break;
            case 3:
                ((o000O) this.f15047OooO0O0).OooO0oo();
                break;
            case 4:
            case 5:
            case 6:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                o0Oo0oo o0oo0oo = (o0Oo0oo) this.f15047OooO0O0;
                if (o0oo0oo.f33138OooO0O0 == animator) {
                    o0oo0oo.f33138OooO0O0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f15046OooO00o) {
            case 4:
                super.onAnimationRepeat(animator);
                OooOOO oooOOO = (OooOOO) this.f15047OooO0O0;
                oooOOO.f32863OooO0oo = (oooOOO.f32863OooO0oo + 4) % oooOOO.f32862OooO0oO.f32846OooO0OO.length;
                break;
            case 5:
                super.onAnimationRepeat(animator);
                o00Oo0 o00oo0 = (o00Oo0) this.f15047OooO0O0;
                o00oo0.f32899OooO0oO = (o00oo0.f32899OooO0oO + 1) % o00oo0.f32897OooO0o.f32846OooO0OO.length;
                o00oo0.f32900OooO0oo = true;
                break;
            case 6:
                super.onAnimationRepeat(animator);
                oo000o oo000oVar = (oo000o) this.f15047OooO0O0;
                oo000oVar.f32911OooO0oo = (oo000oVar.f32911OooO0oo + 1) % oo000oVar.f32910OooO0oO.f32846OooO0OO.length;
                oo000oVar.f32906OooO = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f15046OooO00o) {
            case 3:
                ((o000O) this.f15047OooO0O0).OooO(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

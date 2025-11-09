package androidx.core.animation;

import android.animation.Animator;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ Oooo000 $onCancel;
    final /* synthetic */ Oooo000 $onEnd;
    final /* synthetic */ Oooo000 $onRepeat;
    final /* synthetic */ Oooo000 $onStart;

    public AnimatorKt$addListener$listener$1(Oooo000 oooo000, Oooo000 oooo0002, Oooo000 oooo0003, Oooo000 oooo0004) {
        this.$onRepeat = oooo000;
        this.$onEnd = oooo0002;
        this.$onCancel = oooo0003;
        this.$onStart = oooo0004;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.$onStart.invoke(animator);
    }
}

package androidx.core.transition;

import android.transition.Transition;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ Oooo000 $onCancel;
    final /* synthetic */ Oooo000 $onEnd;
    final /* synthetic */ Oooo000 $onPause;
    final /* synthetic */ Oooo000 $onResume;
    final /* synthetic */ Oooo000 $onStart;

    public TransitionKt$addListener$listener$1(Oooo000 oooo000, Oooo000 oooo0002, Oooo000 oooo0003, Oooo000 oooo0004, Oooo000 oooo0005) {
        this.$onEnd = oooo000;
        this.$onResume = oooo0002;
        this.$onPause = oooo0003;
        this.$onCancel = oooo0004;
        this.$onStart = oooo0005;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        this.$onStart.invoke(transition);
    }
}

package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import kotlin.jvm.internal.Oooo000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController$TransitionEffect$onCommit$4 extends Oooo000 implements o00O0Oo.OooO0O0 {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ Object $mergedTransition;
    final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$TransitionEffect$onCommit$4(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup, Object obj) {
        super(0);
        this.this$0 = transitionEffect;
        this.$container = viewGroup;
        this.$mergedTransition = obj;
    }

    @Override // o00O0Oo.OooO0O0
    public /* bridge */ /* synthetic */ Object invoke() {
        m13518invoke();
        return OooOo.f33195OooO00o;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m13518invoke() {
        this.this$0.getTransitionImpl().beginDelayedTransition(this.$container, this.$mergedTransition);
    }
}

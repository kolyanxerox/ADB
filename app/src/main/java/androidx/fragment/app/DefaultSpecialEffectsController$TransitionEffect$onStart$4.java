package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Iterator;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0Oo0oo;

/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController$TransitionEffect$onStart$4 extends Oooo000 implements o00O0Oo.OooO0O0 {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ Object $mergedTransition;
    final /* synthetic */ o0Oo0oo $seekCancelLambda;
    final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2 */
    public static final class C04762 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ ViewGroup $container;
        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04762(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup) {
            super(0);
            this.this$0 = transitionEffect;
            this.$container = viewGroup;
        }

        public static final void invoke$lambda$1(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
            OooOo.OooO0o0(this$0, "this$0");
            OooOo.OooO0o0(container, "$container");
            Iterator<T> it = this$0.getTransitionInfos().iterator();
            while (it.hasNext()) {
                SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                View view = operation.getFragment().getView();
                if (view != null) {
                    operation.getFinalState().applyState(view, container);
                }
            }
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13520invoke();
            return oo00o.OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13520invoke() {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animating to start");
            }
            FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
            Object controller = this.this$0.getController();
            OooOo.OooO0O0(controller);
            transitionImpl.animateToStart(controller, new OooO0o(0, this.this$0, this.$container));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$TransitionEffect$onStart$4(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup, Object obj, o0Oo0oo o0oo0oo) {
        super(0);
        this.this$0 = transitionEffect;
        this.$container = viewGroup;
        this.$mergedTransition = obj;
        this.$seekCancelLambda = o0oo0oo;
    }

    @Override // o00O0Oo.OooO0O0
    public /* bridge */ /* synthetic */ Object invoke() {
        m13519invoke();
        return oo00o.OooOo.f33195OooO00o;
    }

    /* renamed from: invoke */
    public final void m13519invoke() {
        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
        transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(this.$container, this.$mergedTransition));
        boolean z = this.this$0.getController() != null;
        Object obj = this.$mergedTransition;
        ViewGroup viewGroup = this.$container;
        if (!z) {
            throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
        }
        this.$seekCancelLambda.f28880OooOo0O = new C04762(this.this$0, viewGroup);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Started executing operations from " + this.this$0.getFirstOut() + " to " + this.this$0.getLastIn());
        }
    }
}

package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15281OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15282OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15283OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15284OooOoO0;

    public /* synthetic */ OooO00o(Object obj, Object obj2, Object obj3, int i) {
        this.f15282OooOo0O = i;
        this.f15283OooOo0o = obj;
        this.f15281OooOo = obj2;
        this.f15284OooOoO0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15282OooOo0O) {
            case 0:
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.onAnimationEnd$lambda$0((ViewGroup) this.f15283OooOo0o, (View) this.f15281OooOo, (DefaultSpecialEffectsController.AnimationEffect) this.f15284OooOoO0);
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12((SpecialEffectsController.Operation) this.f15283OooOo0o, (SpecialEffectsController.Operation) this.f15281OooOo, (DefaultSpecialEffectsController.TransitionEffect) this.f15284OooOoO0);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13((FragmentTransitionImpl) this.f15283OooOo0o, (View) this.f15281OooOo, (Rect) this.f15284OooOoO0);
                break;
        }
    }
}

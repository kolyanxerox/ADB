package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4;
import androidx.fragment.app.SpecialEffectsController;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15290OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15291OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15292OooOo0o;

    public /* synthetic */ OooO0o(int i, Object obj, Object obj2) {
        this.f15291OooOo0O = i;
        this.f15292OooOo0o = obj;
        this.f15290OooOo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15291OooOo0O) {
            case 0:
                DefaultSpecialEffectsController$TransitionEffect$onStart$4.C04762.invoke$lambda$1((DefaultSpecialEffectsController.TransitionEffect) this.f15292OooOo0o, (ViewGroup) this.f15290OooOo);
                break;
            default:
                DefaultSpecialEffectsController.collectEffects$lambda$2((DefaultSpecialEffectsController) this.f15292OooOo0o, (SpecialEffectsController.Operation) this.f15290OooOo);
                break;
        }
    }
}

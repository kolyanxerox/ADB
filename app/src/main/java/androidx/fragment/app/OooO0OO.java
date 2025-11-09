package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect f15287OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15288OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f15289OooOo0o;

    public /* synthetic */ OooO0OO(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.f15288OooOo0O = i;
        this.f15289OooOo0o = operation;
        this.f15287OooOo = transitionEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15288OooOo0O) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(this.f15289OooOo0o, this.f15287OooOo);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(this.f15289OooOo0o, this.f15287OooOo);
                break;
        }
    }
}

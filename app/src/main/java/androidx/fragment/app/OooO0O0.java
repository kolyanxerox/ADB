package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import java.util.ArrayList;
import kotlin.jvm.internal.o0Oo0oo;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15285OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15286OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f15285OooOo0O = i;
        this.f15286OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15285OooOo0O) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14((ArrayList) this.f15286OooOo0o);
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4((o0Oo0oo) this.f15286OooOo0o);
                break;
            default:
                ((Fragment) this.f15286OooOo0o).lambda$performCreateView$0();
                break;
        }
    }
}

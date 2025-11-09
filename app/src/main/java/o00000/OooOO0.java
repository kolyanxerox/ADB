package o00000;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public final class OooOO0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o */
    public final /* synthetic */ View f28972OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ View f28973OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ OooOO0O f28974OooO0OO;

    public OooOO0(OooOO0O oooOO0O, View view, View view2) {
        this.f28974OooO0OO = oooOO0O;
        this.f28972OooO00o = view;
        this.f28973OooO0O0 = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f28974OooO0OO.OooO0OO(this.f28972OooO00o, this.f28973OooO0O0, valueAnimator.getAnimatedFraction());
    }
}

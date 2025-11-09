package o00000O0;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29147OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f29148OooO0O0;

    public /* synthetic */ OooO0O0(Oooo000 oooo000, int i) {
        this.f29147OooO00o = i;
        this.f29148OooO0O0 = oooo000;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29147OooO00o) {
            case 0:
                OooO0o oooO0o = (OooO0o) this.f29148OooO0O0;
                oooO0o.getClass();
                oooO0o.f29199OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                OooO0o oooO0o2 = (OooO0o) this.f29148OooO0O0;
                oooO0o2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = oooO0o2.f29199OooO0Oo;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            default:
                OooOOO0 oooOOO0 = (OooOOO0) this.f29148OooO0O0;
                oooOOO0.getClass();
                oooOOO0.f29199OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}

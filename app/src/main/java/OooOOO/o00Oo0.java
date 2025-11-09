package Oooooo;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import o000000.OooOOO0;

/* loaded from: classes2.dex */
public final class o00Oo0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15076OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f15077OooO0O0;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f15076OooO00o = i;
        this.f15077OooO0O0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15076OooO00o) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                OooOOO0 oooOOO0 = ((BottomSheetBehavior) this.f15077OooO0O0).f27382OooO0oo;
                if (oooOOO0 != null) {
                    oooOOO0.OooOOO(fFloatValue);
                    break;
                }
                break;
            case 1:
                ((CollapsingToolbarLayout) this.f15077OooO0O0).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                ((TabLayout) this.f15077OooO0O0).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 3:
                ((TextInputLayout) this.f15077OooO0O0).f27923o00000OO.OooOOOo(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ((View) this.f15077OooO0O0).invalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f15077OooO0O0;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
        }
    }
}

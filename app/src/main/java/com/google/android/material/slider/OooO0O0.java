package com.google.android.material.slider;

import Ooooo0o.oo0o0O0;
import android.animation.ValueAnimator;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o */
    public final /* synthetic */ BaseSlider f27802OooO00o;

    public OooO0O0(BaseSlider baseSlider) {
        this.f27802OooO00o = baseSlider;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseSlider baseSlider = this.f27802OooO00o;
        ArrayList arrayList = baseSlider.f27758Oooo000;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o00000OO.OooO0O0 oooO0O0 = (o00000OO.OooO0O0) obj;
            oooO0O0.f29257Oooooo0 = 1.2f;
            oooO0O0.f29254OooooOO = fFloatValue;
            oooO0O0.f29255OooooOo = fFloatValue;
            oooO0O0.f29256Oooooo = oo0o0O0.OooO0O0(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
            oooO0O0.invalidateSelf();
        }
        ViewCompat.postInvalidateOnAnimation(baseSlider);
    }
}

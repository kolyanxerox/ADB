package com.google.android.material.transformation;

import Ooooo0o.o00O0OO;
import Ooooo0o.o00OO0O0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o00000Oo.OooOO0O;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o00OO0O0 f27992OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OO0O0 f27993OooO0Oo;

    public FabTransformationScrimBehavior() {
        this.f27992OooO0OO = new o00OO0O0(75L);
        this.f27993OooO0Oo = new o00OO0O0(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet OooO0O0(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        o00OO0O0 o00oo0o0 = z ? this.f27992OooO0OO : this.f27993OooO0Oo;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        o00oo0o0.OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        o00O0OO.OooO00o(animatorSet, arrayList);
        animatorSet.addListener(new OooOO0O(view2, z));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27992OooO0OO = new o00OO0O0(75L);
        this.f27993OooO0Oo = new o00OO0O0(0L);
    }
}

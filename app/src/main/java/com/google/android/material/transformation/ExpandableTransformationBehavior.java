package com.google.android.material.transformation;

import OooooOO.ooooO0O0;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public AnimatorSet f27985OooO0O0;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void OooO00o(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f27985OooO0O0;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetOooO0O0 = OooO0O0(view, view2, z, z3);
        this.f27985OooO0O0 = animatorSetOooO0O0;
        animatorSetOooO0O0.addListener(new ooooO0O0(this, 2));
        this.f27985OooO0O0.start();
        if (z2) {
            return;
        }
        this.f27985OooO0O0.end();
    }

    public abstract AnimatorSet OooO0O0(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

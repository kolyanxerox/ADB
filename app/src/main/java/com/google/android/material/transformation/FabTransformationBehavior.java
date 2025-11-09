package com.google.android.material.transformation;

import OooO0oO.OooOOO0;
import Ooooo0o.o00OO00O;
import Ooooo0o.o00OO0O0;
import Ooooo0o.o00OO0OO;
import Ooooo0o.oo0o0O0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f27986OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final RectF f27987OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int[] f27988OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f27989OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public float f27990OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public float f27991OooO0oo;

    public FabTransformationBehavior() {
        this.f27986OooO0OO = new Rect();
        this.f27987OooO0Oo = new RectF();
        this.f27989OooO0o0 = new RectF();
        this.f27988OooO0o = new int[2];
    }

    public static Pair OooO0OO(float f, float f2, boolean z, OooOOO0 oooOOO0) {
        o00OO0O0 o00oo0o0OooO0o;
        o00OO0O0 o00oo0o0OooO0o2;
        if (f == 0.0f || f2 == 0.0f) {
            o00oo0o0OooO0o = ((o00OO00O) oooOOO0.f13280OooOo0o).OooO0o("translationXLinear");
            o00oo0o0OooO0o2 = ((o00OO00O) oooOOO0.f13280OooOo0o).OooO0o("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            o00oo0o0OooO0o = ((o00OO00O) oooOOO0.f13280OooOo0o).OooO0o("translationXCurveDownwards");
            o00oo0o0OooO0o2 = ((o00OO00O) oooOOO0.f13280OooOo0o).OooO0o("translationYCurveDownwards");
        } else {
            o00oo0o0OooO0o = ((o00OO00O) oooOOO0.f13280OooOo0o).OooO0o("translationXCurveUpwards");
            o00oo0o0OooO0o2 = ((o00OO00O) oooOOO0.f13280OooOo0o).OooO0o("translationYCurveUpwards");
        }
        return new Pair(o00oo0o0OooO0o, o00oo0o0OooO0o2);
    }

    public static float OooO0o(OooOOO0 oooOOO0, o00OO0O0 o00oo0o0, float f) {
        long j = o00oo0o0.f15010OooO00o;
        o00OO0O0 o00oo0o0OooO0o = ((o00OO00O) oooOOO0.f13280OooOo0o).OooO0o("expansion");
        return oo0o0O0.OooO00o(f, 0.0f, o00oo0o0.OooO0O0().getInterpolation((((o00oo0o0OooO0o.f15010OooO00o + o00oo0o0OooO0o.f15011OooO0O0) + 17) - j) / o00oo0o0.f15011OooO0O0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035c  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet OooO0O0(android.view.View r25, android.view.View r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.OooO0O0(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float OooO0Oo(View view, View view2, o00OO0OO o00oo0oo) {
        RectF rectF = this.f27987OooO0Oo;
        RectF rectF2 = this.f27989OooO0o0;
        OooO0oO(view, rectF);
        rectF.offset(this.f27990OooO0oO, this.f27991OooO0oo);
        OooO0oO(view2, rectF2);
        o00oo0oo.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float OooO0o0(View view, View view2, o00OO0OO o00oo0oo) {
        RectF rectF = this.f27987OooO0Oo;
        RectF rectF2 = this.f27989OooO0o0;
        OooO0oO(view, rectF);
        rectF.offset(this.f27990OooO0oO, this.f27991OooO0oo);
        OooO0oO(view2, rectF2);
        o00oo0oo.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void OooO0oO(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f27988OooO0o);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract OooOOO0 OooO0oo(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27986OooO0OO = new Rect();
        this.f27987OooO0Oo = new RectF();
        this.f27989OooO0o0 = new RectF();
        this.f27988OooO0o = new int[2];
    }
}

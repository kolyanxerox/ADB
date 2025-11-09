package com.google.android.material.bottomappbar;

import Oooo0o0.OooO;
import Ooooo00.OooOo;
import Ooooo0o.oo0o0O0;
import OooooOo.oOOO00Oo;
import OooooOo.oOOO00o0;
import OooooOo.oOOO0OO0;
import OooooOo.oOOO0OOO;
import OooooOo.oOOOoo00;
import OooooOo.oOOo0000;
import OooooOo.oOOo0O00;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o000000.OooOOO0;
import o000000.OooOo00;
import o000000.Oooo000;
import o0ooOO0.o00000O0;
import o0ooOO0.o00000OO;
import o0ooOO0.o0000oo;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: OoooO0O */
    public static final /* synthetic */ int f27345OoooO0O = 0;

    /* renamed from: OooOo */
    public AnimatorSet f27346OooOo;

    /* renamed from: OooOo0O */
    public Integer f27347OooOo0O;

    /* renamed from: OooOo0o */
    public final OooOOO0 f27348OooOo0o;

    /* renamed from: OooOoO */
    public int f27349OooOoO;

    /* renamed from: OooOoO0 */
    public AnimatorSet f27350OooOoO0;

    /* renamed from: OooOoOO */
    public int f27351OooOoOO;

    /* renamed from: OooOoo */
    public final int f27352OooOoo;

    /* renamed from: OooOoo0 */
    public int f27353OooOoo0;

    /* renamed from: OooOooO */
    public int f27354OooOooO;

    /* renamed from: OooOooo */
    public int f27355OooOooo;

    /* renamed from: Oooo */
    public int f27356Oooo;

    /* renamed from: Oooo0 */
    public final boolean f27357Oooo0;

    /* renamed from: Oooo000 */
    public final boolean f27358Oooo000;

    /* renamed from: Oooo00O */
    public boolean f27359Oooo00O;

    /* renamed from: Oooo00o */
    public final boolean f27360Oooo00o;

    /* renamed from: Oooo0O0 */
    public final boolean f27361Oooo0O0;

    /* renamed from: Oooo0OO */
    public boolean f27362Oooo0OO;

    /* renamed from: Oooo0o */
    public Behavior f27363Oooo0o;

    /* renamed from: Oooo0o0 */
    public boolean f27364Oooo0o0;

    /* renamed from: Oooo0oO */
    public int f27365Oooo0oO;

    /* renamed from: Oooo0oo */
    public int f27366Oooo0oo;

    /* renamed from: OoooO0 */
    public final oOOO00o0 f27367OoooO0;

    /* renamed from: OoooO00 */
    public final oOOO00Oo f27368OoooO00;

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public static void OooOOOO(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        int i = bottomAppBar.f27353OooOoo0;
        if (i == 1) {
            layoutParams.anchorGravity = 49;
        }
        if (i == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public int getBottomInset() {
        return this.f27365Oooo0oO;
    }

    private int getFabAlignmentAnimationDuration() {
        return o0OO00OO.OooOoo0(getContext(), R.attr.motionDurationLong2, 300);
    }

    public float getFabTranslationX() {
        return OooO0oo(this.f27349OooOoO);
    }

    private float getFabTranslationY() {
        if (this.f27353OooOoo0 == 1) {
            return -getTopEdgeTreatment().f15071OoooO0O;
        }
        return 0.0f;
    }

    public int getLeftInset() {
        return this.f27356Oooo;
    }

    public int getRightInset() {
        return this.f27366Oooo0oo;
    }

    @NonNull
    public oOOo0O00 getTopEdgeTreatment() {
        return (oOOo0O00) this.f27348OooOo0o.f29048OooOo0O.f29028OooO00o.f29083OooO;
    }

    public final boolean OooO() {
        View viewOooO0o = OooO0o();
        FloatingActionButton floatingActionButton = viewOooO0o instanceof FloatingActionButton ? (FloatingActionButton) viewOooO0o : null;
        return floatingActionButton != null && floatingActionButton.OooO();
    }

    public final View OooO0o() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int OooO0oO(ActionMenuView actionMenuView, int i, boolean z) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.f27355OooOooo != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zOooO0Oo = o0000oo.OooO0Oo(this);
        int measuredWidth = zOooO0Oo ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                measuredWidth = zOooO0Oo ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zOooO0Oo ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i3 = zOooO0Oo ? this.f27366Oooo0oo : -this.f27356Oooo;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zOooO0Oo) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i3) + dimensionPixelOffset);
    }

    public final float OooO0oo(int i) {
        boolean zOooO0Oo = o0000oo.OooO0Oo(this);
        if (i != 1) {
            return 0.0f;
        }
        View viewOooO0o = OooO0o();
        int i2 = zOooO0Oo ? this.f27356Oooo : this.f27366Oooo0oo;
        return ((getMeasuredWidth() / 2) - ((this.f27354OooOooO == -1 || viewOooO0o == null) ? this.f27352OooOoo + i2 : ((viewOooO0o.getMeasuredWidth() / 2) + this.f27354OooOooO) + i2)) * (zOooO0Oo ? -1 : 1);
    }

    public final void OooOO0(int i, boolean z) {
        if (!ViewCompat.isLaidOut(this)) {
            this.f27362Oooo0OO = false;
            return;
        }
        AnimatorSet animatorSet = this.f27350OooOoO0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!OooO()) {
            i = 0;
            z = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - OooO0oO(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new oOOO0OOO(this, actionMenuView, i, z));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.f27350OooOoO0 = animatorSet3;
        animatorSet3.addListener(new oOOO00Oo(this, 2));
        this.f27350OooOoO0.start();
    }

    public final void OooOO0O() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f27350OooOoO0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (OooO()) {
            OooOOO(actionMenuView, this.f27349OooOoO, this.f27364Oooo0o0, false);
        } else {
            OooOOO(actionMenuView, 0, false, false);
        }
    }

    public final void OooOO0o() {
        getTopEdgeTreatment().f15068OoooO = getFabTranslationX();
        this.f27348OooOo0o.OooOOO((this.f27364Oooo0o0 && OooO() && this.f27353OooOoo0 == 1) ? 1.0f : 0.0f);
        View viewOooO0o = OooO0o();
        if (viewOooO0o != null) {
            viewOooO0o.setTranslationY(getFabTranslationY());
            viewOooO0o.setTranslationX(getFabTranslationX());
        }
    }

    public final void OooOOO(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        oOOOoo00 oooooo00 = new oOOOoo00(this, actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(oooooo00);
        } else {
            oooooo00.run();
        }
    }

    public final void OooOOO0(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().f15069OoooO0) {
            getTopEdgeTreatment().f15069OoooO0 = f;
            this.f27348OooOo0o.invalidateSelf();
        }
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f27348OooOo0o.f29048OooOo0O.f29033OooO0o0;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f15071OoooO0O;
    }

    public int getFabAlignmentMode() {
        return this.f27349OooOoO;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.f27354OooOooO;
    }

    public int getFabAnchorMode() {
        return this.f27353OooOoo0;
    }

    public int getFabAnimationMode() {
        return this.f27351OooOoOO;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f15070OoooO00;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f15067Oooo;
    }

    public boolean getHideOnScroll() {
        return this.f27359Oooo00O;
    }

    public int getMenuAlignmentMode() {
        return this.f27355OooOooo;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO.OooOo0(this, this.f27348OooOo0o);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.f27350OooOoO0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f27346OooOo;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            OooOO0o();
        }
        OooOO0O();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oOOo0000)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oOOo0000 oooo0000 = (oOOo0000) parcelable;
        super.onRestoreInstanceState(oooo0000.getSuperState());
        this.f27349OooOoO = oooo0000.f15065OooOo0O;
        this.f27364Oooo0o0 = oooo0000.f15066OooOo0o;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        oOOo0000 oooo0000 = new oOOo0000(super.onSaveInstanceState());
        oooo0000.f15065OooOo0O = this.f27349OooOoO;
        oooo0000.f15066OooOo0o = this.f27364Oooo0o0;
        return oooo0000;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.f27348OooOo0o, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().OooOO0o(f);
            this.f27348OooOo0o.invalidateSelf();
            OooOO0o();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        OooOOO0 oooOOO0 = this.f27348OooOo0o;
        oooOOO0.OooOO0o(f);
        int iOooO0oo = oooOOO0.f29048OooOo0O.f29040OooOOOO - oooOOO0.OooO0oo();
        Behavior behavior = getBehavior();
        behavior.f27336OooO0Oo = iOooO0oo;
        if (behavior.f27335OooO0OO == 1) {
            setTranslationY(behavior.f27334OooO0O0 + iOooO0oo);
        }
    }

    public void setFabAlignmentMode(int i) {
        this.f27362Oooo0OO = true;
        OooOO0(i, this.f27364Oooo0o0);
        if (this.f27349OooOoO != i && ViewCompat.isLaidOut(this)) {
            AnimatorSet animatorSet = this.f27346OooOo;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f27351OooOoOO == 1) {
                View viewOooO0o = OooO0o();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewOooO0o instanceof FloatingActionButton ? (FloatingActionButton) viewOooO0o : null, "translationX", OooO0oo(i));
                objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                View viewOooO0o2 = OooO0o();
                FloatingActionButton floatingActionButton = viewOooO0o2 instanceof FloatingActionButton ? (FloatingActionButton) viewOooO0o2 : null;
                if (floatingActionButton != null && !floatingActionButton.OooO0oo()) {
                    floatingActionButton.OooO0oO(new oOOO0OO0(this, i), true);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(o0OO00OO.OooOoo(getContext(), R.attr.motionEasingEmphasizedInterpolator, oo0o0O0.f15015OooO00o));
            this.f27346OooOo = animatorSet2;
            animatorSet2.addListener(new oOOO00Oo(this, 1));
            this.f27346OooOo.start();
        }
        this.f27349OooOoO = i;
    }

    public void setFabAlignmentModeEndMargin(@Px int i) {
        if (this.f27354OooOooO != i) {
            this.f27354OooOooO = i;
            OooOO0o();
        }
    }

    public void setFabAnchorMode(int i) {
        this.f27353OooOoo0 = i;
        OooOO0o();
        View viewOooO0o = OooO0o();
        if (viewOooO0o != null) {
            OooOOOO(this, viewOooO0o);
            viewOooO0o.requestLayout();
            this.f27348OooOo0o.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f27351OooOoOO = i;
    }

    public void setFabCornerSize(@Dimension float f) {
        if (f != getTopEdgeTreatment().f15072OoooOO0) {
            getTopEdgeTreatment().f15072OoooOO0 = f;
            this.f27348OooOo0o.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f15070OoooO00 = f;
            this.f27348OooOo0o.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f15067Oooo = f;
            this.f27348OooOo0o.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f27359Oooo00O = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f27355OooOooo != i) {
            this.f27355OooOooo = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                OooOOO(actionMenuView, this.f27349OooOoO, OooO(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f27347OooOo0O != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(drawable, this.f27347OooOo0O.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f27347OooOo0O = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i);
        OooOOO0 oooOOO0 = new OooOOO0();
        this.f27348OooOo0o = oooOOO0;
        this.f27362Oooo0OO = false;
        this.f27364Oooo0o0 = true;
        this.f27368OoooO00 = new oOOO00Oo(this, 0);
        this.f27367OoooO0 = new oOOO00o0(this);
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, OooOo.f14956OooO0o0, i, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateListOooO00o = OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 0);
        if (typedArrayOooO0Oo.hasValue(11)) {
            setNavigationIconTint(typedArrayOooO0Oo.getColor(11, -1));
        }
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(1, 0);
        float dimensionPixelOffset = typedArrayOooO0Oo.getDimensionPixelOffset(6, 0);
        float dimensionPixelOffset2 = typedArrayOooO0Oo.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset3 = typedArrayOooO0Oo.getDimensionPixelOffset(8, 0);
        this.f27349OooOoO = typedArrayOooO0Oo.getInt(2, 0);
        this.f27351OooOoOO = typedArrayOooO0Oo.getInt(5, 0);
        this.f27353OooOoo0 = typedArrayOooO0Oo.getInt(4, 1);
        this.f27358Oooo000 = typedArrayOooO0Oo.getBoolean(15, true);
        this.f27355OooOooo = typedArrayOooO0Oo.getInt(10, 0);
        this.f27359Oooo00O = typedArrayOooO0Oo.getBoolean(9, false);
        this.f27360Oooo00o = typedArrayOooO0Oo.getBoolean(12, false);
        this.f27357Oooo0 = typedArrayOooO0Oo.getBoolean(13, false);
        this.f27361Oooo0O0 = typedArrayOooO0Oo.getBoolean(14, false);
        this.f27354OooOooO = typedArrayOooO0Oo.getDimensionPixelOffset(3, -1);
        typedArrayOooO0Oo.recycle();
        this.f27352OooOoo = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        oOOo0O00 oooo0o00 = new oOOo0O00(0);
        oooo0o00.f15072OoooOO0 = -1.0f;
        oooo0o00.f15070OoooO00 = dimensionPixelOffset;
        oooo0o00.f15067Oooo = dimensionPixelOffset2;
        oooo0o00.OooOO0o(dimensionPixelOffset3);
        oooo0o00.f15068OoooO = 0.0f;
        OooOo00 oooOo00 = new OooOo00();
        OooOo00 oooOo002 = new OooOo00();
        OooOo00 oooOo003 = new OooOo00();
        OooOo00 oooOo004 = new OooOo00();
        o000000.OooO00o oooO00o = new o000000.OooO00o(0.0f);
        o000000.OooO00o oooO00o2 = new o000000.OooO00o(0.0f);
        o000000.OooO00o oooO00o3 = new o000000.OooO00o(0.0f);
        o000000.OooO00o oooO00o4 = new o000000.OooO00o(0.0f);
        o000000.OooO oooO = new o000000.OooO(0);
        o000000.OooO oooO2 = new o000000.OooO(0);
        o000000.OooO oooO3 = new o000000.OooO(0);
        Oooo000 oooo000 = new Oooo000();
        oooo000.f29084OooO00o = oooOo00;
        oooo000.f29085OooO0O0 = oooOo002;
        oooo000.f29086OooO0OO = oooOo003;
        oooo000.f29087OooO0Oo = oooOo004;
        oooo000.f29089OooO0o0 = oooO00o;
        oooo000.f29088OooO0o = oooO00o2;
        oooo000.f29090OooO0oO = oooO00o3;
        oooo000.f29091OooO0oo = oooO00o4;
        oooo000.f29083OooO = oooo0o00;
        oooo000.f29092OooOO0 = oooO;
        oooo000.f29093OooOO0O = oooO2;
        oooo000.OooOO0o = oooO3;
        oooOOO0.setShapeAppearanceModel(oooo000);
        oooOOO0.OooOOo0();
        oooOOO0.OooOOOO(Paint.Style.FILL);
        oooOOO0.OooOO0O(context2);
        setElevation(dimensionPixelSize);
        DrawableCompat.setTintList(oooOOO0, colorStateListOooO00o);
        ViewCompat.setBackground(this, oooOOO0);
        oOOO00o0 oooo00o0 = new oOOO00o0(this);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooOo.f14970OooOo0O, i, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.recycle();
        o0000oo.OooO00o(this, new o00000OO(z, z2, z3, oooo00o0));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.f27363Oooo0o == null) {
            this.f27363Oooo0o = new Behavior();
        }
        return this.f27363Oooo0o;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: OooO */
        public final OooO00o f27369OooO;

        /* renamed from: OooO0o */
        public final Rect f27370OooO0o;

        /* renamed from: OooO0oO */
        public WeakReference f27371OooO0oO;

        /* renamed from: OooO0oo */
        public int f27372OooO0oo;

        public Behavior() {
            this.f27369OooO = new OooO00o(this);
            this.f27370OooO0o = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f27371OooO0oO = new WeakReference(bottomAppBar);
            int i2 = BottomAppBar.f27345OoooO0O;
            View viewOooO0o = bottomAppBar.OooO0o();
            if (viewOooO0o != null && !ViewCompat.isLaidOut(viewOooO0o)) {
                BottomAppBar.OooOOOO(bottomAppBar, viewOooO0o);
                this.f27372OooO0oo = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) viewOooO0o.getLayoutParams())).bottomMargin;
                if (viewOooO0o instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewOooO0o;
                    if (bottomAppBar.f27353OooOoo0 == 0 && bottomAppBar.f27358Oooo000) {
                        ViewCompat.setElevation(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.OooO0OO(bottomAppBar.f27368OoooO00);
                    floatingActionButton.OooO0Oo(new oOOO00Oo(bottomAppBar, 3));
                    floatingActionButton.OooO0o0(bottomAppBar.f27367OoooO0);
                }
                viewOooO0o.addOnLayoutChangeListener(this.f27369OooO);
                bottomAppBar.OooOO0o();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27369OooO = new OooO00o(this);
            this.f27370OooO0o = new Rect();
        }
    }
}

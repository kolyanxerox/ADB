package com.google.android.material.floatingactionbutton;

import Ooooo00.OooOo;
import Ooooo0o.o00OO00O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import o00000O.OooO00o;
import o000Ooo.o00oO0o;
import o00oO0o.Oooo0;
import o00oO0o.Oooo000;
import o00oO0o.o000oOoO;
import o00oO0o.o0OoOo0;
import o0ooOO0.OooOO0O;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: OoooOOo, reason: collision with root package name */
    public static final Oooo000 f27618OoooOOo;

    /* renamed from: OoooOo0, reason: collision with root package name */
    public static final Oooo000 f27619OoooOo0;

    /* renamed from: OoooOoO, reason: collision with root package name */
    public static final Oooo000 f27620OoooOoO;

    /* renamed from: OoooOoo, reason: collision with root package name */
    public static final Oooo000 f27621OoooOoo;

    /* renamed from: Oooo, reason: collision with root package name */
    public final int f27622Oooo;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public int f27623Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public final Oooo0 f27624Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public final Oooo0 f27625Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public final o0OoOo0 f27626Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final o000oOoO f27627Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public boolean f27628OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public int f27629OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public int f27630OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public final ExtendedFloatingActionButtonBehavior f27631OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public boolean f27632OoooOO0;

    /* renamed from: OoooOOO, reason: collision with root package name */
    public ColorStateList f27633OoooOOO;
    public boolean o000oOoO;

    static {
        Class<Float> cls = Float.class;
        f27618OoooOOo = new Oooo000(0, cls, "width");
        f27619OoooOo0 = new Oooo000(1, cls, "height");
        f27620OoooOoO = new Oooo000(2, cls, "paddingStart");
        f27621OoooOoo = new Oooo000(3, cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0o0(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3, o000oooo.o000O r4) {
        /*
            r3.getClass()
            boolean r0 = r4.OooOO0O()
            if (r0 == 0) goto La
            return
        La:
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r0 != 0) goto L26
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L1c
            int r0 = r3.f27623Oooo0OO
            r1 = 2
            if (r0 != r1) goto L22
            goto L57
        L1c:
            int r0 = r3.f27623Oooo0OO
            r1 = 1
            if (r0 == r1) goto L22
            goto L57
        L22:
            boolean r0 = r3.o000oOoO
            if (r0 == 0) goto L57
        L26:
            boolean r0 = r3.isInEditMode()
            if (r0 != 0) goto L57
            r0 = 0
            r3.measure(r0, r0)
            android.animation.AnimatorSet r3 = r4.OooO0O0()
            OooooOO.ooooO0O0 r1 = new OooooOO.ooooO0O0
            r2 = 3
            r1.<init>(r4, r2)
            r3.addListener(r1)
            java.lang.Object r4 = r4.f31134OooO0Oo
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r1 = r4.size()
        L45:
            if (r0 >= r1) goto L53
            java.lang.Object r2 = r4.get(r0)
            int r0 = r0 + 1
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r3.addListener(r2)
            goto L45
        L53:
            r3.start()
            return
        L57:
            r4.OooOO0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooO0o0(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton, o000oooo.o000O):void");
    }

    public final void OooO0o(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f27631OoooO0O;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i = this.f27622Oooo;
        if (i >= 0) {
            return i;
        }
        return getIconSize() + (Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) * 2);
    }

    @Nullable
    public o00OO00O getExtendMotionSpec() {
        return (o00OO00O) this.f27624Oooo0o.f31137OooO0oO;
    }

    @Nullable
    public o00OO00O getHideMotionSpec() {
        return (o00OO00O) this.f27627Oooo0oo.f31137OooO0oO;
    }

    @Nullable
    public o00OO00O getShowMotionSpec() {
        return (o00OO00O) this.f27626Oooo0oO.f31137OooO0oO;
    }

    @Nullable
    public o00OO00O getShrinkMotionSpec() {
        return (o00OO00O) this.f27625Oooo0o0.f31137OooO0oO;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27628OoooO && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f27628OoooO = false;
            this.f27625Oooo0o0.OooOO0();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.o000oOoO = z;
    }

    public void setExtendMotionSpec(@Nullable o00OO00O o00oo00o) {
        this.f27624Oooo0o.f31137OooO0oO = o00oo00o;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(o00OO00O.OooO0O0(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f27628OoooO == z) {
            return;
        }
        Oooo0 oooo0 = z ? this.f27624Oooo0o : this.f27625Oooo0o0;
        if (oooo0.OooOO0O()) {
            return;
        }
        oooo0.OooOO0();
    }

    public void setHideMotionSpec(@Nullable o00OO00O o00oo00o) {
        this.f27627Oooo0oo.f31137OooO0oO = o00oo00o;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(o00OO00O.OooO0O0(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f27628OoooO || this.f27632OoooOO0) {
            return;
        }
        this.f27630OoooO00 = ViewCompat.getPaddingStart(this);
        this.f27629OoooO0 = ViewCompat.getPaddingEnd(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.f27628OoooO || this.f27632OoooOO0) {
            return;
        }
        this.f27630OoooO00 = i;
        this.f27629OoooO0 = i3;
    }

    public void setShowMotionSpec(@Nullable o00OO00O o00oo00o) {
        this.f27626Oooo0oO.f31137OooO0oO = o00oo00o;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(o00OO00O.OooO0O0(getContext(), i));
    }

    public void setShrinkMotionSpec(@Nullable o00OO00O o00oo00o) {
        this.f27625Oooo0o0.f31137OooO0oO = o00oo00o;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(o00OO00O.OooO0O0(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.f27633OoooOOO = getTextColors();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.f27623Oooo0OO = 0;
        o00oO0o o00oo0o = new o00oO0o(16, false);
        o0OoOo0 o0oooo0 = new o0OoOo0(this, o00oo0o);
        this.f27626Oooo0oO = o0oooo0;
        o000oOoO o000oooo2 = new o000oOoO(this, o00oo0o);
        this.f27627Oooo0oo = o000oooo2;
        this.f27628OoooO = true;
        this.f27632OoooOO0 = false;
        this.o000oOoO = false;
        Context context2 = getContext();
        this.f27631OoooO0O = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, OooOo.f14964OooOOOo, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        o00OO00O o00oo00oOooO00o = o00OO00O.OooO00o(context2, typedArrayOooO0Oo, 4);
        o00OO00O o00oo00oOooO00o2 = o00OO00O.OooO00o(context2, typedArrayOooO0Oo, 3);
        o00OO00O o00oo00oOooO00o3 = o00OO00O.OooO00o(context2, typedArrayOooO0Oo, 2);
        o00OO00O o00oo00oOooO00o4 = o00OO00O.OooO00o(context2, typedArrayOooO0Oo, 5);
        this.f27622Oooo = typedArrayOooO0Oo.getDimensionPixelSize(0, -1);
        this.f27630OoooO00 = ViewCompat.getPaddingStart(this);
        this.f27629OoooO0 = ViewCompat.getPaddingEnd(this);
        o00oO0o o00oo0o2 = new o00oO0o(16, false);
        Oooo0 oooo0 = new Oooo0(this, o00oo0o2, new o00oO0o.OooOo(this, 0), true);
        this.f27624Oooo0o = oooo0;
        Oooo0 oooo02 = new Oooo0(this, o00oo0o2, new o00oO0o.OooOo(this, 1), false);
        this.f27625Oooo0o0 = oooo02;
        o0oooo0.f31137OooO0oO = o00oo00oOooO00o;
        o000oooo2.f31137OooO0oO = o00oo00oOooO00o2;
        oooo0.f31137OooO0oO = o00oo00oOooO00o3;
        oooo02.f31137OooO0oO = o00oo00oOooO00o4;
        typedArrayOooO0Oo.recycle();
        setShapeAppearanceModel(o000000.Oooo000.OooO0OO(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, o000000.Oooo000.f29082OooOOO0).OooO00o());
        this.f27633OoooOOO = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: OooO00o, reason: collision with root package name */
        public Rect f27634OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f27635OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f27636OooO0OO;

        public ExtendedFloatingActionButtonBehavior() {
            this.f27635OooO0O0 = false;
            this.f27636OooO0OO = true;
        }

        public final boolean OooO00o(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f27635OooO0O0 && !this.f27636OooO0OO) || layoutParams.getAnchorId() != appBarLayout.getId()) {
                return false;
            }
            if (this.f27634OooO00o == null) {
                this.f27634OooO00o = new Rect();
            }
            Rect rect = this.f27634OooO00o;
            OooOO0O.OooO00o(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.OooO0o0(extendedFloatingActionButton, this.f27636OooO0OO ? extendedFloatingActionButton.f27625Oooo0o0 : extendedFloatingActionButton.f27627Oooo0oo);
                return true;
            }
            ExtendedFloatingActionButton.OooO0o0(extendedFloatingActionButton, this.f27636OooO0OO ? extendedFloatingActionButton.f27624Oooo0o : extendedFloatingActionButton.f27626Oooo0oO);
            return true;
        }

        public final boolean OooO0O0(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f27635OooO0O0 && !this.f27636OooO0OO) || layoutParams.getAnchorId() != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.OooO0o0(extendedFloatingActionButton, this.f27636OooO0OO ? extendedFloatingActionButton.f27625Oooo0o0 : extendedFloatingActionButton.f27627Oooo0oo);
                return true;
            }
            ExtendedFloatingActionButton.OooO0o0(extendedFloatingActionButton, this.f27636OooO0OO ? extendedFloatingActionButton.f27624Oooo0o : extendedFloatingActionButton.f27626Oooo0oO);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                OooO00o(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    OooO0O0(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = dependencies.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && OooO0O0(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (OooO00o(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo.f14966OooOOo0);
            this.f27635OooO0O0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f27636OooO0OO = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f27633OoooOOO = getTextColors();
    }
}

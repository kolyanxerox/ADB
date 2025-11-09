package com.google.android.material.button;

import Oooo0o0.OooO;
import OoooooO.oOo0o00;
import OoooooO.oo00;
import OoooooO.oo000000;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o000000.OooOo;
import o000000.Oooo000;
import o000000.o0Oo0oo;
import o000Ooo0.OooOO0;
import o0O0O00.OooO00o;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, o0Oo0oo {

    /* renamed from: Oooo0 */
    public static final int[] f27435Oooo0 = {R.attr.state_checkable};

    /* renamed from: Oooo0O0 */
    public static final int[] f27436Oooo0O0 = {R.attr.state_checked};

    /* renamed from: OooOo */
    public oOo0o00 f27437OooOo;

    /* renamed from: OooOo0O */
    public final oo00 f27438OooOo0O;

    /* renamed from: OooOo0o */
    public final LinkedHashSet f27439OooOo0o;

    /* renamed from: OooOoO */
    public ColorStateList f27440OooOoO;

    /* renamed from: OooOoO0 */
    public PorterDuff.Mode f27441OooOoO0;

    /* renamed from: OooOoOO */
    public Drawable f27442OooOoOO;

    /* renamed from: OooOoo */
    public int f27443OooOoo;

    /* renamed from: OooOoo0 */
    public int f27444OooOoo0;

    /* renamed from: OooOooO */
    public int f27445OooOooO;

    /* renamed from: OooOooo */
    public int f27446OooOooo;

    /* renamed from: Oooo000 */
    public boolean f27447Oooo000;

    /* renamed from: Oooo00O */
    public boolean f27448Oooo00O;

    /* renamed from: Oooo00o */
    public int f27449Oooo00o;

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.github.superadb.R.attr.materialButtonStyle);
    }

    @NonNull
    private String getA11yClassName() {
        oo00 oo00Var = this.f27438OooOo0O;
        return ((oo00Var == null || !oo00Var.f15124OooOOo0) ? Button.class : CompoundButton.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        int iMax = 0;
        for (int i = 0; i < lineCount; i++) {
            CharSequence charSequenceSubSequence = getText().subSequence(getLayout().getLineStart(i), getLayout().getLineEnd(i));
            TextPaint paint = getPaint();
            String string = charSequenceSubSequence.toString();
            if (getTransformationMethod() != null) {
                string = getTransformationMethod().getTransformation(string, this).toString();
            }
            iMax = Math.max(iMax, Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth()));
        }
        return iMax;
    }

    public final boolean OooO00o() {
        oo00 oo00Var = this.f27438OooOo0O;
        return (oo00Var == null || oo00Var.f15121OooOOOO) ? false : true;
    }

    public final void OooO0O0() {
        int i = this.f27449Oooo00o;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f27442OooOoOO, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.f27442OooOoOO, null);
        } else if (i == 16 || i == 32) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, this.f27442OooOoOO, null, null);
        }
    }

    public final void OooO0OO(boolean z) {
        Drawable drawable = this.f27442OooOoOO;
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.f27442OooOoOO = drawableMutate;
            DrawableCompat.setTintList(drawableMutate, this.f27440OooOoO);
            PorterDuff.Mode mode = this.f27441OooOoO0;
            if (mode != null) {
                DrawableCompat.setTintMode(this.f27442OooOoOO, mode);
            }
            int intrinsicWidth = this.f27444OooOoo0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f27442OooOoOO.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f27444OooOoo0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f27442OooOoOO.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f27442OooOoOO;
            int i = this.f27443OooOoo;
            int i2 = this.f27445OooOooO;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f27442OooOoOO.setVisible(true, z);
        }
        if (z) {
            OooO0O0();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f27449Oooo00o;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f27442OooOoOO) || (((i3 == 3 || i3 == 4) && drawable5 != this.f27442OooOoOO) || ((i3 == 16 || i3 == 32) && drawable4 != this.f27442OooOoOO))) {
            OooO0O0();
        }
    }

    public final void OooO0Oo(int i, int i2) {
        if (this.f27442OooOoOO == null || getLayout() == null) {
            return;
        }
        int i3 = this.f27449Oooo00o;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f27443OooOoo = 0;
                if (i3 == 16) {
                    this.f27445OooOooO = 0;
                    OooO0OO(false);
                    return;
                }
                int intrinsicHeight = this.f27444OooOoo0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f27442OooOoOO.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f27446OooOooo) - getPaddingBottom()) / 2);
                if (this.f27445OooOooO != iMax) {
                    this.f27445OooOooO = iMax;
                    OooO0OO(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f27445OooOooO = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f27449Oooo00o;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f27443OooOoo = 0;
            OooO0OO(false);
            return;
        }
        int intrinsicWidth = this.f27444OooOoo0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f27442OooOoOO.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - ViewCompat.getPaddingEnd(this)) - intrinsicWidth) - this.f27446OooOooo) - ViewCompat.getPaddingStart(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((ViewCompat.getLayoutDirection(this) == 1) != (this.f27449Oooo00o == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f27443OooOoo != textLayoutWidth) {
            this.f27443OooOoo = textLayoutWidth;
            OooO0OO(false);
        }
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (OooO00o()) {
            return this.f27438OooOo0O.f15115OooO0oO;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f27442OooOoOO;
    }

    public int getIconGravity() {
        return this.f27449Oooo00o;
    }

    @Px
    public int getIconPadding() {
        return this.f27446OooOooo;
    }

    @Px
    public int getIconSize() {
        return this.f27444OooOoo0;
    }

    public ColorStateList getIconTint() {
        return this.f27440OooOoO;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f27441OooOoO0;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f27438OooOo0O.f15113OooO0o;
    }

    @Dimension
    public int getInsetTop() {
        return this.f27438OooOo0O.f15114OooO0o0;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (OooO00o()) {
            return this.f27438OooOo0O.OooOO0o;
        }
        return null;
    }

    @NonNull
    public Oooo000 getShapeAppearanceModel() {
        if (OooO00o()) {
            return this.f27438OooOo0O.f15110OooO0O0;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (OooO00o()) {
            return this.f27438OooOo0O.f15118OooOO0O;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (OooO00o()) {
            return this.f27438OooOo0O.f15116OooO0oo;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return OooO00o() ? this.f27438OooOo0O.f15117OooOO0 : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return OooO00o() ? this.f27438OooOo0O.f15108OooO : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f27447Oooo000;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (OooO00o()) {
            OooO.OooOo0(this, this.f27438OooOo0O.OooO0O0(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        oo00 oo00Var = this.f27438OooOo0O;
        if (oo00Var != null && oo00Var.f15124OooOOo0) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f27435Oooo0);
        }
        if (this.f27447Oooo000) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f27436Oooo0O0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f27447Oooo000);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        oo00 oo00Var = this.f27438OooOo0O;
        accessibilityNodeInfo.setCheckable(oo00Var != null && oo00Var.f15124OooOOo0);
        accessibilityNodeInfo.setChecked(this.f27447Oooo000);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oo000000)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oo000000 oo000000Var = (oo000000) parcelable;
        super.onRestoreInstanceState(oo000000Var.getSuperState());
        setChecked(oo000000Var.f15127OooOo0O);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        oo000000 oo000000Var = new oo000000(super.onSaveInstanceState());
        oo000000Var.f15127OooOo0O = this.f27447Oooo000;
        return oo000000Var;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f27438OooOo0O.f15123OooOOo) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f27442OooOoOO != null) {
            if (this.f27442OooOoOO.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        if (!OooO00o()) {
            super.setBackgroundColor(i);
            return;
        }
        oo00 oo00Var = this.f27438OooOo0O;
        if (oo00Var.OooO0O0(false) != null) {
            oo00Var.OooO0O0(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!OooO00o()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        oo00 oo00Var = this.f27438OooOo0O;
        oo00Var.f15121OooOOOO = true;
        ColorStateList colorStateList = oo00Var.f15117OooOO0;
        MaterialButton materialButton = oo00Var.f15109OooO00o;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(oo00Var.f15108OooO);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (OooO00o()) {
            this.f27438OooOo0O.f15124OooOOo0 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        oo00 oo00Var = this.f27438OooOo0O;
        if (oo00Var == null || !oo00Var.f15124OooOOo0 || !isEnabled() || this.f27447Oooo000 == z) {
            return;
        }
        this.f27447Oooo000 = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f27447Oooo000;
            if (!materialButtonToggleGroup.f27456OooOoOO) {
                materialButtonToggleGroup.OooO0O0(getId(), z2);
            }
        }
        if (this.f27448Oooo00O) {
            return;
        }
        this.f27448Oooo00O = true;
        Iterator it = this.f27439OooOo0o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f27448Oooo00O = false;
    }

    public void setCornerRadius(@Px int i) {
        if (OooO00o()) {
            oo00 oo00Var = this.f27438OooOo0O;
            if (oo00Var.f15122OooOOOo && oo00Var.f15115OooO0oO == i) {
                return;
            }
            oo00Var.f15115OooO0oO = i;
            oo00Var.f15122OooOOOo = true;
            OooOo oooOoOooO0o = oo00Var.f15110OooO0O0.OooO0o();
            oooOoOooO0o.OooO0OO(i);
            oo00Var.OooO0OO(oooOoOooO0o.OooO00o());
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (OooO00o()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (OooO00o()) {
            this.f27438OooOo0O.OooO0O0(false).OooOO0o(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f27442OooOoOO != drawable) {
            this.f27442OooOoOO = drawable;
            OooO0OO(true);
            OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f27449Oooo00o != i) {
            this.f27449Oooo00o = i;
            OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i) {
        if (this.f27446OooOooo != i) {
            this.f27446OooOooo = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@DrawableRes int i) {
        setIcon(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setIconSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f27444OooOoo0 != i) {
            this.f27444OooOoo0 = i;
            OooO0OO(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f27440OooOoO != colorStateList) {
            this.f27440OooOoO = colorStateList;
            OooO0OO(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f27441OooOoO0 != mode) {
            this.f27441OooOoO0 = mode;
            OooO0OO(false);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(@Dimension int i) {
        oo00 oo00Var = this.f27438OooOo0O;
        oo00Var.OooO0Oo(oo00Var.f15114OooO0o0, i);
    }

    public void setInsetTop(@Dimension int i) {
        oo00 oo00Var = this.f27438OooOo0O;
        oo00Var.OooO0Oo(i, oo00Var.f15113OooO0o);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable oOo0o00 ooo0o00) {
        this.f27437OooOo = ooo0o00;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        oOo0o00 ooo0o00 = this.f27437OooOo;
        if (ooo0o00 != null) {
            ((MaterialButtonToggleGroup) ((OooOO0) ooo0o00).f30538OooOo0o).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (OooO00o()) {
            oo00 oo00Var = this.f27438OooOo0O;
            if (oo00Var.OooOO0o != colorStateList) {
                oo00Var.OooOO0o = colorStateList;
                MaterialButton materialButton = oo00Var.f15109OooO00o;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(OooO00o.OooO0OO(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (OooO00o()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    @Override // o000000.o0Oo0oo
    public void setShapeAppearanceModel(@NonNull Oooo000 oooo000) {
        if (!OooO00o()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f27438OooOo0O.OooO0OO(oooo000);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (OooO00o()) {
            oo00 oo00Var = this.f27438OooOo0O;
            oo00Var.f15119OooOOO = z;
            oo00Var.OooO0o();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (OooO00o()) {
            oo00 oo00Var = this.f27438OooOo0O;
            if (oo00Var.f15118OooOO0O != colorStateList) {
                oo00Var.f15118OooOO0O = colorStateList;
                oo00Var.OooO0o();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (OooO00o()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(@Px int i) {
        if (OooO00o()) {
            oo00 oo00Var = this.f27438OooOo0O;
            if (oo00Var.f15116OooO0oo != i) {
                oo00Var.f15116OooO0oo = i;
                oo00Var.OooO0o();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (OooO00o()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!OooO00o()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        oo00 oo00Var = this.f27438OooOo0O;
        if (oo00Var.f15117OooOO0 != colorStateList) {
            oo00Var.f15117OooOO0 = colorStateList;
            if (oo00Var.OooO0O0(false) != null) {
                DrawableCompat.setTintList(oo00Var.OooO0O0(false), oo00Var.f15117OooOO0);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!OooO00o()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        oo00 oo00Var = this.f27438OooOo0O;
        if (oo00Var.f15108OooO != mode) {
            oo00Var.f15108OooO = mode;
            if (oo00Var.OooO0O0(false) == null || oo00Var.f15108OooO == null) {
                return;
            }
            DrawableCompat.setTintMode(oo00Var.OooO0O0(false), oo00Var.f15108OooO);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f27438OooOo0O.f15123OooOOo = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f27447Oooo000);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.f27439OooOo0o = new LinkedHashSet();
        this.f27447Oooo000 = false;
        this.f27448Oooo00O = false;
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, Ooooo00.OooOo.f14973OooOoO0, i, com.github.superadb.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f27446OooOooo = typedArrayOooO0Oo.getDimensionPixelSize(12, 0);
        int i2 = typedArrayOooO0Oo.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f27441OooOoO0 = o0000oo.OooO0o0(i2, mode);
        this.f27440OooOoO = OooO0OO.OooO00o(getContext(), typedArrayOooO0Oo, 14);
        this.f27442OooOoOO = OooO0OO.OooO0Oo(getContext(), typedArrayOooO0Oo, 10);
        this.f27449Oooo00o = typedArrayOooO0Oo.getInteger(11, 1);
        this.f27444OooOoo0 = typedArrayOooO0Oo.getDimensionPixelSize(13, 0);
        oo00 oo00Var = new oo00(this, Oooo000.OooO0O0(context2, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_Button).OooO00o());
        this.f27438OooOo0O = oo00Var;
        oo00Var.f15111OooO0OO = typedArrayOooO0Oo.getDimensionPixelOffset(1, 0);
        oo00Var.f15112OooO0Oo = typedArrayOooO0Oo.getDimensionPixelOffset(2, 0);
        oo00Var.f15114OooO0o0 = typedArrayOooO0Oo.getDimensionPixelOffset(3, 0);
        oo00Var.f15113OooO0o = typedArrayOooO0Oo.getDimensionPixelOffset(4, 0);
        if (typedArrayOooO0Oo.hasValue(8)) {
            int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(8, -1);
            oo00Var.f15115OooO0oO = dimensionPixelSize;
            OooOo oooOoOooO0o = oo00Var.f15110OooO0O0.OooO0o();
            oooOoOooO0o.OooO0OO(dimensionPixelSize);
            oo00Var.OooO0OO(oooOoOooO0o.OooO00o());
            oo00Var.f15122OooOOOo = true;
        }
        oo00Var.f15116OooO0oo = typedArrayOooO0Oo.getDimensionPixelSize(20, 0);
        oo00Var.f15108OooO = o0000oo.OooO0o0(typedArrayOooO0Oo.getInt(7, -1), mode);
        oo00Var.f15117OooOO0 = OooO0OO.OooO00o(getContext(), typedArrayOooO0Oo, 6);
        oo00Var.f15118OooOO0O = OooO0OO.OooO00o(getContext(), typedArrayOooO0Oo, 19);
        oo00Var.OooOO0o = OooO0OO.OooO00o(getContext(), typedArrayOooO0Oo, 16);
        oo00Var.f15124OooOOo0 = typedArrayOooO0Oo.getBoolean(5, false);
        oo00Var.f15126OooOo00 = typedArrayOooO0Oo.getDimensionPixelSize(9, 0);
        oo00Var.f15123OooOOo = typedArrayOooO0Oo.getBoolean(21, true);
        int paddingStart = ViewCompat.getPaddingStart(this);
        int paddingTop = getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayOooO0Oo.hasValue(0)) {
            oo00Var.f15121OooOOOO = true;
            setSupportBackgroundTintList(oo00Var.f15117OooOO0);
            setSupportBackgroundTintMode(oo00Var.f15108OooO);
        } else {
            oo00Var.OooO0o0();
        }
        ViewCompat.setPaddingRelative(this, paddingStart + oo00Var.f15111OooO0OO, paddingTop + oo00Var.f15114OooO0o0, paddingEnd + oo00Var.f15112OooO0Oo, paddingBottom + oo00Var.f15113OooO0o);
        typedArrayOooO0Oo.recycle();
        setCompoundDrawablePadding(this.f27446OooOooo);
        OooO0OO(this.f27442OooOoOO != null);
    }
}

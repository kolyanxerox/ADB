package com.google.android.material.card;

import Oooo0o0.OooO;
import Ooooo00.OooOo;
import Ooooooo.C0004b;
import Ooooooo.Oo0000;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.DrawableCompat;
import o000000.OooOOO0;
import o000000.Oooo000;
import o000000.o0Oo0oo;
import o0O0O00.OooO00o;
import o0ooOO0.o00000O0;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, o0Oo0oo {

    /* renamed from: OooOoO */
    public static final int[] f27461OooOoO = {R.attr.state_checkable};

    /* renamed from: OooOoOO */
    public static final int[] f27462OooOoOO = {R.attr.state_checked};

    /* renamed from: OooOoo0 */
    public static final int[] f27463OooOoo0 = {com.github.superadb.R.attr.state_dragged};

    /* renamed from: OooOo */
    public boolean f27464OooOo;

    /* renamed from: OooOo0O */
    public final C0004b f27465OooOo0O;

    /* renamed from: OooOo0o */
    public final boolean f27466OooOo0o;

    /* renamed from: OooOoO0 */
    public boolean f27467OooOoO0;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.github.superadb.R.attr.materialCardViewStyle);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f27465OooOo0O.f15132OooO0OO.getBounds());
        return rectF;
    }

    public final void OooO0o(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    public final void OooO0o0() {
        C0004b c0004b;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (c0004b = this.f27465OooOo0O).f15142OooOOOO) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        c0004b.f15142OooOOOO.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        c0004b.f15142OooOOOO.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f27465OooOo0O.f15132OooO0OO.f29048OooOo0O.f29030OooO0OO;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f27465OooOo0O.f15133OooO0Oo.f29048OooOo0O.f29030OooO0OO;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f27465OooOo0O.f15138OooOO0;
    }

    public int getCheckedIconGravity() {
        return this.f27465OooOo0O.f15136OooO0oO;
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f27465OooOo0O.f15135OooO0o0;
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f27465OooOo0O.f15134OooO0o;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f27465OooOo0O.OooOO0o;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f27465OooOo0O.f15131OooO0O0.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f27465OooOo0O.f15131OooO0O0.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f27465OooOo0O.f15131OooO0O0.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f27465OooOo0O.f15131OooO0O0.top;
    }

    @FloatRange(from = 0.0d, m4to = 1.0d)
    public float getProgress() {
        return this.f27465OooOo0O.f15132OooO0OO.f29048OooOo0O.f29027OooO;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f27465OooOo0O.f15132OooO0OO.OooO();
    }

    public ColorStateList getRippleColor() {
        return this.f27465OooOo0O.f15139OooOO0O;
    }

    @NonNull
    public Oooo000 getShapeAppearanceModel() {
        return this.f27465OooOo0O.f15141OooOOO0;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f27465OooOo0O.f15140OooOOO;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f27465OooOo0O.f15140OooOOO;
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f27465OooOo0O.f15137OooO0oo;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f27464OooOo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO.OooOo0(this, this.f27465OooOo0O.f15132OooO0OO);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        C0004b c0004b = this.f27465OooOo0O;
        if (c0004b != null && c0004b.f15146OooOOoo) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f27461OooOoO);
        }
        if (this.f27464OooOo) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f27462OooOoOO);
        }
        if (this.f27467OooOoO0) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f27463OooOoo0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f27464OooOo);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C0004b c0004b = this.f27465OooOo0O;
        accessibilityNodeInfo.setCheckable(c0004b != null && c0004b.f15146OooOOoo);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f27464OooOo);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f27465OooOo0O.OooO0o0(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f27466OooOo0o) {
            C0004b c0004b = this.f27465OooOo0O;
            if (!c0004b.f15144OooOOo) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c0004b.f15144OooOOo = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f27465OooOo0O.f15132OooO0OO.OooOOO0(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C0004b c0004b = this.f27465OooOo0O;
        c0004b.f15132OooO0OO.OooOO0o(c0004b.f15130OooO00o.getCardElevation());
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        OooOOO0 oooOOO0 = this.f27465OooOo0O.f15133OooO0Oo;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        oooOOO0.OooOOO0(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f27465OooOo0O.f15146OooOOoo = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f27464OooOo != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f27465OooOo0O.OooO0o(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C0004b c0004b = this.f27465OooOo0O;
        if (c0004b.f15136OooO0oO != i) {
            c0004b.f15136OooO0oO = i;
            MaterialCardView materialCardView = c0004b.f15130OooO00o;
            c0004b.OooO0o0(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(@Dimension int i) {
        this.f27465OooOo0O.f15135OooO0o0 = i;
    }

    public void setCheckedIconMarginResource(@DimenRes int i) {
        if (i != -1) {
            this.f27465OooOo0O.f15135OooO0o0 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        this.f27465OooOo0O.OooO0o(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setCheckedIconSize(@Dimension int i) {
        this.f27465OooOo0O.f15134OooO0o = i;
    }

    public void setCheckedIconSizeResource(@DimenRes int i) {
        if (i != 0) {
            this.f27465OooOo0O.f15134OooO0o = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        C0004b c0004b = this.f27465OooOo0O;
        c0004b.OooOO0o = colorStateList;
        Drawable drawable = c0004b.f15138OooOO0;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C0004b c0004b = this.f27465OooOo0O;
        if (c0004b != null) {
            Drawable drawable = c0004b.f15129OooO;
            MaterialCardView materialCardView = c0004b.f15130OooO00o;
            Drawable drawableOooO0OO = materialCardView.isClickable() ? c0004b.OooO0OO() : c0004b.f15133OooO0Oo;
            c0004b.f15129OooO = drawableOooO0OO;
            if (drawable != drawableOooO0OO) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableOooO0OO);
                } else {
                    materialCardView.setForeground(c0004b.OooO0Oo(drawableOooO0OO));
                }
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void setContentPadding(int i, int i2, int i3, int i4) {
        C0004b c0004b = this.f27465OooOo0O;
        c0004b.f15131OooO0O0.set(i, i2, i3, i4);
        c0004b.OooO();
    }

    public void setDragged(boolean z) {
        if (this.f27467OooOoO0 != z) {
            this.f27467OooOoO0 = z;
            refreshDrawableState();
            OooO0o0();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f27465OooOo0O.OooOO0();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        C0004b c0004b = this.f27465OooOo0O;
        c0004b.OooOO0();
        c0004b.OooO();
    }

    public void setProgress(@FloatRange(from = 0.0d, m4to = 1.0d) float f) {
        C0004b c0004b = this.f27465OooOo0O;
        c0004b.f15132OooO0OO.OooOOO(f);
        OooOOO0 oooOOO0 = c0004b.f15133OooO0Oo;
        if (oooOOO0 != null) {
            oooOOO0.OooOOO(f);
        }
        OooOOO0 oooOOO02 = c0004b.f15145OooOOo0;
        if (oooOOO02 != null) {
            oooOOO02.OooOOO(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    @Override // androidx.cardview.widget.CardView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setRadius(float r3) {
        /*
            r2 = this;
            super.setRadius(r3)
            Ooooooo.b r0 = r2.f27465OooOo0O
            o000000.Oooo000 r1 = r0.f15141OooOOO0
            o000000.OooOo r1 = r1.OooO0o()
            r1.OooO0OO(r3)
            o000000.Oooo000 r3 = r1.OooO00o()
            r0.OooO0oO(r3)
            android.graphics.drawable.Drawable r3 = r0.f15129OooO
            r3.invalidateSelf()
            boolean r3 = r0.OooO0oo()
            if (r3 != 0) goto L38
            com.google.android.material.card.MaterialCardView r3 = r0.f15130OooO00o
            boolean r3 = r3.getPreventCornerOverlap()
            if (r3 == 0) goto L3b
            o000000.OooOOO0 r3 = r0.f15132OooO0OO
            o000000.OooOO0O r1 = r3.f29048OooOo0O
            o000000.Oooo000 r1 = r1.f29028OooO00o
            android.graphics.RectF r3 = r3.OooO0oO()
            boolean r3 = r1.OooO0o0(r3)
            if (r3 != 0) goto L3b
        L38:
            r0.OooO()
        L3b:
            boolean r3 = r0.OooO0oo()
            if (r3 == 0) goto L44
            r0.OooOO0()
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.setRadius(float):void");
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        C0004b c0004b = this.f27465OooOo0O;
        c0004b.f15139OooOO0O = colorStateList;
        int[] iArr = OooO00o.f32822OooO00o;
        RippleDrawable rippleDrawable = c0004b.f15142OooOOOO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), i);
        C0004b c0004b = this.f27465OooOo0O;
        c0004b.f15139OooOO0O = colorStateList;
        int[] iArr = OooO00o.f32822OooO00o;
        RippleDrawable rippleDrawable = c0004b.f15142OooOOOO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // o000000.o0Oo0oo
    public void setShapeAppearanceModel(@NonNull Oooo000 oooo000) {
        setClipToOutline(oooo000.OooO0o0(getBoundsAsRectF()));
        this.f27465OooOo0O.OooO0oO(oooo000);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C0004b c0004b = this.f27465OooOo0O;
        if (c0004b.f15140OooOOO != colorStateList) {
            c0004b.f15140OooOOO = colorStateList;
            OooOOO0 oooOOO0 = c0004b.f15133OooO0Oo;
            oooOOO0.f29048OooOo0O.f29036OooOO0 = c0004b.f15137OooO0oo;
            oooOOO0.invalidateSelf();
            oooOOO0.OooOOo(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(@Dimension int i) {
        C0004b c0004b = this.f27465OooOo0O;
        if (i != c0004b.f15137OooO0oo) {
            c0004b.f15137OooO0oo = i;
            OooOOO0 oooOOO0 = c0004b.f15133OooO0Oo;
            ColorStateList colorStateList = c0004b.f15140OooOOO;
            oooOOO0.f29048OooOo0O.f29036OooOO0 = i;
            oooOOO0.invalidateSelf();
            oooOOO0.OooOOo(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        C0004b c0004b = this.f27465OooOo0O;
        c0004b.OooOO0();
        c0004b.OooO();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C0004b c0004b = this.f27465OooOo0O;
        if (c0004b != null && c0004b.f15146OooOOoo && isEnabled()) {
            this.f27464OooOo = !this.f27464OooOo;
            refreshDrawableState();
            OooO0o0();
            boolean z = this.f27464OooOo;
            Drawable drawable = c0004b.f15138OooOO0;
            if (drawable != null) {
                drawable.setAlpha(z ? 255 : 0);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.f27464OooOo = false;
        this.f27467OooOoO0 = false;
        this.f27466OooOo0o = true;
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(getContext(), attributeSet, OooOo.f14975OooOoo, i, com.github.superadb.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C0004b c0004b = new C0004b(this, attributeSet, i);
        this.f27465OooOo0O = c0004b;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        OooOOO0 oooOOO0 = c0004b.f15132OooO0OO;
        oooOOO0.OooOOO0(cardBackgroundColor);
        c0004b.f15131OooO0O0.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c0004b.OooO();
        MaterialCardView materialCardView = c0004b.f15130OooO00o;
        ColorStateList colorStateListOooO00o = OooO0OO.OooO00o(materialCardView.getContext(), typedArrayOooO0Oo, 11);
        c0004b.f15140OooOOO = colorStateListOooO00o;
        if (colorStateListOooO00o == null) {
            c0004b.f15140OooOOO = ColorStateList.valueOf(-1);
        }
        c0004b.f15137OooO0oo = typedArrayOooO0Oo.getDimensionPixelSize(12, 0);
        boolean z = typedArrayOooO0Oo.getBoolean(0, false);
        c0004b.f15146OooOOoo = z;
        materialCardView.setLongClickable(z);
        c0004b.OooOO0o = OooO0OO.OooO00o(materialCardView.getContext(), typedArrayOooO0Oo, 6);
        c0004b.OooO0o(OooO0OO.OooO0Oo(materialCardView.getContext(), typedArrayOooO0Oo, 2));
        c0004b.f15134OooO0o = typedArrayOooO0Oo.getDimensionPixelSize(5, 0);
        c0004b.f15135OooO0o0 = typedArrayOooO0Oo.getDimensionPixelSize(4, 0);
        c0004b.f15136OooO0oO = typedArrayOooO0Oo.getInteger(3, 8388661);
        ColorStateList colorStateListOooO00o2 = OooO0OO.OooO00o(materialCardView.getContext(), typedArrayOooO0Oo, 7);
        c0004b.f15139OooOO0O = colorStateListOooO00o2;
        if (colorStateListOooO00o2 == null) {
            c0004b.f15139OooOO0O = ColorStateList.valueOf(OooO00o.OooO00o.OooOO0o(materialCardView, com.github.superadb.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListOooO00o3 = OooO0OO.OooO00o(materialCardView.getContext(), typedArrayOooO0Oo, 1);
        OooOOO0 oooOOO02 = c0004b.f15133OooO0Oo;
        oooOOO02.OooOOO0(colorStateListOooO00o3 == null ? ColorStateList.valueOf(0) : colorStateListOooO00o3);
        int[] iArr = OooO00o.f32822OooO00o;
        RippleDrawable rippleDrawable = c0004b.f15142OooOOOO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c0004b.f15139OooOO0O);
        }
        oooOOO0.OooOO0o(materialCardView.getCardElevation());
        float f = c0004b.f15137OooO0oo;
        ColorStateList colorStateList = c0004b.f15140OooOOO;
        oooOOO02.f29048OooOo0O.f29036OooOO0 = f;
        oooOOO02.invalidateSelf();
        oooOOO02.OooOOo(colorStateList);
        materialCardView.setBackgroundInternal(c0004b.OooO0Oo(oooOOO0));
        Drawable drawableOooO0OO = materialCardView.isClickable() ? c0004b.OooO0OO() : oooOOO02;
        c0004b.f15129OooO = drawableOooO0OO;
        materialCardView.setForeground(c0004b.OooO0Oo(drawableOooO0OO));
        typedArrayOooO0Oo.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i) {
        this.f27465OooOo0O.f15132OooO0OO.OooOOO0(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(@ColorInt int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(@Nullable Oo0000 oo0000) {
    }
}

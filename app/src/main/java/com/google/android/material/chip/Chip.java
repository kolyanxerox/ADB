package com.google.android.material.chip;

import Oooo0o0.OooO;
import Ooooo00.OooOo;
import Ooooo0o.o00OO00O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o000000.Oooo000;
import o000000.o0Oo0oo;
import o0O0O00.OooO00o;
import o0ooOO0.OooOOO;
import o0ooOO0.OooOOO0;
import o0ooOO0.o000000;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;
import o0ooOO0.o0O0O00;
import oo0o0Oo.OooO0OO;
import oo0o0Oo.OooOO0;
import ooOO.o00O0O;
import ooOO.o00Oo0;
import ooOO.o00Ooo;
import ooOO.o0OoOo0;

/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements o00Oo0, o0Oo0oo, OooOOO {

    /* renamed from: OooOo */
    public RippleDrawable f27495OooOo;

    /* renamed from: OooOo0O */
    public o00Ooo f27496OooOo0O;

    /* renamed from: OooOo0o */
    public InsetDrawable f27497OooOo0o;

    /* renamed from: OooOoO */
    public CompoundButton.OnCheckedChangeListener f27498OooOoO;

    /* renamed from: OooOoO0 */
    public View.OnClickListener f27499OooOoO0;

    /* renamed from: OooOoOO */
    public OooOOO0 f27500OooOoOO;

    /* renamed from: OooOoo */
    public boolean f27501OooOoo;

    /* renamed from: OooOoo0 */
    public boolean f27502OooOoo0;

    /* renamed from: OooOooO */
    public boolean f27503OooOooO;

    /* renamed from: OooOooo */
    public boolean f27504OooOooo;

    /* renamed from: Oooo0 */
    public CharSequence f27505Oooo0;

    /* renamed from: Oooo000 */
    public boolean f27506Oooo000;

    /* renamed from: Oooo00O */
    public int f27507Oooo00O;

    /* renamed from: Oooo00o */
    public int f27508Oooo00o;

    /* renamed from: Oooo0O0 */
    public final o00O0O f27509Oooo0O0;

    /* renamed from: Oooo0OO */
    public boolean f27510Oooo0OO;

    /* renamed from: Oooo0o */
    public final RectF f27511Oooo0o;

    /* renamed from: Oooo0o0 */
    public final Rect f27512Oooo0o0;

    /* renamed from: Oooo0oO */
    public final o0O0O00 f27513Oooo0oO;

    /* renamed from: Oooo0oo */
    public static final Rect f27493Oooo0oo = new Rect();

    /* renamed from: Oooo */
    public static final int[] f27492Oooo = {R.attr.state_selected};

    /* renamed from: OoooO00 */
    public static final int[] f27494OoooO00 = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.github.superadb.R.attr.chipStyle);
    }

    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f27511Oooo0o;
        rectF.setEmpty();
        if (OooO0Oo() && this.f27499OooOoO0 != null) {
            o00Ooo o00ooo2 = this.f27496OooOo0O;
            Rect bounds = o00ooo2.getBounds();
            rectF.setEmpty();
            if (o00ooo2.OoooOoo()) {
                float f = o00ooo2.f33283o0Oo0oo + o00ooo2.f33282o0OOO0o + o00ooo2.f33248Ooooooo + o00ooo2.o0ooOoO + o00ooo2.o0ooOOo;
                if (DrawableCompat.getLayoutDirection(o00ooo2) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f27512Oooo0o0;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    @Nullable
    private OooOO0 getTextAppearance() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33253o000000o.f33092OooO0o;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f27503OooOooO != z) {
            this.f27503OooOooO = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f27501OooOoo != z) {
            this.f27501OooOoo = z;
            refreshDrawableState();
        }
    }

    public final void OooO0OO(int i) {
        this.f27508Oooo00o = i;
        if (!this.f27506Oooo000) {
            InsetDrawable insetDrawable = this.f27497OooOo0o;
            if (insetDrawable == null) {
                int[] iArr = OooO00o.f32822OooO00o;
                OooO0o();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f27497OooOo0o = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = OooO00o.f32822OooO00o;
                    OooO0o();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f27496OooOo0O.f33234OoooOO0));
        int iMax2 = Math.max(0, i - this.f27496OooOo0O.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f27497OooOo0o;
            if (insetDrawable2 == null) {
                int[] iArr3 = OooO00o.f32822OooO00o;
                OooO0o();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f27497OooOo0o = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = OooO00o.f32822OooO00o;
                    OooO0o();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f27497OooOo0o != null) {
            Rect rect = new Rect();
            this.f27497OooOo0o.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = OooO00o.f32822OooO00o;
                OooO0o();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f27497OooOo0o = new InsetDrawable((Drawable) this.f27496OooOo0O, i2, i3, i2, i3);
        int[] iArr6 = OooO00o.f32822OooO00o;
        OooO0o();
    }

    public final boolean OooO0Oo() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null) {
            return false;
        }
        Drawable drawable = o00ooo2.f33246Oooooo0;
        return (drawable != null ? DrawableCompat.unwrap(drawable) : null) != null;
    }

    public final void OooO0o() {
        this.f27495OooOo = new RippleDrawable(OooO00o.OooO0OO(this.f27496OooOo0O.f33237OoooOo0), getBackgroundDrawable(), null);
        this.f27496OooOo0O.getClass();
        ViewCompat.setBackground(this, this.f27495OooOo);
        OooO0oO();
    }

    public final void OooO0o0() {
        o00Ooo o00ooo2;
        if (!OooO0Oo() || (o00ooo2 = this.f27496OooOo0O) == null || !o00ooo2.f33244OooooOo || this.f27499OooOoO0 == null) {
            ViewCompat.setAccessibilityDelegate(this, null);
            this.f27510Oooo0OO = false;
        } else {
            ViewCompat.setAccessibilityDelegate(this, this.f27509Oooo0O0);
            this.f27510Oooo0OO = true;
        }
    }

    public final void OooO0oO() {
        o00Ooo o00ooo2;
        if (TextUtils.isEmpty(getText()) || (o00ooo2 = this.f27496OooOo0O) == null) {
            return;
        }
        int iOooOoO0 = (int) (o00ooo2.OooOoO0() + o00ooo2.f33283o0Oo0oo + o00ooo2.o0ooOOo);
        o00Ooo o00ooo3 = this.f27496OooOo0O;
        int iOooOo = (int) (o00ooo3.OooOo() + o00ooo3.f33286oo000o + o00ooo3.f33285o0ooOO0);
        if (this.f27497OooOo0o != null) {
            Rect rect = new Rect();
            this.f27497OooOo0o.getPadding(rect);
            iOooOo += rect.left;
            iOooOoO0 += rect.right;
        }
        ViewCompat.setPaddingRelative(this, iOooOo, getPaddingTop(), iOooOoO0, getPaddingBottom());
    }

    public final void OooO0oo() {
        TextPaint paint = getPaint();
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            paint.drawableState = o00ooo2.getState();
        }
        OooOO0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.OooO0Oo(getContext(), paint, this.f27513Oooo0oO);
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f27510Oooo0OO ? super.dispatchHoverEvent(motionEvent) : this.f27509Oooo0O0.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f27510Oooo0OO) {
            return super.dispatchKeyEvent(keyEvent);
        }
        o00O0O o00o0o = this.f27509Oooo0O0;
        if (!o00o0o.dispatchKeyEvent(keyEvent) || o00o0o.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        boolean zOooOooO = false;
        if (o00ooo2 != null && o00Ooo.OooOoo0(o00ooo2.f33246Oooooo0)) {
            o00Ooo o00ooo3 = this.f27496OooOo0O;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f27504OooOooo) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f27503OooOooO) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f27501OooOoo) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f27504OooOooo) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f27503OooOooO) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f27501OooOoo) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(o00ooo3.f33262o0000O0, iArr)) {
                o00ooo3.f33262o0000O0 = iArr;
                if (o00ooo3.OoooOoo()) {
                    zOooOooO = o00ooo3.OooOooO(o00ooo3.getState(), iArr);
                }
            }
        }
        if (zOooOooO) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f27505Oooo0)) {
            return this.f27505Oooo0;
        }
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (!(o00ooo2 != null && o00ooo2.f33288ooOO)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f27516OooOoo.f33010OooO0Oo) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f27497OooOo0o;
        return insetDrawable == null ? this.f27496OooOo0O : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33274o00Oo0;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33275o00Ooo;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33232OoooO;
        }
        return null;
    }

    public float getChipCornerRadius() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return Math.max(0.0f, o00ooo2.OooOoO());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f27496OooOo0O;
    }

    public float getChipEndPadding() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33283o0Oo0oo;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || (drawable = o00ooo2.f33240Ooooo00) == null) {
            return null;
        }
        return DrawableCompat.unwrap(drawable);
    }

    public float getChipIconSize() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33242OooooO0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33241Ooooo0o;
        }
        return null;
    }

    public float getChipMinHeight() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33234OoooOO0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33286oo000o;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33235OoooOOO;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33236OoooOOo;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || (drawable = o00ooo2.f33246Oooooo0) == null) {
            return null;
        }
        return DrawableCompat.unwrap(drawable);
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33284o0OoOo0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33282o0OOO0o;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33248Ooooooo;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.o0ooOoO;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33247OoooooO;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33261o0000O;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f27510Oooo0OO) {
            o00O0O o00o0o = this.f27509Oooo0O0;
            if (o00o0o.getKeyboardFocusedVirtualViewId() == 1 || o00o0o.getAccessibilityFocusedVirtualViewId() == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public o00OO00O getHideMotionSpec() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33279o00ooo;
        }
        return null;
    }

    public float getIconEndPadding() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33277o00oO0O;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33278o00oO0o;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33237OoooOo0;
        }
        return null;
    }

    @NonNull
    public Oooo000 getShapeAppearanceModel() {
        return this.f27496OooOo0O.f29048OooOo0O.f29028OooO00o;
    }

    @Nullable
    public o00OO00O getShowMotionSpec() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33276o00o0O;
        }
        return null;
    }

    public float getTextEndPadding() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.o0ooOOo;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            return o00ooo2.f33285o0ooOO0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO.OooOo0(this, this.f27496OooOo0O);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f27492Oooo);
        }
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null && o00ooo2.f33288ooOO) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f27494OoooO00);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f27510Oooo0OO) {
            this.f27509Oooo0O0.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(o00ooo2 != null && o00ooo2.f33288ooOO);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            if (chipGroup.f27677OooOo) {
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(com.github.superadb.R.id.row_index_key);
            accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f27507Oooo00O != i) {
            this.f27507Oooo00O = i;
            OooO0oO();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x001e, code lost:
    
        if (r0 != 3) goto L63;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f27501OooOoo
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f27501OooOoo
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f27499OooOoO0
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f27510Oooo0OO
            if (r0 == 0) goto L43
            ooOO.o00O0O r0 = r5.f27509Oooo0O0
            r0.sendEventForVirtualView(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f27505Oooo0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f27495OooOo) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f27495OooOo) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OooOooo(z);
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OooOooo(o00ooo2.f33281o0OO00O.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null) {
            this.f27502OooOoo0 = z;
        } else if (o00ooo2.f33288ooOO) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo000(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo000(AppCompatResources.getDrawable(o00ooo2.f33281o0OO00O, i));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo00O(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo00O(AppCompatResources.getColorStateList(o00ooo2.f33281o0OO00O, i));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo00o(o00ooo2.f33281o0OO00O.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || o00ooo2.f33232OoooO == colorStateList) {
            return;
        }
        o00ooo2.f33232OoooO = colorStateList;
        o00ooo2.onStateChange(o00ooo2.getState());
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        ColorStateList colorStateList;
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || o00ooo2.f33232OoooO == (colorStateList = AppCompatResources.getColorStateList(o00ooo2.f33281o0OO00O, i))) {
            return;
        }
        o00ooo2.f33232OoooO = colorStateList;
        o00ooo2.onStateChange(o00ooo2.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0(o00ooo2.f33281o0OO00O.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull o00Ooo o00ooo2) {
        o00Ooo o00ooo3 = this.f27496OooOo0O;
        if (o00ooo3 != o00ooo2) {
            if (o00ooo3 != null) {
                o00ooo3.f33271o000OO = new WeakReference(null);
            }
            this.f27496OooOo0O = o00ooo2;
            o00ooo2.f33266o0000OO0 = false;
            o00ooo2.f33271o000OO = new WeakReference(this);
            OooO0OO(this.f27508Oooo00o);
        }
    }

    public void setChipEndPadding(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || o00ooo2.f33283o0Oo0oo == f) {
            return;
        }
        o00ooo2.f33283o0Oo0oo = f;
        o00ooo2.invalidateSelf();
        o00ooo2.OooOoo();
    }

    public void setChipEndPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            float dimension = o00ooo2.f33281o0OO00O.getResources().getDimension(i);
            if (o00ooo2.f33283o0Oo0oo != dimension) {
                o00ooo2.f33283o0Oo0oo = dimension;
                o00ooo2.invalidateSelf();
                o00ooo2.OooOoo();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0O0(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@DrawableRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0O0(AppCompatResources.getDrawable(o00ooo2.f33281o0OO00O, i));
        }
    }

    public void setChipIconSize(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0OO(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0OO(o00ooo2.f33281o0OO00O.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0o0(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0o0(AppCompatResources.getColorStateList(o00ooo2.f33281o0OO00O, i));
        }
    }

    public void setChipIconVisible(@BoolRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0o(o00ooo2.f33281o0OO00O.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || o00ooo2.f33234OoooOO0 == f) {
            return;
        }
        o00ooo2.f33234OoooOO0 = f;
        o00ooo2.invalidateSelf();
        o00ooo2.OooOoo();
    }

    public void setChipMinHeightResource(@DimenRes int i) throws Resources.NotFoundException {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            float dimension = o00ooo2.f33281o0OO00O.getResources().getDimension(i);
            if (o00ooo2.f33234OoooOO0 != dimension) {
                o00ooo2.f33234OoooOO0 = dimension;
                o00ooo2.invalidateSelf();
                o00ooo2.OooOoo();
            }
        }
    }

    public void setChipStartPadding(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || o00ooo2.f33286oo000o == f) {
            return;
        }
        o00ooo2.f33286oo000o = f;
        o00ooo2.invalidateSelf();
        o00ooo2.OooOoo();
    }

    public void setChipStartPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            float dimension = o00ooo2.f33281o0OO00O.getResources().getDimension(i);
            if (o00ooo2.f33286oo000o != dimension) {
                o00ooo2.f33286oo000o = dimension;
                o00ooo2.invalidateSelf();
                o00ooo2.OooOoo();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0oO(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0oO(AppCompatResources.getColorStateList(o00ooo2.f33281o0OO00O, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0oo(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0oo(o00ooo2.f33281o0OO00O.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo(drawable);
        }
        OooO0o0();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || o00ooo2.f33284o0OoOo0 == charSequence) {
            return;
        }
        o00ooo2.f33284o0OoOo0 = BidiFormatter.getInstance().unicodeWrap(charSequence);
        o00ooo2.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooO00(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooO00(o00ooo2.f33281o0OO00O.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(@DrawableRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo(AppCompatResources.getDrawable(o00ooo2.f33281o0OO00O, i));
        }
        OooO0o0();
    }

    public void setCloseIconSize(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooO0(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooO0(o00ooo2.f33281o0OO00O.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooO0O(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooO0O(o00ooo2.f33281o0OO00O.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooO(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooO(AppCompatResources.getColorStateList(o00ooo2.f33281o0OO00O, i));
        }
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OooOO0o(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f27496OooOo0O == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.f33261o0000O = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f27506Oooo000 = z;
        OooO0OO(this.f27508Oooo00o);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@Nullable o00OO00O o00oo00o) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.f33279o00ooo = o00oo00o;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.f33279o00ooo = o00OO00O.OooO0O0(o00ooo2.f33281o0OO00O, i);
        }
    }

    public void setIconEndPadding(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.o000oOoO(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.o000oOoO(o00ooo2.f33281o0OO00O.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooOOO(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooOOO(o00ooo2.f33281o0OO00O.getResources().getDimension(i));
        }
    }

    @Override // o0ooOO0.OooOOO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable OooOOO0 oooOOO0) {
        this.f27500OooOoOO = oooOOO0;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f27496OooOo0O == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i) {
        super.setMaxWidth(i);
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.f33265o0000OO = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f27498OooOoO = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f27499OooOoO0 = onClickListener;
        OooO0o0();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooOOo(colorStateList);
        }
        this.f27496OooOo0O.getClass();
        OooO0o();
    }

    public void setRippleColorResource(@ColorRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooOOo(AppCompatResources.getColorStateList(o00ooo2.f33281o0OO00O, i));
            this.f27496OooOo0O.getClass();
            OooO0o();
        }
    }

    @Override // o000000.o0Oo0oo
    public void setShapeAppearanceModel(@NonNull Oooo000 oooo000) {
        this.f27496OooOo0O.setShapeAppearanceModel(oooo000);
    }

    public void setShowMotionSpec(@Nullable o00OO00O o00oo00o) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.f33276o00o0O = o00oo00o;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.f33276o00o0O = o00OO00O.OooO0O0(o00ooo2.f33281o0OO00O, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(o00ooo2.f33266o0000OO0 ? null : charSequence, bufferType);
        o00Ooo o00ooo3 = this.f27496OooOo0O;
        if (o00ooo3 == null || TextUtils.equals(o00ooo3.f33238OoooOoO, charSequence)) {
            return;
        }
        o00ooo3.f33238OoooOoO = charSequence;
        o00ooo3.f33253o000000o.f33091OooO0Oo = true;
        o00ooo3.invalidateSelf();
        o00ooo3.OooOoo();
    }

    public void setTextAppearance(@Nullable OooOO0 oooOO0) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.f33253o000000o.OooO0O0(oooOO0, o00ooo2.f33281o0OO00O);
        }
        OooO0oo();
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || o00ooo2.o0ooOOo == f) {
            return;
        }
        o00ooo2.o0ooOOo = f;
        o00ooo2.invalidateSelf();
        o00ooo2.OooOoo();
    }

    public void setTextEndPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            float dimension = o00ooo2.f33281o0OO00O.getResources().getDimension(i);
            if (o00ooo2.o0ooOOo != dimension) {
                o00ooo2.o0ooOOo = dimension;
                o00ooo2.invalidateSelf();
                o00ooo2.OooOoo();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            o000000 o000000Var = o00ooo2.f33253o000000o;
            OooOO0 oooOO0 = o000000Var.f33092OooO0o;
            if (oooOO0 != null) {
                oooOO0.f33225OooOO0O = fApplyDimension;
                o000000Var.f33088OooO00o.setTextSize(fApplyDimension);
                o00ooo2.OooO00o();
            }
        }
        OooO0oo();
    }

    public void setTextStartPadding(float f) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 == null || o00ooo2.f33285o0ooOO0 == f) {
            return;
        }
        o00ooo2.f33285o0ooOO0 = f;
        o00ooo2.invalidateSelf();
        o00ooo2.OooOoo();
    }

    public void setTextStartPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            float dimension = o00ooo2.f33281o0OO00O.getResources().getDimension(i);
            if (o00ooo2.f33285o0ooOO0 != dimension) {
                o00ooo2.f33285o0ooOO0 = dimension;
                o00ooo2.invalidateSelf();
                o00ooo2.OooOoo();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i);
        this.f27512Oooo0o0 = new Rect();
        this.f27511Oooo0o = new RectF();
        this.f27513Oooo0oO = new o0O0O00(this, 1);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        o00Ooo o00ooo2 = new o00Ooo(context2, attributeSet, i);
        int[] iArr = OooOo.f14950OooO;
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(o00ooo2.f33281o0OO00O, attributeSet, iArr, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        o00ooo2.f33267o0000OOO = typedArrayOooO0Oo.hasValue(37);
        Context context3 = o00ooo2.f33281o0OO00O;
        ColorStateList colorStateListOooO00o = OooO0OO.OooO00o(context3, typedArrayOooO0Oo, 24);
        if (o00ooo2.f33233OoooO0O != colorStateListOooO00o) {
            o00ooo2.f33233OoooO0O = colorStateListOooO00o;
            o00ooo2.onStateChange(o00ooo2.getState());
        }
        ColorStateList colorStateListOooO00o2 = OooO0OO.OooO00o(context3, typedArrayOooO0Oo, 11);
        if (o00ooo2.f33232OoooO != colorStateListOooO00o2) {
            o00ooo2.f33232OoooO = colorStateListOooO00o2;
            o00ooo2.onStateChange(o00ooo2.getState());
        }
        float dimension = typedArrayOooO0Oo.getDimension(19, 0.0f);
        if (o00ooo2.f33234OoooOO0 != dimension) {
            o00ooo2.f33234OoooOO0 = dimension;
            o00ooo2.invalidateSelf();
            o00ooo2.OooOoo();
        }
        if (typedArrayOooO0Oo.hasValue(12)) {
            o00ooo2.Oooo0(typedArrayOooO0Oo.getDimension(12, 0.0f));
        }
        o00ooo2.Oooo0oO(OooO0OO.OooO00o(context3, typedArrayOooO0Oo, 22));
        o00ooo2.Oooo0oo(typedArrayOooO0Oo.getDimension(23, 0.0f));
        o00ooo2.OoooOOo(OooO0OO.OooO00o(context3, typedArrayOooO0Oo, 36));
        String text = typedArrayOooO0Oo.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(o00ooo2.f33238OoooOoO, text);
        o000000 o000000Var = o00ooo2.f33253o000000o;
        if (!zEquals) {
            o00ooo2.f33238OoooOoO = text;
            o000000Var.f33091OooO0Oo = true;
            o00ooo2.invalidateSelf();
            o00ooo2.OooOoo();
        }
        OooOO0 oooOO0 = (!typedArrayOooO0Oo.hasValue(0) || (resourceId = typedArrayOooO0Oo.getResourceId(0, 0)) == 0) ? null : new OooOO0(context3, resourceId);
        oooOO0.f33225OooOO0O = typedArrayOooO0Oo.getDimension(1, oooOO0.f33225OooOO0O);
        o000000Var.OooO0O0(oooOO0, context3);
        int i2 = typedArrayOooO0Oo.getInt(3, 0);
        if (i2 == 1) {
            o00ooo2.f33261o0000O = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            o00ooo2.f33261o0000O = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            o00ooo2.f33261o0000O = TextUtils.TruncateAt.END;
        }
        o00ooo2.Oooo0o(typedArrayOooO0Oo.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            o00ooo2.Oooo0o(typedArrayOooO0Oo.getBoolean(15, false));
        }
        o00ooo2.Oooo0O0(OooO0OO.OooO0Oo(context3, typedArrayOooO0Oo, 14));
        if (typedArrayOooO0Oo.hasValue(17)) {
            o00ooo2.Oooo0o0(OooO0OO.OooO00o(context3, typedArrayOooO0Oo, 17));
        }
        o00ooo2.Oooo0OO(typedArrayOooO0Oo.getDimension(16, -1.0f));
        o00ooo2.OoooOO0(typedArrayOooO0Oo.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            o00ooo2.OoooOO0(typedArrayOooO0Oo.getBoolean(26, false));
        }
        o00ooo2.Oooo(OooO0OO.OooO0Oo(context3, typedArrayOooO0Oo, 25));
        o00ooo2.OoooO(OooO0OO.OooO00o(context3, typedArrayOooO0Oo, 30));
        o00ooo2.OoooO0(typedArrayOooO0Oo.getDimension(28, 0.0f));
        o00ooo2.OooOooo(typedArrayOooO0Oo.getBoolean(6, false));
        o00ooo2.Oooo00o(typedArrayOooO0Oo.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            o00ooo2.Oooo00o(typedArrayOooO0Oo.getBoolean(8, false));
        }
        o00ooo2.Oooo000(OooO0OO.OooO0Oo(context3, typedArrayOooO0Oo, 7));
        if (typedArrayOooO0Oo.hasValue(9)) {
            o00ooo2.Oooo00O(OooO0OO.OooO00o(context3, typedArrayOooO0Oo, 9));
        }
        o00ooo2.f33276o00o0O = o00OO00O.OooO00o(context3, typedArrayOooO0Oo, 39);
        o00ooo2.f33279o00ooo = o00OO00O.OooO00o(context3, typedArrayOooO0Oo, 33);
        float dimension2 = typedArrayOooO0Oo.getDimension(21, 0.0f);
        if (o00ooo2.f33286oo000o != dimension2) {
            o00ooo2.f33286oo000o = dimension2;
            o00ooo2.invalidateSelf();
            o00ooo2.OooOoo();
        }
        o00ooo2.OoooOOO(typedArrayOooO0Oo.getDimension(35, 0.0f));
        o00ooo2.o000oOoO(typedArrayOooO0Oo.getDimension(34, 0.0f));
        float dimension3 = typedArrayOooO0Oo.getDimension(41, 0.0f);
        if (o00ooo2.f33285o0ooOO0 != dimension3) {
            o00ooo2.f33285o0ooOO0 = dimension3;
            o00ooo2.invalidateSelf();
            o00ooo2.OooOoo();
        }
        float dimension4 = typedArrayOooO0Oo.getDimension(40, 0.0f);
        if (o00ooo2.o0ooOOo != dimension4) {
            o00ooo2.o0ooOOo = dimension4;
            o00ooo2.invalidateSelf();
            o00ooo2.OooOoo();
        }
        o00ooo2.OoooO0O(typedArrayOooO0Oo.getDimension(29, 0.0f));
        o00ooo2.OoooO00(typedArrayOooO0Oo.getDimension(27, 0.0f));
        float dimension5 = typedArrayOooO0Oo.getDimension(13, 0.0f);
        if (o00ooo2.f33283o0Oo0oo != dimension5) {
            o00ooo2.f33283o0Oo0oo = dimension5;
            o00ooo2.invalidateSelf();
            o00ooo2.OooOoo();
        }
        o00ooo2.f33265o0000OO = typedArrayOooO0Oo.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayOooO0Oo.recycle();
        o00000O0.OooO00o(context2, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action);
        o00000O0.OooO0O0(context2, attributeSet, iArr, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action);
        this.f27506Oooo000 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f27508Oooo00o = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(o0000oo.OooO0O0(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(o00ooo2);
        o00ooo2.OooOO0o(ViewCompat.getElevation(this));
        o00000O0.OooO00o(context2, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action);
        o00000O0.OooO0O0(context2, attributeSet, iArr, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f27509Oooo0O0 = new o00O0O(this, this);
        OooO0o0();
        if (!zHasValue) {
            setOutlineProvider(new o0OoOo0(this));
        }
        setChecked(this.f27502OooOoo0);
        setText(o00ooo2.f33238OoooOoO);
        setEllipsize(o00ooo2.f33261o0000O);
        OooO0oo();
        if (!this.f27496OooOo0O.f33266o0000OO0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        OooO0oO();
        if (this.f27506Oooo000) {
            setMinHeight(this.f27508Oooo00o);
        }
        this.f27507Oooo00O = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ooOO.o000oOoO
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip chip = this.f33228OooO00o;
                OooOOO0 oooOOO0 = chip.f27500OooOoOO;
                if (oooOOO0 != null) {
                    o0ooOO0.OooO0OO oooO0OO = (o0ooOO0.OooO0OO) ((o000Ooo.o00oO0o) oooOOO0).f30487OooOo0o;
                    if (!z ? oooO0OO.OooO0o0(chip, oooO0OO.f33011OooO0o0) : oooO0OO.OooO00o(chip)) {
                        oooO0OO.OooO0Oo();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f27498OooOoO;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    public void setCloseIconVisible(boolean z) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.OoooOO0(z);
        }
        OooO0o0();
    }

    public void setCheckedIconVisible(boolean z) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo00o(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            o00ooo2.Oooo0o(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            Context context2 = o00ooo2.f33281o0OO00O;
            o00ooo2.f33253o000000o.OooO0O0(new OooOO0(context2, i), context2);
        }
        OooO0oo();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        o00Ooo o00ooo2 = this.f27496OooOo0O;
        if (o00ooo2 != null) {
            Context context = o00ooo2.f33281o0OO00O;
            o00ooo2.f33253o000000o.OooO0O0(new OooOO0(context, i), context);
        }
        OooO0oo();
    }
}

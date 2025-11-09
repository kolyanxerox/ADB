package com.google.android.material.checkbox;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.github.superadb.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o000oo00.o00oO0o;
import o00o0O.o0ooOOo;
import o0OoOo0.OooO00o;
import o0OoOo0.OooO0O0;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: OooOo, reason: collision with root package name */
    public ColorStateList f27472OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final LinkedHashSet f27473OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final LinkedHashSet f27474OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f27475OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f27476OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public boolean f27477OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public Drawable f27478OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public CharSequence f27479OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public Drawable f27480OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public boolean f27481OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public int f27482Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public ColorStateList f27483Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public ColorStateList f27484Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public PorterDuff.Mode f27485Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public int[] f27486Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f27487Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f27488Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public CharSequence f27489Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public final AnimatedVectorDrawableCompat f27490Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO00o f27491Oooo0oo;

    /* renamed from: Oooo, reason: collision with root package name */
    public static final int[] f27468Oooo = {R.attr.state_indeterminate};

    /* renamed from: OoooO00, reason: collision with root package name */
    public static final int[] f27470OoooO00 = {R.attr.state_error};

    /* renamed from: OoooO0, reason: collision with root package name */
    public static final int[][] f27469OoooO0 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: OoooO0O, reason: collision with root package name */
    public static final int f27471OoooO0O = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i = this.f27482Oooo0;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f27472OooOo == null) {
            int iOooOO0o = OooO00o.OooO00o.OooOO0o(this, R.attr.colorControlActivated);
            int iOooOO0o2 = OooO00o.OooO00o.OooOO0o(this, R.attr.colorError);
            int iOooOO0o3 = OooO00o.OooO00o.OooOO0o(this, R.attr.colorSurface);
            int iOooOO0o4 = OooO00o.OooO00o.OooOO0o(this, R.attr.colorOnSurface);
            this.f27472OooOo = new ColorStateList(f27469OoooO0, new int[]{OooO00o.OooO00o.OooOOo(1.0f, iOooOO0o3, iOooOO0o2), OooO00o.OooO00o.OooOOo(1.0f, iOooOO0o3, iOooOO0o), OooO00o.OooO00o.OooOOo(0.54f, iOooOO0o3, iOooOO0o4), OooO00o.OooO00o.OooOOo(0.38f, iOooOO0o3, iOooOO0o4), OooO00o.OooO00o.OooOOo(0.38f, iOooOO0o3, iOooOO0o4)});
        }
        return this.f27472OooOo;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f27483Oooo000;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void OooO00o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.f27478OooOoo = o0ooOOo.OooO0O0(this.f27478OooOoo, this.f27483Oooo000, CompoundButtonCompat.getButtonTintMode(this));
        this.f27480OooOooO = o0ooOOo.OooO0O0(this.f27480OooOooO, this.f27484Oooo00O, this.f27485Oooo00o);
        if (this.f27481OooOooo) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f27490Oooo0oO;
            if (animatedVectorDrawableCompat != null) {
                OooO00o oooO00o = this.f27491Oooo0oo;
                animatedVectorDrawableCompat.unregisterAnimationCallback(oooO00o);
                animatedVectorDrawableCompat.registerAnimationCallback(oooO00o);
            }
            Drawable drawable = this.f27478OooOoo;
            if ((drawable instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.f27478OooOoo).addTransition(R.id.indeterminate, R.id.unchecked, animatedVectorDrawableCompat, false);
            }
        }
        Drawable drawable2 = this.f27478OooOoo;
        if (drawable2 != null && (colorStateList2 = this.f27483Oooo000) != null) {
            DrawableCompat.setTintList(drawable2, colorStateList2);
        }
        Drawable drawable3 = this.f27480OooOooO;
        if (drawable3 != null && (colorStateList = this.f27484Oooo00O) != null) {
            DrawableCompat.setTintList(drawable3, colorStateList);
        }
        super.setButtonDrawable(o0ooOOo.OooO00o(this.f27478OooOoo, this.f27480OooOooO));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f27478OooOoo;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f27480OooOooO;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f27484Oooo00O;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f27485Oooo00o;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f27483Oooo000;
    }

    public int getCheckedState() {
        return this.f27482Oooo0;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f27479OooOoo0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f27482Oooo0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27476OooOoO0 && this.f27483Oooo000 == null && this.f27484Oooo00O == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f27468Oooo);
        }
        if (this.f27477OooOoOO) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f27470OoooO00);
        }
        this.f27486Oooo0O0 = o0ooOOo.OooO0OO(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f27475OooOoO || !TextUtils.isEmpty(getText()) || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (o0000oo.OooO0Oo(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            DrawableCompat.setHotspotBounds(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f27477OooOoOO) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f27479OooOoo0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooO0O0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooO0O0 oooO0O0 = (OooO0O0) parcelable;
        super.onRestoreInstanceState(oooO0O0.getSuperState());
        setCheckedState(oooO0O0.f32997OooOo0O);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        OooO0O0 oooO0O0 = new OooO0O0(super.onSaveInstanceState());
        oooO0O0.f32997OooOo0O = getCheckedState();
        return oooO0O0;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f27480OooOooO = drawable;
        OooO00o();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i) {
        setButtonIconDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f27484Oooo00O == colorStateList) {
            return;
        }
        this.f27484Oooo00O = colorStateList;
        OooO00o();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f27485Oooo00o == mode) {
            return;
        }
        this.f27485Oooo00o = mode;
        OooO00o();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f27483Oooo000 == colorStateList) {
            return;
        }
        this.f27483Oooo000 = colorStateList;
        OooO00o();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        OooO00o();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f27475OooOoO = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManagerOooO00o;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f27482Oooo0 != i) {
            this.f27482Oooo0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.f27489Oooo0o0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f27487Oooo0OO) {
                return;
            }
            this.f27487Oooo0OO = true;
            LinkedHashSet linkedHashSet = this.f27474OooOo0o;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f27482Oooo0 != 2 && (onCheckedChangeListener = this.f27488Oooo0o) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManagerOooO00o = o00oO0o.OooO00o(getContext().getSystemService(o00oO0o.OooOo0O()))) != null) {
                autofillManagerOooO00o.notifyValueChanged(this);
            }
            this.f27487Oooo0OO = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f27479OooOoo0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f27477OooOoOO == z) {
            return;
        }
        this.f27477OooOoOO = z;
        refreshDrawableState();
        Iterator it = this.f27473OooOo0O.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f27488Oooo0o = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f27489Oooo0o0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f27476OooOoO0 = z;
        if (z) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i);
        this.f27473OooOo0O = new LinkedHashSet();
        this.f27474OooOo0o = new LinkedHashSet();
        this.f27490Oooo0oO = AnimatedVectorDrawableCompat.create(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.f27491Oooo0oo = new OooO00o(this);
        Context context2 = getContext();
        this.f27478OooOoo = CompoundButtonCompat.getButtonDrawable(this);
        this.f27483Oooo000 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        TintTypedArray tintTypedArrayOooO0o0 = o00000O0.OooO0o0(context2, attributeSet, OooOo.f14977OooOooO, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.f27480OooOooO = tintTypedArrayOooO0o0.getDrawable(2);
        if (this.f27478OooOoo != null && oo0o0Oo.OooO0O0.OooO0O0(context2, R.attr.isMaterial3Theme, false)) {
            int resourceId = tintTypedArrayOooO0o0.getResourceId(0, 0);
            int resourceId2 = tintTypedArrayOooO0o0.getResourceId(1, 0);
            if (resourceId == f27471OoooO0O && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f27478OooOoo = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button);
                this.f27481OooOooo = true;
                if (this.f27480OooOooO == null) {
                    this.f27480OooOooO = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f27484Oooo00O = OooO0OO.OooO0O0(context2, tintTypedArrayOooO0o0, 3);
        this.f27485Oooo00o = o0000oo.OooO0o0(tintTypedArrayOooO0o0.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f27476OooOoO0 = tintTypedArrayOooO0o0.getBoolean(10, false);
        this.f27475OooOoO = tintTypedArrayOooO0o0.getBoolean(6, true);
        this.f27477OooOoOO = tintTypedArrayOooO0o0.getBoolean(9, false);
        this.f27479OooOoo0 = tintTypedArrayOooO0o0.getText(8);
        if (tintTypedArrayOooO0o0.hasValue(7)) {
            setCheckedState(tintTypedArrayOooO0o0.getInt(7, 0));
        }
        tintTypedArrayOooO0o0.recycle();
        OooO00o();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f27478OooOoo = drawable;
        this.f27481OooOooo = false;
        OooO00o();
    }
}

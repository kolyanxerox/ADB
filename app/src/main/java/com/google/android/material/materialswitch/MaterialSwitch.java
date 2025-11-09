package com.google.android.material.materialswitch;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.github.superadb.R;
import o00000O.OooO00o;
import o00o0O.o0ooOOo;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: Oooo00o, reason: collision with root package name */
    public static final int[] f27704Oooo00o = {R.attr.state_with_icon};

    /* renamed from: OooOo, reason: collision with root package name */
    public Drawable f27705OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Drawable f27706OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Drawable f27707OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public ColorStateList f27708OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public Drawable f27709OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public ColorStateList f27710OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public ColorStateList f27711OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public PorterDuff.Mode f27712OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public ColorStateList f27713OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public PorterDuff.Mode f27714OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public int[] f27715Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public int[] f27716Oooo00O;

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public static void OooO0OO(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        DrawableCompat.setTint(drawable, ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }

    public final void OooO00o() {
        this.f27706OooOo0O = o0ooOOo.OooO0O0(this.f27706OooOo0O, this.f27708OooOoO, getThumbTintMode());
        this.f27707OooOo0o = o0ooOOo.OooO0O0(this.f27707OooOo0o, this.f27710OooOoOO, this.f27712OooOoo0);
        OooO0Oo();
        super.setThumbDrawable(o0ooOOo.OooO00o(this.f27706OooOo0O, this.f27707OooOo0o));
        refreshDrawableState();
    }

    public final void OooO0O0() {
        this.f27705OooOo = o0ooOOo.OooO0O0(this.f27705OooOo, this.f27711OooOoo, getTrackTintMode());
        this.f27709OooOoO0 = o0ooOOo.OooO0O0(this.f27709OooOoO0, this.f27713OooOooO, this.f27714OooOooo);
        OooO0Oo();
        Drawable layerDrawable = this.f27705OooOo;
        if (layerDrawable != null && this.f27709OooOoO0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f27705OooOo, this.f27709OooOoO0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f27709OooOoO0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    public final void OooO0Oo() {
        if (this.f27708OooOoO == null && this.f27710OooOoOO == null && this.f27711OooOoo == null && this.f27713OooOooO == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f27708OooOoO;
        if (colorStateList != null) {
            OooO0OO(this.f27706OooOo0O, colorStateList, this.f27715Oooo000, this.f27716Oooo00O, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f27710OooOoOO;
        if (colorStateList2 != null) {
            OooO0OO(this.f27707OooOo0o, colorStateList2, this.f27715Oooo000, this.f27716Oooo00O, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f27711OooOoo;
        if (colorStateList3 != null) {
            OooO0OO(this.f27705OooOo, colorStateList3, this.f27715Oooo000, this.f27716Oooo00O, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f27713OooOooO;
        if (colorStateList4 != null) {
            OooO0OO(this.f27709OooOoO0, colorStateList4, this.f27715Oooo000, this.f27716Oooo00O, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f27706OooOo0O;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f27707OooOo0o;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f27710OooOoOO;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f27712OooOoo0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f27708OooOoO;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f27709OooOoO0;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f27713OooOooO;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f27714OooOooo;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f27705OooOo;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f27711OooOoo;
    }

    @Override // android.view.View
    public final void invalidate() {
        OooO0Oo();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f27707OooOo0o != null) {
            CompoundButton.mergeDrawableStates(iArrOnCreateDrawableState, f27704Oooo00o);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.f27715Oooo000 = iArr;
        this.f27716Oooo00O = o0ooOOo.OooO0OO(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f27706OooOo0O = drawable;
        OooO00o();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f27707OooOo0o = drawable;
        OooO00o();
    }

    public void setThumbIconResource(@DrawableRes int i) {
        setThumbIconDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f27710OooOoOO = colorStateList;
        OooO00o();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f27712OooOoo0 = mode;
        OooO00o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f27708OooOoO = colorStateList;
        OooO00o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        OooO00o();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f27709OooOoO0 = drawable;
        OooO0O0();
    }

    public void setTrackDecorationResource(@DrawableRes int i) {
        setTrackDecorationDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f27713OooOooO = colorStateList;
        OooO0O0();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f27714OooOooo = mode;
        OooO0O0();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f27705OooOo = drawable;
        OooO0O0();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f27711OooOoo = colorStateList;
        OooO0O0();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        OooO0O0();
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        Context context2 = getContext();
        this.f27706OooOo0O = super.getThumbDrawable();
        this.f27708OooOoO = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f27705OooOo = super.getTrackDrawable();
        this.f27711OooOoo = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArrayOooO0o0 = o00000O0.OooO0o0(context2, attributeSet, OooOo.f14983Oooo00o, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.f27707OooOo0o = tintTypedArrayOooO0o0.getDrawable(0);
        this.f27710OooOoOO = tintTypedArrayOooO0o0.getColorStateList(1);
        int i2 = tintTypedArrayOooO0o0.getInt(2, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f27712OooOoo0 = o0000oo.OooO0o0(i2, mode);
        this.f27709OooOoO0 = tintTypedArrayOooO0o0.getDrawable(3);
        this.f27713OooOooO = tintTypedArrayOooO0o0.getColorStateList(4);
        this.f27714OooOooo = o0000oo.OooO0o0(tintTypedArrayOooO0o0.getInt(5, -1), mode);
        tintTypedArrayOooO0o0.recycle();
        setEnforceSwitchWidth(false);
        OooO00o();
        OooO0O0();
    }
}

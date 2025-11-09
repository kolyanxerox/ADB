package com.google.android.material.slider;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import com.github.superadb.R;
import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.List;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public class RangeSlider extends BaseSlider<RangeSlider, Object, Object> {

    /* renamed from: o0OOO0o, reason: collision with root package name */
    public int f27811o0OOO0o;
    public float o0ooOoO;

    public RangeSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f27779OooooO0;
    }

    public int getFocusedThumbIndex() {
        return this.f27780OooooOO;
    }

    @Dimension
    public int getHaloRadius() {
        return this.o000oOoO;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f27796ooOO;
    }

    public int getLabelBehavior() {
        return this.f27768OoooO0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getMinSeparation() {
        return this.o0ooOoO;
    }

    public float getStepSize() {
        return this.f27781OooooOo;
    }

    public float getThumbElevation() {
        return this.f27792o00ooo.f29048OooOo0O.f29039OooOOO0;
    }

    @Dimension
    public int getThumbRadius() {
        return this.f27771OoooOO0;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f27792o00ooo.f29048OooOo0O.f29031OooO0Oo;
    }

    public float getThumbStrokeWidth() {
        return this.f27792o00ooo.f29048OooOo0O.f29036OooOO0;
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.f27792o00ooo.f29048OooOo0O.f29030OooO0OO;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f27786o00O0O;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f27787o00Oo0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f27787o00Oo0.equals(this.f27786o00O0O)) {
            return this.f27786o00O0O;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f27788o00Ooo;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f27770OoooO0O;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f27789o00o0O;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f27767OoooO;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f27789o00o0O.equals(this.f27788o00Ooo)) {
            return this.f27788o00Ooo;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Dimension
    public int getTrackWidth() {
        return this.f27784OoooooO;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueFrom() {
        return this.f27776OoooOoo;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueTo() {
        return this.f27777Ooooo00;
    }

    @Override // com.google.android.material.slider.BaseSlider
    @NonNull
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        OooOOO0 oooOOO0 = (OooOOO0) parcelable;
        super.onRestoreInstanceState(oooOOO0.getSuperState());
        this.o0ooOoO = oooOOO0.minSeparation;
        int i = oooOOO0.separationUnit;
        this.f27811o0OOO0o = i;
        setSeparationUnit(i);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public final Parcelable onSaveInstanceState() {
        OooOOO0 oooOOO0 = new OooOOO0((OooOO0) super.onSaveInstanceState());
        oooOOO0.minSeparation = this.o0ooOoO;
        oooOOO0.separationUnit = this.f27811o0OOO0o;
        return oooOOO0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(@IntRange(from = KeyboardMap.kUnicodePlane) @Dimension int i) {
        super.setHaloRadius(i);
    }

    public void setHaloRadiusResource(@DimenRes int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(@NonNull ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(@Nullable OooOO0O oooOO0O) {
    }

    public void setMinSeparation(@Dimension float f) {
        this.o0ooOoO = f;
        this.f27811o0OOO0o = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.o0ooOoO = f;
        this.f27811o0OOO0o = 1;
        setSeparationUnit(1);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    public void setThumbElevationResource(@DimenRes int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@IntRange(from = KeyboardMap.kUnicodePlane) @Dimension int i) {
        super.setThumbRadius(i);
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public void setThumbStrokeColorResource(@ColorRes int i) {
        if (i != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    public void setThumbStrokeWidthResource(@DimenRes int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        o000000.OooOOO0 oooOOO0 = this.f27792o00ooo;
        if (colorStateList.equals(oooOOO0.f29048OooOo0O.f29030OooO0OO)) {
            return;
        }
        oooOOO0.OooOOO0(colorStateList);
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f27782Oooooo != z) {
            this.f27782Oooooo = z;
            postInvalidate();
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@IntRange(from = KeyboardMap.kUnicodePlane) @Dimension int i) {
        super.setTrackHeight(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f27776OoooOoo = f;
        this.f27793o0OoOo0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f27777Ooooo00 = f;
        this.f27793o0OoOo0 = true;
        postInvalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(@NonNull Float... fArr) {
        super.setValues(fArr);
    }

    public RangeSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context, attributeSet, OooOo.f14992OoooO00, i, R.style.Widget_MaterialComponents_Slider, new int[0]);
        if (typedArrayOooO0Oo.hasValue(1)) {
            TypedArray typedArrayObtainTypedArray = typedArrayOooO0Oo.getResources().obtainTypedArray(typedArrayOooO0Oo.getResourceId(1, 0));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                arrayList.add(Float.valueOf(typedArrayObtainTypedArray.getFloat(i2, -1.0f)));
            }
            setValues(arrayList);
        }
        this.o0ooOoO = typedArrayOooO0Oo.getDimension(0, 0.0f);
        typedArrayOooO0Oo.recycle();
    }

    public void setCustomThumbDrawable(@DrawableRes int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(@NonNull List<Float> list) {
        super.setValues(list);
    }
}

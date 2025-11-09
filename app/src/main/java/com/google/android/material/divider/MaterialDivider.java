package com.google.android.material.divider;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import o000000.OooOOO0;
import o00000O.OooO00o;
import o0ooOO0.o00000O0;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f27605OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooOOO0 f27606OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f27607OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f27608OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f27609OooOoO0;

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public int getDividerColor() {
        return this.f27605OooOo;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f27608OooOoO;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f27609OooOoO0;
    }

    public int getDividerThickness() {
        return this.f27607OooOo0o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = ViewCompat.getLayoutDirection(this) == 1;
        int i2 = z ? this.f27608OooOoO : this.f27609OooOoO0;
        if (z) {
            width = getWidth();
            i = this.f27609OooOoO0;
        } else {
            width = getWidth();
            i = this.f27608OooOoO;
        }
        int i3 = width - i;
        OooOOO0 oooOOO0 = this.f27606OooOo0O;
        oooOOO0.setBounds(i2, 0, i3, getBottom() - getTop());
        oooOOO0.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f27607OooOo0o;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i) {
        if (this.f27605OooOo != i) {
            this.f27605OooOo = i;
            this.f27606OooOo0O.OooOOO0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i) {
        setDividerColor(ContextCompat.getColor(getContext(), i));
    }

    public void setDividerInsetEnd(@Px int i) {
        this.f27608OooOoO = i;
    }

    public void setDividerInsetEndResource(@DimenRes int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@Px int i) {
        this.f27609OooOoO0 = i;
    }

    public void setDividerInsetStartResource(@DimenRes int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@Px int i) {
        if (this.f27607OooOo0o != i) {
            this.f27607OooOo0o = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        this.f27606OooOo0O = new OooOOO0();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, OooOo.f14978OooOooo, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f27607OooOo0o = typedArrayOooO0Oo.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f27609OooOoO0 = typedArrayOooO0Oo.getDimensionPixelOffset(2, 0);
        this.f27608OooOoO = typedArrayOooO0Oo.getDimensionPixelOffset(1, 0);
        setDividerColor(OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 0).getDefaultColor());
        typedArrayOooO0Oo.recycle();
    }
}

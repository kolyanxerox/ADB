package com.google.android.material.appbar;

import OoooOOO.oO000Oo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import java.util.ArrayList;
import java.util.Collections;
import o0ooOO0.o00000O;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final ImageView.ScaleType[] f27298OooOoOO = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f27299OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Integer f27300OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f27301OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public Boolean f27302OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public ImageView.ScaleType f27303OooOoO0;

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public final void OooO00o(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, BasicMeasure.EXACTLY), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f27303OooOoO0;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f27300OooOo0O;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Oooo0o0.OooO.OooOo0O(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f27301OooOo0o || this.f27299OooOo) {
            ArrayList arrayListOooO00o = o00000O.OooO00o(this, getTitle());
            boolean zIsEmpty = arrayListOooO00o.isEmpty();
            oO000Oo oo000oo = o00000O.f33094OooO00o;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListOooO00o, oo000oo);
            ArrayList arrayListOooO00o2 = o00000O.OooO00o(this, getSubtitle());
            TextView textView2 = arrayListOooO00o2.isEmpty() ? null : (TextView) Collections.max(arrayListOooO00o2, oo000oo);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f27301OooOo0o && textView != null) {
                    OooO00o(textView, pair);
                }
                if (this.f27299OooOo && textView2 != null) {
                    OooO00o(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f27302OooOoO;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f27303OooOoO0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        Oooo0o0.OooO.OooOo00(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f27302OooOoO;
        if (bool == null || bool.booleanValue() != z) {
            this.f27302OooOoO = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f27303OooOoO0 != scaleType) {
            this.f27303OooOoO0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f27300OooOo0O != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(drawable, this.f27300OooOo0O.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f27300OooOo0O = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f27299OooOo != z) {
            this.f27299OooOo = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f27301OooOo0o != z) {
            this.f27301OooOo0o = z;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, Ooooo00.OooOo.f14985Oooo0OO, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayOooO0Oo.hasValue(2)) {
            setNavigationIconTint(typedArrayOooO0Oo.getColor(2, -1));
        }
        this.f27301OooOo0o = typedArrayOooO0Oo.getBoolean(4, false);
        this.f27299OooOo = typedArrayOooO0Oo.getBoolean(3, false);
        int i2 = typedArrayOooO0Oo.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f27298OooOoOO;
            if (i2 < scaleTypeArr.length) {
                this.f27303OooOoO0 = scaleTypeArr[i2];
            }
        }
        if (typedArrayOooO0Oo.hasValue(0)) {
            this.f27302OooOoO = Boolean.valueOf(typedArrayOooO0Oo.getBoolean(0, false));
        }
        typedArrayOooO0Oo.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0();
            oooOOO0.OooOOO0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            oooOOO0.OooOO0O(context2);
            oooOOO0.OooOO0o(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, oooOOO0);
        }
    }
}

package com.google.android.material.navigation;

import Oooo0o0.OooO;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0038R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import o000000.OooO00o;
import o000000.OooOO0O;
import o000000.OooOOO0;
import o000000.OooOo;
import o000000.Oooo000;
import o000000.o000oOoO;
import o0OOO0o.Oooo0;
import o0OOO0o.o0OoOo0;
import o0ooOO0.OooOOOO;
import o0ooOO0.o00000O0;
import o0ooOO0.o00oO0o;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: Oooo0o, reason: collision with root package name */
    public static final int[] f27717Oooo0o = {R.attr.state_checked};

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public static final int[] f27718Oooo0oO = {-16842910};

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final OooOOOO f27719OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final int f27720OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final o00oO0o f27721OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final int[] f27722OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public SupportMenuInflater f27723OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final int f27724Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final Oooo0 f27725Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public boolean f27726Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public boolean f27727Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public final int f27728Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public Path f27729Oooo0OO;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public final RectF f27730Oooo0o0;

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.github.superadb.R.attr.navigationViewStyle);
    }

    private MenuInflater getMenuInflater() {
        if (this.f27723OooOooo == null) {
            this.f27723OooOooo = new SupportMenuInflater(getContext());
        }
        return this.f27723OooOooo;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void OooO00o(WindowInsetsCompat windowInsetsCompat) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.getClass();
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (o00oo0o.f33129OoooO != systemWindowInsetTop) {
            o00oo0o.f33129OoooO = systemWindowInsetTop;
            int i = (o00oo0o.f33110OooOo0o.getChildCount() == 0 && o00oo0o.f33130OoooO0) ? o00oo0o.f33129OoooO : 0;
            NavigationMenuView navigationMenuView = o00oo0o.f33109OooOo0O;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = o00oo0o.f33109OooOo0O;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(o00oo0o.f33110OooOo0o, windowInsetsCompat);
    }

    public final ColorStateList OooO0O0(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0038R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f27718Oooo0oO;
        return new ColorStateList(new int[][]{iArr, f27717Oooo0o, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public final InsetDrawable OooO0OO(TintTypedArray tintTypedArray, ColorStateList colorStateList) {
        OooOOO0 oooOOO0 = new OooOOO0(Oooo000.OooO00o(getContext(), tintTypedArray.getResourceId(17, 0), tintTypedArray.getResourceId(18, 0), new OooO00o(0)).OooO00o());
        oooOOO0.OooOOO0(colorStateList);
        return new InsetDrawable((Drawable) oooOOO0, tintTypedArray.getDimensionPixelSize(22, 0), tintTypedArray.getDimensionPixelSize(23, 0), tintTypedArray.getDimensionPixelSize(21, 0), tintTypedArray.getDimensionPixelSize(20, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f27729Oooo0OO == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f27729Oooo0OO);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f27721OooOoo0.f33113OooOoOO.f33085OooO0O0;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f27721OooOoo0.f33128Oooo0oo;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f27721OooOoo0.f33127Oooo0oO;
    }

    public int getHeaderCount() {
        return this.f27721OooOoo0.f33110OooOo0o.getChildCount();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f27721OooOoo0.f33122Oooo00o;
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f27721OooOoo0.f33123Oooo0O0;
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f27721OooOoo0.f33126Oooo0o0;
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f27721OooOoo0.f33121Oooo00O;
    }

    public int getItemMaxLines() {
        return this.f27721OooOoo0.f33132OoooO0O;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f27721OooOoo0.f33120Oooo000;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.f27721OooOoo0.f33124Oooo0OO;
    }

    @NonNull
    public Menu getMenu() {
        return this.f27719OooOoOO;
    }

    @Px
    public int getSubheaderInsetEnd() {
        this.f27721OooOoo0.getClass();
        return 0;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.f27721OooOoo0.f33118Oooo;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO.OooOo0O(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f27725Oooo000);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.f27720OooOoo;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), BasicMeasure.EXACTLY);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o0OoOo0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) parcelable;
        super.onRestoreInstanceState(o0oooo0.getSuperState());
        this.f27719OooOoOO.restorePresenterStates(o0oooo0.menuState);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o0OoOo0 o0oooo0 = new o0OoOo0(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        o0oooo0.menuState = bundle;
        this.f27719OooOoOO.savePresenterStates(bundle);
        return o0oooo0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        boolean z = getParent() instanceof DrawerLayout;
        RectF rectF = this.f27730Oooo0o0;
        if (!z || (i5 = this.f27728Oooo0O0) <= 0 || !(getBackground() instanceof OooOOO0)) {
            this.f27729Oooo0OO = null;
            rectF.setEmpty();
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) getBackground();
        OooOo oooOoOooO0o = oooOOO0.f29048OooOo0O.f29028OooO00o.OooO0o();
        if (GravityCompat.getAbsoluteGravity(this.f27724Oooo0, ViewCompat.getLayoutDirection(this)) == 3) {
            float f = i5;
            oooOoOooO0o.f29075OooO0o = new OooO00o(f);
            oooOoOooO0o.f29077OooO0oO = new OooO00o(f);
        } else {
            float f2 = i5;
            oooOoOooO0o.f29076OooO0o0 = new OooO00o(f2);
            oooOoOooO0o.f29078OooO0oo = new OooO00o(f2);
        }
        oooOOO0.setShapeAppearanceModel(oooOoOooO0o.OooO00o());
        if (this.f27729Oooo0OO == null) {
            this.f27729Oooo0OO = new Path();
        }
        this.f27729Oooo0OO.reset();
        rectF.set(0.0f, 0.0f, i, i2);
        o000oOoO o000oooo2 = o000000.Oooo0.f29081OooO00o;
        OooOO0O oooOO0O = oooOOO0.f29048OooOo0O;
        o000oooo2.OooO00o(oooOO0O.f29028OooO00o, oooOO0O.f29027OooO, rectF, null, this.f27729Oooo0OO);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f27727Oooo00o = z;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem menuItemFindItem = this.f27719OooOoOO.findItem(i);
        if (menuItemFindItem != null) {
            this.f27721OooOoo0.f33113OooOoOO.OooO0O0((MenuItemImpl) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@Px int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33128Oooo0oo = i;
        o00oo0o.updateMenuView(false);
    }

    public void setDividerInsetStart(@Px int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33127Oooo0oO = i;
        o00oo0o.updateMenuView(false);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        OooO.OooOo00(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33122Oooo00o = drawable;
        o00oo0o.updateMenuView(false);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33123Oooo0O0 = i;
        o00oo0o.updateMenuView(false);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33123Oooo0O0 = dimensionPixelSize;
        o00oo0o.updateMenuView(false);
    }

    public void setItemIconPadding(@Dimension int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33126Oooo0o0 = i;
        o00oo0o.updateMenuView(false);
    }

    public void setItemIconPaddingResource(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33126Oooo0o0 = dimensionPixelSize;
        o00oo0o.updateMenuView(false);
    }

    public void setItemIconSize(@Dimension int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        if (o00oo0o.f33125Oooo0o != i) {
            o00oo0o.f33125Oooo0o = i;
            o00oo0o.f33131OoooO00 = true;
            o00oo0o.updateMenuView(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33121Oooo00O = colorStateList;
        o00oo0o.updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33132OoooO0O = i;
        o00oo0o.updateMenuView(false);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33117OooOooo = i;
        o00oo0o.updateMenuView(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33120Oooo000 = colorStateList;
        o00oo0o.updateMenuView(false);
    }

    public void setItemVerticalPadding(@Px int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33124Oooo0OO = i;
        o00oo0o.updateMenuView(false);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33124Oooo0OO = dimensionPixelSize;
        o00oo0o.updateMenuView(false);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        o00oO0o o00oo0o = this.f27721OooOoo0;
        if (o00oo0o != null) {
            o00oo0o.o000oOoO = i;
            NavigationMenuView navigationMenuView = o00oo0o.f33109OooOo0O;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setSubheaderInsetEnd(@Px int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33118Oooo = i;
        o00oo0o.updateMenuView(false);
    }

    public void setSubheaderInsetStart(@Px int i) {
        o00oO0o o00oo0o = this.f27721OooOoo0;
        o00oo0o.f33118Oooo = i;
        o00oo0o.updateMenuView(false);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f27726Oooo00O = z;
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, com.github.superadb.R.style.Widget_Design_NavigationView), attributeSet, i);
        o00oO0o o00oo0o = new o00oO0o();
        this.f27721OooOoo0 = o00oo0o;
        this.f27722OooOooO = new int[2];
        this.f27726Oooo00O = true;
        this.f27727Oooo00o = true;
        this.f27724Oooo0 = 0;
        this.f27728Oooo0O0 = 0;
        this.f27730Oooo0o0 = new RectF();
        Context context2 = getContext();
        OooOOOO oooOOOO = new OooOOOO(context2);
        this.f27719OooOoOO = oooOOOO;
        TintTypedArray tintTypedArrayOooO0o0 = o00000O0.OooO0o0(context2, attributeSet, Ooooo00.OooOo.f14989Oooo0oo, i, com.github.superadb.R.style.Widget_Design_NavigationView, new int[0]);
        if (tintTypedArrayOooO0o0.hasValue(1)) {
            ViewCompat.setBackground(this, tintTypedArrayOooO0o0.getDrawable(1));
        }
        this.f27728Oooo0O0 = tintTypedArrayOooO0o0.getDimensionPixelSize(7, 0);
        this.f27724Oooo0 = tintTypedArrayOooO0o0.getInt(0, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Oooo000 oooo000OooO00o = Oooo000.OooO0O0(context2, attributeSet, i, com.github.superadb.R.style.Widget_Design_NavigationView).OooO00o();
            Drawable background = getBackground();
            OooOOO0 oooOOO0 = new OooOOO0(oooo000OooO00o);
            if (background instanceof ColorDrawable) {
                oooOOO0.OooOOO0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            oooOOO0.OooOO0O(context2);
            ViewCompat.setBackground(this, oooOOO0);
        }
        if (tintTypedArrayOooO0o0.hasValue(8)) {
            setElevation(tintTypedArrayOooO0o0.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(tintTypedArrayOooO0o0.getBoolean(2, false));
        this.f27720OooOoo = tintTypedArrayOooO0o0.getDimensionPixelSize(3, 0);
        ColorStateList colorStateList = tintTypedArrayOooO0o0.hasValue(30) ? tintTypedArrayOooO0o0.getColorStateList(30) : null;
        int resourceId = tintTypedArrayOooO0o0.hasValue(33) ? tintTypedArrayOooO0o0.getResourceId(33, 0) : 0;
        if (resourceId == 0 && colorStateList == null) {
            colorStateList = OooO0O0(R.attr.textColorSecondary);
        }
        ColorStateList colorStateList2 = tintTypedArrayOooO0o0.hasValue(14) ? tintTypedArrayOooO0o0.getColorStateList(14) : OooO0O0(R.attr.textColorSecondary);
        int resourceId2 = tintTypedArrayOooO0o0.hasValue(24) ? tintTypedArrayOooO0o0.getResourceId(24, 0) : 0;
        if (tintTypedArrayOooO0o0.hasValue(13)) {
            setItemIconSize(tintTypedArrayOooO0o0.getDimensionPixelSize(13, 0));
        }
        ColorStateList colorStateList3 = tintTypedArrayOooO0o0.hasValue(25) ? tintTypedArrayOooO0o0.getColorStateList(25) : null;
        if (resourceId2 == 0 && colorStateList3 == null) {
            colorStateList3 = OooO0O0(R.attr.textColorPrimary);
        }
        Drawable drawable = tintTypedArrayOooO0o0.getDrawable(10);
        if (drawable == null && (tintTypedArrayOooO0o0.hasValue(17) || tintTypedArrayOooO0o0.hasValue(18))) {
            drawable = OooO0OO(tintTypedArrayOooO0o0, OooO0OO.OooO0O0(getContext(), tintTypedArrayOooO0o0, 19));
            ColorStateList colorStateListOooO0O0 = OooO0OO.OooO0O0(context2, tintTypedArrayOooO0o0, 16);
            if (colorStateListOooO0O0 != null) {
                o00oo0o.f33119Oooo0 = new RippleDrawable(o0O0O00.OooO00o.OooO0OO(colorStateListOooO0O0), null, OooO0OO(tintTypedArrayOooO0o0, null));
                o00oo0o.updateMenuView(false);
            }
        }
        if (tintTypedArrayOooO0o0.hasValue(11)) {
            setItemHorizontalPadding(tintTypedArrayOooO0o0.getDimensionPixelSize(11, 0));
        }
        if (tintTypedArrayOooO0o0.hasValue(26)) {
            setItemVerticalPadding(tintTypedArrayOooO0o0.getDimensionPixelSize(26, 0));
        }
        setDividerInsetStart(tintTypedArrayOooO0o0.getDimensionPixelSize(6, 0));
        setDividerInsetEnd(tintTypedArrayOooO0o0.getDimensionPixelSize(5, 0));
        setSubheaderInsetStart(tintTypedArrayOooO0o0.getDimensionPixelSize(32, 0));
        setSubheaderInsetEnd(tintTypedArrayOooO0o0.getDimensionPixelSize(31, 0));
        setTopInsetScrimEnabled(tintTypedArrayOooO0o0.getBoolean(34, this.f27726Oooo00O));
        setBottomInsetScrimEnabled(tintTypedArrayOooO0o0.getBoolean(4, this.f27727Oooo00o));
        int dimensionPixelSize = tintTypedArrayOooO0o0.getDimensionPixelSize(12, 0);
        setItemMaxLines(tintTypedArrayOooO0o0.getInt(15, 1));
        oooOOOO.setCallback(new o0OOO0o.Oooo000(this));
        o00oo0o.f33111OooOoO = 1;
        o00oo0o.initForMenu(context2, oooOOOO);
        if (resourceId != 0) {
            o00oo0o.f33114OooOoo = resourceId;
            o00oo0o.updateMenuView(false);
        }
        o00oo0o.f33116OooOooO = colorStateList;
        o00oo0o.updateMenuView(false);
        o00oo0o.f33121Oooo00O = colorStateList2;
        o00oo0o.updateMenuView(false);
        int overScrollMode = getOverScrollMode();
        o00oo0o.o000oOoO = overScrollMode;
        NavigationMenuView navigationMenuView = o00oo0o.f33109OooOo0O;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            o00oo0o.f33117OooOooo = resourceId2;
            o00oo0o.updateMenuView(false);
        }
        o00oo0o.f33120Oooo000 = colorStateList3;
        o00oo0o.updateMenuView(false);
        o00oo0o.f33122Oooo00o = drawable;
        o00oo0o.updateMenuView(false);
        o00oo0o.f33126Oooo0o0 = dimensionPixelSize;
        o00oo0o.updateMenuView(false);
        oooOOOO.addMenuPresenter(o00oo0o);
        addView((View) o00oo0o.getMenuView(this));
        if (tintTypedArrayOooO0o0.hasValue(27)) {
            int resourceId3 = tintTypedArrayOooO0o0.getResourceId(27, 0);
            o0ooOO0.Oooo000 oooo000 = o00oo0o.f33113OooOoOO;
            if (oooo000 != null) {
                oooo000.f33086OooO0OO = true;
            }
            getMenuInflater().inflate(resourceId3, oooOOOO);
            o0ooOO0.Oooo000 oooo0002 = o00oo0o.f33113OooOoOO;
            if (oooo0002 != null) {
                oooo0002.f33086OooO0OO = false;
            }
            o00oo0o.updateMenuView(false);
        }
        if (tintTypedArrayOooO0o0.hasValue(9)) {
            o00oo0o.f33110OooOo0o.addView(o00oo0o.f33115OooOoo0.inflate(tintTypedArrayOooO0o0.getResourceId(9, 0), (ViewGroup) o00oo0o.f33110OooOo0o, false));
            NavigationMenuView navigationMenuView2 = o00oo0o.f33109OooOo0O;
            navigationMenuView2.setPadding(0, 0, 0, navigationMenuView2.getPaddingBottom());
        }
        tintTypedArrayOooO0o0.recycle();
        this.f27725Oooo000 = new Oooo0(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f27725Oooo000);
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f27719OooOoOO.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f27721OooOoo0.f33113OooOoOO.OooO0O0((MenuItemImpl) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setNavigationItemSelectedListener(@Nullable o0OOO0o.o000oOoO o000oooo2) {
    }
}

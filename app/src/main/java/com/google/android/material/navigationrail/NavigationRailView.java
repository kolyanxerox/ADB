package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.github.superadb.R;
import com.ironsource.InterfaceC3173h3;
import o0OOO0o.OooO;
import o0OOO0o.OooOo;
import o0Oo0oo.OooO0O0;
import o0Oo0oo.OooO0OO;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public class NavigationRailView extends OooOo {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f27731OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final View f27732OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final Boolean f27733OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final Boolean f27734OooOoo0;

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    private OooO0O0 getNavigationRailMenuView() {
        return (OooO0O0) getMenuView();
    }

    @Override // o0OOO0o.OooOo
    public final OooO OooO00o(Context context) {
        return new OooO0O0(context);
    }

    @Nullable
    public View getHeaderView() {
        return this.f27732OooOoOO;
    }

    public int getItemMinimumHeight() {
        return ((OooO0O0) getMenuView()).getItemMinimumHeight();
    }

    @Override // o0OOO0o.OooOo
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0O0 navigationRailMenuView = getNavigationRailMenuView();
        View view = this.f27732OooOoOO;
        int i5 = 0;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        int i6 = this.f27731OooOoO;
        if (z2) {
            int bottom = this.f27732OooOoOO.getBottom() + i6;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if ((navigationRailMenuView.f32994Ooooo00.gravity & InterfaceC3173h3.d.b.f8827j) == 48) {
            i5 = i6;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i2);
        View view = this.f27732OooOoOO;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        measureChild(getNavigationRailMenuView(), i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f27732OooOoOO.getMeasuredHeight()) - this.f27731OooOoO, Integer.MIN_VALUE));
    }

    public void setItemMinimumHeight(@Px int i) {
        ((OooO0O0) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_NavigationRailView);
        this.f27734OooOoo0 = null;
        this.f27733OooOoo = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        this.f27731OooOoO = dimensionPixelSize;
        TintTypedArray tintTypedArrayOooO0o0 = o00000O0.OooO0o0(getContext(), attributeSet, Ooooo00.OooOo.f14988Oooo0oO, i, R.style.Widget_MaterialComponents_NavigationRailView, new int[0]);
        int resourceId = tintTypedArrayOooO0o0.getResourceId(0, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view = this.f27732OooOoOO;
            if (view != null) {
                removeView(view);
                this.f27732OooOoOO = null;
            }
            this.f27732OooOoOO = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(viewInflate, 0, layoutParams);
        }
        setMenuGravity(tintTypedArrayOooO0o0.getInt(2, 49));
        if (tintTypedArrayOooO0o0.hasValue(1)) {
            setItemMinimumHeight(tintTypedArrayOooO0o0.getDimensionPixelSize(1, -1));
        }
        if (tintTypedArrayOooO0o0.hasValue(4)) {
            this.f27734OooOoo0 = Boolean.valueOf(tintTypedArrayOooO0o0.getBoolean(4, false));
        }
        if (tintTypedArrayOooO0o0.hasValue(3)) {
            this.f27733OooOoo = Boolean.valueOf(tintTypedArrayOooO0o0.getBoolean(3, false));
        }
        tintTypedArrayOooO0o0.recycle();
        o0000oo.OooO00o(this, new OooO0OO(this));
    }
}

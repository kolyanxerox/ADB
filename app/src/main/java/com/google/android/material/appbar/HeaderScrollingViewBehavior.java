package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* loaded from: classes2.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f27294OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f27295OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f27296OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f27297OooO0o0;

    public HeaderScrollingViewBehavior() {
        this.f27294OooO0OO = new Rect();
        this.f27295OooO0Oo = new Rect();
        this.f27297OooO0o0 = 0;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void OooO0OO(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutOooO0o0 = OooO0o0(coordinatorLayout.getDependencies(view));
        int iClamp = 0;
        if (appBarLayoutOooO0o0 == null) {
            coordinatorLayout.onLayoutChild(view, i);
            this.f27297OooO0o0 = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int bottom = appBarLayoutOooO0o0.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int bottom2 = ((appBarLayoutOooO0o0.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        Rect rect = this.f27294OooO0OO;
        rect.set(paddingLeft, bottom, width, bottom2);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
            rect.left = lastWindowInsets.getSystemWindowInsetLeft() + rect.left;
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        int i2 = layoutParams.gravity;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f27295OooO0Oo;
        GravityCompat.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        if (this.f27296OooO0o != 0) {
            float fOooO0o = OooO0o(appBarLayoutOooO0o0);
            int i3 = this.f27296OooO0o;
            iClamp = MathUtils.clamp((int) (fOooO0o * i3), 0, i3);
        }
        view.layout(rect2.left, rect2.top - iClamp, rect2.right, rect2.bottom - iClamp);
        this.f27297OooO0o0 = rect2.top - appBarLayoutOooO0o0.getBottom();
    }

    public float OooO0o(View view) {
        return 1.0f;
    }

    public abstract AppBarLayout OooO0o0(List list);

    public int OooO0oO(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout appBarLayoutOooO0o0;
        WindowInsetsCompat lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (appBarLayoutOooO0o0 = OooO0o0(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.getFitsSystemWindows(appBarLayoutOooO0o0) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetBottom() + lastWindowInsets.getSystemWindowInsetTop();
        }
        int iOooO0oO = size + OooO0oO(appBarLayoutOooO0o0);
        int measuredHeight = appBarLayoutOooO0o0.getMeasuredHeight();
        view.setTranslationY(0.0f);
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(iOooO0oO - measuredHeight, i5 == -1 ? BasicMeasure.EXACTLY : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27294OooO0OO = new Rect();
        this.f27295OooO0Oo = new Rect();
        this.f27297OooO0o0 = 0;
    }
}

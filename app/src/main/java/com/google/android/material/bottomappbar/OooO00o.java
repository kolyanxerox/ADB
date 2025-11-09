package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.superadb.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public final class OooO00o implements View.OnLayoutChangeListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar.Behavior f27373OooOo0O;

    public OooO00o(BottomAppBar.Behavior behavior) {
        this.f27373OooOo0O = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BottomAppBar.Behavior behavior = this.f27373OooOo0O;
        BottomAppBar bottomAppBar = (BottomAppBar) behavior.f27371OooO0oO.get();
        if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
            view.removeOnLayoutChangeListener(this);
            return;
        }
        int height = view.getHeight();
        if (view instanceof FloatingActionButton) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int measuredWidth = floatingActionButton.getMeasuredWidth();
            int measuredHeight = floatingActionButton.getMeasuredHeight();
            Rect rect = behavior.f27370OooO0o;
            rect.set(0, 0, measuredWidth, measuredHeight);
            floatingActionButton.OooOO0(rect);
            int iHeight = rect.height();
            bottomAppBar.OooOOO0(iHeight);
            bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f29089OooO0o0.OooO00o(new RectF(rect)));
            height = iHeight;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (behavior.f27372OooO0oo == 0) {
            int measuredHeight2 = (view.getMeasuredHeight() - height) / 2;
            int i9 = bottomAppBar.f27353OooOoo0;
            if (i9 == 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight2);
            } else if (i9 == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((bottomAppBar.getBottomInset() + bottomAppBar.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
            boolean zOooO0Oo = o0000oo.OooO0Oo(view);
            int i10 = bottomAppBar.f27352OooOoo;
            if (zOooO0Oo) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += i10;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += i10;
            }
        }
    }
}

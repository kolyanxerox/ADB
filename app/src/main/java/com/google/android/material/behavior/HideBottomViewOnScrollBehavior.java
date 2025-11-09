package com.google.android.material.behavior;

import Ooooo0o.oo0o0O0;
import OooooOO.ooooO0O0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashSet f27333OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f27334OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f27335OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f27336OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public ViewPropertyAnimator f27337OooO0o0;

    public HideBottomViewOnScrollBehavior() {
        this.f27333OooO00o = new LinkedHashSet();
        this.f27334OooO0O0 = 0;
        this.f27335OooO0OO = 2;
        this.f27336OooO0Oo = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f27334OooO0O0 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f27333OooO00o;
        if (i2 > 0) {
            if (this.f27335OooO0OO == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f27337OooO0o0;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f27335OooO0OO = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f27337OooO0o0 = view.animate().translationY(this.f27334OooO0O0 + this.f27336OooO0Oo).setInterpolator(oo0o0O0.f15017OooO0OO).setDuration(175L).setListener(new ooooO0O0(this, 0));
            return;
        }
        if (i2 >= 0 || this.f27335OooO0OO == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f27337OooO0o0;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f27335OooO0OO = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f27337OooO0o0 = view.animate().translationY(0).setInterpolator(oo0o0O0.f15018OooO0Oo).setDuration(225L).setListener(new ooooO0O0(this, 0));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27333OooO00o = new LinkedHashSet();
        this.f27334OooO0O0 = 0;
        this.f27335OooO0OO = 2;
        this.f27336OooO0Oo = 0;
    }
}

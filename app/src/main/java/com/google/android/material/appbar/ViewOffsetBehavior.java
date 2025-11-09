package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: OooO00o, reason: collision with root package name */
    public OooOo f27331OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f27332OooO0O0;

    public ViewOffsetBehavior() {
        this.f27332OooO0O0 = 0;
    }

    public int OooO00o() {
        OooOo oooOo = this.f27331OooO00o;
        if (oooOo != null) {
            return oooOo.f27326OooO0Oo;
        }
        return 0;
    }

    public int OooO0O0() {
        return OooO00o();
    }

    public void OooO0OO(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.onLayoutChild(view, i);
    }

    public boolean OooO0Oo(int i) {
        OooOo oooOo = this.f27331OooO00o;
        if (oooOo != null) {
            return oooOo.OooO0O0(i);
        }
        this.f27332OooO0O0 = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooO0OO(coordinatorLayout, view, i);
        if (this.f27331OooO00o == null) {
            this.f27331OooO00o = new OooOo(view);
        }
        OooOo oooOo = this.f27331OooO00o;
        View view2 = oooOo.f27323OooO00o;
        oooOo.f27324OooO0O0 = view2.getTop();
        oooOo.f27325OooO0OO = view2.getLeft();
        this.f27331OooO00o.OooO00o();
        int i2 = this.f27332OooO0O0;
        if (i2 == 0) {
            return true;
        }
        this.f27331OooO00o.OooO0O0(i2);
        this.f27332OooO0O0 = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27332OooO0O0 = 0;
    }
}

package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class OooOo00 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ HeaderBehavior f27327OooOo;

    /* renamed from: OooOo0O */
    public final CoordinatorLayout f27328OooOo0O;

    /* renamed from: OooOo0o */
    public final View f27329OooOo0o;

    public OooOo00(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, View view) {
        this.f27327OooOo = headerBehavior;
        this.f27328OooOo0O = coordinatorLayout;
        this.f27329OooOo0o = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HeaderBehavior headerBehavior;
        OverScroller overScroller;
        View view = this.f27329OooOo0o;
        if (view == null || (overScroller = (headerBehavior = this.f27327OooOo).f27289OooO0Oo) == null) {
            return;
        }
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.f27328OooOo0O;
        if (!zComputeScrollOffset) {
            headerBehavior.OooO0oo(coordinatorLayout, view);
        } else {
            headerBehavior.OooOO0(coordinatorLayout, view, headerBehavior.f27289OooO0Oo.getCurrY());
            ViewCompat.postOnAnimation(view, this);
        }
    }
}

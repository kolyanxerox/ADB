package com.google.android.material.behavior;

import OooooOO.oOO;
import OooooOO.oOOO000o;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: OooO00o, reason: collision with root package name */
    public ViewDragHelper f27338OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f27339OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f27340OooO0OO = 2;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final float f27341OooO0Oo = 0.5f;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public float f27343OooO0o0 = 0.0f;

    /* renamed from: OooO0o, reason: collision with root package name */
    public float f27342OooO0o = 0.5f;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final oOO f27344OooO0oO = new oOO(this);

    public boolean OooO00o(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.f27339OooO0O0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f27339OooO0O0 = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f27339OooO0O0 = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        if (this.f27338OooO00o == null) {
            this.f27338OooO00o = ViewDragHelper.create(coordinatorLayout, this.f27344OooO0oO);
        }
        return this.f27338OooO00o.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, view, i);
        if (ViewCompat.getImportantForAccessibility(view) == 0) {
            ViewCompat.setImportantForAccessibility(view, 1);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            if (OooO00o(view)) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new oOOO000o(this));
            }
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.f27338OooO00o;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }
}

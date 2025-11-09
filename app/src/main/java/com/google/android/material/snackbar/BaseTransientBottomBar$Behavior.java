package com.google.android.material.snackbar;

import OooOOoo.o0000OO0;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o000000O.OooO0O0;
import o000000O.OooO0o;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f27812OooO0oo;

    public BaseTransientBottomBar$Behavior() {
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f27343OooO0o0 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f27342OooO0o = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f27340OooO0OO = 0;
        this.f27812OooO0oo = oooO0O0;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean OooO00o(View view) {
        this.f27812OooO0oo.getClass();
        return view instanceof OooO0o;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f27812OooO0oo.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (o0000OO0.f13529OooOo == null) {
                    o0000OO0.f13529OooOo = new o0000OO0();
                }
                synchronized (o0000OO0.f13529OooOo.f13531OooOo0o) {
                }
            }
        } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (o0000OO0.f13529OooOo == null) {
                o0000OO0.f13529OooOo = new o0000OO0();
            }
            synchronized (o0000OO0.f13529OooOo.f13531OooOo0o) {
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }
}

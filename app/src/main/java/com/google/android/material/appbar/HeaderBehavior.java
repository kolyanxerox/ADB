package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;

/* loaded from: classes2.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: OooO, reason: collision with root package name */
    public VelocityTracker f27287OooO;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public OooOo00 f27288OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public OverScroller f27289OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f27290OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f27291OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f27292OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f27293OooO0oo;

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27290OooO0o = -1;
        this.f27293OooO0oo = -1;
    }

    public int OooO(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int iClamp;
        int iOooO00o = OooO00o();
        if (i2 == 0 || iOooO00o < i2 || iOooO00o > i3 || iOooO00o == (iClamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        OooO0Oo(iClamp);
        return iOooO00o - iClamp;
    }

    public int OooO0o(View view) {
        return -view.getHeight();
    }

    public boolean OooO0o0(View view) {
        return false;
    }

    public int OooO0oO(View view) {
        return view.getHeight();
    }

    public void OooO0oo(CoordinatorLayout coordinatorLayout, View view) {
    }

    public final void OooOO0(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooO(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.f27293OooO0oo
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f27293OooO0oo = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.f27291OooO0o0
            if (r0 == 0) goto L40
            int r0 = r6.f27290OooO0o
            if (r0 != r3) goto L25
            goto L8e
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            goto L8e
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.f27292OooO0oO
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.f27293OooO0oo
            if (r1 <= r5) goto L40
            r6.f27292OooO0oO = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L87
            r6.f27290OooO0o = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.OooO0o0(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.isPointInChildBounds(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = r2
            goto L61
        L60:
            r7 = r4
        L61:
            r6.f27291OooO0o0 = r7
            if (r7 == 0) goto L87
            r6.f27292OooO0oO = r1
            int r7 = r9.getPointerId(r4)
            r6.f27290OooO0o = r7
            android.view.VelocityTracker r7 = r6.f27287OooO
            if (r7 != 0) goto L77
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.f27287OooO = r7
        L77:
            android.widget.OverScroller r7 = r6.f27289OooO0Oo
            if (r7 == 0) goto L87
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L87
            android.widget.OverScroller r7 = r6.f27289OooO0Oo
            r7.abortAnimation()
            return r2
        L87:
            android.view.VelocityTracker r7 = r6.f27287OooO
            if (r7 == 0) goto L8e
            r7.addMovement(r9)
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}

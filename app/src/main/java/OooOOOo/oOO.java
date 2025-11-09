package OooooOO;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes2.dex */
public final class oOO extends ViewDragHelper.Callback {

    /* renamed from: OooO00o */
    public int f15039OooO00o;

    /* renamed from: OooO0O0 */
    public int f15040OooO0O0 = -1;

    /* renamed from: OooO0OO */
    public final /* synthetic */ SwipeDismissBehavior f15041OooO0OO;

    public oOO(SwipeDismissBehavior swipeDismissBehavior) {
        this.f15041OooO0OO = swipeDismissBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        int width;
        int width2;
        int width3;
        boolean z = ViewCompat.getLayoutDirection(view) == 1;
        int i3 = this.f15041OooO0OO.f27340OooO0OO;
        if (i3 == 0) {
            if (z) {
                width = this.f15039OooO00o - view.getWidth();
                width2 = this.f15039OooO00o;
            } else {
                width = this.f15039OooO00o;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 != 1) {
            width = this.f15039OooO00o - view.getWidth();
            width2 = view.getWidth() + this.f15039OooO00o;
        } else if (z) {
            width = this.f15039OooO00o;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f15039OooO00o - view.getWidth();
            width2 = this.f15039OooO00o;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewCaptured(View view, int i) {
        this.f15040OooO0O0 = i;
        this.f15039OooO00o = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i) {
        this.f15041OooO0OO.getClass();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        float f = this.f15039OooO00o;
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f15041OooO0OO;
        float f2 = (width * swipeDismissBehavior.f27343OooO0o0) + f;
        float width2 = (view.getWidth() * swipeDismissBehavior.f27342OooO0o) + this.f15039OooO00o;
        float f3 = i;
        if (f3 <= f2) {
            view.setAlpha(1.0f);
        } else if (f3 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0064  */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewReleased(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f15040OooO0O0 = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f15041OooO0OO
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L37
            int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r9)
            if (r5 != r3) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r4
        L19:
            int r6 = r2.f27340OooO0OO
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L64
            goto L50
        L28:
            if (r1 <= 0) goto L64
            goto L50
        L2b:
            if (r6 != r3) goto L64
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L64
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L64
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f15039OooO00o
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r2.f27341OooO0Oo
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L64
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f15039OooO00o
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L67
        L5f:
            int r10 = r8.f15039OooO00o
            int r0 = r10 - r11
            goto L67
        L64:
            int r0 = r8.f15039OooO00o
            r3 = r4
        L67:
            androidx.customview.widget.ViewDragHelper r10 = r2.f27338OooO00o
            int r11 = r9.getTop()
            boolean r10 = r10.settleCapturedViewAt(r0, r11)
            if (r10 == 0) goto L7b
            OooooOO.oOOO00 r10 = new OooooOO.oOOO00
            r10.<init>(r2, r9, r3)
            androidx.core.view.ViewCompat.postOnAnimation(r9, r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooooOO.oOO.onViewReleased(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View view, int i) {
        int i2 = this.f15040OooO0O0;
        return (i2 == -1 || i2 == i) && this.f15041OooO0OO.OooO00o(view);
    }
}

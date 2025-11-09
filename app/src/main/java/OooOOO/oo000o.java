package Oooooo;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class oo000o extends ViewDragHelper.Callback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f15094OooO00o;

    public oo000o(BottomSheetBehavior bottomSheetBehavior) {
        this.f15094OooO00o = bottomSheetBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        return view.getLeft();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View view, int i, int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.f15094OooO00o;
        return MathUtils.clamp(i, bottomSheetBehavior.OooO0o(), bottomSheetBehavior.f27406Oooo00O ? bottomSheetBehavior.f27415OoooO0 : bottomSheetBehavior.f27402OooOooo);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewVerticalDragRange(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f15094OooO00o;
        return bottomSheetBehavior.f27406Oooo00O ? bottomSheetBehavior.f27415OoooO0 : bottomSheetBehavior.f27402OooOooo;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f15094OooO00o;
            if (bottomSheetBehavior.f27404Oooo0) {
                bottomSheetBehavior.OooOO0(1);
            }
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        this.f15094OooO00o.OooO0OO(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewReleased(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooooo.oo000o.onViewReleased(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f15094OooO00o;
        int i2 = bottomSheetBehavior.f27408Oooo0O0;
        if (i2 == 1 || bottomSheetBehavior.f27421OoooOo0) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f27419OoooOOO == i) {
            WeakReference weakReference = bottomSheetBehavior.f27414OoooO;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.f27417OoooO0O;
        return weakReference2 != null && weakReference2.get() == view;
    }
}

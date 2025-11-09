package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.superadb.R;

/* loaded from: classes2.dex */
public final class OooO0OO extends AccessibilityDelegateCompat {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f27975OooO00o;

    public OooO0OO(ClockFaceView clockFaceView) {
        this.f27975OooO00o = clockFaceView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfoCompat.setTraversalAfter((View) this.f27975OooO00o.f27952OooOoo0.get(iIntValue - 1));
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfoCompat.setClickable(true);
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        ClockFaceView clockFaceView = this.f27975OooO00o;
        clockFaceView.f27949OooOoO0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, width, height, 0));
        clockFaceView.f27949OooOoO0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, width, height, 0));
        return true;
    }
}

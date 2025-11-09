package com.google.android.material.appbar;

import android.view.View;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes2.dex */
public final class OooO0OO extends AccessibilityDelegateCompat {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f27311OooO00o;

    public OooO0OO(AppBarLayout.BaseBehavior baseBehavior) {
        this.f27311OooO00o = baseBehavior;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setScrollable(this.f27311OooO00o.f27253OooOOOO);
        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
    }
}

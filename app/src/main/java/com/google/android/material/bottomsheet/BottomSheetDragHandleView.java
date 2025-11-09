package com.google.android.material.bottomsheet;

import OooO0oo.o00Oo0;
import Oooooo.o0OO00O;
import Oooooo.o0Oo0oo;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.superadb.R;
import java.util.ArrayList;
import o00000O.OooO00o;

/* loaded from: classes2.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f27425OooOooo = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f27426OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AccessibilityManager f27427OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public BottomSheetBehavior f27428OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f27429OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f27430OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final String f27431OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final String f27432OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final String f27433OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final o0Oo0oo f27434OooOooO;

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f27428OooOo0o;
        o0Oo0oo o0oo0oo = this.f27434OooOooO;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f27418OoooOO0.remove(o0oo0oo);
        }
        this.f27428OooOo0o = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            OooO0O0(bottomSheetBehavior.f27408Oooo0O0);
            ArrayList arrayList = this.f27428OooOo0o.f27418OoooOO0;
            if (!arrayList.contains(o0oo0oo)) {
                arrayList.add(o0oo0oo);
            }
        }
        OooO0OO();
    }

    public final boolean OooO00o() {
        if (!this.f27430OooOoO0) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.f27427OooOo0O;
        if (accessibilityManager != null) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.getText().add(this.f27432OooOoo);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
        BottomSheetBehavior bottomSheetBehavior = this.f27428OooOo0o;
        boolean z = bottomSheetBehavior.f27376OooO0O0;
        int i = bottomSheetBehavior.f27408Oooo0O0;
        int i2 = 6;
        int i3 = 3;
        if (i == 4) {
            if (z) {
                i2 = i3;
            }
        } else if (i != 3) {
            if (!this.f27429OooOoO) {
                i3 = 4;
            }
            i2 = i3;
        } else if (z) {
            i2 = 4;
        }
        bottomSheetBehavior.OooO(i2);
        return true;
    }

    public final void OooO0O0(int i) {
        if (i == 4) {
            this.f27429OooOoO = true;
        } else if (i == 3) {
            this.f27429OooOoO = false;
        }
        ViewCompat.replaceAccessibilityAction(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, this.f27429OooOoO ? this.f27431OooOoOO : this.f27433OooOoo0, new o00Oo0(this, 6));
    }

    public final void OooO0OO() {
        this.f27430OooOoO0 = this.f27426OooOo && this.f27428OooOo0o != null;
        ViewCompat.setImportantForAccessibility(this, this.f27428OooOo0o == null ? 2 : 1);
        setClickable(this.f27430OooOoO0);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f27426OooOo = z;
        OooO0OO();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.f27427OooOo0O;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f27427OooOo0O;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_Material3_BottomSheet_DragHandle), attributeSet, i);
        this.f27431OooOoOO = getResources().getString(R.string.bottomsheet_action_expand);
        this.f27433OooOoo0 = getResources().getString(R.string.bottomsheet_action_collapse);
        this.f27432OooOoo = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.f27434OooOooO = new o0Oo0oo(this);
        this.f27427OooOo0O = (AccessibilityManager) getContext().getSystemService("accessibility");
        OooO0OO();
        ViewCompat.setAccessibilityDelegate(this, new o0OO00O(this, 0));
    }
}

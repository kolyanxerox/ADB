package com.google.android.material.bottomsheet;

import OooO0oO.OooOo;
import Oooooo.o00O0O;
import Oooooo.o00Oo0;
import Oooooo.o00Ooo;
import Oooooo.o00oO0o;
import Oooooo.o0OOO0o;
import Oooooo.o0Oo0oo;
import Oooooo.o0ooOOo;
import Oooooo.oo000o;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import com.github.superadb.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import o000000.OooOOO0;
import o000000.Oooo000;
import o0ooOO0.o0000oo;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: OooO */
    public final ColorStateList f27374OooO;

    /* renamed from: OooO00o */
    public final int f27375OooO00o;

    /* renamed from: OooO0O0 */
    public boolean f27376OooO0O0;

    /* renamed from: OooO0OO */
    public final float f27377OooO0OO;

    /* renamed from: OooO0Oo */
    public int f27378OooO0Oo;

    /* renamed from: OooO0o */
    public int f27379OooO0o;

    /* renamed from: OooO0o0 */
    public boolean f27380OooO0o0;

    /* renamed from: OooO0oO */
    public final int f27381OooO0oO;

    /* renamed from: OooO0oo */
    public final OooOOO0 f27382OooO0oo;

    /* renamed from: OooOO0 */
    public final int f27383OooOO0;

    /* renamed from: OooOO0O */
    public final int f27384OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO */
    public final boolean f27385OooOOO;

    /* renamed from: OooOOO0 */
    public final boolean f27386OooOOO0;

    /* renamed from: OooOOOO */
    public final boolean f27387OooOOOO;

    /* renamed from: OooOOOo */
    public final boolean f27388OooOOOo;

    /* renamed from: OooOOo */
    public final boolean f27389OooOOo;

    /* renamed from: OooOOo0 */
    public final boolean f27390OooOOo0;

    /* renamed from: OooOOoo */
    public final boolean f27391OooOOoo;

    /* renamed from: OooOo */
    public boolean f27392OooOo;
    public int OooOo0;

    /* renamed from: OooOo00 */
    public final boolean f27393OooOo00;

    /* renamed from: OooOo0O */
    public int f27394OooOo0O;

    /* renamed from: OooOo0o */
    public final Oooo000 f27395OooOo0o;

    /* renamed from: OooOoO */
    public final ValueAnimator f27396OooOoO;

    /* renamed from: OooOoO0 */
    public final o0OOO0o f27397OooOoO0;

    /* renamed from: OooOoOO */
    public final int f27398OooOoOO;

    /* renamed from: OooOoo */
    public int f27399OooOoo;

    /* renamed from: OooOoo0 */
    public int f27400OooOoo0;

    /* renamed from: OooOooO */
    public final float f27401OooOooO;

    /* renamed from: OooOooo */
    public int f27402OooOooo;

    /* renamed from: Oooo */
    public int f27403Oooo;

    /* renamed from: Oooo0 */
    public final boolean f27404Oooo0;

    /* renamed from: Oooo000 */
    public final float f27405Oooo000;

    /* renamed from: Oooo00O */
    public boolean f27406Oooo00O;

    /* renamed from: Oooo00o */
    public boolean f27407Oooo00o;

    /* renamed from: Oooo0O0 */
    public int f27408Oooo0O0;

    /* renamed from: Oooo0OO */
    public ViewDragHelper f27409Oooo0OO;

    /* renamed from: Oooo0o */
    public int f27410Oooo0o;

    /* renamed from: Oooo0o0 */
    public boolean f27411Oooo0o0;

    /* renamed from: Oooo0oO */
    public boolean f27412Oooo0oO;

    /* renamed from: Oooo0oo */
    public final float f27413Oooo0oo;

    /* renamed from: OoooO */
    public WeakReference f27414OoooO;

    /* renamed from: OoooO0 */
    public int f27415OoooO0;

    /* renamed from: OoooO00 */
    public int f27416OoooO00;

    /* renamed from: OoooO0O */
    public WeakReference f27417OoooO0O;

    /* renamed from: OoooOO0 */
    public final ArrayList f27418OoooOO0;

    /* renamed from: OoooOOO */
    public int f27419OoooOOO;

    /* renamed from: OoooOOo */
    public int f27420OoooOOo;

    /* renamed from: OoooOo0 */
    public boolean f27421OoooOo0;

    /* renamed from: OoooOoO */
    public HashMap f27422OoooOoO;

    /* renamed from: OoooOoo */
    public int f27423OoooOoo;

    /* renamed from: Ooooo00 */
    public final oo000o f27424Ooooo00;
    public VelocityTracker o000oOoO;

    public BottomSheetBehavior() {
        this.f27375OooO00o = 0;
        this.f27376OooO0O0 = true;
        this.f27383OooOO0 = -1;
        this.f27384OooOO0O = -1;
        this.f27397OooOoO0 = new o0OOO0o(this);
        this.f27401OooOooO = 0.5f;
        this.f27405Oooo000 = -1.0f;
        this.f27404Oooo0 = true;
        this.f27408Oooo0O0 = 4;
        this.f27413Oooo0oo = 0.1f;
        this.f27418OoooOO0 = new ArrayList();
        this.f27423OoooOoo = -1;
        this.f27424Ooooo00 = new oo000o(this);
    }

    public static View OooO0Oo(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewOooO0Oo = OooO0Oo(viewGroup.getChildAt(i));
            if (viewOooO0Oo != null) {
                return viewOooO0Oo;
            }
        }
        return null;
    }

    public static int OooO0o0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), BasicMeasure.EXACTLY);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void OooO(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(OooOo.OooOOOo(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f27406Oooo00O && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f27376OooO0O0 && OooO0oO(i) <= this.f27400OooOoo0) ? 3 : i;
        WeakReference weakReference = this.f27417OoooO0O;
        if (weakReference == null || weakReference.get() == null) {
            OooOO0(i);
            return;
        }
        View view = (View) this.f27417OoooO0O.get();
        o00O0O o00o0o = new o00O0O(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
            view.post(o00o0o);
        } else {
            o00o0o.run();
        }
    }

    public final void OooO00o() {
        int iOooO0O0 = OooO0O0();
        if (this.f27376OooO0O0) {
            this.f27402OooOooo = Math.max(this.f27415OoooO0 - iOooO0O0, this.f27400OooOoo0);
        } else {
            this.f27402OooOooo = this.f27415OoooO0 - iOooO0O0;
        }
    }

    public final int OooO0O0() {
        int i;
        return this.f27380OooO0o0 ? Math.min(Math.max(this.f27379OooO0o, this.f27415OoooO0 - ((this.f27416OoooO00 * 9) / 16)), this.f27403Oooo) + this.OooOo0 : (this.f27386OooOOO0 || this.f27385OooOOO || (i = this.OooOO0o) <= 0) ? this.f27378OooO0Oo + this.OooOo0 : Math.max(this.f27378OooO0Oo, i + this.f27381OooO0oO);
    }

    public final void OooO0OO(int i) {
        if (((View) this.f27417OoooO0O.get()) != null) {
            ArrayList arrayList = this.f27418OoooOO0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f27402OooOooo;
            if (i <= i2 && i2 != OooO0o()) {
                OooO0o();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((o0Oo0oo) arrayList.get(i3)).getClass();
            }
        }
    }

    public final int OooO0o() {
        if (this.f27376OooO0O0) {
            return this.f27400OooOoo0;
        }
        return Math.max(this.f27398OooOoOO, this.f27390OooOOo0 ? 0 : this.f27394OooOo0O);
    }

    public final int OooO0oO(int i) {
        if (i == 3) {
            return OooO0o();
        }
        if (i == 4) {
            return this.f27402OooOooo;
        }
        if (i == 5) {
            return this.f27415OoooO0;
        }
        if (i == 6) {
            return this.f27399OooOoo;
        }
        throw new IllegalArgumentException(OooOo.OooO0o(i, "Invalid state to get top offset: "));
    }

    public final void OooO0oo(int i) {
        if (i == -1) {
            if (this.f27380OooO0o0) {
                return;
            } else {
                this.f27380OooO0o0 = true;
            }
        } else {
            if (!this.f27380OooO0o0 && this.f27378OooO0Oo == i) {
                return;
            }
            this.f27380OooO0o0 = false;
            this.f27378OooO0Oo = Math.max(0, i);
        }
        OooOOOo();
    }

    public final void OooOO0(int i) {
        if (this.f27408Oooo0O0 == i) {
            return;
        }
        this.f27408Oooo0O0 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f27406Oooo00O;
        }
        WeakReference weakReference = this.f27417OoooO0O;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            OooOOOO(true);
        } else if (i == 6 || i == 5 || i == 4) {
            OooOOOO(false);
        }
        OooOOO(i);
        while (true) {
            ArrayList arrayList = this.f27418OoooOO0;
            if (i2 >= arrayList.size()) {
                OooOOO0();
                return;
            }
            o0Oo0oo o0oo0oo = (o0Oo0oo) arrayList.get(i2);
            o0oo0oo.getClass();
            int i3 = BottomSheetDragHandleView.f27425OooOooo;
            o0oo0oo.f15088OooO00o.OooO0O0(i);
            i2++;
        }
    }

    public final boolean OooOO0O(View view, float f) {
        if (this.f27407Oooo00o) {
            return true;
        }
        if (view.getTop() < this.f27402OooOooo) {
            return false;
        }
        return Math.abs(((f * this.f27413Oooo0oo) + ((float) view.getTop())) - ((float) this.f27402OooOooo)) / ((float) OooO0O0()) > 0.5f;
    }

    public final void OooOO0o(View view, int i, boolean z) {
        int iOooO0oO = OooO0oO(i);
        ViewDragHelper viewDragHelper = this.f27409Oooo0OO;
        if (viewDragHelper == null || (!z ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), iOooO0oO) : viewDragHelper.settleCapturedViewAt(view.getLeft(), iOooO0oO))) {
            OooOO0(i);
            return;
        }
        OooOO0(2);
        OooOOO(i);
        this.f27397OooOoO0.OooO00o(i);
    }

    public final void OooOOO(int i) {
        ValueAnimator valueAnimator = this.f27396OooOoO;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f27392OooOo != z) {
            this.f27392OooOo = z;
            if (this.f27382OooO0oo == null || valueAnimator == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f, f);
            valueAnimator.start();
        }
    }

    public final void OooOOO0() {
        View view;
        WeakReference weakReference = this.f27417OoooO0O;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 524288);
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        int i = this.f27423OoooOoo;
        if (i != -1) {
            ViewCompat.removeAccessibilityAction(view, i);
        }
        if (!this.f27376OooO0O0 && this.f27408Oooo0O0 != 6) {
            this.f27423OoooOoo = ViewCompat.addAccessibilityAction(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new o00oO0o(this, 6));
        }
        if (this.f27406Oooo00O && this.f27408Oooo0O0 != 5) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new o00oO0o(this, 5));
        }
        int i2 = this.f27408Oooo0O0;
        if (i2 == 3) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, null, new o00oO0o(this, this.f27376OooO0O0 ? 4 : 6));
            return;
        }
        if (i2 == 4) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new o00oO0o(this, this.f27376OooO0O0 ? 3 : 6));
        } else {
            if (i2 != 6) {
                return;
            }
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, null, new o00oO0o(this, 4));
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new o00oO0o(this, 3));
        }
    }

    public final void OooOOOO(boolean z) {
        WeakReference weakReference = this.f27417OoooO0O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f27422OoooOoO != null) {
                    return;
                } else {
                    this.f27422OoooOoO = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f27417OoooO0O.get() && z) {
                    this.f27422OoooOoO.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f27422OoooOoO = null;
        }
    }

    public final void OooOOOo() {
        View view;
        if (this.f27417OoooO0O != null) {
            OooO00o();
            if (this.f27408Oooo0O0 != 4 || (view = (View) this.f27417OoooO0O.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f27417OoooO0O = null;
        this.f27409Oooo0OO = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f27417OoooO0O = null;
        this.f27409Oooo0OO = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!view.isShown() || !this.f27404Oooo0) {
            this.f27411Oooo0o0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f27419OoooOOO = -1;
            VelocityTracker velocityTracker = this.o000oOoO;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.o000oOoO = null;
            }
        }
        if (this.o000oOoO == null) {
            this.o000oOoO = VelocityTracker.obtain();
        }
        this.o000oOoO.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f27420OoooOOo = (int) motionEvent.getY();
            if (this.f27408Oooo0O0 != 2) {
                WeakReference weakReference = this.f27414OoooO;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x, this.f27420OoooOOo)) {
                    this.f27419OoooOOO = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f27421OoooOo0 = true;
                }
            }
            this.f27411Oooo0o0 = this.f27419OoooOOO == -1 && !coordinatorLayout.isPointInChildBounds(view, x, this.f27420OoooOOo);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f27421OoooOo0 = false;
            this.f27419OoooOOO = -1;
            if (this.f27411Oooo0o0) {
                this.f27411Oooo0o0 = false;
                return false;
            }
        }
        if (this.f27411Oooo0o0 || (viewDragHelper = this.f27409Oooo0OO) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            WeakReference weakReference2 = this.f27414OoooO;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f27411Oooo0o0 || this.f27408Oooo0O0 == 1 || coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f27409Oooo0OO == null || Math.abs(this.f27420OoooOOo - motionEvent.getY()) <= this.f27409Oooo0OO.getTouchSlop()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.f27417OoooO0O == null) {
            this.f27379OooO0o = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f27386OooOOO0 || this.f27380OooO0o0) ? false : true;
            if (this.f27385OooOOO || this.f27387OooOOOO || this.f27388OooOOOo || this.f27389OooOOo || this.f27391OooOOoo || this.f27393OooOo00 || z) {
                o0000oo.OooO00o(view, new o00Ooo(this, z));
            }
            this.f27417OoooO0O = new WeakReference(view);
            OooOOO0 oooOOO0 = this.f27382OooO0oo;
            if (oooOOO0 != null) {
                ViewCompat.setBackground(view, oooOOO0);
                OooOOO0 oooOOO02 = this.f27382OooO0oo;
                float elevation = this.f27405Oooo000;
                if (elevation == -1.0f) {
                    elevation = ViewCompat.getElevation(view);
                }
                oooOOO02.OooOO0o(elevation);
                boolean z2 = this.f27408Oooo0O0 == 3;
                this.f27392OooOo = z2;
                this.f27382OooO0oo.OooOOO(z2 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f27374OooO;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(view, colorStateList);
                }
            }
            OooOOO0();
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
            }
        }
        if (this.f27409Oooo0OO == null) {
            this.f27409Oooo0OO = ViewDragHelper.create(coordinatorLayout, this.f27424Ooooo00);
        }
        int top = view.getTop();
        coordinatorLayout.onLayoutChild(view, i);
        this.f27416OoooO00 = coordinatorLayout.getWidth();
        this.f27415OoooO0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f27403Oooo = height;
        int i3 = this.f27415OoooO0;
        int i4 = i3 - height;
        int i5 = this.f27394OooOo0O;
        if (i4 < i5) {
            if (this.f27390OooOOo0) {
                this.f27403Oooo = i3;
            } else {
                this.f27403Oooo = i3 - i5;
            }
        }
        this.f27400OooOoo0 = Math.max(0, i3 - this.f27403Oooo);
        this.f27399OooOoo = (int) ((1.0f - this.f27401OooOooO) * this.f27415OoooO0);
        OooO00o();
        int i6 = this.f27408Oooo0O0;
        if (i6 == 3) {
            ViewCompat.offsetTopAndBottom(view, OooO0o());
        } else if (i6 == 6) {
            ViewCompat.offsetTopAndBottom(view, this.f27399OooOoo);
        } else if (this.f27406Oooo00O && i6 == 5) {
            ViewCompat.offsetTopAndBottom(view, this.f27415OoooO0);
        } else if (i6 == 4) {
            ViewCompat.offsetTopAndBottom(view, this.f27402OooOooo);
        } else if (i6 == 1 || i6 == 2) {
            ViewCompat.offsetTopAndBottom(view, top - view.getTop());
        }
        this.f27414OoooO = new WeakReference(OooO0Oo(view));
        while (true) {
            ArrayList arrayList = this.f27418OoooOO0;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((o0Oo0oo) arrayList.get(i2)).getClass();
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(OooO0o0(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f27383OooOO0, marginLayoutParams.width), OooO0o0(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f27384OooOO0O, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference = this.f27414OoooO;
        return weakReference != null && view2 == weakReference.get() && (this.f27408Oooo0O0 != 3 || super.onNestedPreFling(coordinatorLayout, view, view2, f, f2));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f27414OoooO;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < OooO0o()) {
                int iOooO0o = top - OooO0o();
                iArr[1] = iOooO0o;
                ViewCompat.offsetTopAndBottom(view, -iOooO0o);
                OooOO0(3);
            } else {
                if (!this.f27404Oooo0) {
                    return;
                }
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(view, -i2);
                OooOO0(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f27402OooOooo;
            if (i4 > i5 && !this.f27406Oooo00O) {
                int i6 = top - i5;
                iArr[1] = i6;
                ViewCompat.offsetTopAndBottom(view, -i6);
                OooOO0(4);
            } else {
                if (!this.f27404Oooo0) {
                    return;
                }
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(view, -i2);
                OooOO0(1);
            }
        }
        OooO0OO(view.getTop());
        this.f27410Oooo0o = i2;
        this.f27412Oooo0oO = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        o0ooOOo o0ooooo = (o0ooOOo) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, view, o0ooooo.getSuperState());
        int i = this.f27375OooO00o;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f27378OooO0Oo = o0ooooo.f15091OooOo0o;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f27376OooO0O0 = o0ooooo.f15089OooOo;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f27406Oooo00O = o0ooooo.f15093OooOoO0;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f27407Oooo00o = o0ooooo.f15092OooOoO;
            }
        }
        int i2 = o0ooooo.f15090OooOo0O;
        if (i2 == 1 || i2 == 2) {
            this.f27408Oooo0O0 = 4;
        } else {
            this.f27408Oooo0O0 = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new o0ooOOo(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f27410Oooo0o = 0;
        this.f27412Oooo0oO = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0055  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.OooO0o()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.OooOO0(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.f27414OoooO
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.f27412Oooo0oO
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.f27410Oooo0o
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f27376OooO0O0
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.f27399OooOoo
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.f27406Oooo00O
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.o000oOoO
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f27377OooO0OO
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.o000oOoO
            int r6 = r2.f27419OoooOOO
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.OooOO0O(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.f27410Oooo0o
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f27376OooO0O0
            if (r1 == 0) goto L74
            int r5 = r2.f27400OooOoo0
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f27402OooOooo
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.f27399OooOoo
            if (r3 >= r1) goto L83
            int r6 = r2.f27402OooOooo
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f27402OooOooo
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f27376OooO0O0
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.f27399OooOoo
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f27402OooOooo
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.OooOO0o(r4, r0, r3)
            r2.f27412Oooo0oO = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f27408Oooo0O0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.f27409Oooo0OO;
        if (viewDragHelper != null && (this.f27404Oooo0 || i == 1)) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.f27419OoooOOO = -1;
            VelocityTracker velocityTracker = this.o000oOoO;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.o000oOoO = null;
            }
        }
        if (this.o000oOoO == null) {
            this.o000oOoO = VelocityTracker.obtain();
        }
        this.o000oOoO.addMovement(motionEvent);
        if (this.f27409Oooo0OO != null && ((this.f27404Oooo0 || this.f27408Oooo0O0 == 1) && actionMasked == 2 && !this.f27411Oooo0o0 && Math.abs(this.f27420OoooOOo - motionEvent.getY()) > this.f27409Oooo0OO.getTouchSlop())) {
            this.f27409Oooo0OO.captureChildView(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f27411Oooo0o0;
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f27375OooO00o = 0;
        this.f27376OooO0O0 = true;
        this.f27383OooOO0 = -1;
        this.f27384OooOO0O = -1;
        this.f27397OooOoO0 = new o0OOO0o(this);
        this.f27401OooOooO = 0.5f;
        this.f27405Oooo000 = -1.0f;
        this.f27404Oooo0 = true;
        this.f27408Oooo0O0 = 4;
        this.f27413Oooo0oo = 0.1f;
        this.f27418OoooOO0 = new ArrayList();
        this.f27423OoooOoo = -1;
        this.f27424Ooooo00 = new oo000o(this);
        this.f27381OooO0oO = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Ooooo00.OooOo.f14957OooO0oO);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f27374OooO = OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            this.f27395OooOo0o = Oooo000.OooO0O0(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).OooO00o();
        }
        Oooo000 oooo000 = this.f27395OooOo0o;
        if (oooo000 != null) {
            OooOOO0 oooOOO0 = new OooOOO0(oooo000);
            this.f27382OooO0oo = oooOOO0;
            oooOOO0.OooOO0O(context);
            ColorStateList colorStateList = this.f27374OooO;
            if (colorStateList != null) {
                this.f27382OooO0oo.OooOOO0(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f27382OooO0oo.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f27396OooOoO = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f27396OooOoO.addUpdateListener(new o00Oo0(this, 0));
        this.f27405Oooo000 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f27383OooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f27384OooOO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            OooO0oo(i);
        } else {
            OooO0oo(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f27406Oooo00O != z) {
            this.f27406Oooo00O = z;
            if (!z && this.f27408Oooo0O0 == 5) {
                OooO(4);
            }
            OooOOO0();
        }
        this.f27386OooOOO0 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f27376OooO0O0 != z2) {
            this.f27376OooO0O0 = z2;
            if (this.f27417OoooO0O != null) {
                OooO00o();
            }
            OooOO0((this.f27376OooO0O0 && this.f27408Oooo0O0 == 6) ? 3 : this.f27408Oooo0O0);
            OooOOO0();
        }
        this.f27407Oooo00o = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f27404Oooo0 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f27375OooO00o = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f27401OooOooO = f;
            if (this.f27417OoooO0O != null) {
                this.f27399OooOoo = (int) ((1.0f - f) * this.f27415OoooO0);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i2 = typedValuePeekValue2.data;
                if (i2 >= 0) {
                    this.f27398OooOoOO = i2;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f27398OooOoOO = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f27385OooOOO = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f27387OooOOOO = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f27388OooOOOo = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f27390OooOOo0 = typedArrayObtainStyledAttributes.getBoolean(19, true);
            this.f27389OooOOo = typedArrayObtainStyledAttributes.getBoolean(13, false);
            this.f27391OooOOoo = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f27393OooOo00 = typedArrayObtainStyledAttributes.getBoolean(15, false);
            typedArrayObtainStyledAttributes.recycle();
            this.f27377OooO0OO = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}

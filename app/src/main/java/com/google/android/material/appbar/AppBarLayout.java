package com.google.android.material.appbar;

import Ooooo0o.oo0o0O0;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.github.superadb.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: OooOo */
    public int f27230OooOo;

    /* renamed from: OooOo0O */
    public int f27231OooOo0O;

    /* renamed from: OooOo0o */
    public int f27232OooOo0o;

    /* renamed from: OooOoO */
    public boolean f27233OooOoO;

    /* renamed from: OooOoO0 */
    public int f27234OooOoO0;

    /* renamed from: OooOoOO */
    public int f27235OooOoOO;

    /* renamed from: OooOoo */
    public ArrayList f27236OooOoo;

    /* renamed from: OooOoo0 */
    public WindowInsetsCompat f27237OooOoo0;

    /* renamed from: OooOooO */
    public boolean f27238OooOooO;

    /* renamed from: OooOooo */
    public boolean f27239OooOooo;

    /* renamed from: Oooo0 */
    public WeakReference f27240Oooo0;

    /* renamed from: Oooo000 */
    public boolean f27241Oooo000;

    /* renamed from: Oooo00O */
    public boolean f27242Oooo00O;

    /* renamed from: Oooo00o */
    public int f27243Oooo00o;

    /* renamed from: Oooo0O0 */
    public ValueAnimator f27244Oooo0O0;

    /* renamed from: Oooo0OO */
    public final ArrayList f27245Oooo0OO;

    /* renamed from: Oooo0o */
    public Drawable f27246Oooo0o;

    /* renamed from: Oooo0o0 */
    public int[] f27247Oooo0o0;

    /* renamed from: Oooo0oO */
    public Behavior f27248Oooo0oO;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: OooO00o */
        public int f27254OooO00o;

        /* renamed from: OooO0O0 */
        public final OooO0oO.OooOOO0 f27255OooO0O0;

        /* renamed from: OooO0OO */
        public final Interpolator f27256OooO0OO;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27254OooO00o = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Ooooo00.OooOo.f14952OooO0O0);
            this.f27254OooO00o = typedArrayObtainStyledAttributes.getInt(1, 0);
            this.f27255OooO0O0 = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new OooO0oO.OooOOO0(21);
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.f27256OooO0OO = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float OooO0o(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            int iOooO0O0 = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).OooO0O0() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iOooO0O0 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                return (iOooO0O0 / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final AppBarLayout OooO0o0(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int OooO0oO(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            int iClamp;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f27249OooOO0 + this.f27297OooO0o0;
                if (this.f27296OooO0o == 0) {
                    iClamp = 0;
                } else {
                    float fOooO0o = OooO0o(view2);
                    int i = this.f27296OooO0o;
                    iClamp = MathUtils.clamp((int) (fOooO0o * i), 0, i);
                }
                ViewCompat.offsetTopAndBottom(view, bottom - iClamp);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f27242Oooo00O) {
                    appBarLayout.OooO0o0(appBarLayout.OooO0o(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f27294OooO0OO;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.OooO0Oo(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Ooooo00.OooOo.f14993OoooO0O);
            this.f27296OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public static LayoutParams OooO00o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f27254OooO00o = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f27254OooO00o = 1;
            return layoutParams3;
        }
        LayoutParams layoutParams4 = new LayoutParams(layoutParams);
        layoutParams4.f27254OooO00o = 1;
        return layoutParams4;
    }

    public final void OooO0O0() {
        Behavior behavior = this.f27248Oooo0oO;
        OooOO0O oooOO0OOooOOO = (behavior == null || this.f27232OooOo0o == -1 || this.f27235OooOoOO != 0) ? null : behavior.OooOOO(AbsSavedState.EMPTY_STATE, this);
        this.f27232OooOo0o = -1;
        this.f27230OooOo = -1;
        this.f27234OooOoO0 = -1;
        if (oooOO0OOooOOO != null) {
            Behavior behavior2 = this.f27248Oooo0oO;
            if (behavior2.f27252OooOOO0 != null) {
                return;
            }
            behavior2.f27252OooOOO0 = oooOO0OOooOOO;
        }
    }

    public final void OooO0OO(int i) {
        this.f27231OooOo0O = i;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        ArrayList arrayList = this.f27236OooOoo;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooOOO0 oooOOO0 = (OooOOO0) this.f27236OooOoo.get(i2);
                if (oooOOO0 != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = ((OooOOO) oooOOO0).f27322OooO00o;
                    collapsingToolbarLayout.f27279OoooO0 = i;
                    WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f27278OoooO;
                    int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i3);
                        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams();
                        OooOo oooOoOooO0O0 = CollapsingToolbarLayout.OooO0O0(childAt);
                        int i4 = layoutParams.f27285OooO00o;
                        if (i4 == 1) {
                            oooOoOooO0O0.OooO0O0(MathUtils.clamp(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.OooO0O0(childAt).f27324OooO0O0) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin));
                        } else if (i4 == 2) {
                            oooOoOooO0O0.OooO0O0(Math.round((-i) * layoutParams.f27286OooO0O0));
                        }
                    }
                    collapsingToolbarLayout.OooO0Oo();
                    if (collapsingToolbarLayout.f27273Oooo0OO != null && systemWindowInsetTop > 0) {
                        ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout);
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    int minimumHeight = (height - ViewCompat.getMinimumHeight(collapsingToolbarLayout)) - systemWindowInsetTop;
                    float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    float f = minimumHeight;
                    float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
                    o0ooOO0.OooOO0 oooOO0 = collapsingToolbarLayout.f27269Oooo000;
                    oooOO0.f33017OooO0Oo = fMin;
                    oooOO0.f33019OooO0o0 = OooO0oO.OooOo.OooO00o(1.0f, fMin, 0.5f, fMin);
                    oooOO0.f33018OooO0o = collapsingToolbarLayout.f27279OoooO0 + minimumHeight;
                    oooOO0.OooOOOo(Math.abs(i) / f);
                }
            }
        }
    }

    public final void OooO0Oo(boolean z, boolean z2, boolean z3) {
        this.f27235OooOoOO = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean OooO0o(View view) {
        int i;
        if (this.f27240Oooo0 == null && (i = this.f27243Oooo00o) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f27243Oooo00o);
            }
            if (viewFindViewById != null) {
                this.f27240Oooo0 = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f27240Oooo0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean OooO0o0(boolean z) throws Resources.NotFoundException {
        if (this.f27238OooOooO || this.f27241Oooo000 == z) {
            return false;
        }
        this.f27241Oooo000 = z;
        refreshDrawableState();
        if (this.f27242Oooo00O && (getBackground() instanceof o000000.OooOOO0)) {
            o000000.OooOOO0 oooOOO0 = (o000000.OooOOO0) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f27244Oooo0O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.f27244Oooo0O0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f27244Oooo0O0.setInterpolator(oo0o0O0.f15015OooO00o);
            this.f27244Oooo0O0.addUpdateListener(new OooO00o(this, oooOOO0));
            this.f27244Oooo0O0.start();
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f27246Oooo0o == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f27231OooOo0O);
        this.f27246Oooo0o.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f27246Oooo0o;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f27254OooO00o = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO00o(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f27248Oooo0oO = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f27230OooOo;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.f27254OooO00o;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.f27230OooOo = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f27234OooOoO0;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i3 = layoutParams.f27254OooO00o;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f27234OooOoO0 = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f27243Oooo00o;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f27235OooOoOO;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f27246Oooo0o;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f27237OooOoo0;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f27232OooOo0o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.f27254OooO00o;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + minimumHeight;
                if (i2 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    minimumHeight -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f27232OooOo0o = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Oooo0o0.OooO.OooOo0O(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f27247Oooo0o0 == null) {
            this.f27247Oooo0o0 = new int[4];
        }
        int[] iArr = this.f27247Oooo0o0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f27239OooOooo;
        iArr[0] = z ? R.attr.state_liftable : -2130903986;
        iArr[1] = (z && this.f27241Oooo000) ? R.attr.state_lifted : -2130903987;
        iArr[2] = z ? R.attr.state_collapsible : -2130903982;
        iArr[3] = (z && this.f27241Oooo000) ? R.attr.state_collapsed : -2130903981;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f27240Oooo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27240Oooo0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = false;
        if (ViewCompat.getFitsSystemWindows(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(childAt)) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
                }
            }
        }
        OooO0O0();
        this.f27233OooOoO = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).f27256OooO0OO != null) {
                this.f27233OooOoO = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.f27246Oooo0o;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f27238OooOooO) {
            return;
        }
        if (this.f27242Oooo00O) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).f27254OooO00o;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.f27239OooOooo != z2) {
            this.f27239OooOooo = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(childAt)) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = MathUtils.clamp(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        OooO0O0();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        Oooo0o0.OooO.OooOo00(this, f);
    }

    public void setExpanded(boolean z) {
        OooO0Oo(z, ViewCompat.isLaidOut(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f27242Oooo00O = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f27243Oooo00o = -1;
        if (view != null) {
            this.f27240Oooo0 = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f27240Oooo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27240Oooo0 = null;
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i) {
        this.f27243Oooo00o = i;
        WeakReference weakReference = this.f27240Oooo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27240Oooo0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f27238OooOooO = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f27246Oooo0o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f27246Oooo0o = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f27246Oooo0o.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f27246Oooo0o, ViewCompat.getLayoutDirection(this));
                this.f27246Oooo0o.setVisible(getVisibility() == 0, false);
                this.f27246Oooo0o.setCallback(this);
            }
            if (this.f27246Oooo0o != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        Oooo000.OooO00o(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f27246Oooo0o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f27246Oooo0o;
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.f27232OooOo0o = -1;
        this.f27230OooOo = -1;
        this.f27234OooOoO0 = -1;
        this.f27235OooOoOO = 0;
        this.f27245Oooo0OO = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context3, attributeSet, Oooo000.f27330OooO00o, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayOooO0Oo.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayOooO0Oo.getResourceId(0, 0)));
            }
            typedArrayOooO0Oo.recycle();
            TypedArray typedArrayOooO0Oo2 = o00000O0.OooO0Oo(context2, attributeSet, Ooooo00.OooOo.f14951OooO00o, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            ViewCompat.setBackground(this, typedArrayOooO0Oo2.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0();
                oooOOO0.OooOOO0(ColorStateList.valueOf(colorDrawable.getColor()));
                oooOOO0.OooOO0O(context2);
                ViewCompat.setBackground(this, oooOOO0);
            }
            if (typedArrayOooO0Oo2.hasValue(4)) {
                OooO0Oo(typedArrayOooO0Oo2.getBoolean(4, false), false, false);
            }
            if (typedArrayOooO0Oo2.hasValue(3)) {
                Oooo000.OooO00o(this, typedArrayOooO0Oo2.getDimensionPixelSize(3, 0));
            }
            if (i2 >= 26) {
                if (typedArrayOooO0Oo2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayOooO0Oo2.getBoolean(2, false));
                }
                if (typedArrayOooO0Oo2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayOooO0Oo2.getBoolean(1, false));
                }
            }
            this.f27242Oooo00O = typedArrayOooO0Oo2.getBoolean(5, false);
            this.f27243Oooo00o = typedArrayOooO0Oo2.getResourceId(6, -1);
            setStatusBarForeground(typedArrayOooO0Oo2.getDrawable(7));
            typedArrayOooO0Oo2.recycle();
            ViewCompat.setOnApplyWindowInsetsListener(this, new o000Ooo0.OooOO0(this, 18));
        } catch (Throwable th) {
            typedArrayOooO0Oo.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO00o(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: OooOO0 */
        public int f27249OooOO0;

        /* renamed from: OooOO0O */
        public int f27250OooOO0O;
        public ValueAnimator OooOO0o;

        /* renamed from: OooOOO */
        public WeakReference f27251OooOOO;

        /* renamed from: OooOOO0 */
        public OooOO0O f27252OooOOO0;

        /* renamed from: OooOOOO */
        public boolean f27253OooOOOO;

        public BaseBehavior() {
            this.f27290OooO0o = -1;
            this.f27293OooO0oo = -1;
        }

        public static View OooOO0o(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void OooOOo0(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) throws android.content.res.Resources.NotFoundException {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L5a
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
                int r0 = r0.f27254OooO00o
                r1 = r0 & 1
                if (r1 == 0) goto L5a
                int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
                r3 = 1
                if (r9 <= 0) goto L48
                r9 = r0 & 12
                if (r9 == 0) goto L48
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L48:
                r9 = r0 & 2
                if (r9 == 0) goto L5a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L5a:
                r3 = r2
            L5b:
                boolean r8 = r7.f27242Oooo00O
                if (r8 == 0) goto L67
                android.view.View r8 = OooOO0o(r6)
                boolean r3 = r7.OooO0o(r8)
            L67:
                boolean r8 = r7.OooO0o0(r3)
                if (r10 != 0) goto L98
                if (r8 == 0) goto L97
                java.util.List r6 = r6.getDependents(r7)
                int r8 = r6.size()
            L77:
                if (r2 >= r8) goto L97
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r9
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r9 = r9.getBehavior()
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto L94
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.f27296OooO0o
                if (r6 == 0) goto L97
                goto L98
            L94:
                int r2 = r2 + 1
                goto L77
            L97:
                return
            L98:
                r7.jumpDrawablesToCurrentState()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.OooOOo0(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x009b  */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int OooO(androidx.coordinatorlayout.widget.CoordinatorLayout r17, android.view.View r18, int r19, int r20, int r21) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 316
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.OooO(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final int OooO0O0() {
            return OooO00o() + this.f27249OooOO0;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooO0o(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final boolean OooO0o0(View view) {
            WeakReference weakReference = this.f27251OooOOO;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooO0oO(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final void OooO0oo(CoordinatorLayout coordinatorLayout, View view) throws Resources.NotFoundException {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            OooOOOO(coordinatorLayout, appBarLayout);
            if (appBarLayout.f27242Oooo00O) {
                appBarLayout.OooO0o0(appBarLayout.OooO0o(OooOO0o(coordinatorLayout)));
            }
        }

        public final void OooOO0O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(OooO0O0() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iOooO0O0 = OooO0O0();
            if (iOooO0O0 == i) {
                ValueAnimator valueAnimator = this.OooOO0o;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.OooOO0o.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.OooOO0o;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.OooOO0o = valueAnimator3;
                valueAnimator3.setInterpolator(oo0o0O0.f15019OooO0o0);
                this.OooOO0o.addUpdateListener(new OooO0O0(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.OooOO0o.setDuration(Math.min(iRound, 600));
            this.OooOO0o.setIntValues(iOooO0O0, i);
            this.OooOO0o.start();
        }

        public final OooOO0O OooOOO(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iOooO00o = OooO00o();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iOooO00o;
                if (childAt.getTop() + iOooO00o <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    OooOO0O oooOO0O = new OooOO0O(parcelable);
                    boolean z = iOooO00o == 0;
                    oooOO0O.f27319OooOo0o = z;
                    oooOO0O.f27318OooOo0O = !z && (-iOooO00o) >= appBarLayout.getTotalScrollRange();
                    oooOO0O.f27317OooOo = i;
                    oooOO0O.f27320OooOoO = bottom == appBarLayout.getTopInset() + ViewCompat.getMinimumHeight(childAt);
                    oooOO0O.f27321OooOoO0 = bottom / childAt.getHeight();
                    return oooOO0O;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void OooOOO0(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) throws android.content.res.Resources.NotFoundException {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.OooO0O0()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.OooO(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.f27242Oooo00O
                if (r9 == 0) goto L37
                boolean r9 = r4.OooO0o(r11)
                r4.OooO0o0(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.OooOOO0(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final void OooOOOO(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iOooO0O0 = OooO0O0() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f27254OooO00o & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i2 = -iOooO0O0;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.f27254OooO00o;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && ViewCompat.getFitsSystemWindows(appBarLayout) && ViewCompat.getFitsSystemWindows(childAt2)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        minimumHeight += ViewCompat.getMinimumHeight(childAt2);
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight2 = ViewCompat.getMinimumHeight(childAt2) + minimumHeight;
                        if (iOooO0O0 < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (iOooO0O0 < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    OooOO0O(coordinatorLayout, appBarLayout, MathUtils.clamp(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x009b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void OooOOOo(androidx.coordinatorlayout.widget.CoordinatorLayout r12, com.google.android.material.appbar.AppBarLayout r13) {
            /*
                r11 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                int r0 = r0.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r12, r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                int r0 = r0.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r12, r0)
                int r0 = r13.getTotalScrollRange()
                if (r0 != 0) goto L1b
            L18:
                r5 = r11
                goto Lb5
            L1b:
                int r0 = r12.getChildCount()
                r1 = 0
                r2 = r1
            L21:
                r3 = 0
                if (r2 >= r0) goto L3b
                android.view.View r4 = r12.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r5
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r5.getBehavior()
                boolean r5 = r5 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r5 == 0) goto L38
                r8 = r4
                goto L3c
            L38:
                int r2 = r2 + 1
                goto L21
            L3b:
                r8 = r3
            L3c:
                if (r8 != 0) goto L3f
                goto L18
            L3f:
                int r0 = r13.getChildCount()
                r2 = r1
            L44:
                if (r2 >= r0) goto L18
                android.view.View r4 = r13.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
                int r4 = r4.f27254OooO00o
                if (r4 == 0) goto Laf
                boolean r0 = androidx.core.view.ViewCompat.hasAccessibilityDelegate(r12)
                if (r0 != 0) goto L62
                com.google.android.material.appbar.OooO0OO r0 = new com.google.android.material.appbar.OooO0OO
                r0.<init>(r11)
                androidx.core.view.ViewCompat.setAccessibilityDelegate(r12, r0)
            L62:
                int r0 = r11.OooO0O0()
                int r2 = r13.getTotalScrollRange()
                int r2 = -r2
                r10 = 1
                if (r0 == r2) goto L79
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                com.google.android.material.appbar.OooO r2 = new com.google.android.material.appbar.OooO
                r2.<init>(r13, r1)
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r12, r0, r3, r2)
                r1 = r10
            L79:
                int r0 = r11.OooO0O0()
                if (r0 == 0) goto L9b
                r0 = -1
                boolean r0 = r8.canScrollVertically(r0)
                if (r0 == 0) goto L9d
                int r0 = r13.getDownNestedPreScrollRange()
                int r9 = -r0
                if (r9 == 0) goto L9b
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                com.google.android.material.appbar.OooO0o r4 = new com.google.android.material.appbar.OooO0o
                r5 = r11
                r6 = r12
                r7 = r13
                r4.<init>(r5, r6, r7, r8, r9)
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r6, r0, r3, r4)
                goto Lac
            L9b:
                r5 = r11
                goto Lab
            L9d:
                r5 = r11
                r6 = r12
                r7 = r13
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r12 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                com.google.android.material.appbar.OooO r13 = new com.google.android.material.appbar.OooO
                r13.<init>(r7, r10)
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r6, r12, r3, r13)
                goto Lac
            Lab:
                r10 = r1
            Lac:
                r5.f27253OooOOOO = r10
                return
            Laf:
                r5 = r11
                r6 = r12
                r7 = r13
                int r2 = r2 + 1
                goto L44
            Lb5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.OooOOOo(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout):void");
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            OooOO0O oooOO0O = this.f27252OooOOO0;
            if (oooOO0O == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            OooOO0O(coordinatorLayout, appBarLayout, i2);
                        } else {
                            OooOO0(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            OooOO0O(coordinatorLayout, appBarLayout, 0);
                        } else {
                            OooOO0(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (oooOO0O.f27318OooOo0O) {
                OooOO0(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (oooOO0O.f27319OooOo0o) {
                OooOO0(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(oooOO0O.f27317OooOo);
                int i3 = -childAt.getBottom();
                OooOO0(coordinatorLayout, appBarLayout, this.f27252OooOOO0.f27320OooOoO ? appBarLayout.getTopInset() + ViewCompat.getMinimumHeight(childAt) + i3 : Math.round(childAt.getHeight() * this.f27252OooOOO0.f27321OooOoO0) + i3);
            }
            appBarLayout.f27235OooOoOO = 0;
            this.f27252OooOOO0 = null;
            OooO0Oo(MathUtils.clamp(OooO00o(), -appBarLayout.getTotalScrollRange(), 0));
            OooOOo0(coordinatorLayout, appBarLayout, OooO00o(), 0, true);
            appBarLayout.OooO0OO(OooO00o());
            OooOOOo(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) throws Resources.NotFoundException {
            OooOOO0(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                int i6 = -appBarLayout.getDownNestedScrollRange();
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = OooO(coordinatorLayout2, appBarLayout, OooO0O0() - i4, i6, 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i4 == 0) {
                OooOOOo(coordinatorLayout2, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof OooOO0O)) {
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
                this.f27252OooOOO0 = null;
            } else {
                OooOO0O oooOO0O = (OooOO0O) parcelable;
                this.f27252OooOOO0 = oooOO0O;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, oooOO0O.getSuperState());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            OooOO0O oooOO0OOooOOO = OooOOO(parcelableOnSaveInstanceState, appBarLayout);
            return oooOO0OOooOOO == null ? parcelableOnSaveInstanceState : oooOO0OOooOOO;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.f27242Oooo00O || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.OooOO0o) != null) {
                valueAnimator.cancel();
            }
            this.f27251OooOOO = null;
            this.f27250OooOO0O = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) throws Resources.NotFoundException {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f27250OooOO0O == 0 || i == 1) {
                OooOOOO(coordinatorLayout, appBarLayout);
                if (appBarLayout.f27242Oooo00O) {
                    appBarLayout.OooO0o0(appBarLayout.OooO0o(view2));
                }
            }
            this.f27251OooOOO = new WeakReference(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f27254OooO00o = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}

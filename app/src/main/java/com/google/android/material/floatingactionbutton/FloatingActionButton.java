package com.google.android.material.floatingactionbutton;

import Oooo0o0.OooO;
import Ooooo00.OooOo;
import Ooooo0o.o00OO00O;
import OooooOo.oOOO00Oo;
import OooooOo.oOOO00o0;
import OooooOo.oOOO0O0o;
import OooooOo.oOOO0OO0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.collection.SimpleArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.github.superadb.R;
import com.google.android.gms.internal.ads.z51;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;
import java.util.List;
import o000000.OooOOO0;
import o000000.Oooo000;
import o000000.o0Oo0oo;
import o000000o.OooOO0O;
import o00000Oo.OooO0o;
import o000Oo0O.OooOo00;
import o000Ooo.o00oO0o;
import o00oO0o.o000OOo;
import o00oO0o.o00O0O;
import o00oO0o.o00Oo0;
import o00oO0o.o0ooOOo;
import o00oO0o.oo0o0Oo;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;
import oo000o.OooO00o;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, OooO00o, o0Oo0oo, CoordinatorLayout.AttachedBehavior {

    /* renamed from: OooOo */
    public PorterDuff.Mode f27637OooOo;

    /* renamed from: OooOo0o */
    public ColorStateList f27638OooOo0o;

    /* renamed from: OooOoO */
    public PorterDuff.Mode f27639OooOoO;

    /* renamed from: OooOoO0 */
    public ColorStateList f27640OooOoO0;

    /* renamed from: OooOoOO */
    public ColorStateList f27641OooOoOO;

    /* renamed from: OooOoo */
    public int f27642OooOoo;

    /* renamed from: OooOoo0 */
    public int f27643OooOoo0;

    /* renamed from: OooOooO */
    public int f27644OooOooO;

    /* renamed from: OooOooo */
    public int f27645OooOooo;

    /* renamed from: Oooo0 */
    public final AppCompatImageHelper f27646Oooo0;

    /* renamed from: Oooo000 */
    public boolean f27647Oooo000;

    /* renamed from: Oooo00O */
    public final Rect f27648Oooo00O;

    /* renamed from: Oooo00o */
    public final Rect f27649Oooo00o;

    /* renamed from: Oooo0O0 */
    public final z51 f27650Oooo0O0;

    /* renamed from: Oooo0OO */
    public o000OOo f27651Oooo0OO;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    private oo0o0Oo getImpl() {
        if (this.f27651Oooo0OO == null) {
            this.f27651Oooo0OO = new o000OOo(this, new o00oO0o(this, 17));
        }
        return this.f27651Oooo0OO;
    }

    public final boolean OooO() {
        oo0o0Oo impl = getImpl();
        if (impl.f32791OooOo0O.getVisibility() != 0) {
            if (impl.f32786OooOOo != 2) {
                return false;
            }
        } else if (impl.f32786OooOOo == 1) {
            return false;
        }
        return true;
    }

    public final void OooO0OO(AnimatorListenerAdapter animatorListenerAdapter) {
        oo0o0Oo impl = getImpl();
        if (impl.f32790OooOo00 == null) {
            impl.f32790OooOo00 = new ArrayList();
        }
        impl.f32790OooOo00.add(animatorListenerAdapter);
    }

    public final void OooO0Oo(oOOO00Oo oooo00oo) {
        oo0o0Oo impl = getImpl();
        if (impl.f32788OooOOoo == null) {
            impl.f32788OooOOoo = new ArrayList();
        }
        impl.f32788OooOOoo.add(oooo00oo);
    }

    public final int OooO0o(int i) {
        int i2 = this.f27642OooOoo;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? OooO0o(1) : OooO0o(0);
    }

    public final void OooO0o0(oOOO00o0 oooo00o0) {
        oo0o0Oo impl = getImpl();
        o00O0O o00o0o = new o00O0O(this, oooo00o0);
        if (impl.OooOo0 == null) {
            impl.OooOo0 = new ArrayList();
        }
        impl.OooOo0.add(o00o0o);
    }

    public final void OooO0oO(oOOO0OO0 oooo0oo0, boolean z) {
        oo0o0Oo impl = getImpl();
        OooOo00 oooOo00 = oooo0oo0 == null ? null : new OooOo00(this, false, oooo0oo0, 13);
        if (impl.f32791OooOo0O.getVisibility() == 0) {
            if (impl.f32786OooOOo == 1) {
                return;
            }
        } else if (impl.f32786OooOOo != 2) {
            return;
        }
        Animator animator = impl.OooOO0o;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton = impl.f32791OooOo0O;
        if (!ViewCompat.isLaidOut(floatingActionButton) || floatingActionButton.isInEditMode()) {
            floatingActionButton.OooO00o(z ? 8 : 4, z);
            if (oooOo00 != null) {
                ((OooO) oooOo00.f30372OooOo0o).OooOOo((FloatingActionButton) oooOo00.f30370OooOo);
                return;
            }
            return;
        }
        o00OO00O o00oo00o = impl.f32782OooOOO;
        AnimatorSet animatorSetOooO0O0 = o00oo00o != null ? impl.OooO0O0(o00oo00o, 0.0f, 0.0f, 0.0f) : impl.OooO0OO(oo0o0Oo.f32764Oooo000, 0.0f, 0.4f, oo0o0Oo.f32765Oooo00O, 0.4f);
        animatorSetOooO0O0.addListener(new o00Oo0(impl, z, oooOo00));
        ArrayList arrayList = impl.f32790OooOo00;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                animatorSetOooO0O0.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetOooO0O0.start();
    }

    public final boolean OooO0oo() {
        oo0o0Oo impl = getImpl();
        if (impl.f32791OooOo0O.getVisibility() == 0) {
            if (impl.f32786OooOOo != 1) {
                return false;
            }
        } else if (impl.f32786OooOOo == 2) {
            return false;
        }
        return true;
    }

    public final void OooOO0(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f27648Oooo00O;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void OooOO0O() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f27640OooOoO0;
        if (colorStateList == null) {
            DrawableCompat.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f27639OooOoO;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    public final void OooOO0o(oOOO0O0o oooo0o0o, boolean z) {
        oo0o0Oo impl = getImpl();
        OooOo00 oooOo00 = oooo0o0o == null ? null : new OooOo00(this, false, oooo0o0o, 13);
        if (impl.f32791OooOo0O.getVisibility() != 0) {
            if (impl.f32786OooOOo == 2) {
                return;
            }
        } else if (impl.f32786OooOOo != 1) {
            return;
        }
        Animator animator = impl.OooOO0o;
        if (animator != null) {
            animator.cancel();
        }
        int i = 0;
        boolean z2 = impl.f32783OooOOO0 == null;
        FloatingActionButton floatingActionButton = impl.f32791OooOo0O;
        boolean z3 = ViewCompat.isLaidOut(floatingActionButton) && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f32795OooOoOO;
        if (!z3) {
            floatingActionButton.OooO00o(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f32785OooOOOo = 1.0f;
            impl.OooO00o(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (oooOo00 != null) {
                ((OooO) oooOo00.f30372OooOo0o).OooOOoo();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            float f = z2 ? 0.4f : 0.0f;
            impl.f32785OooOOOo = f;
            impl.OooO00o(f, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        o00OO00O o00oo00o = impl.f32783OooOOO0;
        AnimatorSet animatorSetOooO0O0 = o00oo00o != null ? impl.OooO0O0(o00oo00o, 1.0f, 1.0f, 1.0f) : impl.OooO0OO(oo0o0Oo.f32761OooOooO, 1.0f, 1.0f, oo0o0Oo.f32762OooOooo, 1.0f);
        animatorSetOooO0O0.addListener(new OooO0o(impl, z, oooOo00));
        ArrayList arrayList = impl.f32788OooOOoo;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                animatorSetOooO0O0.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetOooO0O0.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().OooOO0(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f27638OooOo0o;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f27637OooOo;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().OooO0o0();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f32771OooO;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f32780OooOO0;
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().f32777OooO0o0;
    }

    @Px
    public int getCustomSize() {
        return this.f27642OooOoo;
    }

    public int getExpandedComponentIdHint() {
        return this.f27650Oooo0O0.f26094OooO0O0;
    }

    @Nullable
    public o00OO00O getHideMotionSpec() {
        return getImpl().f32782OooOOO;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f27641OooOoOO;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f27641OooOoOO;
    }

    @NonNull
    public Oooo000 getShapeAppearanceModel() {
        return (Oooo000) Preconditions.checkNotNull(getImpl().f32772OooO00o);
    }

    @Nullable
    public o00OO00O getShowMotionSpec() {
        return getImpl().f32783OooOOO0;
    }

    public int getSize() {
        return this.f27643OooOoo0;
    }

    public int getSizeDimension() {
        return OooO0o(this.f27643OooOoo0);
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f27640OooOoO0;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f27639OooOoO;
    }

    public boolean getUseCompatPadding() {
        return this.f27647Oooo000;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().OooO0oo();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo0o0Oo impl = getImpl();
        OooOOO0 oooOOO0 = impl.f32773OooO0O0;
        FloatingActionButton floatingActionButton = impl.f32791OooOo0O;
        if (oooOOO0 != null) {
            OooO.OooOo0(floatingActionButton, oooOOO0);
        }
        if (impl instanceof o000OOo) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f32796OooOoo0 == null) {
            impl.f32796OooOoo0 = new o0ooOOo(impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f32796OooOoo0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo0o0Oo impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f32791OooOo0O.getViewTreeObserver();
        o0ooOOo o0ooooo = impl.f32796OooOoo0;
        if (o0ooooo != null) {
            viewTreeObserver.removeOnPreDrawListener(o0ooooo);
            impl.f32796OooOoo0 = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f27644OooOooO = (sizeDimension - this.f27645OooOooo) / 2;
        getImpl().OooOOo();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(sizeDimension, size);
        } else if (mode == 0) {
            size = sizeDimension;
        } else if (mode != 1073741824) {
            throw new IllegalArgumentException();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            sizeDimension = Math.min(sizeDimension, size2);
        } else if (mode2 != 0) {
            if (mode2 != 1073741824) {
                throw new IllegalArgumentException();
            }
            sizeDimension = size2;
        }
        int iMin = Math.min(size, sizeDimension);
        Rect rect = this.f27648Oooo00O;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooOO0O)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooOO0O oooOO0O = (OooOO0O) parcelable;
        super.onRestoreInstanceState(oooOO0O.getSuperState());
        Bundle bundle = (Bundle) Preconditions.checkNotNull(oooOO0O.extendableStates.get("expandableWidgetHelper"));
        z51 z51Var = this.f27650Oooo0O0;
        z51Var.getClass();
        z51Var.f26093OooO00o = bundle.getBoolean("expanded", false);
        z51Var.f26094OooO0O0 = bundle.getInt("expandedComponentIdHint", 0);
        if (z51Var.f26093OooO00o) {
            View view = (View) z51Var.f26095OooO0OO;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        OooOO0O oooOO0O = new OooOO0O(parcelableOnSaveInstanceState);
        SimpleArrayMap<String, Bundle> simpleArrayMap = oooOO0O.extendableStates;
        z51 z51Var = this.f27650Oooo0O0;
        z51Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", z51Var.f26093OooO00o);
        bundle.putInt("expandedComponentIdHint", z51Var.f26094OooO0O0);
        simpleArrayMap.put("expandableWidgetHelper", bundle);
        return oooOO0O;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && ViewCompat.isLaidOut(this)) {
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.f27649Oooo00o;
            rect.set(0, 0, width, height);
            OooOO0(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f27638OooOo0o != colorStateList) {
            this.f27638OooOo0o = colorStateList;
            oo0o0Oo impl = getImpl();
            OooOOO0 oooOOO0 = impl.f32773OooO0O0;
            if (oooOOO0 != null) {
                oooOOO0.setTintList(colorStateList);
            }
            o00oO0o.OooOo00 oooOo00 = impl.f32775OooO0Oo;
            if (oooOo00 != null) {
                if (colorStateList != null) {
                    oooOo00.f32722OooOOO0 = colorStateList.getColorForState(oooOo00.getState(), oooOo00.f32722OooOOO0);
                }
                oooOo00.f32724OooOOOo = colorStateList;
                oooOo00.f32721OooOOO = true;
                oooOo00.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f27637OooOo != mode) {
            this.f27637OooOo = mode;
            OooOOO0 oooOOO0 = getImpl().f32773OooO0O0;
            if (oooOOO0 != null) {
                oooOOO0.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        oo0o0Oo impl = getImpl();
        if (impl.f32779OooO0oo != f) {
            impl.f32779OooO0oo = f;
            impl.OooOO0O(f, impl.f32771OooO, impl.f32780OooOO0);
        }
    }

    public void setCompatElevationResource(@DimenRes int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        oo0o0Oo impl = getImpl();
        if (impl.f32771OooO != f) {
            impl.f32771OooO = f;
            impl.OooOO0O(impl.f32779OooO0oo, f, impl.f32780OooOO0);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        oo0o0Oo impl = getImpl();
        if (impl.f32780OooOO0 != f) {
            impl.f32780OooOO0 = f;
            impl.OooOO0O(impl.f32779OooO0oo, impl.f32771OooO, f);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f27642OooOoo) {
            this.f27642OooOoo = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        OooOOO0 oooOOO0 = getImpl().f32773OooO0O0;
        if (oooOOO0 != null) {
            oooOOO0.OooOO0o(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f32776OooO0o) {
            getImpl().f32776OooO0o = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.f27650Oooo0O0.f26094OooO0O0 = i;
    }

    public void setHideMotionSpec(@Nullable o00OO00O o00oo00o) {
        getImpl().f32782OooOOO = o00oo00o;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(o00OO00O.OooO0O0(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            oo0o0Oo impl = getImpl();
            float f = impl.f32785OooOOOo;
            impl.f32785OooOOOo = f;
            Matrix matrix = impl.f32795OooOoOO;
            impl.OooO00o(f, matrix);
            impl.f32791OooOo0O.setImageMatrix(matrix);
            if (this.f27640OooOoO0 != null) {
                OooOO0O();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.f27646Oooo0.setImageResource(i);
        OooOO0O();
    }

    public void setMaxImageSize(int i) {
        this.f27645OooOooo = i;
        oo0o0Oo impl = getImpl();
        if (impl.f32787OooOOo0 != i) {
            impl.f32787OooOOo0 = i;
            float f = impl.f32785OooOOOo;
            impl.f32785OooOOOo = f;
            Matrix matrix = impl.f32795OooOoOO;
            impl.OooO00o(f, matrix);
            impl.f32791OooOo0O.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(@ColorInt int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().OooOO0o();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().OooOO0o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        oo0o0Oo impl = getImpl();
        impl.f32778OooO0oO = z;
        impl.OooOOo();
    }

    @Override // o000000.o0Oo0oo
    public void setShapeAppearanceModel(@NonNull Oooo000 oooo000) {
        getImpl().OooOOOO(oooo000);
    }

    public void setShowMotionSpec(@Nullable o00OO00O o00oo00o) {
        getImpl().f32783OooOOO0 = o00oo00o;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(o00OO00O.OooO0O0(getContext(), i));
    }

    public void setSize(int i) {
        this.f27642OooOoo = 0;
        if (i != this.f27643OooOoo0) {
            this.f27643OooOoo0 = i;
            requestLayout();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f27640OooOoO0 != colorStateList) {
            this.f27640OooOoO0 = colorStateList;
            OooOO0O();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f27639OooOoO != mode) {
            this.f27639OooOoO = mode;
            OooOO0O();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().OooOOO0();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().OooOOO0();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().OooOOO0();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f27647Oooo000 != z) {
            this.f27647Oooo000 = z;
            getImpl().OooO();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: OooO00o */
        public Rect f27652OooO00o;

        /* renamed from: OooO0O0 */
        public final boolean f27653OooO0O0;

        public BaseBehavior() {
            this.f27653OooO0O0 = true;
        }

        public final boolean OooO00o(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f27653OooO0O0 && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).getAnchorId() == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f27652OooO00o == null) {
                this.f27652OooO00o = new Rect();
            }
            Rect rect = this.f27652OooO00o;
            o0ooOO0.OooOO0O.OooO00o(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.OooO0oO(null, false);
            } else {
                floatingActionButton.OooOO0o(null, false);
            }
            return true;
        }

        public final boolean OooO0O0(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f27653OooO0O0 && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.OooO0oO(null, false);
            } else {
                floatingActionButton.OooOO0o(null, false);
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f27648Oooo00O;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                OooO00o(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    OooO0O0(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = dependencies.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && OooO0O0(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (OooO00o(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            Rect rect = floatingActionButton.f27648Oooo00O;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                ViewCompat.offsetTopAndBottom(floatingActionButton, i2);
            }
            if (i4 == 0) {
                return true;
            }
            ViewCompat.offsetLeftAndRight(floatingActionButton, i4);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo.f14967OooOOoo);
            this.f27653OooO0O0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.f27648Oooo00O = new Rect();
        this.f27649Oooo00o = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, OooOo.f14965OooOOo, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f27638OooOo0o = OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 1);
        this.f27637OooOo = o0000oo.OooO0o0(typedArrayOooO0Oo.getInt(2, -1), null);
        this.f27641OooOoOO = OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 12);
        this.f27643OooOoo0 = typedArrayOooO0Oo.getInt(7, -1);
        this.f27642OooOoo = typedArrayOooO0Oo.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(3, 0);
        float dimension = typedArrayOooO0Oo.getDimension(4, 0.0f);
        float dimension2 = typedArrayOooO0Oo.getDimension(9, 0.0f);
        float dimension3 = typedArrayOooO0Oo.getDimension(11, 0.0f);
        this.f27647Oooo000 = typedArrayOooO0Oo.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayOooO0Oo.getDimensionPixelSize(10, 0));
        o00OO00O o00oo00oOooO00o = o00OO00O.OooO00o(context2, typedArrayOooO0Oo, 15);
        o00OO00O o00oo00oOooO00o2 = o00OO00O.OooO00o(context2, typedArrayOooO0Oo, 8);
        Oooo000 oooo000OooO00o = Oooo000.OooO0OO(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, Oooo000.f29082OooOOO0).OooO00o();
        boolean z = typedArrayOooO0Oo.getBoolean(5, false);
        setEnabled(typedArrayOooO0Oo.getBoolean(0, true));
        typedArrayOooO0Oo.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f27646Oooo0 = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i);
        this.f27650Oooo0O0 = new z51(this);
        getImpl().OooOOOO(oooo000OooO00o);
        getImpl().OooO0oO(this.f27638OooOo0o, this.f27637OooOo, this.f27641OooOoOO, dimensionPixelSize);
        getImpl().f32781OooOO0O = dimensionPixelSize2;
        oo0o0Oo impl = getImpl();
        if (impl.f32779OooO0oo != dimension) {
            impl.f32779OooO0oo = dimension;
            impl.OooOO0O(dimension, impl.f32771OooO, impl.f32780OooOO0);
        }
        oo0o0Oo impl2 = getImpl();
        if (impl2.f32771OooO != dimension2) {
            impl2.f32771OooO = dimension2;
            impl2.OooOO0O(impl2.f32779OooO0oo, dimension2, impl2.f32780OooOO0);
        }
        oo0o0Oo impl3 = getImpl();
        if (impl3.f32780OooOO0 != dimension3) {
            impl3.f32780OooOO0 = dimension3;
            impl3.OooOO0O(impl3.f32779OooO0oo, impl3.f32771OooO, dimension3);
        }
        getImpl().f32783OooOOO0 = o00oo00oOooO00o;
        getImpl().f32782OooOOO = o00oo00oOooO00o2;
        getImpl().f32776OooO0o = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f27641OooOoOO != colorStateList) {
            this.f27641OooOoOO = colorStateList;
            getImpl().OooOOO(this.f27641OooOoOO);
        }
    }
}

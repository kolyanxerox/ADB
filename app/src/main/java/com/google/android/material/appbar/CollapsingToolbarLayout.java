package com.google.android.material.appbar;

import Ooooo0o.oo0o0O0;
import Oooooo.o00Oo0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0038R;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.github.superadb.R;
import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: OooOo, reason: collision with root package name */
    public ViewGroup f27257OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f27258OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f27259OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public View f27260OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public View f27261OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f27262OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public int f27263OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f27264OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public int f27265OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final Rect f27266OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public int f27267Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public boolean f27268Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final o0ooOO0.OooOO0 f27269Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final o00ooo.OooOO0O f27270Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public boolean f27271Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public Drawable f27272Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public Drawable f27273Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public boolean f27274Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public int f27275Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public ValueAnimator f27276Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public long f27277Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public WindowInsetsCompat f27278OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public int f27279OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public OooOOO f27280OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public int f27281OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public int f27282OoooOO0;

    /* renamed from: OoooOOO, reason: collision with root package name */
    public int f27283OoooOOO;

    /* renamed from: OoooOOo, reason: collision with root package name */
    public boolean f27284OoooOOo;
    public boolean o000oOoO;

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: OooO00o, reason: collision with root package name */
        public int f27285OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public float f27286OooO0O0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27285OooO00o = 0;
            this.f27286OooO0O0 = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Ooooo00.OooOo.f14963OooOOOO);
            this.f27285OooO00o = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.f27286OooO0O0 = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public static OooOo OooO0O0(View view) {
        OooOo oooOo = (OooOo) view.getTag(R.id.view_offset_helper);
        if (oooOo != null) {
            return oooOo;
        }
        OooOo oooOo2 = new OooOo(view);
        view.setTag(R.id.view_offset_helper, oooOo2);
        return oooOo2;
    }

    public final void OooO00o() {
        if (this.f27258OooOo0O) {
            ViewGroup viewGroup = null;
            this.f27257OooOo = null;
            this.f27261OooOoO0 = null;
            int i = this.f27259OooOo0o;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f27257OooOo = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f27261OooOoO0 = view;
                }
            }
            if (this.f27257OooOo == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f27257OooOo = viewGroup;
            }
            OooO0OO();
            this.f27258OooOo0O = false;
        }
    }

    public final void OooO0OO() {
        View view;
        if (!this.f27271Oooo00o && (view = this.f27260OooOoO) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f27260OooOoO);
            }
        }
        if (!this.f27271Oooo00o || this.f27257OooOo == null) {
            return;
        }
        if (this.f27260OooOoO == null) {
            this.f27260OooOoO = new View(getContext());
        }
        if (this.f27260OooOoO.getParent() == null) {
            this.f27257OooOo.addView(this.f27260OooOoO, -1, -1);
        }
    }

    public final void OooO0Oo() {
        if (this.f27272Oooo0O0 == null && this.f27273Oooo0OO == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f27279OoooO0 < getScrimVisibleHeightTrigger());
    }

    public final void OooO0o() {
        if (this.f27257OooOo != null && this.f27271Oooo00o && TextUtils.isEmpty(this.f27269Oooo000.f33045Oooo00O)) {
            ViewGroup viewGroup = this.f27257OooOo;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    public final void OooO0o0(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.f27271Oooo00o || (view = this.f27260OooOoO) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z2 = ViewCompat.isAttachedToWindow(view) && this.f27260OooOoO.getVisibility() == 0;
        this.f27268Oooo0 = z2;
        if (z2 || z) {
            boolean z3 = ViewCompat.getLayoutDirection(this) == 1;
            View view2 = this.f27261OooOoO0;
            if (view2 == null) {
                view2 = this.f27257OooOo;
            }
            int height = ((getHeight() - OooO0O0(view2).f27324OooO0O0) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f27260OooOoO;
            Rect rect = this.f27266OooOooo;
            o0ooOO0.OooOO0O.OooO00o(this, view3, rect);
            ViewGroup viewGroup = this.f27257OooOo;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
            Rect rect2 = oooOO0.f33021OooO0oo;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                oooOO0.f33056OoooO0O = true;
            }
            int i10 = z3 ? this.f27263OooOoo : this.f27262OooOoOO;
            int i11 = rect.top + this.f27264OooOoo0;
            int i12 = (i3 - i) - (z3 ? this.f27262OooOoOO : this.f27263OooOoo);
            int i13 = (i4 - i2) - this.f27265OooOooO;
            Rect rect3 = oooOO0.f33020OooO0oO;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                oooOO0.f33056OoooO0O = true;
            }
            oooOO0.OooO(z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        OooO00o();
        if (this.f27257OooOo == null && (drawable = this.f27272Oooo0O0) != null && this.f27275Oooo0o0 > 0) {
            drawable.mutate().setAlpha(this.f27275Oooo0o0);
            this.f27272Oooo0O0.draw(canvas);
        }
        if (this.f27271Oooo00o && this.f27268Oooo0) {
            ViewGroup viewGroup = this.f27257OooOo;
            o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
            if (viewGroup == null || this.f27272Oooo0O0 == null || this.f27275Oooo0o0 <= 0 || this.f27281OoooO0O != 1 || oooOO0.f33015OooO0O0 >= oooOO0.f33019OooO0o0) {
                oooOO0.OooO0Oo(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f27272Oooo0O0.getBounds(), Region.Op.DIFFERENCE);
                oooOO0.OooO0Oo(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f27273Oooo0OO == null || this.f27275Oooo0o0 <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f27278OoooO;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f27273Oooo0OO.setBounds(0, -this.f27279OoooO0, getWidth(), systemWindowInsetTop - this.f27279OoooO0);
            this.f27273Oooo0OO.mutate().setAlpha(this.f27275Oooo0o0);
            this.f27273Oooo0OO.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.f27272Oooo0O0;
        if (drawable == null || this.f27275Oooo0o0 <= 0 || ((view2 = this.f27261OooOoO0) == null || view2 == this ? view != this.f27257OooOo : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.f27281OoooO0O == 1 && view != null && this.f27271Oooo00o) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f27272Oooo0O0.mutate().setAlpha(this.f27275Oooo0o0);
            this.f27272Oooo0O0.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f27273Oooo0OO;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f27272Oooo0O0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        if (oooOO0 != null) {
            oooOO0.f33054OoooO0 = drawableState;
            ColorStateList colorStateList2 = oooOO0.f33026OooOOOO;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = oooOO0.f33024OooOOO) != null && colorStateList.isStateful())) {
                oooOO0.OooO(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f27285OooO00o = 0;
        layoutParams.f27286OooO0O0 = 0.5f;
        return layoutParams;
    }

    public int getCollapsedTitleGravity() {
        return this.f27269Oooo000.f33023OooOO0O;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f27269Oooo000.f33034OooOo0o;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f27272Oooo0O0;
    }

    public int getExpandedTitleGravity() {
        return this.f27269Oooo000.f33022OooOO0;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f27265OooOooO;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f27263OooOoo;
    }

    public int getExpandedTitleMarginStart() {
        return this.f27262OooOoOO;
    }

    public int getExpandedTitleMarginTop() {
        return this.f27264OooOoo0;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f27269Oooo000.f33035OooOoO;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f27269Oooo000.f33076o00ooo;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        StaticLayout staticLayout = this.f27269Oooo000.f33070OoooooO;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f27269Oooo000.f33070OoooooO.getSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f27269Oooo000.f33070OoooooO.getSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f27269Oooo000.f33073o00Oo0;
    }

    public int getScrimAlpha() {
        return this.f27275Oooo0o0;
    }

    public long getScrimAnimationDuration() {
        return this.f27277Oooo0oo;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f27267Oooo;
        if (i >= 0) {
            return i + this.f27282OoooOO0 + this.f27283OoooOOO;
        }
        WindowInsetsCompat windowInsetsCompat = this.f27278OoooO;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f27273Oooo0OO;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f27271Oooo00o) {
            return this.f27269Oooo000.f33045Oooo00O;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f27281OoooO0O;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f27269Oooo000.o000oOoO;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f27269Oooo000.f33044Oooo000;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f27281OoooO0O == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.f27280OoooO00 == null) {
                this.f27280OoooO00 = new OooOOO(this);
            }
            OooOOO oooOOO = this.f27280OoooO00;
            if (appBarLayout.f27236OooOoo == null) {
                appBarLayout.f27236OooOoo = new ArrayList();
            }
            if (oooOOO != null && !appBarLayout.f27236OooOoo.contains(oooOOO)) {
                appBarLayout.f27236OooOoo.add(oooOOO);
            }
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f27269Oooo000.OooO0oo(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        OooOOO oooOOO = this.f27280OoooO00;
        if (oooOOO != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f27236OooOoo) != null) {
            arrayList.remove(oooOOO);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.f27278OoooO;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            OooOo oooOoOooO0O0 = OooO0O0(getChildAt(i6));
            View view = oooOoOooO0O0.f27323OooO00o;
            oooOoOooO0O0.f27324OooO0O0 = view.getTop();
            oooOoOooO0O0.f27325OooO0OO = view.getLeft();
        }
        OooO0o0(i, i2, i3, i4, false);
        OooO0o();
        OooO0Oo();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            OooO0O0(getChildAt(i7)).OooO00o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            r9.OooO00o()
            super.onMeasure(r10, r11)
            int r11 = android.view.View.MeasureSpec.getMode(r11)
            androidx.core.view.WindowInsetsCompat r0 = r9.f27278OoooO
            if (r0 == 0) goto L13
            int r0 = r0.getSystemWindowInsetTop()
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == 0) goto L1c
            boolean r11 = r9.o000oOoO
            if (r11 == 0) goto L2c
        L1c:
            if (r0 <= 0) goto L2c
            r9.f27282OoooOO0 = r0
            int r11 = r9.getMeasuredHeight()
            int r11 = r11 + r0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
            super.onMeasure(r10, r11)
        L2c:
            boolean r11 = r9.f27284OoooOOo
            if (r11 == 0) goto L7f
            o0ooOO0.OooOO0 r11 = r9.f27269Oooo000
            int r0 = r11.f33073o00Oo0
            r2 = 1
            if (r0 <= r2) goto L7f
            r9.OooO0o()
            int r6 = r9.getMeasuredWidth()
            int r7 = r9.getMeasuredHeight()
            r4 = 0
            r5 = 0
            r8 = 1
            r3 = r9
            r3.OooO0o0(r4, r5, r6, r7, r8)
            int r0 = r11.f33027OooOOOo
            if (r0 <= r2) goto L80
            android.text.TextPaint r4 = r11.f33057OoooOO0
            float r5 = r11.OooOO0o
            r4.setTextSize(r5)
            android.graphics.Typeface r5 = r11.f33035OooOoO
            r4.setTypeface(r5)
            float r11 = r11.f33069Oooooo0
            r4.setLetterSpacing(r11)
            float r11 = r4.ascent()
            float r11 = -r11
            float r4 = r4.descent()
            float r4 = r4 + r11
            int r11 = java.lang.Math.round(r4)
            int r0 = r0 - r2
            int r0 = r0 * r11
            r3.f27283OoooOOO = r0
            int r11 = r9.getMeasuredHeight()
            int r0 = r3.f27283OoooOOO
            int r11 = r11 + r0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
            super.onMeasure(r10, r11)
            goto L80
        L7f:
            r3 = r9
        L80:
            android.view.ViewGroup r10 = r3.f27257OooOo
            if (r10 == 0) goto Lc4
            android.view.View r11 = r3.f27261OooOoO0
            if (r11 == 0) goto La8
            if (r11 != r3) goto L8b
            goto La8
        L8b:
            android.view.ViewGroup$LayoutParams r10 = r11.getLayoutParams()
            boolean r0 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto La0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            int r11 = r11.getMeasuredHeight()
            int r0 = r10.topMargin
            int r11 = r11 + r0
            int r10 = r10.bottomMargin
            int r11 = r11 + r10
            goto La4
        La0:
            int r11 = r11.getMeasuredHeight()
        La4:
            r9.setMinimumHeight(r11)
            return
        La8:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            boolean r0 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lbd
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r10 = r10.getMeasuredHeight()
            int r0 = r11.topMargin
            int r10 = r10 + r0
            int r11 = r11.bottomMargin
            int r10 = r10 + r11
            goto Lc1
        Lbd:
            int r10 = r10.getMeasuredHeight()
        Lc1:
            r9.setMinimumHeight(r10)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f27272Oooo0O0;
        if (drawable != null) {
            ViewGroup viewGroup = this.f27257OooOo;
            if (this.f27281OoooO0O == 1 && viewGroup != null && this.f27271Oooo00o) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f27269Oooo000.OooOO0o(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.f27269Oooo000.OooOO0(i);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        if (oooOO0.OooOOO0(typeface)) {
            oooOO0.OooO(false);
        }
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f27272Oooo0O0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f27272Oooo0O0 = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f27257OooOo;
                if (this.f27281OoooO0O == 1 && viewGroup != null && this.f27271Oooo00o) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.f27272Oooo0O0.setCallback(this);
                this.f27272Oooo0O0.setAlpha(this.f27275Oooo0o0);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i));
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        if (oooOO0.f33022OooOO0 != i) {
            oooOO0.f33022OooOO0 = i;
            oooOO0.OooO(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f27265OooOooO = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f27263OooOoo = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f27262OooOoOO = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f27264OooOoo0 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.f27269Oooo000.OooOOO(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        if (oooOO0.f33024OooOOO != colorStateList) {
            oooOO0.f33024OooOOO = colorStateList;
            oooOO0.OooO(false);
        }
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        if (oooOO0.OooOOOO(typeface)) {
            oooOO0.OooO(false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f27284OoooOOo = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.o000oOoO = z;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.f27269Oooo000.f33076o00ooo = i;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.f27269Oooo000.f33074o00Ooo = f;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.f27269Oooo000.f33075o00o0O = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        if (i != oooOO0.f33073o00Oo0) {
            oooOO0.f33073o00Oo0 = i;
            Bitmap bitmap = oooOO0.f33048Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooOO0.f33048Oooo0OO = null;
            }
            oooOO0.OooO(false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f27269Oooo000.f33047Oooo0O0 = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f27275Oooo0o0) {
            if (this.f27272Oooo0O0 != null && (viewGroup = this.f27257OooOo) != null) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.f27275Oooo0o0 = i;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = KeyboardMap.kUnicodePlane) long j) {
        this.f27277Oooo0oo = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = KeyboardMap.kUnicodePlane) int i) {
        if (this.f27267Oooo != i) {
            this.f27267Oooo = i;
            OooO0Oo();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = ViewCompat.isLaidOut(this) && !isInEditMode();
        if (this.f27274Oooo0o != z) {
            if (z2) {
                int i = z ? 255 : 0;
                OooO00o();
                ValueAnimator valueAnimator = this.f27276Oooo0oO;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f27276Oooo0oO = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.f27275Oooo0o0 ? oo0o0O0.f15017OooO0OO : oo0o0O0.f15018OooO0Oo);
                    this.f27276Oooo0oO.addUpdateListener(new o00Oo0(this, 1));
                } else if (valueAnimator.isRunning()) {
                    this.f27276Oooo0oO.cancel();
                }
                this.f27276Oooo0oO.setDuration(this.f27277Oooo0oo);
                this.f27276Oooo0oO.setIntValues(this.f27275Oooo0o0, i);
                this.f27276Oooo0oO.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f27274Oooo0o = z;
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable OooOOOO oooOOOO) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        if (oooOOOO != null) {
            oooOO0.OooO(true);
        } else {
            oooOO0.getClass();
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f27273Oooo0OO;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f27273Oooo0OO = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f27273Oooo0OO.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f27273Oooo0OO, ViewCompat.getLayoutDirection(this));
                this.f27273Oooo0OO.setVisible(getVisibility() == 0, false);
                this.f27273Oooo0OO.setCallback(this);
                this.f27273Oooo0OO.setAlpha(this.f27275Oooo0o0);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        if (charSequence == null || !TextUtils.equals(oooOO0.f33045Oooo00O, charSequence)) {
            oooOO0.f33045Oooo00O = charSequence;
            oooOO0.f33046Oooo00o = null;
            Bitmap bitmap = oooOO0.f33048Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooOO0.f33048Oooo0OO = null;
            }
            oooOO0.OooO(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) throws Resources.NotFoundException {
        this.f27281OoooO0O = i;
        boolean z = i == 1;
        this.f27269Oooo000.f33016OooO0OO = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f27281OoooO0O == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.f27272Oooo0O0 == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            o00ooo.OooOO0O oooOO0O = this.f27270Oooo00O;
            setContentScrimColor(oooOO0O.OooO00o(dimension, oooOO0O.f32820OooO0Oo));
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        oooOO0.f33044Oooo000 = truncateAt;
        oooOO0.OooO(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f27271Oooo00o) {
            this.f27271Oooo00o = z;
            setContentDescription(getTitle());
            OooO0OO();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        o0ooOO0.OooOO0 oooOO0 = this.f27269Oooo000;
        oooOO0.o000oOoO = timeInterpolator;
        oooOO0.OooO(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f27273Oooo0OO;
        if (drawable != null && drawable.isVisible() != z) {
            this.f27273Oooo0OO.setVisible(z, false);
        }
        Drawable drawable2 = this.f27272Oooo0O0;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f27272Oooo0O0.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f27272Oooo0O0 || drawable == this.f27273Oooo0OO;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int i2;
        ColorStateList colorStateListOooO00o;
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        this.f27258OooOo0O = true;
        this.f27266OooOooo = new Rect();
        this.f27267Oooo = -1;
        this.f27282OoooOO0 = 0;
        this.f27283OoooOOO = 0;
        Context context2 = getContext();
        o0ooOO0.OooOO0 oooOO0 = new o0ooOO0.OooOO0(this);
        this.f27269Oooo000 = oooOO0;
        oooOO0.f33058OoooOOO = oo0o0O0.f15019OooO0o0;
        oooOO0.OooO(false);
        oooOO0.f33047Oooo0O0 = false;
        this.f27270Oooo00O = new o00ooo.OooOO0O(context2);
        int[] iArr = Ooooo00.OooOo.f14961OooOOO;
        o00000O0.OooO00o(context2, attributeSet, i, R.style.Widget_Design_CollapsingToolbar);
        o00000O0.OooO0O0(context2, attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar);
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 8388691);
        if (oooOO0.f33022OooOO0 != i3) {
            oooOO0.f33022OooOO0 = i3;
            oooOO0.OooO(false);
        }
        oooOO0.OooOO0o(typedArrayObtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f27265OooOooO = dimensionPixelSize;
        this.f27263OooOoo = dimensionPixelSize;
        this.f27264OooOoo0 = dimensionPixelSize;
        this.f27262OooOoOO = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f27262OooOoOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f27263OooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f27264OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f27265OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.f27271Oooo00o = typedArrayObtainStyledAttributes.getBoolean(20, true);
        setTitle(typedArrayObtainStyledAttributes.getText(18));
        oooOO0.OooOOO(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        oooOO0.OooOO0(C0038R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            oooOO0.OooOOO(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            oooOO0.OooOO0(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            int i4 = typedArrayObtainStyledAttributes.getInt(22, -1);
            setTitleEllipsize(i4 != 0 ? i4 != 1 ? i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11) && oooOO0.f33024OooOOO != (colorStateListOooO00o = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, 11))) {
            oooOO0.f33024OooOOO = colorStateListOooO00o;
            oooOO0.OooO(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            oooOO0.OooOO0O(oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, 2));
        }
        this.f27267Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (typedArrayObtainStyledAttributes.hasValue(14) && (i2 = typedArrayObtainStyledAttributes.getInt(14, 1)) != oooOO0.f33073o00Oo0) {
            oooOO0.f33073o00Oo0 = i2;
            Bitmap bitmap = oooOO0.f33048Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooOO0.f33048Oooo0OO = null;
            }
            oooOO0.OooO(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            oooOO0.o000oOoO = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(21, 0));
            oooOO0.OooO(false);
        }
        this.f27277Oooo0oo = typedArrayObtainStyledAttributes.getInt(15, 600);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(19, 0));
        this.f27259OooOo0o = typedArrayObtainStyledAttributes.getResourceId(23, -1);
        this.o000oOoO = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f27284OoooOOo = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener(this, new o000Ooo0.OooOO0(this, 19));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f27269Oooo000.OooOO0O(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.f27285OooO00o = 0;
        layoutParams2.f27286OooO0O0 = 0.5f;
        return layoutParams2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f27285OooO00o = 0;
        layoutParams.f27286OooO0O0 = 0.5f;
        return layoutParams;
    }
}

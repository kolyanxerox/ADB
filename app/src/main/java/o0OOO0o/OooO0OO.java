package o0OOO0o;

import OoooOOO.C0001o0;
import Ooooo0o.oo0o0O0;
import OooooO0.o00000O;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.internal.measurement.o0OO00OO;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class OooO0OO extends FrameLayout implements MenuView.ItemView {

    /* renamed from: OoooOoO, reason: collision with root package name */
    public static final int[] f32946OoooOoO = {R.attr.state_checked};

    /* renamed from: OoooOoo, reason: collision with root package name */
    public static final C0001o0 f32947OoooOoo = new C0001o0(26);

    /* renamed from: Ooooo00, reason: collision with root package name */
    public static final OooO0O0 f32948Ooooo00 = new OooO0O0(26);

    /* renamed from: OooOo, reason: collision with root package name */
    public Drawable f32949OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f32950OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public ColorStateList f32951OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f32952OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f32953OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public float f32954OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public float f32955OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public float f32956OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public int f32957OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public boolean f32958OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public Drawable f32959Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final ViewGroup f32960Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final FrameLayout f32961Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final View f32962Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final ImageView f32963Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public final TextView f32964Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public final TextView f32965Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public MenuItemImpl f32966Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public int f32967Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public ColorStateList f32968Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public Drawable f32969Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public boolean f32970OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public C0001o0 f32971OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public ValueAnimator f32972OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public float f32973OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public int f32974OoooOO0;

    /* renamed from: OoooOOO, reason: collision with root package name */
    public boolean f32975OoooOOO;

    /* renamed from: OoooOOo, reason: collision with root package name */
    public int f32976OoooOOo;

    /* renamed from: OoooOo0, reason: collision with root package name */
    public o00000O f32977OoooOo0;
    public int o000oOoO;

    public OooO0OO(Context context) {
        super(context);
        this.f32950OooOo0O = false;
        this.f32967Oooo0o0 = -1;
        this.f32971OoooO0 = f32947OoooOoo;
        this.f32973OoooO0O = 0.0f;
        this.f32970OoooO = false;
        this.f32974OoooOO0 = 0;
        this.o000oOoO = 0;
        this.f32975OoooOOO = false;
        this.f32976OoooOOo = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f32961Oooo000 = (FrameLayout) findViewById(com.github.superadb.R.id.navigation_bar_item_icon_container);
        this.f32962Oooo00O = findViewById(com.github.superadb.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.github.superadb.R.id.navigation_bar_item_icon_view);
        this.f32963Oooo00o = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.github.superadb.R.id.navigation_bar_item_labels_group);
        this.f32960Oooo0 = viewGroup;
        TextView textView = (TextView) findViewById(com.github.superadb.R.id.navigation_bar_item_small_label_view);
        this.f32964Oooo0O0 = textView;
        TextView textView2 = (TextView) findViewById(com.github.superadb.R.id.navigation_bar_item_large_label_view);
        this.f32965Oooo0OO = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f32953OooOoO0 = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f32952OooOoO = viewGroup.getPaddingBottom();
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        OooO00o(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new o00000OO.OooO00o(this, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0Oo(android.widget.TextView r4, int r5) throws android.content.res.Resources.NotFoundException {
        /*
            androidx.core.widget.TextViewCompat.setTextAppearance(r4, r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lb
            goto L1f
        Lb:
            int[] r2 = Ooooo00.OooOo.f14999OoooOoo
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
        L1f:
            r5 = r1
            goto L4c
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOO0o.OooO0OO.OooO0Oo(android.widget.TextView, int):void");
    }

    public static void OooO0o(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void OooO0o0(int i, View view, float f, float f2) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    public static void OooO0oo(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f32961Oooo000;
        return frameLayout != null ? frameLayout : this.f32963Oooo00o;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof OooO0OO) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        o00000O o00000o = this.f32977OoooOo0;
        int minimumHeight = o00000o != null ? o00000o.getMinimumHeight() / 2 : 0;
        return this.f32963Oooo00o.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        o00000O o00000o = this.f32977OoooOo0;
        int minimumWidth = o00000o == null ? 0 : o00000o.getMinimumWidth() - this.f32977OoooOo0.f15024OooOoO.f15035OooO0O0.horizontalOffsetWithoutText.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f32963Oooo00o.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public final void OooO00o(float f, float f2) {
        this.f32954OooOoOO = f - f2;
        this.f32956OooOoo0 = (f2 * 1.0f) / f;
        this.f32955OooOoo = (f * 1.0f) / f2;
    }

    public final void OooO0O0() {
        Drawable rippleDrawable = this.f32949OooOo;
        ColorStateList colorStateList = this.f32951OooOo0o;
        FrameLayout frameLayout = this.f32961Oooo000;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f32970OoooO && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(o0O0O00.OooO00o.OooO0OO(this.f32951OooOo0o), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(o0O0O00.OooO00o.OooO00o(this.f32951OooOo0o), null, null);
            }
        }
        if (frameLayout != null) {
            ViewCompat.setBackground(frameLayout, rippleDrawable2);
        }
        ViewCompat.setBackground(this, rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    public final void OooO0OO(float f, float f2) {
        View view = this.f32962Oooo00O;
        if (view != null) {
            C0001o0 c0001o0 = this.f32971OoooO0;
            c0001o0.getClass();
            view.setScaleX(oo0o0O0.OooO00o(0.4f, 1.0f, f));
            view.setScaleY(c0001o0.OooOO0(f, f2));
            view.setAlpha(oo0o0O0.OooO0O0(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.f32973OoooO0O = f;
    }

    public final void OooO0oO(int i) {
        View view = this.f32962Oooo00O;
        if (view == null) {
            return;
        }
        int iMin = Math.min(this.f32974OoooOO0, i - (this.f32976OoooOOo * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f32975OoooOOO && this.f32957OooOooO == 2) ? iMin : this.o000oOoO;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f32961Oooo000;
        if (frameLayout != null && this.f32970OoooO) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f32962Oooo00O;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public o00000O getBadge() {
        return this.f32977OoooOo0;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return com.github.superadb.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.f32966Oooo0o;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return com.github.superadb.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f32967Oooo0o0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f32960Oooo0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f32960Oooo0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl, int i) {
        this.f32966Oooo0o = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        TooltipCompat.setTooltipText(this, !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.f32950OooOo0O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.f32966Oooo0o;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f32966Oooo0o.isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f32946OoooOoO);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        o00000O o00000o = this.f32977OoooOo0;
        if (o00000o != null && o00000o.isVisible()) {
            CharSequence title = this.f32966Oooo0o.getTitle();
            if (!TextUtils.isEmpty(this.f32966Oooo0o.getContentDescription())) {
                title = this.f32966Oooo0o.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f32977OoooOo0.OooO0OO()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(com.github.superadb.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new com.google.android.gms.common.api.internal.Oooo000(this, i, 8));
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return false;
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.f32962Oooo00O;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        OooO0O0();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f32970OoooO = z;
        OooO0O0();
        View view = this.f32962Oooo00O;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.o000oOoO = i;
        OooO0oO(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i) {
        this.f32976OoooOOo = i;
        OooO0oO(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f32975OoooOOO = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f32974OoooOO0 = i;
        OooO0oO(getWidth());
    }

    public void setBadge(@NonNull o00000O o00000o) throws Resources.NotFoundException {
        o00000O o00000o2 = this.f32977OoooOo0;
        if (o00000o2 == o00000o) {
            return;
        }
        boolean z = o00000o2 != null;
        ImageView imageView = this.f32963Oooo00o;
        if (z && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f32977OoooOo0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                o00000O o00000o3 = this.f32977OoooOo0;
                if (o00000o3 != null) {
                    WeakReference weakReference = o00000o3.f15033Oooo00o;
                    if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                        WeakReference weakReference2 = o00000o3.f15033Oooo00o;
                        (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                    } else {
                        imageView.getOverlay().remove(o00000o3);
                    }
                }
                this.f32977OoooOo0 = null;
            }
        }
        this.f32977OoooOo0 = o00000o;
        if (imageView == null || o00000o == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        o00000O o00000o4 = this.f32977OoooOo0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        o00000o4.setBounds(rect);
        o00000o4.OooO0o(imageView, null);
        WeakReference weakReference3 = o00000o4.f15033Oooo00o;
        if ((weakReference3 != null ? (FrameLayout) weakReference3.get() : null) == null) {
            imageView.getOverlay().add(o00000o4);
        } else {
            WeakReference weakReference4 = o00000o4.f15033Oooo00o;
            (weakReference4 != null ? (FrameLayout) weakReference4.get() : null).setForeground(o00000o4);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        TextView textView = this.f32965Oooo0OO;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f32964Oooo0O0;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : 0.0f;
        if (this.f32970OoooO && this.f32950OooOo0O && ViewCompat.isAttachedToWindow(this)) {
            ValueAnimator valueAnimator = this.f32972OoooO00;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32972OoooO00 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f32973OoooO0O, f);
            this.f32972OoooO00 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new OooO00o(this, f));
            this.f32972OoooO00.setInterpolator(o0OO00OO.OooOoo(getContext(), com.github.superadb.R.attr.motionEasingEmphasizedInterpolator, oo0o0O0.f15016OooO0O0));
            this.f32972OoooO00.setDuration(o0OO00OO.OooOoo0(getContext(), com.github.superadb.R.attr.motionDurationLong2, getResources().getInteger(com.github.superadb.R.integer.material_motion_duration_long_1)));
            this.f32972OoooO00.start();
        } else {
            OooO0OO(f, f);
        }
        int i = this.f32957OooOooO;
        ViewGroup viewGroup = this.f32960Oooo0;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    OooO0o(getIconOrContainer(), this.f32953OooOoO0, 49);
                    OooO0oo(viewGroup, this.f32952OooOoO);
                    textView.setVisibility(0);
                } else {
                    OooO0o(getIconOrContainer(), this.f32953OooOoO0, 17);
                    OooO0oo(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                OooO0oo(viewGroup, this.f32952OooOoO);
                if (z) {
                    OooO0o(getIconOrContainer(), (int) (this.f32953OooOoO0 + this.f32954OooOoOO), 49);
                    OooO0o0(0, textView, 1.0f, 1.0f);
                    float f2 = this.f32956OooOoo0;
                    OooO0o0(4, textView2, f2, f2);
                } else {
                    OooO0o(getIconOrContainer(), this.f32953OooOoO0, 49);
                    float f3 = this.f32955OooOoo;
                    OooO0o0(4, textView, f3, f3);
                    OooO0o0(0, textView2, 1.0f, 1.0f);
                }
            } else if (i == 2) {
                OooO0o(getIconOrContainer(), this.f32953OooOoO0, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.f32958OooOooo) {
            if (z) {
                OooO0o(getIconOrContainer(), this.f32953OooOoO0, 49);
                OooO0oo(viewGroup, this.f32952OooOoO);
                textView.setVisibility(0);
            } else {
                OooO0o(getIconOrContainer(), this.f32953OooOoO0, 17);
                OooO0oo(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            OooO0oo(viewGroup, this.f32952OooOoO);
            if (z) {
                OooO0o(getIconOrContainer(), (int) (this.f32953OooOoO0 + this.f32954OooOoOO), 49);
                OooO0o0(0, textView, 1.0f, 1.0f);
                float f4 = this.f32956OooOoo0;
                OooO0o0(4, textView2, f4, f4);
            } else {
                OooO0o(getIconOrContainer(), this.f32953OooOoO0, 49);
                float f5 = this.f32955OooOoo;
                OooO0o0(4, textView, f5, f5);
                OooO0o0(0, textView2, 1.0f, 1.0f);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f32964Oooo0O0.setEnabled(z);
        this.f32965Oooo0OO.setEnabled(z);
        this.f32963Oooo00o.setEnabled(z);
        if (z) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.f32969Oooo0oo) {
            return;
        }
        this.f32969Oooo0oo = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.f32959Oooo = drawable;
            ColorStateList colorStateList = this.f32968Oooo0oO;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }
        this.f32963Oooo00o.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f32963Oooo00o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.f32968Oooo0oO = colorStateList;
        if (this.f32966Oooo0o == null || (drawable = this.f32959Oooo) == null) {
            return;
        }
        DrawableCompat.setTintList(drawable, colorStateList);
        this.f32959Oooo.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f32952OooOoO != i) {
            this.f32952OooOoO = i;
            MenuItemImpl menuItemImpl = this.f32966Oooo0o;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f32953OooOoO0 != i) {
            this.f32953OooOoO0 = i;
            MenuItemImpl menuItemImpl = this.f32966Oooo0o;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.f32967Oooo0o0 = i;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f32951OooOo0o = colorStateList;
        OooO0O0();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f32957OooOooO != i) {
            this.f32957OooOooO = i;
            if (this.f32975OoooOOO && i == 2) {
                this.f32971OoooO0 = f32948Ooooo00;
            } else {
                this.f32971OoooO0 = f32947OoooOoo;
            }
            OooO0oO(getWidth());
            MenuItemImpl menuItemImpl = this.f32966Oooo0o;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f32958OooOooo != z) {
            this.f32958OooOooo = z;
            MenuItemImpl menuItemImpl = this.f32966Oooo0o;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(@StyleRes int i) throws Resources.NotFoundException {
        TextView textView = this.f32965Oooo0OO;
        OooO0Oo(textView, i);
        OooO00o(this.f32964Oooo0O0.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i) throws Resources.NotFoundException {
        TextView textView = this.f32964Oooo0O0;
        OooO0Oo(textView, i);
        OooO00o(textView.getTextSize(), this.f32965Oooo0OO.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f32964Oooo0O0.setTextColor(colorStateList);
            this.f32965Oooo0OO.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.f32964Oooo0O0.setText(charSequence);
        this.f32965Oooo0OO.setText(charSequence);
        MenuItemImpl menuItemImpl = this.f32966Oooo0o;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.f32966Oooo0o;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.f32966Oooo0o.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return true;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f32949OooOo = drawable;
        OooO0O0();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z, char c) {
    }
}

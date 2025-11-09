package o00000;

import OooooO0.o00000O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public final class OooOo00 extends LinearLayout {

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static final /* synthetic */ int f28991Oooo00O = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public ImageView f28992OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public OooOOO0 f28993OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public TextView f28994OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public o00000O f28995OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public View f28996OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public View f28997OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public ImageView f28998OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public TextView f28999OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public Drawable f29000OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public int f29001OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ TabLayout f29002Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(TabLayout tabLayout, Context context) {
        super(context);
        this.f29002Oooo000 = tabLayout;
        this.f29001OooOooo = 2;
        OooO0o0(context);
        ViewCompat.setPaddingRelative(this, tabLayout.f27829OooOoO0, tabLayout.f27828OooOoO, tabLayout.f27830OooOoOO, tabLayout.f27832OooOoo0);
        setGravity(17);
        setOrientation(!tabLayout.o000oOoO ? 1 : 0);
        setClickable(true);
        ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
    }

    @Nullable
    private o00000O getBadge() {
        return this.f28995OooOoO;
    }

    @NonNull
    private o00000O getOrCreateBadge() throws Resources.NotFoundException {
        if (this.f28995OooOoO == null) {
            this.f28995OooOoO = new o00000O(getContext(), null);
        }
        OooO0O0();
        o00000O o00000o = this.f28995OooOoO;
        if (o00000o != null) {
            return o00000o;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void OooO00o() {
        if (this.f28995OooOoO != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f28996OooOoO0;
            if (view != null) {
                o00000O o00000o = this.f28995OooOoO;
                if (o00000o != null) {
                    WeakReference weakReference = o00000o.f15033Oooo00o;
                    if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                        WeakReference weakReference2 = o00000o.f15033Oooo00o;
                        (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                    } else {
                        view.getOverlay().remove(o00000o);
                    }
                }
                this.f28996OooOoO0 = null;
            }
        }
    }

    public final void OooO0O0() throws Resources.NotFoundException {
        OooOOO0 oooOOO0;
        if (this.f28995OooOoO != null) {
            if (this.f28997OooOoOO != null) {
                OooO00o();
                return;
            }
            ImageView imageView = this.f28992OooOo;
            if (imageView != null && (oooOOO0 = this.f28993OooOo0O) != null && oooOOO0.f28981OooO00o != null) {
                if (this.f28996OooOoO0 == imageView) {
                    OooO0OO(imageView);
                    return;
                }
                OooO00o();
                ImageView imageView2 = this.f28992OooOo;
                if (this.f28995OooOoO == null || imageView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                o00000O o00000o = this.f28995OooOoO;
                Rect rect = new Rect();
                imageView2.getDrawingRect(rect);
                o00000o.setBounds(rect);
                o00000o.OooO0o(imageView2, null);
                WeakReference weakReference = o00000o.f15033Oooo00o;
                if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                    WeakReference weakReference2 = o00000o.f15033Oooo00o;
                    (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(o00000o);
                } else {
                    imageView2.getOverlay().add(o00000o);
                }
                this.f28996OooOoO0 = imageView2;
                return;
            }
            TextView textView = this.f28994OooOo0o;
            if (textView == null || this.f28993OooOo0O == null) {
                OooO00o();
                return;
            }
            if (this.f28996OooOoO0 == textView) {
                OooO0OO(textView);
                return;
            }
            OooO00o();
            TextView textView2 = this.f28994OooOo0o;
            if (this.f28995OooOoO == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
            o00000O o00000o2 = this.f28995OooOoO;
            Rect rect2 = new Rect();
            textView2.getDrawingRect(rect2);
            o00000o2.setBounds(rect2);
            o00000o2.OooO0o(textView2, null);
            WeakReference weakReference3 = o00000o2.f15033Oooo00o;
            if ((weakReference3 != null ? (FrameLayout) weakReference3.get() : null) != null) {
                WeakReference weakReference4 = o00000o2.f15033Oooo00o;
                (weakReference4 != null ? (FrameLayout) weakReference4.get() : null).setForeground(o00000o2);
            } else {
                textView2.getOverlay().add(o00000o2);
            }
            this.f28996OooOoO0 = textView2;
        }
    }

    public final void OooO0OO(View view) {
        o00000O o00000o = this.f28995OooOoO;
        if (o00000o == null || view != this.f28996OooOoO0) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        o00000o.setBounds(rect);
        o00000o.OooO0o(view, null);
    }

    public final void OooO0Oo() {
        OooOOO0 oooOOO0 = this.f28993OooOo0O;
        View view = oooOOO0 != null ? oooOOO0.f28986OooO0o0 : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f28997OooOoOO = view;
            TextView textView = this.f28994OooOo0o;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f28992OooOo;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f28992OooOo.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f28999OooOoo0 = textView2;
            if (textView2 != null) {
                this.f29001OooOooo = TextViewCompat.getMaxLines(textView2);
            }
            this.f28998OooOoo = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view2 = this.f28997OooOoOO;
            if (view2 != null) {
                removeView(view2);
                this.f28997OooOoOO = null;
            }
            this.f28999OooOoo0 = null;
            this.f28998OooOoo = null;
        }
        boolean z = false;
        if (this.f28997OooOoOO == null) {
            if (this.f28992OooOo == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.github.superadb.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f28992OooOo = imageView2;
                addView(imageView2, 0);
            }
            if (this.f28994OooOo0o == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.github.superadb.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f28994OooOo0o = textView3;
                addView(textView3);
                this.f29001OooOooo = TextViewCompat.getMaxLines(this.f28994OooOo0o);
            }
            TextView textView4 = this.f28994OooOo0o;
            TabLayout tabLayout = this.f29002Oooo000;
            TextViewCompat.setTextAppearance(textView4, tabLayout.f27831OooOoo);
            ColorStateList colorStateList = tabLayout.f27833OooOooO;
            if (colorStateList != null) {
                this.f28994OooOo0o.setTextColor(colorStateList);
            }
            OooO0o(this.f28992OooOo, this.f28994OooOo0o);
            OooO0O0();
            ImageView imageView3 = this.f28992OooOo;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new OooOOOO(this, imageView3));
            }
            TextView textView5 = this.f28994OooOo0o;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new OooOOOO(this, textView5));
            }
        } else {
            TextView textView6 = this.f28999OooOoo0;
            if (textView6 != null || this.f28998OooOoo != null) {
                OooO0o(this.f28998OooOoo, textView6);
            }
        }
        if (oooOOO0 != null && !TextUtils.isEmpty(oooOOO0.f28983OooO0OO)) {
            setContentDescription(oooOOO0.f28983OooO0OO);
        }
        if (oooOOO0 != null) {
            TabLayout tabLayout2 = oooOOO0.f28985OooO0o;
            if (tabLayout2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout2.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == oooOOO0.f28984OooO0Oo) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void OooO0o(ImageView imageView, TextView textView) {
        Drawable drawable;
        OooOOO0 oooOOO0 = this.f28993OooOo0O;
        Drawable drawableMutate = (oooOOO0 == null || (drawable = oooOOO0.f28981OooO00o) == null) ? null : DrawableCompat.wrap(drawable).mutate();
        TabLayout tabLayout = this.f29002Oooo000;
        if (drawableMutate != null) {
            DrawableCompat.setTintList(drawableMutate, tabLayout.f27834OooOooo);
            PorterDuff.Mode mode = tabLayout.f27836Oooo0;
            if (mode != null) {
                DrawableCompat.setTintMode(drawableMutate, mode);
            }
        }
        OooOOO0 oooOOO02 = this.f28993OooOo0O;
        CharSequence charSequence = oooOOO02 != null ? oooOOO02.f28982OooO0O0 : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            } else {
                textView.setText(charSequence);
                this.f28993OooOo0O.getClass();
                textView.setVisibility(0);
                setVisibility(0);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iOooO0O0 = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) o0000oo.OooO0O0(getContext(), 8);
            if (tabLayout.o000oOoO) {
                if (iOooO0O0 != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, iOooO0O0);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iOooO0O0 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iOooO0O0;
                MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        OooOOO0 oooOOO03 = this.f28993OooOo0O;
        CharSequence charSequence2 = oooOOO03 != null ? oooOOO03.f28983OooO0OO : null;
        if (zIsEmpty) {
            charSequence = charSequence2;
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    public final void OooO0o0(Context context) {
        TabLayout tabLayout = this.f29002Oooo000;
        int i = tabLayout.f27843Oooo0o0;
        if (i != 0) {
            Drawable drawable = AppCompatResources.getDrawable(context, i);
            this.f29000OooOooO = drawable;
            if (drawable != null && drawable.isStateful()) {
                this.f29000OooOooO.setState(getDrawableState());
            }
        } else {
            this.f29000OooOooO = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.f27837Oooo000 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateListOooO00o = o0O0O00.OooO00o.OooO00o(tabLayout.f27837Oooo000);
            boolean z = tabLayout.f27854OoooOoO;
            if (z) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateListOooO00o, gradientDrawable, z ? null : gradientDrawable2);
        }
        ViewCompat.setBackground(this, gradientDrawable);
        tabLayout.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f29000OooOooO;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f29000OooOooO.setState(drawableState)) {
            invalidate();
            this.f29002Oooo000.invalidate();
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f28994OooOo0o, this.f28992OooOo, this.f28997OooOoOO};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f28994OooOo0o, this.f28992OooOo, this.f28997OooOoOO};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    @Nullable
    public OooOOO0 getTab() {
        return this.f28993OooOo0O;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        o00000O o00000o = this.f28995OooOoO;
        if (o00000o != null && o00000o.isVisible()) {
            accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f28995OooOoO.OooO0OO()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f28993OooOo0O.f28984OooO0Oo, 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(com.github.superadb.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.f29002Oooo000;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.f27842Oooo0o, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f28994OooOo0o != null) {
            float f = tabLayout.f27840Oooo0O0;
            int i3 = this.f29001OooOooo;
            ImageView imageView = this.f28992OooOo;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f28994OooOo0o;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.f27841Oooo0OO;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f28994OooOo0o.getTextSize();
            int lineCount = this.f28994OooOo0o.getLineCount();
            int maxLines = TextViewCompat.getMaxLines(this.f28994OooOo0o);
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.f27850OoooOO0 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f28994OooOo0o.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f28994OooOo0o.setTextSize(0, f);
                this.f28994OooOo0o.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f28993OooOo0O == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        OooOOO0 oooOOO0 = this.f28993OooOo0O;
        TabLayout tabLayout = oooOOO0.f28985OooO0o;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.OooO(oooOOO0, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f28994OooOo0o;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f28992OooOo;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f28997OooOoOO;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(@Nullable OooOOO0 oooOOO0) {
        if (oooOOO0 != this.f28993OooOo0O) {
            this.f28993OooOo0O = oooOOO0;
            OooO0Oo();
        }
    }
}

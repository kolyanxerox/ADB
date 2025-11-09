package com.google.android.material.internal;

import Oooooo.o0OO00O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0038R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public static final int[] f27687Oooo0o0 = {R.attr.state_checked};

    /* renamed from: OooOoo, reason: collision with root package name */
    public boolean f27688OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f27689OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f27690OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final CheckedTextView f27691OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public boolean f27692Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public FrameLayout f27693Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public MenuItemImpl f27694Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public ColorStateList f27695Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public Drawable f27696Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public final o0OO00O f27697Oooo0OO;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f27693Oooo000 == null) {
                this.f27693Oooo000 = (FrameLayout) ((ViewStub) findViewById(com.github.superadb.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f27693Oooo000.removeAllViews();
            this.f27693Oooo000.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f27694Oooo00O;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl, int i) {
        StateListDrawable stateListDrawable;
        this.f27694Oooo00O = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0038R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f27687Oooo0o0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ViewCompat.setBackground(this, stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        CharSequence title = this.f27694Oooo00O.getTitle();
        CheckedTextView checkedTextView = this.f27691OooOooo;
        if (title == null && this.f27694Oooo00O.getIcon() == null && this.f27694Oooo00O.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f27693Oooo000;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f27693Oooo000.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f27693Oooo000;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f27693Oooo000.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.f27694Oooo00O;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f27694Oooo00O.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, f27687Oooo0o0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f27690OooOooO != z) {
            this.f27690OooOooO = z;
            this.f27697Oooo0OO.sendAccessibilityEvent(this.f27691OooOooo, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f27691OooOooo.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f27692Oooo0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                DrawableCompat.setTintList(drawable, this.f27695Oooo00o);
            }
            int i = this.f27689OooOoo0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f27688OooOoo) {
            if (this.f27696Oooo0O0 == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), com.github.superadb.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f27696Oooo0O0 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f27689OooOoo0;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f27696Oooo0O0;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.f27691OooOooo, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f27691OooOooo.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@Dimension int i) {
        this.f27689OooOoo0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f27695Oooo00o = colorStateList;
        this.f27692Oooo0 = colorStateList != null;
        MenuItemImpl menuItemImpl = this.f27694Oooo00O;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f27691OooOooo.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f27688OooOoo = z;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        TextViewCompat.setTextAppearance(this.f27691OooOooo, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f27691OooOooo.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.f27691OooOooo.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0OO00O o0oo00o = new o0OO00O(this, 3);
        this.f27697Oooo0OO = o0oo00o;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.github.superadb.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.github.superadb.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.github.superadb.R.id.design_menu_item_text);
        this.f27691OooOooo = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(checkedTextView, o0oo00o);
    }
}

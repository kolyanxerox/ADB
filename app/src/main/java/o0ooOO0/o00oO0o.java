package o0ooOO0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.github.superadb.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o00oO0o implements MenuPresenter {

    /* renamed from: OooOo, reason: collision with root package name */
    public MenuPresenter.Callback f33108OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public NavigationMenuView f33109OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public LinearLayout f33110OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f33111OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public MenuBuilder f33112OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public Oooo000 f33113OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public LayoutInflater f33115OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public ColorStateList f33116OooOooO;

    /* renamed from: Oooo, reason: collision with root package name */
    public int f33118Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public RippleDrawable f33119Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public ColorStateList f33120Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public ColorStateList f33121Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public Drawable f33122Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public int f33123Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public int f33124Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public int f33125Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public int f33126Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public int f33127Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public int f33128Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public int f33129OoooO;

    /* renamed from: OoooO00, reason: collision with root package name */
    public boolean f33131OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public int f33132OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public int f33133OoooOO0;

    /* renamed from: OooOoo, reason: collision with root package name */
    public int f33114OooOoo = 0;

    /* renamed from: OooOooo, reason: collision with root package name */
    public int f33117OooOooo = 0;

    /* renamed from: OoooO0, reason: collision with root package name */
    public boolean f33130OoooO0 = true;
    public int o000oOoO = -1;

    /* renamed from: OoooOOO, reason: collision with root package name */
    public final com.google.android.material.datepicker.OooOo f33134OoooOOO = new com.google.android.material.datepicker.OooOo(this, 3);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return this.f33111OooOoO;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f33109OooOo0O == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f33115OooOoo0.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f33109OooOo0O = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new o00Oo0(this, this.f33109OooOo0O));
            if (this.f33113OooOoOO == null) {
                this.f33113OooOoOO = new Oooo000(this);
            }
            int i = this.o000oOoO;
            if (i != -1) {
                this.f33109OooOo0O.setOverScrollMode(i);
            }
            this.f33110OooOo0o = (LinearLayout) this.f33115OooOoo0.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f33109OooOo0O, false);
            this.f33109OooOo0O.setAdapter(this.f33113OooOoOO);
        }
        return this.f33109OooOo0O;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f33115OooOoo0 = LayoutInflater.from(context);
        this.f33112OooOoO0 = menuBuilder;
        this.f33133OoooOO0 = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.f33108OooOo;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItemImpl menuItemImpl;
        View actionView;
        o0OOO0o o0ooo0o;
        MenuItemImpl menuItemImpl2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f33109OooOo0O.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                Oooo000 oooo000 = this.f33113OooOoOO;
                oooo000.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                ArrayList arrayList = oooo000.f33084OooO00o;
                if (i != 0) {
                    oooo000.f33086OooO0OO = true;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        o000oOoO o000oooo2 = (o000oOoO) arrayList.get(i2);
                        if ((o000oooo2 instanceof o00O0O) && (menuItemImpl2 = ((o00O0O) o000oooo2).f33105OooO00o) != null && menuItemImpl2.getItemId() == i) {
                            oooo000.OooO0O0(menuItemImpl2);
                            break;
                        }
                        i2++;
                    }
                    oooo000.f33086OooO0OO = false;
                    oooo000.OooO00o();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        o000oOoO o000oooo3 = (o000oOoO) arrayList.get(i3);
                        if ((o000oooo3 instanceof o00O0O) && (menuItemImpl = ((o00O0O) o000oooo3).f33105OooO00o) != null && (actionView = menuItemImpl.getActionView()) != null && (o0ooo0o = (o0OOO0o) sparseParcelableArray2.get(menuItemImpl.getItemId())) != null) {
                            actionView.restoreHierarchyState(o0ooo0o);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f33110OooOo0o.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f33109OooOo0O != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f33109OooOo0O.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        Oooo000 oooo000 = this.f33113OooOoOO;
        if (oooo000 != null) {
            oooo000.getClass();
            Bundle bundle2 = new Bundle();
            MenuItemImpl menuItemImpl = oooo000.f33085OooO0O0;
            if (menuItemImpl != null) {
                bundle2.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = oooo000.f33084OooO00o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                o000oOoO o000oooo2 = (o000oOoO) arrayList.get(i);
                if (o000oooo2 instanceof o00O0O) {
                    MenuItemImpl menuItemImpl2 = ((o00O0O) o000oooo2).f33105OooO00o;
                    View actionView = menuItemImpl2 != null ? menuItemImpl2.getActionView() : null;
                    if (actionView != null) {
                        o0OOO0o o0ooo0o = new o0OOO0o();
                        actionView.saveHierarchyState(o0ooo0o);
                        sparseArray2.put(menuItemImpl2.getItemId(), o0ooo0o);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f33110OooOo0o != null) {
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>();
            this.f33110OooOo0o.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f33108OooOo = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z) {
        Oooo000 oooo000 = this.f33113OooOoOO;
        if (oooo000 != null) {
            oooo000.OooO00o();
            oooo000.notifyDataSetChanged();
        }
    }
}

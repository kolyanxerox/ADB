package o0ooOO0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.github.superadb.R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Oooo000 extends RecyclerView.Adapter {

    /* renamed from: OooO00o */
    public final ArrayList f33084OooO00o = new ArrayList();

    /* renamed from: OooO0O0 */
    public MenuItemImpl f33085OooO0O0;

    /* renamed from: OooO0OO */
    public boolean f33086OooO0OO;

    /* renamed from: OooO0Oo */
    public final /* synthetic */ o00oO0o f33087OooO0Oo;

    public Oooo000(o00oO0o o00oo0o) {
        this.f33087OooO0Oo = o00oo0o;
        OooO00o();
    }

    public final void OooO00o() {
        boolean z;
        if (this.f33086OooO0OO) {
            return;
        }
        this.f33086OooO0OO = true;
        ArrayList arrayList = this.f33084OooO00o;
        arrayList.clear();
        arrayList.add(new Oooo0());
        o00oO0o o00oo0o = this.f33087OooO0Oo;
        int size = o00oo0o.f33112OooOoO0.getVisibleItems().size();
        boolean z2 = false;
        int i = -1;
        int i2 = 0;
        boolean z3 = false;
        int size2 = 0;
        while (i2 < size) {
            MenuItemImpl menuItemImpl = o00oo0o.f33112OooOoO0.getVisibleItems().get(i2);
            if (menuItemImpl.isChecked()) {
                OooO0O0(menuItemImpl);
            }
            if (menuItemImpl.isCheckable()) {
                menuItemImpl.setExclusiveCheckable(z2);
            }
            if (menuItemImpl.hasSubMenu()) {
                SubMenu subMenu = menuItemImpl.getSubMenu();
                if (subMenu.hasVisibleItems()) {
                    if (i2 != 0) {
                        arrayList.add(new o0OoOo0(o00oo0o.f33133OoooOO0, z2 ? 1 : 0));
                    }
                    arrayList.add(new o00O0O(menuItemImpl));
                    int size3 = subMenu.size();
                    int i3 = z2 ? 1 : 0;
                    int i4 = i3;
                    while (i3 < size3) {
                        MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i3);
                        if (menuItemImpl2.isVisible()) {
                            if (i4 == 0 && menuItemImpl2.getIcon() != null) {
                                i4 = 1;
                            }
                            if (menuItemImpl2.isCheckable()) {
                                menuItemImpl2.setExclusiveCheckable(z2);
                            }
                            if (menuItemImpl.isChecked()) {
                                OooO0O0(menuItemImpl);
                            }
                            arrayList.add(new o00O0O(menuItemImpl2));
                        }
                        i3++;
                        z2 = false;
                    }
                    if (i4 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((o00O0O) arrayList.get(size5)).f33106OooO0O0 = true;
                        }
                    }
                }
                z = true;
            } else {
                int groupId = menuItemImpl.getGroupId();
                if (groupId != i) {
                    size2 = arrayList.size();
                    z3 = menuItemImpl.getIcon() != null;
                    if (i2 != 0) {
                        size2++;
                        int i5 = o00oo0o.f33133OoooOO0;
                        arrayList.add(new o0OoOo0(i5, i5));
                    }
                } else {
                    if (!z3 && menuItemImpl.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i6 = size2; i6 < size6; i6++) {
                            ((o00O0O) arrayList.get(i6)).f33106OooO0O0 = true;
                        }
                        z = true;
                        z3 = true;
                    }
                    o00O0O o00o0o = new o00O0O(menuItemImpl);
                    o00o0o.f33106OooO0O0 = z3;
                    arrayList.add(o00o0o);
                    i = groupId;
                }
                z = true;
                o00O0O o00o0o2 = new o00O0O(menuItemImpl);
                o00o0o2.f33106OooO0O0 = z3;
                arrayList.add(o00o0o2);
                i = groupId;
            }
            i2++;
            z2 = false;
        }
        this.f33086OooO0OO = z2 ? 1 : 0;
    }

    public final void OooO0O0(MenuItemImpl menuItemImpl) {
        if (this.f33085OooO0O0 == menuItemImpl || !menuItemImpl.isCheckable()) {
            return;
        }
        MenuItemImpl menuItemImpl2 = this.f33085OooO0O0;
        if (menuItemImpl2 != null) {
            menuItemImpl2.setChecked(false);
        }
        this.f33085OooO0O0 = menuItemImpl;
        menuItemImpl.setChecked(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f33084OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        o000oOoO o000oooo2 = (o000oOoO) this.f33084OooO00o.get(i);
        if (o000oooo2 instanceof o0OoOo0) {
            return 2;
        }
        if (o000oooo2 instanceof Oooo0) {
            return 3;
        }
        if (o000oooo2 instanceof o00O0O) {
            return ((o00O0O) o000oooo2).f33105OooO00o.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        oo000o oo000oVar = (oo000o) viewHolder;
        int itemViewType = getItemViewType(i);
        ArrayList arrayList = this.f33084OooO00o;
        o00oO0o o00oo0o = this.f33087OooO0Oo;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    o0OoOo0 o0oooo0 = (o0OoOo0) arrayList.get(i);
                    oo000oVar.itemView.setPadding(o00oo0o.f33127Oooo0oO, o0oooo0.f33140OooO00o, o00oo0o.f33128Oooo0oo, o0oooo0.f33141OooO0O0);
                    return;
                } else {
                    if (itemViewType != 3) {
                        return;
                    }
                    ViewCompat.setAccessibilityDelegate(oo000oVar.itemView, new OooOo(this, i, true));
                    return;
                }
            }
            TextView textView = (TextView) oo000oVar.itemView;
            textView.setText(((o00O0O) arrayList.get(i)).f33105OooO00o.getTitle());
            int i2 = o00oo0o.f33114OooOoo;
            if (i2 != 0) {
                TextViewCompat.setTextAppearance(textView, i2);
            }
            textView.setPadding(o00oo0o.f33118Oooo, textView.getPaddingTop(), 0, textView.getPaddingBottom());
            ColorStateList colorStateList = o00oo0o.f33116OooOooO;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            ViewCompat.setAccessibilityDelegate(textView, new OooOo(this, i, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) oo000oVar.itemView;
        navigationMenuItemView.setIconTintList(o00oo0o.f33121Oooo00O);
        int i3 = o00oo0o.f33117OooOooo;
        if (i3 != 0) {
            navigationMenuItemView.setTextAppearance(i3);
        }
        ColorStateList colorStateList2 = o00oo0o.f33120Oooo000;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = o00oo0o.f33122Oooo00o;
        ViewCompat.setBackground(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
        RippleDrawable rippleDrawable = o00oo0o.f33119Oooo0;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        o00O0O o00o0o = (o00O0O) arrayList.get(i);
        navigationMenuItemView.setNeedsEmptyIcon(o00o0o.f33106OooO0O0);
        int i4 = o00oo0o.f33123Oooo0O0;
        int i5 = o00oo0o.f33124Oooo0OO;
        navigationMenuItemView.setPadding(i4, i5, i4, i5);
        navigationMenuItemView.setIconPadding(o00oo0o.f33126Oooo0o0);
        if (o00oo0o.f33131OoooO00) {
            navigationMenuItemView.setIconSize(o00oo0o.f33125Oooo0o);
        }
        navigationMenuItemView.setMaxLines(o00oo0o.f33132OoooO0O);
        navigationMenuItemView.initialize(o00o0o.f33105OooO00o, 0);
        ViewCompat.setAccessibilityDelegate(navigationMenuItemView, new OooOo(this, i, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        o00oO0o o00oo0o = this.f33087OooO0Oo;
        if (i == 0) {
            LayoutInflater layoutInflater = o00oo0o.f33115OooOoo0;
            com.google.android.material.datepicker.OooOo oooOo = o00oo0o.f33134OoooOOO;
            o00Ooo o00ooo2 = new o00Ooo(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            o00ooo2.itemView.setOnClickListener(oooOo);
            return o00ooo2;
        }
        if (i == 1) {
            return new OooOo00(o00oo0o.f33115OooOoo0.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i == 2) {
            return new OooOo00(o00oo0o.f33115OooOoo0.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new OooOo00(o00oo0o.f33110OooOo0o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        oo000o oo000oVar = (oo000o) viewHolder;
        if (oo000oVar instanceof o00Ooo) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) oo000oVar.itemView;
            FrameLayout frameLayout = navigationMenuItemView.f27693Oooo000;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f27691OooOooo.setCompoundDrawables(null, null, null, null);
        }
    }
}

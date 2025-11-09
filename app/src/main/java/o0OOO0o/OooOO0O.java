package o0OOO0o;

import OooooO0.o00000O;
import OooooO0.o00000OO;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import o0ooOO0.o0OOO0o;

/* loaded from: classes2.dex */
public final class OooOO0O implements MenuPresenter {

    /* renamed from: OooOo */
    public int f32982OooOo;

    /* renamed from: OooOo0O */
    public OooO f32983OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f32984OooOo0o;

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
        return this.f32982OooOo;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        return this.f32983OooOo0O;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f32983OooOo0O.f32943OoooOOo = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        SparseArray sparseArray;
        if (parcelable instanceof OooOO0) {
            OooO oooO = this.f32983OooOo0O;
            OooOO0 oooOO0 = (OooOO0) parcelable;
            int i = oooOO0.f32980OooOo0O;
            int size = oooO.f32943OoooOOo.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = oooO.f32943OoooOOo.getItem(i2);
                if (i == item.getItemId()) {
                    oooO.f32923OooOoo0 = i;
                    oooO.f32922OooOoo = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f32983OooOo0O.getContext();
            o0OOO0o o0ooo0o = oooOO0.f32981OooOo0o;
            SparseArray sparseArray2 = new SparseArray(o0ooo0o.size());
            for (int i3 = 0; i3 < o0ooo0o.size(); i3++) {
                int iKeyAt = o0ooo0o.keyAt(i3);
                o00000OO o00000oo2 = (o00000OO) o0ooo0o.valueAt(i3);
                if (o00000oo2 == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                sparseArray2.put(iKeyAt, new o00000O(context, o00000oo2));
            }
            OooO oooO2 = this.f32983OooOo0O;
            oooO2.getClass();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = oooO2.f32933Oooo0o;
                if (i4 >= size2) {
                    break;
                }
                int iKeyAt2 = sparseArray2.keyAt(i4);
                if (sparseArray.indexOfKey(iKeyAt2) < 0) {
                    sparseArray.append(iKeyAt2, (o00000O) sparseArray2.get(iKeyAt2));
                }
                i4++;
            }
            OooO0OO[] oooO0OOArr = oooO2.f32921OooOoOO;
            if (oooO0OOArr != null) {
                for (OooO0OO oooO0OO : oooO0OOArr) {
                    oooO0OO.setBadge((o00000O) sparseArray.get(oooO0OO.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        OooOO0 oooOO0 = new OooOO0();
        oooOO0.f32980OooOo0O = this.f32983OooOo0O.getSelectedItemId();
        SparseArray<o00000O> badgeDrawables = this.f32983OooOo0O.getBadgeDrawables();
        o0OOO0o o0ooo0o = new o0OOO0o();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            o00000O o00000oValueAt = badgeDrawables.valueAt(i);
            if (o00000oValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            o0ooo0o.put(iKeyAt, o00000oValueAt.f15024OooOoO.f15034OooO00o);
        }
        oooOO0.f32981OooOo0o = o0ooo0o;
        return oooOO0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z) throws Resources.NotFoundException {
        AutoTransition autoTransition;
        if (this.f32984OooOo0o) {
            return;
        }
        if (z) {
            this.f32983OooOo0O.OooO00o();
            return;
        }
        OooO oooO = this.f32983OooOo0O;
        MenuBuilder menuBuilder = oooO.f32943OoooOOo;
        if (menuBuilder == null || oooO.f32921OooOoOO == null) {
            return;
        }
        int size = menuBuilder.size();
        if (size != oooO.f32921OooOoOO.length) {
            oooO.OooO00o();
            return;
        }
        int i = oooO.f32923OooOoo0;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = oooO.f32943OoooOOo.getItem(i2);
            if (item.isChecked()) {
                oooO.f32923OooOoo0 = item.getItemId();
                oooO.f32922OooOoo = i2;
            }
        }
        if (i != oooO.f32923OooOoo0 && (autoTransition = oooO.f32917OooOo0O) != null) {
            TransitionManager.beginDelayedTransition(oooO, autoTransition);
        }
        boolean zOooO0o0 = OooO.OooO0o0(oooO.f32919OooOoO, oooO.f32943OoooOOo.getVisibleItems().size());
        for (int i3 = 0; i3 < size; i3++) {
            oooO.f32942OoooOOO.f32984OooOo0o = true;
            oooO.f32921OooOoOO[i3].setLabelVisibilityMode(oooO.f32919OooOoO);
            oooO.f32921OooOoOO[i3].setShifting(zOooO0o0);
            oooO.f32921OooOoOO[i3].initialize((MenuItemImpl) oooO.f32943OoooOOo.getItem(i3), 0);
            oooO.f32942OoooOOO.f32984OooOo0o = false;
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }
}

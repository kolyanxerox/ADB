package o0ooOO0;

import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* loaded from: classes2.dex */
public final class OooOOOO extends MenuBuilder {
    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        o0ooOOo o0ooooo = new o0ooOOo(getContext(), this, menuItemImpl);
        menuItemImpl.setSubMenu(o0ooooo);
        return o0ooooo;
    }
}

package o0OOO0o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* loaded from: classes2.dex */
public final class OooO0o extends MenuBuilder {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f32978OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f32979OooO0O0;

    public OooO0o(Context context, Class cls, int i) {
        super(context);
        this.f32978OooO00o = cls;
        this.f32979OooO0O0 = i;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int size = size() + 1;
        int i4 = this.f32979OooO0O0;
        if (size <= i4) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
            if (menuItemAddInternal instanceof MenuItemImpl) {
                ((MenuItemImpl) menuItemAddInternal).setExclusiveCheckable(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.f32978OooO00o.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(OooO0oO.OooOo.OooOOOo(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f32978OooO00o.getSimpleName().concat(" does not support submenus"));
    }
}

package o0ooOO0;

import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.SubMenuBuilder;

/* loaded from: classes2.dex */
public final class o0ooOOo extends SubMenuBuilder {
    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((MenuBuilder) getParentMenu()).onItemsChanged(z);
    }
}

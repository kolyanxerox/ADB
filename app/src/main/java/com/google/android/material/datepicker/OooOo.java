package com.google.android.material.datepicker;

import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes2.dex */
public final class OooOo implements View.OnClickListener {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f27544OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f27545OooOo0o;

    public /* synthetic */ OooOo(Object obj, int i) {
        this.f27544OooOo0O = i;
        this.f27545OooOo0o = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27544OooOo0O) {
            case 0:
                o000oOoO o000oooo2 = (o000oOoO) this.f27545OooOo0o;
                int i = o000oooo2.f27558OooOoO;
                if (i == 2) {
                    o000oooo2.OooO0o(1);
                    return;
                } else {
                    if (i == 1) {
                        o000oooo2.OooO0o(2);
                        return;
                    }
                    return;
                }
            case 1:
                ((o00O0O) this.f27545OooOo0o).OooO0o0();
                throw null;
            case 2:
                MenuItemImpl itemData = ((o0OOO0o.OooO0OO) view).getItemData();
                o0OOO0o.OooO oooO = (o0OOO0o.OooO) this.f27545OooOo0o;
                if (oooO.f32943OoooOOo.performItemAction(itemData, oooO.f32942OoooOOO, 0)) {
                    return;
                }
                itemData.setChecked(true);
                return;
            default:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                o0ooOO0.o00oO0o o00oo0o = (o0ooOO0.o00oO0o) this.f27545OooOo0o;
                o0ooOO0.Oooo000 oooo000 = o00oo0o.f33113OooOoOO;
                boolean z = true;
                if (oooo000 != null) {
                    oooo000.f33086OooO0OO = true;
                }
                MenuItemImpl itemData2 = navigationMenuItemView.getItemData();
                boolean zPerformItemAction = o00oo0o.f33112OooOoO0.performItemAction(itemData2, o00oo0o, 0);
                if (itemData2 != null && itemData2.isCheckable() && zPerformItemAction) {
                    o00oo0o.f33113OooOoOO.OooO0O0(itemData2);
                } else {
                    z = false;
                }
                o0ooOO0.Oooo000 oooo0002 = o00oo0o.f33113OooOoOO;
                if (oooo0002 != null) {
                    oooo0002.f33086OooO0OO = false;
                }
                if (z) {
                    o00oo0o.updateMenuView(false);
                    return;
                }
                return;
        }
    }
}

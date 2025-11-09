package o0ooOO0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO00o */
    public final HashMap f33007OooO00o = new HashMap();

    /* renamed from: OooO0O0 */
    public final HashSet f33008OooO0O0 = new HashSet();

    /* renamed from: OooO0OO */
    public ooOO.oo000o f33009OooO0OO;

    /* renamed from: OooO0Oo */
    public boolean f33010OooO0Oo;

    /* renamed from: OooO0o0 */
    public boolean f33011OooO0o0;

    public final boolean OooO00o(OooOOO oooOOO) {
        int id = oooOOO.getId();
        HashSet hashSet = this.f33008OooO0O0;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        OooOOO oooOOO2 = (OooOOO) this.f33007OooO00o.get(Integer.valueOf(OooO0OO()));
        if (oooOOO2 != null) {
            OooO0o0(oooOOO2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!oooOOO.isChecked()) {
            oooOOO.setChecked(true);
        }
        return zAdd;
    }

    public final ArrayList OooO0O0(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f33008OooO0O0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof OooOOO) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int OooO0OO() {
        if (!this.f33010OooO0Oo) {
            return -1;
        }
        HashSet hashSet = this.f33008OooO0O0;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void OooO0Oo() {
        ooOO.oo000o oo000oVar = this.f33009OooO0OO;
        if (oo000oVar != null) {
            new HashSet(this.f33008OooO0O0);
            ChipGroup chipGroup = oo000oVar.f33292OooO00o;
            ooOO.o0ooOOo o0ooooo = chipGroup.f27517OooOoo0;
            if (o0ooooo != null) {
                chipGroup.f27516OooOoo.OooO0O0(chipGroup);
                ChipGroup chipGroup2 = ((ooOO.oo000o) o0ooooo).f33292OooO00o;
                if (chipGroup2.f27516OooOoo.f33010OooO0Oo) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean OooO0o0(OooOOO oooOOO, boolean z) {
        int id = oooOOO.getId();
        HashSet hashSet = this.f33008OooO0O0;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            oooOOO.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (oooOOO.isChecked()) {
            oooOOO.setChecked(false);
        }
        return zRemove;
    }
}

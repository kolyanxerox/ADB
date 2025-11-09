package ooOO;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import o0ooOO0.OooO0OO;

/* loaded from: classes2.dex */
public final class o0OOO0o implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: OooOo0O */
    public ViewGroup.OnHierarchyChangeListener f33289OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ ChipGroup f33290OooOo0o;

    public o0OOO0o(ChipGroup chipGroup) {
        this.f33290OooOo0o = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f33290OooOo0o;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(ViewCompat.generateViewId());
            }
            Chip chip = (Chip) view2;
            OooO0OO oooO0OO = chipGroup.f27516OooOoo;
            oooO0OO.f33007OooO00o.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                oooO0OO.OooO00o(chip);
            }
            chip.setInternalOnCheckedChangeListener(new o000Ooo.o00oO0o(oooO0OO, 19));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f33289OooOo0O;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f33290OooOo0o;
        if (view == chipGroup && (view2 instanceof Chip)) {
            Chip chip = (Chip) view2;
            OooO0OO oooO0OO = chipGroup.f27516OooOoo;
            oooO0OO.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            oooO0OO.f33007OooO00o.remove(Integer.valueOf(chip.getId()));
            oooO0OO.f33008OooO0O0.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f33289OooOo0O;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}

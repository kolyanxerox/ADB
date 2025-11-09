package OoooooO;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* loaded from: classes2.dex */
public final class O0O0 extends AccessibilityDelegateCompat {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f15102OooO00o;

    public O0O0(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f15102OooO00o = materialButtonToggleGroup;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int i2 = MaterialButtonToggleGroup.f27450Oooo000;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f15102OooO00o;
        if (view instanceof MaterialButton) {
            i = 0;
            for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                if (materialButtonToggleGroup.getChildAt(i3) == view) {
                    break;
                }
                if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.OooO0OO(i3)) {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, i, 1, false, ((MaterialButton) view).f27447Oooo000));
    }
}

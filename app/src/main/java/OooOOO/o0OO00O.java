package Oooooo;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.superadb.R;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.datepicker.o000oOoO;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes2.dex */
public final class o0OO00O extends AccessibilityDelegateCompat {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f15082OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ Object f15083OooO0O0;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f15082OooO00o = i;
        this.f15083OooO0O0 = obj;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f15082OooO00o) {
            case 2:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f15083OooO0O0).f27675OooOo0O);
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.f15082OooO00o) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                o000oOoO o000oooo2 = (o000oOoO) this.f15083OooO0O0;
                accessibilityNodeInfoCompat.setHintText(o000oooo2.f27564OooOooo.getVisibility() == 0 ? o000oooo2.getString(R.string.mtrl_picker_toggle_to_year_selection) : o000oooo2.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                CheckableImageButton checkableImageButton = (CheckableImageButton) this.f15083OooO0O0;
                accessibilityNodeInfoCompat.setCheckable(checkableImageButton.f27676OooOo0o);
                accessibilityNodeInfoCompat.setChecked(checkableImageButton.f27675OooOo0O);
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(((NavigationMenuItemView) this.f15083OooO0O0).f27690OooOooO);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f15082OooO00o) {
            case 0:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    int i = BottomSheetDragHandleView.f27425OooOooo;
                    ((BottomSheetDragHandleView) this.f15083OooO0O0).OooO00o();
                    break;
                }
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}

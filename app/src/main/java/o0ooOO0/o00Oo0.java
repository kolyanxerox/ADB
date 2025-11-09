package o0ooOO0;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

/* loaded from: classes2.dex */
public final class o00Oo0 extends RecyclerViewAccessibilityDelegate {

    /* renamed from: OooO00o */
    public final /* synthetic */ o00oO0o f33107OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(o00oO0o o00oo0o, RecyclerView recyclerView) {
        super(recyclerView);
        this.f33107OooO00o = o00oo0o;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        o00oO0o o00oo0o = this.f33107OooO00o.f33113OooOoOO.f33087OooO0Oo;
        int i = o00oo0o.f33110OooOo0o.getChildCount() == 0 ? 0 : 1;
        for (int i2 = 0; i2 < o00oo0o.f33113OooOoOO.f33084OooO00o.size(); i2++) {
            int itemViewType = o00oo0o.f33113OooOoOO.getItemViewType(i2);
            if (itemViewType == 0 || itemViewType == 1) {
                i++;
            }
        }
        accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(i, 1, false));
    }
}

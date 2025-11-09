package o0ooOO0;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes2.dex */
public final class OooOo extends AccessibilityDelegateCompat {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f33081OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f33082OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f33083OooO0OO;

    public OooOo(Oooo000 oooo000, int i, boolean z) {
        this.f33083OooO0OO = oooo000;
        this.f33081OooO00o = i;
        this.f33082OooO0O0 = z;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        o00oO0o o00oo0o;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int i = this.f33081OooO00o;
        int i2 = 0;
        int i3 = i;
        while (true) {
            o00oo0o = this.f33083OooO0OO.f33087OooO0Oo;
            if (i2 >= i) {
                break;
            }
            if (o00oo0o.f33113OooOoOO.getItemViewType(i2) == 2) {
                i3--;
            }
            i2++;
        }
        if (o00oo0o.f33110OooOo0o.getChildCount() == 0) {
            i3--;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i3, 1, 1, 1, this.f33082OooO0O0, view.isSelected()));
    }
}

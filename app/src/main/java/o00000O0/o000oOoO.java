package o00000O0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class o000oOoO extends View.AccessibilityDelegate {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f29200OooO00o;

    public o000oOoO(o0OoOo0 o0oooo0) {
        this.f29200OooO00o = o0oooo0;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f29200OooO00o.f29214OooO0O0.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}

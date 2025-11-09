package o00000O0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class o0OOO0o extends AccessibilityDelegateCompat {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final TextInputLayout f29211OooO00o;

    public o0OOO0o(TextInputLayout textInputLayout) {
        this.f29211OooO00o = textInputLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        TextInputLayout textInputLayout = this.f29211OooO00o;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f27921o00000O;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        oo000o oo000oVar = textInputLayout.f27879OooOo0o;
        AppCompatTextView appCompatTextView = oo000oVar.f29235OooOo0o;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfoCompat.setLabelFor(appCompatTextView);
            accessibilityNodeInfoCompat.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfoCompat.setTraversalAfter(oo000oVar.f29237OooOoO0);
        }
        if (!zIsEmpty) {
            accessibilityNodeInfoCompat.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfoCompat.setText(string);
            if (!z && placeholderText != null) {
                accessibilityNodeInfoCompat.setText(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfoCompat.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfoCompat.setHintText(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                accessibilityNodeInfoCompat.setText(string);
            }
            accessibilityNodeInfoCompat.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfoCompat.setError(error);
        }
        View view2 = textInputLayout.f27885OooOooO.f29227OooOOo;
        if (view2 != null) {
            accessibilityNodeInfoCompat.setLabelFor(view2);
        }
        textInputLayout.f27877OooOo.OooO0O0().OooOOO(accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        this.f29211OooO00o.f27877OooOo.OooO0O0().OooOOOO(accessibilityEvent);
    }
}

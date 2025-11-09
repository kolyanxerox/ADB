package androidx.core.view.autofill;

import OooO0OO.OooO00o;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    private AutofillIdCompat(AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    public static AutofillIdCompat toAutofillIdCompat(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    public AutofillId toAutofillId() {
        return OooO00o.OooOo(this.mWrappedObj);
    }
}

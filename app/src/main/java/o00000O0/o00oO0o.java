package o00000O0;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class o00oO0o implements TextWatcher {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f29208OooOo0O;

    public o00oO0o(TextInputLayout textInputLayout) {
        this.f29208OooOo0O = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f29208OooOo0O;
        textInputLayout.OooOOoo(!textInputLayout.f27927o00000oo, false);
        if (textInputLayout.f27886OooOooo) {
            textInputLayout.OooOOO0(editable);
        }
        if (textInputLayout.f27894Oooo0o) {
            textInputLayout.OooOo00(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

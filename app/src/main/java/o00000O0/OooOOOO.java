package o00000O0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo f29169OooO00o;

    public OooOOOO(OooOo oooOo) {
        this.f29169OooO00o = oooOo;
    }

    public final void OooO00o(TextInputLayout textInputLayout) {
        OooOo oooOo = this.f29169OooO00o;
        if (oooOo.f29187Oooo0o0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oooOo.f29187Oooo0o0;
        OooOOO oooOOO = oooOo.f29189Oooo0oo;
        if (editText != null) {
            editText.removeTextChangedListener(oooOOO);
            if (oooOo.f29187Oooo0o0.getOnFocusChangeListener() == oooOo.OooO0O0().OooO0o0()) {
                oooOo.f29187Oooo0o0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oooOo.f29187Oooo0o0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(oooOOO);
        }
        oooOo.OooO0O0().OooOOO0(oooOo.f29187Oooo0o0);
        oooOo.OooO(oooOo.OooO0O0());
    }
}

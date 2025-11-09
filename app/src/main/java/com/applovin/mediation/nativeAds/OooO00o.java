package com.applovin.mediation.nativeAds;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import o00000O0.OooO0o;
import o00000O0.OooOOO0;
import o00000O0.o00Ooo;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements View.OnClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15859OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15860OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f15859OooOo0O = i;
        this.f15860OooOo0o = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15859OooOo0O) {
            case 0:
                ((MaxNativeAd) this.f15860OooOo0o).performClick();
                break;
            case 1:
                OooO0o oooO0o = (OooO0o) this.f15860OooOo0o;
                EditText editText = oooO0o.f29153OooO0o0;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    oooO0o.OooOOo0();
                    break;
                }
                break;
            case 2:
                ((OooOOO0) this.f15860OooOo0o).OooOo0();
                break;
            default:
                o00Ooo o00ooo2 = (o00Ooo) this.f15860OooOo0o;
                EditText editText2 = o00ooo2.f29205OooO0o;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = o00ooo2.f29205OooO0o;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        o00ooo2.f29205OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        o00ooo2.f29205OooO0o.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        o00ooo2.f29205OooO0o.setSelection(selectionEnd);
                    }
                    o00ooo2.OooOOo0();
                    break;
                }
                break;
        }
    }
}

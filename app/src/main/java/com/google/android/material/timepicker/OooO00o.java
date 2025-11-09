package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import o0ooOO0.o00000;

/* loaded from: classes2.dex */
public final class OooO00o extends o00000 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ ChipTextInputComboView f27973OooOo0O;

    public OooO00o(ChipTextInputComboView chipTextInputComboView) {
        this.f27973OooOo0O = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f27973OooOo0O;
        Chip chip = chipTextInputComboView.f27946OooOo0O;
        if (zIsEmpty) {
            chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
        } else {
            chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
        }
    }
}

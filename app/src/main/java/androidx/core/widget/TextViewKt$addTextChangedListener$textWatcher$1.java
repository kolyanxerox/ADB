package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import o00O0Oo.Oooo000;
import o00O0Oo.o00Ooo;

/* loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Oooo000 $afterTextChanged;
    final /* synthetic */ o00Ooo $beforeTextChanged;
    final /* synthetic */ o00Ooo $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(Oooo000 oooo000, o00Ooo o00ooo2, o00Ooo o00ooo3) {
        this.$afterTextChanged = oooo000;
        this.$beforeTextChanged = o00ooo2;
        this.$onTextChanged = o00ooo3;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}

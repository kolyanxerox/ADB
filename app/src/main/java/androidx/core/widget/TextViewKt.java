package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.o00Ooo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class TextViewKt {

    /* renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$1 */
    public static final class C02741 extends Oooo000 implements o00Ooo {
        public static final C02741 INSTANCE = new C02741();

        public C02741() {
            super(4);
        }

        public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // o00O0Oo.o00Ooo
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$2 */
    public static final class C02752 extends Oooo000 implements o00Ooo {
        public static final C02752 INSTANCE = new C02752();

        public C02752() {
            super(4);
        }

        public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // o00O0Oo.o00Ooo
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$3 */
    public static final class C02763 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C02763 INSTANCE = new C02763();

        public C02763() {
            super(1);
        }

        public final void invoke(Editable editable) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Editable) obj);
            return OooOo.f33195OooO00o;
        }
    }

    public static final TextWatcher addTextChangedListener(TextView textView, o00Ooo o00ooo2, o00Ooo o00ooo3, o00O0Oo.Oooo000 oooo000) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(oooo000, o00ooo2, o00ooo3);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, o00Ooo o00ooo2, o00Ooo o00ooo3, o00O0Oo.Oooo000 oooo000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00ooo2 = C02741.INSTANCE;
        }
        if ((i & 2) != 0) {
            o00ooo3 = C02752.INSTANCE;
        }
        if ((i & 4) != 0) {
            oooo000 = C02763.INSTANCE;
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(oooo000, o00ooo2, o00ooo3);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final o00O0Oo.Oooo000 oooo000) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                oooo000.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final o00Ooo o00ooo2) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                o00ooo2.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final o00Ooo o00ooo2) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                o00ooo2.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}

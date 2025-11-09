package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import o00O0o0O.o00Ooo;

/* loaded from: classes.dex */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, o00Ooo o00ooo2, Object obj) {
        spannable.setSpan(obj, o00ooo2.f31437OooOo0O, o00ooo2.f31438OooOo0o, 17);
    }
}

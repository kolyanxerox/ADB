package OooO0o;

import android.app.Person;
import android.os.Parcelable;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* bridge */ /* synthetic */ Person OooO0o(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ Person OooO0o0(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder OooOO0O(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText OooOOO(Object obj) {
        return (PrecomputedText) obj;
    }

    public static /* bridge */ /* synthetic */ boolean OooOo0(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean OooOo0O(Object obj) {
        return obj instanceof PrecomputedText;
    }
}

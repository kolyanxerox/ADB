package oo0o0Oo;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public abstract class OooO0O0 {
    public static TypedValue OooO00o(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean OooO0O0(Context context, int i, boolean z) {
        TypedValue typedValueOooO00o = OooO00o(context, i);
        return (typedValueOooO00o == null || typedValueOooO00o.type != 18) ? z : typedValueOooO00o.data != 0;
    }

    public static TypedValue OooO0OO(Context context, String str, int i) {
        TypedValue typedValueOooO00o = OooO00o(context, i);
        if (typedValueOooO00o != null) {
            return typedValueOooO00o;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}

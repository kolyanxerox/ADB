package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ContextCompatHelper {
    public static final ContextCompatHelper INSTANCE = new ContextCompatHelper();

    private ContextCompatHelper() {
    }

    public final Context unwrapUiContext$window_release(Context context) {
        OooOo.OooO0o0(context, "context");
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                    OooOo.OooO0Oo(baseContext, "iterator.baseContext");
                }
            }
            return baseContext;
        }
        throw new IllegalArgumentException("Context " + context + " is not a UiContext");
    }
}

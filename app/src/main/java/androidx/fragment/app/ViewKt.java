package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ViewKt {
    public static final <F extends Fragment> F findFragment(View view) {
        OooOo.OooO0o0(view, "<this>");
        F f = (F) FragmentManager.findFragment(view);
        OooOo.OooO0Oo(f, "findFragment(this)");
        return f;
    }
}

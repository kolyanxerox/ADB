package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C0578R;
import kotlin.jvm.internal.OooOo;
import o00O0o.o0OoOo0;

/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        OooOo.OooO0o0(view, "<this>");
        return (LifecycleOwner) o0OoOo0.Oooo0OO(o0OoOo0.Oooo0oO(o0OoOo0.Oooo0o0(ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE, view), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        OooOo.OooO0o0(view, "<this>");
        view.setTag(C0578R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}

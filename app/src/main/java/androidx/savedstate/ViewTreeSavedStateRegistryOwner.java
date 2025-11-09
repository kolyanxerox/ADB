package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import o00O0o.o0OoOo0;

/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        OooOo.OooO0o0(view, "<this>");
        return (SavedStateRegistryOwner) o0OoOo0.Oooo0OO(o0OoOo0.Oooo0oO(o0OoOo0.Oooo0o0(C0711x10fac0e2.INSTANCE, view), C0712x10fac0e3.INSTANCE));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        OooOo.OooO0o0(view, "<this>");
        view.setTag(C0710R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}

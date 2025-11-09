package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
/* loaded from: classes.dex */
public final class C0712x10fac0e3 extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final C0712x10fac0e3 INSTANCE = new C0712x10fac0e3();

    public C0712x10fac0e3() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final SavedStateRegistryOwner invoke(View view) {
        OooOo.OooO0o0(view, "view");
        Object tag = view.getTag(C0710R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof SavedStateRegistryOwner) {
            return (SavedStateRegistryOwner) tag;
        }
        return null;
    }
}

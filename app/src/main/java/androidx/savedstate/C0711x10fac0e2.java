package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 */
/* loaded from: classes.dex */
public final class C0711x10fac0e2 extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final C0711x10fac0e2 INSTANCE = new C0711x10fac0e2();

    public C0711x10fac0e2() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final View invoke(View view) {
        OooOo.OooO0o0(view, "view");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}

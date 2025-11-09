package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C0578R;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final LifecycleOwner invoke(View viewParent) {
        OooOo.OooO0o0(viewParent, "viewParent");
        Object tag = viewParent.getTag(C0578R.id.view_tree_lifecycle_owner);
        if (tag instanceof LifecycleOwner) {
            return (LifecycleOwner) tag;
        }
        return null;
    }
}

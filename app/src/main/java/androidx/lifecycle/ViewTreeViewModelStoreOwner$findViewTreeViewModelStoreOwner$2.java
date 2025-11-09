package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.C0580R;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 INSTANCE = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2();

    public ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final ViewModelStoreOwner invoke(View view) {
        OooOo.OooO0o0(view, "view");
        Object tag = view.getTag(C0580R.id.view_tree_view_model_store_owner);
        if (tag instanceof ViewModelStoreOwner) {
            return (ViewModelStoreOwner) tag;
        }
        return null;
    }
}

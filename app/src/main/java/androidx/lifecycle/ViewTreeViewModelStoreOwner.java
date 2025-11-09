package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.C0580R;
import kotlin.jvm.internal.OooOo;
import o00O0o.o0OoOo0;

/* loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        OooOo.OooO0o0(view, "<this>");
        return (ViewModelStoreOwner) o0OoOo0.Oooo0OO(o0OoOo0.Oooo0oO(o0OoOo0.Oooo0o0(ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE, view), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        OooOo.OooO0o0(view, "<this>");
        view.setTag(C0580R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}

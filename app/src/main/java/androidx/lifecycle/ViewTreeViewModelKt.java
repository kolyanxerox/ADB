package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ViewTreeViewModelKt {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        OooOo.OooO0o0(view, "view");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}

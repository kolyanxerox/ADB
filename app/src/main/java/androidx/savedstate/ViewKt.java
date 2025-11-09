package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ViewKt {
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        OooOo.OooO0o0(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}

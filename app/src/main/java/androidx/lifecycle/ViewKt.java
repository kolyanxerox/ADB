package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ViewKt {
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        OooOo.OooO0o0(view, "view");
        return ViewTreeLifecycleOwner.get(view);
    }
}

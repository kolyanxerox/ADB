package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 */
/* loaded from: classes.dex */
public final class C0027x54146ae extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final C0027x54146ae INSTANCE = new C0027x54146ae();

    public C0027x54146ae() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final View invoke(View it) {
        OooOo.OooO0o0(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}

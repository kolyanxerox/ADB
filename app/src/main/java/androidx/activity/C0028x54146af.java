package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 */
/* loaded from: classes.dex */
public final class C0028x54146af extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final C0028x54146af INSTANCE = new C0028x54146af();

    public C0028x54146af() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final FullyDrawnReporterOwner invoke(View it) {
        OooOo.OooO0o0(it, "it");
        Object tag = it.getTag(C0026R.id.report_drawn);
        if (tag instanceof FullyDrawnReporterOwner) {
            return (FullyDrawnReporterOwner) tag;
        }
        return null;
    }
}

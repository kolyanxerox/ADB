package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import o00O0o.o0OoOo0;

/* loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        OooOo.OooO0o0(view, "<this>");
        return (FullyDrawnReporterOwner) o0OoOo0.Oooo0OO(o0OoOo0.Oooo0oO(o0OoOo0.Oooo0o0(C0027x54146ae.INSTANCE, view), C0028x54146af.INSTANCE));
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        OooOo.OooO0o0(view, "<this>");
        OooOo.OooO0o0(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(C0026R.id.report_drawn, fullyDrawnReporterOwner);
    }
}

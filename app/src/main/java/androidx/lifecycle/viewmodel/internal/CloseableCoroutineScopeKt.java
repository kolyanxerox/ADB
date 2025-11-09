package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOO;
import o00O0O0O.OooOOO0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00OO000.Oooo0;
import o00OO00o.OooO;

/* loaded from: classes.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(o000OO o000oo2) {
        OooOo.OooO0o0(o000oo2, "<this>");
        return new CloseableCoroutineScope(o000oo2);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        OooOOO0 oooOOO0 = OooOOO.f31358OooOo0O;
        try {
            OooO oooO = o000O0O0.f31514OooO00o;
            oooOOO0 = Oooo0.f31951OooO00o.f31652OooOo;
        } catch (IllegalStateException | oo00o.OooO unused) {
        }
        return new CloseableCoroutineScope(oooOOO0.plus(o0000OO0.OooO0o0()));
    }
}

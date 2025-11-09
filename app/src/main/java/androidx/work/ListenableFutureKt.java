package androidx.work;

import Oooo0o0.OooO;
import java.util.concurrent.ExecutionException;
import o00000oO.OooOOO;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0oOo.oo0o0Oo;

/* loaded from: classes.dex */
public final class ListenableFutureKt {
    public static final <R> Object await(OooOOO oooOOO, OooO0OO oooO0OO) throws Throwable {
        if (oooOOO.isDone()) {
            try {
                return oooOOO.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        oooOOO.addListener(new ListenableFutureKt$await$2$1(oo0o0oo, oooOOO), DirectExecutor.INSTANCE);
        Object objOooOOOo = oo0o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }

    private static final <R> Object await$$forInline(OooOOO oooOOO, OooO0OO oooO0OO) throws Throwable {
        if (oooOOO.isDone()) {
            try {
                return oooOOO.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        oooOOO.addListener(new ListenableFutureKt$await$2$1(oo0o0oo, oooOOO), DirectExecutor.INSTANCE);
        Object objOooOOOo = oo0o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }
}

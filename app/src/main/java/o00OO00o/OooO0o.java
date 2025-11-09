package o00OO00o;

import java.util.concurrent.Executor;
import o00O0oOo.o0000O00;
import o00O0oOo.o00O00;
import o00OO000.o00oO0o;

/* loaded from: classes3.dex */
public final class OooO0o extends o00O00 implements Executor {

    /* renamed from: OooOo0O */
    public static final OooO0o f31999OooOo0O = new OooO0o();

    /* renamed from: OooOo0o */
    public static final o0000O00 f32000OooOo0o;

    static {
        OooOo oooOo = OooOo.f32006OooOo0O;
        int i = o00oO0o.f31965OooO00o;
        if (64 >= i) {
            i = 64;
        }
        f32000OooOo0o = o0000O00.limitedParallelism$default(oooOo, o00OO000.OooO00o.OooOO0(i, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatch(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        f32000OooOo0o.dispatch(oooOOO0, runnable);
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatchYield(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        f32000OooOo0o.dispatchYield(oooOOO0, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(o00O0O0O.OooOOO.f31358OooOo0O, runnable);
    }

    @Override // o00O0oOo.o0000O00
    public final o0000O00 limitedParallelism(int i, String str) {
        return OooOo.f32006OooOo0O.limitedParallelism(i, str);
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // o00O0oOo.o00O00
    public final Executor OooOOO0() {
        return this;
    }
}

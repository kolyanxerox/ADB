package o00O0oOo;

import java.util.concurrent.Executor;
import o00O0O0O.OooOOO;

/* loaded from: classes3.dex */
public final class o000OO0O implements Executor {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0000O00 f31516OooOo0O;

    public o000OO0O(o0000O00 o0000o00) {
        this.f31516OooOo0O = o0000o00;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooOOO oooOOO = OooOOO.f31358OooOo0O;
        o0000O00 o0000o00 = this.f31516OooOo0O;
        if (o0000o00.isDispatchNeeded(oooOOO)) {
            o0000o00.dispatch(oooOOO, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f31516OooOo0O.toString();
    }
}

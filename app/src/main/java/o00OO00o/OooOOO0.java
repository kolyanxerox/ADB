package o00OO00o;

import java.util.concurrent.Executor;
import o00O0oOo.o00O00;

/* loaded from: classes3.dex */
public abstract class OooOOO0 extends o00O00 {

    /* renamed from: OooOo0O */
    public OooO0OO f32004OooOo0O;

    @Override // o00O0oOo.o00O00
    public final Executor OooOOO0() {
        return this.f32004OooOo0O;
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatch(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        OooO0OO.OooO0OO(this.f32004OooOo0O, runnable, 6);
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatchYield(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        OooO0OO.OooO0OO(this.f32004OooOo0O, runnable, 2);
    }
}

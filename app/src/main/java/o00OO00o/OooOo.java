package o00OO00o;

import o00O0oOo.o0000O00;
import o00OO000.o000oOoO;

/* loaded from: classes3.dex */
public final class OooOo extends o0000O00 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final OooOo f32006OooOo0O = new OooOo();

    @Override // o00O0oOo.o0000O00
    public final void dispatch(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        OooO.f31972OooOo0o.f32004OooOo0O.OooO0O0(runnable, true, false);
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatchYield(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        OooO.f31972OooOo0o.f32004OooOo0O.OooO0O0(runnable, true, true);
    }

    @Override // o00O0oOo.o0000O00
    public final o0000O00 limitedParallelism(int i, String str) {
        o00OO000.OooO00o.OooO00o(i);
        return i >= OooOo00.f32010OooO0Oo ? str != null ? new o000oOoO(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        return "Dispatchers.IO";
    }
}

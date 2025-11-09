package o00OO000;

import o00O0oOo.o0000O00;
import o00O0oOo.o000O00;
import o00O0oOo.o000O000;
import o00O0oOo.o000OO00;
import o00O0oOo.oo0o0Oo;

/* loaded from: classes3.dex */
public final class o000oOoO extends o0000O00 implements o000O00 {

    /* renamed from: OooOo */
    public final String f31959OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ o000O00 f31960OooOo0O;

    /* renamed from: OooOo0o */
    public final o0000O00 f31961OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(o0000O00 o0000o00, String str) {
        o000O00 o000o002 = o0000o00 instanceof o000O00 ? (o000O00) o0000o00 : null;
        this.f31960OooOo0O = o000o002 == null ? o000O000.f31511OooO00o : o000o002;
        this.f31961OooOo0o = o0000o00;
        this.f31959OooOo = str;
    }

    @Override // o00O0oOo.o000O00
    public final void OooO(long j, oo0o0Oo oo0o0oo) {
        this.f31960OooOo0O.OooO(j, oo0o0oo);
    }

    @Override // o00O0oOo.o000O00
    public final o000OO00 OooO0Oo(long j, Runnable runnable, o00O0O0O.OooOOO0 oooOOO0) {
        return this.f31960OooOo0O.OooO0Oo(j, runnable, oooOOO0);
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatch(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        this.f31961OooOo0o.dispatch(oooOOO0, runnable);
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatchYield(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        this.f31961OooOo0o.dispatchYield(oooOOO0, runnable);
    }

    @Override // o00O0oOo.o0000O00
    public final boolean isDispatchNeeded(o00O0O0O.OooOOO0 oooOOO0) {
        return this.f31961OooOo0o.isDispatchNeeded(oooOOO0);
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        return this.f31959OooOo;
    }
}

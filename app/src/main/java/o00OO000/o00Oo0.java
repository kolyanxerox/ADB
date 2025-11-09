package o00OO000;

import o00O0oOo.o0000OO0;

/* loaded from: classes3.dex */
public class o00Oo0 extends o00O0oOo.o000oOoO implements o00O0OO0.OooO0o {

    /* renamed from: OooOoO0 */
    public final o00O0O0O.OooO0OO f31962OooOoO0;

    public o00Oo0(o00O0O0O.OooO0OO oooO0OO, o00O0O0O.OooOOO0 oooOOO0) {
        super(oooOOO0, true);
        this.f31962OooOoO0 = oooO0OO;
    }

    @Override // o00O0oOo.o00O
    public void OooOOoo(Object obj) {
        OooO00o.OooO0oo(o0000OO0.OooOo(obj), Oooo0o0.OooO.OooOOOO(this.f31962OooOoO0));
    }

    @Override // o00O0oOo.o00O
    public void OooOo00(Object obj) {
        this.f31962OooOoO0.resumeWith(o0000OO0.OooOo(obj));
    }

    @Override // o00O0oOo.o00O
    public final boolean Oooo0o() {
        return true;
    }

    @Override // o00O0OO0.OooO0o
    public final o00O0OO0.OooO0o getCallerFrame() {
        o00O0O0O.OooO0OO oooO0OO = this.f31962OooOoO0;
        if (oooO0OO instanceof o00O0OO0.OooO0o) {
            return (o00O0OO0.OooO0o) oooO0OO;
        }
        return null;
    }
}

package o00O0oOo;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o00Oo0 implements o0OOO0o {

    /* renamed from: OooOo0O */
    public final o00O0O[] f31550OooOo0O;

    public o00Oo0(o00O0O[] o00o0oArr) {
        this.f31550OooOo0O = o00o0oArr;
    }

    @Override // o00O0oOo.o0OOO0o
    public final void OooO00o(Throwable th) {
        OooO0O0();
    }

    public final void OooO0O0() {
        for (o00O0O o00o0o : this.f31550OooOo0O) {
            o000OO00 o000oo002 = o00o0o.f31536OooOoOO;
            if (o000oo002 == null) {
                OooOo.OooOO0o("handle");
                throw null;
            }
            o000oo002.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f31550OooOo0O + ']';
    }
}

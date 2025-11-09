package o00O0oOo;

import java.util.concurrent.CancellationException;
import o00O0O0O.OooO00o;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class o00OO0O0 extends OooO00o implements o00O0O00 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o00OO0O0 f31546OooOo0O = new o00OO0O0(o00O0.f31523OooOo0O);

    @Override // o00O0oOo.o00O0O00
    public final o000OO00 OooO0o(boolean z, boolean z2, o00O0OO0 o00o0oo0) {
        return o00OO0OO.f31547OooOo0O;
    }

    @Override // o00O0oOo.o00O0O00
    public final CancellationException OooO0o0() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // o00O0oOo.o00O0O00
    public final o000OO00 OooO0oo(Oooo000 oooo000) {
        return o00OO0OO.f31547OooOo0O;
    }

    @Override // o00O0oOo.o00O0O00
    public final o000000 OooOO0O(o00O o00o) {
        return o00OO0OO.f31547OooOo0O;
    }

    @Override // o00O0oOo.o00O0O00
    public final boolean OooOOo0() {
        return false;
    }

    @Override // o00O0oOo.o00O0O00
    public final boolean isActive() {
        return true;
    }

    @Override // o00O0oOo.o00O0O00
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // o00O0oOo.o00O0O00
    public final void OooO00o(CancellationException cancellationException) {
    }
}

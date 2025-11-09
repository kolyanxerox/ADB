package o00O0oo;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o000O0O0.OooO0O0;
import o000Ooo.o00oO0o;
import o00O.Oooo000;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00O0oOo.o000oOoO;
import o00O0oOo.o00O0O0;

/* loaded from: classes3.dex */
public final class o0O0ooO extends o000oOoO implements o00oOoo, o000O00O {

    /* renamed from: OooOoO0 */
    public final o000O000 f31651OooOoO0;

    public o0O0ooO(OooOOO0 oooOOO0, o000O000 o000o0002) {
        super(oooOOO0, true);
        this.f31651OooOoO0 = o000o0002;
    }

    @Override // o00O0oo.o00O00
    public final Object OooO(Object obj) {
        return this.f31651OooOoO0.OooO(obj);
    }

    @Override // o00O0oOo.o00O, o00O0oOo.o00O0O00
    public final void OooO00o(CancellationException cancellationException) {
        if (OooOOo0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new o00O0O0(OooOoO0(), null, this);
        }
        OooOo0o(cancellationException);
    }

    @Override // o00O0oo.o00O000o
    public final Object OooO0Oo(OooO0OO oooO0OO) {
        return this.f31651OooOoO0.OooO0Oo(oooO0OO);
    }

    @Override // o00O0oo.o00O000o
    public final o00oO0o OooOO0() {
        return this.f31651OooOoO0.OooOO0();
    }

    @Override // o00O0oo.o00O000o
    public final Object OooOO0o() {
        return this.f31651OooOoO0.OooOO0o();
    }

    @Override // o00O0oo.o00O00
    public final boolean OooOOO(Throwable th) {
        return this.f31651OooOoO0.OooO0oO(false, th);
    }

    @Override // o00O0oo.o00O00
    public final Object OooOOO0(Object obj, OooO0OO oooO0OO) {
        return this.f31651OooOoO0.OooOOO0(obj, oooO0OO);
    }

    @Override // o00O0oo.o00O000o
    public final Object OooOOOo(Oooo000 oooo000) {
        o000O000 o000o0002 = this.f31651OooOoO0;
        o000o0002.getClass();
        Object objOooOooO = o000O000.OooOooO(o000o0002, oooo000);
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOooO;
    }

    @Override // o00O0oOo.o00O
    public final void OooOo0o(CancellationException cancellationException) {
        this.f31651OooOoO0.OooO0oO(true, cancellationException);
        OooOo0O(cancellationException);
    }

    @Override // o00O0oOo.o000oOoO
    public final void OoooOoo(boolean z, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f31651OooOoO0.OooO0oO(false, th) || z) {
            return;
        }
        o00O0oOo.o0000OO0.OooOOo(this.f31520OooOo, th);
    }

    @Override // o00O0oOo.o000oOoO
    public final void Ooooo00(Object obj) {
        this.f31651OooOoO0.OooOOO(null);
    }

    public final void OooooO0(o00O0000 o00o0000) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o000O000 o000o0002 = this.f31651OooOoO0;
        o000o0002.getClass();
        do {
            atomicReferenceFieldUpdater = o000O000.f31620OooOooo;
            if (atomicReferenceFieldUpdater.compareAndSet(o000o0002, null, o00o0000)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(o000o0002) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(o000o0002);
            OooO0O0 oooO0O0 = o000Oo0.f31646OooOOo0;
            if (obj != oooO0O0) {
                if (obj == o000Oo0.f31645OooOOo) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            OooO0O0 oooO0O02 = o000Oo0.f31645OooOOo;
            while (!atomicReferenceFieldUpdater.compareAndSet(o000o0002, oooO0O0, oooO0O02)) {
                if (atomicReferenceFieldUpdater.get(o000o0002) != oooO0O0) {
                    break;
                }
            }
            o00o0000.invoke(o000o0002.OooOOo());
            return;
        }
    }
}

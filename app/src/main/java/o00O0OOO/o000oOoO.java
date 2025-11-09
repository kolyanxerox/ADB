package o00O0oOo;

import OooOOO0.OooO00o;
import Oooo0o0.OooO;
import java.lang.reflect.InvocationTargetException;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public abstract class o000oOoO extends o00O implements OooO0OO, o000OO {

    /* renamed from: OooOo */
    public final OooOOO0 f31520OooOo;

    public o000oOoO(OooOOO0 oooOOO0, boolean z) {
        super(z);
        Oooo0O0((o00O0O00) oooOOO0.get(o00O0.f31523OooOo0O));
        this.f31520OooOo = oooOOO0.plus(this);
    }

    @Override // o00O0oOo.o00O
    public final String OooOoO0() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // o00O0oOo.o00O
    public final void Oooo0(OooO00o oooO00o) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o0000OO0.OooOOo(this.f31520OooOo, oooO00o);
    }

    @Override // o00O0oOo.o00O
    public final void OoooO0O(Object obj) {
        if (!(obj instanceof o0000Ooo)) {
            Ooooo00(obj);
            return;
        }
        o0000Ooo o0000ooo = (o0000Ooo) obj;
        OoooOoo(o0000Ooo.f31506OooO0O0.get(o0000ooo) != 0, o0000ooo.f31507OooO00o);
    }

    public final void Ooooo0o(o0000O o0000o2, o000oOoO o000oooo2, o00O0Oo.o00O0O o00o0o) {
        int iOrdinal = o0000o2.ordinal();
        OooOo oooOo = OooOo.f33195OooO00o;
        if (iOrdinal == 0) {
            try {
                o00OO000.OooO00o.OooO0oo(oooOo, OooO.OooOOOO(OooO.OooO0oO(o000oooo2, this, o00o0o)));
                return;
            } finally {
                resumeWith(o00O0.o000OOo.OooO0O0(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                OooO.OooOOOO(OooO.OooO0oO(o000oooo2, this, o00o0o)).resumeWith(oooOo);
                return;
            }
            if (iOrdinal != 3) {
                throw new OooO00o();
            }
            try {
                OooOOO0 oooOOO0 = this.f31520OooOo;
                Object objOooOO0o = o00OO000.OooO00o.OooOO0o(oooOOO0, null);
                try {
                    kotlin.jvm.internal.o0O0O00.OooO0O0(2, o00o0o);
                    Object objInvoke = o00o0o.invoke(o000oooo2, this);
                    if (objInvoke != OooOo00.f31365OooOo0O) {
                        resumeWith(objInvoke);
                    }
                } finally {
                    o00OO000.OooO00o.OooO0oO(oooOOO0, objOooOO0o);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // o00O0O0O.OooO0OO
    public final OooOOO0 getContext() {
        return this.f31520OooOo;
    }

    @Override // o00O0oOo.o000OO
    public final OooOOO0 getCoroutineContext() {
        return this.f31520OooOo;
    }

    @Override // o00O0O0O.OooO0OO
    public final void resumeWith(Object obj) {
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(obj);
        if (thOooO00o != null) {
            obj = new o0000Ooo(false, thOooO00o);
        }
        Object objOooo0oo = Oooo0oo(obj);
        if (objOooo0oo == o0000OO0.f31502OooO0o0) {
            return;
        }
        OooOo00(objOooo0oo);
    }

    public void Ooooo00(Object obj) {
    }

    public void OoooOoo(boolean z, Throwable th) {
    }
}

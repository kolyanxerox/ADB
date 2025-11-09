package o00O0oOo;

import o00O0O0O.OooO0OO;
import o00O0O0O.OooO0o;
import o00O0O0O.OooOOO0;
import o00OO000.OooO00o;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class o0O00o0 extends o00OO000.o00Oo0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final ThreadLocal f31559OooOoO;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0O00o0(OooO0OO oooO0OO, OooOOO0 oooOOO0) {
        oo00oO oo00oo = oo00oO.f31577OooOo0O;
        super(oooO0OO, oooOOO0.get(oo00oo) == null ? oooOOO0.plus(oo00oo) : oooOOO0);
        this.f31559OooOoO = new ThreadLocal();
        if (oooO0OO.getContext().get(OooO0o.f31357OooOo0O) instanceof o0000O00) {
            return;
        }
        Object objOooOO0o = OooO00o.OooOO0o(oooOOO0, null);
        OooO00o.OooO0oO(oooOOO0, objOooOO0o);
        OooooOO(oooOOO0, objOooOO0o);
    }

    @Override // o00OO000.o00Oo0, o00O0oOo.o00O
    public final void OooOo00(Object obj) {
        if (this.threadLocalIsSet) {
            OooOO0 oooOO0 = (OooOO0) this.f31559OooOoO.get();
            if (oooOO0 != null) {
                OooO00o.OooO0oO((OooOOO0) oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
            }
            this.f31559OooOoO.remove();
        }
        Object objOooOo = o0000OO0.OooOo(obj);
        OooO0OO oooO0OO = this.f31962OooOoO0;
        OooOOO0 context = oooO0OO.getContext();
        Object objOooOO0o = OooO00o.OooOO0o(context, null);
        o0O00o0 o0o00o0Oooo000 = objOooOO0o != OooO00o.f31925OooO0Oo ? o0000OO0.Oooo000(oooO0OO, context, objOooOO0o) : null;
        try {
            this.f31962OooOoO0.resumeWith(objOooOo);
            if (o0o00o0Oooo000 == null || o0o00o0Oooo000.OooooO0()) {
                OooO00o.OooO0oO(context, objOooOO0o);
            }
        } catch (Throwable th) {
            if (o0o00o0Oooo000 == null || o0o00o0Oooo000.OooooO0()) {
                OooO00o.OooO0oO(context, objOooOO0o);
            }
            throw th;
        }
    }

    public final boolean OooooO0() {
        boolean z = this.threadLocalIsSet && this.f31559OooOoO.get() == null;
        this.f31559OooOoO.remove();
        return !z;
    }

    public final void OooooOO(OooOOO0 oooOOO0, Object obj) {
        this.threadLocalIsSet = true;
        this.f31559OooOoO.set(new OooOO0(oooOOO0, obj));
    }
}

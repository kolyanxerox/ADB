package o00OO000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o0000Ooo;
import o00O0oOo.o000O0Oo;
import o00O0oOo.o00O000o;
import o00O0oOo.o0o0Oo;

/* loaded from: classes3.dex */
public final class OooOO0 extends o000O0Oo implements o00O0OO0.OooO0o, o00O0O0O.OooO0OO {

    /* renamed from: OooOoo */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31933OooOoo = AtomicReferenceFieldUpdater.newUpdater(OooOO0.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* renamed from: OooOoO */
    public final o00O0O0O.OooO0OO f31934OooOoO;

    /* renamed from: OooOoO0 */
    public final o0000O00 f31935OooOoO0;

    /* renamed from: OooOoOO */
    public Object f31936OooOoOO;

    /* renamed from: OooOoo0 */
    public final Object f31937OooOoo0;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public OooOO0(o0000O00 o0000o00, o00O0O0O.OooO0OO oooO0OO) {
        super(-1);
        this.f31935OooOoO0 = o0000o00;
        this.f31934OooOoO = oooO0OO;
        this.f31936OooOoOO = OooO00o.f31923OooO0O0;
        this.f31937OooOoo0 = OooO00o.OooOO0O(oooO0OO.getContext());
    }

    @Override // o00O0oOo.o000O0Oo
    public final Object OooO0oo() {
        Object obj = this.f31936OooOoOO;
        this.f31936OooOoOO = OooO00o.f31923OooO0O0;
        return obj;
    }

    @Override // o00O0OO0.OooO0o
    public final o00O0OO0.OooO0o getCallerFrame() {
        o00O0O0O.OooO0OO oooO0OO = this.f31934OooOoO;
        if (oooO0OO instanceof o00O0OO0.OooO0o) {
            return (o00O0OO0.OooO0o) oooO0OO;
        }
        return null;
    }

    @Override // o00O0O0O.OooO0OO
    public final o00O0O0O.OooOOO0 getContext() {
        return this.f31934OooOoO.getContext();
    }

    @Override // o00O0O0O.OooO0OO
    public final void resumeWith(Object obj) {
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(obj);
        Object o0000ooo = thOooO00o == null ? obj : new o0000Ooo(false, thOooO00o);
        o00O0O0O.OooO0OO oooO0OO = this.f31934OooOoO;
        o00O0O0O.OooOOO0 context = oooO0OO.getContext();
        o0000O00 o0000o00 = this.f31935OooOoO0;
        if (o0000o00.isDispatchNeeded(context)) {
            this.f31936OooOoOO = o0000ooo;
            this.f31515OooOo = 0;
            o0000o00.dispatch(oooO0OO.getContext(), this);
            return;
        }
        o00O000o o00o000oOooO00o = o0o0Oo.OooO00o();
        if (o00o000oOooO00o.f31530OooOo0O >= 4294967296L) {
            this.f31936OooOoOO = o0000ooo;
            this.f31515OooOo = 0;
            o00o000oOooO00o.OooOOO(this);
            return;
        }
        o00o000oOooO00o.OooOOOo(true);
        try {
            o00O0O0O.OooOOO0 context2 = oooO0OO.getContext();
            Object objOooOO0o = OooO00o.OooOO0o(context2, this.f31937OooOoo0);
            try {
                oooO0OO.resumeWith(obj);
                while (o00o000oOooO00o.OooOOoo()) {
                }
            } finally {
                OooO00o.OooO0oO(context2, objOooOO0o);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f31935OooOoO0 + ", " + o0000OO0.OooOoo(this.f31934OooOoO) + ']';
    }

    @Override // o00O0oOo.o000O0Oo
    public final o00O0O0O.OooO0OO OooO0OO() {
        return this;
    }
}

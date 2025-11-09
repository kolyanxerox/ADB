package o00O0OO0;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public abstract class OooO0OO extends OooO00o {
    private final o00O0O0O.OooOOO0 _context;
    private transient o00O0O0O.OooO0OO intercepted;

    public OooO0OO(o00O0O0O.OooO0OO oooO0OO, o00O0O0O.OooOOO0 oooOOO0) {
        super(oooO0OO);
        this._context = oooOOO0;
    }

    @Override // o00O0O0O.OooO0OO
    public o00O0O0O.OooOOO0 getContext() {
        o00O0O0O.OooOOO0 oooOOO0 = this._context;
        OooOo.OooO0O0(oooOOO0);
        return oooOOO0;
    }

    public final o00O0O0O.OooO0OO intercepted() {
        o00O0O0O.OooO0OO oooO0OOInterceptContinuation = this.intercepted;
        if (oooO0OOInterceptContinuation == null) {
            o00O0O0O.OooO oooO = (o00O0O0O.OooO) getContext().get(o00O0O0O.OooO0o.f31357OooOo0O);
            if (oooO == null || (oooO0OOInterceptContinuation = oooO.interceptContinuation(this)) == null) {
                oooO0OOInterceptContinuation = this;
            }
            this.intercepted = oooO0OOInterceptContinuation;
        }
        return oooO0OOInterceptContinuation;
    }

    @Override // o00O0OO0.OooO00o
    public void releaseIntercepted() {
        o00O0O0O.OooO0OO oooO0OO = this.intercepted;
        if (oooO0OO != null && oooO0OO != this) {
            o00O0O0O.OooOO0 oooOO0 = getContext().get(o00O0O0O.OooO0o.f31357OooOo0O);
            OooOo.OooO0O0(oooOO0);
            ((o00O0O0O.OooO) oooOO0).releaseInterceptedContinuation(oooO0OO);
        }
        this.intercepted = OooO0O0.f31372OooOo0O;
    }

    public OooO0OO(o00O0O0O.OooO0OO oooO0OO) {
        this(oooO0OO, oooO0OO != null ? oooO0OO.getContext() : null);
    }
}

package o00O;

import o00O0oOo.o0000OO0;
import o00O0ooo.o0O000Oo;

/* loaded from: classes3.dex */
public final class o0ooOOo extends o00O0OO0.OooO0OO implements o0O000Oo {

    /* renamed from: OooOo */
    public final int f31227OooOo;

    /* renamed from: OooOo0O */
    public final o0O000Oo f31228OooOo0O;

    /* renamed from: OooOo0o */
    public final o00O0O0O.OooOOO0 f31229OooOo0o;

    /* renamed from: OooOoO */
    public o00O0O0O.OooO0OO f31230OooOoO;

    /* renamed from: OooOoO0 */
    public o00O0O0O.OooOOO0 f31231OooOoO0;

    public o0ooOOo(o0O000Oo o0o000oo, o00O0O0O.OooOOO0 oooOOO0) {
        super(o00Ooo.f31217OooOo0O, o00O0O0O.OooOOO.f31358OooOo0O);
        this.f31228OooOo0O = o0o000oo;
        this.f31229OooOo0o = oooOOO0;
        this.f31227OooOo = ((Number) oooOOO0.fold(0, new o00oO0o(0))).intValue();
    }

    public final Object OooO0O0(o00O0O0O.OooO0OO oooO0OO, Object obj) {
        o00O0O0O.OooOOO0 context = oooO0OO.getContext();
        o0000OO0.OooOO0o(context);
        o00O0O0O.OooOOO0 oooOOO0 = this.f31231OooOoO0;
        if (oooOOO0 != context) {
            if (oooOOO0 instanceof Oooo0) {
                throw new IllegalStateException(o00O0oO.o000000O.OooOoO0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((Oooo0) oooOOO0).f31196OooOo0o + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new o0OO00O(this, 0))).intValue() != this.f31227OooOo) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f31229OooOo0o + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f31231OooOoO0 = context;
        }
        this.f31230OooOoO = oooO0OO;
        o0OOO0o o0ooo0o = o0Oo0oo.f31224OooO00o;
        o0O000Oo o0o000oo = this.f31228OooOo0O;
        kotlin.jvm.internal.OooOo.OooO0OO(o0o000oo, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        o0ooo0o.getClass();
        Object objEmit = o0o000oo.emit(obj, this);
        if (!kotlin.jvm.internal.OooOo.OooO00o(objEmit, o00O0O0o.OooOo00.f31365OooOo0O)) {
            this.f31230OooOoO = null;
        }
        return objEmit;
    }

    @Override // o00O0ooo.o0O000Oo
    public final Object emit(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        try {
            Object objOooO0O0 = OooO0O0(oooO0OO, obj);
            return objOooO0O0 == o00O0O0o.OooOo00.f31365OooOo0O ? objOooO0O0 : oo00o.OooOo.f33195OooO00o;
        } catch (Throwable th) {
            this.f31231OooOoO0 = new Oooo0(oooO0OO.getContext(), th);
            throw th;
        }
    }

    @Override // o00O0OO0.OooO00o, o00O0OO0.OooO0o
    public final o00O0OO0.OooO0o getCallerFrame() {
        o00O0O0O.OooO0OO oooO0OO = this.f31230OooOoO;
        if (oooO0OO instanceof o00O0OO0.OooO0o) {
            return (o00O0OO0.OooO0o) oooO0OO;
        }
        return null;
    }

    @Override // o00O0OO0.OooO0OO, o00O0O0O.OooO0OO
    public final o00O0O0O.OooOOO0 getContext() {
        o00O0O0O.OooOOO0 oooOOO0 = this.f31231OooOoO0;
        return oooOOO0 == null ? o00O0O0O.OooOOO.f31358OooOo0O : oooOOO0;
    }

    @Override // o00O0OO0.OooO00o
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(obj);
        if (thOooO00o != null) {
            this.f31231OooOoO0 = new Oooo0(getContext(), thOooO00o);
        }
        o00O0O0O.OooO0OO oooO0OO = this.f31230OooOoO;
        if (oooO0OO != null) {
            oooO0OO.resumeWith(obj);
        }
        return o00O0O0o.OooOo00.f31365OooOo0O;
    }
}

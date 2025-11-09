package o00O0oOo;

import o00O0O0O.OooOOO0;

/* loaded from: classes3.dex */
public final class o0oOO extends o0000O00 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f31569OooOo0O = 0;

    static {
        new o0oOO();
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatch(OooOOO0 oooOOO0, Runnable runnable) {
        o0O0o o0o0o = (o0O0o) oooOOO0.get(o0O0o.f31561OooOo0o);
        if (o0o0o == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        o0o0o.f31562OooOo0O = true;
    }

    @Override // o00O0oOo.o0000O00
    public final o0000O00 limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

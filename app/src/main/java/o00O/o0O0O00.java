package o00O;

/* loaded from: classes3.dex */
public final class o0O0O00 implements o00O0O0O.OooO0OO, o00O0OO0.OooO0o {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o00O0O0O.OooO0OO f31219OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o00O0O0O.OooOOO0 f31220OooOo0o;

    public o0O0O00(o00O0O0O.OooO0OO oooO0OO, o00O0O0O.OooOOO0 oooOOO0) {
        this.f31219OooOo0O = oooO0OO;
        this.f31220OooOo0o = oooOOO0;
    }

    @Override // o00O0OO0.OooO0o
    public final o00O0OO0.OooO0o getCallerFrame() {
        o00O0O0O.OooO0OO oooO0OO = this.f31219OooOo0O;
        if (oooO0OO instanceof o00O0OO0.OooO0o) {
            return (o00O0OO0.OooO0o) oooO0OO;
        }
        return null;
    }

    @Override // o00O0O0O.OooO0OO
    public final o00O0O0O.OooOOO0 getContext() {
        return this.f31220OooOo0o;
    }

    @Override // o00O0O0O.OooO0OO
    public final void resumeWith(Object obj) {
        this.f31219OooOo0O.resumeWith(obj);
    }
}

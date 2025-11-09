package o000o00o;

/* loaded from: classes2.dex */
public final class o000OOo implements o000o0O0.OooOOO0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30797OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o000o0O0.OooOOO f30798OooOo0o;

    public /* synthetic */ o000OOo(o000o0O0.OooOOO oooOOO, int i) {
        this.f30797OooOo0O = i;
        this.f30798OooOo0o = oooOOO;
    }

    @Override // o00O00oO.o0000O0
    public final Object get() {
        o000o0O0.OooOOO oooOOO = this.f30798OooOo0o;
        switch (this.f30797OooOo0O) {
            case 0:
                o0000o0.Oooo0 firebaseApp = (o0000o0.Oooo0) oooOOO.get();
                kotlin.jvm.internal.OooOo.OooO0o0(firebaseApp, "firebaseApp");
                o000OO0O o000oo0o = o000OO0O.f30795OooO00o;
                return o000OO0O.OooO00o(firebaseApp);
            case 1:
                return new o000Oo0((o00O0000) oooOOO.get());
            default:
                return new o00oOoo((o00O0O00) oooOOO.get());
        }
    }
}

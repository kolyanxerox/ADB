package o000o0O0;

/* loaded from: classes2.dex */
public final class OooOO0O implements OooOOO {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final Object f30950OooOo = new Object();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile OooOOO0 f30951OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile Object f30952OooOo0o;

    public static OooOOO OooO00o(OooOOO0 oooOOO0) {
        if (oooOOO0 instanceof OooOO0O) {
            return oooOOO0;
        }
        OooOO0O oooOO0O = new OooOO0O();
        oooOO0O.f30952OooOo0o = f30950OooOo;
        oooOO0O.f30951OooOo0O = oooOOO0;
        return oooOO0O;
    }

    @Override // o00O00oO.o0000O0
    public final Object get() {
        Object obj;
        Object obj2 = this.f30952OooOo0o;
        Object obj3 = f30950OooOo;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f30952OooOo0o;
                if (obj == obj3) {
                    obj = this.f30951OooOo0O.get();
                    Object obj4 = this.f30952OooOo0o;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f30952OooOo0o = obj;
                    this.f30951OooOo0O = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}

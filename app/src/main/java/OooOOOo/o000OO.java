package OooOOoo;

import o00O00oO.o0000O0;

/* loaded from: classes2.dex */
public final class o000OO implements o0000O0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final Object f13532OooOo = new Object();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile o0000O f13533OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile Object f13534OooOo0o;

    public static o0000O0 OooO00o(o0000O o0000o2) {
        if (o0000o2 instanceof o000OO) {
            return o0000o2;
        }
        o000OO o000oo2 = new o000OO();
        o000oo2.f13534OooOo0o = f13532OooOo;
        o000oo2.f13533OooOo0O = o0000o2;
        return o000oo2;
    }

    @Override // o00O00oO.o0000O0
    public final Object get() {
        Object obj;
        Object obj2 = this.f13534OooOo0o;
        Object obj3 = f13532OooOo;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f13534OooOo0o;
                if (obj == obj3) {
                    obj = this.f13533OooOo0O.get();
                    Object obj4 = this.f13534OooOo0o;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f13534OooOo0o = obj;
                    this.f13533OooOo0O = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}

package OoooO0O;

/* loaded from: classes2.dex */
public final class o0O0ooO implements o00O000 {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final Object f14041OooOo = new Object();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile o00oOoo f14042OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile Object f14043OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public static o0O0ooO OooO00o(o00oOoo o00oooo) {
        if (o00oooo instanceof o0O0ooO) {
            return (o0O0ooO) o00oooo;
        }
        o0O0ooO o0o0ooo = new o0O0ooO();
        o0o0ooo.f14043OooOo0o = f14041OooOo;
        o0o0ooo.f14042OooOo0O = o00oooo;
        return o0o0ooo;
    }

    @Override // OoooO0O.o00O000
    public final Object zza() {
        Object obj = this.f14043OooOo0o;
        Object obj2 = f14041OooOo;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f14043OooOo0o;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZza = this.f14042OooOo0O.zza();
                Object obj4 = this.f14043OooOo0o;
                if (obj4 != obj2 && obj4 != objZza) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZza + ". This is likely due to a circular dependency.");
                }
                this.f14043OooOo0o = objZza;
                this.f14042OooOo0O = null;
                return objZza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

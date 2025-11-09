package o00O0oOo;

/* loaded from: classes3.dex */
public abstract class o0o0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal f31568OooO00o = new ThreadLocal();

    public static o00O000o OooO00o() {
        ThreadLocal threadLocal = f31568OooO00o;
        o00O000o o00o000o = (o00O000o) threadLocal.get();
        if (o00o000o != null) {
            return o00o000o;
        }
        o00oO0o o00oo0o = new o00oO0o(Thread.currentThread());
        threadLocal.set(o00oo0o);
        return o00oo0o;
    }
}

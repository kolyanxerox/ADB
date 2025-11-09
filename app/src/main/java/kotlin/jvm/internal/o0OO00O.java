package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public abstract class o0OO00O {

    /* renamed from: OooO00o */
    public static final oo0o0Oo f28878OooO00o;

    static {
        oo0o0Oo oo0o0oo = null;
        try {
            oo0o0oo = (oo0o0Oo) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (oo0o0oo == null) {
            oo0o0oo = new oo0o0Oo();
        }
        f28878OooO00o = oo0o0oo;
    }

    public static OooOO0 OooO00o(Class cls) {
        f28878OooO00o.getClass();
        return new OooOO0(cls);
    }
}

package o00OOOoO;

import OoooOOO.o0O00000;
import kotlin.jvm.internal.OooOo;
import o000oo00.Oooo000;
import o00OOoo.o00O0O;

/* loaded from: classes3.dex */
public abstract class o0000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000O00 f32552OooO00o;

    static {
        o000O00 o000o002;
        try {
            Class.forName("java.nio.file.Files");
            o000o002 = new o000O00O();
        } catch (ClassNotFoundException unused) {
            o000o002 = new o000O00();
        }
        f32552OooO00o = o000o002;
        String str = o000O0Oo.f32579OooOo0o;
        String property = System.getProperty("java.io.tmpdir");
        OooOo.OooO0Oo(property, "getProperty(\"java.io.tmpdir\")");
        o0O00000.OooO(property, false);
        ClassLoader classLoader = o00O0O.class.getClassLoader();
        OooOo.OooO0Oo(classLoader, "ResourceFileSystem::class.java.classLoader");
        new o00O0O(classLoader);
    }

    public abstract void OooO00o(o000O0Oo o000o0oo2, o000O0Oo o000o0oo3);

    public abstract void OooO0O0(o000O0Oo o000o0oo2);

    public abstract void OooO0OO(o000O0Oo o000o0oo2);

    public final boolean OooO0Oo(o000O0Oo path) {
        OooOo.OooO0o0(path, "path");
        return OooO0o0(path) != null;
    }

    public abstract o000Oo0 OooO0o(o000O0Oo o000o0oo2);

    public abstract Oooo000 OooO0o0(o000O0Oo o000o0oo2);

    public abstract o0O0ooO OooO0oO(o000O0Oo o000o0oo2);
}

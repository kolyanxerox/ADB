package OooOOo0;

import OooOOO.OooO0O0;
import OooOOOO.OooO00o;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o0Oo0oo {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static volatile Oooo0 f13522OooO0o0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooOoO.o000oOoO f13523OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOoO.o000oOoO f13524OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo0O.OooO0o f13525OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo0o.Oooo0 f13526OooO0Oo;

    public o0Oo0oo(OooOoO.o000oOoO o000oooo2, OooOoO.o000oOoO o000oooo3, OooOo0O.OooO0o oooO0o, OooOo0o.Oooo0 oooo0, OooOo0o.o0OoOo0 o0oooo0) {
        this.f13523OooO00o = o000oooo2;
        this.f13524OooO0O0 = o000oooo3;
        this.f13525OooO0OO = oooO0o;
        this.f13526OooO0Oo = oooo0;
        o0oooo0.getClass();
        o0oooo0.f13646OooO00o.execute(new OooOo0o.o000oOoO(o0oooo0, 0));
    }

    public static o0Oo0oo OooO00o() {
        Oooo0 oooo0 = f13522OooO0o0;
        if (oooo0 != null) {
            return (o0Oo0oo) oooo0.f13504OooOoOO.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void OooO0O0(Context context) {
        if (f13522OooO0o0 == null) {
            synchronized (o0Oo0oo.class) {
                try {
                    if (f13522OooO0o0 == null) {
                        Oooo000 oooo000 = new Oooo000();
                        context.getClass();
                        oooo000.f13505OooO00o = context;
                        f13522OooO0o0 = oooo000.OooO00o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o00oO0o OooO0OO(OooO00o oooO00o) {
        byte[] bytes;
        Set setUnmodifiableSet = oooO00o != null ? Collections.unmodifiableSet(OooO00o.f13322OooO0Oo) : Collections.singleton(new OooO0O0("proto"));
        OooOOO.OooO0OO oooO0OO = OooOOO.OooO0OO.f13317OooOo0O;
        oooO00o.getClass();
        String str = oooO00o.f13325OooO00o;
        String str2 = oooO00o.f13326OooO0O0;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            bytes = androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("1$", str, "\\", str2 != null ? str2 : "").getBytes(Charset.forName("UTF-8"));
        }
        return new o00oO0o(setUnmodifiableSet, new OooOo("cct", bytes, oooO0OO), this);
    }
}

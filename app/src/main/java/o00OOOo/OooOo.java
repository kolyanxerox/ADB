package o00OOoo;

import java.io.EOFException;
import o00O0oO.o0OO00O;
import o00OOOoO.o0000;

/* loaded from: classes3.dex */
public abstract class OooOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f32610OooO00o;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(o0OO00O.f31451OooO00o);
        kotlin.jvm.internal.OooOo.OooO0Oo(bytes, "this as java.lang.String).getBytes(charset)");
        f32610OooO00o = bytes;
    }

    public static final String OooO00o(long j, o0000 o0000Var) throws EOFException {
        kotlin.jvm.internal.OooOo.OooO0o0(o0000Var, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (o0000Var.OooO00o(j2) == 13) {
                String string = o0000Var.readString(j2, o0OO00O.f31451OooO00o);
                o0000Var.skip(2L);
                return string;
            }
        }
        String string2 = o0000Var.readString(j, o0OO00O.f31451OooO00o);
        o0000Var.skip(1L);
        return string2;
    }
}

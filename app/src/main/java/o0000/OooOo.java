package o0000;

import java.security.GeneralSecurityException;
import o0000OOo.o000O;
import o0000OoO.o00OOO0O;

/* loaded from: classes2.dex */
public abstract class OooOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO.OooOo00 f28926OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO.OooOOOO f28927OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO.OooO0OO f28928OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO.OooO00o f28929OooO0Oo;

    static {
        o00OOO0O o00ooo0oOooO0O0 = o000OO.o00oO0o.OooO0O0("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f28926OooO00o = new o000OO.OooOo00(OooOo00.class);
        f28927OooO0O0 = new o000OO.OooOOOO(o00ooo0oOooO0O0);
        f28928OooO0OO = new o000OO.OooO0OO(OooOO0.class);
        f28929OooO0Oo = new o000OO.OooO00o(o00ooo0oOooO0O0, new OooOOo0.o0ooOOo(21));
    }

    public static OooOOOO OooO00o(o000O o000o) throws GeneralSecurityException {
        int iOrdinal = o000o.ordinal();
        if (iOrdinal == 1) {
            return OooOOOO.f28904OooO0OO;
        }
        if (iOrdinal == 2) {
            return OooOOOO.f28906OooO0o;
        }
        if (iOrdinal == 3) {
            return OooOOOO.f28907OooO0o0;
        }
        if (iOrdinal == 4) {
            return OooOOOO.f28908OooO0oO;
        }
        if (iOrdinal == 5) {
            return OooOOOO.f28905OooO0Oo;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o000o.getNumber());
    }
}

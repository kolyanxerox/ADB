package o0000O;

import OooOOo0.o0ooOOo;
import java.security.GeneralSecurityException;
import o0000OOo.o00OO0OO;
import o0000OoO.o00OOO0O;
import o000OO.o00oO0o;

/* loaded from: classes2.dex */
public abstract class OooOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO.OooOo00 f29332OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO.OooOOOO f29333OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO.OooO0OO f29334OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO.OooO00o f29335OooO0Oo;

    static {
        o00OOO0O o00ooo0oOooO0O0 = o00oO0o.OooO0O0("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f29332OooO00o = new o000OO.OooOo00(OooO.class);
        f29333OooO0O0 = new o000OO.OooOOOO(o00ooo0oOooO0O0);
        f29334OooO0OO = new o000OO.OooO0OO(OooO00o.class);
        f29335OooO0Oo = new o000OO.OooO00o(o00ooo0oOooO0O0, new o0ooOOo(29));
    }

    public static OooO0o OooO00o(o00OO0OO o00oo0oo) throws GeneralSecurityException {
        int iOrdinal = o00oo0oo.ordinal();
        if (iOrdinal == 1) {
            return OooO0o.f29319OooO0OO;
        }
        if (iOrdinal == 2) {
            return OooO0o.f29322OooO0o0;
        }
        if (iOrdinal == 3) {
            return OooO0o.f29321OooO0o;
        }
        if (iOrdinal == 4) {
            return OooO0o.f29320OooO0Oo;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo.getNumber());
    }
}

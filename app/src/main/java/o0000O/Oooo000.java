package o0000O;

import java.security.GeneralSecurityException;
import o0000OOo.o000O;
import o0000OOo.o00OO0OO;
import o0000OoO.o00OOO0O;
import o000OO.o00oO0o;

/* loaded from: classes2.dex */
public abstract class Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO.OooOo00 f29344OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO.OooOOOO f29345OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO.OooO0OO f29346OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO.OooO00o f29347OooO0Oo;

    static {
        o00OOO0O o00ooo0oOooO0O0 = o00oO0o.OooO0O0("type.googleapis.com/google.crypto.tink.HmacKey");
        f29344OooO00o = new o000OO.OooOo00(OooOo.class);
        f29345OooO0O0 = new o000OO.OooOOOO(o00ooo0oOooO0O0);
        f29346OooO0OO = new o000OO.OooO0OO(OooOOOO.class);
        f29347OooO0Oo = new o000OO.OooO00o(o00ooo0oOooO0O0, new OooOo00(1));
    }

    public static OooO0o OooO00o(o000O o000o) throws GeneralSecurityException {
        int iOrdinal = o000o.ordinal();
        if (iOrdinal == 1) {
            return OooO0o.f29323OooO0oO;
        }
        if (iOrdinal == 2) {
            return OooO0o.f29325OooOO0;
        }
        if (iOrdinal == 3) {
            return OooO0o.f29318OooO;
        }
        if (iOrdinal == 4) {
            return OooO0o.f29326OooOO0O;
        }
        if (iOrdinal == 5) {
            return OooO0o.f29324OooO0oo;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o000o.getNumber());
    }

    public static OooO0o OooO0O0(o00OO0OO o00oo0oo) throws GeneralSecurityException {
        int iOrdinal = o00oo0oo.ordinal();
        if (iOrdinal == 1) {
            return OooO0o.OooOO0o;
        }
        if (iOrdinal == 2) {
            return OooO0o.f29327OooOOO;
        }
        if (iOrdinal == 3) {
            return OooO0o.f29329OooOOOO;
        }
        if (iOrdinal == 4) {
            return OooO0o.f29328OooOOO0;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o00oo0oo.getNumber());
    }
}

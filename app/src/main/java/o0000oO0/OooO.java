package o0000Oo0;

import java.security.GeneralSecurityException;
import o0000OOo.o000O;
import o0000OOo.o00O0O;
import o0000OoO.o00OOO0O;
import o000OO.OooO00o;
import o000OO.o00oO0o;

/* loaded from: classes2.dex */
public abstract class OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO.OooOo00 f29488OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO.OooOOOO f29489OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO.OooO0OO f29490OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f29491OooO0Oo;

    static {
        o00OOO0O o00ooo0oOooO0O0 = o00oO0o.OooO0O0("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        f29488OooO00o = new o000OO.OooOo00(OooO0o.class);
        f29489OooO0O0 = new o000OO.OooOOOO(o00ooo0oOooO0O0);
        f29490OooO0OO = new o000OO.OooO0OO(OooO0O0.class);
        f29491OooO0Oo = new OooO00o(o00ooo0oOooO0O0, new o0000O.OooOo00(3));
    }

    public static OooO0OO OooO00o(o000O o000o) throws GeneralSecurityException {
        int iOrdinal = o000o.ordinal();
        if (iOrdinal == 1) {
            return OooO0OO.f29492OooO0OO;
        }
        if (iOrdinal == 3) {
            return OooO0OO.f29493OooO0Oo;
        }
        if (iOrdinal == 4) {
            return OooO0OO.f29495OooO0o0;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o000o.getNumber());
    }

    public static OooO0o OooO0O0(o00O0O o00o0o, int i) {
        Integer numValueOf = Integer.valueOf(i);
        int iOooOoo0 = o00o0o.OooOoo0();
        Integer numValueOf2 = Integer.valueOf(iOooOoo0);
        int iOooOoO = o00o0o.OooOoO();
        Integer numValueOf3 = Integer.valueOf(iOooOoO);
        OooO0OO oooO0OOOooO00o = OooO00o(o00o0o.OooOoo());
        OooO0OO oooO0OOOooO00o2 = OooO00o(o00o0o.OooOooO().OooOoO0());
        int iOooOoO2 = o00o0o.OooOooO().OooOoO();
        Integer numValueOf4 = Integer.valueOf(iOooOoO2);
        if (iOooOoo0 != 16 && iOooOoo0 != 32) {
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not " + numValueOf2);
        }
        if (i < iOooOoo0) {
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., " + numValueOf2);
        }
        int i2 = iOooOoo0 + iOooOoO2;
        if (iOooOoO <= i2 + 8) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + (i2 + 9));
        }
        int i3 = oooO0OOOooO00o2 != OooO0OO.f29493OooO0Oo ? oooO0OOOooO00o2 == OooO0OO.f29492OooO0OO ? 20 : 0 : 32;
        if (oooO0OOOooO00o2 == OooO0OO.f29495OooO0o0) {
            i3 = 64;
        }
        if (iOooOoO2 >= 10 && iOooOoO2 <= i3) {
            return new OooO0o(numValueOf, numValueOf2, oooO0OOOooO00o, oooO0OOOooO00o2, numValueOf4, numValueOf3);
        }
        throw new GeneralSecurityException("hmacTagSize must be in range [10, " + i3 + "], but is " + numValueOf4);
    }
}

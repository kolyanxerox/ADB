package o0000Oo0;

import java.security.GeneralSecurityException;
import o0000OOo.o0000Ooo;
import o0000OOo.o000O;
import o0000OoO.o00OOO0O;
import o000OO.OooO00o;
import o000OO.o00oO0o;

/* loaded from: classes2.dex */
public abstract class OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO.OooOo00 f29515OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO.OooOOOO f29516OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO.OooO0OO f29517OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f29518OooO0Oo;

    static {
        o00OOO0O o00ooo0oOooO0O0 = o00oO0o.OooO0O0("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        f29515OooO00o = new o000OO.OooOo00(OooOO0O.class);
        f29516OooO0O0 = new o000OO.OooOOOO(o00ooo0oOooO0O0);
        f29517OooO0OO = new o000OO.OooO0OO(OooOO0.class);
        f29518OooO0Oo = new OooO00o(o00ooo0oOooO0O0, new o0000O.OooOo00(4));
    }

    public static OooOO0O OooO00o(o0000Ooo o0000ooo, int i) {
        OooO0OO oooO0OO;
        Integer numValueOf = Integer.valueOf(i);
        int iOooOoOO = o0000ooo.OooOoOO();
        Integer numValueOf2 = Integer.valueOf(iOooOoOO);
        int iOooOoO0 = o0000ooo.OooOoO0();
        Integer numValueOf3 = Integer.valueOf(iOooOoO0);
        o000O o000oOooOoo0 = o0000ooo.OooOoo0();
        int iOrdinal = o000oOooOoo0.ordinal();
        if (iOrdinal == 1) {
            oooO0OO = OooO0OO.f29494OooO0o;
        } else if (iOrdinal == 3) {
            oooO0OO = OooO0OO.f29496OooO0oO;
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse HashType: " + o000oOooOoo0.getNumber());
            }
            oooO0OO = OooO0OO.f29497OooO0oo;
        }
        if (iOooOoOO != 16 && iOooOoOO != 32) {
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be 16 or 32, not " + numValueOf2);
        }
        if (i < iOooOoOO) {
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., " + numValueOf2);
        }
        if (iOooOoO0 > iOooOoOO + 24) {
            return new OooOO0O(numValueOf, numValueOf2, oooO0OO, numValueOf3);
        }
        throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., " + (iOooOoOO + 25));
    }
}

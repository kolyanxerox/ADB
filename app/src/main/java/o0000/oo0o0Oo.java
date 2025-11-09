package o0000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import o0000OoO.o00OOO0O;

/* loaded from: classes2.dex */
public final class oo0o0Oo extends OooO0O0 {
    public static oo0o0Oo OooO0O0(OooOOOO oooOOOO, o000Ooo0.OooOO0 oooOO0, Integer num) throws GeneralSecurityException {
        OooOOOO oooOOOO2 = OooOOOO.f28923OooOoO0;
        if (oooOOOO != oooOOOO2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + oooOOOO + " the value of idRequirement must be non-null");
        }
        if (oooOOOO == oooOOOO2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        o00OOO0O o00ooo0o = (o00OOO0O) oooOO0.f30538OooOo0o;
        if (o00ooo0o.f29522OooO00o.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + o00ooo0o.f29522OooO00o.length);
        }
        if (oooOOOO == oooOOOO2) {
            o00OOO0O.OooO00o(new byte[0]);
        } else if (oooOOOO == OooOOOO.f28919OooOo) {
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (oooOOOO != OooOOOO.f28922OooOo0o) {
                throw new IllegalStateException("Unknown Variant: " + oooOOOO);
            }
            o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new oo0o0Oo();
    }
}

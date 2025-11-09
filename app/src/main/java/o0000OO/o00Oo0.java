package o0000Oo;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import o0000OOO.OooO00o;

/* loaded from: classes2.dex */
public final class o00Oo0 implements o00000oo.o00Ooo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f29468OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29469OooO0O0;

    public o00Oo0(OooO00o oooO00o, int i) throws InvalidAlgorithmParameterException {
        this.f29468OooO00o = oooO00o;
        this.f29469OooO0O0 = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        oooO00o.OooO0O0(i, new byte[0]);
    }

    @Override // o00000oo.o00Ooo
    public final void OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(OooO0O0(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // o00000oo.o00Ooo
    public final byte[] OooO0O0(byte[] bArr) {
        return this.f29468OooO00o.OooO0O0(this.f29469OooO0O0, bArr);
    }
}

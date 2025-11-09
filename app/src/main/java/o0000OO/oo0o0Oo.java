package o0000oo;

import OooO0oO.OooOo;
import Oooo0oO.o00000O;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o00000oo.OooOOOO;
import o0000Oo.o00Ooo;
import o0000Oo.o0Oo0oo;

/* loaded from: classes2.dex */
public final class oo0o0Oo implements OooOOOO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00000O f29652OooO0O0 = new o00000O(15);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f29653OooO0OO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SecretKeySpec f29654OooO00o;

    static {
        boolean z;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f29653OooO0OO = z;
    }

    public oo0o0Oo(byte[] bArr) throws InvalidAlgorithmParameterException {
        o0Oo0oo.OooO00o(bArr.length);
        this.f29654OooO00o = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec OooO0OO(int i, byte[] bArr) throws GeneralSecurityException {
        if (f29653OooO0OO) {
            return new GCMParameterSpec(128, bArr, 0, i);
        }
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            return new IvParameterSpec(bArr, 0, i);
        }
        throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrOooO00o = o00Ooo.OooO00o(12);
        System.arraycopy(bArrOooO00o, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecOooO0OO = OooO0OO(bArrOooO00o.length, bArrOooO00o);
        o00000O o00000o = f29652OooO0O0;
        ((Cipher) o00000o.get()).init(1, this.f29654OooO00o, algorithmParameterSpecOooO0OO);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) o00000o.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) o00000o.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(OooOo.OooO0oO(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecOooO0OO = OooO0OO(12, bArr);
        o00000O o00000o = f29652OooO0O0;
        ((Cipher) o00000o.get()).init(2, this.f29654OooO00o, algorithmParameterSpecOooO0OO);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) o00000o.get()).updateAAD(bArr2);
        }
        return ((Cipher) o00000o.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}

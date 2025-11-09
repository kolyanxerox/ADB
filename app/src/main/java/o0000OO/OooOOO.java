package o0000Oo;

import OooO00o.OooO00o;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class OooOOO implements o00000oo.OooOo {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final List f29450OooO0OO = Arrays.asList(64);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final byte[] f29451OooO0Oo = new byte[16];

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final byte[] f29452OooO0o0 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Oooo.OooOo00 f29453OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f29454OooO0O0;

    public OooOOO(byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC2183w4.OooO00o(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f29450OooO0OO.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(OooO0oO.OooOo.OooOOO(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f29454OooO0O0 = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f29453OooO00o = new Oooo.OooOo00(bArrCopyOfRange);
    }

    @Override // o00000oo.OooOo
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/CTR/NoPadding");
        byte[] bArrOooO0OO = OooO0OO(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrOooO0OO.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f29454OooO0O0, "AES"), new IvParameterSpec(bArr3));
        return OooO00o.OooO0OO(bArrOooO0OO, cipher.doFinal(bArr));
    }

    @Override // o00000oo.OooOo
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f29454OooO0O0, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, OooO0OO(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] OooO0OO(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrOooOoO0;
        int length = bArr.length;
        Oooo.OooOo00 oooOo00 = this.f29453OooO00o;
        if (length == 0) {
            return oooOo00.OooO0O0(16, f29452OooO0o0);
        }
        byte[] bArrOooO0O0 = oooOo00.OooO0O0(16, f29451OooO0Oo);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrOooO0O0 = OooO00o.OooOoO0(o00Oo0oo.o00oO0o.OooO0o0(bArrOooO0O0), oooOo00.OooO0O0(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrOooO0O0.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrOooO0O0.length;
            bArrOooOoO0 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrOooO0O0.length; i2++) {
                int i3 = length2 + i2;
                bArrOooOoO0[i3] = (byte) (bArrOooOoO0[i3] ^ bArrOooO0O0[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrOooOoO0 = OooO00o.OooOoO0(bArrCopyOf, o00Oo0oo.o00oO0o.OooO0o0(bArrOooO0O0));
        }
        return oooOo00.OooO0O0(16, bArrOooOoO0);
    }
}

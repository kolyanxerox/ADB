package o0000Oo;

import Oooo0oO.o00000O;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class OooOO0 implements o00000oo.OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f29441OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f29442OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final SecretKeySpec f29443OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f29444OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final o00000O f29440OooO0o0 = new o00000O(12);

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final o00000O f29439OooO0o = new o00000O(13);

    public OooOO0(byte[] bArr, int i) throws GeneralSecurityException {
        if (!AbstractC2183w4.OooO00o(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f29444OooO0Oo = i;
        o0Oo0oo.OooO00o(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f29443OooO0OO = secretKeySpec;
        Cipher cipher = (Cipher) f29440OooO0o0.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrOooO0OO = OooO0OO(cipher.doFinal(new byte[16]));
        this.f29441OooO00o = bArrOooO0OO;
        this.f29442OooO0O0 = OooO0OO(bArrOooO0OO);
    }

    public static byte[] OooO0OO(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & ForkServer.ERROR) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] OooO0o0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f29444OooO0Oo;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] bArrOooO00o = o00Ooo.OooO00o(i);
        System.arraycopy(bArrOooO00o, 0, bArr3, 0, i);
        Cipher cipher = (Cipher) f29440OooO0o0.get();
        SecretKeySpec secretKeySpec = this.f29443OooO0OO;
        cipher.init(1, secretKeySpec);
        byte[] bArrOooO0Oo = OooO0Oo(cipher, 0, bArrOooO00o, 0, bArrOooO00o.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrOooO0Oo2 = OooO0Oo(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f29439OooO0o.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrOooO0Oo));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f29444OooO0Oo);
        byte[] bArrOooO0Oo3 = OooO0Oo(cipher, 2, bArr3, this.f29444OooO0Oo, bArr.length);
        int length2 = bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((bArrOooO0Oo2[i2] ^ bArrOooO0Oo[i2]) ^ bArrOooO0Oo3[i2]);
        }
        return bArr3;
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f29444OooO0Oo;
        int i2 = (length - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f29440OooO0o0.get();
        SecretKeySpec secretKeySpec = this.f29443OooO0OO;
        cipher.init(1, secretKeySpec);
        byte[] bArrOooO0Oo = OooO0Oo(cipher, 0, bArr, 0, this.f29444OooO0Oo);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrOooO0Oo2 = OooO0Oo(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrOooO0Oo3 = OooO0Oo(cipher, 2, bArr, this.f29444OooO0Oo, i2);
        int length2 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length2 + i3] ^ bArrOooO0Oo2[i3]) ^ bArrOooO0Oo[i3]) ^ bArrOooO0Oo3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f29439OooO0o.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrOooO0Oo));
        return cipher2.doFinal(bArr, i, i2);
    }

    public final byte[] OooO0Oo(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f29441OooO00o;
        if (i3 == 0) {
            return cipher.doFinal(OooO0o0(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i4 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = OooO0o0(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f29442OooO0O0, 16);
            for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(OooO0o0(bArrDoFinal, bArrCopyOf));
    }
}

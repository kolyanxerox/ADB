package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class xy0 implements sv0 {

    /* renamed from: OooO0Oo */
    public static final Oooo0oO.o00000O f25817OooO0Oo = new Oooo0oO.o00000O(9);

    /* renamed from: OooO00o */
    public final SecretKeySpec f25818OooO00o;

    /* renamed from: OooO0O0 */
    public final byte[] f25819OooO0O0;

    /* renamed from: OooO0OO */
    public final byte[] f25820OooO0OO;

    public xy0(byte[] bArr) throws GeneralSecurityException {
        ii0.OooOO0(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f25818OooO00o = secretKeySpec;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f25817OooO0Oo.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrOooOoO = xh0.OooOoO(cipher.doFinal(new byte[16]));
        this.f25819OooO0O0 = bArrOooOoO;
        this.f25820OooO0OO = xh0.OooOoO(bArrOooOoO);
    }

    @Override // com.google.android.gms.internal.ads.sv0
    public final byte[] OooO00o(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrOooo;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKeySpec secretKeySpec = this.f25818OooO00o;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f25817OooO0Oo.get();
        cipher.init(1, secretKeySpec);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        int i4 = i3 * 16;
        if (i2 * 16 == length) {
            bArrOooo = ii0.Oooo(bArr, i4, this.f25819OooO0O0);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrOooo = ii0.Oooo(bArrCopyOf, 0, this.f25820OooO0OO);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 * 16;
            for (int i7 = 0; i7 < 16; i7++) {
                bArr3[i7] = (byte) (bArr2[i7] ^ bArr[i7 + i6]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i8 = 0; i8 < 16; i8++) {
            bArr3[i8] = (byte) (bArr2[i8] ^ bArrOooo[i8]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}

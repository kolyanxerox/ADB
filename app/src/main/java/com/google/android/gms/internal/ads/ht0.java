package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class ht0 implements pq0 {

    /* renamed from: OooO00o */
    public final byte[] f19852OooO00o;

    /* renamed from: OooO0O0 */
    public final int f19853OooO0O0;

    /* renamed from: OooO0OO */
    public final xy0 f19854OooO0OO;

    public ht0(byte[] bArr, az0 az0Var, int i) {
        this.f19854OooO0OO = new xy0(bArr);
        this.f19852OooO00o = az0Var.OooO0O0();
        this.f19853OooO0O0 = i;
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f19852OooO00o;
        int length2 = bArr3.length;
        int i = this.f19853OooO0O0;
        if (length < length2 + i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zu0.OooO0OO(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length3 = bArr3.length;
        int i2 = i + length3;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, i2);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length4 = bArrCopyOfRange.length;
        if (length4 > 12 || length4 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length4);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length4);
        byte[] bArr6 = new byte[32];
        xy0 xy0Var = this.f19854OooO0OO;
        System.arraycopy(xy0Var.OooO00o(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(xy0Var.OooO00o(16, bArr5), 0, bArr6, 16, 16);
        if (!xh0.OooOo0O(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        Oooo0oO.o00000O o00000o = ws0.f25398OooO00o;
        ii0.OooOO0(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i3 = i2 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, i3);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) ws0.f25398OooO00o.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i3, length - i3);
    }
}

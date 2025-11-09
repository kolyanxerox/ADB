package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class kt0 implements pq0 {

    /* renamed from: OooO00o */
    public final SecretKeySpec f20680OooO00o;

    /* renamed from: OooO0O0 */
    public final byte[] f20681OooO0O0;

    /* renamed from: OooO0OO */
    public static final byte[] f20674OooO0OO = xh0.OooOoO0("7a806c");

    /* renamed from: OooO0Oo */
    public static final byte[] f20675OooO0Oo = xh0.OooOoO0("46bb91c3c5");

    /* renamed from: OooO0o0 */
    public static final byte[] f20677OooO0o0 = xh0.OooOoO0("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: OooO0o */
    public static final byte[] f20676OooO0o = xh0.OooOoO0("bae8e37fc83441b16034566b");

    /* renamed from: OooO0oO */
    public static final byte[] f20678OooO0oO = xh0.OooOoO0("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: OooO0oo */
    public static final Oooo0oO.o00000O f20679OooO0oo = new Oooo0oO.o00000O(4);

    public kt0(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f20681OooO0O0 = bArr2;
        ii0.OooOO0(bArr.length);
        this.f20680OooO00o = new SecretKeySpec(bArr, "AES");
    }

    public static boolean OooO0O0(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = f20676OooO0o;
            cipher.init(2, new SecretKeySpec(f20677OooO0o0, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f20675OooO0Oo);
            byte[] bArr2 = f20678OooO0oO;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f20674OooO0OO);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f20681OooO0O0;
        if (bArr3.length == 0) {
            return OooO0OO(bArr, bArr2);
        }
        if (!zu0.OooO0OO(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return OooO0OO(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
    }

    public final byte[] OooO0OO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f20679OooO0oo.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f20680OooO00o, new GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }
}

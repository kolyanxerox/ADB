package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class at0 implements pq0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SecretKeySpec f17111OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f17112OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f17107OooO0OO = xh0.OooOoO0("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final byte[] f17108OooO0Oo = xh0.OooOoO0("070000004041424344454647");

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final byte[] f17110OooO0o0 = xh0.OooOoO0("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final Oooo0oO.o00000O f17109OooO0o = new Oooo0oO.o00000O(3);

    public at0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (f17109OooO0o.get() == null) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f17111OooO00o = new SecretKeySpec(bArr, "ChaCha20");
        this.f17112OooO0O0 = bArr2;
    }

    public static boolean OooO0O0(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f17108OooO0Oo);
            byte[] bArr = f17107OooO0OO;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f17110OooO0o0;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f17112OooO0O0;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zu0.OooO0OO(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f17109OooO0o.get();
        cipher.init(2, this.f17111OooO00o, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (length - r8) - 12);
    }
}

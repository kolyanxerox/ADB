package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class gt0 implements pq0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f19458OooO00o;

    /* renamed from: OooO0O0 */
    public final byte[] f19459OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f19460OooO0OO;

    public gt0(pq0 pq0Var, byte[] bArr) {
        this.f19458OooO00o = 0;
        this.f19460OooO0OO = pq0Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f19459OooO0O0 = bArr;
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Object obj = this.f19460OooO0OO;
        byte[] bArr3 = this.f19459OooO0O0;
        switch (this.f19458OooO00o) {
            case 0:
                pq0 pq0Var = (pq0) obj;
                if (bArr3.length == 0) {
                    return pq0Var.OooO00o(bArr, bArr2);
                }
                if (zu0.OooO0OO(bArr3, bArr)) {
                    return pq0Var.OooO00o(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                byte[] bArr4 = (byte[]) obj;
                if (bArr.length < bArr4.length + 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!zu0.OooO0OO(bArr4, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                byte[] bArr5 = new byte[24];
                System.arraycopy(bArr, bArr4.length, bArr5, 0, 24);
                int[] iArrOooO0OO = ct0.OooO0OO(ct0.OooO0Oo(bArr3), ct0.OooO0Oo(bArr5));
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrOooO0OO.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.asIntBuffer().put(iArrOooO0OO);
                SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
                byte[] bArr6 = new byte[12];
                System.arraycopy(bArr5, 16, bArr6, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr6);
                Cipher cipher = (Cipher) at0.f17109OooO0o.get();
                cipher.init(2, secretKeySpec, ivParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, 24 + bArr4.length, (r1 - r13) - 24);
            case 2:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                if (bArr.length < bArr3.length + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!zu0.OooO0OO(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                int length = bArr3.length;
                Oooo0oO.o00000O o00000o = ws0.f25398OooO00o;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length, 12);
                Cipher cipher2 = (Cipher) ws0.f25398OooO00o.get();
                cipher2.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher2.updateAAD(bArr2);
                }
                return cipher2.doFinal(bArr, 12 + bArr3.length, (r0 - r13) - 12);
            case 3:
                if (bArr3.length == 0) {
                    return OooO0O0(bArr, bArr2);
                }
                if (!zu0.OooO0OO(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                return OooO0O0(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
            default:
                if (bArr3.length == 0) {
                    return OooO0OO(bArr, bArr2);
                }
                if (!zu0.OooO0OO(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                return OooO0OO(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
    }

    public byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((ft0) this.f19460OooO0OO).OooO0oo(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] OooO0OO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((ft0) this.f19460OooO0OO).OooO0oo(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public gt0(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        this.f19458OooO00o = i;
        switch (i) {
            case 3:
                this.f19460OooO0OO = new ft0(bArr, 0);
                this.f19459OooO0O0 = bArr2;
                return;
            case 4:
                this.f19460OooO0OO = new ft0(bArr, 1);
                this.f19459OooO0O0 = bArr2;
                return;
            default:
                if (!xh0.OooOo0O(1)) {
                    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
                }
                if (((Cipher) at0.f17109OooO0o.get()) == null) {
                    throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
                }
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f19459OooO0O0 = bArr;
                this.f19460OooO0OO = bArr2;
                return;
        }
    }

    public gt0(byte[] bArr, az0 az0Var) throws GeneralSecurityException {
        this.f19458OooO00o = 2;
        if (xh0.OooOo0O(2)) {
            Oooo0oO.o00000O o00000o = ws0.f25398OooO00o;
            ii0.OooOO0(bArr.length);
            this.f19460OooO0OO = new SecretKeySpec(bArr, "AES");
            this.f19459OooO0O0 = az0Var.OooO0O0();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}

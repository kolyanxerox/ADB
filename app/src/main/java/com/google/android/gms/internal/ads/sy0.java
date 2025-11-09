package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class sy0 implements pq0 {

    /* renamed from: OooO0o */
    public static final Oooo0oO.o00000O f24201OooO0o = new Oooo0oO.o00000O(7);

    /* renamed from: OooO0oO */
    public static final Oooo0oO.o00000O f24202OooO0oO = new Oooo0oO.o00000O(8);

    /* renamed from: OooO00o */
    public final byte[] f24203OooO00o;

    /* renamed from: OooO0O0 */
    public final byte[] f24204OooO0O0;

    /* renamed from: OooO0OO */
    public final byte[] f24205OooO0OO;

    /* renamed from: OooO0Oo */
    public final SecretKeySpec f24206OooO0Oo;

    /* renamed from: OooO0o0 */
    public final int f24207OooO0o0;

    public sy0(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f24207OooO0o0 = i;
        ii0.OooOO0(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f24206OooO0Oo = secretKeySpec;
        Cipher cipher = (Cipher) f24201OooO0o.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrOooO0OO = OooO0OO(cipher.doFinal(new byte[16]));
        this.f24203OooO00o = bArrOooO0OO;
        this.f24204OooO0O0 = OooO0OO(bArrOooO0OO);
        this.f24205OooO0OO = bArr2;
    }

    public static void OooO0O0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    public static byte[] OooO0OO(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & ForkServer.ERROR) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f24205OooO0OO;
        int length2 = length - bArr3.length;
        int i = this.f24207OooO0o0;
        int i2 = (length2 - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zu0.OooO0OO(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f24201OooO0o.get();
        SecretKeySpec secretKeySpec = this.f24206OooO0Oo;
        cipher.init(1, secretKeySpec);
        byte[] bArrOooO0Oo = OooO0Oo(cipher, 0, bArr, bArr3.length, this.f24207OooO0o0);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrOooO0Oo2 = OooO0Oo(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrOooO0Oo3 = OooO0Oo(cipher, 2, bArr, bArr3.length + i, i2);
        int i3 = length - 16;
        byte b = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b = (byte) (b | (((bArr[i3 + i4] ^ bArrOooO0Oo2[i4]) ^ bArrOooO0Oo[i4]) ^ bArrOooO0Oo3[i4]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f24202OooO0oO.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrOooO0Oo));
        return cipher2.doFinal(bArr, bArr3.length + i, i2);
    }

    public final byte[] OooO0Oo(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f24203OooO00o;
        if (i3 == 0) {
            OooO0O0(bArr2, bArr3);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr4 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr4);
        byte[] bArr5 = bArr2;
        byte[] bArr6 = bArr4;
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArr6[i5] = (byte) (bArr[(i2 + i4) + i5] ^ bArr6[i5]);
            }
            cipher.doFinal(bArr6, 0, 16, bArr5);
            i4 += 16;
            byte[] bArr7 = bArr5;
            bArr5 = bArr6;
            bArr6 = bArr7;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            OooO0O0(bArrCopyOfRange, bArr3);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f24204OooO0O0, 16);
            int i6 = 0;
            while (true) {
                length = bArrCopyOfRange.length;
                if (i6 >= length) {
                    break;
                }
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
                i6++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        OooO0O0(bArr6, bArrCopyOfRange);
        cipher.doFinal(bArr6, 0, 16, bArr5);
        return bArr5;
    }
}

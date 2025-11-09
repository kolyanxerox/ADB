package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes2.dex */
public final class ty0 implements pq0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ry0 f24534OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final zy0 f24535OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f24536OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f24537OooO0Oo;

    public ty0(ry0 ry0Var, zy0 zy0Var, int i, byte[] bArr) {
        this.f24534OooO00o = ry0Var;
        this.f24535OooO0O0 = zy0Var;
        this.f24536OooO0OO = i;
        this.f24537OooO0Oo = bArr;
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f24537OooO0Oo;
        int length = bArr3.length;
        int length2 = bArr.length;
        int i = this.f24536OooO0OO;
        if (length2 < length + i) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zu0.OooO0OO(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length2 - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrOooo00o = ii0.Oooo00o(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        zy0 zy0Var = this.f24535OooO0O0;
        byte[] bArr4 = zy0Var.f26395OooO0Oo;
        int length3 = bArr4.length;
        int i3 = zy0Var.f26393OooO0O0;
        sv0 sv0Var = zy0Var.f26392OooO00o;
        byte[] bArr5 = zy0Var.f26394OooO0OO;
        if (!MessageDigest.isEqual(length3 > 0 ? ii0.Oooo00o(bArr5, sv0Var.OooO00o(i3, ii0.Oooo00o(bArrOooo00o, bArr4))) : ii0.Oooo00o(bArr5, sv0Var.OooO00o(i3, bArrOooo00o)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        ry0 ry0Var = this.f24534OooO00o;
        int length4 = bArrCopyOfRange.length;
        int i4 = ry0Var.f23954OooO0O0;
        if (length4 < i4) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i4];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i4);
        int i5 = ry0Var.f23954OooO0O0;
        int i6 = length4 - i5;
        byte[] bArr7 = new byte[i6];
        Cipher cipher = (Cipher) ry0.f23952OooO0Oo.get();
        byte[] bArr8 = new byte[ry0Var.f23955OooO0OO];
        System.arraycopy(bArr6, 0, bArr8, 0, i4);
        cipher.init(2, ry0Var.f23953OooO00o, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i5, i6, bArr7, 0) == i6) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public abstract class et0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int[] f18697OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f18698OooO0O0;

    public et0(byte[] bArr, int i, int i2) throws InvalidKeyException {
        switch (i2) {
            case 1:
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f18697OooO00o = o0000O00.OooO00o.OooO0OO(bArr);
                this.f18698OooO0O0 = i;
                return;
            default:
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f18697OooO00o = ct0.OooO0Oo(bArr);
                this.f18698OooO0O0 = i;
                return;
        }
    }

    public ByteBuffer OooO00o(int i, byte[] bArr) {
        int[] iArrOooO0O0 = OooO0O0(o0000O00.OooO00o.OooO0OO(bArr), i);
        int[] iArr = (int[]) iArrOooO0O0.clone();
        o0000O00.OooO00o.OooO0O0(iArr);
        for (int i2 = 0; i2 < iArrOooO0O0.length; i2++) {
            iArrOooO0O0[i2] = iArrOooO0O0[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrOooO0O0, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] OooO0O0(int[] iArr, int i);

    public abstract int OooO0OO();

    public void OooO0Oo(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != OooO0OO()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + OooO0OO());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferOooO00o = OooO00o(this.f18698OooO0O0 + i3, bArr);
            if (i3 == i) {
                OooO00o.OooO00o.OooOo0o(byteBuffer, byteBuffer2, byteBufferOooO00o, iRemaining % 64);
            } else {
                OooO00o.OooO00o.OooOo0o(byteBuffer, byteBuffer2, byteBufferOooO00o, 64);
            }
        }
    }

    public abstract int[] OooO0o(int[] iArr, int i);

    public abstract int OooO0o0();

    public ByteBuffer OooO0oO(int i, byte[] bArr) {
        int[] iArrOooO0o = OooO0o(ct0.OooO0Oo(bArr), i);
        int[] iArr = (int[]) iArrOooO0o.clone();
        ct0.OooO0O0(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrOooO0o[i2] = iArrOooO0o[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrOooO0o, 0, 16);
        return byteBufferOrder;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class dt0 extends et0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f18406OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt0(byte[] bArr, int i, int i2) {
        super(bArr, i, 0);
        this.f18406OooO0OO = i2;
    }

    @Override // com.google.android.gms.internal.ads.et0
    public final int[] OooO0o(int[] iArr, int i) {
        switch (this.f18406OooO0OO) {
            case 0:
                int length = iArr.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = this.f18697OooO00o;
                int[] iArr4 = ct0.f18056OooO00o;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, 3);
                return iArr2;
            default:
                int length2 = iArr.length;
                if (length2 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length2 * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArrOooO0OO = ct0.OooO0OO(this.f18697OooO00o, iArr);
                int[] iArr6 = ct0.f18056OooO00o;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(iArrOooO0OO, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // com.google.android.gms.internal.ads.et0
    public final int OooO0o0() {
        switch (this.f18406OooO0OO) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}

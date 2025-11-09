package o0000O00;

import com.google.android.gms.internal.ads.et0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooO0OO extends et0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f29374OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooO0OO(byte[] bArr, int i, int i2) {
        super(bArr, i, 1);
        this.f29374OooO0OO = i2;
    }

    @Override // com.google.android.gms.internal.ads.et0
    public final int[] OooO0O0(int[] iArr, int i) {
        switch (this.f29374OooO0OO) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = this.f18697OooO00o;
                int[] iArr4 = OooO00o.f29370OooO00o;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArr6 = new int[16];
                int[] iArr7 = this.f18697OooO00o;
                int[] iArr8 = OooO00o.f29370OooO00o;
                System.arraycopy(iArr8, 0, iArr6, 0, iArr8.length);
                System.arraycopy(iArr7, 0, iArr6, iArr8.length, 8);
                iArr6[12] = iArr[0];
                iArr6[13] = iArr[1];
                iArr6[14] = iArr[2];
                iArr6[15] = iArr[3];
                OooO00o.OooO0O0(iArr6);
                iArr6[4] = iArr6[12];
                iArr6[5] = iArr6[13];
                iArr6[6] = iArr6[14];
                iArr6[7] = iArr6[15];
                int[] iArrCopyOf = Arrays.copyOf(iArr6, 8);
                System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
                System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // com.google.android.gms.internal.ads.et0
    public final int OooO0OO() {
        switch (this.f29374OooO0OO) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}

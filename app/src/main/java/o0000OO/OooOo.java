package o0000Oo;

import OooO00o.OooO00o;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooOo implements o00000oo.OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f29459OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00000oo.o00Ooo f29460OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29461OooO0OO;

    public OooOo(o0OoOo0 o0oooo0, o00000oo.o00Ooo o00ooo2, int i) {
        this.f29459OooO00o = o0oooo0;
        this.f29460OooO0O0 = o00ooo2;
        this.f29461OooO0OO = i;
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        OooO oooO = (OooO) this.f29459OooO00o;
        oooO.getClass();
        int length = bArr.length;
        int i = oooO.f29422OooO0O0;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrOooO00o = o00Ooo.OooO00o(i);
        System.arraycopy(bArrOooO00o, 0, bArr3, 0, i);
        oooO.OooO00o(bArr, 0, bArr.length, bArr3, oooO.f29422OooO0O0, bArrOooO00o, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return OooO00o.OooO0OO(bArr3, this.f29460OooO0O0.OooO0O0(OooO00o.OooO0OO(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f29461OooO0OO;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f29460OooO0O0.OooO00o(bArrCopyOfRange2, OooO00o.OooO0OO(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        OooO oooO = (OooO) this.f29459OooO00o;
        oooO.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = oooO.f29422OooO0O0;
        if (length2 < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = oooO.f29422OooO0O0;
        byte[] bArr4 = new byte[length3 - i3];
        oooO.OooO00o(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
        return bArr4;
    }
}

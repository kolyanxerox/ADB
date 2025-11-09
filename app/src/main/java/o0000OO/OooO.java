package o0000Oo;

import Oooo0oO.o00000O;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class OooO implements o0OoOo0 {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00000O f29420OooO0Oo = new o00000O(11);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SecretKeySpec f29421OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29422OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29423OooO0OO;

    public OooO(byte[] bArr, int i) throws GeneralSecurityException {
        if (!AbstractC2183w4.OooO0O0(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        o0Oo0oo.OooO00o(bArr.length);
        this.f29421OooO00o = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f29420OooO0Oo.get()).getBlockSize();
        this.f29423OooO0OO = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f29422OooO0O0 = i;
    }

    public final void OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f29420OooO0Oo.get();
        byte[] bArr4 = new byte[this.f29423OooO0OO];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f29422OooO0O0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f29421OooO00o;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}

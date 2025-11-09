package o0000Oo;

import Oooo0oO.o00000O;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import o0000O00.OooO0O0;

/* loaded from: classes2.dex */
public final class OooOOO0 implements o00000oo.OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29455OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f29456OooO0O0;

    public OooOOO0(byte[] bArr, int i) throws GeneralSecurityException {
        this.f29455OooO00o = i;
        switch (i) {
            case 1:
                this.f29456OooO0O0 = new o0000O00.OooO0o(bArr, 0);
                return;
            case 2:
                this.f29456OooO0O0 = new o0000O00.OooO0o(bArr, 1);
                return;
            default:
                if (!AbstractC2183w4.OooO0O0(2)) {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f29456OooO0O0 = new OooO0O0(bArr);
                return;
        }
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f29455OooO00o) {
            case 0:
                byte[] bArrOooO00o = o00Ooo.OooO00o(12);
                OooO0O0 oooO0O0 = (OooO0O0) this.f29456OooO0O0;
                oooO0O0.getClass();
                if (bArrOooO00o.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                boolean z = oooO0O0.f29373OooO0O0;
                byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
                if (z) {
                    System.arraycopy(bArrOooO00o, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecOooO00o = OooO0O0.OooO00o(bArrOooO00o);
                o00000O o00000o = OooO0O0.f29371OooO0OO;
                ((Cipher) o00000o.get()).init(1, oooO0O0.f29372OooO00o, algorithmParameterSpecOooO00o);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) o00000o.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) o00000o.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(OooO0oO.OooOo.OooO0oO(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrOooO00o2 = o00Ooo.OooO00o(12);
                byteBufferAllocate.put(bArrOooO00o2);
                ((o0000O00.OooO0o) this.f29456OooO0O0).OooO0O0(byteBufferAllocate, bArrOooO00o2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrOooO00o3 = o00Ooo.OooO00o(24);
                byteBufferAllocate2.put(bArrOooO00o3);
                ((o0000O00.OooO0o) this.f29456OooO0O0).OooO0O0(byteBufferAllocate2, bArrOooO00o3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f29455OooO00o) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                OooO0O0 oooO0O0 = (OooO0O0) this.f29456OooO0O0;
                oooO0O0.getClass();
                if (bArrCopyOf.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                boolean z = oooO0O0.f29373OooO0O0;
                if (bArr.length < (z ? 28 : 16)) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec algorithmParameterSpecOooO00o = OooO0O0.OooO00o(bArrCopyOf);
                o00000O o00000o = OooO0O0.f29371OooO0OO;
                ((Cipher) o00000o.get()).init(2, oooO0O0.f29372OooO00o, algorithmParameterSpecOooO00o);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) o00000o.get()).updateAAD(bArr2);
                }
                int i = z ? 12 : 0;
                int length = bArr.length;
                if (z) {
                    length -= 12;
                }
                return ((Cipher) o00000o.get()).doFinal(bArr, i, length);
            case 1:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((o0000O00.OooO0o) this.f29456OooO0O0).OooO00o(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((o0000O00.OooO0o) this.f29456OooO0O0).OooO00o(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}

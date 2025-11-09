package o0000O0O;

import OooO0oO.OooOo;
import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import o00000oo.OooOOOO;

/* loaded from: classes2.dex */
public final class OooO0O0 implements OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SecretKey f29378OooO00o;

    public OooO0O0(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f29378OooO00o = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(OooOo.OooOO0("Keystore cannot load the key with ID: ", str));
        }
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return OooO0Oo(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("OooO0O0", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return OooO0Oo(bArr, bArr2);
        }
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return OooO0OO(bArr, bArr2);
        } catch (ProviderException e) {
            e = e;
            Log.w("OooO0O0", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return OooO0OO(bArr, bArr2);
        } catch (AEADBadTagException e2) {
            throw e2;
        } catch (GeneralSecurityException e3) {
            e = e3;
            Log.w("OooO0O0", "encountered a potentially transient KeyStore error, will wait and retry", e);
            Thread.sleep((int) (Math.random() * 100.0d));
            return OooO0OO(bArr, bArr2);
        }
    }

    public final byte[] OooO0OO(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f29378OooO00o, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] OooO0Oo(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f29378OooO00o);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}

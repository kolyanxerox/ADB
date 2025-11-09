package o0000O0O;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import o0000Oo.o00Ooo;
import o0000Oo.o0Oo0oo;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f29379OooO0O0 = new Object();

    /* renamed from: OooO00o, reason: collision with root package name */
    public KeyStore f29380OooO00o;

    public OooO0OO() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f29380OooO00o = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean OooO00o(String str) {
        OooO0OO oooO0OO = new OooO0OO();
        synchronized (f29379OooO0O0) {
            try {
                if (oooO0OO.OooO0Oo(str)) {
                    return false;
                }
                OooO0O0(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void OooO0O0(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strOooO0O0 = o0Oo0oo.OooO0O0(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strOooO0O0, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized OooO0O0 OooO0OO(String str) {
        OooO0O0 oooO0O0;
        oooO0O0 = new OooO0O0(o0Oo0oo.OooO0O0(str), this.f29380OooO00o);
        byte[] bArrOooO00o = o00Ooo.OooO00o(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrOooO00o, oooO0O0.OooO0O0(oooO0O0.OooO00o(bArrOooO00o, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return oooO0O0;
    }

    public final synchronized boolean OooO0Oo(String str) {
        String strOooO0O0;
        strOooO0O0 = o0Oo0oo.OooO0O0(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("OooO0OO", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f29380OooO00o = keyStore;
                keyStore.load(null);
                return this.f29380OooO00o.containsAlias(strOooO0O0);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.f29380OooO00o.containsAlias(strOooO0O0);
    }
}

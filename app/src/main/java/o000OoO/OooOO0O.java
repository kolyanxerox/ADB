package o000OOO;

import OooO0oO.OooOo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLSocket;
import o0000o0.Oooo0;
import o000OoO.OooOOOO;
import o000OoO.OooOo00;
import o000Oooo.o0000;
import o000Oooo.o00000O0;
import o000Oooo.o0000oo;
import o000Oooo.o000OOo;

/* loaded from: classes2.dex */
public class OooOO0O implements OooOo00, OooOOOO {

    /* renamed from: OooOo */
    public Object f30248OooOo;

    /* renamed from: OooOo0O */
    public final Object f30249OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f30250OooOo0o;

    public /* synthetic */ OooOO0O(Serializable serializable, Serializable serializable2, Object obj) {
        this.f30249OooOo0O = serializable;
        this.f30250OooOo0o = serializable2;
        this.f30248OooOo = obj;
    }

    public AlgorithmParameterSpec OooO(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    public synchronized void OooO00o() {
        if (!((LinkedHashSet) this.f30249OooOo0O).isEmpty()) {
            ((o0000) this.f30250OooOo0o).OooO0o0(0L);
        }
    }

    public void OooO0O0(OooOo00.OooO00o oooO00o, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f30250OooOo0o;
        HashMap map2 = (HashMap) this.f30249OooOo0O;
        OooO oooO = new OooO(byteArrayOutputStream, map2, map, (o000OO0o.OooO0o) this.f30248OooOo);
        o000OO00.OooO0o oooO0o = (o000OO00.OooO0o) map2.get(OooOo00.OooO00o.class);
        if (oooO0o != null) {
            oooO0o.OooO00o(oooO00o, oooO);
        } else {
            throw new o000OO00.OooO0O0("No encoder for " + OooOo00.OooO00o.class);
        }
    }

    public byte[] OooO0OO(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        int iOooO0oO = OooO0oO();
        byte[] bArr2 = new byte[iOooO0oO];
        ((SecureRandom) this.f30250OooOo0o).nextBytes(bArr2);
        AlgorithmParameterSpec algorithmParameterSpecOooO = OooO(bArr2);
        Key key = (Key) this.f30248OooOo;
        Cipher cipher = (Cipher) this.f30249OooOo0O;
        cipher.init(1, key, algorithmParameterSpecOooO);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        byte[] bArr3 = new byte[bArrDoFinal.length + iOooO0oO];
        System.arraycopy(bArr2, 0, bArr3, 0, iOooO0oO);
        System.arraycopy(bArrDoFinal, 0, bArr3, iOooO0oO, bArrDoFinal.length);
        return bArr3;
    }

    public String OooO0Oo() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    public Cipher OooO0o() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // o000OoO.OooOOOO
    public void OooO0o0(Bundle bundle) {
        synchronized (this.f30250OooOo0o) {
            try {
                o000O000.OooO0OO oooO0OO = o000O000.OooO0OO.f30095OooO00o;
                oooO0OO.OooO0oO("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f30248OooOo = new CountDownLatch(1);
                ((o000Ooo0.OooOO0) this.f30249OooOo0O).OooO0o0(bundle);
                oooO0OO.OooO0oO("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f30248OooOo).await(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, TimeUnit.MILLISECONDS)) {
                        oooO0OO.OooO0oO("App exception callback received from Analytics listener.");
                    } else {
                        oooO0OO.OooO0oo(null, "Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f30248OooOo = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int OooO0oO() {
        return 16;
    }

    public Method OooO0oo(Class cls) throws NoSuchMethodException, SecurityException {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod((String) this.f30250OooOo0o, (Class[]) this.f30248OooOo);
        } catch (NoSuchMethodException unused) {
        }
        if ((method.getModifiers() & 1) == 0) {
            method = null;
        }
        if (method == null || (cls2 = (Class) this.f30249OooOo0O) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }

    public Object OooOO0(SSLSocket sSLSocket, Object... objArr) throws NoSuchMethodException, SecurityException {
        Method methodOooO0oo = OooO0oo(sSLSocket.getClass());
        if (methodOooO0oo == null) {
            throw new AssertionError("Method " + ((String) this.f30250OooOo0o) + " not supported for object " + sSLSocket);
        }
        try {
            return methodOooO0oo.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodOooO0oo);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public void OooOO0O(SSLSocket sSLSocket, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodOooO0oo = OooO0oo(sSLSocket.getClass());
            if (methodOooO0oo == null) {
                return;
            }
            try {
                methodOooO0oo.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // o000OoO.OooOo00
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f30248OooOo;
        if (countDownLatch != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str)) {
            countDownLatch.countDown();
        }
    }

    public OooOO0O(Context context, o000Oo0O.OooOo00 oooOo00) throws Exception {
        this.f30250OooOo0o = new SecureRandom();
        String strOooO0Oo = OooO0Oo();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = sharedPreferences.getString(strOooO0Oo, null);
        this.f30249OooOo0O = OooO0o();
        if (string != null) {
            try {
                this.f30248OooOo = oooOo00.OooOOo0(Base64.decode(string, 0));
                return;
            } catch (Exception e) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e);
            }
        }
        byte[] bArr = new byte[16];
        ((SecureRandom) this.f30250OooOo0o).nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f30248OooOo = secretKeySpec;
        oooOo00.getClass();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) oooOo00.f30372OooOo0o;
        Certificate certificate = keyStore.getCertificate(str);
        if (certificate == null) {
            throw new Exception(OooOo.OooOO0("No certificate found under alias: ", str));
        }
        PublicKey publicKey = certificate.getPublicKey();
        if (publicKey == null) {
            throw new Exception(OooOo.OooOO0("No key found under alias: ", str));
        }
        Cipher cipherOooO0oo = oooOo00.OooO0oo();
        cipherOooO0oo.init(3, publicKey, oooOo00.OooO0o());
        editorEdit.putString(strOooO0Oo, Base64.encodeToString(cipherOooO0oo.wrap(secretKeySpec), 0));
        editorEdit.apply();
    }

    public OooOO0O(o000Ooo0.OooOO0 oooOO0) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f30250OooOo0o = new Object();
        this.f30249OooOo0O = oooOO0;
    }

    public OooOO0O(Oooo0 oooo0, o000Oo0O.Oooo0 oooo02, o00000O0 o00000o02, o000OOo o000ooo2, Context context, o0000oo o0000ooVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f30249OooOo0O = linkedHashSet;
        this.f30250OooOo0o = new o0000(oooo0, oooo02, o00000o02, o000ooo2, context, linkedHashSet, o0000ooVar, scheduledExecutorService);
        this.f30248OooOo = scheduledExecutorService;
    }
}

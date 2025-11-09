package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.ironsource.nk */
/* loaded from: classes2.dex */
public class C3457nk {

    /* renamed from: a */
    public static final int f10546a = 1024;

    /* renamed from: b */
    public static final String f10547b = "RSA/ECB/PKCS1Padding";

    /* renamed from: a */
    public static String m10995a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(m10999a(str.getBytes("UTF-8"), m10997a(str2)), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception on string encryption error: " + e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public static KeyPair m10996a() throws NoSuchAlgorithmException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f10547b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception on key generation error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static RSAPublicKey m10997a(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, UnsupportedEncodingException {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    /* renamed from: a */
    public static byte[] m10998a(byte[] bArr, PrivateKey privateKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(f10547b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m10999a(byte[] bArr, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(f10547b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception on encryption error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}

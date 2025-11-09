package Oooo0oO;

import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.at0;
import com.google.android.gms.internal.ads.kt0;
import com.google.android.gms.internal.ads.vy0;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import o0000Oo.Oooo0;
import o00OOO0O.OooO0OO;

/* loaded from: classes2.dex */
public final class o00000O extends ThreadLocal {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f13881OooO00o;

    public /* synthetic */ o00000O(int i) {
        this.f13881OooO00o = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws NoSuchAlgorithmException {
        Provider provider;
        SecureRandom secureRandom;
        int i = 0;
        Provider provider2 = null;
        switch (this.f13881OooO00o) {
            case 0:
                return 0L;
            case 1:
                return ByteBuffer.allocate(32);
            case 2:
                try {
                    return (Cipher) vy0.f25142OooO0O0.f25144OooO00o.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 3:
                try {
                    Cipher cipher = (Cipher) vy0.f25142OooO0O0.f25144OooO00o.zza("ChaCha20-Poly1305");
                    if (at0.OooO0O0(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException unused) {
                    return null;
                }
            case 4:
                try {
                    Cipher cipher2 = (Cipher) vy0.f25142OooO0O0.f25144OooO00o.zza("AES/GCM-SIV/NoPadding");
                    if (kt0.OooO0O0(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 5:
                String[] strArr = af0.f17034OooO0oO;
                while (true) {
                    if (i < 3) {
                        provider = Security.getProvider(strArr[i]);
                        if (provider == null) {
                            i++;
                        }
                    } else {
                        provider = null;
                    }
                }
                if (provider != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } catch (GeneralSecurityException unused2) {
                    }
                } else {
                    try {
                        provider2 = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused3) {
                    }
                    if (provider2 != null) {
                        try {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", provider2);
                        } catch (GeneralSecurityException unused4) {
                        }
                    } else {
                        secureRandom = new SecureRandom();
                    }
                }
                secureRandom.nextLong();
                return secureRandom;
            case 6:
                try {
                    return (Cipher) vy0.f25142OooO0O0.f25144OooO00o.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 7:
                try {
                    return (Cipher) vy0.f25142OooO0O0.f25144OooO00o.zza("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 8:
                try {
                    return (Cipher) vy0.f25142OooO0O0.f25144OooO00o.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 9:
                try {
                    return (Cipher) vy0.f25142OooO0O0.f25144OooO00o.zza("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 10:
                try {
                    return (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 11:
                try {
                    return (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 12:
                try {
                    return (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 13:
                try {
                    return (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 14:
                SecureRandom secureRandom2 = new SecureRandom();
                secureRandom2.nextLong();
                return secureRandom2;
            case 15:
                try {
                    return (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 16:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(OooO0OO.f32345OooOOO);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Base64;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.ads.internal.util.client.zzq;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class o0O implements o000OO0O, t01, il0, o00Oo0, o0Oo0oo, o000000O, o0000Ooo, o0OOO0, o0oo0000, zzq, f01 {

    /* renamed from: OooOoO */
    public static Cipher f21854OooOoO;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f21865OooOo0O;

    /* renamed from: OooOo0o */
    public static final o0O f21853OooOo0o = new o0O(0);

    /* renamed from: OooOo */
    public static final o0O f21852OooOo = new o0O(0);

    /* renamed from: OooOoO0 */
    public static final o0O f21855OooOoO0 = new o0O(1);

    /* renamed from: OooOoOO */
    public static final Object f21856OooOoOO = new Object();

    /* renamed from: OooOoo0 */
    public static final Object f21858OooOoo0 = new Object();

    /* renamed from: OooOoo */
    public static final byte[] f21857OooOoo = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, Utf8.REPLACEMENT_BYTE, 50, 108, -113, -103, 74};

    /* renamed from: OooOooO */
    public static final byte[] f21859OooOooO = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* renamed from: OooOooo */
    public static final o0O f21860OooOooo = new o0O(4);

    /* renamed from: Oooo000 */
    public static final o0O f21862Oooo000 = new o0O(5);

    /* renamed from: Oooo00O */
    public static final o0O f21863Oooo00O = new o0O(7);

    /* renamed from: Oooo00o */
    public static final o0O f21864Oooo00o = new o0O(8);

    /* renamed from: Oooo0 */
    public static final o0O f21861Oooo0 = new o0O(9);

    public /* synthetic */ o0O(int i) {
        this.f21865OooOo0O = i;
    }

    public static o0O0OOO0 OooOOO(oOOO00o0 oooo00o0, Map map) {
        String strZzk = oooo00o0.zzk();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(oooo00o0.zzl());
        URL url = new URL(strZzk);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iZzb = oooo00o0.zzb();
        httpURLConnection.setConnectTimeout(iZzb);
        httpURLConnection.setReadTimeout(iZzb);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            if (oooo00o0.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrZzx = oooo00o0.zzx();
                if (bArrZzx != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrZzx);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            oooo00o0.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                o0O0OOO0 o0o0ooo0 = new o0O0OOO0(responseCode, OooOOo(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return o0o0ooo0;
            }
            try {
                return new o0O0OOO0(responseCode, OooOOo(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new Oo0000(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* bridge */ l11 OooOOOO(Object obj) {
        zz0 zz0Var = (zz0) obj;
        l11 l11Var = zz0Var.zzt;
        if (l11Var != l11.f20771OooO0o) {
            return l11Var;
        }
        l11 l11VarOooO0O0 = l11.OooO0O0();
        zz0Var.zzt = l11VarOooO0O0;
        return l11VarOooO0O0;
    }

    public static String OooOOOo(byte[] bArr, byte[] bArr2) throws C1884o1 {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f21856OooOoOO) {
                OooOo00().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = OooOo00().doFinal(bArr2);
                iv = OooOo00().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new C1884o1(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new C1884o1(e2);
        } catch (BadPaddingException e3) {
            throw new C1884o1(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new C1884o1(e4);
        } catch (NoSuchPaddingException e5) {
            throw new C1884o1(e5);
        }
    }

    public static ArrayList OooOOo(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new oOO0OoO0((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static boolean OooOOo0(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrOooOOo = ze0.OooOOo(file.getAbsolutePath());
            if (x509CertificateArrOooOOo.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrOooOOo[0][0].getEncoded());
            return Arrays.equals(f21857OooOoo, bArrDigest) || (!"user".equals(Build.TYPE) && Arrays.equals(f21859OooOooO, bArrDigest));
        } catch (oOO0O00O e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }

    public static byte[] OooOOoo(String str, byte[] bArr) throws C1884o1 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new C1884o1();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f21856OooOoOO) {
                OooOo00().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = OooOo00().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new C1884o1(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new C1884o1(e2);
        } catch (InvalidKeyException e3) {
            throw new C1884o1(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new C1884o1(e4);
        } catch (BadPaddingException e5) {
            throw new C1884o1(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new C1884o1(e6);
        } catch (NoSuchPaddingException e7) {
            throw new C1884o1(e7);
        }
    }

    public static boolean OooOo0(int i, w10 w10Var, Object obj) throws k01 {
        int i2 = w10Var.f25171OooO00o;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        nz0 nz0Var = (nz0) w10Var.f25174OooO0Oo;
        if (i4 == 0) {
            w10Var.Oooo0oo(0);
            ((l11) obj).OooO0OO(i3 << 3, Long.valueOf(nz0Var.OoooO0()));
            return true;
        }
        if (i4 == 1) {
            w10Var.Oooo0oo(1);
            ((l11) obj).OooO0OO((i3 << 3) | 1, Long.valueOf(nz0Var.OoooO00()));
            return true;
        }
        if (i4 == 2) {
            w10Var.Oooo0oo(2);
            ((l11) obj).OooO0OO((i3 << 3) | 2, nz0Var.o000oOoO());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw new j01();
            }
            w10Var.Oooo0oo(5);
            ((l11) obj).OooO0OO(5 | (i3 << 3), Integer.valueOf(nz0Var.Oooo0OO()));
            return true;
        }
        l11 l11VarOooO0O0 = l11.OooO0O0();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new k01("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (w10Var.OoooO0O() != Integer.MAX_VALUE && OooOo0(i6, w10Var, l11VarOooO0O0)) {
        }
        if ((i5 | 4) != w10Var.f25171OooO00o) {
            throw new k01("Protocol message end-group tag did not match expected tag.");
        }
        if (l11VarOooO0O0.f20776OooO0o0) {
            l11VarOooO0O0.f20776OooO0o0 = false;
        }
        ((l11) obj).OooO0OO(i5 | 3, l11VarOooO0O0);
        return true;
    }

    public static final Cipher OooOo00() {
        Cipher cipher;
        synchronized (f21858OooOoo0) {
            try {
                if (f21854OooOoO == null) {
                    f21854OooOoO = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f21854OooOoO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public void OooO(o000O00 o000o002) {
        switch (this.f21865OooOo0O) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.t01
    public c11 OooO00o(Class cls) {
        if (!zz0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (c11) zz0.OooOOO0(cls.asSubclass(zz0.class)).OooOOoo(3, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.t01
    public boolean OooO0O0(Class cls) {
        return zz0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public void OooO0OO() {
        switch (this.f21865OooOo0O) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0069  */
    @Override // com.google.android.gms.internal.ads.o0oo0000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.ooo0Oo0 OooO0o(com.google.android.gms.internal.ads.o0OoOo0 r3) {
        /*
            r2 = this;
            int r0 = r2.f21865OooOo0O
            switch(r0) {
                case 21: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "This SubtitleParser.Factory doesn't support any formats."
            r3.<init>(r0)
            throw r3
        Ld:
            java.lang.String r0 = r3.f22222OooOOO0
            if (r0 == 0) goto La5
            int r1 = r0.hashCode()
            switch(r1) {
                case -1351681404: goto L5f;
                case -1248334819: goto L55;
                case -1026075066: goto L4b;
                case -1004728940: goto L41;
                case 691401887: goto L37;
                case 822864842: goto L2d;
                case 1668750253: goto L23;
                case 1693976202: goto L19;
                default: goto L18;
            }
        L18:
            goto L69
        L19:
            java.lang.String r1 = "application/ttml+xml"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            r1 = 7
            goto L6a
        L23:
            java.lang.String r1 = "application/x-subrip"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            r1 = 3
            goto L6a
        L2d:
            java.lang.String r1 = "text/x-ssa"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            r1 = 0
            goto L6a
        L37:
            java.lang.String r1 = "application/x-quicktime-tx3g"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            r1 = 4
            goto L6a
        L41:
            java.lang.String r1 = "text/vtt"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L4b:
            java.lang.String r1 = "application/x-mp4-vtt"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            r1 = 2
            goto L6a
        L55:
            java.lang.String r1 = "application/pgs"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            r1 = 5
            goto L6a
        L5f:
            java.lang.String r1 = "application/dvbsubs"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            r1 = 6
            goto L6a
        L69:
            r1 = -1
        L6a:
            java.util.List r3 = r3.f22224OooOOOo
            switch(r1) {
                case 0: goto L9e;
                case 1: goto L97;
                case 2: goto L90;
                case 3: goto L8a;
                case 4: goto L84;
                case 5: goto L7d;
                case 6: goto L76;
                case 7: goto L70;
                default: goto L6f;
            }
        L6f:
            goto La5
        L70:
            com.google.android.gms.internal.ads.oO00O0o r3 = new com.google.android.gms.internal.ads.oO00O0o
            r3.<init>()
            goto La4
        L76:
            com.google.android.gms.internal.ads.oO000O0O r0 = new com.google.android.gms.internal.ads.oO000O0O
            r0.<init>(r3)
        L7b:
            r3 = r0
            goto La4
        L7d:
            com.google.android.gms.internal.ads.ai r3 = new com.google.android.gms.internal.ads.ai
            r0 = 4
            r3.<init>(r0)
            goto La4
        L84:
            com.google.android.gms.internal.ads.oO00OO0O r0 = new com.google.android.gms.internal.ads.oO00OO0O
            r0.<init>(r3)
            goto L7b
        L8a:
            com.google.android.gms.internal.ads.oO0OOo0o r3 = new com.google.android.gms.internal.ads.oO0OOo0o
            r3.<init>()
            goto La4
        L90:
            com.google.android.gms.internal.ads.o000 r3 = new com.google.android.gms.internal.ads.o000
            r0 = 1
            r3.<init>(r0)
            goto La4
        L97:
            com.google.android.gms.internal.ads.xx r3 = new com.google.android.gms.internal.ads.xx
            r0 = 5
            r3.<init>(r0)
            goto La4
        L9e:
            com.google.android.gms.internal.ads.oO0OoOO0 r0 = new com.google.android.gms.internal.ads.oO0OoOO0
            r0.<init>(r3)
            goto L7b
        La4:
            return r3
        La5:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0O.OooO0o(com.google.android.gms.internal.ads.o0OoOo0):com.google.android.gms.internal.ads.ooo0Oo0");
    }

    @Override // com.google.android.gms.internal.ads.o0oo0000
    public boolean OooO0o0(o0OoOo0 o0oooo0) {
        switch (this.f21865OooOo0O) {
            case 21:
                String str = o0oooo0.f22222OooOOO0;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public o000O OooO0oO(int i, int i2) {
        switch (this.f21865OooOo0O) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return new o00000O0();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0065  */
    @Override // com.google.android.gms.internal.ads.o0oo0000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int OooO0oo(com.google.android.gms.internal.ads.o0OoOo0 r4) {
        /*
            r3 = this;
            int r0 = r3.f21865OooOo0O
            switch(r0) {
                case 21: goto L7;
                default: goto L5;
            }
        L5:
            r4 = 1
            return r4
        L7:
            java.lang.String r4 = r4.f22222OooOOO0
            if (r4 == 0) goto L6c
            int r0 = r4.hashCode()
            r1 = 2
            r2 = 1
            switch(r0) {
                case -1351681404: goto L5b;
                case -1248334819: goto L51;
                case -1026075066: goto L47;
                case -1004728940: goto L3d;
                case 691401887: goto L33;
                case 822864842: goto L29;
                case 1668750253: goto L1f;
                case 1693976202: goto L15;
                default: goto L14;
            }
        L14:
            goto L65
        L15:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
            r0 = 7
            goto L66
        L1f:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
            r0 = 3
            goto L66
        L29:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
            r0 = 0
            goto L66
        L33:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
            r0 = 4
            goto L66
        L3d:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
            r0 = r2
            goto L66
        L47:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
            r0 = r1
            goto L66
        L51:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
            r0 = 5
            goto L66
        L5b:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
            r0 = 6
            goto L66
        L65:
            r0 = -1
        L66:
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L6a;
                case 2: goto L6b;
                case 3: goto L6a;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L6b;
                case 7: goto L6a;
                default: goto L69;
            }
        L69:
            goto L6c
        L6a:
            r1 = r2
        L6b:
            return r1
        L6c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0O.OooO0oo(com.google.android.gms.internal.ads.o0OoOo0):int");
    }

    @Override // com.google.android.gms.internal.ads.o0OOO0
    public long OooOO0O(o000000 o000000Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.o00Oo0
    public void zza() {
    }

    @Override // com.google.android.gms.internal.ads.o0OOO0
    public o000O00 zze() {
        return new o0000oo(-9223372036854775807L, 0L);
    }

    public o0O(o0O o0o) {
        this.f21865OooOo0O = 24;
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        int i = OooO0o.f16794OooO00o;
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
            if (objInvoke != null) {
                return (InterfaceC2237xl) objInvoke;
            }
            throw null;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        switch (this.f21865OooOo0O) {
            case 25:
                int i = AbstractBinderC2292z2.f26067OooOo0O;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                if (iInterfaceQueryLocalInterface instanceof InterfaceC1371a3) {
                    return (InterfaceC1371a3) iInterfaceQueryLocalInterface;
                }
                return new C2255y2(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                if (iInterfaceQueryLocalInterface2 instanceof C2187w8) {
                    return (C2187w8) iInterfaceQueryLocalInterface2;
                }
                return new C2187w8(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        }
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Constructor mo13704zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f21865OooOo0O) {
            case 13:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(o00000O.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(o00000O.class).getConstructor(null);
        }
    }

    private final void OooOO0o() {
    }

    @Override // com.google.android.gms.internal.ads.o00Oo0
    public void zzb() {
    }

    private final void OooOOO0(o000O00 o000o002) {
    }

    @Override // com.google.android.gms.internal.ads.o0OOO0
    public void OooO0Oo(long j) {
    }

    @Override // com.google.android.gms.internal.ads.o0Oo0oo
    public long OooOO0(long j) {
        return j;
    }
}

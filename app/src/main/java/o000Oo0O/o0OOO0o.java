package o000Oo0o;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.ironsource.InterfaceC3173h3;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes2.dex */
public final class o0OOO0o {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f30402OooO0OO = {ProxyConfig.MATCH_ALL_SCHEMES, "FCM", "GCM", ""};

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f30403OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30404OooO0O0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0OOO0o(o0000o0.Oooo0 r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.OooO00o()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.f29588OooO00o
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f30403OooO00o = r0
            r4.OooO00o()
            o0000o0.o0OoOo0 r0 = r4.f29590OooO0OO
            java.lang.String r1 = r0.f29609OooO0o0
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.OooO00o()
            java.lang.String r4 = "1:"
            java.lang.String r1 = r0.f29605OooO0O0
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.f30404OooO0O0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Oo0o.o0OOO0o.<init>(o0000o0.Oooo0):void");
    }

    public final String OooO00o() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f30403OooO00o) {
            String strEncodeToString = null;
            String string = this.f30403OooO00o.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + InterfaceC3173h3.d.b.f8827j) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}

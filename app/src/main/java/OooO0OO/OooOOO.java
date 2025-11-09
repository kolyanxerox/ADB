package OooO0oO;

import com.google.android.gms.internal.ads.yy0;
import com.google.android.gms.internal.play_billing.oOO00O;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import javax.crypto.Mac;
import o0000OOO.OooO00o;
import o00O0oo.o0000oo;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes.dex */
public final class OooOOO implements OooO00o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f13274OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f13275OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f13276OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Object f13277OooOoO0;

    public OooOOO(com.android.billingclient.api.OooOOOO oooOOOO, int i, Consumer consumer, Runnable runnable) {
        this.f13275OooOo0O = i;
        this.f13276OooOo0o = consumer;
        this.f13274OooOo = runnable;
        this.f13277OooOoO0 = oooOOOO;
    }

    public void OooO00o(Throwable th) {
        boolean z = th instanceof TimeoutException;
        com.android.billingclient.api.OooOOOO oooOOOO = (com.android.billingclient.api.OooOOOO) this.f13277OooOoO0;
        if (z) {
            oooOOOO.Oooo0o(114, 28, com.android.billingclient.api.OooOo00.f15492Oooo00O);
            oOO00O.OooO("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            oooOOOO.Oooo0o(107, 28, com.android.billingclient.api.OooOo00.f15492Oooo00O);
            oOO00O.OooO("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f13274OooOo).run();
    }

    @Override // o0000OOO.OooO00o
    public byte[] OooO0O0(int i, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i > this.f13275OooOo0O) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        yy0 yy0Var = (yy0) this.f13276OooOo0o;
        ((Mac) yy0Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) yy0Var.get()).doFinal(), i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OooOOO(java.lang.String r5, javax.crypto.spec.SecretKeySpec r6) throws java.security.GeneralSecurityException {
        /*
            r4 = this;
            r4.<init>()
            com.google.android.gms.internal.ads.yy0 r0 = new com.google.android.gms.internal.ads.yy0
            r1 = 1
            r0.<init>(r4, r1)
            r4.f13276OooOo0o = r0
            r2 = 2
            boolean r3 = com.google.android.gms.internal.ads.AbstractC2183w4.OooO0O0(r2)
            if (r3 == 0) goto L90
            r4.f13274OooOo = r5
            r4.f13277OooOoO0 = r6
            byte[] r6 = r6.getEncoded()
            int r6 = r6.length
            r3 = 16
            if (r6 < r3) goto L88
            r6 = -1
            int r3 = r5.hashCode()
            switch(r3) {
                case -1823053428: goto L53;
                case 392315023: goto L4a;
                case 392315118: goto L3f;
                case 392316170: goto L34;
                case 392317873: goto L29;
                default: goto L27;
            }
        L27:
            r1 = r6
            goto L5d
        L29:
            java.lang.String r1 = "HMACSHA512"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L32
            goto L27
        L32:
            r1 = 4
            goto L5d
        L34:
            java.lang.String r1 = "HMACSHA384"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3d
            goto L27
        L3d:
            r1 = 3
            goto L5d
        L3f:
            java.lang.String r1 = "HMACSHA256"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L48
            goto L27
        L48:
            r1 = r2
            goto L5d
        L4a:
            java.lang.String r2 = "HMACSHA224"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5d
            goto L27
        L53:
            java.lang.String r1 = "HMACSHA1"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L5c
            goto L27
        L5c:
            r1 = 0
        L5d:
            switch(r1) {
                case 0: goto L80;
                case 1: goto L7b;
                case 2: goto L76;
                case 3: goto L71;
                case 4: goto L6c;
                default: goto L60;
            }
        L60:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
        L6c:
            r5 = 64
            r4.f13275OooOo0O = r5
            goto L84
        L71:
            r5 = 48
            r4.f13275OooOo0O = r5
            goto L84
        L76:
            r5 = 32
            r4.f13275OooOo0O = r5
            goto L84
        L7b:
            r5 = 28
            r4.f13275OooOo0O = r5
            goto L84
        L80:
            r5 = 20
            r4.f13275OooOo0O = r5
        L84:
            r0.get()
            return
        L88:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r6 = "key size too small, need at least 16 bytes"
            r5.<init>(r6)
            throw r5
        L90:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0oO.OooOOO.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }

    public OooOOO(int i, o00O0O0O.OooOOO0 oooOOO0, o0000oo o0000ooVar, o0OoOoOo o0oooooo) {
        this.f13276OooOo0o = o0oooooo;
        this.f13275OooOo0O = i;
        this.f13274OooOo = o0000ooVar;
        this.f13277OooOoO0 = oooOOO0;
    }
}

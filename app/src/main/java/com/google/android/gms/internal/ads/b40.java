package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class b40 implements sv0 {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static b40 f17364OooO0o0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f17365OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f17366OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f17367OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f17368OooO0Oo;

    public b40(im0 im0Var, rh0 rh0Var) {
        g61 g61Var = new g61(8);
        this.f17366OooO0O0 = im0Var;
        this.f17367OooO0OO = rh0Var;
        this.f17368OooO0Oo = g61Var;
        this.f17365OooO00o = 1048576;
    }

    public static /* synthetic */ void OooO0o(b40 b40Var, int i) {
        synchronized (b40Var.f17368OooO0Oo) {
            try {
                if (b40Var.f17365OooO00o == i) {
                    return;
                }
                b40Var.f17365OooO00o = i;
                Iterator it = ((CopyOnWriteArrayList) b40Var.f17367OooO0OO).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    fb1 fb1Var = (fb1) weakReference.get();
                    if (fb1Var != null) {
                        gb1.OooO0O0(fb1Var.f18912OooO00o, i);
                    } else {
                        ((CopyOnWriteArrayList) b40Var.f17367OooO0OO).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized b40 OooO0o0(Context context) {
        try {
            if (f17364OooO0o0 == null) {
                f17364OooO0o0 = new b40(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17364OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.sv0
    public byte[] OooO00o(int i, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i > this.f17365OooO00o) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        yy0 yy0Var = (yy0) this.f17366OooO0O0;
        ((Mac) yy0Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) yy0Var.get()).doFinal(), i);
    }

    public int OooO0O0() {
        int i;
        synchronized (this.f17368OooO0Oo) {
            i = this.f17365OooO00o;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OooO0OO(com.google.android.gms.internal.ads.C1996r2 r9, com.google.android.gms.internal.ads.o0O r10) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b40.OooO0OO(com.google.android.gms.internal.ads.r2, com.google.android.gms.internal.ads.o0O):boolean");
    }

    public C2070t2 OooO0Oo(int i) {
        String string;
        int i2 = this.f17365OooO00o;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f17368OooO0Oo;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("LATMTD");
            sb.append(i2 - 1);
            string = sharedPreferences.getString(sb.toString(), null);
        } else {
            StringBuilder sb2 = new StringBuilder("FBAMTD");
            sb2.append(i2 - 1);
            string = sharedPreferences.getString(sb2.toString(), null);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrOooOOO = Oooo0OO.o00oO0o.OooOOO(string);
                C2070t2 c2070t2OooOoo0 = C2070t2.OooOoo0(jz0.OooOo0(bArrOooOOO, 0, bArrOooOOO.length));
                String strOooOooo = c2070t2OooOoo0.OooOooo();
                File fileOooo00O = xh0.Oooo00O(strOooOooo, "pcam.jar", OooO0oO());
                if (!fileOooo00O.exists()) {
                    fileOooo00O = xh0.Oooo00O(strOooOooo, "pcam", OooO0oO());
                }
                File fileOooo00O2 = xh0.Oooo00O(strOooOooo, "pcbc", OooO0oO());
                if (fileOooo00O.exists()) {
                    if (fileOooo00O2.exists()) {
                        return c2070t2OooOoo0;
                    }
                }
            } catch (k01 unused) {
            }
        }
        return null;
    }

    public File OooO0oO() {
        File file = new File((File) this.f17366OooO0O0, Integer.toString(this.f17365OooO00o - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public b40(Context context) {
        this.f17366OooO0O0 = new Handler(Looper.getMainLooper());
        this.f17367OooO0OO = new CopyOnWriteArrayList();
        this.f17368OooO0Oo = new Object();
        this.f17365OooO00o = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C2291z1(this, 2), intentFilter);
    }

    public b40(Context context, int i) {
        this.f17368OooO0Oo = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        xh0.OooOo0(dir, false);
        this.f17366OooO0O0 = dir;
        File dir2 = context.getDir("tmppccache", 0);
        xh0.OooOo0(dir2, true);
        this.f17367OooO0OO = dir2;
        this.f17365OooO00o = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b40(java.lang.String r6, javax.crypto.spec.SecretKeySpec r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.yy0 r0 = new com.google.android.gms.internal.ads.yy0
            r1 = 0
            r0.<init>(r5, r1)
            r5.f17366OooO0O0 = r0
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.xh0.OooOo0O(r1)
            if (r2 == 0) goto L8f
            r5.f17367OooO0OO = r6
            r5.f17368OooO0Oo = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L87
            int r7 = r6.hashCode()
            r2 = 1
            r3 = 3
            r4 = 4
            switch(r7) {
                case -1823053428: goto L52;
                case 392315023: goto L48;
                case 392315118: goto L3e;
                case 392316170: goto L34;
                case 392317873: goto L2a;
                default: goto L29;
            }
        L29:
            goto L5c
        L2a:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5c
            r7 = r4
            goto L5d
        L34:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5c
            r7 = r3
            goto L5d
        L3e:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5c
            r7 = r1
            goto L5d
        L48:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5c
            r7 = r2
            goto L5d
        L52:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5c
            r7 = 0
            goto L5d
        L5c:
            r7 = -1
        L5d:
            if (r7 == 0) goto L7f
            if (r7 == r2) goto L7c
            if (r7 == r1) goto L79
            if (r7 == r3) goto L76
            if (r7 != r4) goto L6a
            r6 = 64
            goto L81
        L6a:
            java.lang.String r7 = "unknown Hmac algorithm: "
            java.lang.String r6 = r7.concat(r6)
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            r7.<init>(r6)
            throw r7
        L76:
            r6 = 48
            goto L81
        L79:
            r6 = 32
            goto L81
        L7c:
            r6 = 28
            goto L81
        L7f:
            r6 = 20
        L81:
            r5.f17365OooO00o = r6
            r0.get()
            return
        L87:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L8f:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b40.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }
}

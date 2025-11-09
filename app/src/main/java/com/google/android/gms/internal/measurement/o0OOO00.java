package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Binder;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C1666i4;
import com.google.android.gms.internal.ads.C1734k;
import com.google.android.gms.internal.ads.C1993r;
import com.google.android.gms.internal.ads.C2067t;
import com.google.android.gms.internal.ads.C2274yl;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.l60;
import com.google.android.gms.internal.ads.mf0;
import com.google.android.gms.internal.ads.n60;
import com.google.android.gms.internal.ads.vp0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.wt0;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class o0OOO00 implements vp0 {

    /* renamed from: OooOoO0 */
    public static o0OOO00 f26561OooOoO0;

    /* renamed from: OooOo */
    public final Object f26562OooOo;

    /* renamed from: OooOo0O */
    public boolean f26563OooOo0O;

    /* renamed from: OooOo0o */
    public Object f26564OooOo0o;

    public o0OOO00(int i) {
        switch (i) {
            case 3:
                this.f26562OooOo = zzb.zzb;
                break;
            case 6:
                this.f26564OooOo0o = new ArrayList();
                this.f26562OooOo = wt0.f25407OooO0O0;
                this.f26563OooOo0O = false;
                break;
            default:
                this.f26563OooOo0O = false;
                this.f26564OooOo0o = null;
                this.f26562OooOo = null;
                break;
        }
    }

    public static o0OOO00 OooO00o(Context context) {
        o0OOO00 o0ooo00;
        synchronized (o0OOO00.class) {
            try {
                if (f26561OooOoO0 == null) {
                    f26561OooOoO0 = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new o0OOO00(context, 0) : new o0OOO00(0);
                }
                o0OOO00 o0ooo002 = f26561OooOoO0;
                if (o0ooo002 != null && ((o0OO) o0ooo002.f26562OooOo) != null && !o0ooo002.f26563OooOo0O) {
                    try {
                        context.getContentResolver().registerContentObserver(oo0ooO.f26910OooO00o, true, (o0OO) f26561OooOoO0.f26562OooOo);
                        o0OOO00 o0ooo003 = f26561OooOoO0;
                        o0ooo003.getClass();
                        o0ooo003.f26563OooOo0O = true;
                    } catch (SecurityException e) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                    }
                }
                o0ooo00 = f26561OooOoO0;
                o0ooo00.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0ooo00;
    }

    public static /* bridge */ /* synthetic */ void OooO0o0(o0OOO00 o0ooo00) {
        synchronized (o0ooo00.f26562OooOo) {
            try {
                C1666i4 c1666i4 = (C1666i4) o0ooo00.f26564OooOo0o;
                if (c1666i4 == null) {
                    return;
                }
                c1666i4.disconnect();
                o0ooo00.f26564OooOo0o = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void OooO0O0(int i) {
        if (this.f26563OooOo0O) {
            return;
        }
        this.f26563OooOo0O = true;
        OooO0Oo(new zze(i, "Error from: " + ((l60) this.f26564OooOo0o).f20808OooO00o + ", code: " + i, AdError.UNDEFINED_DOMAIN, null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0042, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0051, code lost:
    
        if (r6 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0053, code lost:
    
        com.google.android.gms.internal.measurement.o0OO0O0.f26544OooO00o = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String OooO0OO(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f26564OooOo0o
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L8f
            boolean r2 = com.google.android.gms.internal.measurement.o0OO0O0.f26545OooO0O0
            r3 = 1
            if (r2 == 0) goto Ld
            goto L5b
        Ld:
            java.lang.Class<com.google.android.gms.internal.measurement.o0OO0O0> r2 = com.google.android.gms.internal.measurement.o0OO0O0.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.o0OO0O0.f26545OooO0O0     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            goto L5b
        L16:
            r9 = move-exception
            goto L8d
        L19:
            r4 = r3
        L1a:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L51
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.o0OO0O0.f26544OooO00o     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L2c
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L16
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.o0OO0O0.f26544OooO00o = r5     // Catch: java.lang.Throwable -> L16
        L2c:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.o0OO0O0.f26544OooO00o     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L32
            r6 = r3
            goto L55
        L32:
            boolean r7 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r7 != 0) goto L42
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r0 != 0) goto L51
        L42:
            r6 = r3
            goto L51
        L44:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r5)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.o0OO0O0.f26544OooO00o = r1     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + 1
            goto L1a
        L51:
            if (r6 == 0) goto L55
            com.google.android.gms.internal.measurement.o0OO0O0.f26544OooO00o = r1     // Catch: java.lang.Throwable -> L16
        L55:
            if (r6 == 0) goto L59
            com.google.android.gms.internal.measurement.o0OO0O0.f26545OooO0O0 = r3     // Catch: java.lang.Throwable -> L16
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            r3 = r6
        L5b:
            if (r3 != 0) goto L5e
            goto L8f
        L5e:
            com.google.android.gms.internal.measurement.oo000o r0 = new com.google.android.gms.internal.measurement.oo000o     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            java.lang.Object r0 = r0.OooO00o()     // Catch: java.lang.SecurityException -> L68 java.lang.NullPointerException -> L76 java.lang.IllegalStateException -> L7a
            goto L73
        L68:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            java.lang.Object r0 = r0.OooO00o()     // Catch: java.lang.Throwable -> L7c
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
        L73:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            return r0
        L76:
            r0 = move-exception
            goto L81
        L78:
            r0 = move-exception
            goto L81
        L7a:
            r0 = move-exception
            goto L81
        L7c:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            throw r0     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
        L81:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r9, r0)
            return r1
        L8d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r9
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o0OOO00.OooO0OO(java.lang.String):java.lang.String");
    }

    public synchronized void OooO0Oo(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOOoO)).booleanValue()) {
            i = 3;
        }
        ((C2274yl) this.f26562OooOo).zzd(new n60(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        jf0 jf0Var = (jf0) this.f26562OooOo;
        if (jf0Var.zzk()) {
            jf0Var.OooO0Oo(th);
            jf0Var.OooOO0(false);
            mf0 mf0Var = (mf0) this.f26564OooOo0o;
            mf0Var.OooO00o(jf0Var);
            if (this.f26563OooOo0O) {
                mf0Var.OooO0oo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        jf0 jf0Var = (jf0) this.f26562OooOo;
        jf0Var.OooOO0(true);
        mf0 mf0Var = (mf0) this.f26564OooOo0o;
        mf0Var.OooO00o(jf0Var);
        if (this.f26563OooOo0O) {
            mf0Var.OooO0oo();
        }
    }

    public o0OOO00(l60 l60Var, C2274yl c2274yl) {
        this.f26564OooOo0o = l60Var;
        this.f26562OooOo = c2274yl;
        this.f26563OooOo0O = false;
    }

    public o0OOO00(mf0 mf0Var, jf0 jf0Var, boolean z) {
        this.f26564OooOo0o = mf0Var;
        this.f26562OooOo = jf0Var;
        this.f26563OooOo0O = z;
    }

    public o0OOO00(Context context, int i) {
        switch (i) {
            case 2:
                this.f26562OooOo = new Object();
                break;
            case 3:
                ExecutorService executorService = zzb.zzb;
                this.f26562OooOo = executorService;
                executorService.execute(new wp0(6, this, context));
                break;
            default:
                this.f26563OooOo0O = false;
                this.f26564OooOo0o = context;
                this.f26562OooOo = new o0OO(null);
                break;
        }
    }

    public o0OOO00(C1734k c1734k) {
        this.f26564OooOo0o = c1734k.OooOoO();
        this.f26563OooOo0O = c1734k.OooOoo();
        this.f26562OooOo = c1734k.OooOo();
        c1734k.OooOoO0();
    }

    public o0OOO00(String str) {
        this.f26564OooOo0o = str;
        this.f26563OooOo0O = false;
        this.f26562OooOo = C1993r.OooOo();
        int i = C2067t.zza;
    }
}

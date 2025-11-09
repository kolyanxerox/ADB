package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ql */
/* loaded from: classes2.dex */
public final class C1978ql {

    /* renamed from: OooO */
    public Boolean f23627OooO;

    /* renamed from: OooO00o */
    public final Object f23628OooO00o = new Object();

    /* renamed from: OooO0O0 */
    public final zzj f23629OooO0O0;

    /* renamed from: OooO0OO */
    public final C2052sl f23630OooO0OO;

    /* renamed from: OooO0Oo */
    public boolean f23631OooO0Oo;

    /* renamed from: OooO0o */
    public VersionInfoParcel f23632OooO0o;

    /* renamed from: OooO0o0 */
    public Context f23633OooO0o0;

    /* renamed from: OooO0oO */
    public String f23634OooO0oO;

    /* renamed from: OooO0oo */
    public OooOOOo.o0ooOOo f23635OooO0oo;

    /* renamed from: OooOO0 */
    public final AtomicInteger f23636OooOO0;

    /* renamed from: OooOO0O */
    public final AtomicInteger f23637OooOO0O;
    public final C1941pl OooOO0o;

    /* renamed from: OooOOO */
    public o00000oO.OooOOO f23638OooOOO;

    /* renamed from: OooOOO0 */
    public final Object f23639OooOOO0;

    /* renamed from: OooOOOO */
    public final AtomicBoolean f23640OooOOOO;

    public C1978ql() {
        zzj zzjVar = new zzj();
        this.f23629OooO0O0 = zzjVar;
        this.f23630OooO0OO = new C2052sl(zzbc.zzd(), zzjVar);
        this.f23631OooO0Oo = false;
        this.f23635OooO0oo = null;
        this.f23627OooO = null;
        this.f23636OooOO0 = new AtomicInteger(0);
        this.f23637OooOO0O = new AtomicInteger(0);
        this.OooOO0o = new C1941pl();
        this.f23639OooOOO0 = new Object();
        this.f23640OooOOOO = new AtomicBoolean();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:25:0x0007, B:27:0x000b, B:29:0x001d, B:31:0x002f, B:34:0x0039, B:35:0x0042), top: B:40:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO(java.lang.String r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f23633OooO0o0
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r5.f23632OooO0o
            java.lang.Object r2 = com.google.android.gms.internal.ads.C1643hi.f19781Oooo000
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ii r3 = com.google.android.gms.internal.ads.C1643hi.f19783Oooo00o     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L42
            com.google.android.gms.internal.ads.v6 r3 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0o0O     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.a7 r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r4.OooO00o(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L39
            com.google.android.gms.internal.ads.v6 r3 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0o0     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.a7 r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r4.OooO00o(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L39
            com.google.android.gms.internal.ads.hi r3 = new com.google.android.gms.internal.ads.hi     // Catch: java.lang.Throwable -> L37
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C1643hi.f19783Oooo00o = r3     // Catch: java.lang.Throwable -> L37
            goto L42
        L37:
            r6 = move-exception
            goto L49
        L39:
            com.google.android.gms.internal.ads.rd r0 = new com.google.android.gms.internal.ads.rd     // Catch: java.lang.Throwable -> L37
            r1 = 9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C1643hi.f19783Oooo00o = r0     // Catch: java.lang.Throwable -> L37
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.ii r0 = com.google.android.gms.internal.ads.C1643hi.f19783Oooo00o
            r0.OooO00o(r6, r7)
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1978ql.OooO(java.lang.String, java.lang.Throwable):void");
    }

    public final boolean OooO00o(Context context) {
        if (Oooo0OO.o00oO0o.OooO0oo()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO00Oo)).booleanValue()) {
                return this.f23640OooOOOO.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final Resources OooO0O0() {
        if (this.f23632OooO0o.isClientJar) {
            return this.f23633OooO0o0.getResources();
        }
        try {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO0oO)).booleanValue()) {
                return zzs.zza(this.f23633OooO0o0).getResources();
            }
            zzs.zza(this.f23633OooO0o0).getResources();
            return null;
        } catch (zzr e) {
            zzo.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final OooOOOo.o0ooOOo OooO0OO() {
        OooOOOo.o0ooOOo o0ooooo;
        synchronized (this.f23628OooO00o) {
            o0ooooo = this.f23635OooO0oo;
        }
        return o0ooooo;
    }

    public final zzj OooO0Oo() {
        zzj zzjVar;
        synchronized (this.f23628OooO00o) {
            zzjVar = this.f23629OooO0O0;
        }
        return zzjVar;
    }

    public final void OooO0o(Context context, VersionInfoParcel versionInfoParcel) {
        OooOOOo.o0ooOOo o0ooooo;
        synchronized (this.f23628OooO00o) {
            try {
                if (!this.f23631OooO0Oo) {
                    this.f23633OooO0o0 = context.getApplicationContext();
                    this.f23632OooO0o = versionInfoParcel;
                    zzv.zzb().OooO0O0(this.f23630OooO0OO);
                    this.f23629OooO0O0.zzp(this.f23633OooO0o0);
                    C1643hi.OooO0Oo(this.f23633OooO0o0, this.f23632OooO0o);
                    zzv.zze();
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17843o000o0oO)).booleanValue()) {
                        o0ooooo = new OooOOOo.o0ooOOo();
                    } else {
                        zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        o0ooooo = null;
                    }
                    this.f23635OooO0oo = o0ooooo;
                    if (o0ooooo != null) {
                        ze0.OooOOo0(new C1905ol(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f23633OooO0o0;
                    if (Oooo0OO.o00oO0o.OooO0oo()) {
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO00Oo)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new C1810m1(this, 1));
                            } catch (RuntimeException e) {
                                zzo.zzk("Failed to register network callback", e);
                                this.f23640OooOOOO.set(true);
                            }
                        }
                    }
                    this.f23631OooO0Oo = true;
                    OooO0o0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzv.zzq().zzc(context, versionInfoParcel.afmaVersion);
    }

    public final o00000oO.OooOOO OooO0o0() {
        if (this.f23633OooO0o0 != null) {
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17876o00O0OoO)).booleanValue()) {
                synchronized (this.f23639OooOOO0) {
                    try {
                        o00000oO.OooOOO oooOOO = this.f23638OooOOO;
                        if (oooOOO != null) {
                            return oooOOO;
                        }
                        o00000oO.OooOOO oooOOOOooO0O0 = AbstractC2200wl.f25321OooO00o.OooO0O0(new CallableC1736k1(this, 1));
                        this.f23638OooOOO = oooOOOOooO0O0;
                        return oooOOOOooO0O0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return ii0.OooooOO(new ArrayList());
    }

    public final void OooO0oO(String str, Throwable th) {
        C1643hi.OooO0Oo(this.f23633OooO0o0, this.f23632OooO0o).OooO0O0(th, str, ((Double) AbstractC1965q8.f23542OooO0oO.OooOOO()).floatValue());
    }

    public final void OooO0oo(String str, Throwable th) {
        C1643hi.OooO0Oo(this.f23633OooO0o0, this.f23632OooO0o).OooO00o(str, th);
    }
}

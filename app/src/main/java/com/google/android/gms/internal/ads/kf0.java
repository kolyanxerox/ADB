package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class kf0 implements jf0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f20569OooO00o;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final int f20582OooOOOo;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f20570OooO0O0 = 0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f20571OooO0OO = -1;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f20572OooO0Oo = false;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public int f20584OooOOo0 = 2;

    /* renamed from: OooOOo, reason: collision with root package name */
    public int f20583OooOOo = 2;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f20574OooO0o0 = 0;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f20573OooO0o = "";

    /* renamed from: OooO0oO, reason: collision with root package name */
    public String f20575OooO0oO = "";

    /* renamed from: OooO0oo, reason: collision with root package name */
    public String f20576OooO0oo = "";

    /* renamed from: OooO, reason: collision with root package name */
    public String f20568OooO = "";

    /* renamed from: OooOO0, reason: collision with root package name */
    public pf0 f20577OooOO0 = pf0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public String f20578OooOO0O = "";
    public String OooOO0o = "";

    /* renamed from: OooOOO0, reason: collision with root package name */
    public String f20580OooOOO0 = "";

    /* renamed from: OooOOO, reason: collision with root package name */
    public boolean f20579OooOOO = false;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public boolean f20581OooOOOO = false;

    public kf0(Context context, int i) {
        this.f20569OooO00o = context;
        this.f20582OooOOOo = i;
    }

    public final synchronized void OooO() {
        Configuration configuration;
        this.f20574OooO0o0 = zzv.zzr().zzm(this.f20569OooO00o);
        Resources resources = this.f20569OooO00o.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f20583OooOOo = i;
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        this.f20570OooO0O0 = SystemClock.elapsedRealtime();
        this.f20581OooOOOO = true;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final jf0 OooO00o(pf0 pf0Var) {
        synchronized (this) {
            this.f20577OooOO0 = pf0Var;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final jf0 OooO0O0(int i) {
        synchronized (this) {
            this.f20584OooOOo0 = i;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.f20575OooO0oO = r0.f20536Ooooo00;
     */
    @Override // com.google.android.gms.internal.ads.jf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.jf0 OooO0OO(com.google.android.gms.internal.ads.C2051sk r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.f24096OooOo     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.md0 r0 = (com.google.android.gms.internal.ads.md0) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.f21205OooO0O0     // Catch: java.lang.Throwable -> L16
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.lang.Object r0 = r3.f24096OooOo     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.md0 r0 = (com.google.android.gms.internal.ads.md0) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.f21205OooO0O0     // Catch: java.lang.Throwable -> L16
            r2.f20573OooO0o = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L3a
        L18:
            java.lang.Object r3 = r3.f24098OooOo0o     // Catch: java.lang.Throwable -> L16
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L16
        L20:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.kd0 r0 = (com.google.android.gms.internal.ads.kd0) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r0.f20536Ooooo00     // Catch: java.lang.Throwable -> L16
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L20
            java.lang.String r3 = r0.f20536Ooooo00     // Catch: java.lang.Throwable -> L16
            r2.f20575OooO0oO = r3     // Catch: java.lang.Throwable -> L16
        L38:
            monitor-exit(r2)
            return r2
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kf0.OooO0OO(com.google.android.gms.internal.ads.sk):com.google.android.gms.internal.ads.jf0");
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final jf0 OooO0Oo(Throwable th) {
        synchronized (this) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0ooo)).booleanValue()) {
                String strZzg = zzf.zzg(C1643hi.OooO0oO(th));
                if (strZzg == null) {
                    strZzg = "";
                }
                this.OooOO0o = strZzg;
                String strOooO0oO = C1643hi.OooO0oO(th);
                ni0 ni0VarOooO0O0 = ni0.OooO0O0(new uk0('\n'));
                strOooO0oO.getClass();
                this.f20578OooOO0O = (String) ((gl0) ((hl0) ni0VarOooO0O0.f21493OooOo0o).OooO0Oo(ni0VarOooO0O0, strOooO0oO)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final jf0 OooO0o(String str) {
        synchronized (this) {
            this.f20576OooO0oo = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final jf0 OooO0o0(String str) {
        synchronized (this) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0ooo)).booleanValue()) {
                this.f20580OooOOO0 = str;
            }
        }
        return this;
    }

    public final synchronized void OooO0oO() {
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        this.f20571OooO0OO = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final jf0 OooO0oo(zze zzeVar) {
        synchronized (this) {
            try {
                IBinder iBinder = zzeVar.zze;
                if (iBinder != null) {
                    BinderC1913ou binderC1913ou = (BinderC1913ou) iBinder;
                    String str = binderC1913ou.f23121OooOoO0;
                    if (!TextUtils.isEmpty(str)) {
                        this.f20573OooO0o = str;
                    }
                    String str2 = binderC1913ou.f23119OooOo0o;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f20575OooO0oO = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final jf0 OooOO0(boolean z) {
        synchronized (this) {
            this.f20572OooO0Oo = z;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final jf0 zze(String str) {
        synchronized (this) {
            this.f20568OooO = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final /* bridge */ /* synthetic */ jf0 zzi() {
        OooO();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final /* bridge */ /* synthetic */ jf0 zzj() {
        OooO0oO();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final synchronized boolean zzk() {
        return this.f20581OooOOOO;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.f20576OooO0oo);
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final synchronized lf0 zzm() {
        try {
            if (this.f20579OooOOO) {
                return null;
            }
            this.f20579OooOOO = true;
            if (!this.f20581OooOOOO) {
                OooO();
            }
            if (this.f20571OooO0OO < 0) {
                OooO0oO();
            }
            return new lf0(this);
        } catch (Throwable th) {
            throw th;
        }
    }
}

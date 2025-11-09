package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.WorkRequest;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class kg0 {

    /* renamed from: OooO */
    public final lg0 f20591OooO;

    /* renamed from: OooO00o */
    public final ClientApi f20592OooO00o;

    /* renamed from: OooO0O0 */
    public final Context f20593OooO0O0;

    /* renamed from: OooO0OO */
    public final int f20594OooO0OO;

    /* renamed from: OooO0Oo */
    public final InterfaceC2156ve f20595OooO0Oo;

    /* renamed from: OooO0o0 */
    public zzft f20597OooO0o0;

    /* renamed from: OooO0oO */
    public final zzcf f20598OooO0oO;

    /* renamed from: OooOO0O */
    public final ScheduledExecutorService f20601OooOO0O;

    /* renamed from: OooOOO */
    public sj0 f20602OooOOO;

    /* renamed from: OooOOOO */
    public final Oooo0OO.o00Ooo f20604OooOOOO;

    /* renamed from: OooOOOo */
    public final /* synthetic */ int f20605OooOOOo;

    /* renamed from: OooO0oo */
    public final ConcurrentLinkedQueue f20599OooO0oo = new ConcurrentLinkedQueue();

    /* renamed from: OooO0o */
    public final AtomicBoolean f20596OooO0o = new AtomicBoolean(true);

    /* renamed from: OooOO0 */
    public final AtomicBoolean f20600OooOO0 = new AtomicBoolean(false);
    public final AtomicBoolean OooOO0o = new AtomicBoolean(true);

    /* renamed from: OooOOO0 */
    public final AtomicBoolean f20603OooOOO0 = new AtomicBoolean(false);

    public kg0(ClientApi clientApi, Context context, int i, InterfaceC2156ve interfaceC2156ve, zzft zzftVar, zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, lg0 lg0Var, Oooo0OO.o00Ooo o00ooo2, int i2) {
        this.f20605OooOOOo = i2;
        this.f20592OooO00o = clientApi;
        this.f20593OooO0O0 = context;
        this.f20594OooO0OO = i;
        this.f20595OooO0Oo = interfaceC2156ve;
        this.f20597OooO0o0 = zzftVar;
        this.f20598OooO0oO = zzcfVar;
        this.f20601OooOO0O = scheduledExecutorService;
        this.f20591OooO = lg0Var;
        this.f20604OooOOOO = o00ooo2;
    }

    public static void OooO0oO(kg0 kg0Var, zze zzeVar) {
        synchronized (kg0Var) {
            kg0Var.f20600OooOO0.set(false);
            int i = zzeVar.zza;
            if (i != 1 && i != 8 && i != 10 && i != 11) {
                kg0Var.OooO0O0(true);
                return;
            }
            zzft zzftVar = kg0Var.f20597OooO0o0;
            zzo.zzi("Preloading " + zzftVar.zzb + ", for adUnitId:" + zzftVar.zza + ", Ad load failed. Stop preloading due to non-retriable error:");
            kg0Var.f20596OooO0o.set(false);
        }
    }

    public final synchronized void OooO() {
        this.f20596OooO0o.set(true);
        this.OooOO0o.set(true);
        this.f20601OooOO0O.submit(new tg0(this, 0));
    }

    public final synchronized void OooO00o() {
        Iterator it = this.f20599OooO0oo.iterator();
        while (it.hasNext()) {
            sg0 sg0Var = (sg0) it.next();
            ((Oooo0OO.oo000o) sg0Var.f24085OooO0OO).getClass();
            if (System.currentTimeMillis() >= sg0Var.f24084OooO0O0 + sg0Var.f24086OooO0Oo) {
                it.remove();
            }
        }
    }

    public final synchronized void OooO0O0(boolean z) {
        try {
            lg0 lg0Var = this.f20591OooO;
            if (lg0Var.f20884OooO0OO <= Math.max(lg0Var.f20885OooO0Oo, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17731OooOoO)).intValue()) || lg0Var.f20887OooO0o0 < lg0Var.f20883OooO0O0) {
                if (z) {
                    lg0 lg0Var2 = this.f20591OooO;
                    double d = lg0Var2.f20887OooO0o0;
                    lg0Var2.f20887OooO0o0 = Math.min((long) (d + d), lg0Var2.f20883OooO0O0);
                    lg0Var2.f20884OooO0OO++;
                }
                ScheduledExecutorService scheduledExecutorService = this.f20601OooOO0O;
                tg0 tg0Var = new tg0(this, 0);
                lg0 lg0Var3 = this.f20591OooO;
                double d2 = lg0Var3.f20887OooO0o0;
                double d3 = 0.2d * d2;
                long j = (long) (d2 + d3);
                scheduledExecutorService.schedule(tg0Var, ((long) (d2 - d3)) + ((long) (lg0Var3.f20886OooO0o.nextDouble() * ((j - r4) + 1))), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final jq0 OooO0OO() {
        switch (this.f20605OooOOOo) {
            case 0:
                jq0 jq0Var = new jq0();
                Oooo0o.OooO0OO oooO0OO = new Oooo0o.OooO0OO(this.f20593OooO0O0);
                zzs zzsVarZzb = zzs.zzb();
                String str = this.f20597OooO0o0.zza;
                int i = this.f20594OooO0OO;
                zzby zzbyVarZzc = this.f20592OooO00o.zzc(oooO0OO, zzsVarZzb, str, this.f20595OooO0Oo, i);
                if (zzbyVarZzc != null) {
                    try {
                        zzbyVarZzc.zzH(new jg0(this, jq0Var, this.f20597OooO0o0));
                        zzbyVarZzc.zzab(this.f20597OooO0o0.zzc);
                    } catch (RemoteException e) {
                        zzo.zzk("Failed to load app open ad.", e);
                        jq0Var.OooO0oO(new ig0());
                    }
                } else {
                    jq0Var.OooO0oO(new ig0());
                }
                return jq0Var;
            case 1:
                jq0 jq0Var2 = new jq0();
                Oooo0o.OooO0OO oooO0OO2 = new Oooo0o.OooO0OO(this.f20593OooO0O0);
                zzs zzsVar = new zzs();
                String str2 = this.f20597OooO0o0.zza;
                int i2 = this.f20594OooO0OO;
                zzby zzbyVarZze = this.f20592OooO00o.zze(oooO0OO2, zzsVar, str2, this.f20595OooO0Oo, i2);
                if (zzbyVarZze != null) {
                    try {
                        zzbyVarZze.zzy(this.f20597OooO0o0.zzc, new mg0(this, jq0Var2, zzbyVarZze));
                    } catch (RemoteException e2) {
                        zzo.zzk("Failed to load interstitial ad.", e2);
                        jq0Var2.OooO0oO(new ig0());
                    }
                } else {
                    jq0Var2.OooO0oO(new ig0());
                }
                return jq0Var2;
            default:
                jq0 jq0Var3 = new jq0();
                Oooo0o.OooO0OO oooO0OO3 = new Oooo0o.OooO0OO(this.f20593OooO0O0);
                String str3 = this.f20597OooO0o0.zza;
                int i3 = this.f20594OooO0OO;
                InterfaceC2050sj interfaceC2050sjZzp = this.f20592OooO00o.zzp(oooO0OO3, str3, this.f20595OooO0Oo, i3);
                wg0 wg0Var = new wg0(this, jq0Var3, interfaceC2050sjZzp);
                if (interfaceC2050sjZzp != null) {
                    try {
                        interfaceC2050sjZzp.zzf(this.f20597OooO0o0.zzc, wg0Var);
                    } catch (RemoteException unused) {
                        zzo.zzj("Failed to load rewarded ad.");
                        jq0Var3.OooO0oO(new ig0());
                    }
                } else {
                    jq0Var3.OooO0oO(new ig0());
                }
                return jq0Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0010, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for the rewarded ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0026, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0027, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for  the interstitial ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x003c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x003d, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for the app open ad.", r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ java.util.Optional OooO0Oo(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.f20605OooOOOo
            switch(r0) {
                case 0: goto L31;
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.sj r2 = (com.google.android.gms.internal.ads.InterfaceC2050sj) r2
            com.google.android.gms.ads.internal.client.zzdy r2 = r2.zzc()     // Catch: android.os.RemoteException -> L10
            java.util.Optional r2 = java.util.Optional.ofNullable(r2)     // Catch: android.os.RemoteException -> L10
            goto L1a
        L10:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for the rewarded ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r0, r2)
            java.util.Optional r2 = java.util.Optional.empty()
        L1a:
            return r2
        L1b:
            com.google.android.gms.ads.internal.client.zzby r2 = (com.google.android.gms.ads.internal.client.zzby) r2
            com.google.android.gms.ads.internal.client.zzdy r2 = r2.zzk()     // Catch: android.os.RemoteException -> L26
            java.util.Optional r2 = java.util.Optional.ofNullable(r2)     // Catch: android.os.RemoteException -> L26
            goto L30
        L26:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for  the interstitial ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r0, r2)
            java.util.Optional r2 = java.util.Optional.empty()
        L30:
            return r2
        L31:
            com.google.android.gms.internal.ads.y3 r2 = (com.google.android.gms.internal.ads.InterfaceC2256y3) r2
            com.google.android.gms.ads.internal.client.zzdy r2 = r2.zzf()     // Catch: android.os.RemoteException -> L3c
            java.util.Optional r2 = java.util.Optional.ofNullable(r2)     // Catch: android.os.RemoteException -> L3c
            goto L46
        L3c:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for the app open ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r0, r2)
            java.util.Optional r2 = java.util.Optional.empty()
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kg0.OooO0Oo(java.lang.Object):java.util.Optional");
    }

    public final synchronized Optional OooO0o() {
        Object obj;
        try {
            synchronized (this) {
                sg0 sg0Var = (sg0) this.f20599OooO0oo.peek();
                obj = sg0Var == null ? null : sg0Var.f24083OooO00o;
            }
            return (obj == null ? Optional.empty() : OooO0Oo(obj)).filter(new ug0(0)).map(new C2177vz(3)).map(new C2177vz(4));
        } catch (Throwable th) {
            throw th;
        }
        return (obj == null ? Optional.empty() : OooO0Oo(obj)).filter(new ug0(0)).map(new C2177vz(3)).map(new C2177vz(4));
    }

    public final synchronized Object OooO0o0() {
        lg0 lg0Var = this.f20591OooO;
        lg0Var.f20887OooO0o0 = lg0Var.f20882OooO00o;
        lg0Var.f20884OooO0OO = 0L;
        sg0 sg0Var = (sg0) this.f20599OooO0oo.poll();
        this.f20603OooOOO0.set(sg0Var != null);
        OooO0oo();
        if (sg0Var == null) {
            return null;
        }
        return sg0Var.f24083OooO00o;
    }

    public final synchronized void OooO0oo() {
        OooO00o();
        OooOO0o();
        if (!this.f20600OooOO0.get() && this.f20596OooO0o.get() && this.f20599OooO0oo.size() < this.f20597OooO0o0.zzd) {
            this.f20600OooOO0.set(true);
            jq0 jq0VarOooO0OO = OooO0OO();
            pd0 pd0Var = new pd0(this, 2);
            jq0VarOooO0OO.addListener(new wp0(0, jq0VarOooO0OO, pd0Var), this.f20601OooOO0O);
        }
    }

    public final synchronized void OooOO0(int i) {
        try {
            Oooo00O.o000000O.OooO0O0(i > 0);
            zzft zzftVar = this.f20597OooO0o0;
            String str = zzftVar.zza;
            int i2 = zzftVar.zzb;
            zzm zzmVar = zzftVar.zzc;
            if (i <= 0) {
                i = zzftVar.zzd;
            }
            this.f20597OooO0o0 = new zzft(str, i2, zzmVar, i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooOO0O(Object obj) {
        Oooo0OO.o00Ooo o00ooo2 = this.f20604OooOOOO;
        sg0 sg0Var = new sg0(obj, o00ooo2);
        this.f20599OooO0oo.add(sg0Var);
        Oooo0OO.o00Ooo o00ooo3 = this.f20604OooOOOO;
        Optional optionalOooO0Oo = OooO0Oo(obj);
        ((Oooo0OO.oo000o) o00ooo3).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new tg0(this, 1));
        this.f20601OooOO0O.execute(new OoooOOO.oOOoOOO0(this, jCurrentTimeMillis, optionalOooO0Oo));
        tg0 tg0Var = new tg0(this, 0);
        long jMin = sg0Var.f24086OooO0Oo + Math.min(Math.max(((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17729OooOo0O)).longValue(), -900000L), WorkRequest.MIN_BACKOFF_MILLIS);
        ((Oooo0OO.oo000o) o00ooo2).getClass();
        this.f20601OooOO0O.schedule(tg0Var, jMin - (System.currentTimeMillis() - sg0Var.f24084OooO0O0), TimeUnit.MILLISECONDS);
    }

    public final synchronized void OooOO0o() {
        if (this.f20603OooOOO0.get() && this.f20599OooO0oo.isEmpty()) {
            this.f20603OooOOO0.set(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new tg0(this, 2));
            this.f20601OooOO0O.execute(new tg0(this, 3));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ic0 extends zzbx implements zzr, InterfaceC2034s3 {

    /* renamed from: OooOo0O */
    public final C2130up f20012OooOo0O;

    /* renamed from: OooOo0o */
    public final Context f20013OooOo0o;

    /* renamed from: OooOoO */
    public final fc0 f20014OooOoO;

    /* renamed from: OooOoO0 */
    public final String f20015OooOoO0;

    /* renamed from: OooOoOO */
    public final ec0 f20016OooOoOO;

    /* renamed from: OooOoo */
    public final h20 f20017OooOoo;

    /* renamed from: OooOoo0 */
    public final VersionInfoParcel f20018OooOoo0;

    /* renamed from: OooOooo */
    public C2132ur f20020OooOooo;

    /* renamed from: Oooo000 */
    public C2317zr f20021Oooo000;

    /* renamed from: OooOo */
    public AtomicBoolean f20011OooOo = new AtomicBoolean();

    /* renamed from: OooOooO */
    public long f20019OooOooO = -1;

    public ic0(C2130up c2130up, Context context, String str, fc0 fc0Var, ec0 ec0Var, VersionInfoParcel versionInfoParcel, h20 h20Var) {
        this.f20012OooOo0O = c2130up;
        this.f20013OooOo0o = context;
        this.f20015OooOoO0 = str;
        this.f20014OooOoO = fc0Var;
        this.f20016OooOoOO = ec0Var;
        this.f20018OooOoo0 = versionInfoParcel;
        this.f20017OooOoo = h20Var;
        ec0Var.f18566OooOoOO.set(this);
    }

    public final synchronized void o000O0O0(int i) {
        try {
            if (this.f20011OooOo.compareAndSet(false, true)) {
                this.f20016OooOoOO.OooO0o();
                C2132ur c2132ur = this.f20020OooOooo;
                if (c2132ur != null) {
                    C1775l3 c1775l3Zzb = zzv.zzb();
                    synchronized (c1775l3Zzb.f20780OooO00o) {
                        try {
                            C1701j3 c1701j3 = c1775l3Zzb.f20781OooO0O0;
                            if (c1701j3 != null) {
                                synchronized (c1701j3.f20161OooOo) {
                                    c1701j3.f20166OooOoOO.remove(c2132ur);
                                }
                            }
                        } finally {
                        }
                    }
                }
                if (this.f20021Oooo000 != null) {
                    long jElapsedRealtime = -1;
                    if (this.f20019OooOooO != -1) {
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20019OooOooO;
                    }
                    this.f20021Oooo000.OooO0Oo(i, jElapsedRealtime);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        Oooo00O.o000000O.OooO0Oo("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(zzs zzsVar) {
        Oooo00O.o000000O.OooO0Oo("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(InterfaceC1409b4 interfaceC1409b4) {
        this.f20016OooOoOO.f18563OooOo0o.set(interfaceC1409b4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
        this.f20014OooOoO.f18913OooO.f24624OooO = zzyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(InterfaceC2085th interfaceC2085th) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(InterfaceC1779l7 interfaceC1779l7) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(InterfaceC2159vh interfaceC2159vh, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(InterfaceC1681ij interfaceC1681ij) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzU(zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x000f  */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzZ() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.fc0 r0 = r1.f20014OooOoO     // Catch: java.lang.Throwable -> L12
            o00000oO.OooOOO r0 = r0.f18922OooOO0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ic0.zzZ():boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.zzb()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1559f8.f18805OooO0Oo     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.OooOOO()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.o0ooOOoo     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.OooO00o(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L95
        L2f:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.f20018OooOoo0     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.clientJarVersion     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.v6 r3 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOo0o     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.a7 r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.OooO00o(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            Oooo00O.o000000O.OooO0Oo(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.f20013OooOo0o     // Catch: java.lang.Throwable -> L2d
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzI(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6e
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5c
            goto L6e
        L5c:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.ec0 r6 = r5.f20016OooOoOO     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.af0.Oooo0O0(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.o0OOO0o(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L6e:
            boolean r0 = r5.zzZ()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L76
            monitor-exit(r5)
            return r1
        L76:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.f20011OooOo = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.hc0 r0 = new com.google.android.gms.internal.ads.hc0     // Catch: java.lang.Throwable -> L2d
            r1 = 24
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.fc0 r1 = r5.f20014OooOoO     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.f20015OooOoO0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.wj0 r3 = new com.google.android.gms.internal.ads.wj0     // Catch: java.lang.Throwable -> L2d
            r4 = 28
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.OooO00o(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ic0.zzab(com.google.android.gms.ads.internal.client.zzm):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        if (this.f20021Oooo000 != null) {
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            this.f20019OooOooO = SystemClock.elapsedRealtime();
            int i = this.f20021Oooo000.f26362OooOO0O;
            if (i > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f20012OooOo0O.f24678OooO0Oo.zzb();
                Oooo0OO.o00Ooo o00oooZzC = zzv.zzC();
                C2132ur c2132ur = new C2132ur(scheduledExecutorService, o00oooZzC);
                this.f20020OooOooo = c2132ur;
                gc0 gc0Var = new gc0(this, 1);
                synchronized (c2132ur) {
                    c2132ur.f24769OooO0o = gc0Var;
                    ((Oooo0OO.oo000o) o00oooZzC).getClass();
                    long j = i;
                    c2132ur.f24768OooO0Oo = SystemClock.elapsedRealtime() + j;
                    c2132ur.f24767OooO0OO = scheduledExecutorService.schedule(gc0Var, j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        C2317zr c2317zr = this.f20021Oooo000;
        if (c2317zr != null) {
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            c2317zr.OooO0Oo(1, SystemClock.elapsedRealtime() - this.f20019OooOooO);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            o000O0O0(2);
            return;
        }
        if (i2 == 1) {
            o000O0O0(4);
        } else if (i2 != 2) {
            o000O0O0(6);
        } else {
            o000O0O0(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Oooo0o.OooO0O0 zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.f20015OooOoO0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        Oooo00O.o000000O.OooO0Oo("destroy must be called on the main UI thread.");
        C2317zr c2317zr = this.f20021Oooo000;
        if (c2317zr != null) {
            c2317zr.OooO0O0();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        Oooo00O.o000000O.OooO0Oo("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(Oooo0o.OooO0O0 oooO0O0) {
    }
}

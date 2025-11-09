package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class b90 extends zzbx implements InterfaceC2025rv {

    /* renamed from: OooOo */
    public final String f17453OooOo;

    /* renamed from: OooOo0O */
    public final Context f17454OooOo0O;

    /* renamed from: OooOo0o */
    public final jc0 f17455OooOo0o;

    /* renamed from: OooOoO */
    public zzs f17456OooOoO;

    /* renamed from: OooOoO0 */
    public final c90 f17457OooOoO0;

    /* renamed from: OooOoOO */
    public final ud0 f17458OooOoOO;

    /* renamed from: OooOoo */
    public final h20 f17459OooOoo;

    /* renamed from: OooOoo0 */
    public final VersionInfoParcel f17460OooOoo0;

    /* renamed from: OooOooO */
    public AbstractC1433bs f17461OooOooO;

    public b90(Context context, zzs zzsVar, String str, jc0 jc0Var, c90 c90Var, VersionInfoParcel versionInfoParcel, h20 h20Var) {
        this.f17454OooOo0O = context;
        this.f17455OooOo0o = jc0Var;
        this.f17456OooOoO = zzsVar;
        this.f17453OooOo = str;
        this.f17457OooOoO0 = c90Var;
        this.f17458OooOoOO = jc0Var.f20282OooOO0O;
        this.f17460OooOoo0 = versionInfoParcel;
        this.f17459OooOoo = h20Var;
        jc0Var.f20280OooO0oo.o00000o0(this, jc0Var.f20274OooO0O0);
    }

    public final synchronized boolean o000O0O0(zzm zzmVar) {
        try {
            if (o000O0o0()) {
                Oooo00O.o000000O.OooO0Oo("loadAd must be called on the main UI thread.");
            }
            zzv.zzq();
            if (!com.google.android.gms.ads.internal.util.zzs.zzI(this.f17454OooOo0O) || zzmVar.zzs != null) {
                ze0.OooO(this.f17454OooOo0O, zzmVar.zzf);
                return this.f17455OooOo0o.OooO0O0(zzmVar, this.f17453OooOo, null, new sj0(this, 25));
            }
            zzo.zzg("Failed to load the ad because app ID is missing.");
            c90 c90Var = this.f17457OooOoO0;
            if (c90Var != null) {
                c90Var.o0OOO0o(af0.Oooo0O0(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o000O0o0() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1559f8.f18806OooO0o
            java.lang.Object r0 = r0.OooOOO()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.o0ooOOoo
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.OooO00o(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r6.f17460OooOoo0
            int r3 = r3.clientJarVersion
            com.google.android.gms.internal.ads.v6 r4 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOo0o
            com.google.android.gms.internal.ads.a7 r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.OooO00o(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b90.o000O0o0():boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
        Oooo00O.o000000O.OooO0Oo("recordManualImpression must be called on the main UI thread.");
        AbstractC1433bs abstractC1433bs = this.f17461OooOooO;
        if (abstractC1433bs != null) {
            abstractC1433bs.OooO0oo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:27:0x0001, B:29:0x000f, B:31:0x0021, B:37:0x003f, B:39:0x0043, B:36:0x003a), top: B:46:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1559f8.f18809OooO0oo     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.OooOOO()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOOo0     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.a7 r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.OooO00o(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.f17460OooOoo0     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOo     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.OooO00o(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L55
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            Oooo00O.o000000O.OooO0Oo(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.bs r0 = r3.f17461OooOooO     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L53
            com.google.android.gms.internal.ads.cv r0 = r0.f17101OooO0OO     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.b7 r1 = new com.google.android.gms.internal.ads.b7     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            r0.o0000Ooo(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L53:
            monitor-exit(r3)
            return
        L55:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b90.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
        if (o000O0o0()) {
            Oooo00O.o000000O.OooO0Oo("setAdListener must be called on the main UI thread.");
        }
        e90 e90Var = this.f17455OooOo0o.f20278OooO0o0;
        synchronized (e90Var) {
            e90Var.f18524OooOo0O = zzbiVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
        if (o000O0o0()) {
            Oooo00O.o000000O.OooO0Oo("setAdListener must be called on the main UI thread.");
        }
        this.f17457OooOoO0.f17967OooOo0O.set(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        Oooo00O.o000000O.OooO0Oo("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(zzs zzsVar) {
        Oooo00O.o000000O.OooO0Oo("setAdSize must be called on the main UI thread.");
        this.f17458OooOoOO.f24626OooO0O0 = zzsVar;
        this.f17456OooOoO = zzsVar;
        AbstractC1433bs abstractC1433bs = this.f17461OooOooO;
        if (abstractC1433bs != null) {
            abstractC1433bs.OooO(this.f17455OooOo0o.f20277OooO0o, zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
        if (o000O0o0()) {
            Oooo00O.o000000O.OooO0Oo("setAppEventListener must be called on the main UI thread.");
        }
        this.f17457OooOoO0.OooOO0(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(InterfaceC1409b4 interfaceC1409b4) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
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
        try {
            if (o000O0o0()) {
                Oooo00O.o000000O.OooO0Oo("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f17458OooOoOO.f24630OooO0o0 = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(InterfaceC1779l7 interfaceC1779l7) {
        Oooo00O.o000000O.OooO0Oo("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f17455OooOo0o.f20279OooO0oO = interfaceC1779l7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
        if (o000O0o0()) {
            Oooo00O.o000000O.OooO0Oo("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdrVar.zzf()) {
                this.f17459OooOoo.OooO0O0();
            }
        } catch (RemoteException e) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f17457OooOoO0.f17966OooOo.set(zzdrVar);
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
        try {
            if (o000O0o0()) {
                Oooo00O.o000000O.OooO0Oo("setVideoOptions must be called on the main UI thread.");
            }
            this.f17458OooOoOO.f24628OooO0Oo = zzgaVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        AbstractC1433bs abstractC1433bs = this.f17461OooOooO;
        if (abstractC1433bs != null) {
            if (abstractC1433bs.f17100OooO0O0.f20551o00ooo) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.f17455OooOo0o.OooO00o();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(zzm zzmVar) {
        zzs zzsVar = this.f17456OooOoO;
        synchronized (this) {
            ud0 ud0Var = this.f17458OooOoOO;
            ud0Var.f24626OooO0O0 = zzsVar;
            ud0Var.f24640OooOOo0 = this.f17456OooOoO.zzn;
        }
        return o000O0O0(zzmVar);
        return o000O0O0(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(zzcq zzcqVar) {
        Oooo00O.o000000O.OooO0Oo("setCorrelationIdProvider must be called on the main UI thread");
        this.f17458OooOoOO.OooOo0 = zzcqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        Oooo00O.o000000O.OooO0Oo("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzs zzg() {
        Oooo00O.o000000O.OooO0Oo("getAdSize must be called on the main UI thread.");
        AbstractC1433bs abstractC1433bs = this.f17461OooOooO;
        if (abstractC1433bs != null) {
            return ze0.OooO0o(this.f17454OooOo0O, Collections.singletonList(abstractC1433bs.OooO0o()));
        }
        return this.f17458OooOoOO.f24626OooO0O0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return this.f17457OooOoO0.OooO0o();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        zzcm zzcmVar;
        c90 c90Var = this.f17457OooOoO0;
        synchronized (c90Var) {
            zzcmVar = (zzcm) c90Var.f17968OooOo0o.get();
        }
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzdy zzk() {
        AbstractC1433bs abstractC1433bs;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO00O)).booleanValue() && (abstractC1433bs = this.f17461OooOooO) != null) {
            return abstractC1433bs.f17103OooO0o;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzeb zzl() {
        Oooo00O.o000000O.OooO0Oo("getVideoController must be called from the main thread.");
        AbstractC1433bs abstractC1433bs = this.f17461OooOooO;
        if (abstractC1433bs == null) {
            return null;
        }
        return abstractC1433bs.OooO0o0();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Oooo0o.OooO0O0 zzn() {
        if (o000O0o0()) {
            Oooo00O.o000000O.OooO0Oo("getAdFrame must be called on the main UI thread.");
        }
        return new Oooo0o.OooO0OO(this.f17455OooOo0o.f20277OooO0o);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.f17453OooOo;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzs() {
        BinderC1913ou binderC1913ou;
        AbstractC1433bs abstractC1433bs = this.f17461OooOooO;
        if (abstractC1433bs == null || (binderC1913ou = abstractC1433bs.f17103OooO0o) == null) {
            return null;
        }
        return binderC1913ou.f23118OooOo0O;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzt() {
        BinderC1913ou binderC1913ou;
        AbstractC1433bs abstractC1433bs = this.f17461OooOooO;
        if (abstractC1433bs == null || (binderC1913ou = abstractC1433bs.f17103OooO0o) == null) {
            return null;
        }
        return binderC1913ou.f23118OooOo0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:27:0x0001, B:29:0x000f, B:31:0x0021, B:37:0x003f, B:39:0x0043, B:36:0x003a), top: B:46:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1559f8.f18807OooO0o0     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.OooOOO()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOOo     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.a7 r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.OooO00o(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.f17460OooOoo0     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOo     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.OooO00o(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L55
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            Oooo00O.o000000O.OooO0Oo(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.bs r0 = r3.f17461OooOooO     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L53
            com.google.android.gms.internal.ads.cv r0 = r0.f17101OooO0OO     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.v8 r1 = new com.google.android.gms.internal.ads.v8     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            r0.o0000Ooo(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L53:
            monitor-exit(r3)
            return
        L55:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b90.zzx():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:27:0x0001, B:29:0x000f, B:31:0x0021, B:37:0x003f, B:39:0x0043, B:36:0x003a), top: B:46:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1559f8.f18808OooO0oO     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.OooOOO()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOo00     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.a7 r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.OooO00o(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r4.f17460OooOoo0     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOo     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.OooO00o(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L56
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            Oooo00O.o000000O.OooO0Oo(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.bs r0 = r4.f17461OooOooO     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L54
            com.google.android.gms.internal.ads.cv r0 = r0.f17101OooO0OO     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.u6 r1 = new com.google.android.gms.internal.ads.u6     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L38
            r0.o0000Ooo(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)
            return
        L56:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b90.zzz():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(Oooo0o.OooO0O0 oooO0O0) {
    }
}

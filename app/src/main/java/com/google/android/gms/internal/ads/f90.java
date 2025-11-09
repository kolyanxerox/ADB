package com.google.android.gms.internal.ads;

import android.app.Activity;
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

/* loaded from: classes2.dex */
public final class f90 extends zzbx {

    /* renamed from: OooOo */
    public final yc0 f18891OooOo;

    /* renamed from: OooOo0O */
    public final zzs f18892OooOo0O;

    /* renamed from: OooOo0o */
    public final Context f18893OooOo0o;

    /* renamed from: OooOoO */
    public final VersionInfoParcel f18894OooOoO;

    /* renamed from: OooOoO0 */
    public final String f18895OooOoO0;

    /* renamed from: OooOoOO */
    public final c90 f18896OooOoOO;

    /* renamed from: OooOoo */
    public final C1663i1 f18897OooOoo;

    /* renamed from: OooOoo0 */
    public final bd0 f18898OooOoo0;

    /* renamed from: OooOooO */
    public final h20 f18899OooOooO;

    /* renamed from: OooOooo */
    public C1768kx f18900OooOooo;

    /* renamed from: Oooo000 */
    public boolean f18901Oooo000 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17781o00000oo)).booleanValue();

    public f90(Context context, zzs zzsVar, String str, yc0 yc0Var, c90 c90Var, bd0 bd0Var, VersionInfoParcel versionInfoParcel, C1663i1 c1663i1, h20 h20Var) {
        this.f18892OooOo0O = zzsVar;
        this.f18895OooOoO0 = str;
        this.f18893OooOo0o = context;
        this.f18891OooOo = yc0Var;
        this.f18896OooOoOO = c90Var;
        this.f18898OooOoo0 = bd0Var;
        this.f18894OooOoO = versionInfoParcel;
        this.f18897OooOoo = c1663i1;
        this.f18899OooOooO = h20Var;
    }

    public final synchronized boolean o000O0O0() {
        C1768kx c1768kx = this.f18900OooOooo;
        if (c1768kx != null) {
            if (!c1768kx.f20706OooOOO.f20950OooOo0o.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        Oooo00O.o000000O.OooO0Oo("resume must be called on the main UI thread.");
        C1768kx c1768kx = this.f18900OooOooo;
        if (c1768kx != null) {
            C1472cv c1472cv = c1768kx.f17101OooO0OO;
            c1472cv.getClass();
            c1472cv.o0000Ooo(new C1412b7(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
        Oooo00O.o000000O.OooO0Oo("setAdListener must be called on the main UI thread.");
        this.f18896OooOoOO.f17967OooOo0O.set(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        Oooo00O.o000000O.OooO0Oo("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
        Oooo00O.o000000O.OooO0Oo("setAppEventListener must be called on the main UI thread.");
        this.f18896OooOoOO.OooOO0(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(InterfaceC1409b4 interfaceC1409b4) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) {
        this.f18896OooOoOO.f17969OooOoO.set(zzctVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzL(boolean z) {
        Oooo00O.o000000O.OooO0Oo("setImmersiveMode must be called on the main UI thread.");
        this.f18901Oooo000 = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(InterfaceC2085th interfaceC2085th) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(InterfaceC1779l7 interfaceC1779l7) {
        Oooo00O.o000000O.OooO0Oo("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f18891OooOo.f25901OooO0o = interfaceC1779l7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
        Oooo00O.o000000O.OooO0Oo("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.f18899OooOooO.OooO0O0();
            }
        } catch (RemoteException e) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f18896OooOoOO.f17966OooOo.set(zzdrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(InterfaceC2159vh interfaceC2159vh, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(InterfaceC1681ij interfaceC1681ij) {
        this.f18898OooOoo0.f17481OooOoO.set(interfaceC1681ij);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzW(Oooo0o.OooO0O0 oooO0O0) {
        if (this.f18900OooOooo == null) {
            zzo.zzj("Interstitial can not be shown before loaded.");
            this.f18896OooOoOO.OooO0o0(af0.Oooo0O0(9, null, null));
            return;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17875o00O0Oo0)).booleanValue()) {
            this.f18897OooOoo.f19893OooO0O0.zzn(new Throwable().getStackTrace());
        }
        this.f18900OooOooo.OooO0O0((Activity) Oooo0o.OooO0OO.o000O0oO(oooO0O0), this.f18901Oooo000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
        Oooo00O.o000000O.OooO0Oo("showInterstitial must be called on the main UI thread.");
        if (this.f18900OooOooo == null) {
            zzo.zzj("Interstitial can not be shown before loaded.");
            this.f18896OooOoOO.OooO0o0(af0.Oooo0O0(9, null, null));
        } else {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17875o00O0Oo0)).booleanValue()) {
                this.f18897OooOoo.f19893OooO0O0.zzn(new Throwable().getStackTrace());
            }
            this.f18900OooOooo.OooO0O0(null, this.f18901Oooo000);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.f18891OooOo.OooO00o();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzaa() {
        Oooo00O.o000000O.OooO0Oo("isLoaded must be called on the main UI thread.");
        return o000O0O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x002b  */
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
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1559f8.f18801OooO     // Catch: java.lang.Throwable -> L2d
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
            goto L97
        L2f:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.f18894OooOoO     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.f18893OooOo0o     // Catch: java.lang.Throwable -> L2d
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzI(r0)     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            if (r0 == 0) goto L6e
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L6e
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.c90 r6 = r5.f18896OooOoOO     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L95
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.af0.Oooo0O0(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.o0OOO0o(r0)     // Catch: java.lang.Throwable -> L2d
            goto L95
        L6e:
            boolean r0 = r5.o000O0O0()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L95
            android.content.Context r0 = r5.f18893OooOo0o     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.ze0.OooO(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.f18900OooOooo = r2     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.yc0 r0 = r5.f18891OooOo     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.f18895OooOoO0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.ads.internal.client.zzs r2 = r5.f18892OooOo0O     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.vc0 r3 = new com.google.android.gms.internal.ads.vc0     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.wj0 r2 = new com.google.android.gms.internal.ads.wj0     // Catch: java.lang.Throwable -> L2d
            r4 = 27
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.OooO0O0(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L95:
            monitor-exit(r5)
            return r1
        L97:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f90.zzab(com.google.android.gms.ads.internal.client.zzm):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        Oooo00O.o000000O.OooO0Oo("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return this.f18896OooOoOO.OooO0o();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        zzcm zzcmVar;
        c90 c90Var = this.f18896OooOoOO;
        synchronized (c90Var) {
            zzcmVar = (zzcm) c90Var.f17968OooOo0o.get();
        }
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized zzdy zzk() {
        C1768kx c1768kx;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO00O)).booleanValue() && (c1768kx = this.f18900OooOooo) != null) {
            return c1768kx.f17103OooO0o;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Oooo0o.OooO0O0 zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.f18895OooOoO0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzs() {
        BinderC1913ou binderC1913ou;
        C1768kx c1768kx = this.f18900OooOooo;
        if (c1768kx == null || (binderC1913ou = c1768kx.f17103OooO0o) == null) {
            return null;
        }
        return binderC1913ou.f23118OooOo0O;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzt() {
        BinderC1913ou binderC1913ou;
        C1768kx c1768kx = this.f18900OooOooo;
        if (c1768kx == null || (binderC1913ou = c1768kx.f17103OooO0o) == null) {
            return null;
        }
        return binderC1913ou.f23118OooOo0O;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        Oooo00O.o000000O.OooO0Oo("destroy must be called on the main UI thread.");
        C1768kx c1768kx = this.f18900OooOooo;
        if (c1768kx != null) {
            C1472cv c1472cv = c1768kx.f17101OooO0OO;
            c1472cv.getClass();
            c1472cv.o0000Ooo(new C2150v8(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) {
        this.f18896OooOoOO.f17970OooOoO0.set(zzboVar);
        zzab(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        Oooo00O.o000000O.OooO0Oo("pause must be called on the main UI thread.");
        C1768kx c1768kx = this.f18900OooOooo;
        if (c1768kx != null) {
            C1472cv c1472cv = c1768kx.f17101OooO0OO;
            c1472cv.getClass();
            c1472cv.o0000Ooo(new C2111u6(null, false));
        }
    }
}

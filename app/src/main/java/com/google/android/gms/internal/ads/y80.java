package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class y80 extends zzbx {

    /* renamed from: OooOo, reason: collision with root package name */
    public final vd0 f25865OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f25866OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final zzbl f25867OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final FrameLayout f25868OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final C1505ds f25869OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final h20 f25870OooOoOO;

    public y80(Context context, zzbl zzblVar, vd0 vd0Var, C1505ds c1505ds, h20 h20Var) {
        this.f25866OooOo0O = context;
        this.f25867OooOo0o = zzblVar;
        this.f25865OooOo = vd0Var;
        this.f25869OooOoO0 = c1505ds;
        this.f25870OooOoOO = h20Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        zzv.zzq();
        frameLayout.addView(c1505ds.f18397OooOO0O, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.f25868OooOoO = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
        this.f25869OooOoO0.OooO0oo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() {
        Oooo00O.o000000O.OooO0Oo("destroy must be called on the main UI thread.");
        C1472cv c1472cv = this.f25869OooOoO0.f17101OooO0OO;
        c1472cv.getClass();
        c1472cv.o0000Ooo(new C1412b7(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) {
        zzo.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) {
        zzo.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        zzo.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzsVar) {
        Oooo00O.o000000O.OooO0Oo("setAdSize must be called on the main UI thread.");
        C1505ds c1505ds = this.f25869OooOoO0;
        if (c1505ds != null) {
            c1505ds.OooO(this.f25868OooOoO, zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) {
        c90 c90Var = this.f25865OooOo.f24953OooO0OO;
        if (c90Var != null) {
            c90Var.OooOO0(zzcmVar);
        }
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
    public final void zzN(boolean z) {
        zzo.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(InterfaceC1779l7 interfaceC1779l7) {
        zzo.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo0Oo)).booleanValue()) {
            zzo.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        c90 c90Var = this.f25865OooOo.f24953OooO0OO;
        if (c90Var != null) {
            try {
                if (!zzdrVar.zzf()) {
                    this.f25870OooOoOO.OooO0O0();
                }
            } catch (RemoteException e) {
                zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            c90Var.f17966OooOo.set(zzdrVar);
        }
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
    public final void zzU(zzga zzgaVar) {
        zzo.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() {
        C1505ds c1505ds = this.f25869OooOoO0;
        return c1505ds != null && c1505ds.f17100OooO0O0.f20551o00ooo;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzmVar) {
        zzo.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) {
        zzo.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        zzo.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        Oooo00O.o000000O.OooO0Oo("getAdSize must be called on the main UI thread.");
        return ze0.OooO0o(this.f25866OooOo0O, Collections.singletonList(this.f25869OooOoO0.OooO0o()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return this.f25867OooOo0o;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        return this.f25865OooOo.f24961OooOOO;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() {
        return this.f25869OooOoO0.f17103OooO0o;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() {
        return this.f25869OooOoO0.OooO0o0();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Oooo0o.OooO0O0 zzn() {
        return new Oooo0o.OooO0OO(this.f25868OooOoO);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        return this.f25865OooOo.f24955OooO0o;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzs() {
        return this.f25869OooOoO0.f17103OooO0o.f23118OooOo0O;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzt() {
        return this.f25869OooOoO0.f17103OooO0o.f23118OooOo0O;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() {
        Oooo00O.o000000O.OooO0Oo("destroy must be called on the main UI thread.");
        C1472cv c1472cv = this.f25869OooOoO0.f17101OooO0OO;
        c1472cv.getClass();
        c1472cv.o0000Ooo(new C2150v8(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() {
        Oooo00O.o000000O.OooO0Oo("destroy must be called on the main UI thread.");
        C1472cv c1472cv = this.f25869OooOoO0.f17101OooO0OO;
        c1472cv.getClass();
        c1472cv.o0000Ooo(new C2111u6(null, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(Oooo0o.OooO0O0 oooO0O0) {
    }
}

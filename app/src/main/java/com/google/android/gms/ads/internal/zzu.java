package com.google.android.gms.ads.internal;

import OooO0oO.OooOo;
import Oooo00O.o000000O;
import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
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
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.AbstractC2149v7;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1663i1;
import com.google.android.gms.internal.ads.InterfaceC1409b4;
import com.google.android.gms.internal.ads.InterfaceC1681ij;
import com.google.android.gms.internal.ads.InterfaceC1779l7;
import com.google.android.gms.internal.ads.InterfaceC2085th;
import com.google.android.gms.internal.ads.InterfaceC2159vh;
import o00000oO.OooOOO;

/* loaded from: classes2.dex */
public final class zzu extends zzbx {

    /* renamed from: OooOo, reason: collision with root package name */
    public final OooOOO f16353OooOo = AbstractC2200wl.f25321OooO00o.OooO0O0(new zzq(this));

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final VersionInfoParcel f16354OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.client.zzs f16355OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final zzs f16356OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Context f16357OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public WebView f16358OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public C1663i1 f16359OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public zzbl f16360OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public AsyncTask f16361OooOooO;

    public zzu(Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, VersionInfoParcel versionInfoParcel) {
        this.f16357OooOoO0 = context;
        this.f16354OooOo0O = versionInfoParcel;
        this.f16355OooOo0o = zzsVar;
        this.f16358OooOoOO = new WebView(context);
        this.f16356OooOoO = new zzs(context, str);
        o000O0O0(0);
        this.f16358OooOoOO.setVerticalScrollBarEnabled(false);
        this.f16358OooOoOO.getSettings().setJavaScriptEnabled(true);
        this.f16358OooOoOO.setWebViewClient(new zzo(this));
        this.f16358OooOoOO.setOnTouchListener(new zzp(this));
    }

    public final void o000O0O0(int i) {
        if (this.f16358OooOoOO == null) {
            return;
        }
        this.f16358OooOoOO.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws RemoteException {
        o000000O.OooO0Oo("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) throws RemoteException {
        this.f16360OooOoo0 = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(InterfaceC1409b4 interfaceC1409b4) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(InterfaceC2085th interfaceC2085th) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(InterfaceC1779l7 interfaceC1779l7) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(InterfaceC2159vh interfaceC2159vh, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(InterfaceC1681ij interfaceC1681ij) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzgaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        o000000O.OooO(this.f16358OooOoOO, "This Search Ad has already been torn down");
        this.f16356OooOoO.zzf(zzmVar, this.f16354OooOo0O);
        this.f16361OooOooO = new zzr(this).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() throws RemoteException {
        return this.f16355OooOo0o;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final OooO0O0 zzn() throws RemoteException {
        o000000O.OooO0Oo("getAdFrame must be called on the main UI thread.");
        return new OooO0OO(this.f16358OooOoOO);
    }

    public final String zzq() {
        String strZzb = this.f16356OooOoO.zzb();
        if (true == TextUtils.isEmpty(strZzb)) {
            strZzb = "www.google.com";
        }
        return OooOo.OooOO0O("https://", strZzb, (String) AbstractC2149v7.f24870OooO0Oo.OooOOO());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzt() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws RemoteException {
        o000000O.OooO0Oo("destroy must be called on the main UI thread.");
        this.f16361OooOooO.cancel(true);
        this.f16353OooOo.cancel(false);
        this.f16358OooOoOO.destroy();
        this.f16358OooOoOO = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws RemoteException {
        o000000O.OooO0Oo("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(OooO0O0 oooO0O0) {
    }
}

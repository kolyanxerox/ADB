package com.google.android.gms.ads.internal.overlay;

import Oooo0o.OooO0O0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.AbstractBinderC1826mh;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.InterfaceC1401ax;

/* loaded from: classes2.dex */
public final class zzab extends AbstractBinderC1826mh {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AdOverlayInfoParcel f16116OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Activity f16117OooOo0o;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f16115OooOo = false;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f16119OooOoO0 = false;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f16118OooOoO = false;

    public zzab(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f16116OooOo0O = adOverlayInfoParcel;
        this.f16117OooOo0o = activity;
    }

    public final synchronized void o000O0O0() {
        try {
            if (this.f16119OooOoO0) {
                return;
            }
            zzr zzrVar = this.f16116OooOo0O.zzc;
            if (zzrVar != null) {
                zzrVar.zzds(4);
            }
            this.f16119OooOoO0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final boolean zzH() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzl(@Nullable Bundle bundle) {
        zzr zzrVar;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO00o)).booleanValue();
        Activity activity = this.f16117OooOo0o;
        if (zBooleanValue && !this.f16118OooOoO) {
            activity.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16116OooOo0O;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            InterfaceC1401ax interfaceC1401ax = adOverlayInfoParcel.zzu;
            if (interfaceC1401ax != null) {
                interfaceC1401ax.Oooo000();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzdp();
            }
        }
        com.google.android.gms.ads.internal.zzv.zzi();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zza.zzb(this.f16117OooOo0o, zzcVar, adOverlayInfoParcel.zzi, zzcVar.zzi, null, "")) {
            return;
        }
        activity.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzm() throws RemoteException {
        if (this.f16117OooOo0o.isFinishing()) {
            o000O0O0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzo() throws RemoteException {
        zzr zzrVar = this.f16116OooOo0O.zzc;
        if (zzrVar != null) {
            zzrVar.zzdi();
        }
        if (this.f16117OooOo0o.isFinishing()) {
            o000O0O0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzp(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzr() throws RemoteException {
        if (this.f16115OooOo) {
            this.f16117OooOo0o.finish();
            return;
        }
        this.f16115OooOo = true;
        zzr zzrVar = this.f16116OooOo0O.zzc;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f16115OooOo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzu() throws RemoteException {
        if (this.f16117OooOo0o.isFinishing()) {
            o000O0O0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzv() throws RemoteException {
        zzr zzrVar = this.f16116OooOo0O.zzc;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzx() throws RemoteException {
        this.f16118OooOoO = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzk(OooO0O0 oooO0O0) throws RemoteException {
    }
}

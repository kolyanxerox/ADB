package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.hd */
/* loaded from: classes2.dex */
public final class C1638hd extends AdManagerInterstitialAd {

    /* renamed from: OooO */
    public OnPaidEventListener f19695OooO;

    /* renamed from: OooO00o */
    public final Context f19696OooO00o;

    /* renamed from: OooO0O0 */
    public final zzr f19697OooO0O0;

    /* renamed from: OooO0OO */
    public final zzby f19698OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f19699OooO0Oo;

    /* renamed from: OooO0o */
    public final long f19700OooO0o;

    /* renamed from: OooO0o0 */
    public final BinderC2082te f19701OooO0o0;

    /* renamed from: OooO0oO */
    public AppEventListener f19702OooO0oO;

    /* renamed from: OooO0oo */
    public FullScreenContentCallback f19703OooO0oo;

    public C1638hd(Context context, String str) {
        BinderC2082te binderC2082te = new BinderC2082te();
        this.f19701OooO0o0 = binderC2082te;
        this.f19700OooO0o = System.currentTimeMillis();
        this.f19696OooO00o = context;
        this.f19699OooO0Oo = str;
        this.f19697OooO0O0 = zzr.zza;
        this.f19698OooO0OO = zzbc.zza().zzf(context, new zzs(), str, binderC2082te);
    }

    public final void OooO00o(zzei zzeiVar, AdLoadCallback adLoadCallback) {
        zzby zzbyVar = this.f19698OooO0OO;
        if (zzbyVar != null) {
            try {
                zzeiVar.zzq(this.f19700OooO0o);
                zzbyVar.zzy(this.f19697OooO0O0.zza(this.f19696OooO00o, zzeiVar), new zzh(adLoadCallback, this));
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
            }
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.f19699OooO0Oo;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.f19702OooO0oO;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f19703OooO0oo;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f19695OooO;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzk = null;
        try {
            zzby zzbyVar = this.f19698OooO0OO;
            if (zzbyVar != null) {
                zzdyVarZzk = zzbyVar.zzk();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdyVarZzk);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f19702OooO0oO = appEventListener;
            zzby zzbyVar = this.f19698OooO0OO;
            if (zzbyVar != null) {
                zzbyVar.zzG(appEventListener != null ? new BinderC1628h3(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f19703OooO0oo = fullScreenContentCallback;
            zzby zzbyVar = this.f19698OooO0OO;
            if (zzbyVar != null) {
                zzbyVar.zzJ(new zzbf(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzby zzbyVar = this.f19698OooO0OO;
            if (zzbyVar != null) {
                zzbyVar.zzL(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f19695OooO = onPaidEventListener;
            zzby zzbyVar = this.f19698OooO0OO;
            if (zzbyVar != null) {
                zzbyVar.zzP(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzby zzbyVar = this.f19698OooO0OO;
            if (zzbyVar != null) {
                zzbyVar.zzW(new Oooo0o.OooO0OO(activity));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public C1638hd(Context context, String str, zzby zzbyVar) {
        this.f19701OooO0o0 = new BinderC2082te();
        this.f19700OooO0o = System.currentTimeMillis();
        this.f19696OooO00o = context;
        this.f19699OooO0Oo = str;
        this.f19697OooO0O0 = zzr.zza;
        this.f19698OooO0OO = zzbyVar;
    }
}

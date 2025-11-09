package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* loaded from: classes2.dex */
public final class zzg extends zzbk {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AdListener f16098OooOo0O;

    public zzg(AdListener adListener) {
        this.f16098OooOo0O = adListener;
    }

    public final AdListener zzb() {
        return this.f16098OooOo0O;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() {
        AdListener adListener = this.f16098OooOo0O;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() {
        AdListener adListener = this.f16098OooOo0O;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zzeVar) {
        AdListener adListener = this.f16098OooOo0O;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
        AdListener adListener = this.f16098OooOo0O;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() {
        AdListener adListener = this.f16098OooOo0O;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() {
        AdListener adListener = this.f16098OooOo0O;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
        AdListener adListener = this.f16098OooOo0O;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }
}

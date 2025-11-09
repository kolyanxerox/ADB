package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;

/* loaded from: classes2.dex */
public final class zzbf extends zzcs {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final FullScreenContentCallback f16021OooOo0O;

    public zzbf(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.f16021OooOo0O = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f16021OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f16021OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f16021OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f16021OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f16021OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}

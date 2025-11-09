package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* loaded from: classes2.dex */
public final class zzh extends zzbn {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AdLoadCallback f16099OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f16100OooOo0o;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.f16099OooOo0O = adLoadCallback;
        this.f16100OooOo0o = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.f16099OooOo0O;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.f16099OooOo0O;
        if (adLoadCallback == null || (obj = this.f16100OooOo0o) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }
}

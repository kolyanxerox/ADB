package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* loaded from: classes2.dex */
public final class zzfs extends zzdq {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OnPaidEventListener f16096OooOo0O;

    public zzfs(@Nullable OnPaidEventListener onPaidEventListener) {
        this.f16096OooOo0O = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(zzu zzuVar) {
        OnPaidEventListener onPaidEventListener = this.f16096OooOo0O;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zzuVar.zzb, zzuVar.zzc, zzuVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() {
        return this.f16096OooOo0O == null;
    }
}

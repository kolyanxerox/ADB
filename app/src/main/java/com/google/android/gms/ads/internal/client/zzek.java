package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes2.dex */
final class zzek extends zzbd {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ zzel f16053OooOo;

    public zzek(zzel zzelVar) {
        this.f16053OooOo = zzelVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzel zzelVar = this.f16053OooOo;
        zzelVar.f16058OooO0Oo.zzb(zzelVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzel zzelVar = this.f16053OooOo;
        zzelVar.f16058OooO0Oo.zzb(zzelVar.zzi());
        super.onAdLoaded();
    }
}

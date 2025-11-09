package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* loaded from: classes2.dex */
public final class OooO0O0 extends AdListener implements AppEventListener, zza {

    /* renamed from: OooOo0O */
    public final AbstractAdViewAdapter f15866OooOo0O;

    /* renamed from: OooOo0o */
    public final MediationBannerListener f15867OooOo0o;

    public OooO0O0(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f15866OooOo0O = abstractAdViewAdapter;
        this.f15867OooOo0o = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f15867OooOo0o.onAdClicked(this.f15866OooOo0O);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f15867OooOo0o.onAdClosed(this.f15866OooOo0O);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f15867OooOo0o.onAdFailedToLoad(this.f15866OooOo0O, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f15867OooOo0o.onAdLoaded(this.f15866OooOo0O);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f15867OooOo0o.onAdOpened(this.f15866OooOo0O);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f15867OooOo0o.zzb(this.f15866OooOo0O, str, str2);
    }
}

package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes2.dex */
public final class OooO0OO extends InterstitialAdLoadCallback {

    /* renamed from: OooOo0O */
    public final AbstractAdViewAdapter f15868OooOo0O;

    /* renamed from: OooOo0o */
    public final MediationInterstitialListener f15869OooOo0o;

    public OooO0OO(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f15868OooOo0O = abstractAdViewAdapter;
        this.f15869OooOo0o = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f15869OooOo0o.onAdFailedToLoad(this.f15868OooOo0O, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f15868OooOo0O;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        MediationInterstitialListener mediationInterstitialListener = this.f15869OooOo0o;
        interstitialAd2.setFullScreenContentCallback(new OooO0o(abstractAdViewAdapter, mediationInterstitialListener));
        mediationInterstitialListener.onAdLoaded(abstractAdViewAdapter);
    }
}

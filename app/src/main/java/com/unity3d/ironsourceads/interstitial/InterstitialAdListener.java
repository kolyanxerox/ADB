package com.unity3d.ironsourceads.interstitial;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public interface InterstitialAdListener {
    void onInterstitialAdClicked(InterstitialAd interstitialAd);

    void onInterstitialAdDismissed(InterstitialAd interstitialAd);

    void onInterstitialAdFailedToShow(InterstitialAd interstitialAd, IronSourceError ironSourceError);

    void onInterstitialAdShown(InterstitialAd interstitialAd);
}

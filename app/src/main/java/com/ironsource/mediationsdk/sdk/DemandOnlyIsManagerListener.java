package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.demandOnly.C3376g;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public interface DemandOnlyIsManagerListener {
    void onInterstitialAdClicked(C3376g c3376g);

    void onInterstitialAdClosed(C3376g c3376g);

    void onInterstitialAdLoadFailed(IronSourceError ironSourceError, C3376g c3376g, long j);

    void onInterstitialAdOpened(C3376g c3376g);

    void onInterstitialAdReady(C3376g c3376g, long j);

    void onInterstitialAdShowFailed(IronSourceError ironSourceError, C3376g c3376g);

    void onInterstitialAdVisible(C3376g c3376g);
}

package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.demandOnly.C3381l;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public interface DemandOnlyRvManagerListener {
    void onRewardedVideoAdClicked(C3381l c3381l);

    void onRewardedVideoAdClosed(C3381l c3381l);

    void onRewardedVideoAdLoadFailed(IronSourceError ironSourceError, C3381l c3381l, long j);

    void onRewardedVideoAdOpened(C3381l c3381l);

    void onRewardedVideoAdRewarded(C3381l c3381l);

    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, C3381l c3381l);

    void onRewardedVideoAdVisible(C3381l c3381l);

    void onRewardedVideoLoadSuccess(C3381l c3381l, long j);
}

package com.unity3d.mediation.rewarded;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public interface LevelPlayRewardedAdListener {
    default void onAdClicked(LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    default void onAdClosed(LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    default void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(error, "error");
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo);
}

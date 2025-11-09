package com.unity3d.mediation.banner;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public interface LevelPlayBannerAdViewListener {
    default void onAdClicked(LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    default void onAdCollapsed(LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    default void onAdDisplayFailed(LevelPlayAdInfo adInfo, LevelPlayAdError error) {
        OooOo.OooO0o0(adInfo, "adInfo");
        OooOo.OooO0o0(error, "error");
    }

    default void onAdDisplayed(LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    default void onAdExpanded(LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    default void onAdLeftApplication(LevelPlayAdInfo adInfo) {
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}

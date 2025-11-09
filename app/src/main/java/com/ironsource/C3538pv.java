package com.ironsource;

import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* renamed from: com.ironsource.pv */
/* loaded from: classes2.dex */
public final class C3538pv implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3127fr.m8748a().m8780a(new Placement(0, adInfo.getPlacementName(), false, "", 0, null), C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3127fr.m8748a().m8784b(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3127fr c3127frM8748a = C3127fr.m8748a();
        C3783vv c3783vv = C3783vv.f12423a;
        c3127frM8748a.m8779a(c3783vv.m12830a(error), c3783vv.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3127fr.m8748a().m8788c(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        C3127fr.m8748a().m8778a(C3783vv.f12423a.m12830a(error));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3127fr.m8748a().m8789d(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(reward, "reward");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3127fr.m8748a().m8785b(new Placement(0, adInfo.getPlacementName(), false, reward.getName(), reward.getAmount(), null), C3783vv.f12423a.m12829a(adInfo));
    }
}

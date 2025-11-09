package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* renamed from: com.ironsource.vm */
/* loaded from: classes2.dex */
public final class C3774vm {

    /* renamed from: com.ironsource.vm$a */
    public static final class a implements InterfaceC3227im {

        /* renamed from: a */
        final /* synthetic */ LevelPlayRewardedAdListener f12402a;

        public a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.f12402a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + adInfo);
            this.f12402a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + adInfo);
            this.f12402a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f12402a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f12402a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f12402a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdLoadFailed(LevelPlayAdError error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + error);
            this.f12402a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f12402a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(reward, "reward");
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + reward + " adInfo: " + adInfo);
            this.f12402a.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final InterfaceC3227im m12790b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}

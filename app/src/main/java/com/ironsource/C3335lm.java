package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* renamed from: com.ironsource.lm */
/* loaded from: classes2.dex */
public final class C3335lm {

    /* renamed from: com.ironsource.lm$a */
    public static final class a implements InterfaceC3227im {

        /* renamed from: a */
        final /* synthetic */ LevelPlayInterstitialAdListener f9405a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f9405a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.f9405a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.f9405a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f9405a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f9405a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f9405a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdLoadFailed(LevelPlayAdError error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.f9405a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.InterfaceC3227im
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f9405a.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final InterfaceC3227im m9829b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}

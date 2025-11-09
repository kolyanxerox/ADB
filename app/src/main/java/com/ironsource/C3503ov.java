package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* renamed from: com.ironsource.ov */
/* loaded from: classes2.dex */
public final class C3503ov implements LevelPlayInterstitialAdListener {
    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C2937ah.m7765a().m7796b(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C2937ah.m7765a().m7798c(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C2937ah c2937ahM7765a = C2937ah.m7765a();
        C3783vv c3783vv = C3783vv.f12423a;
        c2937ahM7765a.m7794a(c3783vv.m12830a(error), c3783vv.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C2937ah.m7765a().m7801f(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        C2937ah.m7765a().m7793a(C3783vv.f12423a.m12830a(error));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C2937ah.m7765a().m7800e(C3783vv.f12423a.m12829a(adInfo));
    }
}

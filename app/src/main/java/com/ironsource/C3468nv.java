package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;

/* renamed from: com.ironsource.nv */
/* loaded from: classes2.dex */
public final class C3468nv implements LevelPlayBannerAdViewListener {
    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3687t5.m12363a().m12387b(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3687t5.m12363a().m12392f(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLeftApplication(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3687t5.m12363a().m12389c(C3783vv.f12423a.m12829a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        C3687t5.m12363a().m12384a(C3783vv.f12423a.m12830a(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3687t5.m12363a().m12390d(C3783vv.f12423a.m12829a(adInfo));
    }
}

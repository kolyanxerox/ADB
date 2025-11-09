package com.unity3d.ads.beta;

/* loaded from: classes2.dex */
public interface BannerShowListener {
    void unityAdsBannerDidClick(BannerAd bannerAd);

    void unityAdsBannerDidFailShow(BannerAd bannerAd, UnityAdsError unityAdsError);

    void unityAdsBannerImpression(BannerAd bannerAd);
}

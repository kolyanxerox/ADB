package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* loaded from: classes2.dex */
public final class v30 extends RewardedInterstitialAdLoadCallback {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ x30 f24843OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ String f24844OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f24845OooOo0o;

    public v30(x30 x30Var, String str, String str2) {
        this.f24844OooOo0O = str;
        this.f24845OooOo0o = str2;
        this.f24843OooOo = x30Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f24843OooOo.o000O(x30.o000O0oo(loadAdError), this.f24845OooOo0o);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        this.f24843OooOo.o000O0O0(this.f24844OooOo0O, rewardedInterstitialAd, this.f24845OooOo0o);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* loaded from: classes2.dex */
public final class u30 extends RewardedAdLoadCallback {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ x30 f24559OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ String f24560OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f24561OooOo0o;

    public u30(x30 x30Var, String str, String str2) {
        this.f24560OooOo0O = str;
        this.f24561OooOo0o = str2;
        this.f24559OooOo = x30Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f24559OooOo.o000O(x30.o000O0oo(loadAdError), this.f24561OooOo0o);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
        this.f24559OooOo.o000O0O0(this.f24560OooOo0O, rewardedAd, this.f24561OooOo0o);
    }
}

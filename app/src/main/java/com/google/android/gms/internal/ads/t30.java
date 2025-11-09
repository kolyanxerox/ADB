package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes2.dex */
public final class t30 extends InterstitialAdLoadCallback {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ x30 f24233OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ String f24234OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f24235OooOo0o;

    public t30(x30 x30Var, String str, String str2) {
        this.f24234OooOo0O = str;
        this.f24235OooOo0o = str2;
        this.f24233OooOo = x30Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f24233OooOo.o000O(x30.o000O0oo(loadAdError), this.f24235OooOo0o);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        this.f24233OooOo.o000O0O0(this.f24234OooOo0O, interstitialAd, this.f24235OooOo0o);
    }
}

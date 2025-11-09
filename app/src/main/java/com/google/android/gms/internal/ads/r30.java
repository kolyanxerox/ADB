package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes2.dex */
public final class r30 extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ x30 f23734OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ String f23735OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f23736OooOo0o;

    public r30(x30 x30Var, String str, String str2) {
        this.f23735OooOo0O = str;
        this.f23736OooOo0o = str2;
        this.f23734OooOo = x30Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f23734OooOo.o000O(x30.o000O0oo(loadAdError), this.f23736OooOo0o);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        this.f23734OooOo.o000O0O0(this.f23735OooOo0O, appOpenAd, this.f23736OooOo0o);
    }
}

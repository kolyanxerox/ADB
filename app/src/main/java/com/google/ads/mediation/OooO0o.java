package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes2.dex */
public final class OooO0o extends FullScreenContentCallback {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AbstractAdViewAdapter f15870OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final MediationInterstitialListener f15871OooOo0o;

    public OooO0o(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f15870OooOo0O = abstractAdViewAdapter;
        this.f15871OooOo0o = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f15871OooOo0o.onAdClosed(this.f15870OooOo0O);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f15871OooOo0o.onAdOpened(this.f15870OooOo0O);
    }
}

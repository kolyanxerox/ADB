package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

@VisibleForTesting
/* loaded from: classes2.dex */
final class zzb implements CustomEventInterstitialListener {

    /* renamed from: OooO00o */
    public final CustomEventAdapter f16443OooO00o;

    /* renamed from: OooO0O0 */
    public final MediationInterstitialListener f16444OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ CustomEventAdapter f16445OooO0OO;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f16445OooO0OO = customEventAdapter;
        this.f16443OooO00o = customEventAdapter2;
        this.f16444OooO0O0 = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        this.f16444OooO0O0.onAdClicked(this.f16443OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        this.f16444OooO0O0.onAdClosed(this.f16443OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzo.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f16444OooO0O0.onAdFailedToLoad(this.f16443OooO00o, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        this.f16444OooO0O0.onAdLeftApplication(this.f16443OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        zzo.zze("Custom event adapter called onReceivedAd.");
        this.f16444OooO0O0.onAdLoaded(this.f16445OooO0OO);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        this.f16444OooO0O0.onAdOpened(this.f16443OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f16444OooO0O0.onAdFailedToLoad(this.f16443OooO00o, adError);
    }
}

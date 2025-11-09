package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

@VisibleForTesting
/* loaded from: classes2.dex */
final class zzc implements CustomEventNativeListener {

    /* renamed from: OooO00o */
    public final CustomEventAdapter f16446OooO00o;

    /* renamed from: OooO0O0 */
    public final MediationNativeListener f16447OooO0O0;

    public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.f16446OooO00o = customEventAdapter;
        this.f16447OooO0O0 = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        this.f16447OooO0O0.onAdClicked(this.f16446OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        this.f16447OooO0O0.onAdClosed(this.f16446OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.f16447OooO0O0.onAdFailedToLoad(this.f16446OooO00o, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdImpression() {
        zzo.zze("Custom event adapter called onAdImpression.");
        this.f16447OooO0O0.onAdImpression(this.f16446OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        this.f16447OooO0O0.onAdLeftApplication(this.f16446OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzo.zze("Custom event adapter called onAdLoaded.");
        this.f16447OooO0O0.onAdLoaded(this.f16446OooO00o, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        this.f16447OooO0O0.onAdOpened(this.f16446OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.f16447OooO0O0.onAdFailedToLoad(this.f16446OooO00o, adError);
    }
}

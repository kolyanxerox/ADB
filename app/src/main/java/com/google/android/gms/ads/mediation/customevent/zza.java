package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationBannerListener;

@VisibleForTesting
/* loaded from: classes2.dex */
final class zza implements CustomEventBannerListener {

    /* renamed from: OooO00o */
    public final CustomEventAdapter f16441OooO00o;

    /* renamed from: OooO0O0 */
    public final MediationBannerListener f16442OooO0O0;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.f16441OooO00o = customEventAdapter;
        this.f16442OooO0O0 = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        this.f16442OooO0O0.onAdClicked(this.f16441OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        this.f16442OooO0O0.onAdClosed(this.f16441OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.f16442OooO0O0.onAdFailedToLoad(this.f16441OooO00o, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        this.f16442OooO0O0.onAdLeftApplication(this.f16441OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(View view) {
        zzo.zze("Custom event adapter called onAdLoaded.");
        CustomEventAdapter customEventAdapter = this.f16441OooO00o;
        customEventAdapter.f16436OooO00o = view;
        this.f16442OooO0O0.onAdLoaded(customEventAdapter);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        this.f16442OooO0O0.onAdOpened(this.f16441OooO00o);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.f16442OooO0O0.onAdFailedToLoad(this.f16441OooO00o, adError);
    }
}

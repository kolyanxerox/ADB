package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C3258jj;
import com.ironsource.InterfaceC3293kj;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class InterstitialAd implements InterfaceC3293kj {

    /* renamed from: a */
    private final C3258jj f13090a;

    /* renamed from: b */
    private InterstitialAdListener f13091b;

    public InterstitialAd(C3258jj interstitialAdInternal) {
        OooOo.OooO0o0(interstitialAdInternal, "interstitialAdInternal");
        this.f13090a = interstitialAdInternal;
        interstitialAdInternal.m9511a(this);
    }

    public final InterstitialAdInfo getAdInfo() {
        return this.f13090a.m9513b();
    }

    public final InterstitialAdListener getListener() {
        return this.f13091b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f13090a.m9515d();
    }

    @Override // com.ironsource.InterfaceC3293kj
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f13091b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC3293kj
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f13091b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC3293kj
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f13091b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC3293kj
    public void onAdInstanceDidFailedToShow(IronSourceError error) {
        OooOo.OooO0o0(error, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + error + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f13091b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC3293kj
    public void onAdInstanceDidReward(String str, int i) {
    }

    @Override // com.ironsource.InterfaceC3293kj
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f13091b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(InterstitialAdListener interstitialAdListener) {
        this.f13091b = interstitialAdListener;
    }

    public final void show(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        IronLog.API.info();
        this.f13090a.m9510a(activity);
    }
}

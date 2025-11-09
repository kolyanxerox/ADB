package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.C3534pr;
import com.ironsource.InterfaceC3569qr;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class RewardedAd implements InterfaceC3569qr {

    /* renamed from: a */
    private final C3534pr f13103a;

    /* renamed from: b */
    private RewardedAdListener f13104b;

    public RewardedAd(C3534pr rewardedAdInternal) {
        OooOo.OooO0o0(rewardedAdInternal, "rewardedAdInternal");
        this.f13103a = rewardedAdInternal;
        rewardedAdInternal.m11449a(this);
    }

    public final RewardedAdInfo getAdInfo() {
        return this.f13103a.m11451b();
    }

    public final RewardedAdListener getListener() {
        return this.f13104b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f13103a.m11453d();
    }

    @Override // com.ironsource.InterfaceC3569qr
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f13104b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC3569qr
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f13104b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC3569qr
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f13104b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC3569qr
    public void onRewardedAdFailedToShow(IronSourceError error) {
        OooOo.OooO0o0(error, "error");
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + error + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f13104b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC3569qr
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f13104b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC3569qr
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f13104b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(RewardedAdListener rewardedAdListener) {
        this.f13104b = rewardedAdListener;
    }

    public final void show(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        IronLog.API.info();
        this.f13103a.m11448a(activity);
    }
}

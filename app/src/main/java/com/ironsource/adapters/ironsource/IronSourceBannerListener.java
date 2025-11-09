package com.ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2972bh;
import com.ironsource.C3042dh;
import com.ironsource.C3907zj;
import com.ironsource.InterfaceC3338lp;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class IronSourceBannerListener implements InterfaceC3338lp {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    public IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerClick() {
        AbstractC2183w4.OooOOo(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdClicked();
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerInitFailed(String str) {
        AbstractC2183w4.OooOOo(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerInitSuccess() {
        AbstractC2183w4.OooOOo(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerLoadFail(String str) {
        AbstractC2183w4.OooOOo(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerLoadSuccess(C3907zj c3907zj, C3042dh c3042dh) {
        AbstractC2183w4.OooOOo(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        if (this.mAdapter.get() != null) {
            if (c3042dh == null) {
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            ConcurrentHashMap<String, ArrayList<C3907zj>> concurrentHashMap = this.mAdapter.get().mDemandSourceToBnAd;
            if (concurrentHashMap.get(this.mDemandSourceName) == null) {
                concurrentHashMap.put(this.mDemandSourceName, new ArrayList<>());
            }
            concurrentHashMap.get(this.mDemandSourceName).add(c3907zj);
            C2972bh size = c3042dh.getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.m7924c(), size.m7922a());
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(c3042dh, layoutParams);
        }
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerShowSuccess() {
        AbstractC2183w4.OooOOo(new StringBuilder(), this.mDemandSourceName, " onBannerShowSuccess", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}

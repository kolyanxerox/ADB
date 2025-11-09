package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import java.util.List;

/* renamed from: com.ironsource.rv */
/* loaded from: classes2.dex */
public final class C3608rv {

    /* renamed from: a */
    private final InterfaceC3235iv f11227a;

    /* renamed from: com.ironsource.rv$a */
    public static final class a implements LevelPlayInterstitialListener {
        public a() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11949f, IronSource.AD_UNIT.INTERSTITIAL, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11950g, IronSource.AD_UNIT.INTERSTITIAL, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            C3608rv.this.m11768a(C3678sv.f11945b, IronSource.AD_UNIT.INTERSTITIAL, C3783vv.f12423a.m12831a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11946c, IronSource.AD_UNIT.INTERSTITIAL, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11944a, IronSource.AD_UNIT.INTERSTITIAL, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11948e, IronSource.AD_UNIT.INTERSTITIAL, C3783vv.f12423a.m12831a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11947d, IronSource.AD_UNIT.INTERSTITIAL, C3783vv.f12423a.m12831a(adInfo));
        }
    }

    /* renamed from: com.ironsource.rv$b */
    public static final class b implements LevelPlayRewardedVideoManualListener, LevelPlayRewardedVideoListener {
        public b() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdAvailable(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11951h, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClicked(Placement placement, AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11949f, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(C3573qv.f11160a.m11666a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClosed(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11950g, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            C3608rv.this.m11768a(C3678sv.f11945b, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdOpened(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11946c, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdReady(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11944a, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdRewarded(Placement placement, AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11952i, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(C3573qv.f11160a.m11666a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11948e, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdUnavailable() {
            C3608rv.this.m11768a(C3678sv.f11957n, IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(new Object[0]));
        }
    }

    /* renamed from: com.ironsource.rv$c */
    public static final class c implements LevelPlayBannerListener {
        public c() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11949f, IronSource.AD_UNIT.BANNER, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11954k, IronSource.AD_UNIT.BANNER, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            C3608rv.this.m11768a(C3678sv.f11945b, IronSource.AD_UNIT.BANNER, C3783vv.f12423a.m12831a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11953j, IronSource.AD_UNIT.BANNER, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11956m, IronSource.AD_UNIT.BANNER, C3783vv.f12423a.m12831a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(AdInfo adInfo) {
            C3608rv.this.m11768a(C3678sv.f11955l, IronSource.AD_UNIT.BANNER, C3783vv.f12423a.m12831a(adInfo));
        }
    }

    public C3608rv(InterfaceC3235iv javaScriptEvaluator) {
        kotlin.jvm.internal.OooOo.OooO0o0(javaScriptEvaluator, "javaScriptEvaluator");
        this.f11227a = javaScriptEvaluator;
    }

    /* renamed from: b */
    private final void m11769b() {
        C3573qv c3573qv = C3573qv.f11160a;
        c3573qv.m11674a((LevelPlayInterstitialListener) null);
        c3573qv.m11675a((LevelPlayRewardedVideoBaseListener) null);
        c3573qv.m11673a((LevelPlayBannerListener) null);
    }

    /* renamed from: c */
    private final void m11770c() {
        C3573qv.f11160a.m11690i();
    }

    /* renamed from: a */
    public final void m11771a() {
        m11769b();
        m11770c();
    }

    /* renamed from: d */
    public final void m11772d() {
        C3573qv c3573qv = C3573qv.f11160a;
        c3573qv.m11674a(new a());
        c3573qv.m11675a(new b());
        c3573qv.m11673a(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m11768a(String str, IronSource.AD_UNIT ad_unit, List<? extends Object> list) {
        this.f11227a.mo9395a(str, ad_unit, list);
    }
}

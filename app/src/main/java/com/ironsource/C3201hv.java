package com.ironsource;

import android.webkit.JavascriptInterface;
import com.ironsource.mediationsdk.IronSource;
import java.util.List;

/* renamed from: com.ironsource.hv */
/* loaded from: classes2.dex */
public final class C3201hv {

    /* renamed from: a */
    private final C3056dv f8951a;

    /* renamed from: b */
    private final InterfaceC3235iv f8952b;

    /* renamed from: c */
    private final InterfaceC3490oi f8953c;

    public C3201hv(C3056dv adsManager, InterfaceC3490oi uiLifeCycleListener, InterfaceC3235iv javaScriptEvaluator) {
        kotlin.jvm.internal.OooOo.OooO0o0(adsManager, "adsManager");
        kotlin.jvm.internal.OooOo.OooO0o0(uiLifeCycleListener, "uiLifeCycleListener");
        kotlin.jvm.internal.OooOo.OooO0o0(javaScriptEvaluator, "javaScriptEvaluator");
        this.f8951a = adsManager;
        this.f8952b = javaScriptEvaluator;
        this.f8953c = uiLifeCycleListener;
    }

    /* renamed from: a */
    private final void m9237a(String str, IronSource.AD_UNIT ad_unit, List<? extends Object> list) {
        this.f8952b.mo9395a(str, ad_unit, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d) {
        this.f8951a.m8399a().mo8407a(d);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f8953c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f8951a.m8399a().mo8409b();
    }

    @JavascriptInterface
    public final void isInterstitialReady() {
        m9237a("isInterstitialReady", IronSource.AD_UNIT.INTERSTITIAL, C3783vv.f12423a.m12831a(Boolean.valueOf(this.f8951a.m8400b().mo8412e())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        m9237a("isRewardedVideoReady", IronSource.AD_UNIT.REWARDED_VIDEO, C3783vv.f12423a.m12831a(Boolean.valueOf(this.f8951a.m8401c().mo8413a())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String adNetwork, boolean z, boolean z2, String description, int i, int i2) {
        kotlin.jvm.internal.OooOo.OooO0o0(adNetwork, "adNetwork");
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        this.f8951a.m8399a().mo8408a(new C3270jv(adNetwork, z, Boolean.valueOf(z2), str), description, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String adNetwork, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOo.OooO0o0(adNetwork, "adNetwork");
        this.f8951a.m8400b().mo8410a(new C3270jv(adNetwork, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String adNetwork, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOo.OooO0o0(adNetwork, "adNetwork");
        this.f8951a.m8401c().mo8414b(new C3270jv(adNetwork, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f8953c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f8951a.m8400b().mo8411c();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f8951a.m8401c().mo8415d();
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean z, boolean z2, String description, int i, int i2) {
        kotlin.jvm.internal.OooOo.OooO0o0(adNetwork, "adNetwork");
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        loadBannerAd(null, adNetwork, z, z2, description, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOo.OooO0o0(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z, z2);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOo.OooO0o0(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z, z2);
    }
}

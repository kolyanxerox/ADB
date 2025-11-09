package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0986b5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1044h3;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1170q4;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1302z2;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.applovin.impl.mediation.h */
/* loaded from: classes.dex */
public class C1129h {

    /* renamed from: b */
    private final C1220k f1475b;

    /* renamed from: c */
    private final C1240o f1476c;

    /* renamed from: d */
    private final String f1477d;

    /* renamed from: e */
    private final C1044h3 f1478e;

    /* renamed from: f */
    private final String f1479f;

    /* renamed from: g */
    private MaxAdapter f1480g;

    /* renamed from: h */
    private String f1481h;

    /* renamed from: i */
    private AbstractC1266v2 f1482i;

    /* renamed from: j */
    private View f1483j;

    /* renamed from: k */
    private MaxNativeAd f1484k;

    /* renamed from: l */
    private MaxNativeAdView f1485l;

    /* renamed from: m */
    private ViewGroup f1486m;

    /* renamed from: o */
    private MaxAdapterResponseParameters f1488o;

    /* renamed from: s */
    private final boolean f1492s;

    /* renamed from: a */
    private final Handler f1474a = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private final b f1487n = new b(this, null);

    /* renamed from: p */
    private final AtomicBoolean f1489p = new AtomicBoolean(true);

    /* renamed from: q */
    private final AtomicBoolean f1490q = new AtomicBoolean(false);

    /* renamed from: r */
    private final AtomicBoolean f1491r = new AtomicBoolean(false);

    /* renamed from: com.applovin.impl.mediation.h$a */
    public class a implements MaxSignalCollectionListener {

        /* renamed from: a */
        final /* synthetic */ C0986b5 f1493a;

        /* renamed from: b */
        final /* synthetic */ C1170q4 f1494b;

        public a(C0986b5 c0986b5, C1170q4 c1170q4) {
            this.f1493a = c0986b5;
            this.f1494b = c1170q4;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f1493a.m388y() && TextUtils.isEmpty(str)) {
                this.f1494b.m2266a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f1494b.m2271b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f1494b.m2266a(new MaxErrorImpl(str));
        }
    }

    /* renamed from: com.applovin.impl.mediation.h$b */
    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a */
        private MediationServiceImpl.C1104b f1496a;

        private b() {
        }

        /* renamed from: b */
        private void m1858b(String str, Bundle bundle) {
            if (C1129h.this.f1482i.m3541w().compareAndSet(false, true)) {
                m1854a(str, this.f1496a, new OooOo00(this, bundle, 2));
            }
        }

        /* renamed from: c */
        private void m1860c(String str, Bundle bundle) {
            if (!C1129h.this.f1482i.m3541w().get()) {
                C1129h.this.f1491r.set(true);
                m1854a(str, this.f1496a, new OooOo00(this, bundle, 0));
                return;
            }
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3214b("MediationAdapterWrapper", C1129h.this.f1479f + ": blocking ad loaded callback for " + C1129h.this.f1482i + " since onAdHidden() has been called");
            }
            C1129h.this.f1475b.m2923u().m2770a(C1129h.this.f1482i, str);
        }

        /* renamed from: d */
        public /* synthetic */ void m1861d(Bundle bundle) {
            this.f1496a.m1559a(C1129h.this.f1482i, bundle);
        }

        /* renamed from: e */
        public /* synthetic */ void m1862e(Bundle bundle) {
            this.f1496a.m1559a(C1129h.this.f1482i, bundle);
        }

        /* renamed from: f */
        public /* synthetic */ void m1863f(Bundle bundle) {
            this.f1496a.m1559a(C1129h.this.f1482i, bundle);
        }

        /* renamed from: g */
        public /* synthetic */ void m1864g(Bundle bundle) {
            this.f1496a.m1563c(C1129h.this.f1482i, bundle);
        }

        /* renamed from: h */
        public /* synthetic */ void m1865h(Bundle bundle) {
            this.f1496a.m1563c(C1129h.this.f1482i, bundle);
        }

        /* renamed from: i */
        public /* synthetic */ void m1866i(Bundle bundle) {
            this.f1496a.m1565e(C1129h.this.f1482i, bundle);
        }

        /* renamed from: j */
        public /* synthetic */ void m1867j(Bundle bundle) {
            if (C1129h.this.f1490q.compareAndSet(false, true)) {
                this.f1496a.m1566f(C1129h.this.f1482i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            m1855a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            m1855a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            m1855a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": native ad displayed with extra info: " + bundle);
            }
            m1853a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            m1855a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": native ad loaded with extra info: " + bundle);
            }
            C1129h.this.f1484k = maxNativeAd;
            m1860c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m1855a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ b(C1129h c1129h, a aVar) {
            this();
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": adview ad clicked with extra info: " + bundle);
            }
            m1854a("onAdViewAdClicked", this.f1496a, new OooOo00(this, bundle, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": adview ad collapsed");
            }
            m1854a("onAdViewAdCollapsed", this.f1496a, new Oooo000(this, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            m1856a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": adview ad displayed with extra info: " + bundle);
            }
            m1853a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": adview ad expanded");
            }
            m1854a("onAdViewAdExpanded", this.f1496a, new OooOo00(this, bundle, 9));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": adview ad hidden with extra info: " + bundle);
            }
            m1858b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": adview ad loaded with extra info: " + bundle);
            }
            C1129h.this.f1483j = view;
            m1860c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": app open ad clicked with extra info: " + bundle);
            }
            m1854a("onAppOpenAdClicked", this.f1496a, new OooOo00(this, bundle, 8));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": app open ad display failed with error: " + maxAdapterError);
            }
            m1856a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": app open ad displayed with extra info: " + bundle);
            }
            m1853a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": app open ad hidden with extra info: " + bundle);
            }
            m1858b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": app open ad loaded with extra info: " + bundle);
            }
            m1860c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": interstitial ad clicked with extra info: " + bundle);
            }
            m1854a("onInterstitialAdClicked", this.f1496a, new OooOo00(this, bundle, 7));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            m1856a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": interstitial ad displayed with extra info: " + bundle);
            }
            m1853a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": interstitial ad hidden with extra info " + bundle);
            }
            m1858b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": interstitial ad loaded with extra info: " + bundle);
            }
            m1860c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": native ad clicked");
            }
            m1854a("onNativeAdClicked", this.f1496a, new OooOo00(this, bundle, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": rewarded ad clicked with extra info: " + bundle);
            }
            m1854a("onRewardedAdClicked", this.f1496a, new OooOo00(this, bundle, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3218k("MediationAdapterWrapper", C1129h.this.f1479f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            m1856a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": rewarded ad displayed with extra info: " + bundle);
            }
            m1853a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": rewarded ad hidden with extra info: " + bundle);
            }
            m1858b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            C1240o unused = C1129h.this.f1476c;
            if (C1240o.m3200a()) {
                C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": rewarded ad loaded with extra info: " + bundle);
            }
            m1860c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (C1129h.this.f1482i instanceof C1302z2) {
                C1302z2 c1302z2 = (C1302z2) C1129h.this.f1482i;
                if (c1302z2.m3857n0().compareAndSet(false, true)) {
                    C1240o unused = C1129h.this.f1476c;
                    if (C1240o.m3200a()) {
                        C1129h.this.f1476c.m3215d("MediationAdapterWrapper", C1129h.this.f1479f + ": user was rewarded: " + maxReward);
                    }
                    m1854a("onUserRewarded", this.f1496a, new Oooo0(this, c1302z2, maxReward, bundle, 0));
                }
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m1857b(Bundle bundle) {
            this.f1496a.m1564d(C1129h.this.f1482i, bundle);
        }

        /* renamed from: a */
        public void m1845a(MediationServiceImpl.C1104b c1104b) {
            if (c1104b != null) {
                this.f1496a = c1104b;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* renamed from: c */
        public /* synthetic */ void m1859c(Bundle bundle) {
            this.f1496a.m1559a(C1129h.this.f1482i, bundle);
        }

        /* renamed from: a */
        public void m1855a(String str, MaxError maxError) {
            if (C1129h.this.f1482i.m3541w().get()) {
                C1240o unused = C1129h.this.f1476c;
                if (C1240o.m3200a()) {
                    C1129h.this.f1476c.m3214b("MediationAdapterWrapper", C1129h.this.f1479f + ": blocking ad load failed callback for " + C1129h.this.f1482i + " since onAdHidden() has been called");
                }
                C1129h.this.f1475b.m2923u().m2770a(C1129h.this.f1482i, str);
                return;
            }
            m1854a(str, this.f1496a, new OooOOOO(0, this, maxError));
        }

        /* renamed from: a */
        public /* synthetic */ void m1850a(MaxError maxError) {
            if (C1129h.this.f1490q.compareAndSet(false, true)) {
                this.f1496a.onAdLoadFailed(C1129h.this.f1481h, maxError);
            }
        }

        /* renamed from: a */
        private void m1853a(String str, Bundle bundle) {
            if (C1129h.this.f1482i.m3541w().get()) {
                C1240o unused = C1129h.this.f1476c;
                if (C1240o.m3200a()) {
                    C1129h.this.f1476c.m3214b("MediationAdapterWrapper", C1129h.this.f1479f + ": blocking ad displayed callback for " + C1129h.this.f1482i + " since onAdHidden() has been called");
                }
                C1129h.this.f1475b.m2923u().m2770a(C1129h.this.f1482i, str);
                return;
            }
            if (!((Boolean) C1129h.this.f1475b.m2866a(AbstractC1144o3.f1652m8)).booleanValue()) {
                if (C1129h.this.f1482i.m3539u().compareAndSet(false, true)) {
                    m1854a(str, this.f1496a, new OooOo00(this, bundle, 6));
                    return;
                }
                return;
            }
            m1854a(str, this.f1496a, new OooOo00(this, bundle, 5));
        }

        /* renamed from: a */
        public void m1856a(String str, MaxError maxError, Bundle bundle) {
            if (C1129h.this.f1482i.m3541w().get()) {
                C1240o unused = C1129h.this.f1476c;
                if (C1240o.m3200a()) {
                    C1129h.this.f1476c.m3214b("MediationAdapterWrapper", C1129h.this.f1479f + ": blocking ad display failed callback for " + C1129h.this.f1482i + " since onAdHidden() has been called");
                }
                C1129h.this.f1475b.m2923u().m2770a(C1129h.this.f1482i, str);
                return;
            }
            m1854a(str, this.f1496a, new OooOo(this, maxError, bundle, 0));
        }

        /* renamed from: a */
        public /* synthetic */ void m1851a(MaxError maxError, Bundle bundle) {
            this.f1496a.m1560a(C1129h.this.f1482i, maxError, bundle);
        }

        /* renamed from: a */
        public /* synthetic */ void m1849a(C1302z2 c1302z2, MaxReward maxReward, Bundle bundle) {
            this.f1496a.m1561a(c1302z2, maxReward, bundle);
        }

        /* renamed from: a */
        public /* synthetic */ void m1844a(Bundle bundle) {
            this.f1496a.m1559a(C1129h.this.f1482i, bundle);
        }

        /* renamed from: a */
        public /* synthetic */ void m1843a() {
            this.f1496a.onAdCollapsed(C1129h.this.f1482i);
        }

        /* renamed from: a */
        private void m1854a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            C1129h.this.f1474a.post(new Oooo0(this, runnable, maxAdListener, str, 1));
        }

        /* renamed from: a */
        public /* synthetic */ void m1852a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C1240o.m3204c("MediationAdapterWrapper", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                C1129h.this.f1475b.m2832E().m2151a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", C1129h.this.f1478e.m895b()));
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.h$c */
    public static class c implements MaxAdapter.OnCompletionListener {

        /* renamed from: a */
        private final C1220k f1498a;

        /* renamed from: b */
        private final C1044h3 f1499b;

        /* renamed from: c */
        private final long f1500c;

        /* renamed from: d */
        private final MaxAdapter.OnCompletionListener f1501d;

        public c(C1220k c1220k, C1044h3 c1044h3, long j, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f1498a = c1220k;
            this.f1499b = c1044h3;
            this.f1500c = j;
            this.f1501d = onCompletionListener;
        }

        /* renamed from: a */
        public /* synthetic */ void m1868a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f1498a.m2852S().m1773a(this.f1499b, SystemClock.elapsedRealtime() - this.f1500c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f1501d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new OooOo(this, initializationStatus, str, 1), this.f1499b.m912h());
        }
    }

    /* renamed from: com.applovin.impl.mediation.h$d */
    public class d extends AbstractRunnableC1036g5 {

        /* renamed from: g */
        private final WeakReference f1502g;

        public /* synthetic */ d(C1129h c1129h, a aVar) {
            this();
        }

        /* renamed from: b */
        private void m1869b(AbstractC1266v2 abstractC1266v2) {
            if (abstractC1266v2 != null) {
                this.f776a.m2864Z().m2373a(abstractC1266v2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1129h.this.f1490q.get()) {
                return;
            }
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, C1129h.this.f1479f + " is timing out " + C1129h.this.f1482i + "...");
            }
            m1869b(C1129h.this.f1482i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f1502g.get();
            if (bVar != null) {
                bVar.m1855a(this.f777b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", C1129h.this.f1475b);
            this.f1502g = new WeakReference(C1129h.this.f1487n);
        }
    }

    public C1129h(C1044h3 c1044h3, MaxAdapter maxAdapter, boolean z, C1220k c1220k) {
        if (c1044h3 == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f1477d = c1044h3.m899c();
        this.f1480g = maxAdapter;
        this.f1475b = c1220k;
        this.f1476c = c1220k.m2847O();
        this.f1478e = c1044h3;
        this.f1479f = maxAdapter.getClass().getSimpleName();
        this.f1492s = z;
    }

    /* renamed from: l */
    public /* synthetic */ void m1822l() {
        m1801a("destroy");
        MaxAdapter maxAdapter = this.f1480g;
        if (maxAdapter != null) {
            this.f1480g = null;
            maxAdapter.onDestroy();
        } else if (C1240o.m3200a()) {
            this.f1476c.m3218k("MediationAdapterWrapper", "Mediation adapter '" + this.f1479f + "' is already destroyed");
        }
        this.f1483j = null;
        this.f1484k = null;
        this.f1485l = null;
        this.f1486m = null;
    }

    /* renamed from: k */
    public boolean m1841k() {
        return this.f1489p.get();
    }

    public String toString() {
        return OooO0oO.OooOo.OooOOOo(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f1479f, "'}");
    }

    /* renamed from: b */
    public /* synthetic */ void m1809b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f1480g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f1487n);
    }

    /* renamed from: c */
    public MediationServiceImpl.C1104b m1833c() {
        return this.f1487n.f1496a;
    }

    /* renamed from: d */
    public View m1834d() {
        return this.f1483j;
    }

    /* renamed from: e */
    public MaxNativeAd m1835e() {
        return this.f1484k;
    }

    /* renamed from: f */
    public MaxNativeAdView m1836f() {
        return this.f1485l;
    }

    /* renamed from: g */
    public String m1837g() {
        return this.f1477d;
    }

    /* renamed from: h */
    public ViewGroup m1838h() {
        return this.f1486m;
    }

    /* renamed from: i */
    public String m1839i() {
        MaxAdapter maxAdapter = this.f1480g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            C1240o.m3204c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f1477d, th);
            this.f1475b.m2832E().m2151a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.f1478e.m895b()));
            m1801a("sdk_version");
            this.f1475b.m2854T().m1783a(this.f1478e.m895b(), "sdk_version", this.f1482i);
            return null;
        }
    }

    /* renamed from: j */
    public boolean m1840j() {
        return this.f1490q.get() && this.f1491r.get();
    }

    /* renamed from: c */
    public /* synthetic */ void m1813c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f1480g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f1487n);
    }

    /* renamed from: d */
    public /* synthetic */ void m1815d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f1480g).loadNativeAd(maxAdapterResponseParameters, activity, this.f1487n);
    }

    /* renamed from: a */
    public void m1826a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        m1810b(MobileAdsBridgeBase.initializeMethodName, new Oooo0(this, onCompletionListener, maxAdapterInitializationParameters, activity, 4));
    }

    /* renamed from: b */
    public void m1832b(AbstractC1266v2 abstractC1266v2, final Activity activity) {
        Runnable runnable;
        if (m1804a(abstractC1266v2, activity)) {
            if (abstractC1266v2.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOOO

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15653OooOo0o;

                    {
                        this.f15653OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.f15653OooOo0o.m1790a(activity);
                                break;
                            case 1:
                                this.f15653OooOo0o.m1807b(activity);
                                break;
                            default:
                                this.f15653OooOo0o.m1812c(activity);
                                break;
                        }
                    }
                };
            } else if (abstractC1266v2.getFormat() == MaxAdFormat.APP_OPEN) {
                final int i2 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOOO

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15653OooOo0o;

                    {
                        this.f15653OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f15653OooOo0o.m1790a(activity);
                                break;
                            case 1:
                                this.f15653OooOo0o.m1807b(activity);
                                break;
                            default:
                                this.f15653OooOo0o.m1812c(activity);
                                break;
                        }
                    }
                };
            } else if (abstractC1266v2.getFormat() == MaxAdFormat.REWARDED) {
                final int i3 = 2;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOOO

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15653OooOo0o;

                    {
                        this.f15653OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f15653OooOo0o.m1790a(activity);
                                break;
                            case 1:
                                this.f15653OooOo0o.m1807b(activity);
                                break;
                            default:
                                this.f15653OooOo0o.m1812c(activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + abstractC1266v2 + ": " + abstractC1266v2.getFormat() + " is not a supported ad format");
            }
            m1800a(runnable, abstractC1266v2);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m1795a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C1240o.m3200a()) {
            this.f1476c.m3211a("MediationAdapterWrapper", "Initializing " + this.f1479f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f1478e.m921r());
        }
        this.f1480g.initialize(maxAdapterInitializationParameters, activity, new c(this.f1475b, this.f1478e, jElapsedRealtime, onCompletionListener));
    }

    /* renamed from: c */
    public /* synthetic */ void m1812c(Activity activity) {
        ((MaxRewardedAdapter) this.f1480g).showRewardedAd(this.f1488o, activity, this.f1487n);
    }

    /* renamed from: a */
    public void m1829a(String str, AbstractC1266v2 abstractC1266v2) {
        this.f1481h = str;
        this.f1482i = abstractC1266v2;
    }

    /* renamed from: a */
    public void m1828a(MaxNativeAdView maxNativeAdView) {
        this.f1485l = maxNativeAdView;
    }

    /* renamed from: a */
    public void m1824a(ViewGroup viewGroup) {
        this.f1486m = viewGroup;
    }

    /* renamed from: b */
    public /* synthetic */ void m1807b(Activity activity) {
        ((MaxAppOpenAdapter) this.f1480g).showAppOpenAd(this.f1488o, activity, this.f1487n);
    }

    /* renamed from: a */
    public void m1830a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, AbstractC1266v2 abstractC1266v2, final Activity activity, MediationServiceImpl.C1104b c1104b) {
        Runnable oooo0;
        if (abstractC1266v2 != null) {
            if (!this.f1489p.get()) {
                String str2 = "Mediation adapter '" + this.f1479f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                C1240o.m3207h("MediationAdapterWrapper", str2);
                c1104b.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f1488o = maxAdapterResponseParameters;
            this.f1487n.m1845a(c1104b);
            MaxAdFormat format = abstractC1266v2.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                final int i = 0;
                oooo0 = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOOO0

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15656OooOo0o;

                    {
                        this.f15656OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.f15656OooOo0o.m1797a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f15656OooOo0o.m1809b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f15656OooOo0o.m1813c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f15656OooOo0o.m1815d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                final int i2 = 1;
                oooo0 = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOOO0

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15656OooOo0o;

                    {
                        this.f15656OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f15656OooOo0o.m1797a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f15656OooOo0o.m1809b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f15656OooOo0o.m1813c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f15656OooOo0o.m1815d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                final int i3 = 2;
                oooo0 = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOOO0

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15656OooOo0o;

                    {
                        this.f15656OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f15656OooOo0o.m1797a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f15656OooOo0o.m1809b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f15656OooOo0o.m1813c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f15656OooOo0o.m1815d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.NATIVE) {
                final int i4 = 3;
                oooo0 = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOOO0

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15656OooOo0o;

                    {
                        this.f15656OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f15656OooOo0o.m1797a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f15656OooOo0o.m1809b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f15656OooOo0o.m1813c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f15656OooOo0o.m1815d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else {
                if (format.isAdViewAd()) {
                    oooo0 = new Oooo0(this, maxAdapterResponseParameters, format, activity, 3);
                    m1802a("load_ad", format, new OooOo(this, abstractC1266v2, oooo0, 2));
                    return;
                }
                throw new IllegalStateException("Failed to load " + abstractC1266v2 + ": " + abstractC1266v2.getFormat() + " is not a supported ad format");
            }
            m1802a("load_ad", format, new OooOo(this, abstractC1266v2, oooo0, 2));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* renamed from: b */
    public /* synthetic */ void m1808b(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f1480g).showRewardedAd(this.f1488o, viewGroup, lifecycle, activity, this.f1487n);
    }

    /* renamed from: b */
    public String m1831b() {
        MaxAdapter maxAdapter = this.f1480g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            C1240o.m3204c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f1477d, th);
            this.f1475b.m2832E().m2151a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.f1478e.m895b()));
            m1801a("adapter_version");
            this.f1475b.m2854T().m1783a(this.f1478e.m895b(), "adapter_version", this.f1482i);
            return null;
        }
    }

    /* renamed from: b */
    private void m1810b(String str, Runnable runnable) {
        m1802a(str, (MaxAdFormat) null, runnable);
    }

    /* renamed from: a */
    public /* synthetic */ void m1797a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f1480g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f1487n);
    }

    /* renamed from: a */
    public /* synthetic */ void m1798a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f1480g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f1487n);
    }

    /* renamed from: a */
    public /* synthetic */ void m1794a(AbstractC1266v2 abstractC1266v2, Runnable runnable) {
        m1793a(this.f1478e, abstractC1266v2);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f1477d + " due to: " + th;
            C1240o.m3207h("MediationAdapterWrapper", str);
            this.f1487n.m1855a("load_ad", new MaxErrorImpl(-1, str));
            this.f1475b.m2832E().m2151a("MediationAdapterWrapper", "load_ad", th, CollectionUtils.hashMap("adapter_class", this.f1478e.m895b()));
            m1801a("load_ad");
            this.f1475b.m2854T().m1783a(this.f1478e.m895b(), "load_ad", this.f1482i);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m1790a(Activity activity) {
        ((MaxInterstitialAdapter) this.f1480g).showInterstitialAd(this.f1488o, activity, this.f1487n);
    }

    /* renamed from: a */
    public void m1825a(AbstractC1266v2 abstractC1266v2, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (m1804a(abstractC1266v2, activity)) {
            if (abstractC1266v2.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOO0O

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15648OooOo0o;

                    {
                        this.f15648OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.f15648OooOo0o.m1791a(viewGroup, lifecycle, activity);
                                break;
                            default:
                                this.f15648OooOo0o.m1808b(viewGroup, lifecycle, activity);
                                break;
                        }
                    }
                };
            } else if (abstractC1266v2.getFormat() == MaxAdFormat.REWARDED) {
                final int i2 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.OooOO0O

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ C1129h f15648OooOo0o;

                    {
                        this.f15648OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f15648OooOo0o.m1791a(viewGroup, lifecycle, activity);
                                break;
                            default:
                                this.f15648OooOo0o.m1808b(viewGroup, lifecycle, activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + abstractC1266v2 + ": " + abstractC1266v2.getFormat() + " is not a supported ad format");
            }
            m1800a(runnable, abstractC1266v2);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m1791a(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f1480g).showInterstitialAd(this.f1488o, viewGroup, lifecycle, activity, this.f1487n);
    }

    /* renamed from: a */
    private boolean m1804a(AbstractC1266v2 abstractC1266v2, Activity activity) {
        if (abstractC1266v2 != null) {
            if (abstractC1266v2.m3504A() == null) {
                C1240o.m3207h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f1487n.m1856a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (abstractC1266v2.m3504A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != abstractC1266v2.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f1489p.get()) {
                    String str = "Mediation adapter '" + this.f1479f + "' is disabled. Showing ads with this adapter is disabled.";
                    C1240o.m3207h("MediationAdapterWrapper", str);
                    this.f1487n.m1856a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (m1840j()) {
                    return true;
                }
                throw new IllegalStateException(OooO0oO.OooOo.OooOOOo(new StringBuilder("Mediation adapter '"), this.f1479f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* renamed from: a */
    private void m1800a(Runnable runnable, AbstractC1266v2 abstractC1266v2) {
        m1802a("show_ad", abstractC1266v2.getFormat(), new OooOOOO(4, this, runnable));
    }

    /* renamed from: a */
    public /* synthetic */ void m1799a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f1477d + " due to: " + th;
            C1240o.m3207h("MediationAdapterWrapper", str);
            this.f1487n.m1856a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f1475b.m2832E().m2151a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.f1478e.m895b()));
            m1801a("show_ad");
            this.f1475b.m2854T().m1783a(this.f1478e.m895b(), "show_ad", this.f1482i);
        }
    }

    /* renamed from: a */
    public void m1827a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, C0986b5 c0986b5, Activity activity, C1170q4 c1170q4) {
        if (c1170q4 != null) {
            if (!this.f1489p.get()) {
                C1240o.m3207h("MediationAdapterWrapper", "Mediation adapter '" + this.f1479f + "' is disabled. Signal collection ads with this adapter is disabled.");
                c1170q4.m2266a(new MaxErrorImpl(OooO0oO.OooOo.OooOOOo(new StringBuilder("The adapter ("), this.f1479f, ") is disabled")));
                return;
            }
            MaxAdapter maxAdapter = this.f1480g;
            if (maxAdapter instanceof MaxSignalProvider) {
                m1810b("collect_signal", new OooO0O0(this, (MaxSignalProvider) maxAdapter, maxAdapterSignalCollectionParameters, activity, c0986b5, c1170q4));
                return;
            } else {
                c1170q4.m2266a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, OooO0oO.OooOo.OooOOOo(new StringBuilder("The adapter ("), this.f1479f, ") does not support signal collection")));
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* renamed from: a */
    public /* synthetic */ void m1796a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, C0986b5 c0986b5, C1170q4 c1170q4) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(c0986b5, c1170q4));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f1477d + " due to: " + th);
            C1240o.m3207h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            c1170q4.m2266a(maxErrorImpl);
            this.f1475b.m2832E().m2151a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.f1478e.m895b()));
            m1801a("collect_signal");
            this.f1475b.m2854T().m1783a(this.f1478e.m895b(), "collect_signal", this.f1482i);
        }
        if (!c1170q4.m2273c() && c0986b5.m916m() == 0) {
            if (C1240o.m3200a()) {
                this.f1476c.m3211a("MediationAdapterWrapper", "Failing signal collection " + c0986b5 + " since it has 0 timeout");
            }
            c1170q4.m2266a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, OooO0oO.OooOo.OooOOOo(new StringBuilder("The adapter ("), this.f1479f, ") has 0 timeout")));
        }
    }

    /* renamed from: a */
    public void m1823a() {
        if (this.f1492s) {
            return;
        }
        m1810b("destroy", new Oooo000(this, 1));
    }

    /* renamed from: a */
    private void m1793a(C1044h3 c1044h3, AbstractC1266v2 abstractC1266v2) {
        m1792a(new d(this, null), c1044h3, abstractC1266v2);
    }

    /* renamed from: a */
    private void m1792a(AbstractRunnableC1036g5 abstractRunnableC1036g5, C1044h3 c1044h3, AbstractC1266v2 abstractC1266v2) {
        long jM916m = c1044h3.m916m();
        if (jM916m <= 0) {
            if (C1240o.m3200a()) {
                C1240o c1240o = this.f1476c;
                StringBuilder sb = new StringBuilder("Non-positive timeout set for ");
                if (abstractC1266v2 != null) {
                    c1044h3 = abstractC1266v2;
                }
                sb.append(c1044h3);
                sb.append(", not scheduling a timeout");
                c1240o.m3211a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            C1240o c1240o2 = this.f1476c;
            StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(jM916m, "Setting timeout ", "ms for ");
            if (abstractC1266v2 != null) {
                c1044h3 = abstractC1266v2;
            }
            sbOooOOo.append(c1044h3);
            c1240o2.m3211a("MediationAdapterWrapper", sbOooOOo.toString());
        }
        this.f1475b.m2918r0().m404a(abstractRunnableC1036g5, C0987b6.b.TIMEOUT, jM916m);
    }

    /* renamed from: a */
    private void m1801a(String str) {
        if (C1240o.m3200a()) {
            this.f1476c.m3215d("MediationAdapterWrapper", androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder("Marking "), this.f1479f, " as disabled due to: ", str));
        }
        this.f1489p.set(false);
    }

    /* renamed from: a */
    private void m1802a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        OooOo oooOo = new OooOo(this, str, runnable, 3);
        if (m1805a(str, maxAdFormat)) {
            this.f1474a.post(oooOo);
            return;
        }
        StringBuilder sbOooOo = OooO0oO.OooOo.OooOo(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sbOooOo.append(this.f1478e.m899c());
        C1156p6 c1156p6 = new C1156p6(this.f1475b, sbOooOo.toString(), oooOo);
        if (((Boolean) this.f1475b.m2866a(C1268v4.f2714X)).booleanValue()) {
            this.f1475b.m2918r0().m406a(c1156p6, this.f1478e);
        } else {
            this.f1475b.m2918r0().m402a(c1156p6);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m1803a(String str, Runnable runnable) {
        try {
            if (C1240o.m3200a()) {
                this.f1476c.m3211a("MediationAdapterWrapper", this.f1479f + ": running " + str + "...");
            }
            runnable.run();
            if (C1240o.m3200a()) {
                this.f1476c.m3211a("MediationAdapterWrapper", this.f1479f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("Failed operation ", str, " for ");
            sbOooOoO0.append(this.f1477d);
            C1240o.m3204c("MediationAdapterWrapper", sbOooOoO0.toString(), th);
            m1801a("fail_" + str);
            if (!str.equals("destroy")) {
                this.f1475b.m2854T().m1783a(this.f1478e.m895b(), str, this.f1482i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", C3401a.f9920g);
            CollectionUtils.putStringIfValid("adapter_class", this.f1478e.m895b(), mapHashMap);
            this.f1475b.m2832E().m2151a("MediationAdapterWrapper", str, th, mapHashMap);
        }
    }

    /* renamed from: a */
    private boolean m1805a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolM3533a0;
        Boolean boolM3535c0;
        Boolean boolM3534b0;
        MaxAdapter maxAdapter = this.f1480g;
        if (maxAdapter == null) {
            return this.f1478e.m921r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            AbstractC1266v2 abstractC1266v2 = this.f1482i;
            if (abstractC1266v2 != null && (boolM3534b0 = abstractC1266v2.m3534b0()) != null) {
                return boolM3534b0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            AbstractC1266v2 abstractC1266v22 = this.f1482i;
            if (abstractC1266v22 != null && (boolM3535c0 = abstractC1266v22.m3535c0()) != null) {
                return boolM3535c0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            AbstractC1266v2 abstractC1266v23 = this.f1482i;
            if (abstractC1266v23 != null && (boolM3533a0 = abstractC1266v23.m3533a0()) != null) {
                return boolM3533a0.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f1478e.m921r();
    }
}

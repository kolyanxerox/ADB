package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3678sv;
import java.util.Map;

/* renamed from: com.applovin.impl.q2 */
/* loaded from: classes.dex */
public abstract class AbstractC1168q2 {

    /* renamed from: a */
    private static boolean f1790a = true;

    /* renamed from: b */
    private static boolean f1791b = true;

    /* renamed from: a */
    public static void m2192a(boolean z) {
        f1791b = z;
    }

    /* renamed from: b */
    public static void m2223b(boolean z) {
        f1790a = z;
    }

    /* renamed from: c */
    public static /* synthetic */ void m2231c(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollected(str);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify bid token listener about successful bid token collection", th);
            m2232c("onBidTokenCollected", th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m2240d(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollectionFailed(str);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify bid token listener about bid token collection failure", th);
            m2232c("onBidTokenCollectionFailed", th);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m2242e(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adLeftApplication(m2157a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m2247f(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adOpenedFullscreen(m2157a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
        }
    }

    /* renamed from: a */
    public static void m2187a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new o0000O(appLovinBidTokenCollectionListener, str, 0));
        }
    }

    /* renamed from: b */
    public static void m2218b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new o0000O(appLovinBidTokenCollectionListener, str, 1));
        }
    }

    /* renamed from: a */
    public static void m2182a(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        if (appLovinAdDisplayListener instanceof InterfaceC1073k2) {
            AppLovinSdkUtils.runOnUiThread(new OooO(19, (InterfaceC1073k2) appLovinAdDisplayListener, str));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m2213b(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        ((InterfaceC1073k2) appLovinAdDisplayListener).onAdDisplayFailed(str);
    }

    /* renamed from: e */
    public static /* synthetic */ void m2245e(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userOverQuota(m2157a(appLovinAd), map);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m2250f(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardVerified(m2157a(appLovinAd), map);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
        }
    }

    /* renamed from: b */
    public static void m2212b(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0000OO0(appLovinAdDisplayListener, appLovinAd, 0));
    }

    /* renamed from: c */
    public static /* synthetic */ void m2229c(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adDisplayed(m2157a(appLovinAd));
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
            m2232c("adDisplayed", th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m2238d(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adHidden(m2157a(appLovinAd));
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
            m2232c("adHidden", th);
        }
    }

    /* renamed from: a */
    public static void m2181a(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0000OO0(appLovinAdDisplayListener, appLovinAd, 1));
    }

    /* renamed from: b */
    public static /* synthetic */ void m2211b(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdClickListener.adClicked(m2157a(appLovinAd));
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
            m2232c("adClicked", th);
        }
    }

    /* renamed from: e */
    public static void m2243e(MaxAdListener maxAdListener, MaxAd maxAd) {
        m2244e(maxAdListener, maxAd, false);
    }

    /* renamed from: f */
    public static void m2248f(MaxAdListener maxAdListener, MaxAd maxAd) {
        m2249f(maxAdListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m2180a(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new OooO(16, appLovinAdClickListener, appLovinAd));
    }

    /* renamed from: e */
    public static void m2244e(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O00(z, maxAdListener, maxAd, 2));
    }

    /* renamed from: f */
    public static void m2249f(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O00(z, maxAdListener, maxAd, 1));
    }

    /* renamed from: a */
    public static void m2185a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new OooO(18, appLovinAdVideoPlaybackListener, appLovinAd));
    }

    /* renamed from: c */
    public static void m2226c(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0000(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 1));
    }

    /* renamed from: d */
    public static /* synthetic */ void m2235d(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adClosedFullscreen(m2157a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m2246e(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                maxAdListener.onAdHidden(maxAd);
                return;
            } catch (Throwable th) {
                m2191a("onAdHidden", th, z);
                m2222b("maxAdHidden", th, z);
                return;
            }
        }
        maxAdListener.onAdHidden(maxAd);
    }

    /* renamed from: f */
    public static /* synthetic */ void m2251f(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                maxAdListener.onAdLoaded(maxAd);
                return;
            } catch (Throwable th) {
                m2191a(C3678sv.f11953j, th, z);
                m2222b("maxAdLoaded", th, z);
                return;
            }
        }
        maxAdListener.onAdLoaded(maxAd);
    }

    /* renamed from: a */
    public static void m2186a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d, final boolean z) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.o0000O0O
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1168q2.m2217b(appLovinAdVideoPlaybackListener, appLovinAd, d, z);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ void m2216b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackBegan(m2157a(appLovinAd));
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
        }
    }

    /* renamed from: c */
    public static void m2230c(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0000oo(appLovinAdRewardListener, appLovinAd, map, 0));
    }

    /* renamed from: a */
    public static void m2158a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0000(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 2));
    }

    /* renamed from: c */
    public static void m2227c(MaxAdListener maxAdListener, MaxAd maxAd) {
        m2228c(maxAdListener, maxAd, false);
    }

    /* renamed from: d */
    public static /* synthetic */ void m2239d(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardRejected(m2157a(appLovinAd), map);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
        }
    }

    /* renamed from: a */
    public static void m2159a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new OooOo0O.OooO0O0(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode, 9));
    }

    /* renamed from: b */
    public static /* synthetic */ void m2217b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d, boolean z) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackEnded(m2157a(appLovinAd), d, z);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
        }
    }

    /* renamed from: c */
    public static void m2228c(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O00(z, maxAdListener, maxAd, 3));
    }

    /* renamed from: a */
    public static void m2184a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0000oo(appLovinAdRewardListener, appLovinAd, map, 2));
    }

    /* renamed from: c */
    public static /* synthetic */ void m2233c(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                maxAdListener.onAdDisplayed(maxAd);
                return;
            } catch (Throwable th) {
                m2191a("onAdDisplayed", th, z);
                m2222b("maxAdDisplayed", th, z);
                return;
            }
        }
        maxAdListener.onAdDisplayed(maxAd);
    }

    /* renamed from: d */
    public static void m2236d(MaxAdListener maxAdListener, MaxAd maxAd) {
        m2237d(maxAdListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m2183a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new OooO00o(i, appLovinAdRewardListener, 2, appLovinAd));
    }

    /* renamed from: b */
    public static void m2203b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0000(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 0));
    }

    /* renamed from: d */
    public static void m2237d(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o000OO(z, (MaxAdViewAdListener) maxAdListener, maxAd, 1));
    }

    /* renamed from: a */
    public static void m2169a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        m2170a(maxAdListener, str, maxError, false);
    }

    /* renamed from: b */
    public static /* synthetic */ void m2204b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        try {
            appLovinAdViewEventListener.adFailedToDisplay(m2157a(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
        }
    }

    /* renamed from: a */
    public static void m2170a(MaxAdListener maxAdListener, String str, MaxError maxError, boolean z) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O0(z, maxAdListener, str, maxError, 1));
    }

    /* renamed from: d */
    public static /* synthetic */ void m2241d(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                return;
            } catch (Throwable th) {
                m2191a("onAdExpanded", th, z);
                m2222b("maxAdExpanded", th, z);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2197a(boolean z, MaxAdListener maxAdListener, String str, MaxError maxError) {
        if (m2234c(z)) {
            try {
                maxAdListener.onAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th) {
                m2191a(C3678sv.f11945b, th, z);
                m2222b("maxAdLoadFailed", th, z);
                return;
            }
        }
        maxAdListener.onAdLoadFailed(str, maxError);
    }

    /* renamed from: b */
    public static void m2215b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0000oo(appLovinAdRewardListener, appLovinAd, map, 1));
    }

    /* renamed from: b */
    public static /* synthetic */ void m2214b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i) {
        try {
            appLovinAdRewardListener.validationRequestFailed(m2157a(appLovinAd), i);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
        }
    }

    /* renamed from: c */
    private static boolean m2234c(boolean z) {
        return z ? f1790a : f1791b;
    }

    /* renamed from: c */
    private static void m2232c(String str, Throwable th) {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k != null) {
            c1220k.m2832E().m2148a("ListenerCallbackInvoker", str, th);
        }
    }

    /* renamed from: b */
    public static void m2207b(MaxAdListener maxAdListener, MaxAd maxAd) {
        m2208b(maxAdListener, maxAd, false);
    }

    /* renamed from: b */
    public static void m2208b(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o000OO(z, (MaxAdViewAdListener) maxAdListener, maxAd, 0));
    }

    /* renamed from: a */
    public static void m2163a(MaxAdListener maxAdListener, MaxAd maxAd) {
        m2168a(maxAdListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m2168a(MaxAdListener maxAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O00(z, maxAdListener, maxAd, 0));
    }

    /* renamed from: b */
    public static /* synthetic */ void m2224b(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                return;
            } catch (Throwable th) {
                m2191a("onAdCollapsed", th, z);
                m2222b("maxAdCollapsed", th, z);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2194a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                maxAdListener.onAdClicked(maxAd);
                return;
            } catch (Throwable th) {
                m2191a(C3678sv.f11949f, th, z);
                m2222b("maxAdClicked", th, z);
                return;
            }
        }
        maxAdListener.onAdClicked(maxAd);
    }

    /* renamed from: b */
    public static void m2210b(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o000(z, maxNativeAdListener, maxAd, 1));
    }

    /* renamed from: a */
    public static void m2164a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        m2165a(maxAdListener, maxAd, maxError, false);
    }

    /* renamed from: b */
    public static /* synthetic */ void m2225b(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                maxNativeAdListener.onNativeAdExpired(maxAd);
                return;
            } catch (Throwable th) {
                m2191a("onNativeAdExpired", th, z);
                m2222b("maxNativeAdExpired", th, z);
                return;
            }
        }
        maxNativeAdListener.onNativeAdExpired(maxAd);
    }

    /* renamed from: a */
    public static void m2165a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O0(z, maxAdListener, maxAd, maxError, 4));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2195a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        if (m2234c(z)) {
            try {
                maxAdListener.onAdDisplayFailed(maxAd, maxError);
                return;
            } catch (Throwable th) {
                m2191a("onAdDisplayFailed", th, z);
                m2222b("maxAdDisplayFailed", th, z);
                return;
            }
        }
        maxAdListener.onAdDisplayFailed(maxAd, maxError);
    }

    /* renamed from: b */
    public static /* synthetic */ void m2219b(AppLovinPostbackListener appLovinPostbackListener, String str) {
        try {
            appLovinPostbackListener.onPostbackSuccess(str);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
        }
    }

    /* renamed from: a */
    public static void m2173a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        m2174a(maxAdRevenueListener, maxAd, false);
    }

    /* renamed from: b */
    public static /* synthetic */ void m2220b(AppLovinPostbackListener appLovinPostbackListener, String str, int i) {
        try {
            appLovinPostbackListener.onPostbackFailure(str, i);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
        }
    }

    /* renamed from: a */
    public static void m2174a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0OoOo0(z, maxAdRevenueListener, maxAd, 2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2199a(boolean z, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                maxAdRevenueListener.onAdRevenuePaid(maxAd);
                return;
            } catch (Throwable th) {
                m2191a("onAdRevenuePaid", th, z);
                m2222b("maxAdPaidRevenue", th, z);
                return;
            }
        }
        maxAdRevenueListener.onAdRevenuePaid(maxAd);
    }

    /* renamed from: b */
    public static void m2206b(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new OooO(21, appLovinNativeAdLoadListener, appLovinError));
        }
    }

    /* renamed from: b */
    public static void m2205b(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new OooO(20, appLovinNativeAdEventListener, appLovinNativeAd));
        }
    }

    /* renamed from: b */
    public static void m2209b(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        m2176a(maxAdReviewListener, str, maxAd, false);
    }

    /* renamed from: b */
    private static void m2221b(String str, Throwable th) {
        C1240o.m3204c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th);
    }

    /* renamed from: b */
    private static void m2222b(String str, Throwable th, boolean z) {
        if (C1220k.f2089D0 != null) {
            C1220k.f2089D0.m2832E().m2151a("ListenerCallbackInvoker", str, th, CollectionUtils.hashMap("details", "isPublisherCallback=" + z));
        }
    }

    /* renamed from: a */
    public static void m2171a(MaxAdRequestListener maxAdRequestListener, String str) {
        m2172a(maxAdRequestListener, str, false);
    }

    /* renamed from: a */
    public static void m2172a(MaxAdRequestListener maxAdRequestListener, String str, boolean z) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0OoOo0(z, maxAdRequestListener, str, 1));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2198a(boolean z, MaxAdRequestListener maxAdRequestListener, String str) {
        if (m2234c(z)) {
            try {
                maxAdRequestListener.onAdRequestStarted(str);
                return;
            } catch (Throwable th) {
                m2191a("onAdRequestStarted", th, z);
                m2222b("maxAdRequestStarted", th, z);
                return;
            }
        }
        maxAdRequestListener.onAdRequestStarted(str);
    }

    /* renamed from: a */
    public static void m2162a(MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2, boolean z) {
        if (maxAd == null || maxAd2 == null || maxAdExpirationListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O0(z, maxAdExpirationListener, maxAd, maxAd2, 2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2193a(boolean z, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        if (m2234c(z)) {
            try {
                maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
                return;
            } catch (Throwable th) {
                m2191a("onExpiredAdReloaded", th, z);
                m2222b("maxExpiredAdReloaded", th, z);
                return;
            }
        }
        maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
    }

    /* renamed from: a */
    public static void m2166a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        m2167a(maxAdListener, maxAd, maxReward, false);
    }

    /* renamed from: a */
    public static void m2167a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O0(z, (MaxRewardedAdListener) maxAdListener, maxAd, maxReward, 5));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2196a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        if (m2234c(z)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                return;
            } catch (Throwable th) {
                m2191a("onUserRewarded", th, z);
                m2222b("maxRewardedUser", th, z);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
    }

    /* renamed from: a */
    public static void m2178a(MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O0(z, maxNativeAdListener, maxNativeAdView, maxAd, 3));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2201a(boolean z, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                return;
            } catch (Throwable th) {
                m2191a("onNativeAdLoaded", th, z);
                m2222b("maxNativeAdLoaded", th, z);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
    }

    /* renamed from: a */
    public static void m2179a(MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError, boolean z) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o0000O0(z, maxNativeAdListener, str, maxError, 0));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2202a(boolean z, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        if (m2234c(z)) {
            try {
                maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th) {
                m2191a("onNativeAdLoadFailed", th, z);
                m2222b("maxNativeAdLoadFailed", th, z);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
    }

    /* renamed from: a */
    public static void m2177a(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new o000(z, maxNativeAdListener, maxAd, 0));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2200a(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (m2234c(z)) {
            try {
                maxNativeAdListener.onNativeAdClicked(maxAd);
                return;
            } catch (Throwable th) {
                m2191a("onNativeAdClicked", th, z);
                m2222b("maxNativeAdClicked", th, z);
                return;
            }
        }
        maxNativeAdListener.onNativeAdClicked(maxAd);
    }

    /* renamed from: a */
    public static void m2188a(AppLovinPostbackListener appLovinPostbackListener, String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new OooO(17, appLovinPostbackListener, str));
        }
    }

    /* renamed from: a */
    public static void m2189a(AppLovinPostbackListener appLovinPostbackListener, String str, int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new OooO00o(i, appLovinPostbackListener, 1, str));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2161a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        try {
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
            m2232c("nativeAdLoadFailed", th);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2160a(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        try {
            appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
            m2232c("nativeAdClicked", th);
        }
    }

    /* renamed from: a */
    public static void m2176a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd, boolean z) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new androidx.webkit.OooO00o(maxAdReviewListener, str, maxAd, 14));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2175a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        try {
            maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
        } catch (Throwable th) {
            C1240o.m3204c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
            m2232c("adReviewCreativeIdGenerated", th);
        }
    }

    /* renamed from: a */
    private static AppLovinAd m2157a(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    /* renamed from: a */
    private static void m2191a(String str, Throwable th, boolean z) {
        if (z) {
            m2221b(str, th);
        } else {
            m2190a(str, th);
        }
    }

    /* renamed from: a */
    private static void m2190a(String str, Throwable th) {
        C1240o.m3202b("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th);
    }
}

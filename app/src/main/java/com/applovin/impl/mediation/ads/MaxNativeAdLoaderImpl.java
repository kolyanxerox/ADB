package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0956a3;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1060j;
import com.applovin.impl.C1156p6;
import com.applovin.impl.EnumC1050i;
import com.applovin.impl.InterfaceC1185s1;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.sdk.C1205a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends AbstractC1118a implements C1205a.a, C1060j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* renamed from: a */
    private final C1115c f1325a;

    /* renamed from: b */
    private String f1326b;

    /* renamed from: c */
    private String f1327c;

    /* renamed from: d */
    private EnumC1050i f1328d;

    /* renamed from: e */
    private final Object f1329e;

    /* renamed from: f */
    private MaxNativeAdListener f1330f;

    /* renamed from: g */
    private final Map f1331g;

    /* renamed from: h */
    private final Set f1332h;

    /* renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$a */
    public class RunnableC1113a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxNativeAd f1333a;

        /* renamed from: b */
        final /* synthetic */ List f1334b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f1335c;

        public RunnableC1113a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f1333a = maxNativeAd;
            this.f1334b = list;
            this.f1335c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1333a.prepareForInteraction(this.f1334b, this.f1335c)) {
                return;
            }
            C1240o.m3207h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$b */
    public class RunnableC1114b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxNativeAdView f1337a;

        /* renamed from: b */
        final /* synthetic */ C0956a3 f1338b;

        /* renamed from: c */
        final /* synthetic */ MaxNativeAd f1339c;

        public RunnableC1114b(MaxNativeAdView maxNativeAdView, C0956a3 c0956a3, MaxNativeAd maxNativeAd) {
            this.f1337a = maxNativeAdView;
            this.f1338b = c0956a3;
            this.f1339c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1240o c1240o = MaxNativeAdLoaderImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m3211a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f1337a);
            }
            MaxNativeAdLoaderImpl.this.sdk.m2933z().m551d(this.f1338b);
            this.f1337a.render(this.f1338b, MaxNativeAdLoaderImpl.this.f1325a, MaxNativeAdLoaderImpl.this.sdk);
            this.f1339c.setNativeAdView(this.f1337a);
            if (this.f1339c.prepareForInteraction(this.f1337a.getClickableViews(), this.f1337a)) {
                return;
            }
            this.f1339c.prepareViewForInteraction(this.f1337a);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$c */
    public class C1115c implements AbstractC1118a.a {
        private C1115c() {
        }

        /* renamed from: a */
        public /* synthetic */ void m1668a(MaxAd maxAd) {
            C1240o c1240o = MaxNativeAdLoaderImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m3211a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            C0956a3 c0956a3 = (C0956a3) maxAd;
            c0956a3.m911g(MaxNativeAdLoaderImpl.this.f1326b);
            c0956a3.m909f(MaxNativeAdLoaderImpl.this.f1327c);
            synchronized (MaxNativeAdLoaderImpl.this.f1329e) {
                MaxNativeAdLoaderImpl.this.f1332h.add(c0956a3);
            }
            MaxNativeAdView maxNativeAdViewM1655a = MaxNativeAdLoaderImpl.this.m1655a(c0956a3.m3512J());
            if (maxNativeAdViewM1655a == null) {
                C1240o c1240o2 = MaxNativeAdLoaderImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.m3211a(maxNativeAdLoaderImpl2.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                C1240o c1240o3 = MaxNativeAdLoaderImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl3.logger.m3211a(maxNativeAdLoaderImpl3.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f1330f);
                }
                AbstractC1168q2.m2178a(MaxNativeAdLoaderImpl.this.f1330f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.m1656a(c0956a3);
                return;
            }
            m1669a(maxNativeAdViewM1655a);
            MaxNativeAdLoaderImpl.this.m1661a(maxNativeAdViewM1655a, c0956a3, c0956a3.getNativeAd());
            C1240o c1240o4 = MaxNativeAdLoaderImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.m3211a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewM1655a + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f1330f);
            }
            AbstractC1168q2.m2178a(MaxNativeAdLoaderImpl.this.f1330f, maxNativeAdViewM1655a, maxAd, true);
            MaxNativeAdLoaderImpl.this.m1656a(c0956a3);
            MaxNativeAdLoaderImpl.this.m1660a(maxNativeAdViewM1655a);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            C1240o c1240o = MaxNativeAdLoaderImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m3211a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f1330f);
            }
            AbstractC1168q2.m2177a(MaxNativeAdLoaderImpl.this.f1330f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.m1655a(((MaxErrorImpl) maxError).getLoadTag());
            C1240o c1240o = MaxNativeAdLoaderImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m3211a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f1330f);
            }
            AbstractC1168q2.m2179a(MaxNativeAdLoaderImpl.this.f1330f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new OooO(0, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C1240o c1240o = MaxNativeAdLoaderImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m3211a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            AbstractC1168q2.m2174a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ C1115c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, RunnableC1113a runnableC1113a) {
            this();
        }

        /* renamed from: a */
        private void m1669a(MaxNativeAdView maxNativeAdView) {
            C0956a3 c0956a3M1677b;
            C1119b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (c0956a3M1677b = adViewTracker.m1677b()) == null) {
                return;
            }
            C1240o c1240o = MaxNativeAdLoaderImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m3211a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(c0956a3M1677b);
        }
    }

    public MaxNativeAdLoaderImpl(String str, C1220k c1220k) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", c1220k);
        this.f1325a = new C1115c(this, null);
        this.f1328d = EnumC1050i.PUBLISHER_INITIATED;
        this.f1329e = new Object();
        this.f1331g = new HashMap();
        this.f1332h = new HashSet();
        c1220k.m2903j().m1028a(this);
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1118a
    public void destroy() {
        this.f1330f = null;
        this.sdk.m2903j().m1029b(this);
        synchronized (this.f1329e) {
            this.f1331g.clear();
            this.f1332h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f1326b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((C0956a3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (C1240o.m3200a()) {
                this.logger.m3214b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        C1119b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.m1678c();
        } else if (C1240o.m3200a()) {
            this.logger.m3214b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f1325a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        m1662a(lowerCase, maxNativeAdView);
        this.sdk.m2860X().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f1328d, this.localExtraParameters, this.extraParameters, C1220k.m2824o(), this.f1325a);
    }

    @Override // com.applovin.impl.sdk.C1205a.a
    public void onAdExpired(InterfaceC1185s1 interfaceC1185s1) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + interfaceC1185s1 + "), listener=" + this.f1330f);
        }
        AbstractC1168q2.m2210b(this.f1330f, (MaxAd) interfaceC1185s1, true);
    }

    @Override // com.applovin.impl.C1060j.b
    public void onCreativeIdGenerated(String str, String str2) {
        C0956a3 c0956a3;
        Iterator it = this.f1332h.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0956a3 = null;
                break;
            } else {
                c0956a3 = (C0956a3) it.next();
                if (c0956a3.m3518P().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        if (c0956a3 != null) {
            c0956a3.m3536h(str2);
            AbstractC1168q2.m2209b(this.adReviewListener, str2, c0956a3);
            synchronized (this.f1329e) {
                this.f1332h.remove(c0956a3);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        C0956a3 c0956a3 = (C0956a3) maxAd;
        MaxNativeAd nativeAd = c0956a3.getNativeAd();
        if (nativeAd == null) {
            if (C1240o.m3200a()) {
                this.logger.m3214b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        c0956a3.m99a(viewGroup);
        this.sdk.m2933z().m551d(c0956a3);
        m1674a((AbstractC1266v2) c0956a3);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new C1119b(c0956a3, viewGroup, this.f1325a, this.sdk));
        RunnableC1113a runnableC1113a = new RunnableC1113a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnableC1113a);
        } else {
            this.sdk.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.sdk, "renderMaxNativeAd", runnableC1113a), C0987b6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof C0956a3)) {
            C1240o.m3207h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            C1240o.m3207h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        C0956a3 c0956a3 = (C0956a3) maxAd;
        MaxNativeAd nativeAd = c0956a3.getNativeAd();
        if (nativeAd == null) {
            if (C1240o.m3200a()) {
                this.logger.m3214b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.m2866a(AbstractC1144o3.f1614K7)).booleanValue()) {
            C1240o.m3207h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        m1661a(maxNativeAdView, c0956a3, nativeAd);
        m1660a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        AbstractC1078k7.m1217b(str, this.tag);
        this.f1327c = str;
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1118a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof EnumC1050i)) {
            this.f1328d = (EnumC1050i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f1330f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f1326b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f1330f + ", revenueListener=" + this.revenueListener + '}';
    }

    /* renamed from: a */
    public void m1656a(C0956a3 c0956a3) {
        if (c0956a3.m103o0().get()) {
            return;
        }
        this.sdk.m2895f().m2480a(c0956a3, this);
    }

    /* renamed from: a */
    private void m1662a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f1329e) {
            this.f1331g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        C1119b adViewTracker;
        if (maxAd instanceof C0956a3) {
            C0956a3 c0956a3 = (C0956a3) maxAd;
            if (c0956a3.m106r0()) {
                if (C1240o.m3200a()) {
                    this.logger.m3211a(this.tag, "Native ad (" + c0956a3 + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.f1329e) {
                this.f1332h.remove(c0956a3);
            }
            MaxNativeAdView maxNativeAdViewM101m0 = c0956a3.m101m0();
            if (maxNativeAdViewM101m0 != null && (adViewTracker = maxNativeAdViewM101m0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.m1677b())) {
                maxNativeAdViewM101m0.recycle();
            }
            MaxNativeAd nativeAd = c0956a3.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().m1676a();
            }
            this.sdk.m2895f().m2478a(c0956a3);
            this.sdk.m2860X().destroyAd(c0956a3);
            if (this.sdk.m2851R() != null) {
                this.sdk.m2851R().m1753c(this.adUnitId, c0956a3.m3512J());
                return;
            } else {
                this.sdk.m2849Q().m1703c(this.adUnitId, c0956a3.m3512J());
                return;
            }
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* renamed from: a */
    public MaxNativeAdView m1655a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f1329e) {
            maxNativeAdView = (MaxNativeAdView) this.f1331g.remove(str);
        }
        return maxNativeAdView;
    }

    /* renamed from: a */
    public void m1661a(MaxNativeAdView maxNativeAdView, C0956a3 c0956a3, MaxNativeAd maxNativeAd) {
        c0956a3.m100a(maxNativeAdView);
        m1674a((AbstractC1266v2) c0956a3);
        RunnableC1114b runnableC1114b = new RunnableC1114b(maxNativeAdView, c0956a3, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnableC1114b);
        } else {
            this.sdk.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.sdk, "renderMaxNativeAd", runnableC1114b), C0987b6.b.MEDIATION);
        }
    }

    /* renamed from: a */
    public void m1660a(MaxNativeAdView maxNativeAdView) {
        C1119b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.m1678c();
    }
}

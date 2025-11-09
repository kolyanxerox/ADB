package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1208c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.h2 */
/* loaded from: classes.dex */
public class C1043h2 {

    /* renamed from: b */
    protected final C1220k f819b;

    /* renamed from: c */
    protected final AppLovinAdServiceImpl f820c;

    /* renamed from: d */
    private AppLovinAd f821d;

    /* renamed from: e */
    private String f822e;

    /* renamed from: f */
    private SoftReference f823f;

    /* renamed from: h */
    private volatile String f825h;

    /* renamed from: j */
    private volatile double f827j;

    /* renamed from: a */
    public final Map f818a = Collections.synchronizedMap(new HashMap());

    /* renamed from: g */
    private final Object f824g = new Object();

    /* renamed from: i */
    private volatile boolean f826i = false;

    /* renamed from: com.applovin.impl.h2$a */
    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            C1043h2.this.f819b.m2847O();
            if (C1240o.m3200a()) {
                C1043h2.this.f819b.m2847O().m3214b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            C1043h2.this.f819b.m2847O();
            if (C1240o.m3200a()) {
                C1043h2.this.f819b.m2847O().m3214b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            C1043h2.this.f819b.m2847O();
            if (C1240o.m3200a()) {
                C1043h2.this.f819b.m2847O().m3211a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C1043h2.this.f819b.m2847O();
            if (C1240o.m3200a()) {
                C1043h2.this.f819b.m2847O().m3214b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        }
    }

    /* renamed from: com.applovin.impl.h2$c */
    public class c implements InterfaceC1073k2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a */
        private final AppLovinAd f831a;

        /* renamed from: b */
        private final AppLovinAdDisplayListener f832b;

        /* renamed from: c */
        private final AppLovinAdClickListener f833c;

        /* renamed from: d */
        private final AppLovinAdVideoPlaybackListener f834d;

        /* renamed from: e */
        private final AppLovinAdRewardListener f835e;

        public /* synthetic */ c(C1043h2 c1043h2, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        /* renamed from: a */
        private void m879a(AbstractC1207b abstractC1207b, String str) {
            int i;
            C1043h2.this.f819b.m2847O();
            if (C1240o.m3200a()) {
                C1043h2.this.f819b.m2847O().m3211a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strM866b = C1043h2.this.m866b();
            if (!StringUtils.isValidString(strM866b) || !C1043h2.this.f826i) {
                C1043h2.this.f819b.m2847O();
                if (C1240o.m3200a()) {
                    C1240o c1240oM2847O = C1043h2.this.f819b.m2847O();
                    StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("Invalid reward state - result: ", strM866b, " and wasFullyEngaged: ");
                    sbOooOoO0.append(C1043h2.this.f826i);
                    c1240oM2847O.m3214b("IncentivizedAdController", sbOooOoO0.toString());
                }
                C1043h2.this.f819b.m2847O();
                if (C1240o.m3200a()) {
                    C1043h2.this.f819b.m2847O().m3211a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                abstractC1207b.m2591d();
                if (C1043h2.this.f826i) {
                    C1043h2.this.f819b.m2847O();
                    if (C1240o.m3200a()) {
                        C1043h2.this.f819b.m2847O().m3214b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    C1043h2.this.f819b.m2847O();
                    if (C1240o.m3200a()) {
                        C1043h2.this.f819b.m2847O().m3214b("IncentivizedAdController", "Ad closed prematurely from source: ".concat(str));
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                abstractC1207b.m2575a(C1085l4.m1327a(str));
                C1043h2.this.f819b.m2847O();
                if (C1240o.m3200a()) {
                    C1043h2.this.f819b.m2847O().m3211a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                AbstractC1168q2.m2183a(this.f835e, abstractC1207b, i);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(C1043h2.this.f827j));
                CollectionUtils.putStringIfValid("source", str, mapHashMap);
                C1043h2.this.f819b.m2897g().m706a(C0993c2.f547w, abstractC1207b, mapHashMap);
            }
            if (abstractC1207b.m2547L0().getAndSet(true)) {
                return;
            }
            C1043h2.this.f819b.m2847O();
            if (C1240o.m3200a()) {
                C1043h2.this.f819b.m2847O().m3211a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            C1043h2.this.f819b.m2918r0().m403a((AbstractRunnableC1036g5) new C1077k6(abstractC1207b, C1043h2.this.f819b), C0987b6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            AbstractC1168q2.m2180a(this.f833c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            AbstractC1168q2.m2181a(this.f832b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdM2654f = appLovinAd instanceof C1208c ? ((C1208c) appLovinAd).m2654f() : appLovinAd;
            if (appLovinAdM2654f instanceof AbstractC1207b) {
                AbstractC1207b abstractC1207b = (AbstractC1207b) appLovinAdM2654f;
                m879a(abstractC1207b, m878a(abstractC1207b, false));
            } else {
                if (appLovinAdM2654f == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdM2654f;
                }
                C1043h2.this.f819b.m2847O();
                if (C1240o.m3200a()) {
                    C1043h2.this.f819b.m2847O().m3214b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            C1043h2.this.m858a(appLovinAdM2654f);
            C1043h2.this.f819b.m2847O();
            if (C1240o.m3200a()) {
                C1043h2.this.f819b.m2847O().m3211a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            AbstractC1168q2.m2212b(this.f832b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.InterfaceC1073k2
        public void onAdDisplayFailed(String str) {
            String str2;
            ?? r0 = this.f831a;
            boolean z = r0 instanceof C1208c;
            AbstractC1207b abstractC1207bM2654f = r0;
            if (z) {
                abstractC1207bM2654f = ((C1208c) r0).m2654f();
            }
            boolean z2 = this.f832b instanceof InterfaceC1073k2;
            if (abstractC1207bM2654f instanceof AbstractC1207b) {
                AbstractC1207b abstractC1207b = abstractC1207bM2654f;
                m879a(abstractC1207b, m878a(abstractC1207b, StringUtils.isValidString(str)));
            } else {
                if (abstractC1207bM2654f == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + abstractC1207bM2654f;
                }
                C1043h2.this.f819b.m2847O();
                if (C1240o.m3200a()) {
                    C1043h2.this.f819b.m2847O().m3214b("IncentivizedAdController", androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder("Received `"), z2 ? "adDisplayFailed" : "adHidden", "` callback for ", str2));
                }
            }
            C1043h2.this.m858a(abstractC1207bM2654f);
            if (z2) {
                AbstractC1168q2.m2182a(this.f832b, str);
            } else {
                AbstractC1168q2.m2212b(this.f832b, this.f831a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            C1043h2.this.m863a("quota_exceeded");
            AbstractC1168q2.m2215b(this.f835e, appLovinAd, map);
            C1043h2.this.f819b.m2897g().m706a(C0993c2.f545v, (AbstractC1207b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            C1043h2.this.m863a("rejected");
            AbstractC1168q2.m2184a(this.f835e, appLovinAd, map);
            C1043h2.this.f819b.m2897g().m706a(C0993c2.f545v, (AbstractC1207b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            C1043h2.this.m863a("accepted");
            AbstractC1168q2.m2230c(this.f835e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C1043h2.this.m863a("network_timeout");
            AbstractC1168q2.m2183a(this.f835e, appLovinAd, i);
            C1043h2.this.f819b.m2897g().m706a(C0993c2.f545v, (AbstractC1207b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            AbstractC1168q2.m2185a(this.f834d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            AppLovinAd appLovinAdM2654f = appLovinAd instanceof C1208c ? ((C1208c) appLovinAd).m2654f() : appLovinAd;
            boolean z2 = (appLovinAdM2654f instanceof AbstractC1207b) && ((AbstractC1207b) appLovinAdM2654f).m2556S0();
            C1043h2 c1043h2 = C1043h2.this;
            if (z2) {
                d = 100.0d;
            }
            c1043h2.f827j = d;
            C1043h2.this.f826i = z || z2;
            AbstractC1168q2.m2186a(this.f834d, appLovinAd, C1043h2.this.f827j, C1043h2.this.f826i);
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f831a = appLovinAd;
            this.f832b = appLovinAdDisplayListener;
            this.f833c = appLovinAdClickListener;
            this.f834d = appLovinAdVideoPlaybackListener;
            this.f835e = appLovinAdRewardListener;
        }

        /* renamed from: a */
        private String m878a(AbstractC1207b abstractC1207b, boolean z) {
            if (StringUtils.isValidString(abstractC1207b.m2536F())) {
                return abstractC1207b.m2536F();
            }
            if (z) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public C1043h2(String str, AppLovinSdk appLovinSdk) {
        this.f819b = appLovinSdk.m3943a();
        this.f820c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f822e = str;
    }

    /* renamed from: e */
    private void m869e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f823f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    /* renamed from: d */
    public boolean m875d() {
        return this.f821d != null;
    }

    /* renamed from: c */
    public String m874c() {
        return this.f822e;
    }

    /* renamed from: com.applovin.impl.h2$b */
    public class b implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final AppLovinAdLoadListener f829a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f829a = appLovinAdLoadListener;
        }

        /* renamed from: a */
        public /* synthetic */ void m877a(AppLovinAd appLovinAd) {
            try {
                this.f829a.adReceived(appLovinAd);
            } catch (Throwable th) {
                C1240o.m3204c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                C1043h2.this.f819b.m2832E().m2148a("IncentivizedAdController", "adLoaded", th);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            C1043h2.this.f821d = appLovinAd;
            if (this.f829a != null) {
                AppLovinSdkUtils.runOnUiThread(new OooO(1, this, appLovinAd));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            if (this.f829a != null) {
                AppLovinSdkUtils.runOnUiThread(new oo000o(this, i, 0));
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m876a(int i) {
            try {
                this.f829a.failedToReceiveAd(i);
            } catch (Throwable th) {
                C1240o.m3204c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                C1043h2.this.f819b.m2832E().m2148a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    /* renamed from: b */
    public void m873b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f819b.m2847O();
        if (C1240o.m3200a()) {
            this.f819b.m2847O().m3211a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f823f = new SoftReference(appLovinAdLoadListener);
        if (m875d()) {
            C1240o.m3207h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f821d);
                return;
            }
            return;
        }
        m862a(new b(appLovinAdLoadListener));
    }

    /* renamed from: a */
    private void m862a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f820c.loadNextIncentivizedAd(this.f822e, appLovinAdLoadListener);
    }

    /* renamed from: a */
    private void m859a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f821d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            m855a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            C1240o.m3207h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            m869e();
        }
    }

    /* renamed from: b */
    public void m871b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m850a();
        }
        m859a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: b */
    public void m872b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m850a();
        }
        m860a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    private void m860a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f821d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            m856a(appLovinAdImpl2, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            C1240o.m3207h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            m869e();
        }
    }

    /* renamed from: b */
    public String m866b() {
        String str;
        synchronized (this.f824g) {
            str = this.f825h;
        }
        return str;
    }

    /* renamed from: a */
    private void m857a(AbstractC1207b abstractC1207b, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f819b.m2918r0().m403a((AbstractRunnableC1036g5) new C1172q6(abstractC1207b, appLovinAdRewardListener, this.f819b), C0987b6.b.OTHER);
    }

    /* renamed from: a */
    public void m863a(String str) {
        synchronized (this.f824g) {
            this.f825h = str;
        }
    }

    /* renamed from: a */
    public void m870a(String str, Object obj) {
        this.f818a.put(str, obj);
    }

    /* renamed from: a */
    private void m855a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapM675a = AbstractC1013e2.m675a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", mapM675a);
        this.f819b.m2897g().m576d(C0993c2.f533p, mapM675a);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdM1165a = AbstractC1078k7.m1165a(appLovinAdImpl, this.f819b);
        String strM852a = m852a(appLovinAdM1165a, appLovinAdImpl);
        if (StringUtils.isValidString(strM852a)) {
            m861a(appLovinAdImpl, strM852a, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f819b.m2934z0(), context);
        for (String str : this.f818a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f818a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdM1165a);
        m857a((AbstractC1207b) appLovinAdM1165a, cVar);
    }

    /* renamed from: a */
    private void m856a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapM675a = AbstractC1013e2.m675a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", mapM675a);
        this.f819b.m2897g().m576d(C0993c2.f533p, mapM675a);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdM1165a = AbstractC1078k7.m1165a(appLovinAdImpl, this.f819b);
        String strM852a = m852a(appLovinAdM1165a, appLovinAdImpl);
        if (StringUtils.isValidString(strM852a)) {
            m861a(appLovinAdImpl, strM852a, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f819b.m2934z0(), context);
        for (String str : this.f818a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f818a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdM1165a, viewGroup, lifecycle);
        m857a((AbstractC1207b) appLovinAdM1165a, cVar);
    }

    /* renamed from: a */
    private String m852a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            C1240o.m3207h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        C1240o.m3207h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    /* renamed from: a */
    private void m861a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, InterfaceC1073k2 interfaceC1073k2) {
        AbstractC1168q2.m2186a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        AbstractC1168q2.m2182a(interfaceC1073k2, str);
        Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", mapM675a);
        CollectionUtils.putStringIfValid("error_message", str, mapM675a);
        this.f819b.m2897g().m576d(C0993c2.f539s, mapM675a);
    }

    /* renamed from: a */
    public void m858a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f821d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof C1208c)) {
            if (appLovinAd == appLovinAd2) {
                this.f821d = null;
            }
        } else {
            C1208c c1208c = (C1208c) appLovinAd2;
            if (c1208c.m2654f() == null || appLovinAd == c1208c.m2654f()) {
                this.f821d = null;
            }
        }
    }

    /* renamed from: a */
    private AppLovinAdRewardListener m850a() {
        return new a();
    }
}

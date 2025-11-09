package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractC1014e3;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1249t3;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0958a5;
import com.applovin.impl.C0986b5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1037g6;
import com.applovin.impl.C1044h3;
import com.applovin.impl.C1087l6;
import com.applovin.impl.C1153p3;
import com.applovin.impl.C1169q3;
import com.applovin.impl.C1170q4;
import com.applovin.impl.C1181r6;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1284x2;
import com.applovin.impl.C1286x4;
import com.applovin.impl.C1302z2;
import com.applovin.impl.C1304z4;
import com.applovin.impl.C1305z5;
import com.applovin.impl.EnumC1050i;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1216g;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1223n;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3069e9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1220k f1252a;

    /* renamed from: b */
    private final C1240o f1253b;

    /* renamed from: c */
    private final C1304z4 f1254c;

    /* renamed from: d */
    private final AtomicReference f1255d = new AtomicReference();

    /* renamed from: com.applovin.impl.mediation.MediationServiceImpl$a */
    public static /* synthetic */ class C1103a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1256a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f1256a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1256a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1256a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1256a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1256a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1256a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.MediationServiceImpl$b */
    public class C1104b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, AbstractC1118a.a {

        /* renamed from: a */
        private final AbstractC1266v2 f1257a;

        /* renamed from: b */
        private AbstractC1118a.a f1258b;

        public C1104b(AbstractC1266v2 abstractC1266v2, AbstractC1118a.a aVar) {
            this.f1257a = abstractC1266v2;
            this.f1258b = aVar;
        }

        /* renamed from: a */
        public void m1558a(AbstractC1118a.a aVar) {
            this.f1258b = aVar;
        }

        /* renamed from: b */
        public void m1562b(MaxAd maxAd, Bundle bundle) {
            this.f1257a.mo3530a(bundle);
            AbstractC1168q2.m2207b(this.f1258b, maxAd);
        }

        /* renamed from: c */
        public void m1563c(MaxAd maxAd, Bundle bundle) {
            this.f1257a.mo3530a(bundle);
            C1240o unused = MediationServiceImpl.this.f1253b;
            if (C1240o.m3200a()) {
                MediationServiceImpl.this.f1253b.m3211a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f1257a, this.f1258b);
            if (!((Boolean) MediationServiceImpl.this.f1252a.m2866a(AbstractC1144o3.f1652m8)).booleanValue() || this.f1257a.m3539u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f1252a.m2907l().m2729a(this.f1257a, C1216g.c.SHOW);
                MediationServiceImpl.this.f1252a.m2923u().m2779b(this.f1257a, "DID_DISPLAY");
                MediationServiceImpl.this.f1252a.m2913p().maybeSendAdEvent(this.f1257a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f1252a.m2839I().m3042a(this.f1257a);
                }
                AbstractC1168q2.m2227c(this.f1258b, maxAd);
            }
        }

        /* renamed from: d */
        public void m1564d(MaxAd maxAd, Bundle bundle) {
            this.f1257a.mo3530a(bundle);
            AbstractC1168q2.m2236d(this.f1258b, maxAd);
        }

        /* renamed from: e */
        public void m1565e(MaxAd maxAd, Bundle bundle) {
            this.f1257a.mo3530a(bundle);
            MediationServiceImpl.this.f1252a.m2907l().m2729a(this.f1257a, C1216g.c.HIDE);
            MediationServiceImpl.this.m1534a(this.f1257a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new OooOOOO(1, this, maxAd), maxAd instanceof C1302z2 ? ((C1302z2) maxAd).m3848f0() : 0L);
        }

        /* renamed from: f */
        public void m1566f(MaxAd maxAd, Bundle bundle) {
            this.f1257a.mo3530a(bundle);
            this.f1257a.m3527Y();
            MediationServiceImpl.this.f1252a.m2907l().m2729a(this.f1257a, C1216g.c.LOAD);
            MediationServiceImpl.this.m1555b(this.f1257a);
            AbstractC1168q2.m2248f(this.f1258b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            m1559a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            m1562b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            m1560a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            m1563c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            m1564d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            m1565e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f1257a.m3527Y();
            MediationServiceImpl.this.m1556b(this.f1257a, maxError, this.f1258b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            m1566f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            m1561a(maxAd, maxReward, (Bundle) null);
        }

        /* renamed from: a */
        public /* synthetic */ void m1557a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f1252a.m2839I().m3047b(maxAd);
            }
            AbstractC1168q2.m2243e(this.f1258b, maxAd);
        }

        /* renamed from: a */
        public void m1559a(MaxAd maxAd, Bundle bundle) {
            this.f1257a.mo3530a(bundle);
            MediationServiceImpl.this.f1252a.m2907l().m2729a(this.f1257a, C1216g.c.CLICK);
            MediationServiceImpl.this.m1535a(this.f1257a, this.f1258b);
            AbstractC1168q2.m2163a((MaxAdListener) this.f1258b, maxAd);
        }

        /* renamed from: a */
        public void m1560a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f1257a.mo3530a(bundle);
            MediationServiceImpl.this.m1537a(this.f1257a, maxError, this.f1258b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof C1302z2)) {
                ((C1302z2) maxAd).m3847d0();
            }
        }

        /* renamed from: a */
        public void m1561a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f1257a.mo3530a(bundle);
            AbstractC1168q2.m2166a(this.f1258b, maxAd, maxReward);
            MediationServiceImpl.this.f1252a.m2918r0().m403a((AbstractRunnableC1036g5) new C1087l6((C1302z2) maxAd, MediationServiceImpl.this.f1252a), C0987b6.b.OTHER);
        }
    }

    public MediationServiceImpl(C1220k c1220k) {
        this.f1252a = c1220k;
        this.f1253b = c1220k.m2847O();
        this.f1254c = new C1304z4(c1220k);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(final C0986b5 c0986b5, Context context, final C0958a5.a aVar) {
        if (c0986b5 == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        C1284x2 c1284x2M384u = c0986b5.m384u();
        final String strM3642b = c1284x2M384u.m3642b();
        final MaxAdFormat maxAdFormatM3640a = c1284x2M384u.m3640a();
        C0958a5 c0958a5M3871b = this.f1254c.m3871b(c0986b5, strM3642b, maxAdFormatM3640a);
        if (c0958a5M3871b != null) {
            aVar.mo120a(C0958a5.m109a(c0958a5M3871b));
            return;
        }
        final C1129h c1129hM1781a = this.f1252a.m2854T().m1781a(c0986b5, c0986b5.m382A());
        if (c1129hM1781a == null) {
            aVar.mo120a(C0958a5.m112a(c0986b5, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        C1170q4 c1170q4 = new C1170q4("SignalCollection:" + c0986b5.m899c());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = C1170q4.f1799i;
        c1170q4.m2269a(executor, new C1170q4.b() { // from class: com.applovin.impl.mediation.OooO00o
            @Override // com.applovin.impl.C1170q4.b
            /* renamed from: a */
            public final void mo3a(boolean z, Object obj, Object obj2) {
                MediationServiceImpl mediationServiceImpl = this.f15620OooOo0O;
                C1129h c1129h = c1129hM1781a;
                C0986b5 c0986b52 = c0986b5;
                C0958a5.a aVar2 = aVar;
                mediationServiceImpl.m1526a(jElapsedRealtime, c1129h, strM3642b, c0986b52, maxAdFormatM3640a, aVar2, z, (String) obj, (MaxError) obj2);
            }
        });
        C1037g6.m799a(c0986b5.m916m(), c1170q4, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + c0986b5.m899c() + ") timed out collecting signal"), "MediationService", this.f1252a);
        Activity activityM2926v0 = context instanceof Activity ? (Activity) context : this.f1252a.m2926v0();
        MaxAdapterParametersImpl maxAdapterParametersImplM1521a = MaxAdapterParametersImpl.m1521a(c0986b5, strM3642b, maxAdFormatM3640a);
        if (c0986b5.m386w()) {
            C1170q4 c1170q4M1769a = this.f1252a.m2852S().m1769a(c0986b5, activityM2926v0);
            c1170q4M1769a.m2270a(executor, new OooO0O0(this, c1170q4, c1129hM1781a, maxAdapterParametersImplM1521a, c0986b5, activityM2926v0, 0));
            c1170q4M1769a.m2268a(executor, new OooO0OO(this, c1129hM1781a, c1170q4, 0));
            return;
        }
        if (c0986b5.m387x()) {
            C1170q4 c1170q4M1769a2 = this.f1252a.m2852S().m1769a(c0986b5, activityM2926v0);
            if (c1170q4M1769a2.m2274d() && !c0986b5.m389z()) {
                if (C1240o.m3200a()) {
                    this.f1253b.m3214b("MediationService", "Skip collecting signal for failed-initialized adapter: " + c1129hM1781a.m1837g());
                }
                c1170q4.m2266a(new MaxErrorImpl("Could not initialize adapter: " + ((String) c1170q4M1769a2.m2267a())));
                return;
            }
        }
        if (C1240o.m3200a()) {
            this.f1253b.m3211a("MediationService", "Collecting signal for adapter: " + c1129hM1781a.m1837g());
        }
        c1129hM1781a.m1827a(maxAdapterParametersImplM1521a, c0986b5, activityM2926v0, c1170q4);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof AbstractC1266v2) {
            if (C1240o.m3200a()) {
                this.f1253b.m3215d("MediationService", "Destroying " + maxAd);
            }
            AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) maxAd;
            C1129h c1129hM3504A = abstractC1266v2.m3504A();
            if (c1129hM3504A != null) {
                c1129hM3504A.m1823a();
                abstractC1266v2.m3538t();
            }
            this.f1252a.m2903j().m1030c(abstractC1266v2.m3518P());
            this.f1252a.m2907l().m2729a(abstractC1266v2, C1216g.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f1255d.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, EnumC1050i enumC1050i, Map<String, Object> map, Map<String, Object> map2, Context context, AbstractC1118a.a aVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f1252a.m2857V())) {
            C1240o.m3207h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.f1252a.m2829C0()) {
            C1240o.m3209j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.f1252a.m2842K() != null ? this.f1252a.m2842K().getAdUnitIds() : null;
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (AbstractC1078k7.m1228c(this.f1252a)) {
                String strOooOO0O = OooO0oO.OooOo.OooOO0O("Ad Unit ID ", str, " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/max/android/overview/advanced-settings#selective-init");
                if (((Boolean) this.f1252a.m2866a(C1268v4.f2866p6)).booleanValue()) {
                    throw new RuntimeException(strOooOO0O);
                }
                if (C1240o.m3200a()) {
                    this.f1253b.m3214b("MediationService", strOooOO0O);
                }
            }
            this.f1252a.m2832E().m573a(C0993c2.f474E0, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id".concat(str));
        }
        this.f1252a.m2889c();
        if (str.length() != 16 && !zStartsWith && !this.f1252a.m2904j0().startsWith("05TMD")) {
            C1240o.m3207h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (this.f1252a.m2880a(maxAdFormat)) {
            C1240o.m3207h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            AbstractC1168q2.m2169a(aVar, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
            return;
        }
        this.f1252a.m2859W0();
        AbstractC1168q2.m2172a((MaxAdRequestListener) aVar, str, true);
        if (this.f1252a.m2851R() != null) {
            this.f1252a.m2851R().m1750a(str, str2, maxAdFormat, enumC1050i, map, map2, context, aVar);
        } else {
            this.f1252a.m2849Q().m1701a(str, str2, maxAdFormat, enumC1050i, map, map2, context, aVar);
        }
    }

    public void loadThirdPartyMediatedAd(String str, AbstractC1266v2 abstractC1266v2, Activity activity, AbstractC1118a.a aVar) {
        C1170q4 c1170q4M1769a;
        if (abstractC1266v2 == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (C1240o.m3200a()) {
            this.f1253b.m3211a("MediationService", "Loading " + abstractC1266v2 + "...");
        }
        this.f1252a.m2848P().m3595a(C0993c2.f501W, abstractC1266v2);
        this.f1252a.m2907l().m2729a(abstractC1266v2, C1216g.c.LOADING);
        this.f1252a.m2923u().m2779b(abstractC1266v2, "WILL_LOAD");
        this.f1252a.m2913p().maybeSendAdEvent(abstractC1266v2, "WILL_LOAD");
        C1129h c1129hM1780a = this.f1252a.m2854T().m1780a(abstractC1266v2);
        if (c1129hM1780a == null) {
            String str2 = "Failed to load " + abstractC1266v2 + ": adapter not loaded";
            C1240o.m3207h("MediationService", str2);
            m1556b(abstractC1266v2, new MaxErrorImpl(-5001, str2), aVar);
            return;
        }
        MaxAdapterParametersImpl maxAdapterParametersImplM1523a = MaxAdapterParametersImpl.m1523a(abstractC1266v2);
        if (abstractC1266v2.m3525W()) {
            c1170q4M1769a = this.f1252a.m2852S().m1769a(abstractC1266v2, activity);
        } else {
            if (abstractC1266v2.m3526X()) {
                this.f1252a.m2852S().m1769a(abstractC1266v2, activity);
            }
            c1170q4M1769a = null;
        }
        AbstractC1266v2 abstractC1266v2Mo98a = abstractC1266v2.mo98a(c1129hM1780a);
        c1129hM1780a.m1829a(str, abstractC1266v2Mo98a);
        abstractC1266v2Mo98a.m3528Z();
        if (c1170q4M1769a == null) {
            c1129hM1780a.m1830a(str, maxAdapterParametersImplM1523a, abstractC1266v2Mo98a, activity, new C1104b(abstractC1266v2Mo98a, aVar));
            return;
        }
        Executor executor = C1170q4.f1799i;
        c1170q4M1769a.m2268a(executor, new OooO0OO(this, abstractC1266v2, aVar, 1));
        c1170q4M1769a.m2270a(executor, new OooO0o(this, c1129hM1780a, str, maxAdapterParametersImplM1523a, abstractC1266v2Mo98a, activity, aVar));
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.f1252a.m2882b(C1286x4.f3045Q);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (m1550a(JsonUtils.getLong(jSONObjectJsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l = (Long) this.f1252a.m2882b(C1286x4.f3046R);
            String string = l != null ? l.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "ad_info");
            Map mapTryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", string, mapTryToStringMap);
            this.f1252a.m2832E().m576d(C0993c2.f544u0, mapTryToStringMap);
            List list = JsonUtils.getList(jSONObjectJsonObjectFromJsonString, "app_killed_urls", Collections.EMPTY_LIST);
            if (CollectionUtils.isEmpty(list)) {
                if (C1240o.m3200a()) {
                    this.f1253b.m3218k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "user_info");
                Map<String, String> mapTryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : AbstractC1249t3.m3328c(this.f1252a);
                mapTryToStringMap2.put("{IMP_DURATION_MS}", string);
                m1546a("mappk", list, mapTryToStringMap2, null, null, null, true);
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objM3041a = this.f1252a.m2839I().m3041a();
            if (objM3041a instanceof AbstractC1266v2) {
                m1545a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (AbstractC1266v2) objM3041a, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, AbstractC1266v2 abstractC1266v2) {
        m1545a(maxError, abstractC1266v2, false);
    }

    public void processAdapterInitializationPostback(C1044h3 c1044h3, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j));
        m1548a("minit", map, new MaxErrorImpl(str), c1044h3);
        Map mapM674a = AbstractC1013e2.m674a(c1044h3);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), mapM674a);
        CollectionUtils.putStringIfValid("error_message", str, mapM674a);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j), mapM674a);
        switch (C1103a.f1256a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f1252a.m2848P().m576d(C0993c2.f494P, mapM674a);
                break;
            case 4:
                this.f1252a.m2848P().m576d(C0993c2.f495Q, mapM674a);
                break;
            case 5:
            case 6:
                this.f1252a.m2847O();
                if (C1240o.m3200a()) {
                    this.f1252a.m2847O().m3218k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f1252a.m2832E().m572a(C0993c2.f509d, "adapterNotInitializedForPostback", mapM674a);
                break;
        }
    }

    public void processCallbackAdImpressionPostback(AbstractC1266v2 abstractC1266v2, AbstractC1118a.a aVar) {
        if (abstractC1266v2.m3516N().endsWith("cimp")) {
            this.f1252a.m2923u().m2778b(abstractC1266v2);
            AbstractC1168q2.m2173a((MaxAdRevenueListener) aVar, (MaxAd) abstractC1266v2);
        }
        HashMap map = new HashMap(2);
        if (abstractC1266v2 instanceof C1302z2) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((C1302z2) abstractC1266v2).m3858o0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f1252a.m2930x0().m1108e());
        if (!((Boolean) this.f1252a.m2866a(C1268v4.f2566E3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m1547a("mcimp", map, abstractC1266v2);
        this.f1252a.m2848P().m3595a(C0993c2.f506b0, abstractC1266v2);
    }

    public void processRawAdImpression(AbstractC1266v2 abstractC1266v2, AbstractC1118a.a aVar) {
        this.f1252a.m2923u().m2779b(abstractC1266v2, "WILL_DISPLAY");
        this.f1252a.m2913p().maybeSendAdEvent(abstractC1266v2, "WILL_DISPLAY");
        if (abstractC1266v2.m3516N().endsWith("mimp")) {
            this.f1252a.m2923u().m2778b(abstractC1266v2);
            AbstractC1168q2.m2173a((MaxAdRevenueListener) aVar, (MaxAd) abstractC1266v2);
        }
        if (((Boolean) this.f1252a.m2866a(C1268v4.f2551C4)).booleanValue()) {
            this.f1252a.m2862Y().m2332a(C1153p3.f1711g, C1169q3.m2252a(abstractC1266v2), Long.valueOf(System.currentTimeMillis() - this.f1252a.m2843L()));
        }
        HashMap map = new HashMap(3);
        if (abstractC1266v2 instanceof C1302z2) {
            C1302z2 c1302z2 = (C1302z2) abstractC1266v2;
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(c1302z2.m3853j0()));
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(c1302z2.m3858o0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f1252a.m2930x0().m1108e());
        if (!((Boolean) this.f1252a.m2866a(C1268v4.f2566E3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m1547a("mimp", map, abstractC1266v2);
        this.f1252a.m2848P().m3595a(C0993c2.f505a0, abstractC1266v2);
    }

    public void processViewabilityAdImpressionPostback(AbstractC1014e3 abstractC1014e3, long j, AbstractC1118a.a aVar) {
        if (abstractC1014e3.m3516N().endsWith("vimp")) {
            this.f1252a.m2923u().m2778b(abstractC1014e3);
            AbstractC1168q2.m2173a((MaxAdRevenueListener) aVar, (MaxAd) abstractC1014e3);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(abstractC1014e3.m688k0()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f1252a.m2930x0().m1108e());
        if (!((Boolean) this.f1252a.m2866a(C1268v4.f2566E3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m1547a("mvimp", map, abstractC1014e3);
        this.f1252a.m2848P().m3595a(C0993c2.f508c0, abstractC1014e3);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, MaxError maxError, long j, long j2) {
        C1284x2 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String strM3642b = requestParameters.m3642b();
        MaxAdFormat maxAdFormatM3640a = requestParameters.m3640a();
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatM3640a.getLabel(), map);
        CollectionUtils.putStringIfValid("ad_unit_id", strM3642b, map);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j2), map);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), map);
        if (maxError != null) {
            map.putAll(AbstractC1013e2.m679a(maxError));
        }
        this.f1252a.m2848P().m576d(C0993c2.f504Z, map);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap map2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map2);
        CollectionUtils.putStringIfValid("ad_unit_id", strM3642b, map2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatM3640a.getLabel(), map2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), map2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j2), map2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j), map2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map2);
        map2.put("arn_info", requestParameters.m3646f().m818e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap map3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map3);
            map3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), map3);
            map3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap map4 = new HashMap(4);
                map4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                map4.put("error_message", maxErrorImpl.getMessage());
                map4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                map4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                map3.put("error_info", map4);
            }
            arrayList.add(map3);
        }
        map2.put("ads_info", arrayList);
        m1546a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, map2, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f1255d.set(jSONObject);
    }

    public void showFullscreenAd(C1302z2 c1302z2, Activity activity, AbstractC1118a.a aVar) {
        if (c1302z2 == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != c1302z2.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f1252a.m2839I().m3044a(true);
        C1129h c1129hM1551b = m1551b(c1302z2);
        long jM3855l0 = c1302z2.m3855l0();
        if (C1240o.m3200a()) {
            this.f1253b.m3215d("MediationService", "Showing ad " + c1302z2.getAdUnitId() + " with delay of " + jM3855l0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.OooOo00(this, c1302z2, c1129hM1551b, activity, aVar, 2), jM3855l0);
    }

    /* renamed from: b */
    private C1129h m1551b(C1302z2 c1302z2) {
        C1129h c1129hM3504A = c1302z2.m3504A();
        if (c1129hM3504A != null) {
            return c1129hM3504A;
        }
        this.f1252a.m2839I().m3044a(false);
        if (C1240o.m3200a()) {
            this.f1253b.m3218k("MediationService", "Failed to show " + c1302z2 + ": adapter not found");
        }
        C1240o.m3207h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + c1302z2.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* renamed from: a */
    public /* synthetic */ void m1540a(C1302z2 c1302z2, C1129h c1129h, Activity activity, AbstractC1118a.a aVar) {
        m1538a(c1302z2);
        c1129h.m1832b(c1302z2, activity);
        m1539a(c1302z2, aVar);
    }

    /* renamed from: a */
    public /* synthetic */ void m1541a(C1302z2 c1302z2, C1129h c1129h, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, AbstractC1118a.a aVar) {
        m1538a(c1302z2);
        c1129h.m1825a(c1302z2, viewGroup, lifecycle, activity);
        m1539a(c1302z2, aVar);
    }

    public void showFullscreenAd(C1302z2 c1302z2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, AbstractC1118a.a aVar) {
        if (c1302z2 == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f1252a.m2839I().m3044a(true);
            C1129h c1129hM1551b = m1551b(c1302z2);
            long jM3855l0 = c1302z2.m3855l0();
            if (C1240o.m3200a()) {
                this.f1253b.m3215d("MediationService", "Showing ad " + c1302z2.getAdUnitId() + " with delay of " + jM3855l0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new OooO0o(this, c1302z2, c1129hM1551b, viewGroup, lifecycle, activity, aVar), jM3855l0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    /* renamed from: b */
    public void m1556b(AbstractC1266v2 abstractC1266v2, MaxError maxError, MaxAdListener maxAdListener) {
        m1544a(maxError, abstractC1266v2);
        destroyAd(abstractC1266v2);
        AbstractC1168q2.m2169a(maxAdListener, abstractC1266v2.getAdUnitId(), maxError);
    }

    /* renamed from: a */
    private void m1538a(C1302z2 c1302z2) {
        if (c1302z2.getFormat() == MaxAdFormat.REWARDED) {
            this.f1252a.m2918r0().m403a((AbstractRunnableC1036g5) new C1181r6(c1302z2, this.f1252a), C0987b6.b.OTHER);
        }
    }

    /* renamed from: b */
    public void m1555b(AbstractC1266v2 abstractC1266v2) {
        this.f1252a.m2923u().m2779b(abstractC1266v2, "DID_LOAD");
        this.f1252a.m2913p().maybeSendAdEvent(abstractC1266v2, "DID_LOAD");
        if (abstractC1266v2.m3516N().endsWith("load")) {
            this.f1252a.m2923u().m2778b(abstractC1266v2);
        }
        HashMap map = new HashMap(3);
        long jM3510G = abstractC1266v2.m3510G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jM3510G));
        if (abstractC1266v2.getFormat().isFullscreenAd()) {
            C1223n.a aVarM3046b = this.f1252a.m2839I().m3046b(abstractC1266v2.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarM3046b.m3053a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarM3046b.m3055b()));
        }
        m1547a("load", map, abstractC1266v2);
        Map mapM678a = AbstractC1013e2.m678a(abstractC1266v2);
        mapM678a.put("duration_ms", String.valueOf(jM3510G));
        this.f1252a.m2848P().m576d(C0993c2.f502X, mapM678a);
    }

    /* renamed from: a */
    private void m1539a(C1302z2 c1302z2, AbstractC1118a.a aVar) {
        this.f1252a.m2839I().m3044a(false);
        m1542a(c1302z2, (MaxAdListener) aVar);
        if (C1240o.m3200a()) {
            this.f1253b.m3211a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(c1302z2, aVar);
    }

    /* renamed from: a */
    public /* synthetic */ void m1536a(AbstractC1266v2 abstractC1266v2, AbstractC1118a.a aVar, String str) {
        String str2 = "Failed to load " + abstractC1266v2 + ": adapter init failed with error: " + str;
        if (C1240o.m3200a()) {
            this.f1253b.m3218k("MediationService", str2);
        }
        m1556b(abstractC1266v2, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), aVar);
    }

    /* renamed from: a */
    public /* synthetic */ void m1532a(C1129h c1129h, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, AbstractC1266v2 abstractC1266v2, Activity activity, AbstractC1118a.a aVar) {
        c1129h.m1830a(str, maxAdapterParametersImpl, abstractC1266v2, activity, new C1104b(abstractC1266v2, aVar));
    }

    /* renamed from: a */
    public /* synthetic */ void m1526a(long j, C1129h c1129h, String str, C0986b5 c0986b5, MaxAdFormat maxAdFormat, C0958a5.a aVar, boolean z, String str2, MaxError maxError) {
        C0958a5 c0958a5M110a;
        String str3;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (z) {
            if (C1240o.m3200a()) {
                this.f1253b.m3211a("MediationService", "Signal collection successful from: " + c1129h.m1837g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
                str3 = str2;
            } else {
                str3 = str2;
            }
            c0958a5M110a = C0958a5.m111a(c0986b5, c1129h, str3, j, jElapsedRealtime);
            this.f1254c.m3870a(c0958a5M110a, c0986b5, str, maxAdFormat);
            HashMap map = new HashMap();
            CollectionUtils.putStringIfValid("network_name", c0986b5.m899c(), map);
            CollectionUtils.putStringIfValid("adapter_class", c0986b5.m895b(), map);
            CollectionUtils.putStringIfValid("adapter_version", c1129h.m1831b(), map);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jElapsedRealtime), map);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), map);
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            this.f1252a.m2848P().m576d(C0993c2.f496R, map);
        } else {
            if (C1240o.m3200a()) {
                this.f1253b.m3214b("MediationService", "Signal collection failed from: " + c1129h.m1837g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            c0958a5M110a = C0958a5.m110a(c0986b5, c1129h, maxError, j, jElapsedRealtime);
            m1527a(c0958a5M110a, c0986b5, c1129h);
        }
        aVar.mo120a(c0958a5M110a);
        c1129h.m1823a();
    }

    /* renamed from: a */
    public /* synthetic */ void m1533a(C1170q4 c1170q4, C1129h c1129h, MaxAdapterParametersImpl maxAdapterParametersImpl, C0986b5 c0986b5, Activity activity) {
        if (c1170q4.m2273c()) {
            return;
        }
        if (C1240o.m3200a()) {
            this.f1253b.m3211a("MediationService", "Collecting signal for now-initialized adapter: " + c1129h.m1837g());
        }
        c1129h.m1827a(maxAdapterParametersImpl, c0986b5, activity, c1170q4);
    }

    /* renamed from: a */
    public /* synthetic */ void m1531a(C1129h c1129h, C1170q4 c1170q4, String str) {
        if (C1240o.m3200a()) {
            this.f1253b.m3214b("MediationService", "Skip collecting signal for failed-initialized adapter: " + c1129h.m1837g());
        }
        c1170q4.m2266a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, OooO0oO.OooOo.OooOO0("Could not initialize adapter: ", str)));
    }

    /* renamed from: a */
    private void m1542a(C1302z2 c1302z2, MaxAdListener maxAdListener) {
        Long l = (Long) this.f1252a.m2866a(AbstractC1144o3.f1615L7);
        if (l.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Oooo0(this, c1302z2, l, maxAdListener, 2), l.longValue());
    }

    /* renamed from: a */
    public /* synthetic */ void m1543a(C1302z2 c1302z2, Long l, MaxAdListener maxAdListener) {
        if (c1302z2.m3539u().get()) {
            return;
        }
        String str = "Ad (" + c1302z2.m914k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        C1240o.m3207h("MediationService", str);
        m1537a(c1302z2, new MaxErrorImpl(-1, str), maxAdListener);
        this.f1252a.m2839I().m3047b(c1302z2);
    }

    /* renamed from: a */
    public void m1537a(AbstractC1266v2 abstractC1266v2, MaxError maxError, MaxAdListener maxAdListener) {
        this.f1252a.m2907l().m2729a(abstractC1266v2, C1216g.c.SHOW_ERROR);
        this.f1252a.m2923u().m2779b(abstractC1266v2, "DID_FAIL_DISPLAY");
        this.f1252a.m2913p().maybeSendAdEvent(abstractC1266v2, "DID_FAIL_DISPLAY");
        m1545a(maxError, abstractC1266v2, true);
        if (abstractC1266v2.m3539u().compareAndSet(false, true)) {
            AbstractC1168q2.m2164a(maxAdListener, abstractC1266v2, maxError);
        }
    }

    /* renamed from: a */
    private void m1544a(MaxError maxError, AbstractC1266v2 abstractC1266v2) {
        HashMap map = new HashMap(3);
        long jM3510G = abstractC1266v2.m3510G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jM3510G));
        if (abstractC1266v2.getFormat().isFullscreenAd()) {
            C1223n.a aVarM3046b = this.f1252a.m2839I().m3046b(abstractC1266v2.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarM3046b.m3053a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarM3046b.m3055b()));
        }
        m1548a("mlerr", map, maxError, abstractC1266v2);
        Map mapM678a = AbstractC1013e2.m678a(abstractC1266v2);
        mapM678a.putAll(AbstractC1013e2.m679a(maxError));
        mapM678a.put("duration_ms", String.valueOf(jM3510G));
        this.f1252a.m2848P().m576d(C0993c2.f503Y, mapM678a);
    }

    /* renamed from: a */
    public void m1534a(AbstractC1266v2 abstractC1266v2) {
        this.f1252a.m2923u().m2779b(abstractC1266v2, "DID_HIDE");
        this.f1252a.m2913p().maybeSendAdEvent(abstractC1266v2, "DID_HIDE");
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f1252a.m2930x0().m1108e());
        if (!((Boolean) this.f1252a.m2866a(C1268v4.f2566E3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m1547a("mclose", map, abstractC1266v2);
        this.f1252a.m2848P().m3595a(C0993c2.f512e0, abstractC1266v2);
    }

    /* renamed from: a */
    public void m1535a(AbstractC1266v2 abstractC1266v2, AbstractC1118a.a aVar) {
        this.f1252a.m2923u().m2779b(abstractC1266v2, "DID_CLICKED");
        this.f1252a.m2923u().m2779b(abstractC1266v2, "DID_CLICK");
        this.f1252a.m2913p().maybeSendAdEvent(abstractC1266v2, "DID_CLICK");
        if (abstractC1266v2.m3516N().endsWith(C3069e9.f8387d)) {
            this.f1252a.m2923u().m2778b(abstractC1266v2);
            AbstractC1168q2.m2173a((MaxAdRevenueListener) aVar, (MaxAd) abstractC1266v2);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f1252a.m2930x0().m1108e());
        if (!((Boolean) this.f1252a.m2866a(C1268v4.f2566E3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m1547a("mclick", map, abstractC1266v2);
    }

    /* renamed from: a */
    private void m1545a(MaxError maxError, AbstractC1266v2 abstractC1266v2, boolean z) {
        HashMap map = new HashMap(1);
        if (abstractC1266v2 instanceof C1302z2) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((C1302z2) abstractC1266v2).m3858o0()));
        }
        m1549a("mierr", map, maxError, abstractC1266v2, z);
        if (!z || abstractC1266v2 == null) {
            return;
        }
        this.f1252a.m2848P().m3596a(C0993c2.f510d0, abstractC1266v2, maxError);
    }

    /* renamed from: a */
    private void m1527a(C0958a5 c0958a5, C0986b5 c0986b5, C1129h c1129h) {
        long jM114b = c0958a5.m114b();
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(jM114b));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", c1129h.m1831b(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", c1129h.m1839i(), map);
        m1548a("serr", map, c0958a5.m115c(), c0986b5);
        Map mapM679a = AbstractC1013e2.m679a(c0958a5.m115c());
        CollectionUtils.putStringIfValid("network_name", c0986b5.m899c(), mapM679a);
        CollectionUtils.putStringIfValid("adapter_class", c0986b5.m895b(), mapM679a);
        CollectionUtils.putStringIfValid("adapter_version", c1129h.m1831b(), mapM679a);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jM114b), mapM679a);
        this.f1252a.m2848P().m576d(C0993c2.f497S, mapM679a);
    }

    /* renamed from: a */
    private void m1547a(String str, Map map, C1044h3 c1044h3) {
        m1548a(str, map, (MaxError) null, c1044h3);
    }

    /* renamed from: a */
    private void m1548a(String str, Map map, MaxError maxError, C1044h3 c1044h3) {
        m1549a(str, map, maxError, c1044h3, true);
    }

    /* renamed from: a */
    private void m1549a(String str, Map map, MaxError maxError, C1044h3 c1044h3, boolean z) {
        String strEmptyIfNull;
        Map map2 = CollectionUtils.map(map);
        String strEmptyIfNull2 = "";
        map2.put("{PLACEMENT}", z ? StringUtils.emptyIfNull(c1044h3.getPlacement()) : "");
        if (!z) {
            strEmptyIfNull = "";
        } else {
            strEmptyIfNull = StringUtils.emptyIfNull(c1044h3.m907e());
        }
        map2.put("{CUSTOM_DATA}", strEmptyIfNull);
        if (c1044h3 instanceof AbstractC1266v2) {
            AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) c1044h3;
            if (z) {
                strEmptyIfNull2 = StringUtils.emptyIfNull(abstractC1266v2.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", strEmptyIfNull2);
        }
        m1546a(str, null, map2, null, maxError, c1044h3, z);
    }

    /* renamed from: a */
    private void m1546a(String str, List list, Map map, Map map2, MaxError maxError, C1044h3 c1044h3, boolean z) {
        this.f1252a.m2918r0().m403a((AbstractRunnableC1036g5) new C1305z5(str, list, map, map2, maxError, c1044h3, this.f1252a, z), C0987b6.b.OTHER);
    }

    /* renamed from: a */
    private boolean m1550a(long j) {
        return System.currentTimeMillis() - j <= ((Long) this.f1252a.m2866a(C1268v4.f2549C2)).longValue();
    }
}

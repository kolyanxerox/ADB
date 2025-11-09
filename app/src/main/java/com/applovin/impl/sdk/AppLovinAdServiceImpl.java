package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.view.Oooo0;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC0989b8;
import com.applovin.impl.AbstractC1048h7;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1175r0;
import com.applovin.impl.AbstractC1265v1;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C0997c6;
import com.applovin.impl.C1010e;
import com.applovin.impl.C1070k;
import com.applovin.impl.C1254u;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1278w5;
import com.applovin.impl.C1286x4;
import com.applovin.impl.C1296y5;
import com.applovin.impl.InterfaceC1083l2;
import com.applovin.impl.InterfaceC1185s1;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.adview.C0967b;
import com.applovin.impl.o0O0O00;
import com.applovin.impl.sdk.C1205a;
import com.applovin.impl.sdk.C1213d;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.network.C1238d;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1208c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, C1205a.a {

    /* renamed from: a */
    private final C1220k f1889a;

    /* renamed from: b */
    private final C1240o f1890b;

    /* renamed from: c */
    private final Map f1891c;

    /* renamed from: d */
    private final Object f1892d = new Object();

    /* renamed from: e */
    private final Map f1893e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    private final AtomicReference f1894f = new AtomicReference();

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$a */
    public class C1192a implements ArrayService.DirectDownloadListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC1265v1 f1895a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1207b f1896b;

        /* renamed from: c */
        final /* synthetic */ Uri f1897c;

        /* renamed from: d */
        final /* synthetic */ Context f1898d;

        public C1192a(AbstractC1265v1 abstractC1265v1, AbstractC1207b abstractC1207b, Uri uri, Context context) {
            this.f1895a = abstractC1265v1;
            this.f1896b = abstractC1207b;
            this.f1897c = uri;
            this.f1898d = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
            if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN.equals(str)) {
                AppLovinAdServiceImpl.this.f1889a.m2911n0().pauseForClick();
            } else if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str)) {
                AppLovinAdServiceImpl.this.f1889a.m2911n0().resumeForClick();
            }
            if (this.f1895a != null) {
                this.f1895a.m3475e(AppLovinAdServiceImpl.this.f1889a.m2913p().getJavaScript(str, bundle));
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            C1240o unused = AppLovinAdServiceImpl.this.f1890b;
            if (C1240o.m3200a()) {
                AppLovinAdServiceImpl.this.f1890b.m3211a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.m2424a(this.f1896b, this.f1897c, this.f1898d);
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$b */
    public class C1193b implements ArrayService.DirectDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C0962a f1900a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1207b f1901b;

        /* renamed from: c */
        final /* synthetic */ AppLovinAdView f1902c;

        /* renamed from: d */
        final /* synthetic */ Uri f1903d;

        public C1193b(C0962a c0962a, AbstractC1207b abstractC1207b, AppLovinAdView appLovinAdView, Uri uri) {
            this.f1900a = c0962a;
            this.f1901b = abstractC1207b;
            this.f1902c = appLovinAdView;
            this.f1903d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
            C0967b c0967bM225f;
            if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN.equals(str)) {
                AppLovinAdServiceImpl.this.f1889a.m2911n0().pauseForClick();
                C0962a c0962a = this.f1900a;
                if (c0962a != null) {
                    c0962a.m233w();
                    AbstractC1168q2.m2226c(this.f1900a.m224e(), this.f1901b, this.f1902c);
                }
            } else if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str) && this.f1900a != null) {
                AppLovinAdServiceImpl.this.f1889a.m2911n0().resumeForClick();
                AbstractC1168q2.m2158a(this.f1900a.m224e(), this.f1901b, this.f1902c);
            }
            C0962a c0962a2 = this.f1900a;
            if (c0962a2 == null || (c0967bM225f = c0962a2.m225f()) == null) {
                return;
            }
            c0967bM225f.m257a(AppLovinAdServiceImpl.this.f1889a.m2913p().getJavaScript(str, bundle));
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            C1240o unused = AppLovinAdServiceImpl.this.f1890b;
            if (C1240o.m3200a()) {
                AppLovinAdServiceImpl.this.f1890b.m3211a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.m2425a(this.f1901b, this.f1902c, this.f1900a, this.f1903d);
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$c */
    public class C1194c implements InterfaceC1083l2 {

        /* renamed from: a */
        private final C1195d f1905a;

        public /* synthetic */ C1194c(AppLovinAdServiceImpl appLovinAdServiceImpl, C1195d c1195d, C1192a c1192a) {
            this(c1195d);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof C1208c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f1889a.m2901i().m2705a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f1889a.m2895f().m2480a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new C1208c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f1889a);
            }
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f1905a.f1907a) {
                try {
                    if (!this.f1905a.f1909c) {
                        hashSet = new HashSet(this.f1905a.f1910d);
                        this.f1905a.f1910d.clear();
                    }
                    C1195d c1195d = this.f1905a;
                    c1195d.f1908b = false;
                    c1195d.f1909c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.m2428a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            failedToReceiveAdV2(new AppLovinError(i, ""));
        }

        @Override // com.applovin.impl.InterfaceC1083l2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f1905a.f1907a) {
                try {
                    if (!this.f1905a.f1909c) {
                        hashSet = new HashSet(this.f1905a.f1910d);
                        this.f1905a.f1910d.clear();
                    }
                    C1195d c1195d = this.f1905a;
                    c1195d.f1908b = false;
                    c1195d.f1909c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.m2435b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private C1194c(C1195d c1195d) {
            this.f1905a = c1195d;
        }
    }

    public AppLovinAdServiceImpl(C1220k c1220k) {
        this.f1889a = c1220k;
        this.f1890b = c1220k.m2847O();
        HashMap map = new HashMap(6);
        this.f1891c = map;
        map.put(C1254u.m3368c(), new C1195d(null));
        map.put(C1254u.m3371k(), new C1195d(null));
        map.put(C1254u.m3370j(), new C1195d(null));
        map.put(C1254u.m3373m(), new C1195d(null));
        map.put(C1254u.m3366b(), new C1195d(null));
        map.put(C1254u.m3369h(), new C1195d(null));
    }

    /* renamed from: c */
    private void m2437c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof InterfaceC1083l2) {
            ((InterfaceC1083l2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f1893e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f1889a.m2827B().m2995a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(C1254u c1254u) {
        AppLovinAdImpl appLovinAdImplM2704a = this.f1889a.m2901i().m2704a(c1254u);
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplM2704a + " for zone: " + c1254u + "...");
        }
        return appLovinAdImplM2704a;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f1894f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f1893e) {
            map = CollectionUtils.map(this.f1893e);
            this.f1893e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strM2986G = this.f1889a.m2827B().m2986G();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strM2986G) && C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strM2986G;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        m2427a(C1254u.m3360a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            C1240o.m3207h("AppLovinAdService", "Empty ad token");
            m2437c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        C1070k c1070k = new C1070k(strTrim, this.f1889a);
        if (c1070k.m1121c() == C1070k.a.REGULAR) {
            if (C1240o.m3200a()) {
                this.f1890b.m3211a("AppLovinAdService", "Loading next ad for token: " + c1070k);
            }
            m2416a(new C1296y5(c1070k, appLovinAdLoadListener, this.f1889a));
            return;
        }
        if (c1070k.m1121c() != C1070k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            C1240o.m3207h("AppLovinAdService", "Invalid token type");
            m2437c(appLovinError, appLovinAdLoadListener);
            return;
        }
        JSONObject jSONObjectM1119a = c1070k.m1119a();
        if (jSONObjectM1119a == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c1070k.m1120b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            C1240o.m3207h("AppLovinAdService", str2);
            m2437c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        AbstractC1175r0.m2300c(jSONObjectM1119a, this.f1889a);
        AbstractC1175r0.m2298b(jSONObjectM1119a, this.f1889a);
        AbstractC1175r0.m2289a(jSONObjectM1119a, this.f1889a);
        this.f1889a.m2909m().m2753a();
        if (JsonUtils.getJSONArray(jSONObjectM1119a, "ads", new JSONArray()).length() <= 0) {
            if (C1240o.m3200a()) {
                this.f1890b.m3214b("AppLovinAdService", "No ad returned from the server for token: " + c1070k);
            }
            m2437c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Rendering ad for token: " + c1070k);
        }
        C1254u c1254uM1164a = AbstractC1078k7.m1164a(jSONObjectM1119a, this.f1889a);
        MaxAdFormat maxAdFormatM3374d = c1254uM1164a.m3374d();
        if (((Boolean) this.f1889a.m2866a(C1268v4.f2707W0)).booleanValue() && maxAdFormatM3374d != null && maxAdFormatM3374d.isFullscreenAd()) {
            this.f1889a.m2899h().m2697a(c1254uM1164a, new o0O0O00(this, appLovinAdLoadListener, jSONObjectM1119a, c1254uM1164a));
        } else {
            m2416a(new C0997c6(jSONObjectM1119a, c1254uM1164a, appLovinAdLoadListener, this.f1889a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        m2427a(C1254u.m3363a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        m2427a(C1254u.m3367b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l;
        if (((Boolean) this.f1889a.m2866a(C1268v4.f2910v2)).booleanValue() && (l = (Long) this.f1889a.m2882b(C1286x4.f3041M)) != null && System.currentTimeMillis() - l.longValue() <= ((Long) this.f1889a.m2866a(C1268v4.f2942z2)).longValue()) {
            if (((Boolean) this.f1889a.m2866a(C1268v4.f2934y2)).booleanValue() || m2436b()) {
                m2412a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<C1010e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<C1010e> it = list.iterator();
        while (it.hasNext()) {
            m2415a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.C1205a.a
    public void onAdExpired(InterfaceC1185s1 interfaceC1185s1) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) interfaceC1185s1;
        C1254u adZone = appLovinAdImpl.getAdZone();
        if (C1240o.m3200a()) {
            this.f1890b.m3218k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f1889a.m2901i().m2706b(appLovinAdImpl);
        if (this.f1889a.m2838H0() || !((Boolean) this.f1889a.m2866a(C1268v4.f2756c1)).booleanValue()) {
            return;
        }
        C1195d c1195dM2407a = m2407a(adZone);
        synchronized (c1195dM2407a.f1907a) {
            try {
                if (!c1195dM2407a.f1908b) {
                    this.f1889a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f1889a.m2847O().m3211a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    c1195dM2407a.f1908b = true;
                    c1195dM2407a.f1909c = true;
                    m2426a(adZone, new C1194c(this, c1195dM2407a, null));
                } else if (C1240o.m3200a()) {
                    this.f1890b.m3211a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f1894f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f1891c + '}';
    }

    public void trackAndLaunchClick(AbstractC1207b abstractC1207b, AppLovinAdView appLovinAdView, C0962a c0962a, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (abstractC1207b == null) {
            if (C1240o.m3200a()) {
                this.f1890b.m3214b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (C1240o.m3200a()) {
                this.f1890b.m3211a("AppLovinAdService", "Tracking click on an ad...");
            }
            boolean z = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(abstractC1207b.m2572a(motionEvent, z));
            if (this.f1889a.m2900h0() != null) {
                this.f1889a.m2900h0().m3249b(abstractC1207b.m2590d(motionEvent, false, z), motionEvent);
            }
        } else if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Skipping tracking for click on an ad...");
        }
        if (appLovinAdView == null || uri == null) {
            if (C1240o.m3200a()) {
                this.f1890b.m3214b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (abstractC1207b.isDirectDownloadEnabled()) {
            this.f1889a.m2913p().startDirectInstallOrDownloadProcess(abstractC1207b, bundle, new C1193b(c0962a, abstractC1207b, appLovinAdView, uri));
        } else {
            m2425a(abstractC1207b, appLovinAdView, c0962a, uri);
        }
    }

    public void trackAndLaunchVideoClick(AbstractC1207b abstractC1207b, Uri uri, MotionEvent motionEvent, Bundle bundle, AbstractC1265v1 abstractC1265v1, Context context) {
        if (abstractC1207b == null) {
            if (C1240o.m3200a()) {
                this.f1890b.m3214b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (C1240o.m3200a()) {
                this.f1890b.m3211a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            boolean z = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(abstractC1207b.m2579b(motionEvent, z));
            if (this.f1889a.m2900h0() != null) {
                this.f1889a.m2900h0().m3249b(abstractC1207b.m2590d(motionEvent, true, z), motionEvent);
            }
        } else if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
        }
        if (abstractC1207b.isDirectDownloadEnabled()) {
            this.f1889a.m2913p().startDirectInstallOrDownloadProcess(abstractC1207b, bundle, new C1192a(abstractC1265v1, abstractC1207b, uri, context));
        } else {
            m2424a(abstractC1207b, uri, context);
        }
    }

    public void trackCustomTabsNavigationAborted(AbstractC1207b abstractC1207b) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1207b.m2639w());
    }

    public void trackCustomTabsNavigationFailed(AbstractC1207b abstractC1207b) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1207b.m2641x());
    }

    public void trackCustomTabsNavigationFinished(AbstractC1207b abstractC1207b) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1207b.m2643y());
    }

    public void trackCustomTabsNavigationStarted(AbstractC1207b abstractC1207b) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1207b.m2645z());
    }

    public void trackCustomTabsTabHidden(AbstractC1207b abstractC1207b) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1207b.m2528B());
    }

    public void trackCustomTabsTabShown(AbstractC1207b abstractC1207b) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1207b.m2530C());
    }

    public void trackFullScreenAdClosed(AbstractC1207b abstractC1207b, long j, List<Long> list, long j2, boolean z, int i) {
        if (abstractC1207b == null) {
            if (C1240o.m3200a()) {
                this.f1890b.m3214b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking ad closed...");
        }
        List<C1010e> listM2594e = abstractC1207b.m2594e();
        if (listM2594e == null || listM2594e.isEmpty()) {
            if (C1240o.m3200a()) {
                this.f1890b.m3218k("AppLovinAdService", "Unable to track ad closed for AD #" + abstractC1207b.getAdIdNumber() + ". Missing ad close tracking URL." + abstractC1207b.getAdIdNumber());
                return;
            }
            return;
        }
        for (C1010e c1010e : listM2594e) {
            String strM2410a = m2410a(c1010e.m656c(), j, j2, list, abstractC1207b.m2536F(), z, i);
            String strM2410a2 = m2410a(c1010e.m654a(), j, j2, list, abstractC1207b.m2536F(), z, i);
            if (StringUtils.isValidString(strM2410a)) {
                m2415a(new C1010e(strM2410a, strM2410a2));
            } else if (C1240o.m3200a()) {
                this.f1890b.m3214b("AppLovinAdService", "Failed to parse url: " + c1010e.m656c());
            }
        }
    }

    public void trackImpression(AbstractC1207b abstractC1207b) {
        if (abstractC1207b == null) {
            if (C1240o.m3200a()) {
                this.f1890b.m3214b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (C1240o.m3200a()) {
                this.f1890b.m3211a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(abstractC1207b.mo1354K());
            if (this.f1889a.m2900h0() != null) {
                this.f1889a.m2900h0().m3248b(abstractC1207b.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackVideoEnd(AbstractC1207b abstractC1207b, long j, int i, boolean z) {
        if (abstractC1207b == null) {
            if (C1240o.m3200a()) {
                this.f1890b.m3214b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<C1010e> listM2629q0 = abstractC1207b.m2629q0();
        if (listM2629q0 == null || listM2629q0.isEmpty()) {
            if (C1240o.m3200a()) {
                this.f1890b.m3218k("AppLovinAdService", "Unable to submit persistent postback for AD #" + abstractC1207b.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (C1010e c1010e : listM2629q0) {
            if (StringUtils.isValidString(c1010e.m656c())) {
                String strM2409a = m2409a(c1010e.m656c(), j, i, string, z);
                String strM2409a2 = m2409a(c1010e.m654a(), j, i, string, z);
                if (strM2409a != null) {
                    m2415a(new C1010e(strM2409a, strM2409a2));
                } else if (C1240o.m3200a()) {
                    this.f1890b.m3214b("AppLovinAdService", "Failed to parse url: " + c1010e.m656c());
                }
            } else if (C1240o.m3200a()) {
                this.f1890b.m3218k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    /* renamed from: b */
    public void m2435b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new OooO00o(this, appLovinError, appLovinAdLoadListener));
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        m2427a(C1254u.m3361a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$d */
    public static class C1195d {

        /* renamed from: a */
        final Object f1907a;

        /* renamed from: b */
        boolean f1908b;

        /* renamed from: c */
        boolean f1909c;

        /* renamed from: d */
        final Collection f1910d;

        private C1195d() {
            this.f1907a = new Object();
            this.f1910d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f1908b + ", isReloadingExpiredAd=" + this.f1909c + ", pendingAdListeners=" + this.f1910d + '}';
        }

        public /* synthetic */ C1195d(C1192a c1192a) {
            this();
        }
    }

    /* renamed from: b */
    private Uri m2433b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f1889a.m2847O();
            if (C1240o.m3200a()) {
                this.f1889a.m2847O().m3218k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f1889a.m2832E().m2148a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    /* renamed from: b */
    private boolean m2436b() {
        if (AbstractC1141o0.m1942b()) {
            Context contextM2824o = C1220k.m2824o();
            ApplicationExitInfo applicationExitInfoOooO0Oo = Oooo0.OooO0Oo(((ActivityManager) contextM2824o.getSystemService("activity")).getHistoricalProcessExitReasons(contextM2824o.getPackageName(), 0, 1).get(0));
            if (applicationExitInfoOooO0Oo.getReason() != 10 && applicationExitInfoOooO0Oo.getReason() != 11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void m2431a(AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, C1254u c1254u, AbstractC1207b abstractC1207b) {
        if (abstractC1207b != null) {
            AppLovinSdkUtils.runOnUiThread(new OooO0O0(1, appLovinAdLoadListener, abstractC1207b));
        } else {
            m2416a(new C0997c6(jSONObject, c1254u, appLovinAdLoadListener, this.f1889a));
        }
    }

    /* renamed from: a */
    private void m2427a(C1254u c1254u, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (c1254u == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f1889a.m2847O();
            if (C1240o.m3200a()) {
                this.f1889a.m2847O().m3211a("AppLovinAdService", "Loading next ad of zone {" + c1254u + "}...");
            }
            C1195d c1195dM2407a = m2407a(c1254u);
            synchronized (c1195dM2407a.f1907a) {
                try {
                    c1195dM2407a.f1910d.add(appLovinAdLoadListener);
                    if (!c1195dM2407a.f1908b) {
                        c1195dM2407a.f1908b = true;
                        m2426a(c1254u, new C1194c(this, c1195dM2407a, null));
                    } else if (C1240o.m3200a()) {
                        this.f1890b.m3211a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* renamed from: a */
    private void m2416a(AbstractRunnableC1036g5 abstractRunnableC1036g5) {
        if (!this.f1889a.m2829C0()) {
            C1240o.m3209j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f1889a.m2889c();
        this.f1889a.m2918r0().m403a(abstractRunnableC1036g5, C0987b6.b.CORE);
    }

    /* renamed from: a */
    public void m2428a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new OooO00o(this, appLovinAdLoadListener, appLovinAd, 0));
    }

    /* renamed from: a */
    public /* synthetic */ void m2430a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f1889a.m2832E().m2148a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m2423a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            m2437c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            this.f1889a.m2832E().m2148a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof InterfaceC1083l2 ? "V2" : ""), th);
        }
    }

    /* renamed from: a */
    public void m2424a(AbstractC1207b abstractC1207b, Uri uri, Context context) {
        if (AbstractC1048h7.m952b(uri)) {
            m2414a(uri, abstractC1207b, null, null, context, this.f1889a);
        } else {
            AbstractC1048h7.m953b(uri, abstractC1207b, context, this.f1889a);
        }
    }

    /* renamed from: a */
    public void m2425a(AbstractC1207b abstractC1207b, AppLovinAdView appLovinAdView, C0962a c0962a, Uri uri) {
        Context context;
        if (!((Boolean) this.f1889a.m2866a(C1268v4.f2923x)).booleanValue() || (context = AbstractC0989b8.m432b(appLovinAdView, this.f1889a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (AbstractC1048h7.m952b(uri)) {
            m2414a(uri, abstractC1207b, appLovinAdView, c0962a, context2, this.f1889a);
        } else {
            m2413a(uri, abstractC1207b, appLovinAdView, c0962a, context2);
        }
    }

    /* renamed from: a */
    private String m2409a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f1890b.m3212a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f1889a.m2832E().m2148a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    /* renamed from: a */
    private void m2413a(Uri uri, AbstractC1207b abstractC1207b, AppLovinAdView appLovinAdView, C0962a c0962a, Context context) {
        if (AbstractC1048h7.m953b(uri, abstractC1207b, context, this.f1889a)) {
            AbstractC1168q2.m2203b(c0962a.m224e(), abstractC1207b, appLovinAdView);
        }
        c0962a.m233w();
    }

    /* renamed from: a */
    private void m2414a(Uri uri, AbstractC1207b abstractC1207b, AppLovinAdView appLovinAdView, C0962a c0962a, Context context, C1220k c1220k) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriM2433b = m2433b(uri, "primaryUrl");
            List listM2411a = m2411a(uri, "primaryTrackingUrl");
            Uri uriM2433b2 = m2433b(uri, "fallbackUrl");
            List listM2411a2 = m2411a(uri, "fallbackTrackingUrl");
            if (uriM2433b == null && uriM2433b2 == null) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3214b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!m2432a(uriM2433b, "primary", listM2411a, abstractC1207b, appLovinAdView, c0962a, context, c1220k)) {
                m2432a(uriM2433b2, "backup", listM2411a2, abstractC1207b, appLovinAdView, c0962a, context, c1220k);
            }
            if (c0962a != null) {
                c0962a.m233w();
                return;
            }
            return;
        }
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3214b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    /* renamed from: a */
    private boolean m2432a(Uri uri, String str, List list, AbstractC1207b abstractC1207b, AppLovinAdView appLovinAdView, C0962a c0962a, Context context, C1220k c1220k) {
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3211a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zM953b = AbstractC1048h7.m953b(uri, abstractC1207b, context, c1220k);
        if (zM953b) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3211a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c1220k.m2898g0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (c0962a != null) {
                AbstractC1168q2.m2203b(c0962a.m224e(), abstractC1207b, appLovinAdView);
                return zM953b;
            }
        } else {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("AppLovinAdService", "URL failed to open");
            }
        }
        return zM953b;
    }

    /* renamed from: a */
    private List m2411a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f1889a.m2847O();
                if (C1240o.m3200a()) {
                    this.f1889a.m2847O().m3218k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f1889a.m2832E().m2148a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private String m2410a(String str, long j, long j2, List list, String str2, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i != C1218i.f2078h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(C1218i.m2757a(i)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    /* renamed from: a */
    private void m2412a() {
        Map<String, String> mapTryToStringMap;
        if (C1240o.m3200a()) {
            this.f1890b.m3211a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f1889a.m2882b(C1286x4.f3044P);
        if (TextUtils.isEmpty(str)) {
            if (C1240o.m3200a()) {
                this.f1890b.m3211a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f1889a.m2832E().m576d(C0993c2.f542t0, mapTryToStringMap);
        String str2 = (String) this.f1889a.m2882b(C1286x4.f3043O);
        if (str2 != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l = (Long) this.f1889a.m2882b(C1286x4.f3042N);
            if (l != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l));
            }
            m2415a(new C1010e(string, string2));
            return;
        }
        if (C1240o.m3200a()) {
            this.f1890b.m3218k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    /* renamed from: a */
    private void m2415a(C1010e c1010e) {
        if (StringUtils.isValidString(c1010e.m656c())) {
            this.f1889a.m2896f0().m3131e(C1238d.m3134b().m3174d(c1010e.m656c()).m3164a(StringUtils.isValidString(c1010e.m654a()) ? c1010e.m654a() : null).m3165a(c1010e.m655b()).m3166a(false).m3170b(c1010e.m657d()).m3167a());
        } else if (C1240o.m3200a()) {
            this.f1890b.m3218k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    /* renamed from: a */
    private void m2426a(final C1254u c1254u, final C1194c c1194c) {
        AppLovinAdImpl appLovinAdImplM2707e = this.f1889a.m2901i().m2707e(c1254u);
        if (appLovinAdImplM2707e != null && !appLovinAdImplM2707e.isExpired()) {
            if (C1240o.m3200a()) {
                this.f1890b.m3211a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplM2707e + " for " + c1254u);
            }
            c1194c.adReceived(appLovinAdImplM2707e);
            return;
        }
        MaxAdFormat maxAdFormatM3374d = c1254u.m3374d();
        if (((Boolean) this.f1889a.m2866a(C1268v4.f2707W0)).booleanValue() && maxAdFormatM3374d != null && maxAdFormatM3374d.isFullscreenAd()) {
            this.f1889a.m2899h().m2697a(c1254u, new C1213d.a() { // from class: com.applovin.impl.sdk.OooO0OO
                @Override // com.applovin.impl.sdk.C1213d.a
                /* renamed from: a */
                public final void mo1974a(AbstractC1207b abstractC1207b) {
                    this.f15824OooOo0O.m2418a(c1194c, c1254u, abstractC1207b);
                }
            });
        } else {
            m2416a(new C1278w5(c1254u, c1194c, this.f1889a));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m2418a(C1194c c1194c, C1254u c1254u, AbstractC1207b abstractC1207b) {
        if (abstractC1207b != null) {
            AppLovinSdkUtils.runOnUiThread(new OooO0O0(0, c1194c, abstractC1207b));
        } else {
            m2416a(new C1278w5(c1254u, c1194c, this.f1889a));
        }
    }

    /* renamed from: a */
    private C1195d m2407a(C1254u c1254u) {
        C1195d c1195d;
        synchronized (this.f1892d) {
            try {
                c1195d = (C1195d) this.f1891c.get(c1254u);
                if (c1195d == null) {
                    c1195d = new C1195d(null);
                    this.f1891c.put(c1254u, c1195d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1195d;
    }
}

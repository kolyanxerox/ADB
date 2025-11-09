package com.applovin.impl.adview;

import OooO0oO.OooOo;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractC0989b8;
import com.applovin.impl.AbstractC0995c4;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractC1030g;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1089l8;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1179r4;
import com.applovin.impl.AbstractC1183s;
import com.applovin.impl.C0983b2;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1015e4;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1186s2;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1286x4;
import com.applovin.impl.InterfaceC1073k2;
import com.applovin.impl.InterfaceC1092m1;
import com.applovin.impl.adview.C0976k;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1218i;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.a */
/* loaded from: classes.dex */
public class C0962a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {

    /* renamed from: A */
    private volatile AppLovinAdLoadListener f226A;

    /* renamed from: B */
    private volatile AppLovinAdDisplayListener f227B;

    /* renamed from: C */
    private volatile AppLovinAdViewEventListener f228C;

    /* renamed from: D */
    private volatile AppLovinAdClickListener f229D;

    /* renamed from: a */
    private Context f230a;

    /* renamed from: b */
    private ViewGroup f231b;

    /* renamed from: c */
    private C1220k f232c;

    /* renamed from: d */
    private AppLovinAdServiceImpl f233d;

    /* renamed from: e */
    private C1240o f234e;

    /* renamed from: f */
    private AppLovinCommunicator f235f;

    /* renamed from: g */
    private b f236g;

    /* renamed from: i */
    private AppLovinAdSize f238i;

    /* renamed from: j */
    private String f239j;

    /* renamed from: k */
    private CustomTabsSession f240k;

    /* renamed from: l */
    private C0968c f241l;

    /* renamed from: m */
    private e f242m;

    /* renamed from: n */
    private C0967b f243n;

    /* renamed from: o */
    private WebView f244o;

    /* renamed from: p */
    private C0976k f245p;

    /* renamed from: q */
    private Runnable f246q;

    /* renamed from: r */
    private Runnable f247r;

    /* renamed from: h */
    private final Map f237h = Collections.synchronizedMap(new HashMap());

    /* renamed from: s */
    private volatile AbstractC1207b f248s = null;

    /* renamed from: t */
    private volatile AppLovinAd f249t = null;

    /* renamed from: u */
    private DialogC0971f f250u = null;

    /* renamed from: v */
    private DialogC0971f f251v = null;

    /* renamed from: w */
    private final AtomicReference f252w = new AtomicReference();

    /* renamed from: x */
    private final AtomicBoolean f253x = new AtomicBoolean();

    /* renamed from: y */
    private volatile boolean f254y = false;

    /* renamed from: z */
    private volatile boolean f255z = false;

    /* renamed from: com.applovin.impl.adview.a$a */
    public class a extends AbstractC1179r4 {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC1179r4
        /* renamed from: a */
        public Map mo235a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    /* renamed from: com.applovin.impl.adview.a$b */
    public interface b {
        /* renamed from: a */
        void mo236a(C0962a c0962a);
    }

    /* renamed from: com.applovin.impl.adview.a$c */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0962a.this.f243n != null) {
                C0962a.this.f243n.setVisibility(8);
            }
        }

        public /* synthetic */ c(C0962a c0962a, a aVar) {
            this();
        }
    }

    /* renamed from: com.applovin.impl.adview.a$d */
    public class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a */
        public class a implements C0976k.a {
            public a() {
            }

            @Override // com.applovin.impl.adview.C0976k.a
            /* renamed from: a */
            public void mo237a() {
                C0962a.this.f243n.addView(C0962a.this.f245p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.C0976k.a
            public void onFailure() {
                C1240o unused = C0962a.this.f234e;
                if (C1240o.m3200a()) {
                    C0962a.this.f234e.m3214b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0962a.this.f248s != null) {
                if (C0962a.this.f243n == null) {
                    C1240o.m3207h("AppLovinAdView", "Unable to render advertisement for ad #" + C0962a.this.f248s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    AbstractC1168q2.m2159a(C0962a.this.f228C, C0962a.this.f248s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    C0962a.this.f232c.m2897g().m706a(C0993c2.f539s, C0962a.this.f248s, mapHashMap);
                    return;
                }
                C0962a.this.m195v();
                C1240o unused = C0962a.this.f234e;
                if (C1240o.m3200a()) {
                    C0962a.this.f234e.m3211a("AppLovinAdView", "Rendering advertisement ad for #" + C0962a.this.f248s.getAdIdNumber() + "...");
                }
                C0962a.m171b(C0962a.this.f243n, C0962a.this.f248s.getSize());
                if (C0962a.this.f245p != null) {
                    AbstractC0989b8.m436c(C0962a.this.f245p);
                    C0962a.this.f245p = null;
                }
                C0983b2 c0983b2 = new C0983b2(C0962a.this.f237h, C0962a.this.f232c);
                if (c0983b2.m332c()) {
                    C0962a.this.f245p = new C0976k(c0983b2, C0962a.this.f230a);
                    C0962a.this.f245p.m294a(new a());
                }
                C0962a.this.f243n.setAdHtmlLoaded(false);
                C0962a.this.f243n.m256a(C0962a.this.f248s);
                if (C0962a.this.f248s.getSize() == AppLovinAdSize.INTERSTITIAL || C0962a.this.f255z) {
                    return;
                }
                C0962a.this.f248s.setHasShown(true);
            }
        }

        public /* synthetic */ d(C0962a c0962a, a aVar) {
            this();
        }
    }

    /* renamed from: com.applovin.impl.adview.a$e */
    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final C0962a f260a;

        public e(C0962a c0962a, C1220k c1220k) {
            if (c0962a == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (c1220k == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f260a = c0962a;
        }

        /* renamed from: a */
        private C0962a m238a() {
            return this.f260a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            C0962a c0962aM238a = m238a();
            if (c0962aM238a != null) {
                c0962aM238a.m220b(appLovinAd);
            } else {
                C1240o.m3207h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            C0962a c0962aM238a = m238a();
            if (c0962aM238a != null) {
                c0962aM238a.m169b(i);
            }
        }
    }

    /* renamed from: E */
    private void m154E() {
        if (this.f234e != null && C1240o.m3200a() && C1240o.m3200a()) {
            this.f234e.m3211a("AppLovinAdView", "Destroying...");
        }
        AbstractC1089l8.m1423b(this.f243n);
        this.f243n = null;
        AbstractC1089l8.m1423b(this.f244o);
        this.f244o = null;
        this.f240k = null;
        this.f226A = null;
        this.f227B = null;
        this.f229D = null;
        this.f228C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f255z = true;
    }

    /* renamed from: m */
    private void m187m() {
        if (C1240o.m3200a()) {
            this.f234e.m3211a("AppLovinAdView", "handleApplicationPaused()");
        }
        m173b("javascript:al_onAppPaused();");
    }

    /* renamed from: n */
    private void m188n() {
        if (C1240o.m3200a()) {
            this.f234e.m3211a("AppLovinAdView", "handleApplicationResumed()");
        }
        m173b("javascript:al_onAppResumed();");
    }

    /* renamed from: o */
    public /* synthetic */ void m189o() {
        this.f243n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* renamed from: p */
    public /* synthetic */ void m190p() {
        C0967b c0967b;
        m179d();
        if (this.f231b == null || (c0967b = this.f243n) == null || c0967b.getParent() != null) {
            return;
        }
        this.f231b.addView(this.f243n);
        m171b(this.f243n, this.f248s.getSize());
        if (this.f248s.isOpenMeasurementEnabled()) {
            this.f248s.getAdEventTracker().m467a((View) this.f243n);
        }
    }

    /* renamed from: q */
    public /* synthetic */ void m191q() {
        if (this.f243n != null && this.f250u != null) {
            m203a();
        }
        m154E();
    }

    /* renamed from: r */
    public /* synthetic */ void m192r() {
        if (this.f250u != null) {
            if (C1240o.m3200a()) {
                this.f234e.m3211a("AppLovinAdView", "Detaching expanded ad: " + this.f250u.m289b());
            }
            this.f251v = this.f250u;
            this.f250u = null;
            m215a(this.f238i);
        }
    }

    /* renamed from: s */
    public /* synthetic */ void m193s() {
        C1206a c1206aM289b;
        DialogC0971f dialogC0971f = this.f251v;
        if (dialogC0971f == null && this.f250u == null) {
            return;
        }
        if (dialogC0971f != null) {
            c1206aM289b = dialogC0971f.m289b();
            this.f251v.dismiss();
            this.f251v = null;
        } else {
            c1206aM289b = this.f250u.m289b();
            this.f250u.dismiss();
            this.f250u = null;
        }
        AbstractC1168q2.m2158a(this.f228C, c1206aM289b, (AppLovinAdView) this.f231b);
    }

    /* renamed from: t */
    public /* synthetic */ void m194t() {
        m225f().loadUrl("chrome://crash");
    }

    /* renamed from: v */
    public void m195v() {
        AbstractC1207b abstractC1207b = this.f248s;
        C1186s2 c1186s2 = new C1186s2();
        c1186s2.m2361a().m2364a(abstractC1207b).m2363a(m228i());
        if (!AbstractC1078k7.m1202a(abstractC1207b.getSize())) {
            c1186s2.m2361a().m2367a("Fullscreen Ad Properties").m2370b(abstractC1207b);
        }
        c1186s2.m2365a(this.f232c);
        c1186s2.m2361a();
        if (C1240o.m3200a()) {
            this.f234e.m3211a("AppLovinAdView", c1186s2.toString());
        }
    }

    /* renamed from: x */
    private void m196x() {
        if (this.f248s.m2589c1()) {
            int iM2764c = this.f232c.m2915q().m2764c();
            if (C1218i.m2757a(iM2764c)) {
                this.f243n.m257a("javascript:al_muteSwitchOn();");
            } else if (iM2764c == 2) {
                this.f243n.m257a("javascript:al_muteSwitchOff();");
            }
        }
    }

    /* renamed from: y */
    private void m197y() {
        if (AbstractC1078k7.m1202a(this.f238i)) {
            if (((Boolean) this.f232c.m2866a(C1268v4.f2548C1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f232c.m2866a(C1268v4.f2556D1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f232c.m2866a(C1268v4.f2564E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f232c.m2866a(C1268v4.f2572F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    /* renamed from: A */
    public void m198A() {
        if (C1240o.m3200a()) {
            this.f234e.m3211a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f236g;
        if (bVar != null) {
            bVar.mo236a(this);
        }
    }

    /* renamed from: B */
    public void m199B() {
        m197y();
        if (this.f248s != null && this.f248s.m2529B0()) {
            AbstractC1030g.m765a(this.f243n, this.f232c);
        }
        m173b("javascript:al_onAttachedToWindow();");
    }

    /* renamed from: C */
    public void m200C() {
        if (this.f254y) {
            if (this.f248s == null || !this.f248s.m2618m1()) {
                AbstractC1168q2.m2212b(this.f227B, this.f248s);
            }
            if (this.f248s != null && this.f248s.isOpenMeasurementEnabled() && AbstractC1078k7.m1202a(this.f248s.getSize())) {
                this.f248s.getAdEventTracker().m474f();
            }
            if (this.f243n != null && this.f250u != null) {
                if (C1240o.m3200a()) {
                    this.f234e.m3211a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                m175c();
            } else if (C1240o.m3200a()) {
                this.f234e.m3211a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            m173b("javascript:al_onDetachedFromWindow();");
        }
    }

    /* renamed from: D */
    public void m201D() {
        if (!this.f254y || this.f255z) {
            return;
        }
        this.f255z = true;
    }

    /* renamed from: F */
    public void m202F() {
        if (this.f254y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f252w.getAndSet(null);
            if (appLovinAd != null) {
                m223c(appLovinAd);
            }
            this.f255z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    /* renamed from: k */
    public AppLovinAdSize m230k() {
        return this.f238i;
    }

    /* renamed from: l */
    public String m231l() {
        return this.f239j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            m164a(new OooO00o(this, 4));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                m167a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                m176c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                m174b(action, map);
                break;
            case "com.applovin.application_paused":
                m187m();
                break;
            case "com.applovin.application_resumed":
                m188n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                m180d(action, map);
                break;
        }
    }

    /* renamed from: u */
    public void m232u() {
        if (this.f232c == null || this.f242m == null || this.f230a == null || !this.f254y) {
            C1240o.m3208i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f233d.loadNextAd(this.f239j, this.f238i, this.f242m);
        }
    }

    /* renamed from: w */
    public void m233w() {
        if ((this.f230a instanceof InterfaceC1092m1) && this.f248s != null && this.f248s.m2559U() == AbstractC1207b.b.DISMISS) {
            ((InterfaceC1092m1) this.f230a).dismiss("postitial_click");
        }
    }

    /* renamed from: z */
    public void m234z() {
        if (this.f250u != null || this.f251v != null) {
            m203a();
            return;
        }
        if (C1240o.m3200a()) {
            this.f234e.m3211a("AppLovinAdView", "Ad: " + this.f248s + " closed.");
        }
        m164a(this.f247r);
        AbstractC1168q2.m2212b(this.f227B, this.f248s);
        this.f248s = null;
    }

    /* renamed from: b */
    public static void m171b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = -1;
        int iApplyDimension2 = (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension2;
        layoutParams.height = iApplyDimension;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private void m175c() {
        m164a(new OooO00o(this, 2));
    }

    /* renamed from: d */
    private void m179d() {
        m164a(new OooO00o(this, 0));
    }

    /* renamed from: e */
    public AppLovinAdViewEventListener m224e() {
        return this.f228C;
    }

    /* renamed from: f */
    public C0967b m225f() {
        return this.f243n;
    }

    /* renamed from: g */
    public AbstractC1207b m226g() {
        return this.f248s;
    }

    /* renamed from: h */
    public CustomTabsSession m227h() {
        return this.f240k;
    }

    /* renamed from: i */
    public AppLovinAdView m228i() {
        return (AppLovinAdView) this.f231b;
    }

    /* renamed from: j */
    public C1220k m229j() {
        return this.f232c;
    }

    /* renamed from: d */
    private void m180d(String str, Map map) {
        m165a(AbstractC1089l8.m1427d(str, map));
    }

    /* renamed from: c */
    public void m221c(int i) {
        String strM424a = AbstractC0989b8.m424a(i);
        if (C1240o.m3200a()) {
            this.f234e.m3211a("AppLovinAdView", "onWindowVisibilityChanged( " + strM424a + " )");
        }
        m173b(OooOo.OooOO0O("javascript:al_onWindowVisibilityChanged( ", strM424a, " );"));
    }

    /* renamed from: a */
    public void m214a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f226A = appLovinAdLoadListener;
    }

    /* renamed from: a */
    public void m213a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f227B = appLovinAdDisplayListener;
    }

    /* renamed from: a */
    public void m208a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f228C = appLovinAdViewEventListener;
    }

    /* renamed from: a */
    public void m212a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f229D = appLovinAdClickListener;
    }

    /* renamed from: a */
    private void m161a(AppLovinAdView appLovinAdView, C1220k c1220k, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f232c = c1220k;
            this.f233d = c1220k.m2905k();
            this.f234e = c1220k.m2847O();
            this.f235f = AppLovinCommunicator.getInstance(context);
            this.f238i = appLovinAdSize;
            this.f239j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f230a = context;
            this.f231b = appLovinAdView;
            this.f241l = new C0968c(this, c1220k);
            this.f247r = new c(this, null);
            this.f246q = new d(this, null);
            this.f242m = new e(this, c1220k);
            m215a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    /* renamed from: c */
    public void m223c(AppLovinAd appLovinAd) {
        m211a(appLovinAd, (String) null);
    }

    /* renamed from: c */
    public void m222c(WebView webView) {
        m206a(webView, (String) null);
    }

    /* renamed from: c */
    private void m176c(String str, Map map) {
        m165a(AbstractC1089l8.m1425c(str, map));
    }

    /* renamed from: b */
    public void m218b() {
        m164a(new OooO00o(this, 3));
    }

    /* renamed from: b */
    public /* synthetic */ void m172b(WebView webView) {
        this.f248s.getAdEventTracker().m472c(webView);
        C0976k c0976k = this.f245p;
        if (c0976k != null && c0976k.m295a()) {
            AbstractC0995c4 adEventTracker = this.f248s.getAdEventTracker();
            C0976k c0976k2 = this.f245p;
            adEventTracker.m469b(webView, Collections.singletonList(new C1015e4(c0976k2, FriendlyObstructionPurpose.NOT_VISIBLE, c0976k2.getIdentifier())));
        } else {
            this.f248s.getAdEventTracker().m467a((View) webView);
        }
        this.f248s.getAdEventTracker().mo476h();
        this.f248s.getAdEventTracker().m475g();
    }

    /* renamed from: a */
    public void m215a(AppLovinAdSize appLovinAdSize) {
        try {
            C0967b c0967b = new C0967b(this.f241l, this.f232c, this.f230a);
            this.f243n = c0967b;
            c0967b.setBackgroundColor(0);
            this.f243n.setWillNotCacheDrawing(false);
            this.f231b.setBackgroundColor(0);
            this.f231b.addView(this.f243n);
            m171b(this.f243n, appLovinAdSize);
            if (!this.f254y) {
                m164a(this.f247r);
            }
            m164a(new OooO00o(this, 5));
            this.f254y = true;
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f232c.m2832E().m2148a("AppLovinAdView", "initAdWebView", th);
            this.f253x.set(true);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m170b(MotionEvent motionEvent) {
        C0962a c0962a;
        if (this.f250u == null && (this.f248s instanceof C1206a) && this.f243n != null) {
            C1206a c1206a = (C1206a) this.f248s;
            Context context = this.f230a;
            Activity activityM432b = context instanceof Activity ? (Activity) context : AbstractC0989b8.m432b(this.f243n, this.f232c);
            if (activityM432b != null && !activityM432b.isFinishing()) {
                ViewGroup viewGroup = this.f231b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f243n);
                }
                DialogC0971f dialogC0971f = new DialogC0971f(c1206a, this.f243n, activityM432b, this.f232c);
                this.f250u = dialogC0971f;
                dialogC0971f.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.OooO0O0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f15609OooOo0O.m158a(dialogInterface);
                    }
                });
                this.f250u.show();
                AbstractC1168q2.m2226c(this.f228C, this.f248s, (AppLovinAdView) this.f231b);
                if (this.f248s.isOpenMeasurementEnabled()) {
                    this.f248s.getAdEventTracker().m467a((View) this.f250u.m290c());
                    return;
                }
                return;
            }
            C1240o.m3207h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriMo1365m = c1206a.mo1365m();
            if (uriMo1365m != null) {
                c0962a = this;
                this.f233d.trackAndLaunchClick(c1206a, m228i(), c0962a, uriMo1365m, motionEvent, null);
            } else {
                c0962a = this;
            }
            c0962a.f243n.m257a("javascript:al_onFailedExpand();");
        }
    }

    /* renamed from: a */
    public void m207a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            C1240o.m3207h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = AbstractC1183s.m2356a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            m161a(appLovinAdView, appLovinSdk.m3943a(), appLovinAdSize2, str, context);
            if (AbstractC1183s.m2360b(attributeSet)) {
                m232u();
            }
        }
    }

    /* renamed from: a */
    public void m216a(String str, Object obj) {
        this.f237h.put(str, obj);
    }

    /* renamed from: b */
    public void m220b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f255z) {
                m223c(appLovinAd);
            } else {
                this.f252w.set(appLovinAd);
                if (C1240o.m3200a()) {
                    this.f234e.m3211a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            m164a(new OooO0Oo.OooO0O0(14, this, appLovinAd));
            return;
        }
        if (C1240o.m3200a()) {
            this.f234e.m3214b("AppLovinAdView", "No provided when to the view controller");
        }
        m169b(-1);
    }

    /* renamed from: a */
    public void m217a(boolean z) {
        if (C1240o.m3200a()) {
            this.f234e.m3211a("AppLovinAdView", "onWindowFocusChanged( " + z + " )");
        }
        m173b("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    /* renamed from: a */
    public void m211a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            AbstractC1078k7.m1216b(appLovinAd, this.f232c);
            if (this.f254y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapM675a);
                    this.f232c.m2897g().m576d(C0993c2.f533p, mapM675a);
                }
                AbstractC1207b abstractC1207b = (AbstractC1207b) AbstractC1078k7.m1165a(appLovinAd, this.f232c);
                if (abstractC1207b == null) {
                    C1240o.m3207h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    AbstractC1168q2.m2182a(this.f227B, "Unable to retrieve the loaded ad");
                    Map mapM675a2 = AbstractC1013e2.m675a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapM675a2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapM675a2);
                    this.f232c.m2897g().m576d(C0993c2.f539s, mapM675a2);
                    return;
                }
                if (abstractC1207b == this.f248s) {
                    C1240o.m3207h("AppLovinAdView", "Attempting to show ad again: " + abstractC1207b);
                    if (((Boolean) this.f232c.m2866a(C1268v4.f2580G1)).booleanValue()) {
                        if (this.f227B instanceof InterfaceC1073k2) {
                            AbstractC1168q2.m2182a(this.f227B, "Attempting to show ad again");
                        } else if (!AbstractC1078k7.m1228c(this.f232c)) {
                            this.f232c.m2897g().m706a(C0993c2.f474E0, abstractC1207b, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f232c.m2897g().m706a(C0993c2.f539s, abstractC1207b, mapHashMap);
                    return;
                }
                if (C1240o.m3200a()) {
                    this.f234e.m3211a("AppLovinAdView", "Rendering ad #" + abstractC1207b.getAdIdNumber() + " (" + abstractC1207b.getSize() + ")");
                }
                AbstractC1168q2.m2212b(this.f227B, this.f248s);
                if (this.f248s != null && this.f248s.isOpenMeasurementEnabled()) {
                    this.f248s.getAdEventTracker().m474f();
                }
                this.f252w.set(null);
                this.f249t = null;
                this.f248s = abstractC1207b;
                if (this.f248s.m2539G0()) {
                    this.f240k = this.f232c.m2825A().m669a(this);
                    this.f232c.m2825A().m672b(this.f248s.m2532D(), this.f240k);
                }
                if (!this.f255z && AbstractC1078k7.m1202a(this.f238i)) {
                    this.f232c.m2905k().trackImpression(abstractC1207b);
                }
                if (this.f250u != null) {
                    m175c();
                }
                m164a(this.f246q);
                return;
            }
            C1240o.m3208i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* renamed from: b */
    public void m169b(int i) {
        if (!this.f255z) {
            m164a(this.f247r);
        }
        m164a(new androidx.core.content.res.OooO00o(this, i, 1));
    }

    /* renamed from: b */
    private void m173b(String str) {
        if (((Boolean) this.f232c.m2866a(C1268v4.f2548C1)).booleanValue()) {
            m165a(str);
        }
    }

    /* renamed from: b */
    private void m174b(String str, Map map) {
        m165a(AbstractC1089l8.m1422b(str, map));
    }

    /* renamed from: b */
    public void m219b(Uri uri) {
        if (this.f248s != null && this.f248s.m2543I0() && this.f244o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f232c.m2847O();
                if (C1240o.m3200a()) {
                    this.f232c.m2847O().m3214b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f230a);
            this.f244o = webView;
            webView.setWebViewClient(new a());
            this.f244o.getSettings().setJavaScriptEnabled(true);
            this.f244o.loadDataWithBaseURL((String) this.f232c.m2866a(C1268v4.f2737Z6), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    /* renamed from: a */
    public void m206a(WebView webView, String str) {
        if (this.f248s == null) {
            return;
        }
        m164a(new OooOO0(webView, 2));
        if (!((Boolean) this.f232c.m2866a(C1268v4.f2842m6)).booleanValue() || (str != null && str.startsWith(this.f248s.m2612k()))) {
            try {
                if (this.f248s != this.f249t) {
                    this.f249t = this.f248s;
                    m196x();
                    this.f243n.setAdHtmlLoaded(true);
                    if (this.f227B != null) {
                        this.f232c.m2933z().m551d(this.f248s);
                        if (this.f248s.m2531C0()) {
                            this.f232c.m2897g().m706a(C0993c2.f537r, this.f248s, CollectionUtils.hashMap("details", AbstractC1013e2.m680b(this.f248s)));
                        } else {
                            this.f232c.m2897g().m706a(C0993c2.f535q, this.f248s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f248s.m2544J())));
                            AbstractC1168q2.m2181a(this.f227B, this.f248s);
                        }
                        if (this.f248s.m2593d1()) {
                            String str2 = (String) this.f232c.m2916q0().m3795a(C1286x4.f3047S, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f243n.m257a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f243n.m257a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f248s.m2531C0()) {
                            this.f243n.m257a("javascript:al_onAdRestored( '" + this.f248s.m2604h0() + "' );");
                        }
                    }
                    if ((this.f248s instanceof C1206a) && this.f248s.isOpenMeasurementEnabled()) {
                        this.f232c.m2918r0().m404a(new C1156p6(this.f232c, "StartOMSDK", new OooO0Oo.OooO0O0(13, this, webView)), C0987b6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                C1240o.m3204c("AppLovinAdView", "Exception while notifying ad display listener", th);
                C1220k c1220k = this.f232c;
                if (c1220k != null) {
                    c1220k.m2832E().m2148a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    /* renamed from: a */
    public void m205a(MotionEvent motionEvent) {
        m164a(new OooO0Oo.OooO0O0(12, this, motionEvent));
    }

    /* renamed from: a */
    public /* synthetic */ void m158a(DialogInterface dialogInterface) {
        m203a();
    }

    /* renamed from: a */
    public void m203a() {
        m164a(new OooO00o(this, 1));
    }

    /* renamed from: a */
    public void m210a(AbstractC1207b abstractC1207b, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        C0962a c0962a;
        AbstractC1207b abstractC1207b2;
        if (appLovinAdView != null) {
            c0962a = this;
            abstractC1207b2 = abstractC1207b;
            this.f233d.trackAndLaunchClick(abstractC1207b2, appLovinAdView, c0962a, uri, motionEvent, bundle);
        } else {
            c0962a = this;
            abstractC1207b2 = abstractC1207b;
            if (C1240o.m3200a()) {
                c0962a.f234e.m3214b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        AbstractC1168q2.m2180a(c0962a.f229D, abstractC1207b2);
    }

    /* renamed from: a */
    public /* synthetic */ void m163a(AppLovinAd appLovinAd) {
        if (this.f253x.compareAndSet(true, false)) {
            m215a(this.f238i);
        }
        try {
            if (this.f226A != null) {
                this.f226A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            C1240o.m3207h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            C1220k c1220k = this.f232c;
            if (c1220k != null) {
                c1220k.m2832E().m2148a("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m157a(int i) {
        try {
            if (this.f226A != null) {
                this.f226A.failedToReceiveAd(i);
            }
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinAdView", "Exception while running app load callback", th);
            C1220k c1220k = this.f232c;
            if (c1220k != null) {
                c1220k.m2832E().m2148a("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    /* renamed from: a */
    private void m164a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* renamed from: a */
    public void m209a(b bVar) {
        this.f236g = bVar;
    }

    /* renamed from: a */
    private void m167a(String str, Map map) {
        m165a(AbstractC1089l8.m1416a(str, map));
    }

    /* renamed from: a */
    private void m165a(String str) {
        if (this.f248s == null || this.f243n == null || !AbstractC1078k7.m1202a(this.f248s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f243n.m257a(str);
    }

    /* renamed from: a */
    public void m204a(Uri uri) {
        if (this.f248s == null || !this.f248s.m2543I0()) {
            return;
        }
        if (this.f244o == null) {
            this.f232c.m2847O();
            if (C1240o.m3200a()) {
                this.f232c.m2847O().m3211a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        String queryParameter = uri.getQueryParameter("event_name");
        String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f232c.m2847O();
            if (C1240o.m3200a()) {
                this.f232c.m2847O().m3211a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        m164a(new androidx.webkit.OooO00o(this, queryParameter2, queryParameter, 1));
    }

    /* renamed from: a */
    public /* synthetic */ void m166a(String str, String str2) {
        String strOooOO0O;
        if (StringUtils.isValidString(str)) {
            strOooOO0O = OooOo.OooOO0o("gtag('event', '", str2, "', ", str, ");");
        } else {
            strOooOO0O = OooOo.OooOO0O("gtag('event', '", str2, "')");
        }
        if (((Boolean) this.f232c.m2866a(C1268v4.f2645O2)).booleanValue()) {
            AbstractC1089l8.m1414a(this.f244o, strOooOO0O, this.f232c);
        } else {
            AbstractC1089l8.m1419a(this.f244o, strOooOO0O);
        }
    }
}

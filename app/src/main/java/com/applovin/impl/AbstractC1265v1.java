package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1041h0;
import com.applovin.impl.adview.AbstractC0970e;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.adview.C0967b;
import com.applovin.impl.adview.C0972g;
import com.applovin.impl.adview.C0976k;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1218i;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.v1 */
/* loaded from: classes.dex */
public abstract class AbstractC1265v1 implements AppLovinBroadcastManager.Receiver, C0962a.b {

    /* renamed from: A */
    protected int f2471A;

    /* renamed from: B */
    protected boolean f2472B;

    /* renamed from: C */
    private ContentObserver f2473C;

    /* renamed from: D */
    private Float f2474D;

    /* renamed from: E */
    protected AppLovinAdClickListener f2475E;

    /* renamed from: F */
    protected AppLovinAdDisplayListener f2476F;

    /* renamed from: G */
    protected AppLovinAdVideoPlaybackListener f2477G;

    /* renamed from: H */
    protected C1008d7 f2478H;

    /* renamed from: I */
    protected C1008d7 f2479I;

    /* renamed from: J */
    protected boolean f2480J;

    /* renamed from: K */
    private final C1041h0 f2481K;

    /* renamed from: L */
    private boolean f2482L;

    /* renamed from: a */
    protected final AbstractC1207b f2483a;

    /* renamed from: b */
    protected final C1220k f2484b;

    /* renamed from: c */
    protected final C1240o f2485c;

    /* renamed from: d */
    protected Activity f2486d;

    /* renamed from: e */
    private final int f2487e;

    /* renamed from: f */
    private final Handler f2488f;

    /* renamed from: g */
    private final AbstractC0980b f2489g;

    /* renamed from: h */
    private final C1218i.a f2490h;

    /* renamed from: i */
    protected AppLovinAdView f2491i;

    /* renamed from: j */
    protected C0976k f2492j;

    /* renamed from: k */
    protected final C0972g f2493k;

    /* renamed from: l */
    protected final C0972g f2494l;

    /* renamed from: m */
    protected final long f2495m;

    /* renamed from: n */
    private final AtomicBoolean f2496n;

    /* renamed from: o */
    private final AtomicBoolean f2497o;

    /* renamed from: p */
    private boolean f2498p;

    /* renamed from: q */
    protected long f2499q;

    /* renamed from: r */
    protected long f2500r;

    /* renamed from: s */
    private boolean f2501s;

    /* renamed from: t */
    protected boolean f2502t;

    /* renamed from: u */
    protected int f2503u;

    /* renamed from: v */
    protected boolean f2504v;

    /* renamed from: w */
    private int f2505w;

    /* renamed from: x */
    private final ArrayList f2506x;

    /* renamed from: y */
    protected int f2507y;

    /* renamed from: z */
    protected int f2508z;

    /* renamed from: com.applovin.impl.v1$a */
    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            C1240o c1240o = AbstractC1265v1.this.f2485c;
            if (C1240o.m3200a()) {
                AbstractC1265v1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            C1240o c1240o = AbstractC1265v1.this.f2485c;
            if (C1240o.m3200a()) {
                AbstractC1265v1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            AbstractC1265v1.this.mo3462a("web_view");
        }
    }

    /* renamed from: com.applovin.impl.v1$b */
    public class b implements C1218i.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.C1218i.a
        /* renamed from: a */
        public void mo2765a(int i) {
            AbstractC1265v1 abstractC1265v1 = AbstractC1265v1.this;
            if (abstractC1265v1.f2471A != C1218i.f2078h) {
                abstractC1265v1.f2472B = true;
            }
            C0967b c0967bM225f = abstractC1265v1.f2491i.getController().m225f();
            if (c0967bM225f == null) {
                C1240o c1240o = AbstractC1265v1.this.f2485c;
                if (C1240o.m3200a()) {
                    AbstractC1265v1.this.f2485c.m3218k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (C1218i.m2757a(i) && !C1218i.m2757a(AbstractC1265v1.this.f2471A)) {
                c0967bM225f.m257a("javascript:al_muteSwitchOn();");
            } else if (i == 2) {
                c0967bM225f.m257a("javascript:al_muteSwitchOff();");
            }
            AbstractC1265v1.this.f2471A = i;
        }
    }

    /* renamed from: com.applovin.impl.v1$c */
    public class c extends AbstractC0980b {

        /* renamed from: a */
        final /* synthetic */ C1220k f2511a;

        public c(C1220k c1220k) {
            this.f2511a = c1220k;
        }

        /* renamed from: a */
        private boolean m3494a(Activity activity) {
            return activity.getClass().getName().equals(AbstractC1078k7.m1169a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f2511a));
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!AbstractC1265v1.this.m3453y() && m3494a(activity)) {
                AbstractC1265v1.this.m3442c();
            }
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (AbstractC1265v1.this.m3453y() && m3494a(activity)) {
                AbstractC1265v1.this.m3442c();
            }
        }
    }

    /* renamed from: com.applovin.impl.v1$d */
    public class d extends ContentObserver {

        /* renamed from: a */
        final /* synthetic */ C1220k f2513a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Handler handler, C1220k c1220k) {
            super(handler);
            this.f2513a = c1220k;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Float fM2762b = this.f2513a.m2915q().m2762b();
            if (fM2762b == null || AbstractC1265v1.this.f2474D == null || fM2762b.equals(AbstractC1265v1.this.f2474D)) {
                return;
            }
            String str = fM2762b.floatValue() > AbstractC1265v1.this.f2474D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fM2762b.floatValue());
            AbstractC1265v1.this.m3475e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            AbstractC1265v1.this.f2474D = fM2762b;
        }
    }

    /* renamed from: com.applovin.impl.v1$e */
    public class e extends AbstractC0980b {

        /* renamed from: a */
        final /* synthetic */ C1170q4 f2515a;

        public e(C1170q4 c1170q4) {
            this.f2515a = c1170q4;
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f2515a.m2271b(null);
                AbstractC1265v1.this.f2484b.m2893e().m440b(this);
            }
        }
    }

    /* renamed from: com.applovin.impl.v1$g */
    public interface g {
        /* renamed from: a */
        void mo56a(AbstractC1265v1 abstractC1265v1);

        /* renamed from: a */
        void mo57a(String str, Throwable th);
    }

    /* renamed from: com.applovin.impl.v1$h */
    public class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        /* renamed from: a */
        public /* synthetic */ void m3495a() {
            AbstractC1265v1.this.f2499q = SystemClock.elapsedRealtime();
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            C1240o c1240o = AbstractC1265v1.this.f2485c;
            if (C1240o.m3200a()) {
                AbstractC1265v1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            AbstractC1168q2.m2180a(AbstractC1265v1.this.f2475E, appLovinAd);
            AbstractC1265v1.this.f2508z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC1265v1 abstractC1265v1 = AbstractC1265v1.this;
            if (view != abstractC1265v1.f2493k || !((Boolean) abstractC1265v1.f2484b.m2866a(C1268v4.f2700V1)).booleanValue()) {
                C1240o c1240o = AbstractC1265v1.this.f2485c;
                if (C1240o.m3200a()) {
                    AbstractC1265v1.this.f2485c.m3214b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            AbstractC1265v1.m3448e(AbstractC1265v1.this);
            if (AbstractC1265v1.this.f2483a.m2584b1()) {
                AbstractC1265v1.this.m3475e("javascript:al_onCloseButtonTapped(" + AbstractC1265v1.this.f2505w + "," + AbstractC1265v1.this.f2507y + "," + AbstractC1265v1.this.f2508z + ");");
            }
            List listM2551P = AbstractC1265v1.this.f2483a.m2551P();
            C1240o c1240o2 = AbstractC1265v1.this.f2485c;
            if (C1240o.m3200a()) {
                AbstractC1265v1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Handling close button tap " + AbstractC1265v1.this.f2505w + " with multi close delay: " + listM2551P);
            }
            if (listM2551P == null || listM2551P.size() <= AbstractC1265v1.this.f2505w) {
                AbstractC1265v1.this.mo3462a("native_close_button");
                return;
            }
            AbstractC1265v1.this.f2506x.add(Long.valueOf(SystemClock.elapsedRealtime() - AbstractC1265v1.this.f2499q));
            List listM2550N = AbstractC1265v1.this.f2483a.m2550N();
            if (listM2550N != null && listM2550N.size() > AbstractC1265v1.this.f2505w) {
                AbstractC1265v1 abstractC1265v12 = AbstractC1265v1.this;
                abstractC1265v12.f2493k.m292a((AbstractC0970e.a) listM2550N.get(abstractC1265v12.f2505w));
            }
            C1240o c1240o3 = AbstractC1265v1.this.f2485c;
            if (C1240o.m3200a()) {
                AbstractC1265v1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listM2551P.get(AbstractC1265v1.this.f2505w));
            }
            AbstractC1265v1.this.f2493k.setVisibility(8);
            AbstractC1265v1 abstractC1265v13 = AbstractC1265v1.this;
            abstractC1265v13.m3459a(abstractC1265v13.f2493k, ((Integer) listM2551P.get(abstractC1265v13.f2505w)).intValue(), new o0OO00O(this, 2));
        }

        public /* synthetic */ h(AbstractC1265v1 abstractC1265v1, a aVar) {
            this();
        }
    }

    public AbstractC1265v1(AbstractC1207b abstractC1207b, Activity activity, Map map, C1220k c1220k, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f2488f = handler;
        this.f2495m = SystemClock.elapsedRealtime();
        this.f2496n = new AtomicBoolean();
        this.f2497o = new AtomicBoolean();
        this.f2499q = -1L;
        this.f2505w = 0;
        this.f2506x = new ArrayList();
        this.f2507y = 0;
        this.f2508z = 0;
        this.f2471A = C1218i.f2078h;
        this.f2482L = false;
        this.f2483a = abstractC1207b;
        this.f2484b = c1220k;
        this.f2485c = c1220k.m2847O();
        this.f2486d = activity;
        this.f2487e = abstractC1207b.m2583b0();
        this.f2475E = appLovinAdClickListener;
        this.f2476F = appLovinAdDisplayListener;
        this.f2477G = appLovinAdVideoPlaybackListener;
        this.f2481K = new C1041h0(c1220k);
        h hVar = new h(this, null);
        if (((Boolean) c1220k.m2866a(C1268v4.f2830l2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) c1220k.m2866a(C1268v4.f2878r2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        C1247t1 c1247t1 = new C1247t1(c1220k.m2934z0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f2491i = c1247t1;
        c1247t1.setAdClickListener(hVar);
        this.f2491i.setAdDisplayListener(new a());
        abstractC1207b.m2603h().putString("ad_view_address", AbstractC0989b8.m425a(this.f2491i));
        this.f2491i.getController().m209a(this);
        C0983b2 c0983b2 = new C0983b2(map, c1220k);
        if (c0983b2.m332c()) {
            this.f2492j = new C0976k(c0983b2, activity);
        }
        c1220k.m2905k().trackImpression(abstractC1207b);
        List listM2551P = abstractC1207b.m2551P();
        if (abstractC1207b.m2632s() >= 0 || listM2551P != null) {
            C0972g c0972g = new C0972g(abstractC1207b.m2628q(), activity);
            this.f2493k = c0972g;
            c0972g.setVisibility(8);
            c0972g.setOnClickListener(hVar);
        } else {
            this.f2493k = null;
        }
        C0972g c0972g2 = new C0972g(AbstractC0970e.a.WHITE_ON_TRANSPARENT, activity);
        this.f2494l = c0972g2;
        c0972g2.setOnClickListener(new Oooo000(this, 2));
        if (abstractC1207b.m2608i1()) {
            this.f2490h = new b();
        } else {
            this.f2490h = null;
        }
        this.f2489g = new c(c1220k);
        if (abstractC1207b.m2596e1()) {
            this.f2474D = c1220k.m2915q().m2762b();
            this.f2473C = new d(handler, c1220k);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.f2473C);
        }
    }

    /* renamed from: A */
    private void m3425A() {
        if (this.f2490h != null) {
            this.f2484b.m2915q().m2761a(this.f2490h);
        }
        if (this.f2489g != null) {
            this.f2484b.m2893e().m438a(this.f2489g);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ int m3448e(AbstractC1265v1 abstractC1265v1) {
        int i = abstractC1265v1.f2505w;
        abstractC1265v1.f2505w = i + 1;
        return i;
    }

    /* renamed from: i */
    public /* synthetic */ void m3451i() {
        if (this.f2483a.m2583b0() <= this.f2487e && !AbstractC1000d.m510d(this.f2486d)) {
            if (C1240o.m3200a()) {
                this.f2485c.m3215d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f2498p = false;
            long jM2585c = this.f2483a.m2585c();
            if (jM2585c > 0) {
                m3426a(jM2585c).m2269a(C1170q4.f1798h, new o000000(this, 5));
            } else {
                m3450f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* renamed from: j */
    public /* synthetic */ void m3452j() {
        if (this.f2483a.m2547L0().getAndSet(true)) {
            return;
        }
        this.f2484b.m2918r0().m403a((AbstractRunnableC1036g5) new C1077k6(this.f2483a, this.f2484b), C0987b6.b.OTHER);
    }

    /* renamed from: y */
    public boolean m3453y() {
        return m3454a() >= 0;
    }

    /* renamed from: a */
    public abstract void mo3458a(ViewGroup viewGroup);

    /* renamed from: b */
    public abstract void mo3467b(long j);

    /* renamed from: g */
    public boolean m3477g() {
        return AppLovinAdType.INCENTIVIZED == this.f2483a.getType();
    }

    /* renamed from: h */
    public boolean m3478h() {
        return this.f2486d instanceof AppLovinFullscreenActivity;
    }

    /* renamed from: k */
    public void m3479k() {
        if (!this.f2498p && this.f2497o.compareAndSet(false, true)) {
            AbstractC1168q2.m2212b(this.f2476F, this.f2483a);
            this.f2484b.m2839I().m3047b(this.f2483a);
            HashMap map = new HashMap();
            AbstractC1207b abstractC1207b = this.f2483a;
            if (abstractC1207b != null) {
                CollectionUtils.putStringIfValid("source", abstractC1207b.m2536F(), map);
                CollectionUtils.putStringIfValid("details", AbstractC1013e2.m680b(this.f2483a), map);
            }
            this.f2484b.m2897g().m706a(C0993c2.f541t, this.f2483a, map);
        }
    }

    /* renamed from: l */
    public abstract void mo3480l();

    /* renamed from: m */
    public void m3481m() {
        C1008d7 c1008d7 = this.f2478H;
        if (c1008d7 != null) {
            c1008d7.m642d();
        }
    }

    /* renamed from: n */
    public void m3482n() {
        C1008d7 c1008d7 = this.f2478H;
        if (c1008d7 != null) {
            c1008d7.m643e();
        }
    }

    /* renamed from: o */
    public void m3483o() {
        C0967b c0967bM225f;
        if (this.f2491i == null || !this.f2483a.m2533D0() || (c0967bM225f = this.f2491i.getController().m225f()) == null) {
            return;
        }
        this.f2481K.m842a(c0967bM225f, new f());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                mo3471d();
                break;
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                m3433a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                m3445c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                m3440b(action, map);
                break;
            case "com.applovin.render_process_gone":
                if (!this.f2502t) {
                    mo3474e();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                m3447d(action, map);
                break;
        }
    }

    /* renamed from: p */
    public void m3484p() {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f2482L) {
            mo3462a("back_button");
        }
        if (this.f2483a.m2584b1()) {
            m3475e("javascript:onBackPressed();");
        }
    }

    /* renamed from: q */
    public void mo3485q() {
        AppLovinAdView appLovinAdView = this.f2491i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f2491i.destroy();
            this.f2491i = null;
            if ((parent instanceof ViewGroup) && m3478h()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        mo3480l();
        m3479k();
        this.f2475E = null;
        this.f2476F = null;
        this.f2477G = null;
        this.f2486d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    /* renamed from: r */
    public void mo3486r() {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "onPause()");
        }
        m3472d("javascript:al_onAppPaused();");
        m3481m();
    }

    /* renamed from: s */
    public void mo3487s() {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "onResume()");
        }
        m3472d("javascript:al_onAppResumed();");
        m3482n();
    }

    /* renamed from: t */
    public void m3488t() {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    /* renamed from: u */
    public abstract void mo3489u();

    /* renamed from: v */
    public abstract void mo3490v();

    /* renamed from: w */
    public void mo3491w() {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.f2480J = true;
    }

    /* renamed from: x */
    public boolean m3492x() {
        return this.f2498p;
    }

    /* renamed from: z */
    public abstract void mo3493z();

    /* renamed from: c */
    public void m3442c() {
        if (!m3453y()) {
            m3450f("app_relaunch");
            return;
        }
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
        }
        this.f2498p = true;
        long jM2597f = this.f2483a.m2597f();
        if (jM2597f < 0) {
            return;
        }
        m3461a(new o000Oo0(this, 0), jM2597f);
    }

    /* renamed from: f */
    private void m3450f(String str) {
        if (this.f2497o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o000O00O(this, str, 1));
    }

    /* renamed from: b */
    public void mo3468b(boolean z) {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        m3472d("javascript:al_onWindowFocusChanged( " + z + " );");
        C1008d7 c1008d7 = this.f2479I;
        if (c1008d7 != null) {
            if (z) {
                c1008d7.m643e();
            } else {
                c1008d7.m642d();
            }
        }
    }

    /* renamed from: d */
    public void m3473d(boolean z) {
        this.f2498p = z;
    }

    /* renamed from: e */
    public void m3475e(String str) {
        mo3463a(str, 0L);
    }

    /* renamed from: d */
    public void m3472d(String str) {
        if (this.f2483a.m2541H0()) {
            mo3463a(str, 0L);
        }
    }

    /* renamed from: e */
    public void mo3474e() {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f2502t = true;
    }

    /* renamed from: com.applovin.impl.v1$f */
    public class f implements C1041h0.c {
        public f() {
        }

        @Override // com.applovin.impl.C1041h0.c
        /* renamed from: a */
        public void mo846a(int i, int i2) {
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) AbstractC1265v1.this.f2483a);
            mapM675a.putAll(AbstractC1013e2.m676a(AbstractC1265v1.this.f2483a));
            mapM675a.put("details", "detection_count=" + i + ",total_checks=" + i2);
            AbstractC1265v1.this.f2484b.m2832E().m576d(C0993c2.f550x0, mapM675a);
        }

        @Override // com.applovin.impl.C1041h0.c
        /* renamed from: a */
        public void mo847a(int i, int i2, int i3) {
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) AbstractC1265v1.this.f2483a);
            mapM675a.putAll(AbstractC1013e2.m676a(AbstractC1265v1.this.f2483a));
            mapM675a.put("details", "detections_to_report=" + i + ",detection_count=" + i2 + ",total_checks=" + i3);
            AbstractC1265v1.this.f2484b.m2832E().m576d(C0993c2.f552y0, mapM675a);
            if (((Boolean) AbstractC1265v1.this.f2484b.m2866a(C1268v4.f2786f6)).booleanValue()) {
                AbstractC1265v1.this.mo3491w();
            }
            if (((Boolean) AbstractC1265v1.this.f2484b.m2866a(C1268v4.f2651P0)).booleanValue()) {
                AbstractC1265v1.this.f2484b.m2837H().m3034c(AbstractC1265v1.this.f2483a, C1220k.m2824o());
            }
            if (((Boolean) AbstractC1265v1.this.f2484b.m2866a(C1268v4.f2752b6)).booleanValue()) {
                AbstractC1265v1.this.mo3462a("black_view_auto_dismiss");
                return;
            }
            AbstractC1265v1 abstractC1265v1 = AbstractC1265v1.this;
            abstractC1265v1.f2482L = ((Boolean) abstractC1265v1.f2484b.m2866a(C1268v4.f2761c6)).booleanValue();
            if (((Boolean) AbstractC1265v1.this.f2484b.m2866a(C1268v4.f2770d6)).booleanValue()) {
                AbstractC1265v1.this.mo3493z();
            }
        }
    }

    /* renamed from: a */
    public static void m3431a(AbstractC1207b abstractC1207b, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, C1220k c1220k, Activity activity, g gVar) {
        AbstractC1265v1 c1292y1;
        if (abstractC1207b instanceof C1088l7) {
            try {
                c1292y1 = new C1292y1(abstractC1207b, activity, map, c1220k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                gVar.mo57a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + c1220k + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (abstractC1207b.hasVideoUrl()) {
            try {
                c1292y1 = new C1301z1(abstractC1207b, activity, map, c1220k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.mo57a("Failed to create FullscreenVideoAdPresenter with sdk: " + c1220k + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                c1292y1 = new C1274w1(abstractC1207b, activity, map, c1220k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.mo57a("Failed to create FullscreenGraphicAdPresenter with sdk: " + c1220k + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        c1292y1.m3425A();
        gVar.mo56a(c1292y1);
    }

    /* renamed from: f */
    public boolean m3476f() {
        return this.f2501s;
    }

    /* renamed from: d */
    public void mo3471d() {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    /* renamed from: d */
    private void m3447d(String str, Map map) {
        m3475e(AbstractC1089l8.m1427d(str, map));
    }

    /* renamed from: b */
    public /* synthetic */ void m3439b(String str) {
        C0967b c0967bM225f;
        AppLovinAdView appLovinAdView = this.f2491i;
        if (appLovinAdView == null || (c0967bM225f = appLovinAdView.getController().m225f()) == null) {
            return;
        }
        c0967bM225f.m257a(str);
    }

    /* renamed from: c */
    public /* synthetic */ void m3444c(String str) {
        C1240o.m3207h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            mo3462a(str);
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                m3479k();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m3437b(C0972g c0972g, Runnable runnable) {
        AbstractC0989b8.m426a(c0972g, 400L, new o000O00(c0972g, runnable, 2));
    }

    /* renamed from: b */
    public int m3466b() {
        int iM2636u = this.f2483a.m2636u();
        return (iM2636u <= 0 && ((Boolean) this.f2484b.m2866a(C1268v4.f2814j2)).booleanValue()) ? this.f2503u + 1 : iM2636u;
    }

    /* renamed from: c */
    public void m3470c(boolean z) {
        m3464a(z, ((Long) this.f2484b.m2866a(C1268v4.f2822k2)).longValue());
        if (!this.f2483a.m2531C0()) {
            AbstractC1168q2.m2181a(this.f2476F, this.f2483a);
        }
        this.f2484b.m2839I().m3042a(this.f2483a);
        if (!this.f2483a.m2531C0() && (this.f2483a.hasVideoUrl() || m3477g())) {
            AbstractC1168q2.m2185a(this.f2477G, this.f2483a);
        }
        new C1075k4(this.f2486d).m1137a(this.f2483a);
        this.f2483a.setHasShown(true);
    }

    /* renamed from: a */
    public /* synthetic */ void m3428a(View view) {
        mo3462a("backup_close_button");
    }

    /* renamed from: b */
    private void m3440b(String str, Map map) {
        m3475e(AbstractC1089l8.m1422b(str, map));
    }

    /* renamed from: a */
    public long m3454a() {
        AbstractC1207b abstractC1207b = this.f2483a;
        if (abstractC1207b == null) {
            return -1L;
        }
        return abstractC1207b.m2600g();
    }

    /* renamed from: a */
    public /* synthetic */ void m3434a(boolean z, Void r2, Void r3) {
        if (z) {
            return;
        }
        m3450f("app_relaunch_bring_to_front_failed");
    }

    /* renamed from: a */
    private C1170q4 m3426a(long j) {
        C1170q4 c1170q4 = new C1170q4("bringAdActivityToFront");
        e eVar = new e(c1170q4);
        this.f2484b.m2893e().m438a(eVar);
        Intent intent = new Intent(this.f2486d, (Class<?>) (this.f2483a.m2566X0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        this.f2486d.startActivity(intent);
        m3461a(new androidx.webkit.OooO00o(this, eVar, c1170q4, 18), j);
        return c1170q4;
    }

    /* renamed from: c */
    public static /* synthetic */ void m3443c(C0972g c0972g, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new o000O00(c0972g, runnable, 1));
    }

    /* renamed from: c */
    public void m3469c(long j) {
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.f2478H = C1008d7.m629a(j, this.f2484b, new o000Oo0(this, 1));
    }

    /* renamed from: c */
    private void m3445c(String str, Map map) {
        m3475e(AbstractC1089l8.m1425c(str, map));
    }

    /* renamed from: a */
    public /* synthetic */ void m3430a(AbstractC0980b abstractC0980b, C1170q4 c1170q4) {
        this.f2484b.m2893e().m440b(abstractC0980b);
        if (c1170q4.m2273c()) {
            return;
        }
        c1170q4.m2266a((Object) null);
    }

    /* renamed from: a */
    public boolean m3465a(boolean z) {
        List listM1179a = AbstractC1078k7.m1179a(z, this.f2483a, this.f2484b, this.f2486d);
        if (listM1179a.isEmpty()) {
            return false;
        }
        String str = "Missing ad resources: " + listM1179a;
        Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) this.f2483a);
        if (((Boolean) this.f2484b.m2866a(C1268v4.f2592H5)).booleanValue()) {
            if (C1240o.m3200a()) {
                this.f2485c.m3214b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listM1179a);
            }
            if (((Boolean) this.f2484b.m2866a(C1268v4.f2616K5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.f2476F;
                if (appLovinAdDisplayListener instanceof InterfaceC1073k2) {
                    AbstractC1168q2.m2182a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                C1093m2.m1453a(this.f2483a, this.f2476F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            mo3462a("missing_ad_resources");
            m3432a(str, "Failing ad display", mapM675a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f2484b.m2897g().m706a(C0993c2.f539s, this.f2483a, mapHashMap);
            return ((Boolean) this.f2484b.m2866a(C1268v4.f2608J5)).booleanValue();
        }
        if (C1240o.m3200a()) {
            this.f2485c.m3214b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listM1179a);
        }
        this.f2483a.mo1359Q0();
        m3432a(str, "Streaming ad", mapM675a);
        return false;
    }

    /* renamed from: a */
    public void m3460a(AbstractC1141o0.a aVar, AbstractC1141o0.a aVar2, AbstractC1141o0.a aVar3) {
        if (((Boolean) this.f2484b.m2866a(C1268v4.f2543B4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", AbstractC1078k7.m1213b(this.f2486d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.m1963e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.m1963e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.m1963e());
            }
            m3475e(AbstractC1089l8.m1417a(map));
        }
    }

    /* renamed from: a */
    public void mo3462a(String str) {
        this.f2501s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2495m;
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        AbstractC1207b abstractC1207b = this.f2483a;
        if (abstractC1207b != null) {
            abstractC1207b.getAdEventTracker().m474f();
        }
        this.f2488f.removeCallbacksAndMessages(null);
        mo3463a("javascript:al_onPoststitialDismiss();", this.f2483a != null ? r0.m2538G() : 0L);
        if (((Boolean) this.f2484b.m2866a(C1268v4.f2561D6)).booleanValue()) {
            AbstractC1207b abstractC1207b2 = this.f2483a;
            if (abstractC1207b2 != null) {
                abstractC1207b2.m2576a(str);
            }
            mo3480l();
        }
        m3479k();
        this.f2481K.m843b();
        if (this.f2490h != null) {
            this.f2484b.m2915q().m2763b(this.f2490h);
        }
        if (this.f2489g != null) {
            this.f2484b.m2893e().m440b(this.f2489g);
        }
        if (this.f2473C != null) {
            this.f2486d.getContentResolver().unregisterContentObserver(this.f2473C);
            this.f2473C = null;
        }
        if (m3478h()) {
            this.f2486d.finish();
            return;
        }
        this.f2484b.m2847O();
        if (C1240o.m3200a()) {
            this.f2484b.m2847O().m3211a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        mo3485q();
    }

    /* renamed from: a */
    public void m3457a(Configuration configuration) {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    /* renamed from: a */
    public void m3455a(int i, KeyEvent keyEvent) {
        if (this.f2485c == null || !C1240o.m3200a()) {
            return;
        }
        this.f2485c.m3215d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    /* renamed from: a */
    public void mo3463a(String str, long j) {
        if (j < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        m3461a(new o000O00O(this, str, 0), j);
    }

    /* renamed from: a */
    public void m3459a(C0972g c0972g, long j, Runnable runnable) {
        if (j >= ((Long) this.f2484b.m2866a(C1268v4.f2692U1)).longValue()) {
            return;
        }
        this.f2479I = C1008d7.m629a(TimeUnit.SECONDS.toMillis(j), this.f2484b, new o000O00(c0972g, runnable, 0));
    }

    /* renamed from: a */
    public static /* synthetic */ void m3429a(C0972g c0972g, Runnable runnable) {
        c0972g.bringToFront();
        runnable.run();
    }

    /* renamed from: a */
    public void m3456a(int i, boolean z, boolean z2, long j) {
        if (!this.f2498p && this.f2496n.compareAndSet(false, true)) {
            if (this.f2483a.hasVideoUrl() || m3477g()) {
                AbstractC1168q2.m2186a(this.f2477G, this.f2483a, i, z2);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2495m;
            this.f2484b.m2905k().trackVideoEnd(this.f2483a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i, z);
            long jElapsedRealtime2 = this.f2499q != -1 ? SystemClock.elapsedRealtime() - this.f2499q : -1L;
            this.f2484b.m2905k().trackFullScreenAdClosed(this.f2483a, jElapsedRealtime2, this.f2506x, j, this.f2472B, this.f2471A);
            if (C1240o.m3200a()) {
                C1240o c1240o = this.f2485c;
                StringBuilder sb = new StringBuilder("Video ad ended at percent: ");
                sb.append(i);
                sb.append("%, elapsedTime: ");
                sb.append(jElapsedRealtime);
                sb.append("ms, skipTimeMillis: ");
                sb.append(j);
                sb.append("ms, closeTimeMillis: ");
                c1240o.m3211a("AppLovinFullscreenActivity", OooO0oO.OooOo.OooOOOO(sb, jElapsedRealtime2, "ms"));
            }
        }
    }

    /* renamed from: a */
    private void m3432a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f2484b.m2832E().m572a(C0993c2.f554z0, "missingCachedAdResources", map2);
    }

    @Override // com.applovin.impl.adview.C0962a.b
    /* renamed from: a */
    public void mo236a(C0962a c0962a) {
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.f2480J = true;
    }

    /* renamed from: a */
    public void m3464a(boolean z, long j) {
        if (this.f2483a.m2558T0()) {
            mo3463a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    /* renamed from: a */
    private void m3433a(String str, Map map) {
        m3475e(AbstractC1089l8.m1416a(str, map));
    }

    /* renamed from: a */
    public void m3461a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f2488f);
    }
}

package com.ironsource.sdk.controller;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3034d9;
import com.ironsource.C3045dk;
import com.ironsource.C3431mt;
import com.ironsource.C3527pk;
import com.ironsource.C3539pw;
import com.ironsource.C3550q8;
import com.ironsource.C3551q9;
import com.ironsource.InterfaceC3169h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* loaded from: classes2.dex */
public class OpenUrlActivity extends Activity {

    /* renamed from: j */
    private static final String f11389j = "OpenUrlActivity";

    /* renamed from: k */
    private static final int f11390k = SDKUtils.generateViewId();

    /* renamed from: l */
    private static final int f11391l = SDKUtils.generateViewId();

    /* renamed from: b */
    private C3657v f11393b;

    /* renamed from: c */
    private ProgressBar f11394c;

    /* renamed from: d */
    boolean f11395d;

    /* renamed from: e */
    private RelativeLayout f11396e;

    /* renamed from: f */
    private String f11397f;

    /* renamed from: a */
    private WebView f11392a = null;

    /* renamed from: g */
    private final Handler f11398g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private boolean f11399h = false;

    /* renamed from: i */
    private final Runnable f11400i = new RunnableC3632b();

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$a */
    public class ViewOnSystemUiVisibilityChangeListenerC3631a implements View.OnSystemUiVisibilityChangeListener {
        public ViewOnSystemUiVisibilityChangeListenerC3631a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                OpenUrlActivity.this.f11398g.removeCallbacks(OpenUrlActivity.this.f11400i);
                OpenUrlActivity.this.f11398g.postDelayed(OpenUrlActivity.this.f11400i, 500L);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$b */
    public class RunnableC3632b implements Runnable {
        public RunnableC3632b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f11399h));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$c */
    public class C3633c extends WebViewClient {
        private C3633c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f11394c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f11394c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            try {
                C3550q8 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.mo11507c()) {
                    if (featureFlagCatchUrlError.m11509e() && OpenUrlActivity.this.f11393b != null) {
                        OpenUrlActivity.this.f11393b.m12216d(str, str2);
                    }
                    if (featureFlagCatchUrlError.m11508d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m12264e(OpenUrlActivity.f11389j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!new C3431mt(str, C3527pk.m11417e().m11425d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().mo11507c()).m10887a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                C3539pw.m11460a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.f11393b.m12233z();
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                StringBuilder sb = new StringBuilder();
                sb.append(e instanceof ActivityNotFoundException ? C3034d9.c.f7970x : C3034d9.c.f7971y);
                if (OpenUrlActivity.this.f11393b != null) {
                    OpenUrlActivity.this.f11393b.m12216d(sb.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        public /* synthetic */ C3633c(OpenUrlActivity openUrlActivity, ViewOnSystemUiVisibilityChangeListenerC3631a viewOnSystemUiVisibilityChangeListenerC3631a) {
            this();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$d */
    public static class C3634d {

        /* renamed from: a */
        static final String f11404a = "is_store";

        /* renamed from: b */
        static final String f11405b = "external_url";

        /* renamed from: c */
        static final String f11406c = "secondary_web_view";

        /* renamed from: d */
        static final String f11407d = "immersive";

        /* renamed from: e */
        static final String f11408e = "no activity to handle url";

        /* renamed from: f */
        static final String f11409f = "activity failed to open with unspecified reason";

        private C3634d() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$e */
    public static class C3635e {

        /* renamed from: a */
        private final InterfaceC3169h f11410a;

        /* renamed from: b */
        private int f11411b;

        /* renamed from: c */
        private String f11412c;

        /* renamed from: d */
        private boolean f11413d = false;

        /* renamed from: e */
        private boolean f11414e = false;

        /* renamed from: f */
        private boolean f11415f = false;

        public C3635e(InterfaceC3169h interfaceC3169h) {
            this.f11410a = interfaceC3169h;
        }

        /* renamed from: a */
        public Intent m11920a(Context context) {
            Intent intentMo9025a = this.f11410a.mo9025a(context);
            intentMo9025a.putExtra("external_url", this.f11412c);
            intentMo9025a.putExtra("secondary_web_view", this.f11413d);
            intentMo9025a.putExtra("is_store", this.f11414e);
            intentMo9025a.putExtra(C3034d9.h.f8135v, this.f11415f);
            if (!(context instanceof Activity)) {
                intentMo9025a.setFlags(this.f11411b);
            }
            return intentMo9025a;
        }

        /* renamed from: b */
        public C3635e m11924b(boolean z) {
            this.f11413d = z;
            return this;
        }

        /* renamed from: c */
        public C3635e m11925c(boolean z) {
            this.f11414e = z;
            return this;
        }

        /* renamed from: a */
        public C3635e m11921a(int i) {
            this.f11411b = i;
            return this;
        }

        /* renamed from: a */
        public C3635e m11922a(String str) {
            this.f11412c = str;
            return this;
        }

        /* renamed from: a */
        public C3635e m11923a(boolean z) {
            this.f11415f = z;
            return this;
        }
    }

    /* renamed from: e */
    private void m11916e() {
        requestWindowFeature(1);
    }

    /* renamed from: f */
    private void m11918f() {
        getWindow().setFlags(1024, 1024);
    }

    /* renamed from: g */
    private void m11919g() {
        ViewGroup viewGroup;
        C3657v c3657v = this.f11393b;
        if (c3657v != null) {
            c3657v.m12208a(false, C3034d9.h.f8092Y);
            if (this.f11396e == null || (viewGroup = (ViewGroup) this.f11392a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f11390k) != null) {
                viewGroup.removeView(this.f11392a);
            }
            if (viewGroup.findViewById(f11391l) != null) {
                viewGroup.removeView(this.f11394c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        C3657v c3657v;
        if (this.f11395d && (c3657v = this.f11393b) != null) {
            c3657v.m12214c(C3034d9.h.f8111j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f11392a.stopLoading();
        this.f11392a.clearHistory();
        try {
            this.f11392a.loadUrl(str);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("OpenUrlActivity:: loadUrl: ", th);
            sbOooOOO.append(th.toString());
            Logger.m12264e(f11389j, sbOooOOO.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f11392a.canGoBack()) {
            this.f11392a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m12266i(f11389j, "onCreate()");
        try {
            this.f11393b = (C3657v) C3045dk.m8333b((Context) this).mo8343a().m12006j();
            m11916e();
            m11918f();
            Bundle extras = getIntent().getExtras();
            this.f11397f = extras.getString("external_url");
            this.f11395d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(C3034d9.h.f8135v, false);
            this.f11399h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC3631a());
                runOnUiThread(this.f11400i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f11396e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m11913c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f11399h && (i == 25 || i == 24)) {
            this.f11398g.postDelayed(this.f11400i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        m11919g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        m11911b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f11399h && z) {
            runOnUiThread(this.f11400i);
        }
    }

    /* renamed from: a */
    private void m11909a() {
        if (this.f11394c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f11394c = progressBar;
            progressBar.setId(f11391l);
        }
        if (findViewById(f11391l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f11394c.setLayoutParams(layoutParams);
            this.f11394c.setVisibility(4);
            this.f11396e.addView(this.f11394c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: b */
    private void m11911b() {
        if (this.f11392a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f11392a = webView;
            webView.setId(f11390k);
            this.f11392a.getSettings().setJavaScriptEnabled(true);
            this.f11392a.setWebViewClient(new C3633c(this, null));
            loadUrl(this.f11397f);
        }
        if (findViewById(f11390k) == null) {
            this.f11396e.addView(this.f11392a, new RelativeLayout.LayoutParams(-1, -1));
        }
        m11909a();
        C3657v c3657v = this.f11393b;
        if (c3657v != null) {
            c3657v.m12208a(true, C3034d9.h.f8092Y);
        }
    }

    /* renamed from: c */
    private void m11913c() {
        WebView webView = this.f11392a;
        if (webView != null) {
            webView.destroy();
        }
    }

    /* renamed from: d */
    private void m11915d() {
        getWindow().addFlags(16);
    }
}

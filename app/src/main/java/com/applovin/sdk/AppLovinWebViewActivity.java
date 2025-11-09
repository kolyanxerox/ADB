package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC0989b8;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1179r4;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* renamed from: a */
    private final AtomicBoolean f3364a = new AtomicBoolean();

    /* renamed from: b */
    private String f3365b;

    /* renamed from: c */
    private WebView f3366c;

    /* renamed from: d */
    private EventListener f3367d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f3367d = eventListener;
        this.f3365b = str;
        this.f3364a.set(false);
        WebView webView = this.f3366c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f3367d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY))) {
            C1240o.m3207h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        C1220k c1220kM3943a = AppLovinSdk.getInstance(getApplicationContext()).m3943a();
        AbstractC0989b8.m427a(findViewById(android.R.id.content), c1220kM3943a);
        m3950a(c1220kM3943a);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra)) {
            this.f3365b = stringExtra;
        }
        if (StringUtils.isValidString(this.f3365b)) {
            this.f3366c.loadUrl(this.f3365b);
        }
    }

    /* renamed from: a */
    public void m3950a(C1220k c1220k) {
        WebView webViewM1211b = AbstractC1078k7.m1211b(this, "WebView Activity");
        this.f3366c = webViewM1211b;
        if (webViewM1211b == null) {
            finish();
            return;
        }
        setContentView(webViewM1211b);
        WebSettings settings = this.f3366c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f3366c.setVerticalScrollBarEnabled(true);
        this.f3366c.setHorizontalScrollBarEnabled(true);
        this.f3366c.setScrollBarStyle(33554432);
        this.f3366c.setWebViewClient(new C1332a(c1220k));
    }

    /* renamed from: com.applovin.sdk.AppLovinWebViewActivity$a */
    public class C1332a extends AbstractC1179r4 {

        /* renamed from: a */
        final /* synthetic */ C1220k f3368a;

        public C1332a(C1220k c1220k) {
            this.f3368a = c1220k;
        }

        /* renamed from: a */
        public /* synthetic */ void m3955a(C1220k c1220k) {
            if (!((Boolean) c1220k.m2866a(C1268v4.f2584G5)).booleanValue() || !AppLovinWebViewActivity.this.f3364a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.m3950a(c1220k);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f3365b)) {
                AppLovinWebViewActivity.this.f3366c.loadUrl(AppLovinWebViewActivity.this.f3365b);
            }
        }

        @Override // com.applovin.impl.AbstractC1179r4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f3366c == webView) {
                AppLovinWebViewActivity.this.f3366c.destroy();
                AppLovinWebViewActivity.this.f3366c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final C1220k c1220k = this.f3368a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.OooO00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15861OooOo0O.m3955a(c1220k);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            this.f3368a.m2847O();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Handling url load: ", str, this.f3368a.m2847O(), "AppLovinWebViewActivity");
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f3367d == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str2)) {
                this.f3368a.m2847O();
                if (!C1240o.m3200a()) {
                    return true;
                }
                this.f3368a.m2847O().m3214b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String queryParameter = uri.getQueryParameter(str2);
            this.f3368a.m2847O();
            if (C1240o.m3200a()) {
                this.f3368a.m2847O().m3211a("AppLovinWebViewActivity", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Parsed WebView event parameter name: ", str2, " and value: ", queryParameter));
            }
            AppLovinWebViewActivity.this.f3367d.onReceivedEvent(queryParameter);
            return true;
        }

        @Override // com.applovin.impl.AbstractC1179r4
        /* renamed from: a */
        public Map mo235a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }
}

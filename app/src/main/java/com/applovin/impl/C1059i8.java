package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1239e;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.i8 */
/* loaded from: classes.dex */
public class C1059i8 {

    /* renamed from: a */
    private final C1220k f909a;

    /* renamed from: b */
    private final C1240o f910b;

    /* renamed from: c */
    private WebView f911c;

    /* renamed from: d */
    private boolean f912d;

    /* renamed from: e */
    private final Set f913e = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.i8$a */
    public class a extends AbstractC1179r4 {

        /* renamed from: a */
        private final boolean f914a;

        public a(boolean z) {
            this.f914a = z;
        }

        /* renamed from: b */
        public /* synthetic */ void m1021b() {
            C1059i8.this.f911c.destroy();
            C1059i8.this.f911c = null;
        }

        @Override // com.applovin.impl.AbstractC1179r4
        /* renamed from: a */
        public Map mo235a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f914a) {
                C1240o unused = C1059i8.this.f910b;
                if (C1240o.m3200a()) {
                    C1059i8.this.f910b.m3211a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                C1059i8.this.f912d = true;
            }
        }

        @Override // com.applovin.impl.AbstractC1179r4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == C1059i8.this.f911c) {
                AppLovinSdkUtils.runOnUiThread(new o0OO00O(this, 0));
            } else {
                C1059i8.this.m1013b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    public C1059i8(C1220k c1220k) {
        this.f909a = c1220k;
        this.f910b = c1220k.m2847O();
    }

    /* renamed from: c */
    public /* synthetic */ void m1016c(String str) {
        WebView webViewM1005a = m1005a(str);
        if (webViewM1005a != null) {
            this.f913e.add(webViewM1005a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new OooO(10, this, webViewM1005a), ((Integer) this.f909a.m2866a(C1268v4.f2597I2)).intValue());
        } else if (C1240o.m3200a()) {
            this.f910b.m3214b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    /* renamed from: b */
    public void m1019b() {
        AppLovinSdkUtils.runOnUiThread(new o0OO00O(this, 8));
    }

    /* renamed from: a */
    public /* synthetic */ void m1008a() {
        WebView webViewM1006a = m1006a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f911c = webViewM1006a;
        if (webViewM1006a == null && C1240o.m3200a()) {
            this.f910b.m3214b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m1015b(C1239e c1239e, AppLovinPostbackListener appLovinPostbackListener) {
        String strAppendQueryParameters = StringUtils.appendQueryParameters(c1239e.m3081f(), c1239e.m3084i(), ((Boolean) this.f909a.m2866a(C1268v4.f2791g3)).booleanValue());
        if (this.f911c == null) {
            WebView webViewM1006a = m1006a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f911c = webViewM1006a;
            if (webViewM1006a == null) {
                if (C1240o.m3200a()) {
                    this.f910b.m3214b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (m1017c() && !this.f912d) {
            if (C1240o.m3200a()) {
                this.f910b.m3214b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f909a.m2832E().m576d(C0993c2.f492N0, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String strOooOO0O = OooO0oO.OooOo.OooOO0O("al_firePostback('", strAppendQueryParameters, "')");
        if (((Boolean) this.f909a.m2866a(C1268v4.f2645O2)).booleanValue()) {
            AbstractC1089l8.m1414a(this.f911c, strOooOO0O, this.f909a).m2269a(this.f909a.m2918r0().m399a("evaluateJavascriptPromise"), new OooOo.OooO(this, appLovinPostbackListener, strAppendQueryParameters, 4));
        } else {
            AbstractC1089l8.m1419a(this.f911c, strOooOO0O);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    /* renamed from: a */
    public void m1018a(C1239e c1239e, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new androidx.webkit.OooO00o(this, c1239e, appLovinPostbackListener, 8));
    }

    /* renamed from: a */
    public /* synthetic */ void m1010a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z, String str2, String str3) {
        if (z) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f909a.m2832E().m576d(C0993c2.f492N0, map);
    }

    /* renamed from: c */
    private boolean m1017c() {
        return ((Boolean) this.f909a.m2866a(C1268v4.f2637N2)).booleanValue();
    }

    /* renamed from: a */
    private WebView m1005a(String str) {
        return m1006a(str, false);
    }

    /* renamed from: a */
    private WebView m1006a(String str, boolean z) {
        AbstractC1078k7.m1215b();
        WebView webViewM1211b = AbstractC1078k7.m1211b(C1220k.m2824o(), "web tracker");
        if (webViewM1211b == null) {
            return null;
        }
        webViewM1211b.getSettings().setJavaScriptEnabled(true);
        webViewM1211b.setWebViewClient(new a(z && m1017c()));
        webViewM1211b.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewM1211b;
    }

    /* renamed from: a */
    public void m1013b(WebView webView) {
        if (webView == null || !this.f913e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0Oo0oo(webView, 0));
    }

    /* renamed from: b */
    public void m1020b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (C1240o.m3200a()) {
                this.f910b.m3214b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (C1240o.m3200a()) {
                    this.f910b.m3214b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new OooO(9, this, str));
        }
    }
}

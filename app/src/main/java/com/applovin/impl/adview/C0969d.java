package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;

/* renamed from: com.applovin.impl.adview.d */
/* loaded from: classes.dex */
class C0969d {

    /* renamed from: a */
    private final C1220k f294a;

    /* renamed from: b */
    private final WebViewRenderProcessClient f295b = new a();

    /* renamed from: com.applovin.impl.adview.d$a */
    public class a extends WebViewRenderProcessClient {
        public a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof C0967b) {
                AbstractC1207b currentAd = ((C0967b) webView).getCurrentAd();
                C0969d.this.f294a.m2847O();
                if (C1240o.m3200a()) {
                    C0969d.this.f294a.m2847O().m3214b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    public C0969d(C1220k c1220k) {
        this.f294a = c1220k;
    }

    /* renamed from: a */
    public WebViewRenderProcessClient m273a() {
        return this.f295b;
    }
}

package com.applovin.impl.adview;

import OooO0oO.OooOo;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1179r4;
import com.applovin.impl.AbstractC1289x7;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1088l7;
import com.applovin.impl.C1148o7;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.adview.c */
/* loaded from: classes.dex */
public class C0968c extends AbstractC1179r4 {

    /* renamed from: a */
    private final C1220k f291a;

    /* renamed from: b */
    private final C1240o f292b;

    /* renamed from: c */
    private final C0962a f293c;

    public C0968c(C0962a c0962a, C1220k c1220k) {
        this.f291a = c1220k;
        this.f292b = c1220k.m2847O();
        this.f293c = c0962a;
    }

    /* renamed from: b */
    private void m268b() {
        this.f293c.m234z();
    }

    /* renamed from: c */
    private void m269c() {
        this.f293c.m203a();
    }

    @Override // com.applovin.impl.AbstractC1179r4
    /* renamed from: a */
    public Map mo235a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        mapHashMap.putAll(AbstractC1013e2.m675a((AppLovinAdImpl) this.f293c.m226g()));
        return mapHashMap;
    }

    /* renamed from: d */
    public C0962a m271d() {
        return this.f293c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (C1240o.m3200a()) {
            this.f292b.m3215d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (C1240o.m3200a()) {
            this.f292b.m3215d("AdWebView", "Loaded URL: " + str);
        }
        this.f293c.m206a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        AbstractC1207b abstractC1207bM226g = this.f293c.m226g();
        if (C1240o.m3200a()) {
            this.f292b.m3214b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + abstractC1207bM226g);
        }
        if (AbstractC1078k7.m1204a(webResourceRequest.getUrl().toString(), this.f291a)) {
            this.f291a.m2832E().m2149a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        AbstractC1207b abstractC1207bM226g = this.f293c.m226g();
        String str = "Received SSL error: " + sslError;
        if (C1240o.m3200a()) {
            this.f292b.m3214b("AdWebView", str + " for ad: " + abstractC1207bM226g);
        }
    }

    @Override // com.applovin.impl.AbstractC1179r4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        AbstractC1207b abstractC1207bM226g = this.f293c.m226g();
        C1240o.m3207h("AdWebView", "Render process gone for ad: " + abstractC1207bM226g + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f291a.m2866a(C1268v4.f2576F5)).booleanValue()) {
            m262a(webView, renderProcessGoneDetail, abstractC1207bM226g);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return m270a(webView, url.toString());
        }
        if (!C1240o.m3200a()) {
            return false;
        }
        this.f292b.m3214b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC1207b abstractC1207bM226g = this.f293c.m226g();
        String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
        if (C1240o.m3200a()) {
            this.f292b.m3214b("AdWebView", str3 + " for ad: " + abstractC1207bM226g);
        }
        if (AbstractC1078k7.m1204a(str2, this.f291a)) {
            this.f291a.m2832E().m2149a("adWebViewReceivedError", str2, i, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m270a(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C0968c.m270a(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m270a(webView, str);
    }

    /* renamed from: a */
    private void m262a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, AbstractC1207b abstractC1207b) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f291a.m2866a(C1268v4.f2632M5)).booleanValue()) {
            throw new RuntimeException(OooOo.OooOO0("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", abstractC1207b != null ? String.valueOf(abstractC1207b.getAdIdNumber()) : "null"));
        }
        if (webView == null || !webView.equals(this.f293c.m225f())) {
            return;
        }
        this.f293c.m218b();
        AppLovinAdSize appLovinAdSizeM230k = this.f293c.m230k();
        if (AbstractC1078k7.m1202a(appLovinAdSizeM230k)) {
            this.f293c.m215a(appLovinAdSizeM230k);
            this.f293c.m202F();
        }
    }

    /* renamed from: a */
    private boolean m267a(boolean z, AbstractC1207b abstractC1207b, Uri uri) {
        if (z) {
            return false;
        }
        boolean zM2617l1 = abstractC1207b.m2617l1();
        m260a(uri, zM2617l1, abstractC1207b, this.f291a);
        return zM2617l1;
    }

    /* renamed from: a */
    private static void m260a(Uri uri, boolean z, AbstractC1207b abstractC1207b, C1220k c1220k) {
        if (c1220k.m2888c(C1268v4.f2577F6).contains(uri.getScheme())) {
            return;
        }
        c1220k.m2832E().m576d(C0993c2.f548w0, m258a(abstractC1207b, uri, z));
    }

    /* renamed from: a */
    private static Map m258a(AbstractC1207b abstractC1207b, Uri uri, boolean z) {
        Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207b);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapM675a);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z), mapM675a);
        return mapM675a;
    }

    /* renamed from: a */
    private void m261a(MotionEvent motionEvent) {
        this.f293c.m205a(motionEvent);
    }

    /* renamed from: a */
    private void m265a(C1088l7 c1088l7, C0967b c0967b) {
        m266a(c1088l7, c0967b, (Bundle) null);
    }

    /* renamed from: a */
    private void m266a(C1088l7 c1088l7, C0967b c0967b, Bundle bundle) {
        C1148o7 c1148o7M1368s1 = c1088l7.m1368s1();
        if (c1148o7M1368s1 != null) {
            AbstractC1289x7.m3673a(c1148o7M1368s1.m2023b(), this.f293c.m229j());
            m264a(c0967b, c1148o7M1368s1.m2024c(), bundle);
        }
    }

    /* renamed from: a */
    private void m263a(C0967b c0967b, Uri uri) {
        m264a(c0967b, uri, (Bundle) null);
    }

    /* renamed from: a */
    private void m264a(C0967b c0967b, Uri uri, Bundle bundle) {
        AbstractC1207b currentAd = c0967b.getCurrentAd();
        AppLovinAdView appLovinAdViewM228i = this.f293c.m228i();
        if (appLovinAdViewM228i != null && currentAd != null) {
            if (currentAd instanceof C1088l7) {
                ((C1088l7) currentAd).getAdEventTracker().m998v();
            }
            this.f293c.m210a(currentAd, appLovinAdViewM228i, uri, c0967b.getAndClearLastClickEvent(), bundle);
        } else if (C1240o.m3200a()) {
            this.f292b.m3214b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    /* renamed from: a */
    private void m259a(Uri uri) {
        String strOooOO0;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            strOooOO0 = OooOo.OooOO0("Tracked event: ", queryParameter);
        } else {
            strOooOO0 = OooOo.OooOO0("Failed to track event: ", queryParameter);
        }
        AbstractC1078k7.m1191a(strOooOO0, C1220k.m2824o());
    }
}

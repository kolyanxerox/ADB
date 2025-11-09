package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.p008h5.H5AdsRequestHandler;

/* renamed from: com.google.android.gms.internal.ads.mc */
/* loaded from: classes2.dex */
public final class C1821mc extends AbstractC1453cc {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f21195OooO0Oo = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public WebViewClient f21196OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final H5AdsRequestHandler f21197OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final WebView f21198OooO0OO;

    public C1821mc(Context context, WebView webView) {
        context.getClass();
        webView.getClass();
        ii0.OoooOoo("JavaScript must be enabled on the WebView.", webView.getSettings().getJavaScriptEnabled());
        this.f21198OooO0OO = webView;
        this.f21197OooO0O0 = new H5AdsRequestHandler(context, new p80(webView, 6));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1453cc
    public final WebViewClient OooO00o() {
        return this.f21196OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1453cc, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (!this.f21198OooO0OO.equals(webView)) {
            zzo.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        } else {
            if (this.f21197OooO0O0.handleH5AdsRequest(str)) {
                return;
            }
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1453cc, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object obj = this.f21198OooO0OO;
        if (!obj.equals(obj)) {
            zzo.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
            return false;
        }
        if (this.f21197OooO0O0.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1453cc, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f21198OooO0OO.equals(webView)) {
            if (this.f21197OooO0O0.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        zzo.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }
}

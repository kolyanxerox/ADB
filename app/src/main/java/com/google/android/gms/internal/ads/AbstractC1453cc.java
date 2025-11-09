package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: com.google.android.gms.internal.ads.cc */
/* loaded from: classes2.dex */
public abstract class AbstractC1453cc extends WebViewClient {
    public abstract WebViewClient OooO00o();

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return false;
        }
        return webViewClientOooO00o.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 27)
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return null;
        }
        return webViewClientOooO00o.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return false;
        }
        return webViewClientOooO00o.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return false;
        }
        return webViewClientOooO00o.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return;
        }
        webViewClientOooO00o.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return null;
        }
        return webViewClientOooO00o.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClientOooO00o = OooO00o();
        if (webViewClientOooO00o == null) {
            return false;
        }
        return webViewClientOooO00o.shouldOverrideUrlLoading(webView, str);
    }
}

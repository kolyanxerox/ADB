package io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import com.applovin.impl.o0000O0;
import com.ironsource.o0000O0O;

/* loaded from: classes3.dex */
public class WebViewClientProxyApi extends PigeonApiWebViewClient {
    public WebViewClientProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    @NonNull
    public WebViewClient pigeon_defaultConstructor() {
        return getPigeonRegistrar().sdkIsAtLeast(24) ? new WebViewClientImpl(this) : new WebViewClientCompatImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public void setSynchronousReturnValueForShouldOverrideUrlLoading(@NonNull WebViewClient webViewClient, boolean z) {
        if (webViewClient instanceof WebViewClientCompatImpl) {
            ((WebViewClientCompatImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z);
        } else {
            if (!getPigeonRegistrar().sdkIsAtLeast(24) || !(webViewClient instanceof WebViewClientImpl)) {
                throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
            }
            ((WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z);
        }
    }

    public static class WebViewClientCompatImpl extends WebViewClientCompat {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientCompatImpl(@NonNull WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        public static /* synthetic */ oo00o.OooOo lambda$doUpdateVisitedHistory$14(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$doUpdateVisitedHistory$15(WebView webView, String str, boolean z) {
            this.api.doUpdateVisitedHistory(this, webView, str, z, new OooOO0(20));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onFormResubmission$18(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onFormResubmission$19(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new OooOO0(24));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onLoadResource$20(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onLoadResource$21(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new OooOO0(21));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onPageCommitVisible$22(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onPageCommitVisible$23(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new OooOO0(22));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onPageFinished$2(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onPageFinished$3(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new OooOO0(14));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onPageStarted$0(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onPageStarted$1(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new OooOO0(18));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedClientCertRequest$24(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedClientCertRequest$25(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new OooOO0(17));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedError$6(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedError$7(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat) {
            this.api.onReceivedRequestErrorCompat(this, webView, webResourceRequest, webResourceErrorCompat, new OooOO0(26));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedError$8(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedError$9(WebView webView, int i, String str, String str2) {
            this.api.onReceivedError(this, webView, i, str, str2, new OooOO0(11));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedHttpAuthRequest$16(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedHttpAuthRequest$17(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new OooOO0(25));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedHttpError$4(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedHttpError$5(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new OooOO0(16));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedLoginRequest$26(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedLoginRequest$27(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new OooOO0(19));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedSslError$28(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedSslError$29(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new OooOO0(15));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onScaleChanged$30(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onScaleChanged$31(WebView webView, float f, float f2) {
            this.api.onScaleChanged(this, webView, f, f2, new OooOO0(12));
        }

        public static /* synthetic */ oo00o.OooOo lambda$shouldOverrideUrlLoading$10(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$shouldOverrideUrlLoading$11(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new OooOO0(13));
        }

        public static /* synthetic */ oo00o.OooOo lambda$shouldOverrideUrlLoading$12(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$shouldOverrideUrlLoading$13(WebView webView, String str) {
            this.api.urlLoading(this, webView, str, new OooOO0(23));
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(@NonNull WebView webView, @NonNull String str, boolean z) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000O0((WebViewClient) this, webView, str, z, 8));
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(@NonNull WebView webView, @NonNull Message message, @NonNull Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new OooOo0O.OooO0O0(this, webView, message, message2, 16));
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new o00000OO(this, webView, str, 3));
        }

        @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new o00000OO(this, webView, str, 2));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new o00000OO(this, webView, str, 4));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NonNull WebView webView, @NonNull String str, @NonNull Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new o00000OO(this, webView, str, 0));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(@NonNull WebView webView, @NonNull ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000O0O(this, webView, clientCertRequest, 9));
        }

        @Override // androidx.webkit.WebViewClientCompat
        public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceErrorCompat webResourceErrorCompat) {
            this.api.getPigeonRegistrar().runOnMainThread(new OooOo0O.OooO0O0(this, webView, webResourceRequest, webResourceErrorCompat, 18));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(@NonNull WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.applovin.impl.OooOo00(this, webView, httpAuthHandler, str, str2, 3));
        }

        @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new OooOo0O.OooO0O0(this, webView, webResourceRequest, webResourceResponse, 19));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(@NonNull WebView webView, @NonNull String str, @Nullable String str2, @NonNull String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.applovin.impl.OooOo00(this, webView, str, str2, str3, 4));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NonNull WebView webView, @NonNull SslErrorHandler sslErrorHandler, @NonNull SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new OooOo0O.OooO0O0(this, webView, sslErrorHandler, sslError, 17));
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(@NonNull WebView webView, float f, float f2) {
            this.api.getPigeonRegistrar().runOnMainThread(new o00000O(this, webView, f, f2, 0));
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(@NonNull WebView webView, @NonNull KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z) {
            this.returnValueForShouldOverrideUrlLoading = z;
        }

        @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000O0O(this, webView, webResourceRequest, 10));
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, int i, @NonNull String str, @NonNull String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.applovin.impl.o000oOoO(this, webView, i, str, str2, 1));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new o00000OO(this, webView, str, 1));
            return this.returnValueForShouldOverrideUrlLoading;
        }
    }

    @RequiresApi(24)
    public static class WebViewClientImpl extends WebViewClient {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientImpl(@NonNull WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        public static /* synthetic */ oo00o.OooOo lambda$doUpdateVisitedHistory$14(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$doUpdateVisitedHistory$15(WebView webView, String str, boolean z) {
            this.api.doUpdateVisitedHistory(this, webView, str, z, new o0000(1));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onFormResubmission$18(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onFormResubmission$19(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new o0000(0));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onLoadResource$20(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onLoadResource$21(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new OooOO0(29));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onPageCommitVisible$22(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onPageCommitVisible$23(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new OooOO0(27));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onPageFinished$2(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onPageFinished$3(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new o0000(12));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onPageStarted$0(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onPageStarted$1(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new o0000(2));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedClientCertRequest$24(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedClientCertRequest$25(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new o0000(9));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedError$6(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedError$7(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.api.onReceivedRequestError(this, webView, webResourceRequest, webResourceError, new o0000(3));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedError$8(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedError$9(WebView webView, int i, String str, String str2) {
            this.api.onReceivedError(this, webView, i, str, str2, new OooOO0(28));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedHttpAuthRequest$16(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedHttpAuthRequest$17(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new o0000(8));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedHttpError$4(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedHttpError$5(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new o0000(10));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedLoginRequest$26(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedLoginRequest$27(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new o0000(6));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onReceivedSslError$28(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onReceivedSslError$29(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new o0000(4));
        }

        public static /* synthetic */ oo00o.OooOo lambda$onScaleChanged$30(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$onScaleChanged$31(WebView webView, float f, float f2) {
            this.api.onScaleChanged(this, webView, f, f2, new o0000(11));
        }

        public static /* synthetic */ oo00o.OooOo lambda$shouldOverrideUrlLoading$10(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$shouldOverrideUrlLoading$11(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new o0000(7));
        }

        public static /* synthetic */ oo00o.OooOo lambda$shouldOverrideUrlLoading$12(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ void lambda$shouldOverrideUrlLoading$13(WebView webView, String str) {
            this.api.urlLoading(this, webView, str, new o0000(5));
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(@NonNull WebView webView, @NonNull String str, boolean z) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000O0((WebViewClient) this, webView, str, z, 9));
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(@NonNull WebView webView, @NonNull Message message, @NonNull Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new OooOo0O.OooO0O0(this, webView, message, message2, 20));
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000Ooo(this, webView, str, 4));
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000Ooo(this, webView, str, 1));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000Ooo(this, webView, str, 0));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NonNull WebView webView, @NonNull String str, @NonNull Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000Ooo(this, webView, str, 2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(@NonNull WebView webView, @NonNull ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000O0O(this, webView, clientCertRequest, 12));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceError webResourceError) {
            this.api.getPigeonRegistrar().runOnMainThread(new OooOo0O.OooO0O0(this, webView, webResourceRequest, webResourceError, 22));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(@NonNull WebView webView, @NonNull HttpAuthHandler httpAuthHandler, @NonNull String str, @NonNull String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.applovin.impl.OooOo00(this, webView, httpAuthHandler, str, str2, 6));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new OooOo0O.OooO0O0(this, webView, webResourceRequest, webResourceResponse, 23));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(@NonNull WebView webView, @NonNull String str, @Nullable String str2, @NonNull String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.applovin.impl.OooOo00(this, webView, str, str2, str3, 5));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NonNull WebView webView, @NonNull SslErrorHandler sslErrorHandler, @NonNull SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new OooOo0O.OooO0O0(this, webView, sslErrorHandler, sslError, 21));
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(@NonNull WebView webView, float f, float f2) {
            this.api.getPigeonRegistrar().runOnMainThread(new o00000O(this, webView, f, f2, 1));
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(@NonNull WebView webView, @NonNull KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z) {
            this.returnValueForShouldOverrideUrlLoading = z;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000O0O(this, webView, webResourceRequest, 11));
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, int i, @NonNull String str, @NonNull String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.applovin.impl.o000oOoO(this, webView, i, str, str2, 2));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new o0000Ooo(this, webView, str, 3));
            return this.returnValueForShouldOverrideUrlLoading;
        }
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}

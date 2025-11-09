package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class WebChromeClientProxyApi extends PigeonApiWebChromeClient {

    public static class SecureWebChromeClient extends WebChromeClient {

        @Nullable
        WebViewClient webViewClient;

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(@NonNull WebView webView, boolean z, boolean z2, @NonNull Message message) {
            return onCreateWindow(webView, message, new WebView(webView.getContext()));
        }

        public void setWebViewClient(@NonNull WebViewClient webViewClient) {
            this.webViewClient = webViewClient;
        }

        /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$SecureWebChromeClient$1 */
        public class C45121 extends WebViewClient {
            final /* synthetic */ WebView val$view;

            public C45121(WebView webView) {
                webView = webView;
            }

            @Override // android.webkit.WebViewClient
            @RequiresApi(api = 24)
            public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
                if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                    return true;
                }
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, str)) {
                    return true;
                }
                webView.loadUrl(str);
                return true;
            }
        }

        @VisibleForTesting
        public boolean onCreateWindow(@NonNull WebView webView, @NonNull Message message, @Nullable WebView webView2) {
            if (this.webViewClient == null) {
                return false;
            }
            C45121 c45121 = new WebViewClient() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.SecureWebChromeClient.1
                final /* synthetic */ WebView val$view;

                public C45121(WebView webView3) {
                    webView = webView3;
                }

                @Override // android.webkit.WebViewClient
                @RequiresApi(api = 24)
                public boolean shouldOverrideUrlLoading(@NonNull WebView webView3, @NonNull WebResourceRequest webResourceRequest) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView3, String str) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    }
                    webView.loadUrl(str);
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new WebView(webView3.getContext());
            }
            webView2.setWebViewClient(c45121);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static class WebChromeClientImpl extends SecureWebChromeClient {
        private static final String TAG = "WebChromeClientImpl";
        private final WebChromeClientProxyApi api;
        private boolean returnValueForOnShowFileChooser = false;
        private boolean returnValueForOnConsoleMessage = false;
        private boolean returnValueForOnJsAlert = false;
        private boolean returnValueForOnJsConfirm = false;
        private boolean returnValueForOnJsPrompt = false;

        public WebChromeClientImpl(@NonNull WebChromeClientProxyApi webChromeClientProxyApi) {
            this.api = webChromeClientProxyApi;
        }

        public static /* synthetic */ oo00o.OooOo lambda$onConsoleMessage$7(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public static /* synthetic */ oo00o.OooOo lambda$onGeolocationPermissionsHidePrompt$4(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public static /* synthetic */ oo00o.OooOo lambda$onGeolocationPermissionsShowPrompt$3(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public static /* synthetic */ oo00o.OooOo lambda$onHideCustomView$2(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ oo00o.OooOo lambda$onJsAlert$8(JsResult jsResult, ResultCompat resultCompat) {
            if (!resultCompat.isFailure()) {
                jsResult.confirm();
                return null;
            }
            ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
            Throwable thExceptionOrNull = resultCompat.exceptionOrNull();
            Objects.requireNonNull(thExceptionOrNull);
            pigeonRegistrar.logError(TAG, thExceptionOrNull);
            return null;
        }

        public /* synthetic */ oo00o.OooOo lambda$onJsConfirm$9(JsResult jsResult, ResultCompat resultCompat) {
            if (!resultCompat.isFailure()) {
                if (Boolean.TRUE.equals(resultCompat.getOrNull())) {
                    jsResult.confirm();
                } else {
                    jsResult.cancel();
                }
                return null;
            }
            ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
            Throwable thExceptionOrNull = resultCompat.exceptionOrNull();
            Objects.requireNonNull(thExceptionOrNull);
            pigeonRegistrar.logError(TAG, thExceptionOrNull);
            return null;
        }

        public /* synthetic */ oo00o.OooOo lambda$onJsPrompt$10(JsPromptResult jsPromptResult, ResultCompat resultCompat) {
            if (resultCompat.isFailure()) {
                ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
                Throwable thExceptionOrNull = resultCompat.exceptionOrNull();
                Objects.requireNonNull(thExceptionOrNull);
                pigeonRegistrar.logError(TAG, thExceptionOrNull);
                return null;
            }
            String str = (String) resultCompat.getOrNull();
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
            return null;
        }

        public static /* synthetic */ oo00o.OooOo lambda$onPermissionRequest$6(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public static /* synthetic */ oo00o.OooOo lambda$onProgressChanged$0(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public static /* synthetic */ oo00o.OooOo lambda$onShowCustomView$1(oo00o.OooOOO0 oooOOO0) {
            return null;
        }

        public /* synthetic */ oo00o.OooOo lambda$onShowFileChooser$5(boolean z, ValueCallback valueCallback, ResultCompat resultCompat) {
            if (resultCompat.isFailure()) {
                ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
                Throwable thExceptionOrNull = resultCompat.exceptionOrNull();
                Objects.requireNonNull(thExceptionOrNull);
                pigeonRegistrar.logError(TAG, thExceptionOrNull);
                return null;
            }
            List list = (List) resultCompat.getOrNull();
            Objects.requireNonNull(list);
            List list2 = list;
            if (z) {
                Uri[] uriArr = new Uri[list2.size()];
                for (int i = 0; i < list2.size(); i++) {
                    uriArr[i] = Uri.parse((String) list2.get(i));
                }
                valueCallback.onReceiveValue(uriArr);
            }
            return null;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.api.onConsoleMessage(this, consoleMessage, new OooOO0(5));
            return this.returnValueForOnConsoleMessage;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.api.onGeolocationPermissionsHidePrompt(this, new OooOO0(4));
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(@NonNull String str, @NonNull GeolocationPermissions.Callback callback) {
            this.api.onGeolocationPermissionsShowPrompt(this, str, callback, new OooOO0(7));
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.api.onHideCustomView(this, new OooOO0(10));
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.returnValueForOnJsAlert) {
                return false;
            }
            this.api.onJsAlert(this, webView, str, str2, ResultCompat.asCompatCallback(new o000000O(this, jsResult, 1)));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.returnValueForOnJsConfirm) {
                return false;
            }
            this.api.onJsConfirm(this, webView, str, str2, ResultCompat.asCompatCallback(new o000000O(this, jsResult, 0)));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!this.returnValueForOnJsPrompt) {
                return false;
            }
            this.api.onJsPrompt(this, webView, str, str2, str3, ResultCompat.asCompatCallback(new o00000(0, this, jsPromptResult)));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(@NonNull PermissionRequest permissionRequest) {
            this.api.onPermissionRequest(this, permissionRequest, new OooOO0(9));
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@NonNull WebView webView, int i) {
            this.api.onProgressChanged(this, webView, i, new OooOO0(8));
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.api.onShowCustomView(this, view, customViewCallback, new OooOO0(6));
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(@NonNull WebView webView, @NonNull final ValueCallback<Uri[]> valueCallback, @NonNull WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z = this.returnValueForOnShowFileChooser;
            this.api.onShowFileChooser(this, webView, fileChooserParams, ResultCompat.asCompatCallback(new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.o00000O0
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj) {
                    return this.f28826OooOo0O.lambda$onShowFileChooser$5(z, valueCallback, (ResultCompat) obj);
                }
            }));
            return z;
        }

        public void setReturnValueForOnConsoleMessage(boolean z) {
            this.returnValueForOnConsoleMessage = z;
        }

        public void setReturnValueForOnJsAlert(boolean z) {
            this.returnValueForOnJsAlert = z;
        }

        public void setReturnValueForOnJsConfirm(boolean z) {
            this.returnValueForOnJsConfirm = z;
        }

        public void setReturnValueForOnJsPrompt(boolean z) {
            this.returnValueForOnJsPrompt = z;
        }

        public void setReturnValueForOnShowFileChooser(boolean z) {
            this.returnValueForOnShowFileChooser = z;
        }
    }

    public WebChromeClientProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    @NonNull
    public WebChromeClientImpl pigeon_defaultConstructor() {
        return new WebChromeClientImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnConsoleMessage(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnConsoleMessage(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsAlert(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsAlert(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsConfirm(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsConfirm(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsPrompt(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsPrompt(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnShowFileChooser(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnShowFileChooser(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}

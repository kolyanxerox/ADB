package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.DownloadListenerProxyApi;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements o00O0Oo.Oooo000 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28789OooOo0O;

    public /* synthetic */ OooOO0(int i) {
        this.f28789OooOo0O = i;
    }

    @Override // o00O0Oo.Oooo000
    public final Object invoke(Object obj) {
        oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj;
        switch (this.f28789OooOo0O) {
            case 0:
                return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$17(oooOOO0);
            case 1:
                return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$18(oooOOO0);
            case 2:
                return DownloadListenerProxyApi.DownloadListenerImpl.lambda$onDownloadStart$0(oooOOO0);
            case 3:
                return JavaScriptChannel.lambda$postMessage$0(oooOOO0);
            case 4:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onGeolocationPermissionsHidePrompt$4(oooOOO0);
            case 5:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onConsoleMessage$7(oooOOO0);
            case 6:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onShowCustomView$1(oooOOO0);
            case 7:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onGeolocationPermissionsShowPrompt$3(oooOOO0);
            case 8:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onProgressChanged$0(oooOOO0);
            case 9:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onPermissionRequest$6(oooOOO0);
            case 10:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onHideCustomView$2(oooOOO0);
            case 11:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedError$8(oooOOO0);
            case 12:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onScaleChanged$30(oooOOO0);
            case 13:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$shouldOverrideUrlLoading$10(oooOOO0);
            case 14:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageFinished$2(oooOOO0);
            case 15:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedSslError$28(oooOOO0);
            case 16:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedHttpError$4(oooOOO0);
            case 17:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedClientCertRequest$24(oooOOO0);
            case 18:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageStarted$0(oooOOO0);
            case 19:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedLoginRequest$26(oooOOO0);
            case 20:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$doUpdateVisitedHistory$14(oooOOO0);
            case 21:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onLoadResource$20(oooOOO0);
            case 22:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageCommitVisible$22(oooOOO0);
            case 23:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$shouldOverrideUrlLoading$12(oooOOO0);
            case 24:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onFormResubmission$18(oooOOO0);
            case 25:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedHttpAuthRequest$16(oooOOO0);
            case 26:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedError$6(oooOOO0);
            case 27:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onPageCommitVisible$22(oooOOO0);
            case 28:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedError$8(oooOOO0);
            default:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onLoadResource$20(oooOOO0);
        }
    }
}

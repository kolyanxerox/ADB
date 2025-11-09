package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import androidx.webkit.WebViewFeature;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.IntExtensionKt;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;
import o00O0.o000OOo;
import o00O0.o00oO0o;
import o00O0.o0O0O00;
import o00O0.oo000o;
import o00O0oO.o000000;
import o00O0oOo.o00000;
import o00O0oOo.o00000O0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0o;
import o00O0oOo.o00O;
import o00O0ooo.InterfaceC4522o;
import o00O0ooo.o0OO;
import o00O0ooo.o0OOO0;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOO0;

/* loaded from: classes2.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final o0OO _isRenderProcessGone;
    private final o00000 _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final InterfaceC4522o isRenderProcessGone;
    private final o0OO loadErrors;
    private final o000O0o onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final o0OO webviewType;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        OooOo.OooO0o0(getCachedAsset, "getCachedAsset");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = o0o0000.OooO0OO(oo000o.f31251OooOo0O);
        o00000O0 o00000o0OooO00o = o0000OO0.OooO00o();
        this._onLoadFinished = o00000o0OooO00o;
        this.onLoadFinished = o00000o0OooO00o;
        oO00000o oo00000oOooO0OO = o0o0000.OooO0OO(Boolean.FALSE);
        this._isRenderProcessGone = oo00000oOooO0OO;
        this.isRenderProcessGone = new o0OOO0(oo00000oOooO0OO);
        this.webviewType = o0o0000.OooO0OO("");
    }

    public final o000O0o getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final InterfaceC4522o isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        OooOo.OooO0o0(view, "view");
        OooOo.OooO0o0(url, "url");
        if (url.equals(BLANK_PAGE)) {
            o0OO o0oo = this.loadErrors;
            while (true) {
                oO00000o oo00000o = (oO00000o) o0oo;
                Object value = oo00000o.getValue();
                str = url;
                if (oo00000o.OooO0oO(value, OooOo00.Oooo00o((List) value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    url = str;
                }
            }
        } else {
            str = url;
        }
        super.onPageFinished(view, str);
        ((o00000O0) this._onLoadFinished).Oooo0oO(((oO00000o) this.loadErrors).getValue());
    }

    @Override // androidx.webkit.WebViewClientCompat
    @RequiresApi(21)
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceErrorCompat error) {
        oO00000o oo00000o;
        Object value;
        OooOo.OooO0o0(view, "view");
        OooOo.OooO0o0(request, "request");
        OooOo.OooO0o0(error, "error");
        super.onReceivedError(view, request, error);
        ErrorReason errorReasonWebResourceToErrorReason = WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE) ? IntExtensionKt.webResourceToErrorReason(error.getErrorCode()) : ErrorReason.REASON_UNKNOWN;
        o0OO o0oo = this.loadErrors;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, OooOo00.Oooo00o((List) value, new WebViewClientError(request.getUrl().toString(), errorReasonWebResourceToErrorReason, null, 4, null))));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        oO00000o oo00000o;
        Object value;
        OooOo.OooO0o0(view, "view");
        OooOo.OooO0o0(request, "request");
        OooOo.OooO0o0(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        WebViewClientError webViewClientError = new WebViewClientError(request.getUrl().toString(), ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, Integer.valueOf(errorResponse.getStatusCode()));
        o0OO o0oo = this.loadErrors;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, OooOo00.Oooo00o((List) value, webViewClientError)));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        oO00000o oo00000o;
        Object value;
        OooOo.OooO0o0(view, "view");
        OooOo.OooO0o0(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (((o00O) this._onLoadFinished).Oooo0o0()) {
            o0OO o0oo = this._isRenderProcessGone;
            Boolean bool = Boolean.TRUE;
            oO00000o oo00000o2 = (oO00000o) o0oo;
            oo00000o2.getClass();
            oo00000o2.OooO(null, bool);
            return true;
        }
        o0OO o0oo2 = this.loadErrors;
        do {
            oo00000o = (oO00000o) o0oo2;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, OooOo00.Oooo00o((List) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
        ((o00000O0) this._onLoadFinished).Oooo0oO(((oO00000o) this.loadErrors).getValue());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Object objOooO0O0;
        OooOo.OooO0o0(view, "view");
        OooOo.OooO0o0(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                objOooO0O0 = url.getQueryParameter("webviewType");
            } catch (Throwable th) {
                objOooO0O0 = o000OOo.OooO0O0(th);
            }
            if (objOooO0O0 instanceof oo00o.OooOO0O) {
                objOooO0O0 = null;
            }
            String str = (String) objOooO0O0;
            if (str != null && !o000000.OoooOO0(str)) {
                oO00000o oo00000o = (oO00000o) this.webviewType;
                oo00000o.getClass();
                oo00000o.OooO(null, str);
            }
            if (OooOo.OooO00o(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            OooOo.OooO0Oo(url2, "request.url");
            return getCachedAsset.invoke(url2, (String) ((oO00000o) this.webviewType).getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, message != null ? o0O0O00.OooOOOo(new OooOO0("reason", message)) : o00oO0o.f31247OooOo0O, null, null, null, 58, null);
            return super.shouldInterceptRequest(view, request);
        }
    }
}

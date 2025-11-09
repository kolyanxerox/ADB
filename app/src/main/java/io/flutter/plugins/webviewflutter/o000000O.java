package io.flutter.plugins.webviewflutter;

import android.webkit.JsResult;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class o000000O implements o00O0Oo.Oooo000 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ JsResult f28817OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28818OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebChromeClientProxyApi.WebChromeClientImpl f28819OooOo0o;

    public /* synthetic */ o000000O(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, JsResult jsResult, int i) {
        this.f28818OooOo0O = i;
        this.f28819OooOo0o = webChromeClientImpl;
        this.f28817OooOo = jsResult;
    }

    @Override // o00O0Oo.Oooo000
    public final Object invoke(Object obj) {
        ResultCompat resultCompat = (ResultCompat) obj;
        switch (this.f28818OooOo0O) {
            case 0:
                return this.f28819OooOo0o.lambda$onJsConfirm$9(this.f28817OooOo, resultCompat);
            default:
                return this.f28819OooOo0o.lambda$onJsAlert$8(this.f28817OooOo, resultCompat);
        }
    }
}

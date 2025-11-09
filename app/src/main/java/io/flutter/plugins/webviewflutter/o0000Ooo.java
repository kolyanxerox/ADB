package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ WebView f28837OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28838OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f28839OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f28840OooOoO0;

    public /* synthetic */ o0000Ooo(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, String str, int i) {
        this.f28838OooOo0O = i;
        this.f28839OooOo0o = webViewClientImpl;
        this.f28837OooOo = webView;
        this.f28840OooOoO0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28838OooOo0O) {
            case 0:
                this.f28839OooOo0o.lambda$onPageFinished$3(this.f28837OooOo, this.f28840OooOoO0);
                break;
            case 1:
                this.f28839OooOo0o.lambda$onPageCommitVisible$23(this.f28837OooOo, this.f28840OooOoO0);
                break;
            case 2:
                this.f28839OooOo0o.lambda$onPageStarted$1(this.f28837OooOo, this.f28840OooOoO0);
                break;
            case 3:
                this.f28839OooOo0o.lambda$shouldOverrideUrlLoading$13(this.f28837OooOo, this.f28840OooOoO0);
                break;
            default:
                this.f28839OooOo0o.lambda$onLoadResource$21(this.f28837OooOo, this.f28840OooOoO0);
                break;
        }
    }
}

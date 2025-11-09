package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ WebView f28828OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28829OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f28830OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f28831OooOoO0;

    public /* synthetic */ o00000OO(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, String str, int i) {
        this.f28829OooOo0O = i;
        this.f28830OooOo0o = webViewClientCompatImpl;
        this.f28828OooOo = webView;
        this.f28831OooOoO0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28829OooOo0O) {
            case 0:
                this.f28830OooOo0o.lambda$onPageStarted$1(this.f28828OooOo, this.f28831OooOoO0);
                break;
            case 1:
                this.f28830OooOo0o.lambda$shouldOverrideUrlLoading$13(this.f28828OooOo, this.f28831OooOoO0);
                break;
            case 2:
                this.f28830OooOo0o.lambda$onPageCommitVisible$23(this.f28828OooOo, this.f28831OooOoO0);
                break;
            case 3:
                this.f28830OooOo0o.lambda$onLoadResource$21(this.f28828OooOo, this.f28831OooOoO0);
                break;
            default:
                this.f28830OooOo0o.lambda$onPageFinished$3(this.f28828OooOo, this.f28831OooOoO0);
                break;
        }
    }
}

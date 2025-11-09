package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ float f28820OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28821OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebView f28822OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f28823OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f28824OooOoO0;

    public /* synthetic */ o00000O(WebViewClient webViewClient, WebView webView, float f, float f2, int i) {
        this.f28821OooOo0O = i;
        this.f28823OooOoO = webViewClient;
        this.f28822OooOo0o = webView;
        this.f28820OooOo = f;
        this.f28824OooOoO0 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28821OooOo0O) {
            case 0:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f28823OooOoO).lambda$onScaleChanged$31(this.f28822OooOo0o, this.f28820OooOo, this.f28824OooOoO0);
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f28823OooOoO).lambda$onScaleChanged$31(this.f28822OooOo0o, this.f28820OooOo, this.f28824OooOoO0);
                break;
        }
    }
}

package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcessClient;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ WebView f15335OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15336OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcessClient f15337OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcessImpl f15338OooOoO0;

    public /* synthetic */ OooOO0(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcessImpl webViewRenderProcessImpl, int i) {
        this.f15336OooOo0O = i;
        this.f15337OooOo0o = webViewRenderProcessClient;
        this.f15335OooOo = webView;
        this.f15338OooOoO0 = webViewRenderProcessImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15336OooOo0O) {
            case 0:
                this.f15337OooOo0o.onRenderProcessResponsive(this.f15335OooOo, this.f15338OooOoO0);
                break;
            default:
                this.f15337OooOo0o.onRenderProcessUnresponsive(this.f15335OooOo, this.f15338OooOoO0);
                break;
        }
    }
}

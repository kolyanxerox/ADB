package OoooO0O;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class o00000 extends WebViewClient {

    /* renamed from: OooO00o */
    public final /* synthetic */ o00000O0 f13909OooO00o;

    public /* synthetic */ o00000(o00000O0 o00000o02) {
        this.f13909OooO00o = o00000o02;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        o00000O0 o00000o02 = this.f13909OooO00o;
        int i = o00000O0.f13915OooOoO0;
        if (str == null || !str.startsWith("consent://")) {
            return;
        }
        o00000o02.f13918OooOo0o.OooO0O0(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        o00000O0 o00000o02 = this.f13909OooO00o;
        if (o00000o02.f13916OooOo) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        o00000o02.f13916OooOo = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        o0000Ooo o0000ooo = this.f13909OooO00o.f13918OooOo0o;
        o0000ooo.getClass();
        Locale locale = Locale.US;
        o00O00 o00o00 = new o00O00(2, "WebResourceError(" + i + ", " + str2 + "): " + str);
        o0OO00O o0oo00o = (o0OO00O) o0000ooo.f13949OooOoo0.f14065OooO.getAndSet(null);
        if (o0oo00o == null) {
            return;
        }
        o0oo00o.onConsentFormLoadFailure(o00o00.OooO00o());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        o00000O0 o00000o02 = this.f13909OooO00o;
        int i = o00000O0.f13915OooOoO0;
        if (string == null || !string.startsWith("consent://")) {
            return false;
        }
        o00000o02.f13918OooOo0o.OooO0O0(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        o00000O0 o00000o02 = this.f13909OooO00o;
        int i = o00000O0.f13915OooOoO0;
        if (str == null || !str.startsWith("consent://")) {
            return false;
        }
        o00000o02.f13918OooOo0o.OooO0O0(str);
        return true;
    }
}

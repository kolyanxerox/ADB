package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.C3034d9;
import com.ironsource.InterfaceC3043di;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.InterfaceC3646k;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ih */
/* loaded from: classes2.dex */
public class C3222ih implements InterfaceC3043di {

    /* renamed from: g */
    private static final String f9010g = "loadWithUrl | webView is not null";

    /* renamed from: h */
    private static final String f9011h = "ih";

    /* renamed from: i */
    private static final String f9012i = "file://";

    /* renamed from: a */
    private final String f9013a;

    /* renamed from: b */
    private String f9014b;

    /* renamed from: c */
    private WebView f9015c;

    /* renamed from: d */
    private C3152gh f9016d;

    /* renamed from: e */
    private C2972bh f9017e;

    /* renamed from: f */
    private Context f9018f;

    /* renamed from: com.ironsource.ih$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9019a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f9020b;

        /* renamed from: c */
        final /* synthetic */ String f9021c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.f9019a = str;
            this.f9020b = jSONObject;
            this.f9021c = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (C3222ih.this.f9015c != null) {
                C3699th.m12428a(C3198hs.f8932q, new C3489oh().m11155a(C3037dc.f8225A, C3222ih.f9010g).m11156a());
            }
            try {
                C3222ih.this.m9333b(this.f9019a);
                C3222ih.this.f9015c.loadUrl(C3222ih.this.m9329a(this.f9020b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C3222ih.this.f9013a);
                C3222ih.this.f9016d.m8965a(this.f9021c, jSONObject);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                C3222ih.this.m9340b(this.f9019a, e.getMessage());
                C3699th.m12428a(C3198hs.f8932q, new C3489oh().m11155a(C3037dc.f8225A, e.getMessage()).m11156a());
            }
        }
    }

    /* renamed from: com.ironsource.ih$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9023a;

        /* renamed from: b */
        final /* synthetic */ String f9024b;

        public b(String str, String str2) {
            this.f9023a = str;
            this.f9024b = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                if (C3222ih.this.f9015c != null) {
                    C3222ih.this.f9015c.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C3222ih.this.f9013a);
                if (C3222ih.this.f9016d != null) {
                    C3222ih.this.f9016d.m8965a(this.f9023a, jSONObject);
                    C3222ih.this.f9016d.m8968b();
                }
                C3222ih.this.f9016d = null;
                C3222ih.this.f9018f = null;
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                Log.e(C3222ih.f9011h, "performCleanup | could not destroy ISNAdView webView ID: " + C3222ih.this.f9013a);
                C3699th.m12428a(C3198hs.f8933r, new C3489oh().m11155a(C3037dc.f8225A, e.getMessage()).m11156a());
                C3222ih.this.m9340b(this.f9024b, e.getMessage());
            }
        }
    }

    /* renamed from: com.ironsource.ih$c */
    public class c implements InterfaceC3043di.a {

        /* renamed from: a */
        final /* synthetic */ String f9026a;

        public c(String str) {
            this.f9026a = str;
        }

        @Override // com.ironsource.InterfaceC3043di.a
        /* renamed from: a */
        public void mo8317a(String str) {
            Logger.m12266i(C3222ih.f9011h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C3222ih.this.m9340b(this.f9026a, str);
        }

        @Override // com.ironsource.InterfaceC3043di.a
        /* renamed from: b */
        public void mo8318b(String str) {
            Logger.m12266i(C3222ih.f9011h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C3222ih.this.f9015c.getParent()).removeView(C3222ih.this.f9015c);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C3222ih.this.m9338e();
        }
    }

    /* renamed from: com.ironsource.ih$d */
    public class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C3222ih.this.new d());
            webView2.setWebViewClient(new e(C3222ih.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m12266i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public /* synthetic */ d(C3222ih c3222ih, a aVar) {
            this();
        }
    }

    /* renamed from: com.ironsource.ih$e */
    public class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m12264e(C3222ih.f9011h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentM11920a = new OpenUrlActivity.C3635e(new InterfaceC3646k.b()).m11922a(str).m11924b(false).m11920a(context);
            intentM11920a.addFlags(268435456);
            context.startActivity(intentM11920a);
            return true;
        }

        public /* synthetic */ e(C3222ih c3222ih, a aVar) {
            this();
        }
    }

    public C3222ih(InterfaceC3077eh interfaceC3077eh, Context context, String str, C2972bh c2972bh) {
        this.f9018f = context;
        C3152gh c3152gh = new C3152gh();
        this.f9016d = c3152gh;
        c3152gh.m8974g(str);
        this.f9013a = str;
        this.f9016d.m8961a(interfaceC3077eh);
        this.f9017e = c2972bh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void m9338e() {
        mo8312a("", "");
    }

    /* renamed from: b */
    public String m9339b() {
        return this.f9013a;
    }

    /* renamed from: c */
    public C3152gh m9341c() {
        return this.f9016d;
    }

    /* renamed from: d */
    public C2972bh m9342d() {
        return this.f9017e;
    }

    @Override // com.ironsource.InterfaceC3043di
    public WebView getPresentingView() {
        return this.f9015c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f9016d.m8970c(str);
    }

    /* renamed from: d */
    private String m9336d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    /* renamed from: e */
    public void m9343e(String str) {
        this.f9014b = str;
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: c */
    public void mo8316c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f9016d.m8964a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            Logger.m12266i(f9011h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: b */
    public void m9333b(String str) {
        Logger.m12266i(f9011h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f9018f);
        this.f9015c = webView;
        webView.addJavascriptInterface(new C3117fh(this), C3007ch.f7744e);
        this.f9015c.setWebViewClient(new C3187hh(new c(str)));
        this.f9015c.setWebChromeClient(new d(this, null));
        C3750ux.m12727a(this.f9015c);
        this.f9016d.m8960a(this.f9015c);
    }

    /* renamed from: c */
    private boolean m9335c(String str) {
        return str.startsWith(".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m9329a(String str) {
        if (!m9335c(str)) {
            return str;
        }
        return f9012i + this.f9014b + m9336d(str);
    }

    /* renamed from: b */
    public void m9340b(String str, String str2) {
        C3152gh c3152gh = this.f9016d;
        if (c3152gh != null) {
            c3152gh.m8963a(str, str2);
        }
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: b */
    public void mo8315b(JSONObject jSONObject, String str, String str2) {
        C3523pg.f10822a.m11404d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: a */
    public synchronized void mo8312a(String str, String str2) {
        if (this.f9018f == null) {
            return;
        }
        Logger.m12266i(f9011h, "performCleanup");
        C3523pg.f10822a.m11404d(new b(str, str2));
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: a */
    public void mo8313a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            m9340b(str3, C3034d9.c.f7944D);
            return;
        }
        Logger.m12266i(f9011h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C3034d9.h.f8132t0)) {
                this.f9015c.onPause();
            } else {
                if (!str.equals(C3034d9.h.f8134u0)) {
                    m9340b(str3, C3034d9.c.f7943C);
                    return;
                }
                this.f9015c.onResume();
            }
            this.f9016d.m8973f(str2);
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            m9340b(str3, C3034d9.c.f7945E);
        }
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: a */
    public void mo8314a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f9016d.m8972e(str);
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            Logger.m12266i(f9011h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }
}

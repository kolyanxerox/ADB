package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.internal.C2545g;
import com.iab.omid.library.ironsrc.internal.C2546h;
import com.iab.omid.library.ironsrc.utils.C2558c;
import com.iab.omid.library.ironsrc.utils.C2561f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.publisher.b */
/* loaded from: classes2.dex */
public class C2555b extends AdSessionStatePublisher {

    /* renamed from: g */
    private WebView f3659g;

    /* renamed from: h */
    private Long f3660h;

    /* renamed from: i */
    private final Map<String, VerificationScriptResource> f3661i;

    /* renamed from: j */
    private final String f3662j;

    /* renamed from: com.iab.omid.library.ironsrc.publisher.b$a */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C2555b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C2555b.this.m4351a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.ironsrc.publisher.b$b */
    public class b implements Runnable {

        /* renamed from: a */
        private final WebView f3664a;

        public b() {
            this.f3664a = C2555b.this.f3659g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3664a.destroy();
        }
    }

    public C2555b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f3660h = null;
        this.f3661i = map;
        this.f3662j = str2;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    /* renamed from: b */
    public void mo4364b() {
        super.mo4364b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f3660h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C2561f.m4410b() - this.f3660h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f3659g = null;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    /* renamed from: i */
    public void mo4373i() {
        super.mo4373i();
        m4375j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: j */
    public void m4375j() {
        WebView webView = new WebView(C2545g.m4308b().m4309a());
        this.f3659g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f3659g.getSettings().setAllowContentAccess(false);
        this.f3659g.getSettings().setAllowFileAccess(false);
        this.f3659g.setWebViewClient(new a());
        m4351a(this.f3659g);
        C2546h.m4311a().m4327c(this.f3659g, this.f3662j);
        for (String str : this.f3661i.keySet()) {
            C2546h.m4311a().m4328d(this.f3659g, this.f3661i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f3660h = Long.valueOf(C2561f.m4410b());
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    /* renamed from: a */
    public void mo4355a(C2531a c2531a, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C2558c.m4390a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m4356a(c2531a, adSessionContext, jSONObject);
    }
}

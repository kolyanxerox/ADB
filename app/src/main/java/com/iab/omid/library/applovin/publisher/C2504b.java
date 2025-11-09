package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.C2494g;
import com.iab.omid.library.applovin.internal.C2495h;
import com.iab.omid.library.applovin.utils.C2507c;
import com.iab.omid.library.applovin.utils.C2510f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.publisher.b */
/* loaded from: classes2.dex */
public class C2504b extends AdSessionStatePublisher {

    /* renamed from: g */
    private WebView f3524g;

    /* renamed from: h */
    private Long f3525h;

    /* renamed from: i */
    private final Map<String, VerificationScriptResource> f3526i;

    /* renamed from: j */
    private final String f3527j;

    /* renamed from: com.iab.omid.library.applovin.publisher.b$a */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C2504b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C2504b.this.m4098a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.applovin.publisher.b$b */
    public class b implements Runnable {

        /* renamed from: a */
        private final WebView f3529a;

        public b() {
            this.f3529a = C2504b.this.f3524g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3529a.destroy();
        }
    }

    public C2504b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f3525h = null;
        this.f3526i = map;
        this.f3527j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* renamed from: b */
    public void mo4111b() {
        super.mo4111b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f3525h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C2510f.m4157b() - this.f3525h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f3524g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* renamed from: i */
    public void mo4120i() {
        super.mo4120i();
        m4122j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: j */
    public void m4122j() {
        WebView webView = new WebView(C2494g.m4055b().m4056a());
        this.f3524g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f3524g.getSettings().setAllowContentAccess(false);
        this.f3524g.getSettings().setAllowFileAccess(false);
        this.f3524g.setWebViewClient(new a());
        m4098a(this.f3524g);
        C2495h.m4058a().m4074c(this.f3524g, this.f3527j);
        for (String str : this.f3526i.keySet()) {
            C2495h.m4058a().m4075d(this.f3524g, this.f3526i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f3525h = Long.valueOf(C2510f.m4157b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* renamed from: a */
    public void mo4102a(C2480a c2480a, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C2507c.m4137a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m4103a(c2480a, adSessionContext, jSONObject);
    }
}

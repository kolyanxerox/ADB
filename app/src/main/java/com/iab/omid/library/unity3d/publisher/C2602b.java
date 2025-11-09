package com.iab.omid.library.unity3d.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.adsession.VerificationScriptResource;
import com.iab.omid.library.unity3d.internal.C2593f;
import com.iab.omid.library.unity3d.internal.C2594g;
import com.iab.omid.library.unity3d.utils.C2605c;
import com.iab.omid.library.unity3d.utils.C2608f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.publisher.b */
/* loaded from: classes2.dex */
public class C2602b extends AdSessionStatePublisher {

    /* renamed from: g */
    private WebView f3788g;

    /* renamed from: h */
    private Long f3789h;

    /* renamed from: i */
    private final Map<String, VerificationScriptResource> f3790i;

    /* renamed from: j */
    private final String f3791j;

    /* renamed from: com.iab.omid.library.unity3d.publisher.b$a */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C2602b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C2602b.this.m4593a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.unity3d.publisher.b$b */
    public class b implements Runnable {

        /* renamed from: a */
        private final WebView f3793a;

        public b() {
            this.f3793a = C2602b.this.f3788g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3793a.destroy();
        }
    }

    public C2602b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f3789h = null;
        this.f3790i = map;
        this.f3791j = str2;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    /* renamed from: b */
    public void mo4606b() {
        super.mo4606b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f3789h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C2608f.m4649b() - this.f3789h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f3788g = null;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    /* renamed from: i */
    public void mo4614i() {
        super.mo4614i();
        m4616j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: j */
    public void m4616j() {
        WebView webView = new WebView(C2593f.m4557b().m4558a());
        this.f3788g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f3788g.getSettings().setAllowContentAccess(false);
        this.f3788g.getSettings().setAllowFileAccess(false);
        this.f3788g.setWebViewClient(new a());
        m4593a(this.f3788g);
        C2594g.m4560a().m4576c(this.f3788g, this.f3791j);
        for (String str : this.f3790i.keySet()) {
            C2594g.m4560a().m4575c(this.f3788g, this.f3790i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f3789h = Long.valueOf(C2608f.m4649b());
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    /* renamed from: a */
    public void mo4597a(C2580a c2580a, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C2605c.m4631a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m4598a(c2580a, adSessionContext, jSONObject);
    }
}

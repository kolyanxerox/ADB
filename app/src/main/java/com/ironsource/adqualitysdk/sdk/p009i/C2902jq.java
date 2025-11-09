package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.ironsource.adqualitysdk.sdk.p009i.C2671bb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jq */
/* loaded from: classes2.dex */
public class C2902jq implements InterfaceC2896jk {

    /* renamed from: ﻐ */
    private static Map<WebView, C2902jq> f7119 = new WeakHashMap();

    /* renamed from: ﻛ */
    private String f7120;

    /* renamed from: ﾇ */
    private Set<InterfaceC2896jk> f7121 = new HashSet();

    /* renamed from: ﾒ */
    private C2904js f7122;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jq$4, reason: invalid class name */
    public class AnonymousClass4 extends WebChromeClient {

        /* renamed from: ﾇ */
        private boolean f7128 = false;

        public AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            C2902jq.this.mo4949(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i != 100 || this.f7128) {
                return;
            }
            this.f7128 = true;
            C2902jq.this.mo4947(webView);
        }
    }

    private C2902jq(WebView webView, String str) {
        this.f7120 = str;
        C2904js c2904js = new C2904js(webView);
        this.f7122 = c2904js;
        c2904js.m7331(new AnonymousClass3());
        this.f7122.m7334(new AnonymousClass4());
    }

    /* renamed from: ﻛ */
    public final void m7317() {
        this.f7122.m7331(new AnonymousClass3());
    }

    /* renamed from: ｋ */
    public final WebView m7318() {
        return this.f7122.m7333();
    }

    /* renamed from: ﾇ */
    public final void m7319(InterfaceC2896jk interfaceC2896jk) {
        this.f7121.add(interfaceC2896jk);
    }

    /* renamed from: ﾒ */
    public final void m7321() {
        this.f7122.m7334(new AnonymousClass4());
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jq$3, reason: invalid class name */
    public class AnonymousClass3 extends WebViewClient {

        /* renamed from: ﻛ */
        private boolean f7124 = false;

        /* renamed from: ｋ */
        private boolean f7125 = false;

        /* renamed from: ﾒ */
        private String f7126 = null;

        public AnonymousClass3() {
        }

        /* renamed from: ﾇ */
        private boolean m7322(WebView webView) {
            if (this.f7124 && this.f7125) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f7126 == null || webView.getOriginalUrl().equals(this.f7126)) ? false : true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            C2902jq.this.mo4947(webView);
            this.f7124 = false;
            this.f7125 = true;
            if (this.f7126 == null) {
                this.f7126 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C2902jq.this.mo4947(webView);
            this.f7124 = true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m7323(webView, str)) {
                return true;
            }
            if (this.f7126 == null) {
                this.f7126 = webView.getOriginalUrl();
            }
            C2902jq.this.mo4946(webView, str, m7322(webView));
            this.f7125 = true;
            this.f7124 = false;
            return false;
        }

        /* renamed from: ﾇ */
        private boolean m7323(WebView webView, String str) {
            if (!str.startsWith(C2902jq.this.f7120)) {
                return false;
            }
            this.f7126 = webView.getOriginalUrl();
            String strSubstring = str.substring(C2902jq.this.f7120.length());
            C2902jq c2902jq = C2902jq.this;
            c2902jq.mo4948(webView, c2902jq.f7120, strSubstring);
            return true;
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    /* renamed from: ﻐ */
    public static C2902jq m7313(WebView webView, String str) {
        C2902jq c2902jq = f7119.get(webView);
        if (c2902jq != null) {
            return c2902jq;
        }
        C2902jq c2902jq2 = new C2902jq(webView, str);
        f7119.put(webView, c2902jq2);
        return c2902jq2;
    }

    /* renamed from: ﾇ */
    public final boolean m7320() {
        return this.f7122.m7332();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2896jk
    /* renamed from: ﾇ */
    public final void mo4947(WebView webView) {
        Iterator it = new HashSet(this.f7121).iterator();
        while (it.hasNext()) {
            InterfaceC2896jk interfaceC2896jk = (InterfaceC2896jk) it.next();
            if (interfaceC2896jk != null) {
                interfaceC2896jk.mo4947(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2896jk
    /* renamed from: ﾒ */
    public final void mo4949(WebView webView, String str) {
        Iterator it = new HashSet(this.f7121).iterator();
        while (it.hasNext()) {
            InterfaceC2896jk interfaceC2896jk = (InterfaceC2896jk) it.next();
            if (interfaceC2896jk != null) {
                interfaceC2896jk.mo4949(webView, str);
            }
        }
    }

    /* renamed from: ﻐ */
    public final void m7316(InterfaceC2896jk interfaceC2896jk) {
        this.f7121.remove(interfaceC2896jk);
    }

    /* renamed from: ﻐ */
    public final C2671bb.e m7315() {
        return this.f7122.m7330();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2896jk
    /* renamed from: ﾇ */
    public final void mo4948(WebView webView, String str, String str2) {
        Iterator it = new HashSet(this.f7121).iterator();
        while (it.hasNext()) {
            InterfaceC2896jk interfaceC2896jk = (InterfaceC2896jk) it.next();
            if (interfaceC2896jk != null) {
                interfaceC2896jk.mo4948(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2896jk
    /* renamed from: ﻐ */
    public final void mo4946(WebView webView, String str, boolean z) {
        Iterator it = new HashSet(this.f7121).iterator();
        while (it.hasNext()) {
            InterfaceC2896jk interfaceC2896jk = (InterfaceC2896jk) it.next();
            if (interfaceC2896jk != null) {
                interfaceC2896jk.mo4946(webView, str, z);
            }
        }
    }
}

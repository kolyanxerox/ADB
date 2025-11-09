package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;

/* renamed from: com.ironsource.cl */
/* loaded from: classes2.dex */
public interface InterfaceC3011cl {

    /* renamed from: com.ironsource.cl$a */
    public static final class a implements InterfaceC3011cl {

        /* renamed from: a */
        private WebView f7789a;

        /* renamed from: b */
        private boolean f7790b;

        public a() {
            this(0, 1, null);
        }

        @SuppressLint({"NewApi"})
        /* renamed from: b */
        private final void m8178b(String str) {
            WebView webView = this.f7789a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        /* renamed from: c */
        private final void m8179c(String str) {
            WebView webView = this.f7789a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC3011cl
        /* renamed from: a */
        public void mo8175a(WebView webView) {
            kotlin.jvm.internal.OooOo.OooO0o0(webView, "webView");
            this.f7789a = webView;
        }

        public a(int i) {
            this.f7790b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC3011cl
        /* renamed from: a */
        public void mo8176a(String script) {
            kotlin.jvm.internal.OooOo.OooO0o0(script, "script");
            try {
                if (this.f7790b) {
                    m8178b(script);
                } else {
                    m8179c(script);
                }
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                this.f7790b = false;
                m8179c(script);
            }
        }

        public /* synthetic */ a(int i, int i2, kotlin.jvm.internal.OooOO0O oooOO0O) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC3011cl
        /* renamed from: a */
        public boolean mo8177a() {
            return this.f7789a != null;
        }
    }

    /* renamed from: a */
    void mo8175a(WebView webView);

    /* renamed from: a */
    void mo8176a(String str);

    /* renamed from: a */
    boolean mo8177a();
}

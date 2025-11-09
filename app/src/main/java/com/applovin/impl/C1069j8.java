package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.applovin.impl.adview.C0977l;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.applovin.impl.j8 */
/* loaded from: classes.dex */
public class C1069j8 extends AbstractC1179r4 {

    /* renamed from: a */
    private final C1240o f976a;

    /* renamed from: b */
    private WeakReference f977b;

    /* renamed from: com.applovin.impl.j8$a */
    public interface a {
        /* renamed from: a */
        void mo1111a(Uri uri, C0977l c0977l);

        /* renamed from: a */
        void mo1112a(C0977l c0977l);

        /* renamed from: a */
        void mo1113a(C0977l c0977l, Bundle bundle);

        /* renamed from: b */
        void mo1114b(Uri uri, C0977l c0977l);

        /* renamed from: b */
        void mo1115b(C0977l c0977l);

        /* renamed from: c */
        void mo1116c(C0977l c0977l);

        /* renamed from: d */
        void mo1117d(C0977l c0977l);
    }

    public C1069j8(C1220k c1220k) {
        this.f976a = c1220k.m2847O();
    }

    /* renamed from: a */
    public void m1110a(WeakReference weakReference) {
        this.f977b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m1109a(webView, str);
        return true;
    }

    @Override // com.applovin.impl.AbstractC1179r4
    /* renamed from: a */
    public Map mo235a() {
        return CollectionUtils.hashMap("name", "WebViewButtonClient");
    }

    /* renamed from: a */
    private void m1109a(WebView webView, String str) {
        if (C1240o.m3200a()) {
            this.f976a.m3215d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof C0977l)) {
            return;
        }
        C0977l c0977l = (C0977l) webView;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        a aVar = (a) this.f977b.get();
        if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.mo1115b(c0977l);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.mo1112a(c0977l);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.mo1117d(c0977l);
                return;
            }
            if ("/direct_download".equals(path)) {
                aVar.mo1113a(c0977l, AbstractC1048h7.m936a(uri));
                return;
            }
            if ("/load_url".equals(path)) {
                aVar.mo1111a(uri, c0977l);
                return;
            }
            if ("/template_error".equals(path)) {
                aVar.mo1114b(uri, c0977l);
                return;
            }
            if ("/fully_watched".equals(path)) {
                aVar.mo1116c(c0977l);
                return;
            }
            if (C1240o.m3200a()) {
                this.f976a.m3218k("WebViewButtonClient", "Unknown URL: ".concat(str));
            }
            if (C1240o.m3200a()) {
                this.f976a.m3218k("WebViewButtonClient", "Path: " + path);
            }
        }
    }
}

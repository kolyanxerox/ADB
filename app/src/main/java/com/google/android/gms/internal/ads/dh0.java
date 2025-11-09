package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class dh0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C1595g7 f18252OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final WebView f18253OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final fi0 f18254OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f18255OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final mh0 f18256OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public dh0(C1595g7 c1595g7, WebView webView) {
        HashMap map = new HashMap();
        this.f18255OooO0Oo = map;
        this.f18256OooO0o0 = new mh0();
        if (!ze0.f26157OooO0Oo.f29577OooOo0o) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f18252OooO00o = c1595g7;
        this.f18253OooO0O0 = webView;
        fi0 fi0Var = this.f18254OooO0OO;
        if ((fi0Var == null ? null : (View) fi0Var.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((yg0) it.next()).OooO0O0(webView);
            }
            this.f18254OooO0OO = new fi0(webView);
        }
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        WebViewCompat.removeWebMessageListener(this.f18253OooO0O0, "omidJsSessionService");
        WebViewCompat.addWebMessageListener(this.f18253OooO0O0, "omidJsSessionService", new HashSet(Arrays.asList(ProxyConfig.MATCH_ALL_SCHEMES)), new ch0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(dh0 dh0Var, String str) {
        zg0 zg0Var = zg0.DEFINED_BY_JAVASCRIPT;
        bh0 bh0Var = bh0.DEFINED_BY_JAVASCRIPT;
        eh0 eh0Var = eh0.JAVASCRIPT;
        int i = 0;
        yg0 yg0Var = new yg0(fj0.OooO00o(zg0Var, bh0Var, eh0Var, eh0Var, false), new oO000O0O(dh0Var.f18252OooO00o, dh0Var.f18253OooO0O0, null, null, xg0.HTML), str);
        dh0Var.f18255OooO0Oo.put(str, yg0Var);
        fi0 fi0Var = dh0Var.f18254OooO0OO;
        yg0Var.OooO0O0(fi0Var == null ? null : (View) fi0Var.get());
        ArrayList arrayList = dh0Var.f18256OooO0o0.f21254OooO00o;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lh0 lh0Var = (lh0) obj;
            View view = (View) lh0Var.f20888OooO00o.get();
            if (!yg0Var.f25910OooO0o) {
                yg0Var.f25907OooO0O0.OooO00o(view, lh0Var.f20890OooO0OO);
            }
        }
        yg0Var.OooO0OO();
    }
}

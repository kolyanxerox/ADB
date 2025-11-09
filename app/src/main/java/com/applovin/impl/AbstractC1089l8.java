package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.l8 */
/* loaded from: classes.dex */
public abstract class AbstractC1089l8 {
    /* renamed from: a */
    public static /* synthetic */ void m1418a(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    /* renamed from: b */
    public static void m1423b(WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o0Oo0oo(webView, 1));
    }

    /* renamed from: c */
    public static String m1425c(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return m1415a("al_onExternalRedirectEvent", str2, map);
    }

    /* renamed from: d */
    public static String m1427d(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.preload_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return m1415a("al_onPreloadEvent", str2, map);
    }

    /* renamed from: b */
    public static String m1422b(String str, Map map) {
        String str2;
        str.getClass();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = "failure";
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return m1415a("al_onInAppBrowserEvent", str2, map);
    }

    /* renamed from: a */
    public static String m1416a(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = "failure";
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = "success";
        }
        return m1415a("al_onCustomIntentLaunchEvent", str2, map);
    }

    /* renamed from: a */
    public static String m1417a(Map map) {
        return m1415a("al_onWindowInsetsInfoCollectedEvent", "success", map);
    }

    /* renamed from: a */
    private static String m1415a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("javascript:", str, "('", str2, "',");
        sbOooOOo0.append(jSONObject);
        sbOooOOo0.append(");");
        return sbOooOOo0.toString();
    }

    /* renamed from: a */
    public static void m1421a(WebView webView, String str, String str2, C1220k c1220k) {
        if (webView == null) {
            return;
        }
        try {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3211a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new o000000O(webView, str, 1));
        } catch (Throwable th) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a(str2, "Unable to forward to WebView", th);
            }
            c1220k.m2832E().m2153a(str2, th, CollectionUtils.hashMap("operation", str));
        }
    }

    /* renamed from: a */
    public static void m1419a(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new o000000O(webView, str, 0));
    }

    /* renamed from: a */
    public static C1170q4 m1414a(WebView webView, String str, C1220k c1220k) {
        C1170q4 c1170q4 = new C1170q4("evaluateJavascript");
        if (webView == null) {
            return c1170q4.m2266a("null_webview");
        }
        AppLovinSdkUtils.runOnUiThread(new androidx.webkit.OooO00o(webView, str, c1170q4, 9));
        Long l = (Long) c1220k.m2866a(C1268v4.f2653P2);
        if (l.longValue() > 0) {
            C1037g6.m799a(l.longValue(), c1170q4, "timed_out", "evaluateJavascriptTimeout", c1220k);
            return c1170q4;
        }
        c1170q4.m2271b(null);
        return c1170q4;
    }

    /* renamed from: a */
    public static /* synthetic */ void m1420a(WebView webView, String str, final C1170q4 c1170q4) {
        Objects.requireNonNull(c1170q4);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.applovin.impl.o00000
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                c1170q4.m2271b((String) obj);
            }
        });
    }
}

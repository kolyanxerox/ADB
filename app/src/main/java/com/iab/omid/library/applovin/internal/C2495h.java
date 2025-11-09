package com.iab.omid.library.applovin.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.utils.C2508d;
import com.ironsource.C3034d9;
import com.ironsource.C3912zo;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.internal.h */
/* loaded from: classes2.dex */
public class C2495h {

    /* renamed from: a */
    private static C2495h f3495a = new C2495h();

    /* renamed from: com.iab.omid.library.applovin.internal.h$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f3496a;

        /* renamed from: b */
        final /* synthetic */ String f3497b;

        public a(WebView webView, String str) {
            this.f3496a = webView;
            this.f3497b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2495h.this.m4074c(this.f3496a, this.f3497b);
        }
    }

    private C2495h() {
    }

    /* renamed from: a */
    public static final C2495h m4058a() {
        return f3495a;
    }

    /* renamed from: b */
    public void m4070b(WebView webView, String str) {
        m4066a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m4073c(WebView webView, String str, String str2) {
        m4066a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m4075d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m4074c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m4059a(WebView webView, String str) {
        m4066a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m4071b(WebView webView, String str, String str2) {
        m4066a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m4074c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }

    /* renamed from: a */
    public void m4060a(WebView webView, String str, float f) {
        m4066a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m4072b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m4066a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m4061a(WebView webView, String str, ErrorType errorType, String str2) {
        m4066a(webView, C3912zo.a.f13038g, errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m4062a(WebView webView, String str, String str2) {
        m4066a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m4063a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m4066a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m4064a(WebView webView, String str, JSONObject jSONObject) {
        m4066a(webView, C3034d9.a.f7919f, jSONObject, str);
    }

    /* renamed from: a */
    public void m4065a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m4066a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4066a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C2508d.m4151a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m4069a(sb, objArr);
        sb.append(")}");
        m4067a(webView, sb);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4067a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m4074c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* renamed from: a */
    public void m4068a(WebView webView, @NonNull JSONObject jSONObject) {
        m4066a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4069a(StringBuilder sb, Object[] objArr) {
        String string;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                string = "null";
            } else {
                if (obj instanceof String) {
                    string = obj.toString();
                    if (!string.startsWith("{")) {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append(string);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }
}

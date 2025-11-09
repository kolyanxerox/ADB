package com.iab.omid.library.unity3d.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.adsession.ErrorType;
import com.iab.omid.library.unity3d.utils.C2606d;
import com.ironsource.C3034d9;
import com.ironsource.C3912zo;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.internal.g */
/* loaded from: classes2.dex */
public class C2594g {

    /* renamed from: a */
    private static C2594g f3764a = new C2594g();

    /* renamed from: com.iab.omid.library.unity3d.internal.g$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f3765a;

        /* renamed from: b */
        final /* synthetic */ String f3766b;

        public a(WebView webView, String str) {
            this.f3765a = webView;
            this.f3766b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2594g.this.m4576c(this.f3765a, this.f3766b);
        }
    }

    private C2594g() {
    }

    /* renamed from: a */
    public static final C2594g m4560a() {
        return f3764a;
    }

    /* renamed from: b */
    public void m4572b(WebView webView, String str) {
        m4568a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m4575c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m4576c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m4561a(WebView webView, String str) {
        m4568a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m4573b(WebView webView, String str, String str2) {
        m4568a(webView, "setState", str2, str);
    }

    /* renamed from: c */
    public boolean m4576c(WebView webView, String str) {
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
    public void m4562a(WebView webView, String str, float f) {
        m4568a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m4574b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m4568a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m4563a(WebView webView, String str, ErrorType errorType, String str2) {
        m4568a(webView, C3912zo.a.f13038g, errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m4564a(WebView webView, String str, String str2) {
        m4568a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: a */
    public void m4565a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m4568a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m4566a(WebView webView, String str, JSONObject jSONObject) {
        m4568a(webView, C3034d9.a.f7919f, jSONObject, str);
    }

    /* renamed from: a */
    public void m4567a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m4568a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4568a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C2606d.m4644a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m4571a(sb, objArr);
        sb.append(")}");
        m4569a(webView, sb);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4569a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m4576c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* renamed from: a */
    public void m4570a(WebView webView, @NonNull JSONObject jSONObject) {
        m4568a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4571a(StringBuilder sb, Object[] objArr) {
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

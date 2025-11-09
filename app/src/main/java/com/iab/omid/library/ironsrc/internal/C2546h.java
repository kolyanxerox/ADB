package com.iab.omid.library.ironsrc.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.utils.C2559d;
import com.ironsource.C3034d9;
import com.ironsource.C3912zo;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.internal.h */
/* loaded from: classes2.dex */
public class C2546h {

    /* renamed from: a */
    private static C2546h f3630a = new C2546h();

    /* renamed from: com.iab.omid.library.ironsrc.internal.h$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f3631a;

        /* renamed from: b */
        final /* synthetic */ String f3632b;

        public a(WebView webView, String str) {
            this.f3631a = webView;
            this.f3632b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2546h.this.m4327c(this.f3631a, this.f3632b);
        }
    }

    private C2546h() {
    }

    /* renamed from: a */
    public static final C2546h m4311a() {
        return f3630a;
    }

    /* renamed from: b */
    public void m4323b(WebView webView, String str) {
        m4319a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m4326c(WebView webView, String str, String str2) {
        m4319a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m4328d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m4327c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m4312a(WebView webView, String str) {
        m4319a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m4324b(WebView webView, String str, String str2) {
        m4319a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m4327c(WebView webView, String str) {
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
    public void m4313a(WebView webView, String str, float f) {
        m4319a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m4325b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m4319a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m4314a(WebView webView, String str, ErrorType errorType, String str2) {
        m4319a(webView, C3912zo.a.f13038g, errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m4315a(WebView webView, String str, String str2) {
        m4319a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m4316a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m4319a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m4317a(WebView webView, String str, JSONObject jSONObject) {
        m4319a(webView, C3034d9.a.f7919f, jSONObject, str);
    }

    /* renamed from: a */
    public void m4318a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m4319a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4319a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C2559d.m4404a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m4322a(sb, objArr);
        sb.append(")}");
        m4320a(webView, sb);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4320a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m4327c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* renamed from: a */
    public void m4321a(WebView webView, @NonNull JSONObject jSONObject) {
        m4319a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m4322a(StringBuilder sb, Object[] objArr) {
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

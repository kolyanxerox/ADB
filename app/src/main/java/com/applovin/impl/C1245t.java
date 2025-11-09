package com.applovin.impl;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import java.util.Map;

/* renamed from: com.applovin.impl.t */
/* loaded from: classes.dex */
public class C1245t extends WebChromeClient {

    /* renamed from: a */
    private final C1220k f2364a;

    /* renamed from: b */
    private final C1240o f2365b;

    /* renamed from: c */
    private final C0962a f2366c;

    public C1245t(C0962a c0962a, C1220k c1220k) {
        this.f2364a = c1220k;
        this.f2365b = c1220k.m2847O();
        this.f2366c = c0962a;
    }

    /* renamed from: a */
    private void m3265a(String str, ConsoleMessage consoleMessage) {
        AbstractC1207b abstractC1207bM226g = this.f2366c.m226g();
        if (abstractC1207bM226g != null) {
            String str2 = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            String strConcat = str == null ? "AdWebView" : "AdWebView:".concat(str);
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207bM226g);
            mapM675a.putAll(AbstractC1013e2.m676a(abstractC1207bM226g));
            mapM675a.put("source", strConcat);
            mapM675a.put("top_main_method", str2);
            mapM675a.put("error_message", consoleMessage.message());
            this.f2364a.m2832E().m576d(C0993c2.f488L0, mapM675a);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (C1240o.m3200a()) {
            this.f2365b.m3211a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        String strMessage = consoleMessage.message();
        if (strMessage.contains("al_onPoststitialShow")) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
            m3265a("onPoststitialShowEvaluationError", consoleMessage);
        } else if (strMessage.contains("SyntaxError")) {
            m3265a(null, consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C1240o.m3200a()) {
            return true;
        }
        this.f2365b.m3218k("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C1240o.m3200a()) {
            return true;
        }
        this.f2365b.m3218k("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C1240o.m3200a()) {
            return true;
        }
        this.f2365b.m3218k("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        C0962a c0962a;
        if (i != 100 || (c0962a = this.f2366c) == null) {
            return;
        }
        c0962a.m222c(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (C1240o.m3200a()) {
            this.f2365b.m3218k("AdWebView", "console.log[" + i + "] :" + str);
        }
    }
}

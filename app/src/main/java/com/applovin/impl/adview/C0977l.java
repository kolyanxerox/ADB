package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC1061j0;
import com.applovin.impl.C1069j8;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;

/* renamed from: com.applovin.impl.adview.l */
/* loaded from: classes.dex */
public class C0977l extends AbstractC1061j0 {

    /* renamed from: c */
    private final String f323c;

    public C0977l(String str, AbstractC1207b abstractC1207b, C1069j8 c1069j8, Context context) {
        super(context);
        this.f323c = str;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (abstractC1207b.m2560U0()) {
            applySettings(abstractC1207b);
        } else {
            settings.setAllowFileAccess(true);
            if (abstractC1207b.m2552P0()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(c1069j8);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    /* renamed from: a */
    public void m297a(String str) {
        loadDataWithBaseURL(this.f323c, str, "text/html", null, "");
    }
}

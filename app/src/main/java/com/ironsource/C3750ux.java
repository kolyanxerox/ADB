package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.ux */
/* loaded from: classes2.dex */
public class C3750ux {

    /* renamed from: a */
    private static String f12281a = "ux";

    /* renamed from: a */
    public static FrameLayout m12725a(Context context, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(view);
        frameLayout.addView(frameLayout2, layoutParams);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m12728b(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    /* renamed from: a */
    private static void m12726a(WebSettings webSettings) {
        webSettings.setDisplayZoomControls(false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public static void m12727a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        try {
            m12726a(settings);
            m12728b(settings);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            Logger.m12264e(f12281a, "setWebSettings - " + th.toString());
        }
    }
}

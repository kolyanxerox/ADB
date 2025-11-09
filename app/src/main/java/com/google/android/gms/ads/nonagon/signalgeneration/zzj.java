package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.UiThread;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1453cc;
import com.google.android.gms.internal.ads.cq0;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzj extends AbstractC1453cc {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final WebView f16603OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final zzf f16604OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final cq0 f16605OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public WebViewClient f16606OooO0Oo;

    public zzj(WebView webView, zzf zzfVar, @UiThread cq0 cq0Var) {
        this.f16603OooO00o = webView;
        this.f16604OooO0O0 = zzfVar;
        this.f16605OooO0OO = cq0Var;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1453cc
    public final WebViewClient OooO00o() {
        return this.f16606OooO0Oo;
    }

    public final /* synthetic */ void OooO0O0() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        WebViewClient webViewClient;
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            int i = Build.VERSION.SDK_INT;
            WebView webView = this.f16603OooO00o;
            if (i < 26) {
                if (WebViewFeature.isFeatureSupported(WebViewFeature.GET_WEB_VIEW_CLIENT)) {
                    try {
                        webViewClient = WebViewCompat.getWebViewClient(webView);
                    } catch (RuntimeException e) {
                        com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdUtil.getWebViewClient", e);
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            webViewClient = webView.getWebViewClient();
            if (webViewClient == this) {
                return;
            }
            if (webViewClient != null) {
                this.f16606OooO0Oo = webViewClient;
            }
            webView.setWebViewClient(this);
            OooO0OO();
        } catch (IllegalStateException unused) {
        }
    }

    public final void OooO0OO() {
        this.f16603OooO00o.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoO0), this.f16604OooO0O0.zza()), null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1453cc, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        OooO0OO();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1453cc, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        OooO0OO();
        super.onPageStarted(webView, str, bitmap);
    }

    public final void zzb() {
        this.f16605OooO0OO.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                this.zza.OooO0O0();
            }
        });
    }
}

package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.C1129h;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.sdk.AppLovinAd;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15595OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15596OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15597OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f15598OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15599OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Object f15600OooOoOO;

    public /* synthetic */ OooOo00(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f15596OooOo0O = i;
        this.f15597OooOo0o = obj;
        this.f15595OooOo = obj2;
        this.f15599OooOoO0 = obj3;
        this.f15598OooOoO = obj4;
        this.f15600OooOoOO = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15596OooOo0O) {
            case 0:
                ((C1002d1) this.f15597OooOo0o).m530a((View) this.f15595OooOo, (FrameLayout) this.f15599OooOoO0, (ViewTreeObserver) this.f15598OooOoO, (OooOOOO) this.f15600OooOoOO);
                break;
            case 1:
                ((C1093m2) this.f15597OooOo0o).m1448a((Lifecycle) this.f15595OooOo, (AppLovinAd) this.f15599OooOoO0, (ViewGroup) this.f15598OooOoO, (Activity) this.f15600OooOoOO);
                break;
            case 2:
                ((MediationServiceImpl) this.f15597OooOo0o).m1540a((C1302z2) this.f15595OooOo, (C1129h) this.f15599OooOoO0, (Activity) this.f15598OooOoO, (AbstractC1118a.a) this.f15600OooOoOO);
                break;
            case 3:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f15597OooOo0o).lambda$onReceivedHttpAuthRequest$17((WebView) this.f15595OooOo, (HttpAuthHandler) this.f15599OooOoO0, (String) this.f15598OooOoO, (String) this.f15600OooOoOO);
                break;
            case 4:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f15597OooOo0o).lambda$onReceivedLoginRequest$27((WebView) this.f15595OooOo, (String) this.f15599OooOoO0, (String) this.f15598OooOoO, (String) this.f15600OooOoOO);
                break;
            case 5:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f15597OooOo0o).lambda$onReceivedLoginRequest$27((WebView) this.f15595OooOo, (String) this.f15599OooOoO0, (String) this.f15598OooOoO, (String) this.f15600OooOoOO);
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f15597OooOo0o).lambda$onReceivedHttpAuthRequest$17((WebView) this.f15595OooOo, (HttpAuthHandler) this.f15599OooOoO0, (String) this.f15598OooOoO, (String) this.f15600OooOoOO);
                break;
        }
    }
}

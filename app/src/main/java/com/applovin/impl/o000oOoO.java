package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C1240o;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15769OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15770OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f15771OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f15772OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15773OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Object f15774OooOoOO;

    public /* synthetic */ o000oOoO(WebViewClient webViewClient, WebView webView, int i, String str, String str2, int i2) {
        this.f15770OooOo0O = i2;
        this.f15769OooOo = webViewClient;
        this.f15773OooOoO0 = webView;
        this.f15771OooOo0o = i;
        this.f15772OooOoO = str;
        this.f15774OooOoOO = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15770OooOo0O) {
            case 0:
                ((C1021f0) this.f15769OooOo).m709a((SensorEventListener) this.f15773OooOoO0, (Sensor) this.f15772OooOoO, this.f15771OooOo0o, (C1240o) this.f15774OooOoOO);
                break;
            case 1:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f15769OooOo).lambda$onReceivedError$9((WebView) this.f15773OooOoO0, this.f15771OooOo0o, (String) this.f15772OooOoO, (String) this.f15774OooOoOO);
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f15769OooOo).lambda$onReceivedError$9((WebView) this.f15773OooOoO0, this.f15771OooOo0o, (String) this.f15772OooOoO, (String) this.f15774OooOoOO);
                break;
        }
    }

    public /* synthetic */ o000oOoO(C1021f0 c1021f0, SensorEventListener sensorEventListener, Sensor sensor, int i, C1240o c1240o) {
        this.f15770OooOo0O = 0;
        this.f15769OooOo = c1021f0;
        this.f15773OooOoO0 = sensorEventListener;
        this.f15772OooOoO = sensor;
        this.f15771OooOo0o = i;
        this.f15774OooOoOO = c1240o;
    }
}

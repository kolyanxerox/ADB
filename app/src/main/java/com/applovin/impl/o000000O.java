package com.applovin.impl;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class o000000O implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f15704OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15705OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebView f15706OooOo0o;

    public /* synthetic */ o000000O(WebView webView, String str, int i) {
        this.f15705OooOo0O = i;
        this.f15706OooOo0o = webView;
        this.f15704OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15705OooOo0O) {
            case 0:
                this.f15706OooOo0o.evaluateJavascript(this.f15704OooOo, null);
                break;
            default:
                this.f15706OooOo0o.loadUrl(this.f15704OooOo);
                break;
        }
    }
}

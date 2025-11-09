package com.applovin.impl;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class o0Oo0oo implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15794OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebView f15795OooOo0o;

    public /* synthetic */ o0Oo0oo(WebView webView, int i) {
        this.f15794OooOo0O = i;
        this.f15795OooOo0o = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15794OooOo0O) {
            case 0:
                this.f15795OooOo0o.destroy();
                break;
            default:
                AbstractC1089l8.m1418a(this.f15795OooOo0o);
                break;
        }
    }
}

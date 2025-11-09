package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.controller.r */
/* loaded from: classes2.dex */
class C3653r {

    /* renamed from: a */
    private C3654s f11650a;

    /* renamed from: b */
    private boolean f11651b = false;

    public C3653r(C3654s c3654s) {
        this.f11650a = c3654s;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f11651b) {
            return "";
        }
        this.f11651b = true;
        return this.f11650a.m12068b();
    }
}

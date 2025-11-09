package com.ironsource;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.fh */
/* loaded from: classes2.dex */
public class C3117fh {

    /* renamed from: a */
    private C3222ih f8580a;

    public C3117fh(C3222ih c3222ih) {
        this.f8580a = c3222ih;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f8580a.handleMessageFromAd(str);
    }
}

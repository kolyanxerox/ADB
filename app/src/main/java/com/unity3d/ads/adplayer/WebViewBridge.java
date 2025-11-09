package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import o00O0O0O.OooO0OO;
import o00O0ooo.o0OOO0OO;

/* loaded from: classes2.dex */
public interface WebViewBridge {
    o0OOO0OO getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, OooO0OO oooO0OO);

    Object sendEvent(WebViewEvent webViewEvent, OooO0OO oooO0OO);
}

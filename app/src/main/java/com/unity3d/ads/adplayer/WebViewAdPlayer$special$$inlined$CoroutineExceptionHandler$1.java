package com.unity3d.ads.adplayer;

import com.unity3d.services.core.device.Storage;
import o00O0O0O.OooOOO0;
import o00O0oOo.o0000O0;
import o00O0oOo.o0000oo;

/* loaded from: classes2.dex */
public final class WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 extends o00O0O0O.OooO00o implements o0000O0 {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(o0000oo o0000ooVar, WebViewAdPlayer webViewAdPlayer) {
        super(o0000ooVar);
        this.this$0 = webViewAdPlayer;
    }

    @Override // o00O0oOo.o0000O0
    public void handleException(OooOOO0 oooOOO0, Throwable th) {
        Storage.Companion.removeStorageEventCallback(this.this$0.storageEventCallback);
    }
}

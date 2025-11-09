package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0oOo.o0000O00;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;

/* loaded from: classes3.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final o0000O00 dispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(o0000O00 dispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        OooOo.OooO0o0(dispatcher, "dispatcher");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(AndroidWebViewContainer webViewContainer, o000OO adPlayerScope) {
        OooOo.OooO0o0(webViewContainer, "webViewContainer");
        OooOo.OooO0o0(adPlayerScope, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope, this.sendDiagnosticEvent);
    }

    public CommonGetWebViewBridgeUseCase(o0000O00 o0000o00, SendDiagnosticEvent sendDiagnosticEvent, int i, OooOO0O oooOO0O) {
        this((i & 1) != 0 ? o000O0O0.f31514OooO00o : o0000o00, sendDiagnosticEvent);
    }
}

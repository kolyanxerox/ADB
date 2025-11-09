package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.OooO0OO;
import com.unity3d.scar.adapter.common.OooOOO0;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* loaded from: classes3.dex */
public class WebViewErrorHandler implements OooO0OO {
    private final IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.OooO0OO
    public void handleError(OooOOO0 oooOOO0) {
        this._eventSender.sendEvent(WebViewEventCategory.valueOf(oooOOO0.getDomain()), oooOOO0.getErrorCategory(), oooOOO0.getErrorArguments());
    }
}

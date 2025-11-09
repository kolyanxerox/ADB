package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String reason) {
        OooOo.OooO0o0(webSocket, "webSocket");
        OooOo.OooO0o0(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String reason) {
        OooOo.OooO0o0(webSocket, "webSocket");
        OooOo.OooO0o0(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        OooOo.OooO0o0(webSocket, "webSocket");
        OooOo.OooO0o0(t, "t");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        OooOo.OooO0o0(webSocket, "webSocket");
        OooOo.OooO0o0(bytes, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        OooOo.OooO0o0(webSocket, "webSocket");
        OooOo.OooO0o0(response, "response");
    }

    public void onMessage(WebSocket webSocket, String text) {
        OooOo.OooO0o0(webSocket, "webSocket");
        OooOo.OooO0o0(text, "text");
    }
}

package com.unity3d.services.core.webview.bridge;

/* loaded from: classes3.dex */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(Enum<?> r1, Enum<?> r2, Object... objArr);
}

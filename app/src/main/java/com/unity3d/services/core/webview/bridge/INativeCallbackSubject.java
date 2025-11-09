package com.unity3d.services.core.webview.bridge;

/* loaded from: classes3.dex */
public interface INativeCallbackSubject {
    NativeCallback getCallback(String str);

    void remove(NativeCallback nativeCallback);
}

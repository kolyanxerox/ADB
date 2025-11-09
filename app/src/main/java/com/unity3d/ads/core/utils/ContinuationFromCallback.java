package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final OooO0OO continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(OooO0OO continuation) {
        super("", 0);
        OooOo.OooO0o0(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r5, Object... params) {
        OooOo.OooO0o0(params, "params");
        this.continuation.resumeWith(o000OOo.OooO0O0(new ExposureException("Invocation failed with: " + r5, params)));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... params) {
        OooOo.OooO0o0(params, "params");
        this.continuation.resumeWith(params);
    }
}

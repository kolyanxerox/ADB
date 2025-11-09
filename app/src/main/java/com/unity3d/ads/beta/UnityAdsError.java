package com.unity3d.ads.beta;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class UnityAdsError {
    private final int code;
    private final String message;

    public UnityAdsError(int i, String message) {
        OooOo.OooO0o0(message, "message");
        this.code = i;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}

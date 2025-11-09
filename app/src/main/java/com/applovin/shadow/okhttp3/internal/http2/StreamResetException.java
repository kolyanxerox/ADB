package com.applovin.shadow.okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        OooOo.OooO0o0(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}

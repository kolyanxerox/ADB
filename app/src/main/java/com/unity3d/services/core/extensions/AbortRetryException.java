package com.unity3d.services.core.extensions;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class AbortRetryException extends Exception {
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortRetryException(String reason) {
        super(reason);
        OooOo.OooO0o0(reason, "reason");
        this.reason = reason;
    }
}

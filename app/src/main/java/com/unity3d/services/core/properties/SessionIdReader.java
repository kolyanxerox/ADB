package com.unity3d.services.core.properties;

import java.util.UUID;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class SessionIdReader {
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    private static final String sessionId;

    static {
        String string = UUID.randomUUID().toString();
        OooOo.OooO0Oo(string, "randomUUID().toString()");
        sessionId = string;
    }

    private SessionIdReader() {
    }

    public final String getSessionId() {
        return sessionId;
    }
}

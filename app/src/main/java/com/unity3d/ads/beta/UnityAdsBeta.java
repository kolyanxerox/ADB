package com.unity3d.ads.beta;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class UnityAdsBeta {
    public static final void getToken(TokenConfiguration configuration, TokenListener listener) {
        OooOo.OooO0o0(configuration, "configuration");
        OooOo.OooO0o0(listener, "listener");
    }

    public static final String getVersion() {
        return "";
    }

    public static final void initialize(InitializationConfiguration configuration, InitializationListener listener) {
        OooOo.OooO0o0(configuration, "configuration");
        OooOo.OooO0o0(listener, "listener");
    }

    public static final boolean isInitialize() {
        return true;
    }
}

package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.jvm.internal.OooOo;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        OooOo.OooO0o0(context, "context");
        return new CronetEngine.Builder(context);
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes3.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$15 extends Oooo000 implements OooO0O0 {
    public static final HandleInvocationsFromAdViewer$invoke$definition$15 INSTANCE = new HandleInvocationsFromAdViewer$invoke$definition$15();

    public HandleInvocationsFromAdViewer$invoke$definition$15() {
        super(0);
    }

    @Override // o00O0Oo.OooO0O0
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.getStorage();
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes3.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$51 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ AdObject $adObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$51(AdObject adObject) {
        super(0);
        this.$adObject = adObject;
    }

    @Override // o00O0Oo.OooO0O0
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.setOpportunityTTL(this.$adObject);
    }
}

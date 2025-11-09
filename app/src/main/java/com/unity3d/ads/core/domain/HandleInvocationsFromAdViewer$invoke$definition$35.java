package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.p010om.OmImpressionOccurred;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0OO00O;
import o00O0Oo.OooO0O0;

/* loaded from: classes3.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$35 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$35(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
        this.$adObject = adObject;
    }

    @Override // o00O0Oo.OooO0O0
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) this.this$0.getServiceProvider().getRegistry().getService("", o0OO00O.OooO00o(OmImpressionOccurred.class)), this.$adObject);
    }
}

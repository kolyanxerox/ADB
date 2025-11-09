package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0OO00O;
import o00O0Oo.OooO0O0;

/* loaded from: classes3.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$23 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$23(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
    }

    @Override // o00O0Oo.OooO0O0
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", o0OO00O.OooO00o(SessionRepository.class)));
    }
}

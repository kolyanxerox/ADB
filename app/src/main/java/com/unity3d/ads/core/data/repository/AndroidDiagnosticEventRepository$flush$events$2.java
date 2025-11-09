package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes3.dex */
public final class AndroidDiagnosticEventRepository$flush$events$2 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$events$2(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // o00O0Oo.Oooo000
    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        return diagnosticEvent == null ? this.this$0.getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null, null) : diagnosticEvent;
    }
}

package com.unity3d.ads.core.domain.events;

import gatewayprotocol.p014v1.DiagnosticEventRequestKt;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class GetDiagnosticEventBatchRequest {
    public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest invoke(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> diagnosticEvents) {
        OooOo.OooO0o0(diagnosticEvents, "diagnosticEvents");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        DiagnosticEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllBatch(dsl_create.getBatch(), diagnosticEvents);
        return dsl_create._build();
    }
}

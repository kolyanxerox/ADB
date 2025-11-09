package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.o0O0O00;

/* loaded from: classes3.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest) {
        OooOo.OooO0o0(diagnosticEventRepository, "diagnosticEventRepository");
        OooOo.OooO0o0(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(String event, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num) {
        OooOo.OooO0o0(event, "event");
        Boolean boolValueOf = adObject != null ? Boolean.valueOf(adObject.isHeaderBidding()) : null;
        ByteString opportunityId = adObject != null ? adObject.getOpportunityId() : null;
        String placementId = adObject != null ? adObject.getPlacementId() : null;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = adObject != null ? adObject.getAdType() : null;
        LinkedHashMap linkedHashMapOooOoO0 = map != null ? o0O0O00.OooOoO0(map) : new LinkedHashMap();
        if (adObject != null && adObject.isScarAd()) {
            linkedHashMapOooOoO0.put("scar", C3401a.f9920g);
        }
        if (adObject != null && adObject.isOfferwallAd()) {
            linkedHashMapOooOoO0.put("offerwall", C3401a.f9920g);
        }
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(event, linkedHashMapOooOoO0, map2, d, boolValueOf, opportunityId, placementId, adType, num));
    }
}

package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.p014v1.DiagnosticEventKt;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;

/* loaded from: classes3.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final o0OO uniqueId;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        OooOo.OooO0o0(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = o0o0000.OooO0OO(-1);
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(String eventName, Map<String, String> map, Map<String, Integer> map2, Double d, Boolean bool, ByteString byteString, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, Integer num) {
        oO00000o oo00000o;
        Object value;
        Integer numValueOf;
        OooOo.OooO0o0(eventName, "eventName");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        o0OO o0oo = this.uniqueId;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            numValueOf = Integer.valueOf(((Number) value).intValue() + 1);
        } while (!oo00000o.OooO0oO(value, numValueOf));
        dsl_create.setEventId(numValueOf.intValue());
        dsl_create.setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        dsl_create.setTimestamps(this.getSharedDataTimestamps.invoke());
        dsl_create.setCustomEventType(eventName);
        if (map != null) {
            dsl_create.putAllStringTags(dsl_create.getStringTagsMap(), map);
        }
        if (map2 != null) {
            dsl_create.putAllIntTags(dsl_create.getIntTagsMap(), map2);
        }
        if (d != null) {
            dsl_create.setTimeValue(d.doubleValue());
        }
        if (bool != null) {
            dsl_create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            dsl_create.setImpressionOpportunityId(byteString);
        }
        if (str != null) {
            dsl_create.setPlacementId(str);
        }
        if (diagnosticAdType != null) {
            dsl_create.setAdType(diagnosticAdType);
        }
        if (num != null) {
            dsl_create.setHeaderBiddingTokenNumber(num.intValue());
        }
        return dsl_create._build();
    }
}

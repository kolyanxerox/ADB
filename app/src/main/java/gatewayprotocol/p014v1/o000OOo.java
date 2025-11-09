package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o000OOo implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(((Integer) obj).intValue());
        return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
    }
}

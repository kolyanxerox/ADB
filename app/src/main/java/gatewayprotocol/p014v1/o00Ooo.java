package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o00Ooo implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(((Integer) obj).intValue());
        return diagnosticTagTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticTagType.UNRECOGNIZED : diagnosticTagTypeForNumber;
    }
}

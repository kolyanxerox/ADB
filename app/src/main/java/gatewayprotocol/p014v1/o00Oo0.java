package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o00Oo0 implements Internal.EnumVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o00Oo0 f28679OooO00o = new o00Oo0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(i) != null;
    }
}

package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o00oO0o implements Internal.EnumVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o00oO0o f28680OooO00o = new o00oO0o();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(i) != null;
    }
}

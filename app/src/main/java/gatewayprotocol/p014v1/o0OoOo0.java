package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class o0OoOo0 implements Internal.EnumVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o0OoOo0 f28684OooO00o = new o0OoOo0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(i) != null;
    }
}

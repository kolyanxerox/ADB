package gatewayprotocol.p014v1;

import com.google.protobuf.Internal;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;

/* loaded from: classes3.dex */
public final class OooOo implements Internal.EnumVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOo f28671OooO00o = new OooOo();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DiagnosticEventRequestOuterClass.DiagnosticAdType.forNumber(i) != null;
    }
}
